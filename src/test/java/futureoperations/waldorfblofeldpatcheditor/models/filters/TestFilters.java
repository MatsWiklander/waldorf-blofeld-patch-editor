package test.java.futureoperations.waldorfblofeldpatcheditor.models.filters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Filters;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.ParallelSerial;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Test;

public class TestFilters {
        @Test
        public final void testFilters() {
                final int routing = 117;

                PatchData patchData = new PatchData();
                Filters filters = new Filters(patchData);

                assertNotNull(filters.getFilter1());
                assertNotNull(filters.getFilter2());

                filters.setRouting(ParallelSerial.SERIAL);

                assertEquals(ParallelSerial.SERIAL.value,
                                patchData.getPayload()[routing]);

                assertEquals(ParallelSerial.SERIAL, filters.getRouting());
        }
}
