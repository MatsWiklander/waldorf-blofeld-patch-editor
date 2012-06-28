package main.java.models.patch;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum Categories implements EnumConverter<Categories> {
        INIT(0, "Init"), ARP(1, "Arp"), ATMO(2, "Atmo"), BASS(3, "Bass"), DRUM(
                        4, "Drum"), FX(5, "FX"), KEYS(6, "Keys"), LEAD(7,
                        "Lead"), MONO(8, "Mono"), PAD(9, "Pad"), PERC(10,
                        "Perc"), POLY(11, "Poly"), SEQ(12, "Seq");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Categories> map = new ReverseEnumMap<Categories>(
                        Categories.class);

        private Categories(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Categories convert(final int value) {
                return map.get(value);
        }
}
