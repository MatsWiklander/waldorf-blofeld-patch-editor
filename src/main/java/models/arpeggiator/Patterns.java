package main.java.models.arpeggiator;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum Patterns implements EnumConverter<Patterns> {
        OFF(0, "off"), PATTERN1(1, "1"), PATTERN2(2, "2"), PATTERN3(3, "3"), PATTERN4(
                        4, "4"), PATTERN5(5, "5"), PATTERN6(6, "6"), PATTERN7(
                        7, "7"), PATTERN8(8, "8"), PATTERN9(9, "9"), PATTERN10(
                        10, "10"), PATTERN11(11, "11"), PATTERN12(12, "12"), PATTERN13(
                        13, "13"), PATTERN14(14, "14"), PATTERN15(15, "15");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Patterns> map = new ReverseEnumMap<Patterns>(
                        Patterns.class);

        private Patterns(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Patterns convert(final int value) {
                return map.get(value);
        }
}
