package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.EffectBase;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.DriveCurves;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Overdrive implements Overlayable {
        private EffectBase effectBase;

        public final DriveCurves getCurve() {
                return EnumConverters.convertDriveCurves(effectBase
                                .getParameter10().value);
        }

        public final ZeroToPlus127 getCutoff() {
                return effectBase.getParameter5();
        }

        public final ZeroToPlus127 getDrive() {
                return effectBase.getParameter2();
        }

        public final ZeroToPlus127 getPostGain() {
                return effectBase.getParameter3();
        }

        public final void setCurve(final DriveCurves curve) {
                effectBase.setParameter10(EnumConverters
                                .convertZeroToPlus127(curve.value));
        }

        public final void setCutoff(final ZeroToPlus127 cutoff) {
                effectBase.setParameter5(cutoff);
        }

        public final void setDrive(final ZeroToPlus127 drive) {
                effectBase.setParameter2(drive);
        }

        @Override
        public final void setEffectBase(final EffectBase effectBase) {
                this.effectBase = effectBase;
        }

        public final void setPostGain(final ZeroToPlus127 postGain) {
                effectBase.setParameter3(postGain);
        }
}
