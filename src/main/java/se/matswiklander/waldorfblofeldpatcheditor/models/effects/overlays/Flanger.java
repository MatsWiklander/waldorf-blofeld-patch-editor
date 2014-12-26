package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.EffectBase;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.Polarities;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Flanger implements Overlayable {
        private EffectBase effectBase;

        public final ZeroToPlus127 getDepth() {
                return effectBase.getParameter2();
        }

        public final ZeroToPlus127 getFeedback() {
                return effectBase.getParameter5();
        }

        public final Polarities getPolarity() {
                return EnumConverters.convertPolarities(effectBase
                                .getParameter8().value);
        }

        public final ZeroToPlus127 getSpeed() {
                return effectBase.getParameter1();
        }

        public final void setDepth(final ZeroToPlus127 depth) {
                effectBase.setParameter2(depth);
        }

        @Override
        public final void setEffectBase(final EffectBase effectBase) {
                this.effectBase = effectBase;
        }

        public final void setFeedback(final ZeroToPlus127 feedback) {
                effectBase.setParameter5(feedback);
        }

        public final void setPolarity(final Polarities polarity) {
                effectBase.setParameter8(EnumConverters
                                .convertZeroToPlus127(polarity.value));
        }

        public final void setSpeed(final ZeroToPlus127 speed) {
                effectBase.setParameter1(speed);
        }
}
