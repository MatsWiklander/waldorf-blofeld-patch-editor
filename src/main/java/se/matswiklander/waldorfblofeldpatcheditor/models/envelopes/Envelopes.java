package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Envelopes {
        private final AmplifierEnvelope amplifierEnvelope;
        private final FilterEnvelope filterEnvelope;
        private final Envelope3 envelope3;
        private final Envelope4 envelope4;

        public Envelopes(final PatchData patchData) {
                amplifierEnvelope = new AmplifierEnvelope(patchData);
                filterEnvelope = new FilterEnvelope(patchData);
                envelope3 = new Envelope3(patchData);
                envelope4 = new Envelope4(patchData);

                // Init patch
        }

        public final AmplifierEnvelope getAmplifierEnvelope() {
                return amplifierEnvelope;
        }

        public final Envelope3 getEnvelope3() {
                return envelope3;
        }

        public final Envelope4 getEnvelope4() {
                return envelope4;
        }

        public final FilterEnvelope getFilterEnvelope() {
                return filterEnvelope;
        }
}
