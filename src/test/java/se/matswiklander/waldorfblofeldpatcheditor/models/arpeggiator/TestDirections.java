package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Directions;

import org.junit.Test;

public class TestDirections {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Directions.UP.ordinal());
                assertEquals(1, Directions.DOWN.ordinal());
                assertEquals(2, Directions.ALT_UP.ordinal());
                assertEquals(3, Directions.ALT_DOWN.ordinal());
        }
}
