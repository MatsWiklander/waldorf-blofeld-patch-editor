package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Effect2 extends EffectBase {
        public Effect2(final PatchData patchData) {
                super(patchData, 144, 145, 146, 147, 148, 149, 150, 151, 152,
                                153, 154, 155, 156, 157, 158, 159);

                // Init patch
                setType(EffectTypes.REVERB);
                setMix(ZeroToPlus127.ZERO);
                setParameter1(ZeroToPlus127.PLUS53);
                setParameter2(ZeroToPlus127.PLUS64);
                setParameter3(ZeroToPlus127.PLUS100);
                setParameter4(ZeroToPlus127.ZERO);
                setParameter5(ZeroToPlus127.PLUS64);
                setParameter6(ZeroToPlus127.PLUS100);
                setParameter7(ZeroToPlus127.ZERO);
                setParameter8(ZeroToPlus127.PLUS100);
                setParameter9(ZeroToPlus127.PLUS110);
                setParameter10(ZeroToPlus127.ZERO);
                setParameter11(ZeroToPlus127.PLUS15);
                setParameter12(ZeroToPlus127.PLUS64);
                setParameter13(ZeroToPlus127.PLUS127);
                setParameter14(ZeroToPlus127.PLUS127);

        }
}
