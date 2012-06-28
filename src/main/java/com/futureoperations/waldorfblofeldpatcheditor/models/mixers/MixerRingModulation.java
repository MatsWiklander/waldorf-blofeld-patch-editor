package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

public class MixerRingModulation extends MixerBase {
        public MixerRingModulation(final PatchData patchData) {
                super(patchData, 71, 72);

                // Init patch
                setLevel(ZeroToPlus127.ZERO);
                setBalance(F164ToF263.F1_64);
        }
}
