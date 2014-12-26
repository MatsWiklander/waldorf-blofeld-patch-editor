package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.oscillators;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Oscillators {
        private final PatchData patchData;
        private final Oscillator1 oscillator1;
        private final Oscillator2 oscillator2;
        private final Oscillator3 oscillator3;

        private final int osc2SyncToO3Index = 49;
        private final int pitchSourceIndex = 50;
        private final int pitchAmountIndex = 51;
        private final int glideIndex = 53;
        private final int glideModeIndex = 56;
        private final int glideRateIndex = 57;
        private final int allocationModeIndex = 58;
        private final int unisonoModeIndex = 58;
        private final int unisonoDetuneIndex = 59;

        public Oscillators(final PatchData patchData) {
                this.patchData = patchData;

                oscillator1 = new Oscillator1(patchData);
                oscillator2 = new Oscillator2(patchData);
                oscillator3 = new Oscillator3(patchData);

                // Init patch
                setOsc2SyncToO3(OffOn.OFF);
                setPitchSource(ModulationSources.LFO_1_MW);
                setPitchAmount(Minus64ToPlus63.ZERO);
                setGlide(OffOn.OFF);
                setGlideMode(GlideModes.PORTAMENTO);
                setGlideRate(ZeroToPlus127.PLUS20);
                setAllocationMode(AllocationModes.POLY);
                setUnisonoMode(UnisonoModes.OFF);
                setUnisonoDetune(ZeroToPlus127.ZERO);
        }

        public final AllocationModes getAllocationMode() {
                return EnumConverters.convertAllocationModes(patchData
                                .getValue(allocationModeIndex, 0, 1));
        }

        public final OffOn getGlide() {
                return EnumConverters.convertOffOn(patchData
                                .getValue(glideIndex));
        }

        public final GlideModes getGlideMode() {
                return EnumConverters.convertGlideModes(patchData
                                .getValue(glideModeIndex));
        }

        public final ZeroToPlus127 getGlideRate() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(glideRateIndex));
        }

        public final OffOn getOsc2SyncToO3() {
                return EnumConverters.convertOffOn(patchData
                                .getValue(osc2SyncToO3Index));
        }

        public final Oscillator1 getOscillator1() {
                return oscillator1;
        }

        public final Oscillator2 getOscillator2() {
                return oscillator2;
        }

        public final Oscillator3 getOscillator3() {
                return oscillator3;
        }

        public final Minus64ToPlus63 getPitchAmount() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(pitchAmountIndex));
        }

        public final ModulationSources getPitchSource() {
                return EnumConverters.convertModulationSources(patchData
                                .getValue(pitchSourceIndex));
        }

        public final ZeroToPlus127 getUnisonoDetune() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(unisonoDetuneIndex));
        }

        public final UnisonoModes getUnisonoMode() {
                return EnumConverters.convertUnisonoModes(patchData.getValue(
                                unisonoModeIndex, 4, 3));
        }

        public final void setAllocationMode(final AllocationModes allocationMode) {
                patchData.getPayload()[allocationModeIndex] &= 113;

                patchData.setValue(allocationModeIndex, 0, 1,
                                allocationMode.value);
        }

        public final void setGlide(final OffOn glide) {
                patchData.setValue(glideIndex, glide.value);
        }

        public final void setGlideMode(final GlideModes glideMode) {
                patchData.setValue(glideModeIndex, glideMode.value);
        }

        public final void setGlideRate(final ZeroToPlus127 glideRate) {
                patchData.setValue(glideRateIndex, glideRate.value);
        }

        public final void setOsc2SyncToO3(final OffOn osc2SyncToO3) {
                patchData.setValue(osc2SyncToO3Index, osc2SyncToO3.value);
        }

        public final void setPitchAmount(final Minus64ToPlus63 pitchAmount) {
                patchData.setValue(pitchAmountIndex, pitchAmount.value);
        }

        public final void setPitchSource(final ModulationSources pitchSource) {
                patchData.setValue(pitchSourceIndex, pitchSource.value);
        }

        public final void setUnisonoDetune(final ZeroToPlus127 unisonoDetune) {
                patchData.setValue(unisonoDetuneIndex, unisonoDetune.value);
        }

        public final void setUnisonoMode(final UnisonoModes unisonoMode) {
                patchData.getPayload()[allocationModeIndex] &= 113;
                patchData.setValue(unisonoModeIndex, 4, 3, unisonoMode.value);
        }
}
