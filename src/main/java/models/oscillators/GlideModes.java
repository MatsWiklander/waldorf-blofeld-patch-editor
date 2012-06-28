package main.java.models.oscillators;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum GlideModes implements EnumConverter<GlideModes> {
        PORTAMENTO(0, "Portamento"), FINGERED_P(1, "fingered P"), GLISSANDO(2,
                        "Glissando"), FINGERED_G(3, "fingered G");

        public final int value;

        public final String name;
        private static ReverseEnumMap<GlideModes> map = new ReverseEnumMap<GlideModes>(
                        GlideModes.class);

        private GlideModes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public GlideModes convert(final int value) {
                return map.get(value);
        }
}
