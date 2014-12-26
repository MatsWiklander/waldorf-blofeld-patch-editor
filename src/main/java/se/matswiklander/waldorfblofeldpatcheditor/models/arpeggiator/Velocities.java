package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Velocities implements EnumConverter<Velocities> {
        EACH_NOTE(0, "Each Note"), FIRST_NOTE(1, "First Note"), LAST_NOTE(2,
                        "Last Note"), FIX_32(3, "fix 32"), FIX_64(4, "fix 64"), FIX_100(
                        5, "fix 100"), FIX_127(6, "fix 127");

        public final int value;
        public final String name;

        private static ReverseEnumMap<Velocities> map = new ReverseEnumMap<Velocities>(
                        Velocities.class);

        private Velocities(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Velocities convert(final int value) {
                return map.get(value);
        }
}
