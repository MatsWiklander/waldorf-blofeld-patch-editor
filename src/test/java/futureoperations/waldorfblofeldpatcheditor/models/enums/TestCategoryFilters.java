package test.java.futureoperations.waldorfblofeldpatcheditor.models.enums;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.CategoryFilters;

import org.junit.Test;

public class TestCategoryFilters {
        @Test
        public final void testOrdinal() {
                assertEquals(0, CategoryFilters.OFF.ordinal());
                assertEquals(1, CategoryFilters.INIT.ordinal());
                assertEquals(2, CategoryFilters.ARP.ordinal());
                assertEquals(3, CategoryFilters.ATMO.ordinal());
                assertEquals(4, CategoryFilters.BASS.ordinal());
                assertEquals(5, CategoryFilters.DRUM.ordinal());
                assertEquals(6, CategoryFilters.FX.ordinal());
                assertEquals(7, CategoryFilters.KEYS.ordinal());
                assertEquals(8, CategoryFilters.LEAD.ordinal());
                assertEquals(9, CategoryFilters.MONO.ordinal());
                assertEquals(10, CategoryFilters.PAD.ordinal());
                assertEquals(11, CategoryFilters.PERC.ordinal());
                assertEquals(12, CategoryFilters.POLY.ordinal());
                assertEquals(13, CategoryFilters.SEQ.ordinal());
        }

}
