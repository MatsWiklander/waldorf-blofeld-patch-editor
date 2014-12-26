package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.filters;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.DriveCurves;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.FmSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Left64ToRight63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.OffToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverters;

public class FilterBase {
        private final int typeIndex;
        private final int cutoffIndex;
        private final int resonanceIndex;
        private final int driveIndex;
        private final int driveCurveIndex;
        private final int keyTrackIndex;
        private final int envAmountIndex;
        private final int envVelocityIndex;
        private final int modSourceIndex;
        private final int modAmountIndex;
        private final int fmSourceIndex;
        private final int fmAmountIndex;
        private final int panIndex;
        private final int panSourceIndex;
        private final int panAmountIndex;

        private final PatchData patchData;

        protected FilterBase(final PatchData patchData, final int typeIndex,
                        final int cutoffIndex, final int resonanceIndex,
                        final int driveIndex, final int driveCurveIndex,
                        final int keyTrackIndex, final int envAmountIndex,
                        final int envVelocityIndex, final int modSourceIndex,
                        final int modAmountIndex, final int fmSourceIndex,
                        final int fmAmountIndex, final int panIndex,
                        final int panSourceIndex, final int panAmountIndex) {
                this.patchData = patchData;
                this.typeIndex = typeIndex;
                this.cutoffIndex = cutoffIndex;
                this.resonanceIndex = resonanceIndex;
                this.driveIndex = driveIndex;
                this.driveCurveIndex = driveCurveIndex;
                this.keyTrackIndex = keyTrackIndex;
                this.envAmountIndex = envAmountIndex;
                this.envVelocityIndex = envVelocityIndex;
                this.modSourceIndex = modSourceIndex;
                this.modAmountIndex = modAmountIndex;
                this.fmSourceIndex = fmSourceIndex;
                this.fmAmountIndex = fmAmountIndex;
                this.panIndex = panIndex;
                this.panSourceIndex = panSourceIndex;
                this.panAmountIndex = panAmountIndex;
        }

        public final ZeroToPlus127 getCutoff() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(cutoffIndex));
        }

        public final ZeroToPlus127 getDrive() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(driveIndex));
        }

        public final DriveCurves getDriveCurve() {
                return EnumConverters.convertDriveCurves(patchData
                                .getValue(driveCurveIndex));
        }

        public final Minus64ToPlus63 getEnvAmount() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(envAmountIndex));
        }

        public final Minus64ToPlus63 getEnvVelocity() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(envVelocityIndex));
        }

        public final OffToPlus127 getFmAmount() {
                return EnumConverters.convertOffToPlus127(patchData
                                .getValue(fmAmountIndex));
        }

        public final FmSources getFmSource() {
                return EnumConverters.convertFmSources(patchData
                                .getValue(fmSourceIndex));
        }

        public final Minus200PercentToPlus196Percent getKeyTrack() {
                return EnumConverters
                                .convertMinus200PercentToPlus196Percent(patchData
                                                .getValue(keyTrackIndex));
        }

        public final Minus64ToPlus63 getModAmount() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(modAmountIndex));
        }

        public final ModulationSources getModSource() {
                return EnumConverters.convertModulationSources(patchData
                                .getValue(modSourceIndex));
        }

        public final Left64ToRight63 getPan() {
                return EnumConverters.convertLeft64ToRight63(patchData
                                .getValue(panIndex));
        }

        public final Minus64ToPlus63 getPanAmount() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(panAmountIndex));
        }

        public final ModulationSources getPanSource() {
                return EnumConverters.convertModulationSources(patchData
                                .getValue(panSourceIndex));
        }

        public final ZeroToPlus127 getResonance() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(resonanceIndex));
        }

        public final Types getType() {
                return EnumConverters.convertFilterTypes(patchData
                                .getValue(typeIndex));
        }

        public final void setCutoff(final ZeroToPlus127 cutoff) {
                patchData.setValue(cutoffIndex, cutoff.value);
        }

        public final void setDrive(final ZeroToPlus127 drive) {
                patchData.setValue(driveIndex, drive.value);
        }

        public final void setDriveCurve(final DriveCurves driveCurve) {
                patchData.setValue(driveCurveIndex, driveCurve.value);
        }

        public final void setEnvAmount(final Minus64ToPlus63 envAmount) {
                patchData.setValue(envAmountIndex, envAmount.value);
        }

        public final void setEnvVelocity(final Minus64ToPlus63 envVelocity) {
                patchData.setValue(envVelocityIndex, envVelocity.value);
        }

        public final void setFmAmount(final OffToPlus127 fmAmount) {
                patchData.setValue(fmAmountIndex, fmAmount.value);
        }

        public final void setFmSource(final FmSources fmSource) {
                patchData.setValue(fmSourceIndex, fmSource.value);
        }

        public final void setKeyTrack(
                        final Minus200PercentToPlus196Percent keyTrack) {
                patchData.setValue(keyTrackIndex, keyTrack.value);
        }

        public final void setModAmount(final Minus64ToPlus63 modAmount) {
                patchData.setValue(modAmountIndex, modAmount.value);
        }

        public final void setModSource(final ModulationSources modSource) {
                patchData.setValue(modSourceIndex, modSource.value);
        }

        public final void setPan(final Left64ToRight63 pan) {
                patchData.setValue(panIndex, pan.value);
        }

        public final void setPanAmount(final Minus64ToPlus63 panAmount) {
                patchData.setValue(panAmountIndex, panAmount.value);
        }

        public final void setPanSource(final ModulationSources panSource) {
                patchData.setValue(panSourceIndex, panSource.value);
        }

        public final void setResonance(final ZeroToPlus127 resonance) {
                patchData.setValue(resonanceIndex, resonance.value);
        }

        public final void setType(final Types type) {
                patchData.setValue(typeIndex, type.value);
        }
}
