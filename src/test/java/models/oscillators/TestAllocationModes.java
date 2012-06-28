package test.java.models.oscillators;

import static org.junit.Assert.assertEquals;
import main.java.models.oscillators.AllocationModes;

import org.junit.Test;

public class TestAllocationModes {
        @Test
        public final void testOrdinal() {
                assertEquals(0, AllocationModes.POLY.ordinal());
                assertEquals(1, AllocationModes.MONO.ordinal());
        }

}
