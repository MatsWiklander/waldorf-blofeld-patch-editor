package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Clocks implements EnumConverter<Clocks> {
        _1280_BARS_1(0, "1280 bars"), _1280_BARS_2(1, "1280 bars"), _1152_BARS_1(
                        2, "1152 bars"), _1152_BARS_2(3, "1152 bars"), _1024_BARS_1(
                        4, "1024 bars"), _1024_BARS_2(5, "1024 bars"), _896_BARS_1(
                        6, "896 bars"), _896_BARS_2(7, "896 bars"), _768_BARS_1(
                        8, "768 bars"), _768_BARS_2(9, "768 bars"), _640_BARS_1(
                        10, "640 bars"), _640_BARS_2(11, "640 bars"), _576_BARS_1(
                        12, "576 bars"), _576_BARS_2(13, "576 bars"), _512_BARS_1(
                        14, "512 bars"), _512_BARS_2(15, "512 bars"), _448_BARS_1(
                        16, "448 bars"), _448_BARS_2(17, "448 bars"), _384_BARS_1(
                        18, "384 bars"), _384_BARS_2(19, "384 bars"), _320_BARS_1(
                        20, "320 bars"), _320_BARS_2(21, "320 bars"), _288_BARS_1(
                        22, "288 bars"), _288_BARS_2(23, "288 bars"), _256_BARS_1(
                        24, "256 bars"), _256_BARS_2(25, "256 bars"), _224_BARS_1(
                        26, "224 bars"), _224_BARS_2(27, "224 bars"), _192_BARS_1(
                        28, "192 bars"), _192_BARS_2(29, "192 bars"), _160_BARS_1(
                        30, "160 bars"), _160_BARS_2(31, "160 bars"), _144_BARS_1(
                        32, "144 bars"), _144_BARS_2(33, "144 bars"), _128_BARS_1(
                        34, "128 bars"), _128_BARS_2(35, "128 bars"), _112_BARS_1(
                        36, "112 bars"), _112_BARS_2(37, "112 bars"), _96_BARS_1(
                        38, "96 bars"), _96_BARS_2(39, "96 bars"), _80_BARS_1(
                        40, "80 bars"), _80_BARS_2(41, "80 bars"), _72_BARS_1(
                        42, "72 bars"), _72_BARS_2(43, "72 bars"), _64_BARS_1(
                        44, "64 bars"), _64_BARS_2(45, "64 bars"), _56_BARS_1(
                        46, "56 bars"), _56_BARS_2(47, "56 bars"), _48_BARS_1(
                        48, "48 bars"), _48_BARS_2(49, "48 bars"), _40_BARS_1(
                        50, "40 bars"), _40_BARS_2(51, "40 bars"), _36_BARS_1(
                        52, "36 bars"), _36_BARS_2(53, "36 bars"), _32_BARS_1(
                        54, "32 bars"), _32_BARS_2(55, "32 bars"), _28_BARS_1(
                        56, "28 bars"), _28_BARS_2(57, "28 bars"), _24_BARS_1(
                        58, "24 bars"), _24_BARS_2(59, "24 bars"), _20_BARS_1(
                        60, "20 bars"), _20_BARS_2(61, "20 bars"), _18_BARS_1(
                        62, "18 bars"), _18_BARS_2(63, "18 bars"), _16_BARS_1(
                        64, "16 bars"), _16_BARS_2(65, "16 bars"), _14_BARS_1(
                        66, "14 bars"), _14_BARS_2(67, "14 bars"), _12_BARS_1(
                        68, "12 bars"), _12_BARS_2(69, "12 bars"), _10_BARS_1(
                        70, "10 bars"), _10_BARS_2(71, "10 bars"), _9_BARS_1(
                        72, "9 bars"), _9_BARS_2(73, "9 bars"), _8_BARS_1(74,
                        "8 bars"), _8_BARS_2(75, "8 bars"), _7_BARS_1(76,
                        "7 bars"), _7_BARS_2(77, "7 bars"), _6_BARS_1(78,
                        "6 bars"), _6_BARS_2(79, "6 bars"), _5_BARS_1(80,
                        "5 bars"), _5_BARS_2(81, "5 bars"), _4_BARS_1(82,
                        "4 bars"), _4_BARS_2(83, "4 bars"), _3_5_BARS_1(84,
                        "3.5 bars"), _3_5_BARS_2(85, "3.5 bars"), _3_BARS_1(86,
                        "3 bars"), _3_BARS_2(87, "3 bars"), _2_5_BARS_1(88,
                        "2.5 bars"), _2_5_BARS_2(89, "2.5 bars"), _2_BARS_1(90,
                        "2 bars"), _2_BARS_2(91, "2 bars"), _1_5_BARS_1(92,
                        "1.5 bars"), _1_5_BARS_2(93, "1.5 bars"), _1_BARS_1(94,
                        "1 bar"), _1_BARS_2(95, "1 bar"), _1_2DOT_1(96, "1/2."), _1_2DOT_2(
                        97, "1/2."), _1_1T_1(98, "1/1T"), _1_1T_2(99, "1/1T"), _1_2_1(
                        100, "1/2"), _1_2_2(101, "1/2"), _1_4DOT_1(102, "1/4."), _1_4DOT_2(
                        103, "1/4."), _1_2T_1(104, "1/2T"), _1_2T_2(105, "1/2T"), _1_4_1(
                        106, "1/4"), _1_4_2(107, "1/4"), _1_8DOT_1(108, "1/8."), _1_8DOT_2(
                        109, "1/8."), _1_4T_1(110, "1/4T"), _1_4T_2(111, "1/4T"), _1_8_1(
                        112, "1/8"), _1_8_2(113, "1/8"), _1_16DOT_1(114,
                        "1/16."), _1_16DOT_2(115, "1/16."), _1_8T_1(116, "1/8T"), _1_8T_2(
                        117, "1/8T"), _1_16_1(118, "1/16"), _1_16_2(119, "1/16"), _1_32DOT_1(
                        120, "1/32."), _1_32DOT_2(121, "1/32."), _1_16T_1(122,
                        "1/16T"), _1_16T_2(123, "1/16T"), _1_32_1(124, "1/32"), _1_32_2(
                        125, "1/32"), _1_48_1(126, "1/48"), _1_48_2(127, "1/48");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Clocks> map = new ReverseEnumMap<Clocks>(
                        Clocks.class);

        private Clocks(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Clocks convert(final int value) {
                return map.get(value);
        }
}
