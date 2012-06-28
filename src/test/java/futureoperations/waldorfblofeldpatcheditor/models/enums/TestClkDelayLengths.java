package test.java.futureoperations.waldorfblofeldpatcheditor.models.enums;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ClkDelayLengths;

import org.junit.Test;

public class TestClkDelayLengths {
        @Test
        public final void testOrdinal() {
                assertEquals(0, ClkDelayLengths._1_96.ordinal());
                assertEquals(1, ClkDelayLengths._1_48.ordinal());
                assertEquals(2, ClkDelayLengths._1_32.ordinal());
                assertEquals(3, ClkDelayLengths._1_16T.ordinal());
                assertEquals(4, ClkDelayLengths._1_32DOT.ordinal());
                assertEquals(5, ClkDelayLengths._1_16.ordinal());
                assertEquals(6, ClkDelayLengths._1_8T.ordinal());
                assertEquals(7, ClkDelayLengths._1_16DOT.ordinal());
                assertEquals(8, ClkDelayLengths._1_8.ordinal());
                assertEquals(9, ClkDelayLengths._1_4T.ordinal());
                assertEquals(10, ClkDelayLengths._1_8DOT.ordinal());
                assertEquals(11, ClkDelayLengths._1_4.ordinal());
                assertEquals(12, ClkDelayLengths._1_2T.ordinal());
                assertEquals(13, ClkDelayLengths._1_4DOT.ordinal());
                assertEquals(14, ClkDelayLengths._1_2.ordinal());
                assertEquals(15, ClkDelayLengths._1_1T.ordinal());
                assertEquals(16, ClkDelayLengths._1_2DOT.ordinal());
                assertEquals(17, ClkDelayLengths._1_BAR.ordinal());
                assertEquals(18, ClkDelayLengths._1_5_BARS.ordinal());
                assertEquals(19, ClkDelayLengths._2_BARS.ordinal());
                assertEquals(20, ClkDelayLengths._2_5_BARS.ordinal());
                assertEquals(21, ClkDelayLengths._3_BARS.ordinal());
                assertEquals(22, ClkDelayLengths._3_5_BARS.ordinal());
                assertEquals(23, ClkDelayLengths._4_BARS.ordinal());
                assertEquals(24, ClkDelayLengths._5_BARS.ordinal());
                assertEquals(25, ClkDelayLengths._6_BARS.ordinal());
                assertEquals(26, ClkDelayLengths._7_BARS.ordinal());
                assertEquals(27, ClkDelayLengths._8_BARS.ordinal());
                assertEquals(28, ClkDelayLengths._9_BARS.ordinal());
                assertEquals(29, ClkDelayLengths._10_BARS.ordinal());
        }

}
