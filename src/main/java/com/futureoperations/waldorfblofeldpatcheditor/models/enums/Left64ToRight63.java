package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Left64ToRight63 implements EnumConverter<Left64ToRight63> {
        LEFT_64(0, "Left 64"), LEFT_63(1, "Left 63"), LEFT_62(2, "Left 62"), LEFT_61(
                        3, "Left 61"), LEFT_60(4, "Left 60"), LEFT_59(5,
                        "Left 59"), LEFT_58(6, "Left 58"), LEFT_57(7, "Left 57"), LEFT_56(
                        8, "Left 56"), LEFT_55(9, "Left 55"), LEFT_54(10,
                        "Left 54"), LEFT_53(11, "Left 53"), LEFT_52(12,
                        "Left 52"), LEFT_51(13, "Left 51"), LEFT_50(14,
                        "Left 50"), LEFT_49(15, "Left 49"), LEFT_48(16,
                        "Left 48"), LEFT_47(17, "Left 47"), LEFT_46(18,
                        "Left 46"), LEFT_45(19, "Left 45"), LEFT_44(20,
                        "Left 44"), LEFT_43(21, "Left 43"), LEFT_42(22,
                        "Left 42"), LEFT_41(23, "Left 41"), LEFT_40(24,
                        "Left 40"), LEFT_39(25, "Left 39"), LEFT_38(26,
                        "Left 38"), LEFT_37(27, "Left 37"), LEFT_36(28,
                        "Left 36"), LEFT_35(29, "Left 35"), LEFT_34(30,
                        "Left 34"), LEFT_33(31, "Left 33"), LEFT_32(32,
                        "Left 32"), LEFT_31(33, "Left 31"), LEFT_30(34,
                        "Left 30"), LEFT_29(35, "Left 29"), LEFT_28(36,
                        "Left 28"), LEFT_27(37, "Left 27"), LEFT_26(38,
                        "Left 26"), LEFT_25(39, "Left 25"), LEFT_24(40,
                        "Left 24"), LEFT_23(41, "Left 23"), LEFT_22(42,
                        "Left 22"), LEFT_21(43, "Left 21"), LEFT_20(44,
                        "Left 20"), LEFT_19(45, "Left 19"), LEFT_18(46,
                        "Left 18"), LEFT_17(47, "Left 17"), LEFT_16(48,
                        "Left 16"), LEFT_15(49, "Left 15"), LEFT_14(50,
                        "Left 14"), LEFT_13(51, "Left 13"), LEFT_12(52,
                        "Left 12"), LEFT_11(53, "Left 11"), LEFT_10(54,
                        "Left 10"), LEFT_9(55, "Left 9"), LEFT_8(56, "Left 8"), LEFT_7(
                        57, "Left 7"), LEFT_6(58, "Left 6"), LEFT_5(59,
                        "Left 5"), LEFT_4(60, "Left 4"), LEFT_3(61, "Left 3"), LEFT_2(
                        62, "Left 2"), LEFT_1(63, "Left 1"), MIDDLE(64,
                        "middle"), RIGHT_1(65, "Right 1"), RIGHT_2(66,
                        "Right 2"), RIGHT_3(67, "Right 3"), RIGHT_4(68,
                        "Right 4"), RIGHT_5(69, "Right 5"), RIGHT_6(70,
                        "Right 6"), RIGHT_7(71, "Right 7"), RIGHT_8(72,
                        "Right 8"), RIGHT_9(73, "Right 9"), RIGHT_10(74,
                        "Right 10"), RIGHT_11(75, "Right 11"), RIGHT_12(76,
                        "Right 12"), RIGHT_13(77, "Right 13"), RIGHT_14(78,
                        "Right 14"), RIGHT_15(79, "Right 15"), RIGHT_16(80,
                        "Right 16"), RIGHT_17(81, "Right 17"), RIGHT_18(82,
                        "Right 18"), RIGHT_19(83, "Right 19"), RIGHT_20(84,
                        "Right 20"), RIGHT_21(85, "Right 21"), RIGHT_22(86,
                        "Right 22"), RIGHT_23(87, "Right 23"), RIGHT_24(88,
                        "Right 24"), RIGHT_25(89, "Right 25"), RIGHT_26(90,
                        "Right 26"), RIGHT_27(91, "Right 27"), RIGHT_28(92,
                        "Right 28"), RIGHT_29(93, "Right 29"), RIGHT_30(94,
                        "Right 30"), RIGHT_31(95, "Right 31"), RIGHT_32(96,
                        "Right 32"), RIGHT_33(97, "Right 33"), RIGHT_34(98,
                        "Right 34"), RIGHT_35(99, "Right 35"), RIGHT_36(100,
                        "Right 36"), RIGHT_37(101, "Right 37"), RIGHT_38(102,
                        "Right 38"), RIGHT_39(103, "Right 39"), RIGHT_40(104,
                        "Right 40"), RIGHT_41(105, "Right 41"), RIGHT_42(106,
                        "Right 42"), RIGHT_43(107, "Right 43"), RIGHT_44(108,
                        "Right 44"), RIGHT_45(109, "Right 45"), RIGHT_46(110,
                        "Right 46"), RIGHT_47(111, "Right 47"), RIGHT_48(112,
                        "Right 48"), RIGHT_49(113, "Right 49"), RIGHT_50(114,
                        "Right 50"), RIGHT_51(115, "Right 51"), RIGHT_52(116,
                        "Right 52"), RIGHT_53(117, "Right 53"), RIGHT_54(118,
                        "Right 54"), RIGHT_55(119, "Right 55"), RIGHT_56(120,
                        "Right 56"), RIGHT_57(121, "Right 57"), RIGHT_58(122,
                        "Right 58"), RIGHT_59(123, "Right 59"), RIGHT_60(124,
                        "Right 60"), RIGHT_61(125, "Right 61"), RIGHT_62(126,
                        "Right 62"), RIGHT_63(127, "Right 63");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Left64ToRight63> map = new ReverseEnumMap<Left64ToRight63>(
                        Left64ToRight63.class);

        private Left64ToRight63(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Left64ToRight63 convert(final int value) {
                return map.get(value);
        }
}
