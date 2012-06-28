package main.java.models.mixers;

import main.java.models.enums.Minus64ToPlus63;
import main.java.models.enums.ZeroToPlus127;
import main.java.models.patch.PatchData;
import main.java.utils.EnumConverters;

public class MixerNoise extends MixerBase {
        private final int colorIndex = 69;

        private final PatchData patchData;

        public MixerNoise(final PatchData patchData) {
                super(patchData, 67, 68);

                this.patchData = patchData;

                // Init patch
                setLevel(ZeroToPlus127.ZERO);
                setBalance(F164ToF263.F1_64);
                setColor(Minus64ToPlus63.ZERO);
        }

        public final Minus64ToPlus63 getColor() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getValue(colorIndex));
        }

        public final void setColor(final Minus64ToPlus63 color) {
                patchData.setValue(colorIndex, color.value);
        }
}
