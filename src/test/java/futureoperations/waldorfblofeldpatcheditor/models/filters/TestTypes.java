package test.java.futureoperations.waldorfblofeldpatcheditor.models.filters;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Types;

import org.junit.Test;

public class TestTypes {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Types.BYPASS.ordinal());
                assertEquals(1, Types.LP_24DB.ordinal());
                assertEquals(2, Types.LP_12DB.ordinal());
                assertEquals(3, Types.BP_24DB.ordinal());
                assertEquals(4, Types.BP_12DB.ordinal());
                assertEquals(5, Types.HP_24DB.ordinal());
                assertEquals(6, Types.HP_12DB.ordinal());
                assertEquals(7, Types.NOTCH_24DB.ordinal());
                assertEquals(8, Types.NOTCH_12DB.ordinal());
                assertEquals(9, Types.COMB_PLUS.ordinal());
                assertEquals(10, Types.COMB_MINUS.ordinal());
                assertEquals(11, Types.PPG_LP.ordinal());
        }
}
