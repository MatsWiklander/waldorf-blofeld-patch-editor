package main.java.models.mixers;

import main.java.models.enums.ZeroToPlus127;
import main.java.models.patch.PatchData;

public class MixerOscillator1 extends MixerBase {
        public MixerOscillator1(final PatchData patchData) {
                super(patchData, 61, 62);

                // Init patch
                setLevel(ZeroToPlus127.PLUS127);
                setBalance(F164ToF263.F1_64);
        }
}
