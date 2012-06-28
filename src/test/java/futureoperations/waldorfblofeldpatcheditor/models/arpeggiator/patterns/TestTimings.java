package test.java.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Timings;

import org.junit.Test;

public class TestTimings {

        @Test
        public final void testOrdinal() {
                assertEquals(0, Timings.RANDOM.ordinal());
                assertEquals(1, Timings.MINUS3.ordinal());
                assertEquals(2, Timings.MINUS2.ordinal());
                assertEquals(3, Timings.MINUS1.ordinal());
                assertEquals(4, Timings.ZERO.ordinal());
                assertEquals(5, Timings.PLUS1.ordinal());
                assertEquals(6, Timings.PLUS2.ordinal());
                assertEquals(7, Timings.PLUS3.ordinal());
        }

}
