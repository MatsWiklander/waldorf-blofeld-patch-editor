package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Velocities;

import org.junit.Test;

public class TestVelocities {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Velocities.EACH_NOTE.ordinal());
                assertEquals(1, Velocities.FIRST_NOTE.ordinal());
                assertEquals(2, Velocities.LAST_NOTE.ordinal());
                assertEquals(3, Velocities.FIX_32.ordinal());
                assertEquals(4, Velocities.FIX_64.ordinal());
                assertEquals(5, Velocities.FIX_100.ordinal());
                assertEquals(6, Velocities.FIX_127.ordinal());
        }
}
