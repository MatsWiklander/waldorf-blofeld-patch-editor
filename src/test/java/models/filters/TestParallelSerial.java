package test.java.models.filters;

import static org.junit.Assert.assertEquals;
import main.java.models.filters.ParallelSerial;

import org.junit.Test;

public class TestParallelSerial {
        @Test
        public final void testOrdinal() {
                assertEquals(0, ParallelSerial.PARALLEL.ordinal());
                assertEquals(1, ParallelSerial.SERIAL.ordinal());
        }
}
