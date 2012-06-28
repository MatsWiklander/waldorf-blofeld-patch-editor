package test.java.models.patch;

import static org.junit.Assert.assertEquals;
import main.java.models.patch.Categories;

import org.junit.Test;

public class TestCategories {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Categories.INIT.ordinal());
                assertEquals(1, Categories.ARP.ordinal());
                assertEquals(2, Categories.ATMO.ordinal());
                assertEquals(3, Categories.BASS.ordinal());
                assertEquals(4, Categories.DRUM.ordinal());
                assertEquals(5, Categories.FX.ordinal());
                assertEquals(6, Categories.KEYS.ordinal());
                assertEquals(7, Categories.LEAD.ordinal());
                assertEquals(8, Categories.MONO.ordinal());
                assertEquals(9, Categories.PAD.ordinal());
                assertEquals(10, Categories.PERC.ordinal());
                assertEquals(11, Categories.POLY.ordinal());
                assertEquals(12, Categories.SEQ.ordinal());
        }

}
