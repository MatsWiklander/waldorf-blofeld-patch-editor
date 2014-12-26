package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.oscillators;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.FmSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus12ToPlus12;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus24ToPlus24;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Oscillator1 extends OscillatorBase {
        private final int shapeIndex = 8;
        private final int limitWtIndex = 14;

        private final PatchData patchData;

        public Oscillator1(final PatchData patchData) {
                super(patchData, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 16);

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
                setPwmSource(ModulationSources.LFO_1);
                setPwmAmount(Minus64ToPlus63.ZERO);
                setSemitone(Minus12ToPlus12.ZERO);

                setLimitWt(OffOn.OFF);
                setShape(OneTwoShapes.SAW);
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
