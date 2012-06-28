package test.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.CtrlSendModes;

import org.junit.Test;

public class TestCtrlSendModes {
        @Test
        public final void testOrdinal() {
                assertEquals(0, CtrlSendModes.OFF.ordinal());
                assertEquals(1, CtrlSendModes.CTRL.ordinal());
                assertEquals(2, CtrlSendModes.SYSEX.ordinal());
                assertEquals(3, CtrlSendModes.CTRL_SYSEX.ordinal());
        }
}
