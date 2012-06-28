package main.java.models.envelopes;

import main.java.models.enums.ZeroToPlus127;
import main.java.models.patch.PatchData;

public class Envelope3 extends EnvelopeBase {
        public Envelope3(final PatchData patchData) {
                super(patchData, 220, 223, 224, 225, 226, 227, 228, 229);

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
