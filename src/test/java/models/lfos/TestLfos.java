package test.java.models.lfos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.models.enums.Minus200PercentToPlus196Percent;
import main.java.models.enums.Minus64ToPlus63;
import main.java.models.enums.OffOn;
import main.java.models.enums.ZeroToPlus127;
import main.java.models.lfos.Clocks;
import main.java.models.lfos.FreeTo355Degree;
import main.java.models.lfos.Lfo1;
import main.java.models.lfos.Lfo2;
import main.java.models.lfos.Lfo3;
import main.java.models.lfos.LfoBase;
import main.java.models.lfos.Lfos;
import main.java.models.lfos.Shapes;
import main.java.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestLfos {
        private PatchData patchData;
        private Lfo1 lfo1;
        private Lfo2 lfo2;
        private Lfo3 lfo3;

        @Before
        public final void setup() {
                patchData = new PatchData();
                lfo1 = new Lfo1(patchData);
                lfo2 = new Lfo2(patchData);
                lfo3 = new Lfo3(patchData);

                setupWriteLfo(lfo1);
                setupWriteLfo(lfo2);
                setupWriteLfo(lfo3);
        }

        private void setupWriteLfo(final LfoBase lfoBase) {
                lfoBase.setShape(Shapes.SQUARE);
                lfoBase.setSpeed(Clocks._10_BARS_1);
                lfoBase.setSync(OffOn.OFF);
                lfoBase.setClocked(OffOn.ON);
                lfoBase.setStartPhase(FreeTo355Degree.DEGREE115);
                lfoBase.setDelay(ZeroToPlus127.PLUS70);
                lfoBase.setFade(Minus64ToPlus63.MINUS31);
                lfoBase.setKeyTrack(Minus200PercentToPlus196Percent.PLUS102PERCENT);
        }

        @Test
        public final void testLfo1() {
                final int shape = 160;
                final int speed = 161;
                final int sync = 163;
                final int clocked = 164;
                final int startPhase = 165;
                final int delay = 166;
                final int fade = 167;
                final int keyTrack = 170;

                testWriteInsideBoundsLfo(shape, speed, sync, clocked,
                                startPhase, delay, fade, keyTrack);

                testReadInsideBoundsLfo(lfo1, shape, speed, sync, clocked,
                                startPhase, delay, fade, keyTrack);
        }

        @Test
        public final void testLfo2() {
                final int shape = 172;
                final int speed = 173;
                final int sync = 175;
                final int clocked = 176;
                final int startPhase = 177;
                final int delay = 178;
                final int fade = 179;
                final int keyTrack = 182;

                testWriteInsideBoundsLfo(shape, speed, sync, clocked,
                                startPhase, delay, fade, keyTrack);
        }

        @Test
        public final void testLfo3() {
                final int shape = 184;
                final int speed = 185;
                final int sync = 187;
                final int clocked = 188;
                final int startPhase = 189;
                final int delay = 190;
                final int fade = 191;
                final int keyTrack = 194;

                testWriteInsideBoundsLfo(shape, speed, sync, clocked,
                                startPhase, delay, fade, keyTrack);
        }

        @Test
        public final void testLfos() {
                Lfos lfos = new Lfos(patchData);

                assertNotNull(lfos.getLfo1());
                assertNotNull(lfos.getLfo2());
                assertNotNull(lfos.getLfo3());
        }

        private void testReadInsideBoundsLfo(final LfoBase lfoBase,
                        final int shape, final int speed, final int sync,
                        final int clocked, final int startPhase,
                        final int delay, final int fade, final int keyTrack) {
                assertEquals(Shapes.SQUARE, lfoBase.getShape());
                assertEquals(Clocks._10_BARS_1, lfoBase.getSpeed());
                assertEquals(OffOn.OFF, lfoBase.getSync());
                assertEquals(OffOn.ON, lfoBase.getClocked());
                assertEquals(FreeTo355Degree.DEGREE115, lfoBase.getStartPhase());
                assertEquals(ZeroToPlus127.PLUS70, lfoBase.getDelay());
                assertEquals(Minus64ToPlus63.MINUS31, lfoBase.getFade());
                assertEquals(Minus200PercentToPlus196Percent.PLUS102PERCENT,
                                lfoBase.getKeyTrack());
        }

        private void testWriteInsideBoundsLfo(final int shape, final int speed,
                        final int sync, final int clocked,
                        final int startPhase, final int delay, final int fade,
                        final int keyTrack) {
                assertEquals(Shapes.SQUARE.value, patchData.getPayload()[shape]);
                assertEquals(Clocks._10_BARS_1.value,
                                patchData.getPayload()[speed]);
                assertEquals(OffOn.OFF.value, patchData.getPayload()[sync]);
                assertEquals(OffOn.ON.value, patchData.getPayload()[clocked]);
                assertEquals(FreeTo355Degree.DEGREE115.value,
                                patchData.getPayload()[startPhase]);
                assertEquals(ZeroToPlus127.PLUS70.value,
                                patchData.getPayload()[delay]);
                assertEquals(Minus64ToPlus63.MINUS31.value,
                                patchData.getPayload()[fade]);
                assertEquals(Minus200PercentToPlus196Percent.PLUS102PERCENT.value,
                                patchData.getPayload()[keyTrack]);
        }
}
