package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Triggers implements EnumConverter<Triggers> {
        NORMAL(0, "normal"), SINGLE(1, "single");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Triggers> map = new ReverseEnumMap<Triggers>(
                        Triggers.class);

        private Triggers(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Triggers convert(final int value) {
                return map.get(value);
        }
}
