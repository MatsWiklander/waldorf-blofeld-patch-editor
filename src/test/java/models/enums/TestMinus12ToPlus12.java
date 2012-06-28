package test.java.models.enums;

import static org.junit.Assert.assertEquals;
import main.java.models.enums.Minus12ToPlus12;

import org.junit.Test;

public class TestMinus12ToPlus12 {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Minus12ToPlus12.MINUS12.ordinal());
                assertEquals(1, Minus12ToPlus12.MINUS11.ordinal());
                assertEquals(2, Minus12ToPlus12.MINUS10.ordinal());
                assertEquals(3, Minus12ToPlus12.MINUS9.ordinal());
                assertEquals(4, Minus12ToPlus12.MINUS8.ordinal());
                assertEquals(5, Minus12ToPlus12.MINUS7.ordinal());
                assertEquals(6, Minus12ToPlus12.MINUS6.ordinal());
                assertEquals(7, Minus12ToPlus12.MINUS5.ordinal());
                assertEquals(8, Minus12ToPlus12.MINUS4.ordinal());
                assertEquals(9, Minus12ToPlus12.MINUS3.ordinal());
                assertEquals(10, Minus12ToPlus12.MINUS2.ordinal());
                assertEquals(11, Minus12ToPlus12.MINUS1.ordinal());
                assertEquals(12, Minus12ToPlus12.ZERO.ordinal());
                assertEquals(13, Minus12ToPlus12.PLUS1.ordinal());
                assertEquals(14, Minus12ToPlus12.PLUS2.ordinal());
                assertEquals(15, Minus12ToPlus12.PLUS3.ordinal());
                assertEquals(16, Minus12ToPlus12.PLUS4.ordinal());
                assertEquals(17, Minus12ToPlus12.PLUS5.ordinal());
                assertEquals(18, Minus12ToPlus12.PLUS6.ordinal());
                assertEquals(19, Minus12ToPlus12.PLUS7.ordinal());
                assertEquals(20, Minus12ToPlus12.PLUS8.ordinal());
                assertEquals(21, Minus12ToPlus12.PLUS9.ordinal());
                assertEquals(22, Minus12ToPlus12.PLUS10.ordinal());
                assertEquals(23, Minus12ToPlus12.PLUS11.ordinal());
                assertEquals(24, Minus12ToPlus12.PLUS12.ordinal());
        }

        @Test
        public final void testSnap() {
                Minus12ToPlus12 minus12ToPlus12 = Minus12ToPlus12.ZERO;

                for (int i = 0; i < 53; i++) {
                        minus12ToPlus12 = minus12ToPlus12.convert(i);
                        assertEquals(Minus12ToPlus12.MINUS12, minus12ToPlus12);
                }

                for (int i = 76; i < 128; i++) {
                        minus12ToPlus12 = minus12ToPlus12.convert(i);
                        assertEquals(Minus12ToPlus12.PLUS12, minus12ToPlus12);
                }
        }
}
