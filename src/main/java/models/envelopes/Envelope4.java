package main.java.models.envelopes;

import main.java.models.enums.ZeroToPlus127;
import main.java.models.patch.PatchData;

public class Envelope4 extends EnvelopeBase {
        public Envelope4(final PatchData patchData) {
                super(patchData, 232, 235, 236, 237, 238, 239, 240, 241);

                // Init patch
                setMode(Modes.ADSR);
                setTrigger(Triggers.NORMAL);
                setAttack(ZeroToPlus127.ZERO);
                setAttackLevel(ZeroToPlus127.PLUS64);
                setDecay(ZeroToPlus127.PLUS64);
                setSustain(ZeroToPlus127.PLUS64);
                setDecay2(ZeroToPlus127.PLUS64);
                setSustain2(ZeroToPlus127.PLUS64);
                setRelease(ZeroToPlus127.PLUS64);
        }
}
