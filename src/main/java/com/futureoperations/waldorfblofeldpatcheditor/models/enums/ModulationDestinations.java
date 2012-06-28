package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum ModulationDestinations implements
                EnumConverter<ModulationDestinations> {
        PITCH(0, "Pitch"), O1_PITCH(1, "O1 Pitch"), O1_FM(2, "O1 FM"), O1_PW_WAVE(
                        3, "O1 PW/Wave"), O2_PITCH(4, "O2 Pitch"), O2_FM(5,
                        "O2 FM"), O2_PW_WAVE(6, "O2 PW/Wave"), O3_PITCH(7,
                        "O3 Pitch"), O3_FM(8, "O3 FM"), O3_PW(9, "O3 PW"), O1_LEVEL(
                        10, "O1 Level"), O1_BALANCE(11, "O1 Balance"), O2_LEVEL(
                        12, "O2 Level"), O2_BALANCE(13, "O2 Balance"), O3_LEVEL(
                        14, "O3 Level"), O3_BALANCE(15, "O3 Balance"), RMOD_LEVEL(
                        16, "RMod Level"), RMOD_BAL(17, "RMod Bal."), NOISE_LEVEL_(
                        18, "NoiseLevel"), NOISE_BAL(19, "Noise Bal."), F1_CUTOFF(
                        20, "F1 Cutoff"), F1_RESON(21, "F1 Reson."), F1_FM(22,
                        "F1 FM"), F1_DRIVE(23, "F1 Drive"), F1_PAN(24, "F1 Pan"), F2_CUTOFF(
                        25, "F2 Cutoff"), F2_RESON(26, "F2 Reson."), F2_FM(27,
                        "F2 FM"), F2_DRIVE(28, "F2 Drive"), F2_PAN(29, "F2 Pan"), VOLUME(
                        30, "Volume"), LFO1_SPEED(31, "LFO1Speed"), LFO2_SPEED(
                        32, "LFO2Speed"), LFO3_SPEED(33, "LFO3Speed"), FE_ATTACK(
                        34, "FE Attack"), FE_DECAY(35, "FE Decay"), FE_SUSTAIN(
                        36, "FE Sustain"), FE_RELEASE(37, "FE Release"), AE_ATTACK(
                        38, "AE Attack"), AE_DECAY(39, "AE Decay"), AE_SUSTAIN(
                        40, "AE Sustain"), AE_RELEASE(41, "AE Release"), E3_ATTACK(
                        42, "E3 Attack"), E3_DECAY(43, "E3 Decay"), E3_SUSTAIN(
                        44, "E3 Sustain"), E3_RELEASE(45, "E3 Release"), E4_ATTACK(
                        46, "E4 Attack"), E4_DECAY(47, "E4 Decay"), E4_SUSTAIN(
                        48, "E4 Sustain"), E4_RELEASE(49, "E4 Release"), M1_AMOUNT(
                        50, "M1 Amount"), M2_AMOUNT(51, "M2 Amount"), M3_AMOUNT(
                        52, "M3 Amount"), M4_AMOUNT(53, "M4 Amount");

        public final int value;

        public final String name;
        private static ReverseEnumMap<ModulationDestinations> map = new ReverseEnumMap<ModulationDestinations>(
                        ModulationDestinations.class);

        private ModulationDestinations(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public ModulationDestinations convert(final int value) {
                return map.get(value);
        }
}
