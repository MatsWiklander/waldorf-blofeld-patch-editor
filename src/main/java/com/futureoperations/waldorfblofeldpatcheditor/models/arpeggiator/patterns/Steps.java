package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Steps implements EnumConverter<Steps> {
        NORMAL(0, "normal"), PAUSE(1, "pause"), PREVIOUS(2, "previous"), FIRST(
                        3, "first"), LAST(4, "last"), FIRST_PLUS_LAST(5,
                        "first+last"), CHORD(6, "chord"), RANDOM(7, "random");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Steps> map = new ReverseEnumMap<Steps>(
                        Steps.class);

        private Steps(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Steps convert(final int value) {
                return map.get(value);
        }
}
