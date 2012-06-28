package test.java.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Lengths;

import org.junit.Test;

public class TestLengths {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Lengths.LEGATO.ordinal());
                assertEquals(1, Lengths.MINUS3.ordinal());
                assertEquals(2, Lengths.MINUS2.ordinal());
                assertEquals(3, Lengths.MINUS1.ordinal());
                assertEquals(4, Lengths.ZERO.ordinal());
                assertEquals(5, Lengths.PLUS1.ordinal());
                assertEquals(6, Lengths.PLUS2.ordinal());
                assertEquals(7, Lengths.PLUS3.ordinal());
        }
}
