package main.java.models.lfos;

import main.java.models.patch.PatchData;

public class Lfo1 extends LfoBase {
        public Lfo1(final PatchData patchData) {
                super(patchData, 160, 161, 163, 164, 165, 166, 167, 170);

                // Init patch
                setSpeed(Clocks._40_BARS_1);
        }
}
