package test.java.models.effects;

import static org.junit.Assert.assertEquals;
import main.java.models.effects.Polarities;

import org.junit.Test;

public class TestPolarities {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Polarities.POSITIVE.ordinal());
                assertEquals(1, Polarities.NEGATIVE.ordinal());
        }
}
