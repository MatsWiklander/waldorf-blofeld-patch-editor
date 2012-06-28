package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.FmSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus12ToPlus12;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus24ToPlus24;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Oscillator2 extends OscillatorBase {
        private final int shapeIndex = 24;
        private final int limitWtIndex = 30;

        private final PatchData patchData;

        public Oscillator2(final PatchData patchData) {
                super(patchData, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 32);

                this.patchData = patchData;

                // Init patch
                setBendRange(Minus24ToPlus24.PLUS2);
                setBrilliance(ZeroToPlus127.ZERO);
                setDetune(Minus64ToPlus63.ZERO);
                setFmAmount(ZeroToPlus127.ZERO);
                setFmSource(FmSources.OFF);
                setKeytrack(Minus200PercentToPlus196Percent.PLUS99PERCENT);
                setOctave(Octaves.FOOT8);
                setPulseWidth(ZeroToPlus127.PLUS127);
                setPwmSource(ModulationSources.LFO_2);
                setPwmAmount(Minus64ToPlus63.ZERO);
                setSemitone(Minus12ToPlus12.ZERO);

                setLimitWt(OffOn.OFF);
                setShape(OneTwoShapes.OFF);
        }

        public final OffOn getLimitWt() {
                return EnumConverters.convertOffOn(patchData
                                .getValue(limitWtIndex));
        }

        public final OneTwoShapes getShape() {
                return EnumConverters.convertOneTwoShapes(patchData
                                .getValue(shapeIndex));
        }

        public final void setLimitWt(final OffOn limitWt) {
                patchData.setValue(limitWtIndex, limitWt.value);
        }

        public final void setShape(final OneTwoShapes shape) {
                patchData.setValue(shapeIndex, shape.value);
        }
}
