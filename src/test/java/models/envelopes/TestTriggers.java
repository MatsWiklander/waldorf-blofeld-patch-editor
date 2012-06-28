package test.java.models.envelopes;

import static org.junit.Assert.assertEquals;
import main.java.models.envelopes.Triggers;

import org.junit.Test;

public class TestTriggers {

        @Test
        public final void testOrdinal() {
                assertEquals(0, Triggers.NORMAL.ordinal());
                assertEquals(1, Triggers.SINGLE.ordinal());
        }

}
