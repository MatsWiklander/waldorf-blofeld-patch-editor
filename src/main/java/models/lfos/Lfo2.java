package main.java.models.lfos;

import main.java.models.patch.PatchData;

public class Lfo2 extends LfoBase {
        public Lfo2(final PatchData patchData) {
                super(patchData, 172, 173, 175, 176, 177, 178, 179, 182);

                // Init patch
                setSpeed(Clocks._80_BARS_1);
        }
}
