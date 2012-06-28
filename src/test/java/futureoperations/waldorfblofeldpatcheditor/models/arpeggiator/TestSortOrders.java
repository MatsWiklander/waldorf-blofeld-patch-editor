package test.java.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.SortOrders;

import org.junit.Test;

public class TestSortOrders {
        @Test
        public final void testOrdinal() {
                assertEquals(0, SortOrders.AS_PLAYED.ordinal());
                assertEquals(1, SortOrders.REVERSED.ordinal());
                assertEquals(2, SortOrders.KEY_LO_HI.ordinal());
                assertEquals(3, SortOrders.KEY_HI_LO.ordinal());
                assertEquals(4, SortOrders.VEL_LO_HO.ordinal());
                assertEquals(5, SortOrders.VEL_HI_LO.ordinal());
        }
}
