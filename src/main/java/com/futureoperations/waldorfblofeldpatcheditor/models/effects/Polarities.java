package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Polarities implements EnumConverter<Polarities> {
        POSITIVE(0, "positive"), NEGATIVE(1, "negative");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Polarities> map = new ReverseEnumMap<Polarities>(
                        Polarities.class);

        private Polarities(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Polarities convert(final int value) {
                return map.get(value);
        }
}
