package test.java.futureoperations.waldorfblofeldpatcheditor.models.effects;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Effect1;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Effect2;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.EffectBase;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.EffectTypes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestEffect12 {
        private Effect1 effect1;
        private Effect2 effect2;
        private PatchData patchData;

        @Before
        public final void setup() {
                patchData = new PatchData();
                effect1 = new Effect1(patchData);
                effect2 = new Effect2(patchData);

                setupEffect(effect1);
                setupEffect(effect2);
        }

        private void setupEffect(final EffectBase effectBase) {
                effectBase.setType(EffectTypes.OVERDRIVE);
                effectBase.setMix(ZeroToPlus127.PLUS24);
                effectBase.setParameter1(ZeroToPlus127.PLUS8);
                effectBase.setParameter2(ZeroToPlus127.PLUS65);
                effectBase.setParameter3(ZeroToPlus127.PLUS80);
                effectBase.setParameter4(ZeroToPlus127.PLUS12);
                effectBase.setParameter5(ZeroToPlus127.PLUS37);
                effectBase.setParameter6(ZeroToPlus127.PLUS21);
                effectBase.setParameter7(ZeroToPlus127.PLUS32);
                effectBase.setParameter8(ZeroToPlus127.PLUS73);
                effectBase.setParameter9(ZeroToPlus127.PLUS94);
                effectBase.setParameter10(ZeroToPlus127.PLUS30);
                effectBase.setParameter11(ZeroToPlus127.PLUS31);
                effectBase.setParameter12(ZeroToPlus127.PLUS102);
                effectBase.setParameter13(ZeroToPlus127.PLUS45);
                effectBase.setParameter14(ZeroToPlus127.PLUS25);
        }

        @Test
        public final void testEffect1() {
                final int type = 128;
                final int mix = 129;
                final int parameter1 = 130;
                final int parameter2 = 131;
                final int parameter3 = 132;
                final int parameter4 = 133;
                final int parameter5 = 134;
                final int parameter6 = 135;
                final int parameter7 = 136;
                final int parameter8 = 137;
                final int parameter9 = 138;
                final int parameter10 = 139;
                final int parameter11 = 140;
                final int parameter12 = 141;
                final int parameter13 = 142;
                final int parameter14 = 143;

                testWriteInsideBoundsEffect(type, mix, parameter1, parameter2,
                                parameter3, parameter4, parameter5, parameter6,
                                parameter7, parameter8, parameter9,
                                parameter10, parameter11, parameter12,
                                parameter13, parameter14);

                testReadInsideBoundsEffect(effect1);
        }

        @Test
        public final void testEffect2() {
                final int type = 144;
                final int mix = 145;
                final int parameter1 = 146;
                final int parameter2 = 147;
                final int parameter3 = 148;
                final int parameter4 = 149;
                final int parameter5 = 150;
                final int parameter6 = 151;
                final int parameter7 = 152;
                final int parameter8 = 153;
                final int parameter9 = 154;
                final int parameter10 = 155;
                final int parameter11 = 156;
                final int parameter12 = 157;
                final int parameter13 = 158;
                final int parameter14 = 159;

                testWriteInsideBoundsEffect(type, mix, parameter1, parameter2,
                                parameter3, parameter4, parameter5, parameter6,
                                parameter7, parameter8, parameter9,
                                parameter10, parameter11, parameter12,
                                parameter13, parameter14);

                testReadInsideBoundsEffect(effect2);
        }

        private void testReadInsideBoundsEffect(final EffectBase effectBase) {
                assertEquals(EffectTypes.OVERDRIVE, effectBase.getType());
                assertEquals(ZeroToPlus127.PLUS24, effectBase.getMix());
                assertEquals(ZeroToPlus127.PLUS8, effectBase.getParameter1());
                assertEquals(ZeroToPlus127.PLUS65, effectBase.getParameter2());
                assertEquals(ZeroToPlus127.PLUS80, effectBase.getParameter3());
                assertEquals(ZeroToPlus127.PLUS12, effectBase.getParameter4());
                assertEquals(ZeroToPlus127.PLUS37, effectBase.getParameter5());
                assertEquals(ZeroToPlus127.PLUS21, effectBase.getParameter6());
                assertEquals(ZeroToPlus127.PLUS32, effectBase.getParameter7());
                assertEquals(ZeroToPlus127.PLUS73, effectBase.getParameter8());
                assertEquals(ZeroToPlus127.PLUS94, effectBase.getParameter9());
                assertEquals(ZeroToPlus127.PLUS30, effectBase.getParameter10());
                assertEquals(ZeroToPlus127.PLUS31, effectBase.getParameter11());
                assertEquals(ZeroToPlus127.PLUS102, effectBase.getParameter12());
                assertEquals(ZeroToPlus127.PLUS45, effectBase.getParameter13());
                assertEquals(ZeroToPlus127.PLUS25, effectBase.getParameter14());
        }

        private void testWriteInsideBoundsEffect(final int type, final int mix,
                        final int parameter1, final int parameter2,
                        final int parameter3, final int parameter4,
                        final int parameter5, final int parameter6,
                        final int parameter7, final int parameter8,
                        final int parameter9, final int parameter10,
                        final int parameter11, final int parameter12,
                        final int parameter13, final int parameter14) {
                assertEquals(EffectTypes.OVERDRIVE.value,
                                patchData.getPayload()[type]);
                assertEquals(ZeroToPlus127.PLUS24.value,
                                patchData.getPayload()[mix]);
                assertEquals(ZeroToPlus127.PLUS8.value,
                                patchData.getPayload()[parameter1]);
                assertEquals(ZeroToPlus127.PLUS65.value,
                                patchData.getPayload()[parameter2]);
                assertEquals(ZeroToPlus127.PLUS80.value,
                                patchData.getPayload()[parameter3]);
                assertEquals(ZeroToPlus127.PLUS12.value,
                                patchData.getPayload()[parameter4]);
                assertEquals(ZeroToPlus127.PLUS37.value,
                                patchData.getPayload()[parameter5]);
                assertEquals(ZeroToPlus127.PLUS21.value,
                                patchData.getPayload()[parameter6]);
                assertEquals(ZeroToPlus127.PLUS32.value,
                                patchData.getPayload()[parameter7]);
                assertEquals(ZeroToPlus127.PLUS73.value,
                                patchData.getPayload()[parameter8]);
                assertEquals(ZeroToPlus127.PLUS94.value,
                                patchData.getPayload()[parameter9]);
                assertEquals(ZeroToPlus127.PLUS30.value,
                                patchData.getPayload()[parameter10]);
                assertEquals(ZeroToPlus127.PLUS31.value,
                                patchData.getPayload()[parameter11]);
                assertEquals(ZeroToPlus127.PLUS102.value,
                                patchData.getPayload()[parameter12]);
                assertEquals(ZeroToPlus127.PLUS45.value,
                                patchData.getPayload()[parameter13]);
                assertEquals(ZeroToPlus127.PLUS25.value,
                                patchData.getPayload()[parameter14]);

        }
}
