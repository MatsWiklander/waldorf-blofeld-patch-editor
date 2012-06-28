package test.java.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import main.java.models.arpeggiator.Patterns;

import org.junit.Test;

public class TestPatterns {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Patterns.OFF.ordinal());
                assertEquals(1, Patterns.PATTERN1.ordinal());
                assertEquals(2, Patterns.PATTERN2.ordinal());
                assertEquals(3, Patterns.PATTERN3.ordinal());
                assertEquals(4, Patterns.PATTERN4.ordinal());
                assertEquals(5, Patterns.PATTERN5.ordinal());
                assertEquals(6, Patterns.PATTERN6.ordinal());
                assertEquals(7, Patterns.PATTERN7.ordinal());
                assertEquals(8, Patterns.PATTERN8.ordinal());
                assertEquals(9, Patterns.PATTERN9.ordinal());
                assertEquals(10, Patterns.PATTERN10.ordinal());
                assertEquals(11, Patterns.PATTERN11.ordinal());
                assertEquals(12, Patterns.PATTERN12.ordinal());
                assertEquals(13, Patterns.PATTERN13.ordinal());
                assertEquals(14, Patterns.PATTERN14.ordinal());
                assertEquals(15, Patterns.PATTERN15.ordinal());
        }
}
