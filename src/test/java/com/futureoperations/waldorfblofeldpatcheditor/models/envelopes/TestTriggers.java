package test.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes.Triggers;

import org.junit.Test;

public class TestTriggers {

        @Test
        public final void testOrdinal() {
                assertEquals(0, Triggers.NORMAL.ordinal());
                assertEquals(1, Triggers.SINGLE.ordinal());
        }

}
