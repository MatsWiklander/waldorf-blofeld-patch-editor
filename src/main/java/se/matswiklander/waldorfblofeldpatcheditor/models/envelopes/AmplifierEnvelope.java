package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

public class AmplifierEnvelope extends EnvelopeBase {
        public AmplifierEnvelope(final PatchData patchData) {
                super(patchData, 208, 211, 212, 213, 214, 215, 216, 217);

                // Init patch
                setMode(Modes.ADSR);
                setTrigger(Triggers.NORMAL);
                setAttack(ZeroToPlus127.ZERO);
                setAttackLevel(ZeroToPlus127.PLUS127);
                setDecay(ZeroToPlus127.PLUS52);
                setSustain(ZeroToPlus127.PLUS127);
                setDecay2(ZeroToPlus127.ZERO);
                setSustain2(ZeroToPlus127.PLUS127);
                setRelease(ZeroToPlus127.ZERO);
        }
}
