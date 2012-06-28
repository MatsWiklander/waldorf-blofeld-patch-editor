package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum CtrlSendModes implements EnumConverter<CtrlSendModes> {
        OFF(0, "off"), CTRL(1, "Ctrl"), SYSEX(2, "SysEx"), CTRL_SYSEX(3,
                        "Ctrl+SysEx");

        public final int value;

        public final String name;
        private static ReverseEnumMap<CtrlSendModes> map = new ReverseEnumMap<CtrlSendModes>(
                        CtrlSendModes.class);

        private CtrlSendModes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public CtrlSendModes convert(final int value) {
                return map.get(value);
        }
}
