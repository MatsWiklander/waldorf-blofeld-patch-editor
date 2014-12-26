package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum SortOrders implements EnumConverter<SortOrders> {
        AS_PLAYED(0, "as played"), REVERSED(1, "reversed"), KEY_LO_HI(2,
                        "Key Lo>Hi"), KEY_HI_LO(3, "Key Hi>Lo"), VEL_LO_HO(4,
                        "Vel Lo>Hi"), VEL_HI_LO(5, "Vel Hi>Lo");

        public final int value;
        public final String name;

        private static ReverseEnumMap<SortOrders> map = new ReverseEnumMap<SortOrders>(
                        SortOrders.class);

        private SortOrders(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public SortOrders convert(final int value) {
                return map.get(value);
        }
}
