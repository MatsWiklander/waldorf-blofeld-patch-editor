package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.mixers;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

public class MixerRingModulation extends MixerBase {
        public MixerRingModulation(final PatchData patchData) {
                super(patchData, 71, 72);

                // Init patch
                setLevel(ZeroToPlus127.ZERO);
                setBalance(F164ToF263.F1_64);
        }
}
