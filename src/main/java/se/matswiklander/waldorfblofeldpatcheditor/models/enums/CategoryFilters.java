package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum CategoryFilters implements EnumConverter<CategoryFilters> {
        OFF(0, "off"), INIT(1, "Init"), ARP(2, "Arp"), ATMO(3, "Atmo"), BASS(4,
                        "Bass"), DRUM(5, "Drum"), FX(6, "FX"), KEYS(7, "Keys"), LEAD(
                        8, "Lead"), MONO(9, "Mono"), PAD(10, "Pad"), PERC(11,
                        "Perc"), POLY(12, "Poly"), SEQ(13, "Seq");
        public final int value;

        public final String name;
        private static ReverseEnumMap<CategoryFilters> map = new ReverseEnumMap<CategoryFilters>(
                        CategoryFilters.class);

        private CategoryFilters(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public CategoryFilters convert(final int value) {
                return map.get(value);
        }
}
