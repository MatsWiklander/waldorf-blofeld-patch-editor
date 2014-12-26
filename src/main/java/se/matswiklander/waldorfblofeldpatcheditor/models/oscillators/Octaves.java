package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.oscillators;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Octaves implements EnumConverter<Octaves> {
        FOOT128(16, "128'"), FOOT64(28, "64'"), FOOT32(40, "32'"), FOOT16(52,
                        "16'"), FOOT8(64, "8'"), FOOT4(76, "4'"), FOOT2(88,
                        "2'"), FOOT1(100, "1'"), HALFFOOT(112, "½'");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Octaves> map = new ReverseEnumMap<Octaves>(
                        Octaves.class);

        private Octaves(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Octaves convert(final int value) {
                // Find closest match
                int bound = 0;
                Octaves found = null;
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
