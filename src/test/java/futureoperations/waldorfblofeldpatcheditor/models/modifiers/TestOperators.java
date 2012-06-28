package test.java.futureoperations.waldorfblofeldpatcheditor.models.modifiers;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Operators;

import org.junit.Test;

public class TestOperators {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Operators.PLUS.ordinal());
                assertEquals(1, Operators.MINUS.ordinal());
                assertEquals(2, Operators.MULTIPLY.ordinal());
                assertEquals(3, Operators.AND.ordinal());
                assertEquals(4, Operators.OR.ordinal());
                assertEquals(5, Operators.XOR.ordinal());
                assertEquals(6, Operators.MAX.ordinal());
                assertEquals(7, Operators.MIN.ordinal());
        }
}
