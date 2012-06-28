package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class EnvelopeBase {
        private final int modeTriggerIndex;
        private final int attackIndex;
        private final int attackLevelIndex;
        private final int decayIndex;
        private final int sustainIndex;
        private final int decay2Index;
        private final int sustain2Index;
        private final int releaseIndex;

        private final PatchData patchData;

        public EnvelopeBase(final PatchData patchData,
                        final int modeTriggerIndex, final int attackIndex,
                        final int attackLevelIndex, final int decayIndex,
                        final int sustainIndex, final int decay2Index,
                        final int sustain2Index, final int releaseIndex) {
                this.patchData = patchData;
                this.modeTriggerIndex = modeTriggerIndex;
                this.attackIndex = attackIndex;
                this.attackLevelIndex = attackLevelIndex;
                this.decayIndex = decayIndex;
                this.sustainIndex = sustainIndex;
                this.decay2Index = decay2Index;
                this.sustain2Index = sustain2Index;
                this.releaseIndex = releaseIndex;
        }

        public final ZeroToPlus127 getAttack() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(attackIndex));
        }

        public final ZeroToPlus127 getAttackLevel() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(attackLevelIndex));
        }

        public final ZeroToPlus127 getDecay() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(decayIndex));
        }

        public final ZeroToPlus127 getDecay2() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(decay2Index));
        }

        public final Modes getMode() {
                return EnumConverters.convertEnvelopeModes(patchData.getValue(
                                modeTriggerIndex, 0, 5));
        }

        public final ZeroToPlus127 getRelease() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(releaseIndex));
        }

        public final ZeroToPlus127 getSustain() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(sustainIndex));
        }

        public final ZeroToPlus127 getSustain2() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getValue(sustain2Index));
        }

        public final Triggers getTrigger() {
                return EnumConverters.convertEnvelopeTriggers(patchData
                                .getValue(modeTriggerIndex, 5, 2));
        }

        public final void setAttack(final ZeroToPlus127 attack) {
                patchData.setValue(attackIndex, attack.value);
        }

        public final void setAttackLevel(final ZeroToPlus127 attackLevel) {
                patchData.setValue(attackLevelIndex, attackLevel.value);
        }

        public final void setDecay(final ZeroToPlus127 decay) {
                patchData.setValue(decayIndex, decay.value);
        }

        public final void setDecay2(final ZeroToPlus127 decay2) {
                patchData.setValue(decay2Index, decay2.value);
        }

        public final void setMode(final Modes mode) {
                patchData.setValue(modeTriggerIndex, 0, 5, mode.value);
        }

        public final void setRelease(final ZeroToPlus127 release) {
                patchData.setValue(releaseIndex, release.value);
        }

        public final void setSustain(final ZeroToPlus127 sustain) {
                patchData.setValue(sustainIndex, sustain.value);
        }

        public final void setSustain2(final ZeroToPlus127 sustain2) {
                patchData.setValue(sustain2Index, sustain2.value);
        }

        public final void setTrigger(final Triggers envelopeTrigger) {
                patchData.setValue(modeTriggerIndex, 5, 2,
                                envelopeTrigger.value);
        }
}
