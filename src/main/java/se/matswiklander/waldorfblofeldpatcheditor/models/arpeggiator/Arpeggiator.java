package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Arpeggiator {
        private final int modeIndex = 311;
        private final int patternIndex = 312;
        private final int clockIndex = 314;
        private final int lengthIndex = 315;
        private final int octaveIndex = 316;
        private final int directionIndex = 317;
        private final int sortOrderIndex = 318;
        private final int velocityIndex = 319;
        private final int timingFactorIndex = 320;
        private final int patternResetIndex = 322;
        private final int patternLengthIndex = 323;
        private final int tempoIndex = 326;

        private final PatchData patchData;
        private final main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Patterns patterns;

        public Arpeggiator(final PatchData patchData) {
                this.patchData = patchData;

                patterns = new main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Patterns(
                                patchData);

                // Init patch
                setMode(Modes.OFF);
                setPattern(Patterns.OFF);
                setClock(Clocks._1_8);
                setLength(Lengths._1_16);
                setOctave(OneTo10._1);
                setDirection(Directions.UP);
                setSortOrder(SortOrders.AS_PLAYED);
                setVelocity(Velocities.FIRST_NOTE);
                setTimingFactor(ZeroToPlus127.PLUS12);
                setPatternReset(OffOn.OFF);
                setPatternLength(OneTo16._16);
                setTempo(Tempos.BPM153);
        }

        public final Clocks getClock() {
                return EnumConverters.convertArpeggiatorClocks(patchData
                                .getValue(clockIndex));
        }

        public final Directions getDirection() {
                return EnumConverters.convertDirections(patchData
                                .getValue(directionIndex));
        }

        public final Lengths getLength() {
                return EnumConverters.convertArpeggiatorLengths(patchData
                                .getValue(lengthIndex));
        }

        public final Modes getMode() {
                return EnumConverters.convertArpeggiatorModes(patchData
                                .getValue(modeIndex));
        }

        public final OneTo10 getOctave() {
                return EnumConverters.convertOneTo10(patchData
                                .getValue(octaveIndex));
        }

        public final Patterns getPattern() {
                return EnumConverters.convertPatterns(patchData
                                .getValue(patternIndex));
        }

        public final OneTo16 getPatternLength() {
                return EnumConverters.convertOneTo16(patchData
                                .getValue(patternLengthIndex));
        }

        public final OffOn getPatternReset() {
                return EnumConverters.convertOffOn(patchData
                                .getValue(patternResetIndex));
        }

        public final main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Patterns getPatterns() {
                return patterns;
        }

        public final SortOrders getSortOrder() {
                return EnumConverters.convertSortOrders(patchData
                                .getValue(sortOrderIndex));
        }

        public final Tempos getTempo() {
                return EnumConverters.convertTempos(patchData
                                .getValue(tempoIndex));
        }

        public final ZeroToPlus127 getTimingFactor() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(timingFactorIndex));
        }

        public final Velocities getVelocity() {
                return EnumConverters.convertVelocities(patchData
                                .getValue(velocityIndex));
        }

        public final void setClock(final Clocks clock) {
                patchData.setValue(clockIndex, clock.value);
        }

        public final void setDirection(final Directions direction) {
                patchData.setValue(directionIndex, direction.value);
        }

        public final void setLength(final Lengths length) {
                patchData.setValue(lengthIndex, length.value);
        }

        public final void setMode(final Modes mode) {
                patchData.setValue(modeIndex, mode.value);
        }

        public final void setOctave(final OneTo10 octave) {
                patchData.setValue(octaveIndex, octave.value);
        }

        public final void setPattern(final Patterns pattern) {
                patchData.setValue(patternIndex, pattern.value);
        }

        public final void setPatternLength(final OneTo16 patternLength) {
                patchData.setValue(patternLengthIndex, patternLength.value);
        }

        public final void setPatternReset(final OffOn patternReset) {
                patchData.setValue(patternResetIndex, patternReset.value);
        }

        public final void setSortOrder(final SortOrders sortOrder) {
                patchData.setValue(sortOrderIndex, sortOrder.value);
        }

        public final void setTempo(final Tempos tempo) {
                patchData.setValue(tempoIndex, tempo.value);
        }

        public final void setTimingFactor(final ZeroToPlus127 timingFactor) {
                patchData.setValue(timingFactorIndex, timingFactor.value);
        }

        public final void setVelocity(final Velocities velocity) {
                patchData.setValue(velocityIndex, velocity.value);
        }
}
