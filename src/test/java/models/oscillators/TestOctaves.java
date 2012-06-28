package test.java.models.oscillators;

import static org.junit.Assert.assertEquals;
import main.java.models.oscillators.Octaves;

import org.junit.Test;

public class TestOctaves {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Octaves.FOOT128.ordinal());
                assertEquals(1, Octaves.FOOT64.ordinal());
                assertEquals(2, Octaves.FOOT32.ordinal());
                assertEquals(3, Octaves.FOOT16.ordinal());
                assertEquals(4, Octaves.FOOT8.ordinal());
                assertEquals(5, Octaves.FOOT4.ordinal());
                assertEquals(6, Octaves.FOOT2.ordinal());
                assertEquals(7, Octaves.FOOT1.ordinal());
                assertEquals(8, Octaves.HALFFOOT.ordinal());
        }

        @Test
        public final void testSnap() {
                Octaves octave = Octaves.FOOT128;

                // 128'
                for (int i = 0; i < 22; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.FOOT128, octave);
                }

                // 64'
                for (int i = 22; i < 34; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.FOOT64, octave);
                }

                // 32'
                for (int i = 34; i < 46; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.FOOT32, octave);
                }

                // 16'
                for (int i = 46; i < 58; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.FOOT16, octave);
                }

                // 8'
                for (int i = 58; i < 70; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.FOOT8, octave);
                }

                // 4'
                for (int i = 70; i < 82; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.FOOT4, octave);
                }

                // 2'
                for (int i = 82; i < 94; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.FOOT2, octave);
                }

                // 1'
                for (int i = 94; i < 106; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.FOOT1, octave);
                }

                // ½'
                for (int i = 106; i < 128; i++) {
                        octave = octave.convert(i);
                        assertEquals(Octaves.HALFFOOT, octave);
                }
        }
}
