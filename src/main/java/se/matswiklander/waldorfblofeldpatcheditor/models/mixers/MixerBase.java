package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.mixers;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverters;

public class MixerBase {
        private final PatchData patchData;

        private final int levelIndex;
        private final int balanceIndex;

        protected MixerBase(final PatchData patchData, final int levelIndex,
                        final int balanceIndex) {
                this.patchData = patchData;
                this.levelIndex = levelIndex;
                this.balanceIndex = balanceIndex;
        }

        public final F164ToF263 getBalance() {
                return EnumConverters.convertF164ToF263(patchData
                                .getValue(balanceIndex));
        }

        public final ZeroToPlus127 getLevel() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(levelIndex));
        }

        public final void setBalance(final F164ToF263 balance) {
                patchData.setValue(balanceIndex, balance.value);
        }

        public final void setLevel(final ZeroToPlus127 level) {
                patchData.setValue(levelIndex, level.value);
        }
}
