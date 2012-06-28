package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modulations;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationDestinations;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class ModulationBase {
        private final int sourceIndex;
        private final int destinationIndex;
        private final int amountIndex;

        private final PatchData patchData;

        protected ModulationBase(final PatchData patchData,
                        final int sourceIndex, final int destinationIndex,
                        final int amountIndex) {
                this.patchData = patchData;
                this.sourceIndex = sourceIndex;
                this.destinationIndex = destinationIndex;
                this.amountIndex = amountIndex;

                setSource(ModulationSources.OFF);
                setDestination(ModulationDestinations.PITCH);
                setAmount(Minus64ToPlus63.ZERO);
        }

        public final Minus64ToPlus63 getAmount() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(amountIndex));
        }

        public final ModulationDestinations getDestination() {
                return EnumConverters.convertModulationDestinations(patchData
                                .getValue(destinationIndex));
        }

        public final ModulationSources getSource() {
                return EnumConverters.convertModulationSources(patchData
                                .getValue(sourceIndex));
        }

        public final void setAmount(final Minus64ToPlus63 amount) {
                patchData.setValue(amountIndex, amount.value);
        }

        public final void setDestination(
                        final ModulationDestinations destination) {
                patchData.setValue(destinationIndex, destination.value);
        }

        public final void setSource(final ModulationSources source) {
                patchData.setValue(sourceIndex, source.value);
        }
}
