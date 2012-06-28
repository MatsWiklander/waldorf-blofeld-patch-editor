package test.java.models.oscillators;

import static org.junit.Assert.assertEquals;
import main.java.models.enums.FmSources;
import main.java.models.enums.Minus12ToPlus12;
import main.java.models.enums.Minus200PercentToPlus196Percent;
import main.java.models.enums.Minus24ToPlus24;
import main.java.models.enums.Minus64ToPlus63;
import main.java.models.enums.ModulationSources;
import main.java.models.enums.OffOn;
import main.java.models.enums.ZeroToPlus127;
import main.java.models.oscillators.Octaves;
import main.java.models.oscillators.OneTwoShapes;
import main.java.models.oscillators.Oscillator1;
import main.java.models.oscillators.Oscillator2;
import main.java.models.oscillators.Oscillator3;
import main.java.models.oscillators.OscillatorBase;
import main.java.models.oscillators.ThreeShapes;
import main.java.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestOscillator123 {
        private PatchData patchData;
        private Oscillator1 oscillator1;
        private Oscillator2 oscillator2;
        private Oscillator3 oscillator3;

        @Before
        public final void setup() {
                patchData = new PatchData();
                oscillator1 = new Oscillator1(patchData);
                oscillator2 = new Oscillator2(patchData);
                oscillator3 = new Oscillator3(patchData);
        }

        private void setupWriteOscillator(final OscillatorBase oscillatorBase) {
                oscillatorBase.setBendRange(Minus24ToPlus24.MINUS14);
                oscillatorBase.setBrilliance(ZeroToPlus127.PLUS36);
                oscillatorBase.setDetune(Minus64ToPlus63.PLUS17);
                oscillatorBase.setFmAmount(ZeroToPlus127.PLUS13);
                oscillatorBase.setFmSource(FmSources.FILTER_ENV);
                oscillatorBase.setKeytrack(Minus200PercentToPlus196Percent.MINUS119PERCENT);
                oscillatorBase.setOctave(Octaves.FOOT16);
                oscillatorBase.setPwmSource(ModulationSources.BREATH_CTRL);
                oscillatorBase.setPwmAmount(Minus64ToPlus63.MINUS41);
                oscillatorBase.setSemitone(Minus12ToPlus12.MINUS4);
                oscillatorBase.setPulseWidth(ZeroToPlus127.PLUS96);
        }

        @Test
        public final void testOscillator1() {
                final int bendRange = 4;
                final int brilliance = 16;
                final int detune = 3;
                final int fmAmount = 7;
                final int fmSource = 6;
                final int keyTrack = 5;
                final int limitWt = 14;
                final int octave = 1;
                final int pulseWidth = 9;
                final int pwmSource = 10;
                final int pwmAmount = 11;
                final int semitone = 2;
                final int shape = 8;

                setupWriteOscillator(oscillator1);

                oscillator1.setShape(OneTwoShapes.BELLISH);
                oscillator1.setLimitWt(OffOn.ON);

                testWriteInsideBoundsOscillator(bendRange, brilliance, detune,
                                fmAmount, fmSource, keyTrack, octave,
                                pulseWidth, pwmSource, pwmAmount, semitone);

                assertEquals(OffOn.ON.value, patchData.getPayload()[limitWt]);
                assertEquals(OneTwoShapes.BELLISH.value,
                                patchData.getPayload()[shape]);

                testReadInsideBoundsOscillator(oscillator1);

                assertEquals(OneTwoShapes.BELLISH, oscillator1.getShape());
                assertEquals(OffOn.ON, oscillator1.getLimitWt());
        }

        @Test
        public final void testOscillator2() {
                final int bendRange = 20;
                final int brilliance = 32;
                final int detune = 19;
                final int fmAmount = 23;
                final int fmSource = 22;
                final int keyTrack = 21;
                final int limitWt = 30;
                final int octave = 17;
                final int pulseWidth = 25;
                final int pwmSource = 26;
                final int pwmAmount = 27;
                final int semitone = 18;
                final int shape = 24;

                setupWriteOscillator(oscillator2);

                oscillator2.setShape(OneTwoShapes.BELLISH);
                oscillator2.setLimitWt(OffOn.ON);

                testWriteInsideBoundsOscillator(bendRange, brilliance, detune,
                                fmAmount, fmSource, keyTrack, octave,
                                pulseWidth, pwmSource, pwmAmount, semitone);

                assertEquals(OffOn.ON.value, patchData.getPayload()[limitWt]);
                assertEquals(OneTwoShapes.BELLISH.value,
                                patchData.getPayload()[shape]);

                testReadInsideBoundsOscillator(oscillator2);

                assertEquals(OneTwoShapes.BELLISH, oscillator2.getShape());
                assertEquals(OffOn.ON, oscillator2.getLimitWt());
        }

        @Test
        public final void testOscillator3() {
                final int bendRange = 36;
                final int brilliance = 48;
                final int detune = 35;
                final int fmAmount = 39;
                final int fmSource = 38;
                final int keyTrack = 37;
                final int octave = 33;
                final int pulseWidth = 41;
                final int pwmSource = 42;
                final int pwmAmount = 43;
                final int semitone = 34;
                final int shape = 40;

                setupWriteOscillator(oscillator3);

                oscillator3.setShape(ThreeShapes.PULSE);

                testWriteInsideBoundsOscillator(bendRange, brilliance, detune,
                                fmAmount, fmSource, keyTrack, octave,
                                pulseWidth, pwmSource, pwmAmount, semitone);

                assertEquals(ThreeShapes.PULSE.value,
                                patchData.getPayload()[shape]);

                testReadInsideBoundsOscillator(oscillator3);

                assertEquals(ThreeShapes.PULSE, oscillator3.getShape());
        }

        private void testReadInsideBoundsOscillator(
                        final OscillatorBase oscillatorBase) {
                assertEquals(Minus24ToPlus24.MINUS14,
                                oscillatorBase.getBendRange());
                assertEquals(ZeroToPlus127.PLUS36,
                                oscillatorBase.getBrilliance());
                assertEquals(Minus64ToPlus63.PLUS17, oscillatorBase.getDetune());
                assertEquals(ZeroToPlus127.PLUS13, oscillatorBase.getFmAmount());
                assertEquals(FmSources.FILTER_ENV, oscillatorBase.getFmSource());
                assertEquals(Minus200PercentToPlus196Percent.MINUS119PERCENT,
                                oscillatorBase.getKeytrack());
                assertEquals(Octaves.FOOT16, oscillatorBase.getOctave());
                assertEquals(ZeroToPlus127.PLUS96,
                                oscillatorBase.getPulseWidth());
                assertEquals(ModulationSources.BREATH_CTRL,
                                oscillatorBase.getPwmSource());
                assertEquals(Minus64ToPlus63.MINUS41,
                                oscillatorBase.getPwmAmount());
                assertEquals(Minus12ToPlus12.MINUS4,
                                oscillatorBase.getSemitone());
        }

        private void testWriteInsideBoundsOscillator(final int bendRangeIndex,
                        final int brillianceIndex, final int detuneIndex,
                        final int fmAmountIndex, final int fmSourceIndex,
                        final int keyTrackIndex, final int octaveIndex,
                        final int pulseWidthIndex, final int pwmSourceIndex,
                        final int pwmAmountIndex, final int semitoneIndex) {
                assertEquals(Minus24ToPlus24.MINUS14.value,
                                patchData.getPayload()[bendRangeIndex]);
                assertEquals(ZeroToPlus127.PLUS36.value,
                                patchData.getPayload()[brillianceIndex]);
                assertEquals(Minus64ToPlus63.PLUS17.value,
                                patchData.getPayload()[detuneIndex]);
                assertEquals(ZeroToPlus127.PLUS13.value,
                                patchData.getPayload()[fmAmountIndex]);
                assertEquals(FmSources.FILTER_ENV.value,
                                patchData.getPayload()[fmSourceIndex]);
                assertEquals(Minus200PercentToPlus196Percent.MINUS119PERCENT.value,
                                patchData.getPayload()[keyTrackIndex]);
                assertEquals(Octaves.FOOT16.value,
                                patchData.getPayload()[octaveIndex]);
                assertEquals(ZeroToPlus127.PLUS96.value,
                                patchData.getPayload()[pulseWidthIndex]);
                assertEquals(ModulationSources.BREATH_CTRL.value,
                                patchData.getPayload()[pwmSourceIndex]);
                assertEquals(Minus64ToPlus63.MINUS41.value,
                                patchData.getPayload()[pwmAmountIndex]);
                assertEquals(Minus12ToPlus12.MINUS4.value,
                                patchData.getPayload()[semitoneIndex]);
        }
}
