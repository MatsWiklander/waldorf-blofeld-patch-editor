package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum OneTo10 implements EnumConverter<OneTo10> {
        _1(0, "1"), _2(1, "2"), _3(2, "3"), _4(3, "4"), _5(4, "5"), _6(5, "6"), _7(
                        6, "7"), _8(7, "8"), _9(8, "9"), _10(9, "10");

        public final int value;

        public final String name;
        private static ReverseEnumMap<OneTo10> map = new ReverseEnumMap<OneTo10>(
                        OneTo10.class);

        private OneTo10(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public OneTo10 convert(final int value) {
                return map.get(value);
        }
}
