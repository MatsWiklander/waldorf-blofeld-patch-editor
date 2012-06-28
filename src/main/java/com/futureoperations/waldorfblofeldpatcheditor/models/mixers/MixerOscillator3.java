package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

public class MixerOscillator3 extends MixerBase {
        public MixerOscillator3(final PatchData patchData) {
                super(patchData, 65, 66);

                // Init patch
                setLevel(ZeroToPlus127.PLUS127);
                setBalance(F164ToF263.F1_64);
        }
}
