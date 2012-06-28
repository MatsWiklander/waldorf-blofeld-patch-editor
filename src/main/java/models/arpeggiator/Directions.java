package main.java.models.arpeggiator;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum Directions implements EnumConverter<Directions> {
        UP(0, "Up"), DOWN(1, "Down"), ALT_UP(2, "Alt Up"), ALT_DOWN(3,
                        "Alt Down");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Directions> map = new ReverseEnumMap<Directions>(
                        Directions.class);

        private Directions(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Directions convert(final int value) {
                return map.get(value);
        }
}
