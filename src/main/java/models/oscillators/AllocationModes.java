package main.java.models.oscillators;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum AllocationModes implements EnumConverter<AllocationModes> {
        POLY(0, "Poly"), MONO(1, "Mono");

        public final int value;

        public final String name;
        private static ReverseEnumMap<AllocationModes> map = new ReverseEnumMap<AllocationModes>(
                        AllocationModes.class);

        private AllocationModes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public AllocationModes convert(final int value) {
                return map.get(value);
        }
}
