package test.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.ParallelSerial;

import org.junit.Test;

public class TestParallelSerial {
        @Test
        public final void testOrdinal() {
                assertEquals(0, ParallelSerial.PARALLEL.ordinal());
                assertEquals(1, ParallelSerial.SERIAL.ordinal());
        }
}
