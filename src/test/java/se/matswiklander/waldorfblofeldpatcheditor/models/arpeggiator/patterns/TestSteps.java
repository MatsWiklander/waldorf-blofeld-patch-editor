package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.patterns;

import static org.junit.Assert.assertEquals;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Steps;

import org.junit.Test;

public class TestSteps {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Steps.NORMAL.ordinal());
                assertEquals(1, Steps.PAUSE.ordinal());
                assertEquals(2, Steps.PREVIOUS.ordinal());
                assertEquals(3, Steps.FIRST.ordinal());
                assertEquals(4, Steps.LAST.ordinal());
                assertEquals(5, Steps.FIRST_PLUS_LAST.ordinal());
                assertEquals(6, Steps.CHORD.ordinal());
                assertEquals(7, Steps.RANDOM.ordinal());
        }
}
