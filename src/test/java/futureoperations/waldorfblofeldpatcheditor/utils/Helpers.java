package test.java.futureoperations.waldorfblofeldpatcheditor.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Helpers {
        public static final byte[] readBlofeldFactorySoundSetFromSystemResource()
                        throws IOException {
                InputStream blofeldFactorySoundSet = ClassLoader
                                .getSystemResourceAsStream("test/resources/blofeldFactorySoundSet.syx");
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();

                int nRead;
                byte[] data = new byte[16384];

                while ((nRead = blofeldFactorySoundSet.read(data, 0,
                                data.length)) != -1) {
                        buffer.write(data, 0, nRead);
                }
                buffer.flush();

                return buffer.toByteArray();
        }

        public static final byte[] readForumOneTwoThreeFromSystemResource()
                        throws IOException {
                InputStream blofeldFactorySoundSet = ClassLoader
                                .getSystemResourceAsStream("test/resources/forumOneTwoThree.syx");
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();

                int nRead;
                byte[] data = new byte[16384];

                while ((nRead = blofeldFactorySoundSet.read(data, 0,
                                data.length)) != -1) {
                        buffer.write(data, 0, nRead);
                }
                buffer.flush();

                return buffer.toByteArray();
        }
}
