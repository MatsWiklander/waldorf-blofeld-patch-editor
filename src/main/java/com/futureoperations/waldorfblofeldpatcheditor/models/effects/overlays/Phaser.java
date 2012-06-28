package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.EffectBase;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Polarities;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Phaser implements Overlayable {
        private EffectBase effectBase;

        public final ZeroToPlus127 getCenter() {
                return effectBase.getParameter6();
        }

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

        public final ZeroToPlus127 getSpacing() {
                return effectBase.getParameter7();
        }

        public final ZeroToPlus127 getSpeed() {
                return effectBase.getParameter1();
        }

        public final void setCenter(final ZeroToPlus127 center) {
                effectBase.setParameter6(center);
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

        public final void setSpacing(final ZeroToPlus127 spacing) {
                effectBase.setParameter7(spacing);
        }

        public final void setSpeed(final ZeroToPlus127 speed) {
                effectBase.setParameter1(speed);
        }
}
