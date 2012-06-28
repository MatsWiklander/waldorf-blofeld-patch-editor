package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Effect1 extends EffectBase {
        public Effect1(final PatchData patchData) {
                super(patchData, 128, 129, 130, 131, 132, 133, 134, 135, 136,
                                137, 138, 139, 140, 141, 142, 143);
                // Init patch
                setType(EffectTypes.CHORUS);
                setMix(ZeroToPlus127.ZERO);
                setParameter1(ZeroToPlus127.PLUS20);
                setParameter2(ZeroToPlus127.PLUS64);
                setParameter3(ZeroToPlus127.PLUS64);
                setParameter4(ZeroToPlus127.ZERO);
                setParameter5(ZeroToPlus127.PLUS127);
                setParameter6(ZeroToPlus127.PLUS127);
                setParameter7(ZeroToPlus127.PLUS127);
                setParameter8(ZeroToPlus127.PLUS127);
                setParameter9(ZeroToPlus127.PLUS127);
                setParameter10(ZeroToPlus127.PLUS127);
                setParameter11(ZeroToPlus127.PLUS127);
                setParameter12(ZeroToPlus127.PLUS127);
                setParameter13(ZeroToPlus127.PLUS127);
                setParameter14(ZeroToPlus127.PLUS127);
        }
}
