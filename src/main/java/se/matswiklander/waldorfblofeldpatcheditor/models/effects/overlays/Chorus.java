package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.EffectBase;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;

public class Chorus implements Overlayable {
        private EffectBase effectBase;

        public final ZeroToPlus127 getDepth() {
                return effectBase.getParameter2();
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

        public final void setSpeed(final ZeroToPlus127 speed) {
                effectBase.setParameter1(speed);
        }
}
