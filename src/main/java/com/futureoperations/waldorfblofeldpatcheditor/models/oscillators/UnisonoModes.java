package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum UnisonoModes implements EnumConverter<UnisonoModes> {
        OFF(0, "off"), DUAL(1, "dual"), _3(2, "3"), _4(3, "4"), _5(4, "5"), _6(
                        5, "6");

        public final int value;
        public final String name;

        private static ReverseEnumMap<UnisonoModes> map = new ReverseEnumMap<UnisonoModes>(
                        UnisonoModes.class);

        private UnisonoModes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public UnisonoModes convert(final int value) {
                return map.get(value);
        }
}
