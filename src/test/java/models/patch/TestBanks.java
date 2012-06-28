package test.java.models.patch;

import static org.junit.Assert.assertEquals;
import main.java.models.patch.Banks;

import org.junit.Test;

public class TestBanks {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Banks.A.ordinal());
                assertEquals(1, Banks.B.ordinal());
                assertEquals(2, Banks.C.ordinal());
                assertEquals(3, Banks.D.ordinal());
                assertEquals(4, Banks.E.ordinal());
                assertEquals(5, Banks.F.ordinal());
                assertEquals(6, Banks.G.ordinal());
                assertEquals(7, Banks.H.ordinal());
        }

}
