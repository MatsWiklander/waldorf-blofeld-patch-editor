package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Lfos {
        private final Lfo1 lfo1;
        private final Lfo2 lfo2;
        private final Lfo3 lfo3;

        public Lfos(final PatchData patchData) {
                lfo1 = new Lfo1(patchData);
                lfo2 = new Lfo2(patchData);
                lfo3 = new Lfo3(patchData);

                // Init patch
        }

        public final Lfo1 getLfo1() {
                return lfo1;
        }

        public final Lfo2 getLfo2() {
                return lfo2;
        }

        public final Lfo3 getLfo3() {
                return lfo3;
        }
}
