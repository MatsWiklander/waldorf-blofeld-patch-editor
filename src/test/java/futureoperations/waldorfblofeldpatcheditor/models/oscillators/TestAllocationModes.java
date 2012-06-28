package test.java.futureoperations.waldorfblofeldpatcheditor.models.oscillators;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.AllocationModes;

import org.junit.Test;

public class TestAllocationModes {
        @Test
        public final void testOrdinal() {
                assertEquals(0, AllocationModes.POLY.ordinal());
                assertEquals(1, AllocationModes.MONO.ordinal());
        }

}
