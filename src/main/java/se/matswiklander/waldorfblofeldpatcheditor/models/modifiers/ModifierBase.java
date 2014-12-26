package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modifiers;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverters;

public class ModifierBase {
        private final int sourceAIndex;
        private final int sourceBIndex;
        private final int operationIndex;
        private final int constantIndex;

        private final PatchData patchData;

        protected ModifierBase(final PatchData patchData,
                        final int sourceAIndex, final int sourceBIndex,
                        final int operationIndex, final int constantIndex) {
                this.patchData = patchData;
                this.sourceAIndex = sourceAIndex;
                this.sourceBIndex = sourceBIndex;
                this.operationIndex = operationIndex;
                this.constantIndex = constantIndex;

                // Init patch
                setSourceA(ModulationSources.OFF);
                setSourceB(ModulationSources.OFF);
                setOperation(Operators.PLUS);
                setConstant(Minus64ToPlus63.ZERO);
        }

        public final Minus64ToPlus63 getConstant() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(constantIndex));
        }

        public final Operators getOperation() {
                return EnumConverters.convertOperators(patchData
                                .getValue(operationIndex));
        }

        public final ModulationSources getSourceA() {
                return EnumConverters.convertModulationSources(patchData
                                .getValue(sourceAIndex));
        }

        public final ModulationSources getSourceB() {
                return EnumConverters.convertModulationSources(patchData
                                .getValue(sourceBIndex));
        }

        public final void setConstant(final Minus64ToPlus63 constant) {
                patchData.setValue(constantIndex, constant.value);
        }

        public final void setOperation(final Operators operation) {
                patchData.setValue(operationIndex, operation.value);
        }

        public final void setSourceA(final ModulationSources sourceA) {
                patchData.setValue(sourceAIndex, sourceA.value);
        }

        public final void setSourceB(final ModulationSources sourceB) {
                patchData.setValue(sourceBIndex, sourceB.value);
        }
}
