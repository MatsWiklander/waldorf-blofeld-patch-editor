package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Shapes implements EnumConverter<Shapes> {
        SINE(0, "Sine"), TRIANGLE(1, "Triangle"), SQUARE(2, "Square"), SAW(3,
                        "Saw"), RANDOM(4, "Random"), S_AND_H(5, "S&H");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Shapes> map = new ReverseEnumMap<Shapes>(
                        Shapes.class);

        private Shapes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Shapes convert(final int value) {
                return map.get(value);
        }
}
