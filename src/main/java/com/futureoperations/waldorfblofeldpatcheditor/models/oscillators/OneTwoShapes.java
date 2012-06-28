package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum OneTwoShapes implements EnumConverter<OneTwoShapes> {
        OFF(0, "off"), PULSE(1, "Pulse"), SAW(2, "Saw"), TRIANGLE(3, "Triangle"), SINE(
                        4, "Sine"), ALT_1(5, "Alt 1"), ALT_2(6, "Alt 2"), RESONANT(
                        7, "Resonant"), RESONANT_2(8, "Resonant2"), MALLET_SYN(
                        9, "MalletSyn"), SQR_SWEEP(10, "Sqr-Sweep"), BELLISH(
                        11, "Bellish"), PUL_SWEEP(12, "Pul-Sweep"), SAW_SWEEP(
                        13, "Saw-Sweep"), MELLOW_SAW(14, "MellowSaw"), FEEDBACK(
                        15, "Feedback"), ADD_HARM(16, "Add Harm"), RESO_3_HP(
                        17, "Reso 3 HP"), WIND_SYN(18, "Wind Syn"), HIGH_HARM(
                        19, "High Harm"), CLIPPER(20, "Clipper"), ORGAN_SYN(21,
                        "Organ Syn"), SQUARE_SAW(22, "SquareSaw"), FORMANT_1(
                        23, "Formant 1"), POLATED(24, "Polated"), TRANSIENT(25,
                        "Transient"), ELECTRIC_P(26, "ElectricP"), ROBOTIC(27,
                        "Robotic"), STRONG_HRM(28, "StrongHrm"), PERC_ORGAN(29,
                        "PercOrgan"), CLIP_SWEEP(30, "ClipSweep"), RESO_HARMS(
                        31, "ResoHarms"), TWO_ECHOS(32, "2 Echoes"), FORMAT_2(
                        33, "Formant 2"), FMNT_VOCAL(34, "FmntVocal"), MICRO_SYNC(
                        35, "MicroSync"), MICRO_PWM(36, "Micro PWM"), GLASSY(
                        37, "Glassy"), SQUARE_HP(38, "Square HP"), SAW_SYNC_1(
                        39, "SawSync 1"), SAW_SYNC_2(40, "SawSync 2"), SAW_SYNC_3(
                        41, "SawSync 3"), PUL_SYNC_1(42, "PulSync 1"), PUL_SYNC_2(
                        43, "PulSync 2"), PUL_SYNC_3(44, "PulSync 3"), SIN_SYNC_1(
                        45, "SinSync 1"), SIN_SYNC_2(46, "SinSync 2"), SIN_SYNC_3(
                        47, "SinSync 3"), PWM_PULSE(48, "PWM Pulse"), PWM_SAW(
                        49, "PWM Saw"), FUZZ_WAVE(50, "Fuzz Wave"), DISTORTED(
                        51, "Distorted"), HEAVY_FUZZ(52, "HeavyFuzz"), FUZZ_SYNC(
                        53, "Fuzz Sync"), K_STRONG_1(54, "K+Strong1"), K_STRONG_2(
                        55, "K+Strong2"), K_STRONG_3(56, "K+Strong3"), ONE_TWO_THREE_FOUR_FIVE(
                        57, "1-2-3-4-5"), NINETEEN_TWENTY(58, "19/twenty"), WAVETRIP_1(
                        59, "Wavetrip1"), WAVETRIP_2(60, "Wavetrip2"), WAVETRIP_3(
                        61, "Wavetrip3"), WAVETRIP_4(62, "Wavetrip4"), MALE_VOICE(
                        63, "MaleVoice"), LOW_PIANO(64, "Low Piano"), RESO_SWEEP(
                        65, "ResoSweep"), XMAS_BELL(66, "Xmas Bell"), FM_PIANO(
                        67, "FM Piano"), FAT_ORGAN(68, "Fat Organ"), VIBES(69,
                        "Vibes"), CHORUS_2(70, "Chorus 2"), TRUE_PWM(71,
                        "True PWM"), UPPER_WAVES(72, "UpperWaves");

        public final int value;
        public final String name;

        private static ReverseEnumMap<OneTwoShapes> map = new ReverseEnumMap<OneTwoShapes>(
                        OneTwoShapes.class);

        private OneTwoShapes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public OneTwoShapes convert(final int value) {
                return map.get(value);
        }

}
