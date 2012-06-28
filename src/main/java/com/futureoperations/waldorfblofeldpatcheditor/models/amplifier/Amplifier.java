package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.amplifier;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Amplifier {
        private final PatchData patchData;
        private final int volumeIndex = 121;
        private final int velocityIndex = 122;
        private final int modSourceIndex = 123;
        private final int modAmountIndex = 124;

        public Amplifier(final PatchData patchData) {
                this.patchData = patchData;

                // Init patch
                setVolume(ZeroToPlus127.PLUS127);
                setVelocity(Minus64ToPlus63.PLUS50);
                setModSource(ModulationSources.LFO_3);
                setModAmount(Minus64ToPlus63.ZERO);
        }

        public final Minus64ToPlus63 getModAmount() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(modAmountIndex));
        }

        public final ModulationSources getModSource() {
                return EnumConverters.convertModulationSources(patchData
                                .getValue(modSourceIndex));
        }

        public final Minus64ToPlus63 getVelocity() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(velocityIndex));
        }

        public final ZeroToPlus127 getVolume() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(volumeIndex));
        }

        public final void setModAmount(final Minus64ToPlus63 modAmount) {
                patchData.setValue(modAmountIndex, modAmount.value);
        }

        public final void setModSource(final ModulationSources modSource) {
                patchData.setValue(modSourceIndex, modSource.value);
        }

        public final void setVelocity(final Minus64ToPlus63 velocity) {
                patchData.setValue(velocityIndex, velocity.value);
        }

        public final void setVolume(final ZeroToPlus127 volume) {
                patchData.setValue(volumeIndex, volume.value);
        }
}
