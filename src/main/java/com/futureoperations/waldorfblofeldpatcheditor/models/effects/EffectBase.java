package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class EffectBase {
        private final int typeIndex;
        private final int mixIndex;
        private final int parameter1Index;
        private final int parameter2Index;
        private final int parameter3Index;
        private final int parameter4Index;
        private final int parameter5Index;
        private final int parameter6Index;
        private final int parameter7Index;
        private final int parameter8Index;
        private final int parameter9Index;
        private final int parameter10Index;
        private final int parameter11Index;
        private final int parameter12Index;
        private final int parameter13Index;
        private final int parameter14Index;

        private final PatchData patchData;

        protected EffectBase(final PatchData patchData, final int typeIndex,
                        final int mixIndex, final int parameter1Index,
                        final int parameter2Index, final int parameter3Index,
                        final int parameter4Index, final int parameter5Index,
                        final int parameter6Index, final int parameter7Index,
                        final int parameter8Index, final int parameter9Index,
                        final int parameter10Index, final int parameter11Index,
                        final int parameter12Index, final int parameter13Index,
                        final int parameter14Index) {
                this.patchData = patchData;

                this.typeIndex = typeIndex;
                this.mixIndex = mixIndex;
                this.parameter1Index = parameter1Index;
                this.parameter2Index = parameter2Index;
                this.parameter3Index = parameter3Index;
                this.parameter4Index = parameter4Index;
                this.parameter5Index = parameter5Index;
                this.parameter6Index = parameter6Index;
                this.parameter7Index = parameter7Index;
                this.parameter8Index = parameter8Index;
                this.parameter9Index = parameter9Index;
                this.parameter10Index = parameter10Index;
                this.parameter11Index = parameter11Index;
                this.parameter12Index = parameter12Index;
                this.parameter13Index = parameter13Index;
                this.parameter14Index = parameter14Index;

                // Init patch
        }

        public final ZeroToPlus127 getMix() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[mixIndex]);
        }

        public final ZeroToPlus127 getParameter1() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter1Index]);
        }

        public final ZeroToPlus127 getParameter10() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter10Index]);
        }

        public final ZeroToPlus127 getParameter11() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter11Index]);
        }

        public final ZeroToPlus127 getParameter12() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter12Index]);
        }

        public final ZeroToPlus127 getParameter13() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter13Index]);
        }

        public final ZeroToPlus127 getParameter14() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter14Index]);
        }

        public final ZeroToPlus127 getParameter2() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter2Index]);
        }

        public final ZeroToPlus127 getParameter3() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter3Index]);
        }

        public final ZeroToPlus127 getParameter4() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter4Index]);
        }

        public final ZeroToPlus127 getParameter5() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter5Index]);
        }

        public final ZeroToPlus127 getParameter6() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter6Index]);
        }

        public final ZeroToPlus127 getParameter7() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter7Index]);
        }

        public final ZeroToPlus127 getParameter8() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter8Index]);
        }

        public final ZeroToPlus127 getParameter9() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[parameter9Index]);
        }

        public final EffectTypes getType() {
                return EnumConverters
                                .convertEffectTypes(patchData.getPayload()[typeIndex]);
        }

        public final void setMix(final ZeroToPlus127 mix) {
                patchData.setValue(mixIndex, mix.value);
        }

        public final void setParameter1(final ZeroToPlus127 parameter1) {
                patchData.setValue(parameter1Index, parameter1.value);
        }

        public final void setParameter10(final ZeroToPlus127 parameter10) {
                patchData.setValue(parameter10Index, parameter10.value);
        }

        public final void setParameter11(final ZeroToPlus127 parameter11) {
                patchData.setValue(parameter11Index, parameter11.value);
        }

        public final void setParameter12(final ZeroToPlus127 parameter12) {
                patchData.setValue(parameter12Index, parameter12.value);
        }

        public final void setParameter13(final ZeroToPlus127 parameter13) {
                patchData.setValue(parameter13Index, parameter13.value);
        }

        public final void setParameter14(final ZeroToPlus127 parameter14) {
                patchData.setValue(parameter14Index, parameter14.value);
        }

        public final void setParameter2(final ZeroToPlus127 parameter2) {
                patchData.setValue(parameter2Index, parameter2.value);
        }

        public final void setParameter3(final ZeroToPlus127 parameter3) {
                patchData.setValue(parameter3Index, parameter3.value);
        }

        public final void setParameter4(final ZeroToPlus127 parameter4) {
                patchData.setValue(parameter4Index, parameter4.value);
        }

        public final void setParameter5(final ZeroToPlus127 parameter5) {
                patchData.setValue(parameter5Index, parameter5.value);
        }

        public final void setParameter6(final ZeroToPlus127 parameter6) {
                patchData.setValue(parameter6Index, parameter6.value);
        }

        public final void setParameter7(final ZeroToPlus127 parameter7) {
                patchData.setValue(parameter7Index, parameter7.value);
        }

        public final void setParameter8(final ZeroToPlus127 parameter8) {
                patchData.setValue(parameter8Index, parameter8.value);
        }

        public final void setParameter9(final ZeroToPlus127 parameter9) {
                patchData.setValue(parameter9Index, parameter9.value);
        }

        public final void setType(final EffectTypes type) {
                patchData.setValue(typeIndex, type.value);
        }

}
