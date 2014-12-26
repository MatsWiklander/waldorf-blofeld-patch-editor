package main.java.se.matswiklander.waldorfblofeldpatcheditor.application;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class LicenseKeyManager {
        private final String firstName;
        private final String lastName;
        private final String email;
        private final String providedKey;
        private static final String[] BANNED_KEYS = { "Hf9jKmF08wo=" };

        private final String calculatedKey;

        public LicenseKeyManager(final String firstName, final String lastName,
                        final String email, final String providedKey)
                        throws UnsupportedEncodingException,
                        NoSuchAlgorithmException {
                this.firstName = firstName.trim();
                this.lastName = lastName.trim();
                this.email = email.trim();
                this.providedKey = providedKey.trim();

                this.calculatedKey = calculateKey();
        }

        private String calculateKey() throws UnsupportedEncodingException,
                        NoSuchAlgorithmException {
                String message = firstName + lastName + email;

                byte[] md2Digest = digest(message, "MD2");
                byte[] md5Digest = digest(message, "MD5");
                byte[] sha1Digest = digest(message, "SHA-1");

                byte[] wholeDigest = new byte[md2Digest.length
                                + md5Digest.length + sha1Digest.length];
                System.arraycopy(md2Digest, 0, wholeDigest, 0, md2Digest.length);
                System.arraycopy(md5Digest, 0, wholeDigest, md2Digest.length,
                                md5Digest.length);
                System.arraycopy(sha1Digest, 0, wholeDigest, md2Digest.length
                                + md5Digest.length, sha1Digest.length);

                byte[] internalKey = { 0, 0, 0, 0, 0, 0, 0, 0 };

                internalKey[0] = wholeDigest[5];
                internalKey[1] = wholeDigest[19];
                internalKey[2] = wholeDigest[1];
                internalKey[3] = wholeDigest[20];
                internalKey[4] = wholeDigest[11];
                internalKey[5] = wholeDigest[43];
                internalKey[6] = wholeDigest[31];
                internalKey[7] = wholeDigest[16];

                return DatatypeConverter.printBase64Binary(internalKey);
        }

        private byte[] digest(final String message, final String digest)
                        throws UnsupportedEncodingException,
                        NoSuchAlgorithmException {
                byte[] bytesOfMessage = {};

                bytesOfMessage = message.getBytes("UTF-8");

                MessageDigest messageDigest = null;

                messageDigest = MessageDigest.getInstance(digest);

                return messageDigest.digest(bytesOfMessage);
        }

        public final String getEmail() {
                return email;
        }

        public final String getFirstName() {
                return firstName;
        }

        public final String getLastName() {
                return lastName;
        }

        public final boolean isKeyBanned() {
                for (String bannedKey : BANNED_KEYS) {
                        if (providedKey.equals(bannedKey)) {
                                return true;
                        }
                }

                return false;
        }

        public final boolean isKeyValid() {
                if (providedKey.equals(calculatedKey)) {
                        return true;
                }

                return false;
        }
}
