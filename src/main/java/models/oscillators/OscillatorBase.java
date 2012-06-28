package main.java.models.oscillators;

import main.java.models.enums.FmSources;
import main.java.models.enums.Minus12ToPlus12;
import main.java.models.enums.Minus200PercentToPlus196Percent;
import main.java.models.enums.Minus24ToPlus24;
import main.java.models.enums.Minus64ToPlus63;
import main.java.models.enums.ModulationSources;
import main.java.models.enums.ZeroToPlus127;
import main.java.models.patch.PatchData;
import main.java.utils.EnumConverters;

public abstract class OscillatorBase {
        private final int octaveIndex;
        private final int semitoneIndex;
        private final int detuneIndex;
        private final int bendRangeIndex;
        private final int keytrackIndex;
        private final int fmSourceIndex;
        private final int fmAmountIndex;
        private final int pulseWidthIndex;
        private final int pwmSourceIndex;
        private final int pwmAmountIndex;
        private final int brillianceIndex;

        private final PatchData patchData;

        protected OscillatorBase(final PatchData patchData,
                        final int octaveIndex, final int semitoneIndex,
                        final int detuneIndex, final int bendRangeIndex,
                        final int keytrackIndex, final int fmSourceIndex,
                        final int fmAmountIndex, final int pulseWidthIndex,
                        final int pwmSourceIndex, final int pwmAmountIndex,
                        final int brillianceIndex) {
                this.patchData = patchData;
                this.octaveIndex = octaveIndex;
                this.semitoneIndex = semitoneIndex;
                this.detuneIndex = detuneIndex;
                this.bendRangeIndex = bendRangeIndex;
                this.keytrackIndex = keytrackIndex;
                this.fmSourceIndex = fmSourceIndex;
                this.fmAmountIndex = fmAmountIndex;
                this.pulseWidthIndex = pulseWidthIndex;
                this.pwmSourceIndex = pwmSourceIndex;
                this.pwmAmountIndex = pwmAmountIndex;
                this.brillianceIndex = brillianceIndex;
        }

        public final Minus24ToPlus24 getBendRange() {
                return EnumConverters.convertMinus24ToPlus24(patchData
                                .getValue(bendRangeIndex));
        }

        public final ZeroToPlus127 getBrilliance() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(brillianceIndex));
        }

        public final Minus64ToPlus63 getDetune() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(detuneIndex));
        }

        public final ZeroToPlus127 getFmAmount() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(fmAmountIndex));
        }

        public final FmSources getFmSource() {
                return EnumConverters.convertFmSources(patchData
                                .getValue(fmSourceIndex));
        }

        public final Minus200PercentToPlus196Percent getKeytrack() {
                return EnumConverters
                                .convertMinus200PercentToPlus196Percent(patchData
                                                .getValue(keytrackIndex));
        }

        public final Octaves getOctave() {
                return EnumConverters.convertOctaves(patchData
                                .getValue(octaveIndex));
        }

        public final ZeroToPlus127 getPulseWidth() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(pulseWidthIndex));
        }

        public final Minus64ToPlus63 getPwmAmount() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(pwmAmountIndex));
        }

        public final ModulationSources getPwmSource() {
                return EnumConverters.convertModulationSources(patchData
                                .getValue(pwmSourceIndex));
        }

        public final Minus12ToPlus12 getSemitone() {
                return EnumConverters.convertMinus12ToPlus12(patchData
                                .getValue(semitoneIndex));
        }

        public final void setBendRange(final Minus24ToPlus24 bendRange) {
                patchData.setValue(bendRangeIndex, bendRange.value);
        }

        public final void setBrilliance(final ZeroToPlus127 brilliance) {
                patchData.setValue(brillianceIndex, brilliance.value);
        }

        public final void setDetune(final Minus64ToPlus63 detune) {
                patchData.setValue(detuneIndex, detune.value);
        }

        public final void setFmAmount(final ZeroToPlus127 fmAmount) {
                patchData.setValue(fmAmountIndex, fmAmount.value);
        }

        public final void setFmSource(final FmSources fmSource) {
                patchData.setValue(fmSourceIndex, fmSource.value);
        }

        public final void setKeytrack(
                        final Minus200PercentToPlus196Percent keyTrack) {
                patchData.setValue(keytrackIndex, keyTrack.value);
        }

        public final void setOctave(final Octaves octave) {
                patchData.setValue(octaveIndex, octave.value);
        }

        public final void setPulseWidth(final ZeroToPlus127 pulseWidth) {
                patchData.setValue(pulseWidthIndex, pulseWidth.value);
        }

        public final void setPwmAmount(final Minus64ToPlus63 pwmAmount) {
                patchData.setValue(pwmAmountIndex, pwmAmount.value);
        }

        public final void setPwmSource(final ModulationSources pwmSource) {
                patchData.setValue(pwmSourceIndex, pwmSource.value);
        }

        public final void setSemitone(final Minus12ToPlus12 semitone) {
                patchData.setValue(semitoneIndex, semitone.value);
        }
}
