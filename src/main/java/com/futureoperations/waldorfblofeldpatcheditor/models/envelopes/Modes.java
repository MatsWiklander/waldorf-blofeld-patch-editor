package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Modes implements EnumConverter<Modes> {
        ADSR(0, "ADSR"), ADS1DS2R(1, "ADS1DS2R"), ONE_SHOT(2, "One Shot"), LOOP_S1S2(
                        3, "Loop S1S2"), LOOP_ALL(4, "Loop All");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Modes> map = new ReverseEnumMap<Modes>(
                        Modes.class);

        private Modes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Modes convert(final int value) {
                return map.get(value);
        }
}
