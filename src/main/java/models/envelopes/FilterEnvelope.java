package main.java.models.envelopes;

import main.java.models.enums.ZeroToPlus127;
import main.java.models.patch.PatchData;

public class FilterEnvelope extends EnvelopeBase {
        public FilterEnvelope(final PatchData patchData) {
                super(patchData, 196, 199, 200, 201, 202, 203, 204, 205);

                // Init patch
                setMode(Modes.ADSR);
                setTrigger(Triggers.NORMAL);
                setAttack(ZeroToPlus127.ZERO);
                setAttackLevel(ZeroToPlus127.PLUS127);
                setDecay(ZeroToPlus127.PLUS50);
                setSustain(ZeroToPlus127.ZERO);
                setDecay2(ZeroToPlus127.ZERO);
                setSustain2(ZeroToPlus127.PLUS127);
                setRelease(ZeroToPlus127.ZERO);
        }
}
