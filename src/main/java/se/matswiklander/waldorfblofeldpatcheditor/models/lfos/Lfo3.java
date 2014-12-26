package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.lfos;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Lfo3 extends LfoBase {
        public Lfo3(final PatchData patchData) {
                super(patchData, 184, 185, 187, 188, 189, 190, 191, 194);

                // Init patch
                setSpeed(Clocks._160_BARS_1);
        }
}
