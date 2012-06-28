package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Operators implements EnumConverter<Operators> {
        PLUS(0, "+"), MINUS(1, "-"), MULTIPLY(2, "*"), AND(3, "AND"), OR(4,
                        "OR"), XOR(5, "XOR"), MAX(6, "MAX"), MIN(7, "min");

        public final int value;
        public final String name;

        private static ReverseEnumMap<Operators> map = new ReverseEnumMap<Operators>(
                        Operators.class);

        private Operators(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Operators convert(final int value) {
                return map.get(value);
        }
}
