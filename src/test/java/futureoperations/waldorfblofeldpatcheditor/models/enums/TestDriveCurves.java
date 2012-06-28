package test.java.futureoperations.waldorfblofeldpatcheditor.models.enums;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.DriveCurves;

import org.junit.Test;

public class TestDriveCurves {
        @Test
        public final void testOrdinal() {
                assertEquals(0, DriveCurves.CLIPPING.ordinal());
                assertEquals(1, DriveCurves.TUBE.ordinal());
                assertEquals(2, DriveCurves.HARD.ordinal());
                assertEquals(3, DriveCurves.MEDIUM.ordinal());
                assertEquals(4, DriveCurves.SOFT.ordinal());
                assertEquals(5, DriveCurves.PICKUP_1.ordinal());
                assertEquals(6, DriveCurves.PICKUP_2.ordinal());
                assertEquals(7, DriveCurves.RECTIFIER.ordinal());
                assertEquals(8, DriveCurves.SQUARE.ordinal());
                assertEquals(9, DriveCurves.BINARY.ordinal());
                assertEquals(10, DriveCurves.OVERFLOW.ordinal());
                assertEquals(11, DriveCurves.SINE_SHAPER.ordinal());
                assertEquals(12, DriveCurves.OSC_1_MOD.ordinal());
        }
}
