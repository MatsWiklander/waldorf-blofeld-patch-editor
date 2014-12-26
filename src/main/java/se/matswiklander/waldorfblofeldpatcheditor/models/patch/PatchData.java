package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch;

public class PatchData {
        private final byte[] payload;

        public PatchData() {
                payload = new byte[383];
        }

        private int createBitMask(final int startBit, final int numberOfBits) {
                int bitMask = 127;

                bitMask >>= startBit;
                bitMask <<= startBit;
                bitMask <<= (7 - startBit - numberOfBits);
                bitMask &= 127;
                bitMask >>= (7 - startBit - numberOfBits);

                return bitMask;
        }

        private int createBitResetMask(final int bitMask) {
                return 127 ^ bitMask;
        }

        public final byte[] getPayload() {
                return payload;
        }

        public final int getValue(final int index) {
                return getValue(index, 0, 7);
        }

        public final int getValue(final int index, final int startBit,
                        final int numberOfBits) {
                if (numberOfBits == 7) {
                        return payload[index];
                }

                int bitMask = createBitMask(startBit, numberOfBits);

                return (payload[index] & bitMask) >> startBit;
        }

        public final void setValue(final int index, final int value) {
                setValue(index, 0, 7, value);
        }

        public final void setValue(final int index, final int startBit,
                        final int numberOfBits, final int value) {
                if (numberOfBits == 7) {
                        payload[index] = (byte) value;
                        return;
                }

                int bitMask = createBitMask(startBit, numberOfBits);
                int bitResetMask = createBitResetMask(bitMask);

                payload[index] &= bitResetMask;
                payload[index] |= value << startBit;
        }

        public void writeReserved() {
                setValue(0, 1);
                setValue(12, 0);
                setValue(13, 0);
                setValue(15, 0);
                setValue(28, 0);
                setValue(29, 0);
                setValue(31, 0);
                setValue(44, 0);
                setValue(45, 0);
                setValue(46, 0);
                setValue(47, 0);
                setValue(52, 0);
                setValue(54, 0);
                setValue(55, 0);
                setValue(60, 0);
                setValue(70, 0);
                setValue(73, 0);
                setValue(74, 1);
                setValue(75, 0);
                setValue(76, 0);
                setValue(79, 64);
                setValue(83, 0);
                setValue(84, 0);
                setValue(85, 0);
                setValue(96, 0);
                setValue(99, 64);
                setValue(103, 0);
                setValue(104, 0);
                setValue(105, 0);
                setValue(116, 0);
                setValue(118, 3);
                setValue(119, 0);
                setValue(120, 0);
                setValue(125, 0);
                setValue(126, 0);
                setValue(127, 0);
                setValue(162, 64);
                setValue(168, 0);
                setValue(169, 0);
                setValue(171, 0);
                setValue(174, 64);
                setValue(180, 0);
                setValue(181, 0);
                setValue(183, 0);
                setValue(186, 64);
                setValue(192, 0);
                setValue(193, 0);
                setValue(195, 1);
                setValue(197, 64);
                setValue(198, 0);
                setValue(206, 0);
                setValue(207, 0);
                setValue(209, 64);
                setValue(210, 0);
                setValue(218, 0);
                setValue(219, 0);
                setValue(221, 64);
                setValue(222, 0);
                setValue(230, 0);
                setValue(231, 0);
                setValue(233, 64);
                setValue(234, 0);
                setValue(242, 0);
                setValue(243, 0);
                setValue(244, 1);
                setValue(309, 16);
                setValue(310, 100);
                setValue(313, 15);
                setValue(321, 0);
                setValue(324, 0);
                setValue(325, 0);
                setValue(359, 68);
                setValue(360, 0);
                setValue(361, 0);
                setValue(362, 0);
                setValue(380, 0);
                setValue(381, 0);
                setValue(382, 0);
        }
}
