package test.java.futureoperations.waldorfblofeldpatcheditor.models.enums;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus24ToPlus24;

import org.junit.Test;

public class TestMinus24ToPlus24 {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Minus24ToPlus24.MINUS24.ordinal());
                assertEquals(1, Minus24ToPlus24.MINUS23.ordinal());
                assertEquals(2, Minus24ToPlus24.MINUS22.ordinal());
                assertEquals(3, Minus24ToPlus24.MINUS21.ordinal());
                assertEquals(4, Minus24ToPlus24.MINUS20.ordinal());
                assertEquals(5, Minus24ToPlus24.MINUS19.ordinal());
                assertEquals(6, Minus24ToPlus24.MINUS18.ordinal());
                assertEquals(7, Minus24ToPlus24.MINUS17.ordinal());
                assertEquals(8, Minus24ToPlus24.MINUS16.ordinal());
                assertEquals(9, Minus24ToPlus24.MINUS15.ordinal());
                assertEquals(10, Minus24ToPlus24.MINUS14.ordinal());
                assertEquals(11, Minus24ToPlus24.MINUS13.ordinal());
                assertEquals(12, Minus24ToPlus24.MINUS12.ordinal());
                assertEquals(13, Minus24ToPlus24.MINUS11.ordinal());
                assertEquals(14, Minus24ToPlus24.MINUS10.ordinal());
                assertEquals(15, Minus24ToPlus24.MINUS9.ordinal());
                assertEquals(16, Minus24ToPlus24.MINUS8.ordinal());
                assertEquals(17, Minus24ToPlus24.MINUS7.ordinal());
                assertEquals(18, Minus24ToPlus24.MINUS6.ordinal());
                assertEquals(19, Minus24ToPlus24.MINUS5.ordinal());
                assertEquals(20, Minus24ToPlus24.MINUS4.ordinal());
                assertEquals(21, Minus24ToPlus24.MINUS3.ordinal());
                assertEquals(22, Minus24ToPlus24.MINUS2.ordinal());
                assertEquals(23, Minus24ToPlus24.MINUS1.ordinal());
                assertEquals(24, Minus24ToPlus24.ZERO.ordinal());
                assertEquals(25, Minus24ToPlus24.PLUS1.ordinal());
                assertEquals(26, Minus24ToPlus24.PLUS2.ordinal());
                assertEquals(27, Minus24ToPlus24.PLUS3.ordinal());
                assertEquals(28, Minus24ToPlus24.PLUS4.ordinal());
                assertEquals(29, Minus24ToPlus24.PLUS5.ordinal());
                assertEquals(30, Minus24ToPlus24.PLUS6.ordinal());
                assertEquals(31, Minus24ToPlus24.PLUS7.ordinal());
                assertEquals(32, Minus24ToPlus24.PLUS8.ordinal());
                assertEquals(33, Minus24ToPlus24.PLUS9.ordinal());
                assertEquals(34, Minus24ToPlus24.PLUS10.ordinal());
                assertEquals(35, Minus24ToPlus24.PLUS11.ordinal());
                assertEquals(36, Minus24ToPlus24.PLUS12.ordinal());
                assertEquals(37, Minus24ToPlus24.PLUS13.ordinal());
                assertEquals(38, Minus24ToPlus24.PLUS14.ordinal());
                assertEquals(39, Minus24ToPlus24.PLUS15.ordinal());
                assertEquals(40, Minus24ToPlus24.PLUS16.ordinal());
                assertEquals(41, Minus24ToPlus24.PLUS17.ordinal());
                assertEquals(42, Minus24ToPlus24.PLUS18.ordinal());
                assertEquals(43, Minus24ToPlus24.PLUS19.ordinal());
                assertEquals(44, Minus24ToPlus24.PLUS20.ordinal());
                assertEquals(45, Minus24ToPlus24.PLUS21.ordinal());
                assertEquals(46, Minus24ToPlus24.PLUS22.ordinal());
                assertEquals(47, Minus24ToPlus24.PLUS23.ordinal());
                assertEquals(48, Minus24ToPlus24.PLUS24.ordinal());
        }

        @Test
        public final void testSnap() {
                Minus24ToPlus24 minus24ToPlus24 = Minus24ToPlus24.ZERO;

                for (int i = 0; i < 41; i++) {
                        minus24ToPlus24 = minus24ToPlus24.convert(i);
                        assertEquals(Minus24ToPlus24.MINUS24, minus24ToPlus24);
                }

                for (int i = 88; i < 128; i++) {
                        minus24ToPlus24 = minus24ToPlus24.convert(i);
                        assertEquals(Minus24ToPlus24.PLUS24, minus24ToPlus24);
                }
        }
}
