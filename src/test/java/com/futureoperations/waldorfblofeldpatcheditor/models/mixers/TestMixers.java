package test.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.F164ToF263;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.MixerBase;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.MixerNoise;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.MixerOscillator1;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.MixerOscillator2;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.MixerOscillator3;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.MixerRingModulation;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.Mixers;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Test;

public class TestMixers {
        private PatchData patchData;
        private Mixers mixers;
        private MixerNoise mixerNoise;
        private MixerOscillator1 mixerOscillator1;
        private MixerOscillator2 mixerOscillator2;
        private MixerOscillator3 mixerOscillator3;
        private MixerRingModulation mixerRingModulation;

        private void setupMixer(final MixerBase mixerBase) {
                mixerBase.setBalance(F164ToF263.F1_60);
                mixerBase.setLevel(ZeroToPlus127.PLUS113);
        }

        @Test
        public final void testMixerNoise() {
                final int level = 67;
                final int balance = 68;
                final int color = 69;

                patchData = new PatchData();
                mixerNoise = new MixerNoise(patchData);

                setupMixer(mixerNoise);

                mixerNoise.setColor(Minus64ToPlus63.MINUS14);

                testWriteInsideBoundsMixer(level, balance);

                assertEquals(Minus64ToPlus63.MINUS14.value,
                                patchData.getPayload()[color]);

                assertEquals(Minus64ToPlus63.MINUS14, mixerNoise.getColor());
                assertEquals(F164ToF263.F1_60, mixerNoise.getBalance());
                assertEquals(ZeroToPlus127.PLUS113, mixerNoise.getLevel());
        }

        @Test
        public final void testMixerOscillator1() {
                final int level = 61;
                final int balance = 62;

                patchData = new PatchData();
                mixerOscillator1 = new MixerOscillator1(patchData);

                setupMixer(mixerOscillator1);

                testWriteInsideBoundsMixer(level, balance);
        }

        @Test
        public final void testMixerOscillator2() {
                final int level = 63;
                final int balance = 64;

                patchData = new PatchData();
                mixerOscillator2 = new MixerOscillator2(patchData);

                setupMixer(mixerOscillator2);

                testWriteInsideBoundsMixer(level, balance);
        }

        @Test
        public final void testMixerOscillator3() {
                final int level = 65;
                final int balance = 66;

                patchData = new PatchData();
                mixerOscillator3 = new MixerOscillator3(patchData);

                setupMixer(mixerOscillator3);

                testWriteInsideBoundsMixer(level, balance);
        }

        @Test
        public final void testMixerRingModulation() {
                final int level = 71;
                final int balance = 72;

                patchData = new PatchData();
                mixerRingModulation = new MixerRingModulation(patchData);

                setupMixer(mixerRingModulation);

                testWriteInsideBoundsMixer(level, balance);
        }

        @Test
        public final void testMixers() {
                patchData = new PatchData();
                mixers = new Mixers(patchData);

                assertNotNull(mixers.getMixerNoise());
                assertNotNull(mixers.getMixerOscillator1());
                assertNotNull(mixers.getMixerOscillator2());
                assertNotNull(mixers.getMixerOscillator3());
                assertNotNull(mixers.getMixerRingModulation());
        }

        private void testWriteInsideBoundsMixer(final int level,
                        final int balance) {
                assertEquals(F164ToF263.F1_60.value,
                                patchData.getPayload()[balance]);
                assertEquals(ZeroToPlus127.PLUS113.value,
                                patchData.getPayload()[level]);
        }
}
