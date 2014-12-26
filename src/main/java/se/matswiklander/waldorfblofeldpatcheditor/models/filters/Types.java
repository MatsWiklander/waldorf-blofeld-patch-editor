package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.filters;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Types implements EnumConverter<Types> {
        BYPASS(0, "Bypass"), LP_24DB(1, "LP 24dB"), LP_12DB(2, "LP 12dB"), BP_24DB(
                        3, "BP 24dB"), BP_12DB(4, "BP 12dB"), HP_24DB(5,
                        "HP 24dB"), HP_12DB(6, "HP 12dB"), NOTCH_24DB(7,
                        "Notch 24dB"), NOTCH_12DB(8, "Notch 12dB"), COMB_PLUS(
                        9, "Comb+"), COMB_MINUS(10, "Comb-"), PPG_LP(11,
                        "PPG LP");

        public final int value;
        public final String name;

        private static ReverseEnumMap<Types> map = new ReverseEnumMap<Types>(
                        Types.class);

        private Types(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Types convert(final int value) {
                return map.get(value);
        }
}
