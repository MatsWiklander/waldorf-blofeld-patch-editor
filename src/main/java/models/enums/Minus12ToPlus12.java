package main.java.models.enums;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum Minus12ToPlus12 implements EnumConverter<Minus12ToPlus12> {
        MINUS12(52, "-12"), MINUS11(53, "-11"), MINUS10(54, "-10"), MINUS9(55,
                        "-9"), MINUS8(56, "-8"), MINUS7(57, "-7"), MINUS6(58,
                        "-6"), MINUS5(59, "-5"), MINUS4(60, "-4"), MINUS3(61,
                        "-3"), MINUS2(62, "-2"), MINUS1(63, "-1"), ZERO(64, "0"), PLUS1(
                        65, "1"), PLUS2(66, "2"), PLUS3(67, "3"), PLUS4(68, "4"), PLUS5(
                        69, "5"), PLUS6(70, "6"), PLUS7(71, "7"), PLUS8(72, "8"), PLUS9(
                        73, "9"), PLUS10(74, "10"), PLUS11(75, "11"), PLUS12(
                        76, "12");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Minus12ToPlus12> map = new ReverseEnumMap<Minus12ToPlus12>(
                        Minus12ToPlus12.class);

        private Minus12ToPlus12(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Minus12ToPlus12 convert(final int value) {
                // Find closest match
                int bound = 0;
                Minus12ToPlus12 found = null;
                while (found == null) {
                        found = map.get(value + bound);
                        if (found != null) {
                                break;
                        }

                        found = map.get(value - bound);
                        if (found != null) {
                                break;
                        }

                        bound++;
                }

                return found;
        }
}
