package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Filters {
        private final PatchData patchData;
        private final Filter1 filter1;
        private final Filter2 filter2;

        private final int routingIndex = 117;

        public Filters(final PatchData patchData) {
                this.patchData = patchData;

                filter1 = new Filter1(patchData);
                filter2 = new Filter2(patchData);

                // Init patch
                setRouting(ParallelSerial.PARALLEL);
        }

        public final Filter1 getFilter1() {
                return filter1;
        }

        public final Filter2 getFilter2() {
                return filter2;
        }

        public final ParallelSerial getRouting() {
                return EnumConverters.convertParallelSerial(patchData
                                .getValue(routingIndex));
        }

        public final void setRouting(final ParallelSerial routing) {
                patchData.setValue(routingIndex, routing.value);
        }
}
