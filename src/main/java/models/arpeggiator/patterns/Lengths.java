package main.java.models.arpeggiator.patterns;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum Lengths implements EnumConverter<Lengths> {
        LEGATO(0, "legato"), MINUS3(1, "-3"), MINUS2(2, "-2"), MINUS1(3, "-1"), ZERO(
                        4, "0"), PLUS1(5, "1"), PLUS2(6, "2"), PLUS3(7, "3");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Lengths> map = new ReverseEnumMap<Lengths>(
                        Lengths.class);

        private Lengths(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Lengths convert(final int value) {
                return map.get(value);
        }
}
