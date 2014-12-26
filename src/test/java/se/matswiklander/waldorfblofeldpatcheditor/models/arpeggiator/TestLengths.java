package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Lengths;

import org.junit.Test;

public class TestLengths {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Lengths._1_96.ordinal());
                assertEquals(1, Lengths._1_48.ordinal());
                assertEquals(2, Lengths._1_32.ordinal());
                assertEquals(3, Lengths._1_16T.ordinal());
                assertEquals(4, Lengths._1_32DOT.ordinal());
                assertEquals(5, Lengths._1_16.ordinal());
                assertEquals(6, Lengths._1_8T.ordinal());
                assertEquals(7, Lengths._1_16DOT.ordinal());
                assertEquals(8, Lengths._1_8.ordinal());
                assertEquals(9, Lengths._1_4T.ordinal());
                assertEquals(10, Lengths._1_8DOT.ordinal());
                assertEquals(11, Lengths._1_4.ordinal());
                assertEquals(12, Lengths._1_2T.ordinal());
                assertEquals(13, Lengths._1_4DOT.ordinal());
                assertEquals(14, Lengths._1_2.ordinal());
                assertEquals(15, Lengths._1_1T.ordinal());
                assertEquals(16, Lengths._1_2DOT.ordinal());
                assertEquals(17, Lengths._1_BAR.ordinal());
                assertEquals(18, Lengths._1_5_BARS.ordinal());
                assertEquals(19, Lengths._2_BARS.ordinal());
                assertEquals(20, Lengths._2_5_BARS.ordinal());
                assertEquals(21, Lengths._3_BARS.ordinal());
                assertEquals(22, Lengths._3_5_BARS.ordinal());
                assertEquals(23, Lengths._4_BARS.ordinal());
                assertEquals(24, Lengths._5_BARS.ordinal());
                assertEquals(25, Lengths._6_BARS.ordinal());
                assertEquals(26, Lengths._7_BARS.ordinal());
                assertEquals(27, Lengths._8_BARS.ordinal());
                assertEquals(28, Lengths._9_BARS.ordinal());
                assertEquals(29, Lengths._10_BARS.ordinal());
                assertEquals(30, Lengths._12_BARS.ordinal());
                assertEquals(31, Lengths._14_BARS.ordinal());
                assertEquals(32, Lengths._16_BARS.ordinal());
                assertEquals(33, Lengths._18_BARS.ordinal());
                assertEquals(34, Lengths._20_BARS.ordinal());
                assertEquals(35, Lengths._24_BARS.ordinal());
                assertEquals(36, Lengths._28_BARS.ordinal());
                assertEquals(37, Lengths._32_BARS.ordinal());
                assertEquals(38, Lengths._36_BARS.ordinal());
                assertEquals(39, Lengths._40_BARS.ordinal());
                assertEquals(40, Lengths._48_BARS.ordinal());
                assertEquals(41, Lengths._56_BARS.ordinal());
                assertEquals(42, Lengths._64_BARS.ordinal());
                assertEquals(43, Lengths.LEGATO.ordinal());
        }
}
