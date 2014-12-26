package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.filters;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum ParallelSerial implements EnumConverter<ParallelSerial> {
        PARALLEL(0, "parallel"), SERIAL(1, "serial");

        public final int value;
        public final String name;

        private static ReverseEnumMap<ParallelSerial> map = new ReverseEnumMap<ParallelSerial>(
                        ParallelSerial.class);

        private ParallelSerial(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public ParallelSerial convert(final int value) {
                return map.get(value);
        }
}
