package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Banks implements EnumConverter<Banks> {
        A(0, "A"), B(1, "B"), C(2, "C"), D(3, "D"), E(4, "E"), F(5, "F"), G(6,
                        "G"), H(7, "H");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Banks> map = new ReverseEnumMap<Banks>(
                        Banks.class);

        private Banks(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Banks convert(final int value) {
                return map.get(value);
        }
}
