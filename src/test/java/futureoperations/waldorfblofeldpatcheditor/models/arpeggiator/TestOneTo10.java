package test.java.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.OneTo10;

import org.junit.Test;

public class TestOneTo10 {
        @Test
        public final void testOrdinal() {
                assertEquals(0, OneTo10._1.ordinal());
                assertEquals(1, OneTo10._2.ordinal());
                assertEquals(2, OneTo10._3.ordinal());
                assertEquals(3, OneTo10._4.ordinal());
                assertEquals(4, OneTo10._5.ordinal());
                assertEquals(5, OneTo10._6.ordinal());
                assertEquals(6, OneTo10._7.ordinal());
                assertEquals(7, OneTo10._8.ordinal());
                assertEquals(8, OneTo10._9.ordinal());
                assertEquals(9, OneTo10._10.ordinal());
        }
}
