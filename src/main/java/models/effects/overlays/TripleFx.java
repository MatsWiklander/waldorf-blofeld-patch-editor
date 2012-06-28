package main.java.models.effects.overlays;

import main.java.models.effects.EffectBase;
import main.java.models.enums.ZeroToPlus127;

public class TripleFx implements Overlayable {
        private EffectBase effectBase;

        public final ZeroToPlus127 getChorusMix() {
                return effectBase.getParameter4();
        }

        public final ZeroToPlus127 getDepth() {
                return effectBase.getParameter2();
        }

        public final ZeroToPlus127 getOverdrive() {
                return effectBase.getParameter6();
        }

        public final ZeroToPlus127 getSampleAndHold() {
                return effectBase.getParameter5();
        }

        public final ZeroToPlus127 getSpeed() {
                return effectBase.getParameter1();
        }

        public final void setChorusMix(final ZeroToPlus127 chorusMix) {
                effectBase.setParameter4(chorusMix);
        }

        public final void setDepth(final ZeroToPlus127 depth) {
                effectBase.setParameter2(depth);
        }

        @Override
        public final void setEffectBase(final EffectBase effectBase) {
                this.effectBase = effectBase;
        }

        public final void setOverdrive(final ZeroToPlus127 overdrive) {
                effectBase.setParameter6(overdrive);
        }

        public final void setSampleAndHold(final ZeroToPlus127 sampleAndHold) {
                effectBase.setParameter5(sampleAndHold);
        }

        public final void setSpeed(final ZeroToPlus127 speed) {
                effectBase.setParameter1(speed);
        }
}
