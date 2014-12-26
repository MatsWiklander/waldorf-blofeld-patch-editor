package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.patterns;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Accents implements EnumConverter<Accents> {
        SILENT(0, "silent"), MINUS96(1, "-96"), MINUS64(2, "-64"), MINUS32(3,
                        "-32"), ZERO(4, "0"), PLUS32(5, "32"), PLUS64(6, "64"), PLUS96(
                        7, "96");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Accents> map = new ReverseEnumMap<Accents>(
                        Accents.class);

        private Accents(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Accents convert(final int value) {
                return map.get(value);
        }
}
