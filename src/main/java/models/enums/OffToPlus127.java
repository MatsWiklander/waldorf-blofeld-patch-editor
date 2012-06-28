package main.java.models.enums;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum OffToPlus127 implements EnumConverter<OffToPlus127> {
        OFF(0, "OFF"), PLUS1(1, "1"), PLUS2(2, "2"), PLUS3(3, "3"), PLUS4(4,
                        "4"), PLUS5(5, "5"), PLUS6(6, "6"), PLUS7(7, "7"), PLUS8(
                        8, "8"), PLUS9(9, "9"), PLUS10(10, "10"), PLUS11(11,
                        "11"), PLUS12(12, "12"), PLUS13(13, "13"), PLUS14(14,
                        "14"), PLUS15(15, "15"), PLUS16(16, "16"), PLUS17(17,
                        "17"), PLUS18(18, "18"), PLUS19(19, "19"), PLUS20(20,
                        "20"), PLUS21(21, "21"), PLUS22(22, "22"), PLUS23(23,
                        "23"), PLUS24(24, "24"), PLUS25(25, "25"), PLUS26(26,
                        "26"), PLUS27(27, "27"), PLUS28(28, "28"), PLUS29(29,
                        "29"), PLUS30(30, "30"), PLUS31(31, "31"), PLUS32(32,
                        "32"), PLUS33(33, "33"), PLUS34(34, "34"), PLUS35(35,
                        "35"), PLUS36(36, "36"), PLUS37(37, "37"), PLUS38(38,
                        "38"), PLUS39(39, "39"), PLUS40(40, "40"), PLUS41(41,
                        "41"), PLUS42(42, "42"), PLUS43(43, "43"), PLUS44(44,
                        "44"), PLUS45(45, "45"), PLUS46(46, "46"), PLUS47(47,
                        "47"), PLUS48(48, "48"), PLUS49(49, "49"), PLUS50(50,
                        "50"), PLUS51(51, "51"), PLUS52(52, "52"), PLUS53(53,
                        "53"), PLUS54(54, "54"), PLUS55(55, "55"), PLUS56(56,
                        "56"), PLUS57(57, "57"), PLUS58(58, "58"), PLUS59(59,
                        "59"), PLUS60(60, "60"), PLUS61(61, "61"), PLUS62(62,
                        "62"), PLUS63(63, "63"), PLUS64(64, "64"), PLUS65(65,
                        "65"), PLUS66(66, "66"), PLUS67(67, "67"), PLUS68(68,
                        "68"), PLUS69(69, "69"), PLUS70(70, "70"), PLUS71(71,
                        "71"), PLUS72(72, "72"), PLUS73(73, "73"), PLUS74(74,
                        "74"), PLUS75(75, "75"), PLUS76(76, "76"), PLUS77(77,
                        "77"), PLUS78(78, "78"), PLUS79(79, "79"), PLUS80(80,
                        "80"), PLUS81(81, "81"), PLUS82(82, "82"), PLUS83(83,
                        "83"), PLUS84(84, "84"), PLUS85(85, "85"), PLUS86(86,
                        "86"), PLUS87(87, "87"), PLUS88(88, "88"), PLUS89(89,
                        "89"), PLUS90(90, "90"), PLUS91(91, "91"), PLUS92(92,
                        "92"), PLUS93(93, "93"), PLUS94(94, "94"), PLUS95(95,
                        "95"), PLUS96(96, "96"), PLUS97(97, "97"), PLUS98(98,
                        "98"), PLUS99(99, "99"), PLUS100(100, "100"), PLUS101(
                        101, "101"), PLUS102(102, "102"), PLUS103(103, "103"), PLUS104(
                        104, "104"), PLUS105(105, "105"), PLUS106(106, "106"), PLUS107(
                        107, "107"), PLUS108(108, "108"), PLUS109(109, "109"), PLUS110(
                        110, "110"), PLUS111(111, "111"), PLUS112(112, "112"), PLUS113(
                        113, "113"), PLUS114(114, "114"), PLUS115(115, "115"), PLUS116(
                        116, "116"), PLUS117(117, "117"), PLUS118(118, "118"), PLUS119(
                        119, "119"), PLUS120(120, "120"), PLUS121(121, "121"), PLUS122(
                        122, "122"), PLUS123(123, "123"), PLUS124(124, "124"), PLUS125(
                        125, "125"), PLUS126(126, "126"), PLUS127(127, "127");

        public final int value;

        public final String name;
        private static ReverseEnumMap<OffToPlus127> map = new ReverseEnumMap<OffToPlus127>(
                        OffToPlus127.class);

        private OffToPlus127(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public OffToPlus127 convert(final int value) {
                return map.get(value);
        }
}
