package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.OneTo16;

import org.junit.Test;

public class TestOneTo16 {
        @Test
        public final void testOrdinal() {
                assertEquals(0, OneTo16._1.ordinal());
                assertEquals(1, OneTo16._2.ordinal());
                assertEquals(2, OneTo16._3.ordinal());
                assertEquals(3, OneTo16._4.ordinal());
                assertEquals(4, OneTo16._5.ordinal());
                assertEquals(5, OneTo16._6.ordinal());
                assertEquals(6, OneTo16._7.ordinal());
                assertEquals(7, OneTo16._8.ordinal());
                assertEquals(8, OneTo16._9.ordinal());
                assertEquals(9, OneTo16._10.ordinal());
                assertEquals(10, OneTo16._11.ordinal());
                assertEquals(11, OneTo16._12.ordinal());
                assertEquals(12, OneTo16._13.ordinal());
                assertEquals(13, OneTo16._14.ordinal());
                assertEquals(14, OneTo16._15.ordinal());
                assertEquals(15, OneTo16._16.ordinal());
        }
}
