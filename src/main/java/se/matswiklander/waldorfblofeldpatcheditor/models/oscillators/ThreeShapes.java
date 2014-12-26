package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.oscillators;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum ThreeShapes implements EnumConverter<ThreeShapes> {
        OFF(0, "off"), PULSE(1, "Pulse"), SAW(2, "Saw"), TRIANGLE(3, "Triangle"), SINE(
                        4, "Sine");

        public final int value;

        public final String name;
        private static ReverseEnumMap<ThreeShapes> map = new ReverseEnumMap<ThreeShapes>(
                        ThreeShapes.class);

        private ThreeShapes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public ThreeShapes convert(final int value) {
                return map.get(value);
        }

}
