package test.java.se.matswiklander.waldorfblofeldpatcheditor.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.application.LicenseKeyManager;

import org.junit.Test;

public class TestLicenseKeyManager {

        @Test
        public final void testBannedKey() throws UnsupportedEncodingException,
                        NoSuchAlgorithmException {
                LicenseKeyManager licenseKeyManager = new LicenseKeyManager(
                                "3v1l", "h4x0r", "3v1l.h4x0r@example.com",
                                "Hf9jKmF08wo=");

                assertTrue(licenseKeyManager.isKeyValid());
                assertTrue(licenseKeyManager.isKeyBanned());
        }

        @Test
        public final void testBlankKey() throws UnsupportedEncodingException,
                        NoSuchAlgorithmException {
                LicenseKeyManager licenseKeyManager = new LicenseKeyManager(
                                "Mats", "Wiklander",
                                "mats.wiklander@futureoperations.com",
                                "dfRUFno93Jo=");

                assertTrue(licenseKeyManager.isKeyValid());
                assertFalse(licenseKeyManager.isKeyBanned());
        }

        @Test
        public final void testInvalidKey() throws UnsupportedEncodingException,
                        NoSuchAlgorithmException {
                LicenseKeyManager licenseKeyManager = new LicenseKeyManager(
                                "Mats", "Wiklander",
                                "mats.wiklander@futureoperations.com",
                                "dRUFno93Jo=");

                assertFalse(licenseKeyManager.isKeyValid());
                assertFalse(licenseKeyManager.isKeyBanned());
        }

        @Test
        public final void testSettersGetters()
                        throws UnsupportedEncodingException,
                        NoSuchAlgorithmException {
                LicenseKeyManager licenseKeyManager = new LicenseKeyManager(
                                "Mats", "Wiklander",
                                "mats.wiklander@futureoperations.com",
                                "dRUFno93Jo=");

                assertEquals("Mats", licenseKeyManager.getFirstName());
                assertEquals("Wiklander", licenseKeyManager.getLastName());
                assertEquals("mats.wiklander@futureoperations.com",
                                licenseKeyManager.getEmail());
        }

        @Test
        public final void testValidKey() throws UnsupportedEncodingException,
                        NoSuchAlgorithmException {
                LicenseKeyManager licenseKeyManager = new LicenseKeyManager(
                                "Mats", "Wiklander",
                                "mats.wiklander@futureoperations.com", "");

                assertFalse(licenseKeyManager.isKeyValid());
                assertFalse(licenseKeyManager.isKeyBanned());
        }
}
