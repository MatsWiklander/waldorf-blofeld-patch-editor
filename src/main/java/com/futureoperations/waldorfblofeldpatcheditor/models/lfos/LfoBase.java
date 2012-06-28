package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class LfoBase {
        private final int shapeIndex;
        private final int speedIndex;
        private final int syncIndex;
        private final int clockedIndex;
        private final int startPhaseIndex;
        private final int delayIndex;
        private final int fadeIndex;
        private final int keyTrackIndex;

        private final PatchData patchData;

        protected LfoBase(final PatchData patchData, final int shapeIndex,
                        final int speedIndex, final int syncIndex,
                        final int clockedIndex, final int startPhaseIndex,
                        final int delayIndex, final int fadeIndex,
                        final int keyTrackIndex) {
                this.patchData = patchData;
                this.shapeIndex = shapeIndex;
                this.speedIndex = speedIndex;
                this.syncIndex = syncIndex;
                this.clockedIndex = clockedIndex;
                this.startPhaseIndex = startPhaseIndex;
                this.delayIndex = delayIndex;
                this.fadeIndex = fadeIndex;
                this.keyTrackIndex = keyTrackIndex;

                // Init patch
                setShape(Shapes.SINE);
                setSync(OffOn.OFF);
                setClocked(OffOn.OFF);
                setStartPhase(FreeTo355Degree.FREE);
                setDelay(ZeroToPlus127.ZERO);
                setFade(Minus64ToPlus63.ZERO);
                setKeyTrack(Minus200PercentToPlus196Percent.ZEROPERCENT);
        }

        public final OffOn getClocked() {
                return EnumConverters
                                .convertOffOn(patchData.getPayload()[clockedIndex]);
        }

        public final ZeroToPlus127 getDelay() {
                return EnumConverters.convertZeroToPlus127(patchData
                                .getPayload()[delayIndex]);
        }

        public final Minus64ToPlus63 getFade() {
                return EnumConverters.convertMinus64ToPlus63(patchData
                                .getPayload()[fadeIndex]);
        }

        public final Minus200PercentToPlus196Percent getKeyTrack() {
                return EnumConverters
                                .convertMinus200PercentToPlus196Percent(patchData
                                                .getPayload()[keyTrackIndex]);
        }

        public final Shapes getShape() {
                return EnumConverters
                                .convertLfoShapes(patchData.getPayload()[shapeIndex]);
        }

        public final Clocks getSpeed() {
                return EnumConverters
                                .convertLfoClocks(patchData.getPayload()[speedIndex]);
        }

        public final FreeTo355Degree getStartPhase() {
                return EnumConverters.convertFreeTo355Degrees(patchData
                                .getPayload()[startPhaseIndex]);
        }

        public final OffOn getSync() {
                return EnumConverters
                                .convertOffOn(patchData.getPayload()[syncIndex]);
        }

        public final void setClocked(final OffOn clocked) {
                patchData.setValue(clockedIndex, clocked.value);
        }

        public final void setDelay(final ZeroToPlus127 delay) {
                patchData.setValue(delayIndex, delay.value);
        }

        public final void setFade(final Minus64ToPlus63 fade) {
                patchData.setValue(fadeIndex, fade.value);
        }

        public final void setKeyTrack(
                        final Minus200PercentToPlus196Percent keyTrack) {
                patchData.setValue(keyTrackIndex, keyTrack.value);
        }

        public final void setShape(final Shapes shape) {
                patchData.setValue(shapeIndex, shape.value);
        }

        public final void setSpeed(final Clocks speed) {
                patchData.setValue(speedIndex, speed.value);
        }

        public final void setStartPhase(final FreeTo355Degree startPhase) {
                patchData.setValue(startPhaseIndex, startPhase.value);
        }

        public final void setSync(final OffOn sync) {
                patchData.setValue(syncIndex, sync.value);
        }
}
