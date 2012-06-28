package test.java.models.arpeggiator.patterns;

import static org.junit.Assert.assertEquals;
import main.java.models.arpeggiator.Modes;

import org.junit.Test;

public class TestModes {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Modes.OFF.ordinal());
                assertEquals(1, Modes.ON.ordinal());
                assertEquals(2, Modes.ONE_SHOT.ordinal());
                assertEquals(3, Modes.HOLD.ordinal());
        }
}
