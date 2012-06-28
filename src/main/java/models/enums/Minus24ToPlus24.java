package main.java.models.enums;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum Minus24ToPlus24 implements EnumConverter<Minus24ToPlus24> {
        MINUS24(40, "-24"), MINUS23(41, "-23"), MINUS22(42, "-22"), MINUS21(43,
                        "-21"), MINUS20(44, "-20"), MINUS19(45, "-19"), MINUS18(
                        46, "-18"), MINUS17(47, "-17"), MINUS16(48, "-16"), MINUS15(
                        49, "-15"), MINUS14(50, "-14"), MINUS13(51, "-13"), MINUS12(
                        52, "-12"), MINUS11(53, "-11"), MINUS10(54, "-10"), MINUS9(
                        55, "-9"), MINUS8(56, "-8"), MINUS7(57, "-7"), MINUS6(
                        58, "-6"), MINUS5(59, "-5"), MINUS4(60, "-4"), MINUS3(
                        61, "-3"), MINUS2(62, "-2"), MINUS1(63, "-1"), ZERO(64,
                        "0"), PLUS1(65, "1"), PLUS2(66, "2"), PLUS3(67, "3"), PLUS4(
                        68, "4"), PLUS5(69, "5"), PLUS6(70, "6"), PLUS7(71, "7"), PLUS8(
                        72, "8"), PLUS9(73, "9"), PLUS10(74, "10"), PLUS11(75,
                        "11"), PLUS12(76, "12"), PLUS13(77, "13"), PLUS14(78,
                        "14"), PLUS15(79, "15"), PLUS16(80, "16"), PLUS17(81,
                        "17"), PLUS18(82, "18"), PLUS19(83, "19"), PLUS20(84,
                        "20"), PLUS21(85, "21"), PLUS22(86, "22"), PLUS23(87,
                        "23"), PLUS24(88, "24");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Minus24ToPlus24> map = new ReverseEnumMap<Minus24ToPlus24>(
                        Minus24ToPlus24.class);

        private Minus24ToPlus24(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Minus24ToPlus24 convert(final int value) {
                // Find closest match
                int bound = 0;
                Minus24ToPlus24 found = null;
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
