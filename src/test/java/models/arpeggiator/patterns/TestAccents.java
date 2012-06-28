package test.java.models.arpeggiator.patterns;

import static org.junit.Assert.assertEquals;
import main.java.models.arpeggiator.patterns.Accents;

import org.junit.Test;

public class TestAccents {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Accents.SILENT.ordinal());
                assertEquals(1, Accents.MINUS96.ordinal());
                assertEquals(2, Accents.MINUS64.ordinal());
                assertEquals(3, Accents.MINUS32.ordinal());
                assertEquals(4, Accents.ZERO.ordinal());
                assertEquals(5, Accents.PLUS32.ordinal());
                assertEquals(6, Accents.PLUS64.ordinal());
                assertEquals(7, Accents.PLUS96.ordinal());
        }
}
