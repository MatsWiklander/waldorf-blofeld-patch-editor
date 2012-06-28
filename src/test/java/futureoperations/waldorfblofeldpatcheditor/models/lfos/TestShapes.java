package test.java.futureoperations.waldorfblofeldpatcheditor.models.lfos;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.Shapes;

import org.junit.Test;

public class TestShapes {
        @Test
        public final void testOrdinal() {
                assertEquals(0, Shapes.SINE.ordinal());
                assertEquals(1, Shapes.TRIANGLE.ordinal());
                assertEquals(2, Shapes.SQUARE.ordinal());
                assertEquals(3, Shapes.SAW.ordinal());
                assertEquals(4, Shapes.RANDOM.ordinal());
                assertEquals(5, Shapes.S_AND_H.ordinal());
        }
}
