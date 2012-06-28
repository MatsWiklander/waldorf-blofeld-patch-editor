package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.FmSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus12ToPlus12;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus24ToPlus24;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Oscillator3 extends OscillatorBase {
        private final int shapeIndex = 40;

        private final PatchData patchData;

        public Oscillator3(final PatchData patchData) {
                super(patchData, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 48);

                this.patchData = patchData;

                // Init patch
                setBendRange(Minus24ToPlus24.PLUS2);
                setBrilliance(ZeroToPlus127.ZERO);
                setDetune(Minus64ToPlus63.ZERO);
                setFmAmount(ZeroToPlus127.ZERO);
                setFmSource(FmSources.OFF);
                setKeytrack(Minus200PercentToPlus196Percent.PLUS99PERCENT);
                setOctave(Octaves.FOOT16);
                setPulseWidth(ZeroToPlus127.PLUS127);
                setPwmSource(ModulationSources.LFO_3);
                setPwmAmount(Minus64ToPlus63.ZERO);
                setSemitone(Minus12ToPlus12.ZERO);

                setShape(ThreeShapes.OFF);
        }

        public final ThreeShapes getShape() {
                return EnumConverters.convertThreeShapes(patchData
                                .getValue(shapeIndex));
        }

        public final void setShape(final ThreeShapes shape) {
                patchData.setValue(shapeIndex, shape.value);
        }
}
