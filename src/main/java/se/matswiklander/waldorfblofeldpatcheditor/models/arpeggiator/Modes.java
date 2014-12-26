package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Modes implements EnumConverter<Modes> {
        OFF(0, "off"), ON(1, "on"), ONE_SHOT(2, "One Shot"), HOLD(3, "Hold");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Modes> map = new ReverseEnumMap<Modes>(
                        Modes.class);

        private Modes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Modes convert(final int value) {
                return map.get(value);
        }
}
