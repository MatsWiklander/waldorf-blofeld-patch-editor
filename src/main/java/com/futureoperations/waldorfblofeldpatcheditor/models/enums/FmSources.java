package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum FmSources implements EnumConverter<FmSources> {
        OFF(0, "off"), OSC_1(1, "Osc 1"), OSC_2(2, "Osc 2"), OSC_3(3, "Osc 3"), NOISE(
                        4, "Noise"), LFO_1(5, "LFO 1"), LFO_2(6, "LFO 2"), LFO_3(
                        7, "LFO 3"), FILTER_ENV(8, "FilterEnv"), AMP_ENV(9,
                        "AmpEnv"), ENV_3(10, "Env3"), ENV_4(11, "Env4");

        public final int value;

        public final String name;
        private static ReverseEnumMap<FmSources> map = new ReverseEnumMap<FmSources>(
                        FmSources.class);

        private FmSources(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public FmSources convert(final int value) {
                return map.get(value);
        }
}
