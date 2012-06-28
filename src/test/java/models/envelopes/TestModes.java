package test.java.models.envelopes;

import static org.junit.Assert.assertEquals;
import main.java.models.envelopes.Modes;

import org.junit.Test;

public class TestModes {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Modes.ADSR.ordinal());
                assertEquals(1, Modes.ADS1DS2R.ordinal());
                assertEquals(2, Modes.ONE_SHOT.ordinal());
                assertEquals(3, Modes.LOOP_S1S2.ordinal());
                assertEquals(4, Modes.LOOP_ALL.ordinal());
        }
}
