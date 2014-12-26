package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.patterns;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverters;

public class PatternBase {
        private final int patternIndex;
        private final int timingIndex;

        private final PatchData patchData;

        protected PatternBase(final PatchData patchData,
                        final int patternIndex, final int timingIndex) {
                this.patchData = patchData;
                this.patternIndex = patternIndex;
                this.timingIndex = timingIndex;

                setAccent(Accents.ZERO);
                setStep(Steps.NORMAL);
                setTiming(Timings.ZERO);
                setLength(Lengths.ZERO);
        }

        public final Accents getAccent() {
                return EnumConverters.convertAccents(patchData.getValue(
                                patternIndex, 0, 3));
        }

        public final OffOn getGlide() {
                return EnumConverters.convertOffOn(patchData.getValue(
                                patternIndex, 3, 1));
        }

        public final Lengths getLength() {
                return EnumConverters.convertPatternLengths(patchData.getValue(
                                timingIndex, 4, 3));
        }

        public final Steps getStep() {
                return EnumConverters.convertSteps(patchData.getValue(
                                patternIndex, 4, 3));
        }

        public final Timings getTiming() {
                return EnumConverters.convertTimings(patchData.getValue(
                                timingIndex, 0, 3));
        }

        public final void setAccent(final Accents accent) {
                patchData.setValue(patternIndex, 0, 3, accent.value);
        }

        public final void setGlide(final OffOn glide) {
                patchData.setValue(patternIndex, 3, 1, glide.value);
        }

        public final void setLength(final Lengths length) {
                patchData.setValue(timingIndex, 4, 3, length.value);
        }

        public final void setStep(final Steps step) {
                patchData.setValue(patternIndex, 4, 3, step.value);
        }

        public final void setTiming(final Timings timing) {
                patchData.setValue(timingIndex, 0, 3, timing.value);
        }
}
