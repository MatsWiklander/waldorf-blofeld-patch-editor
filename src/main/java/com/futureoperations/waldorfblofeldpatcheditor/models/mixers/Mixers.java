package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Mixers {
        private final MixerNoise mixerNoise;
        private final MixerOscillator1 mixerOscillator1;
        private final MixerOscillator2 mixerOscillator2;
        private final MixerOscillator3 mixerOscillator3;
        private final MixerRingModulation mixerRingModulation;

        public Mixers(final PatchData patchData) {
                mixerNoise = new MixerNoise(patchData);
                mixerOscillator1 = new MixerOscillator1(patchData);
                mixerOscillator2 = new MixerOscillator2(patchData);
                mixerOscillator3 = new MixerOscillator3(patchData);
                mixerRingModulation = new MixerRingModulation(patchData);
        }

        public final MixerNoise getMixerNoise() {
                return mixerNoise;
        }

        public final MixerOscillator1 getMixerOscillator1() {
                return mixerOscillator1;
        }

        public final MixerOscillator2 getMixerOscillator2() {
                return mixerOscillator2;
        }

        public final MixerOscillator3 getMixerOscillator3() {
                return mixerOscillator3;
        }

        public final MixerRingModulation getMixerRingModulation() {
                return mixerRingModulation;
        }
}
