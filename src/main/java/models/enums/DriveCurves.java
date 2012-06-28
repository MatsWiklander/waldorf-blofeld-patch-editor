package main.java.models.enums;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum DriveCurves implements EnumConverter<DriveCurves> {
        CLIPPING(0, "Clipping"), TUBE(1, "Tube"), HARD(2, "Hard"), MEDIUM(3,
                        "Medium"), SOFT(4, "Soft"), PICKUP_1(5, "Pickup 1"), PICKUP_2(
                        6, "Pickup 2"), RECTIFIER(7, "Rectifier"), SQUARE(8,
                        "Square"), BINARY(9, "Binary"), OVERFLOW(10, "Overflow"), SINE_SHAPER(
                        11, "Sine Shaper"), OSC_1_MOD(12, "Osc 1 Mod");

        public final int value;

        public final String name;
        private static ReverseEnumMap<DriveCurves> map = new ReverseEnumMap<DriveCurves>(
                        DriveCurves.class);

        private DriveCurves(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public DriveCurves convert(final int value) {
                return map.get(value);
        }
}
