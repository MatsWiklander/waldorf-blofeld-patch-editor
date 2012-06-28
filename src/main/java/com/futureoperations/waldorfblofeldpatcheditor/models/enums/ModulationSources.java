package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum ModulationSources implements EnumConverter<ModulationSources> {
        OFF(0, "off"), LFO_1(1, "LFO 1"), LFO_1_MW(2, "LFO1*MW"), LFO_2(3,
                        "LFO 2"), LFO_2_PRESS(4, "LFO2*Press"), LFO_3(5,
                        "LFO 3"), FILTER_ENV(6, "FilterEnv"), AMP_ENV(7,
                        "AmpEnv"), ENV_3(8, "Env3"), ENV_4(9, "Env4"), KEYTRACK(
                        10, "Keytrack"), VELOCITY(11, "Velocity"), REL_VELO(12,
                        "Rel. Velo"), PRESSURE(13, "Pressure"), POLY_PRESS(14,
                        "Poly Press"), PITCH_BEND(15, "Pitch Bend"), MOD_WHEEL(
                        16, "Mod Wheel"), SUSTAIN(17, "Sustain"), FOOT_CTRL(18,
                        "Foot Ctrl"), BREATH_CTRL(19, "BreathCtrl"), CONTROL_W(
                        20, "Control W"), CONTROL_X(21, "Control X"), CONTROL_Y(
                        22, "Control Y"), CONTROL_Z(23, "Control Z"), UNISONO_V(
                        24, "Unisono V."), MODIFIER_1(25, "Modifier 1"), MODIFIER_2(
                        26, "Modifier 2"), MODIFIER_3(27, "Modifier 3"), MODIFIER_4(
                        28, "Modifier 4"), MINIMUM(29, "minimum"), MAXIMUM(30,
                        "MAXIMUM");

        public final int value;

        public final String name;
        private static ReverseEnumMap<ModulationSources> map = new ReverseEnumMap<ModulationSources>(
                        ModulationSources.class);

        private ModulationSources(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public ModulationSources convert(final int value) {
                return map.get(value);
        }
}
