package test.java.futureoperations.waldorfblofeldpatcheditor.models.oscillators;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.UnisonoModes;

import org.junit.Test;

public class TestUnisonoModes {
        @Test
        public final void testOrdinal() {
                assertEquals(0, UnisonoModes.OFF.ordinal());
                assertEquals(1, UnisonoModes.DUAL.ordinal());
                assertEquals(2, UnisonoModes._3.ordinal());
                assertEquals(3, UnisonoModes._4.ordinal());
                assertEquals(4, UnisonoModes._5.ordinal());
                assertEquals(5, UnisonoModes._6.ordinal());
        }
}
