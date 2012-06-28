package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum ClkDelayLengths implements EnumConverter<ClkDelayLengths> {
        _1_96(0, "1/96"), _1_48(1, "1/48"), _1_32(2, "1/32"), _1_16T(3, "1/16T"), _1_32DOT(
                        4, "1/32."), _1_16(5, "1/16"), _1_8T(6, "1/8T"), _1_16DOT(
                        7, "1/16."), _1_8(8, "1/8"), _1_4T(9, "1/4T"), _1_8DOT(
                        10, "1/8."), _1_4(11, "1/4"), _1_2T(12, "1/2T"), _1_4DOT(
                        13, "1/4."), _1_2(14, "1/2"), _1_1T(15, "1/1T"), _1_2DOT(
                        16, "1/2."), _1_BAR(17, "1 bar"), _1_5_BARS(18,
                        "1.5 bars"), _2_BARS(19, "2 bars"), _2_5_BARS(20,
                        "2.5 bars"), _3_BARS(21, "3 bars"), _3_5_BARS(22,
                        "3.5 bars"), _4_BARS(23, "4 bars"), _5_BARS(24,
                        "5 bars"), _6_BARS(25, "6 bars"), _7_BARS(26, "7 bars"), _8_BARS(
                        27, "8 bars"), _9_BARS(28, "9 bars"), _10_BARS(29,
                        "10 bars");

        public final int value;

        public final String name;
        private static ReverseEnumMap<ClkDelayLengths> map = new ReverseEnumMap<ClkDelayLengths>(
                        ClkDelayLengths.class);

        private ClkDelayLengths(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public ClkDelayLengths convert(final int value) {
                return map.get(value);
        }
}
