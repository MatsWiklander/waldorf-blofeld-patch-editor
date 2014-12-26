package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum OffOn implements EnumConverter<OffOn> {
        OFF(0, "off"), ON(1, "on");

        public final int value;

        public final String name;
        private static ReverseEnumMap<OffOn> map = new ReverseEnumMap<OffOn>(
                        OffOn.class);

        private OffOn(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public OffOn convert(final int value) {
                return map.get(value);
        }

}
