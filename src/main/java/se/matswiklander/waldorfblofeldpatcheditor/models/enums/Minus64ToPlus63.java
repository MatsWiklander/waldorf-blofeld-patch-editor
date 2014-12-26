package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Minus64ToPlus63 implements EnumConverter<Minus64ToPlus63> {
        MINUS64(0, "-64"), MINUS63(1, "-63"), MINUS62(2, "-62"), MINUS61(3,
                        "-61"), MINUS60(4, "-60"), MINUS59(5, "-59"), MINUS58(
                        6, "-58"), MINUS57(7, "-57"), MINUS56(8, "-56"), MINUS55(
                        9, "-55"), MINUS54(10, "-54"), MINUS53(11, "-53"), MINUS52(
                        12, "-52"), MINUS51(13, "-51"), MINUS50(14, "-50"), MINUS49(
                        15, "-49"), MINUS48(16, "-48"), MINUS47(17, "-47"), MINUS46(
                        18, "-46"), MINUS45(19, "-45"), MINUS44(20, "-44"), MINUS43(
                        21, "-43"), MINUS42(22, "-42"), MINUS41(23, "-41"), MINUS40(
                        24, "-40"), MINUS39(25, "-39"), MINUS38(26, "-38"), MINUS37(
                        27, "-37"), MINUS36(28, "-36"), MINUS35(29, "-35"), MINUS34(
                        30, "-34"), MINUS33(31, "-33"), MINUS32(32, "-32"), MINUS31(
                        33, "-31"), MINUS30(34, "-30"), MINUS29(35, "-29"), MINUS28(
                        36, "-28"), MINUS27(37, "-27"), MINUS26(38, "-26"), MINUS25(
                        39, "-25"), MINUS24(40, "-24"), MINUS23(41, "-23"), MINUS22(
                        42, "-22"), MINUS21(43, "-21"), MINUS20(44, "-20"), MINUS19(
                        45, "-19"), MINUS18(46, "-18"), MINUS17(47, "-17"), MINUS16(
                        48, "-16"), MINUS15(49, "-15"), MINUS14(50, "-14"), MINUS13(
                        51, "-13"), MINUS12(52, "-12"), MINUS11(53, "-11"), MINUS10(
                        54, "-10"), MINUS9(55, "-9"), MINUS8(56, "-8"), MINUS7(
                        57, "-7"), MINUS6(58, "-6"), MINUS5(59, "-5"), MINUS4(
                        60, "-4"), MINUS3(61, "-3"), MINUS2(62, "-2"), MINUS1(
                        63, "-1"), ZERO(64, "0"), PLUS1(65, "1"), PLUS2(66, "2"), PLUS3(
                        67, "3"), PLUS4(68, "4"), PLUS5(69, "5"), PLUS6(70, "6"), PLUS7(
                        71, "7"), PLUS8(72, "8"), PLUS9(73, "9"), PLUS10(74,
                        "10"), PLUS11(75, "11"), PLUS12(76, "12"), PLUS13(77,
                        "13"), PLUS14(78, "14"), PLUS15(79, "15"), PLUS16(80,
                        "16"), PLUS17(81, "17"), PLUS18(82, "18"), PLUS19(83,
                        "19"), PLUS20(84, "20"), PLUS21(85, "21"), PLUS22(86,
                        "22"), PLUS23(87, "23"), PLUS24(88, "24"), PLUS25(89,
                        "25"), PLUS26(90, "26"), PLUS27(91, "27"), PLUS28(92,
                        "28"), PLUS29(93, "29"), PLUS30(94, "30"), PLUS31(95,
                        "31"), PLUS32(96, "32"), PLUS33(97, "33"), PLUS34(98,
                        "34"), PLUS35(99, "35"), PLUS36(100, "36"), PLUS37(101,
                        "37"), PLUS38(102, "38"), PLUS39(103, "39"), PLUS40(
                        104, "40"), PLUS41(105, "41"), PLUS42(106, "42"), PLUS43(
                        107, "43"), PLUS44(108, "44"), PLUS45(109, "45"), PLUS46(
                        110, "46"), PLUS47(111, "47"), PLUS48(112, "48"), PLUS49(
                        113, "49"), PLUS50(114, "50"), PLUS51(115, "51"), PLUS52(
                        116, "52"), PLUS53(117, "53"), PLUS54(118, "54"), PLUS55(
                        119, "55"), PLUS56(120, "56"), PLUS57(121, "57"), PLUS58(
                        122, "58"), PLUS59(123, "59"), PLUS60(124, "60"), PLUS61(
                        125, "61"), PLUS62(126, "62"), PLUS63(127, "63");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Minus64ToPlus63> map = new ReverseEnumMap<Minus64ToPlus63>(
                        Minus64ToPlus63.class);

        private Minus64ToPlus63(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Minus64ToPlus63 convert(final int value) {
                return map.get(value);
        }
}
