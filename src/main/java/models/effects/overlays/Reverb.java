package main.java.models.effects.overlays;

import main.java.models.effects.EffectBase;
import main.java.models.enums.ZeroToPlus127;

public class Reverb implements Overlayable {
        private EffectBase effectBase;

        public final ZeroToPlus127 getDamping() {
                return effectBase.getParameter9();
        }

        public final ZeroToPlus127 getDecay() {
                return effectBase.getParameter3();
        }

        public final ZeroToPlus127 getDiffusion() {
                return effectBase.getParameter8();
        }

        public final ZeroToPlus127 getHighpass() {
                return effectBase.getParameter7();
        }

        public final ZeroToPlus127 getLowpass() {
                return effectBase.getParameter6();
        }

        public final ZeroToPlus127 getShape() {
                return effectBase.getParameter2();
        }

        public final ZeroToPlus127 getSize() {
                return effectBase.getParameter1();
        }

        public final void setDamping(final ZeroToPlus127 damping) {
                effectBase.setParameter9(damping);
        }

        public final void setDecay(final ZeroToPlus127 decay) {
                effectBase.setParameter3(decay);
        }

        public final void setDiffusion(final ZeroToPlus127 diffusion) {
                effectBase.setParameter8(diffusion);
        }

        @Override
        public final void setEffectBase(final EffectBase effectBase) {
                this.effectBase = effectBase;
        }

        public final void setHighpass(final ZeroToPlus127 highpass) {
                effectBase.setParameter7(highpass);
        }

        public final void setLowpass(final ZeroToPlus127 lowpass) {
                effectBase.setParameter6(lowpass);
        }

        public final void setShape(final ZeroToPlus127 shape) {
                effectBase.setParameter2(shape);
        }

        public final void setSize(final ZeroToPlus127 size) {
                effectBase.setParameter1(size);
        }
}
