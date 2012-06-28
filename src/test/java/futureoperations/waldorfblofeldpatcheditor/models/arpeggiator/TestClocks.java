package test.java.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Clocks;

import org.junit.Test;

public class TestClocks {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Clocks._1_96.ordinal());
                assertEquals(1, Clocks._1_48.ordinal());
                assertEquals(2, Clocks._1_32.ordinal());
                assertEquals(3, Clocks._1_16T.ordinal());
                assertEquals(4, Clocks._1_32DOT.ordinal());
                assertEquals(5, Clocks._1_16.ordinal());
                assertEquals(6, Clocks._1_8T.ordinal());
                assertEquals(7, Clocks._1_16DOT.ordinal());
                assertEquals(8, Clocks._1_8.ordinal());
                assertEquals(9, Clocks._1_4T.ordinal());
                assertEquals(10, Clocks._1_8DOT.ordinal());
                assertEquals(11, Clocks._1_4.ordinal());
                assertEquals(12, Clocks._1_2T.ordinal());
                assertEquals(13, Clocks._1_4DOT.ordinal());
                assertEquals(14, Clocks._1_2.ordinal());
                assertEquals(15, Clocks._1_1T.ordinal());
                assertEquals(16, Clocks._1_2DOT.ordinal());
                assertEquals(17, Clocks._1_BAR.ordinal());
                assertEquals(18, Clocks._1_5_BARS.ordinal());
                assertEquals(19, Clocks._2_BARS.ordinal());
                assertEquals(20, Clocks._2_5_BARS.ordinal());
                assertEquals(21, Clocks._3_BARS.ordinal());
                assertEquals(22, Clocks._3_5_BARS.ordinal());
                assertEquals(23, Clocks._4_BARS.ordinal());
                assertEquals(24, Clocks._5_BARS.ordinal());
                assertEquals(25, Clocks._6_BARS.ordinal());
                assertEquals(26, Clocks._7_BARS.ordinal());
                assertEquals(27, Clocks._8_BARS.ordinal());
                assertEquals(28, Clocks._9_BARS.ordinal());
                assertEquals(29, Clocks._10_BARS.ordinal());
                assertEquals(30, Clocks._12_BARS.ordinal());
                assertEquals(31, Clocks._14_BARS.ordinal());
                assertEquals(32, Clocks._16_BARS.ordinal());
                assertEquals(33, Clocks._18_BARS.ordinal());
                assertEquals(34, Clocks._20_BARS.ordinal());
                assertEquals(35, Clocks._24_BARS.ordinal());
                assertEquals(36, Clocks._28_BARS.ordinal());
                assertEquals(37, Clocks._32_BARS.ordinal());
                assertEquals(38, Clocks._36_BARS.ordinal());
                assertEquals(39, Clocks._40_BARS.ordinal());
                assertEquals(40, Clocks._48_BARS.ordinal());
                assertEquals(41, Clocks._56_BARS.ordinal());
                assertEquals(42, Clocks._64_BARS.ordinal());
        }
}
