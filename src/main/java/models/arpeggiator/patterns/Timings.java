package main.java.models.arpeggiator.patterns;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum Timings implements EnumConverter<Timings> {
        RANDOM(0, "random"), MINUS3(1, "-3"), MINUS2(2, "-2"), MINUS1(3, "-1"), ZERO(
                        4, "0"), PLUS1(5, "1"), PLUS2(6, "2"), PLUS3(7, "3");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Timings> map = new ReverseEnumMap<Timings>(
                        Timings.class);

        private Timings(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Timings convert(final int value) {
                return map.get(value);
        }
}
