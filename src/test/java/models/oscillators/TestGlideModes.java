package test.java.models.oscillators;

import static org.junit.Assert.assertEquals;
import main.java.models.oscillators.GlideModes;

import org.junit.Test;

public class TestGlideModes {

        @Test
        public final void testOrdinal() {
                assertEquals(0, GlideModes.PORTAMENTO.ordinal());
                assertEquals(1, GlideModes.FINGERED_P.ordinal());
                assertEquals(2, GlideModes.GLISSANDO.ordinal());
                assertEquals(3, GlideModes.FINGERED_G.ordinal());
        }

}
