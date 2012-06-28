package main.java.com.futureoperations.waldorfblofeldpatcheditor.utils;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Directions;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.OneTo10;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.OneTo16;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Patterns;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.SortOrders;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Tempos;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Velocities;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Accents;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Lengths;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Steps;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Timings;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.EffectTypes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Polarities;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ClkDelayLengths;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.DriveCurves;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.FmSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Left64ToRight63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus12ToPlus12;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus24ToPlus24;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationDestinations;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes.Modes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes.Triggers;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.ParallelSerial;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Types;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.Clocks;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.FreeTo355Degree;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.Shapes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.F164ToF263;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Operators;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.AllocationModes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.GlideModes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.Octaves;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.OneTwoShapes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.ThreeShapes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.UnisonoModes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.Banks;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.Categories;

public class EnumConverters {
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Accents ACCENTS = Accents.MINUS32;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.AllocationModes ALLOCATION_MODES = AllocationModes.MONO;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Clocks ARPEGGIATOR_CLOCKS = main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Clocks._10_BARS;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Lengths ARPEGGIATOR_LENGTHS = main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Lengths._10_BARS;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Modes ARPEGGIATOR_MODES = main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Modes.HOLD;
        private static final Categories CATEGORIES = Categories.ARP;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Directions DIRECTIONS = Directions.ALT_DOWN;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.DriveCurves DRIVE_CURVES = DriveCurves.BINARY;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes.Modes ENVELOPE_MODES = Modes.ADS1DS2R;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.F164ToF263 F164_TO_F263 = F164ToF263.F1_1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.FmSources FM_SOURCES = FmSources.AMP_ENV;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.FreeTo355Degree FREE_TO_355DEGREE = FreeTo355Degree.DEGREE101;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.GlideModes GLIDE_MODES = GlideModes.FINGERED_G;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Left64ToRight63 LEFT64_TO_RIGHT63 = Left64ToRight63.LEFT_1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.Clocks LFO_CLOCKS = Clocks._1024_BARS_1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.Shapes LFO_SHAPES = Shapes.RANDOM;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus12ToPlus12 MINUS12_TO_PLUS12 = Minus12ToPlus12.MINUS1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent MINUS200_TO_PLUS196_PERCENT = Minus200PercentToPlus196Percent.MINUS100PERCENT;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus24ToPlus24 MINUS24_TO_PLUS24 = Minus24ToPlus24.MINUS1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63 MINUS64_TO_PLUS63 = Minus64ToPlus63.MINUS1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationDestinations MODULATION_DESTINATIONS = ModulationDestinations.AE_ATTACK;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources MODULATION_SOURCES = ModulationSources.AMP_ENV;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.Octaves OCTAVES = Octaves.FOOT1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffOn OFF_ON = OffOn.OFF;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffToPlus127 OFF_TO_PLUS127 = OffToPlus127.OFF;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.OneTo10 ONE_TO_10 = OneTo10._1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.OneTo16 ONE_TO_16 = OneTo16._1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.OneTwoShapes ONE_TWO_SHAPES = OneTwoShapes.ADD_HARM;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Operators OPERATORS = Operators.AND;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.ParallelSerial PARALLEL_SERIAL = ParallelSerial.PARALLEL;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Lengths PATTERN_LENGTHS = Lengths.LEGATO;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Patterns PATTERNS = Patterns.OFF;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.SortOrders SORT_ORDERS = SortOrders.AS_PLAYED;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Steps STEPS = Steps.CHORD;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Tempos TEMPOS = Tempos.BPM101;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.ThreeShapes THREE_SHAPES = ThreeShapes.OFF;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Timings TIMINGS = Timings.MINUS1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Types TYPE = Types.BP_12DB;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.UnisonoModes UNISONO_MODES = UnisonoModes._3;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Velocities VELOCITIES = Velocities.EACH_NOTE;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127 ZERO_TO_PLUS127 = ZeroToPlus127.PLUS1;
        private static final main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Polarities POLARITIES = Polarities.NEGATIVE;
        private static final EffectTypes EFFECT_TYPES = EffectTypes.BYPASS;
        private static final ClkDelayLengths CLK_DELAY_LENGTHS = ClkDelayLengths._10_BARS;
        private static final Triggers ENVELOPE_TRIGGERS = Triggers.NORMAL;
        private static final Banks BANKS = Banks.A;

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Accents convertAccents(
                        final int value) {
                return ACCENTS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.AllocationModes convertAllocationModes(
                        final int value) {
                return ALLOCATION_MODES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Clocks convertArpeggiatorClocks(
                        final int value) {
                return ARPEGGIATOR_CLOCKS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Lengths convertArpeggiatorLengths(
                        final int value) {
                return ARPEGGIATOR_LENGTHS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Modes convertArpeggiatorModes(
                        final int value) {
                return ARPEGGIATOR_MODES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.Banks convertBanks(final int value) {
                return BANKS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.Categories convertCategories(
                        final int value) {
                return CATEGORIES.convert(value);
        }

        public static ClkDelayLengths convertClkDelayLengths(final int value) {
                return CLK_DELAY_LENGTHS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Directions convertDirections(
                        final int value) {
                return DIRECTIONS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.DriveCurves convertDriveCurves(
                        final int value) {
                return DRIVE_CURVES.convert(value);
        }

        public static EffectTypes convertEffectTypes(final int value) {
                return EFFECT_TYPES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes.Modes convertEnvelopeModes(
                        final int value) {
                return ENVELOPE_MODES.convert(value);
        }

        public static Triggers convertEnvelopeTriggers(final int value) {
                return ENVELOPE_TRIGGERS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.F164ToF263 convertF164ToF263(
                        final int value) {
                return F164_TO_F263.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Types convertFilterTypes(
                        final int value) {
                return TYPE.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.FmSources convertFmSources(
                        final int value) {
                return FM_SOURCES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.FreeTo355Degree convertFreeTo355Degrees(
                        final int value) {
                return FREE_TO_355DEGREE.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.GlideModes convertGlideModes(
                        final int value) {
                return GLIDE_MODES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Left64ToRight63 convertLeft64ToRight63(
                        final int value) {
                return LEFT64_TO_RIGHT63.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.Clocks convertLfoClocks(
                        final int value) {
                return LFO_CLOCKS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.Shapes convertLfoShapes(
                        final int value) {
                return LFO_SHAPES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus12ToPlus12 convertMinus12ToPlus12(
                        final int value) {
                return MINUS12_TO_PLUS12.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent convertMinus200PercentToPlus196Percent(
                        final int value) {
                return MINUS200_TO_PLUS196_PERCENT.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus24ToPlus24 convertMinus24ToPlus24(
                        final int value) {
                return MINUS24_TO_PLUS24.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63 convertMinus64ToPlus63(
                        final int value) {
                return MINUS64_TO_PLUS63.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationDestinations convertModulationDestinations(
                        final int value) {
                return MODULATION_DESTINATIONS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources convertModulationSources(
                        final int value) {
                return MODULATION_SOURCES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.Octaves convertOctaves(
                        final int value) {
                return OCTAVES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffOn convertOffOn(final int value) {
                return OFF_ON.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffToPlus127 convertOffToPlus127(
                        final int value) {
                return OFF_TO_PLUS127.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.OneTo10 convertOneTo10(
                        final int value) {
                return ONE_TO_10.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.OneTo16 convertOneTo16(
                        final int value) {
                return ONE_TO_16.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.OneTwoShapes convertOneTwoShapes(
                        final int value) {
                return ONE_TWO_SHAPES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Operators convertOperators(
                        final int value) {
                return OPERATORS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.ParallelSerial convertParallelSerial(
                        final int value) {
                return PARALLEL_SERIAL.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Lengths convertPatternLengths(
                        final int value) {
                return PATTERN_LENGTHS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Patterns convertPatterns(
                        final int value) {
                return PATTERNS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Polarities convertPolarities(
                        final int value) {
                return POLARITIES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.SortOrders convertSortOrders(
                        final int value) {
                return SORT_ORDERS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Steps convertSteps(
                        final int value) {
                return STEPS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Tempos convertTempos(
                        final int value) {
                return TEMPOS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.ThreeShapes convertThreeShapes(
                        final int value) {
                return THREE_SHAPES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Timings convertTimings(
                        final int value) {
                return TIMINGS.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.UnisonoModes convertUnisonoModes(
                        final int value) {
                return UNISONO_MODES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Velocities convertVelocities(
                        final int value) {
                return VELOCITIES.convert(value);
        }

        public static main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127 convertZeroToPlus127(
                        final int value) {
                return ZERO_TO_PLUS127.convert(value);
        }
}
