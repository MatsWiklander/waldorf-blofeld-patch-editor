package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes.AmplifierEnvelope;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes.Envelope3;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes.Envelope4;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes.EnvelopeBase;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes.Envelopes;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes.FilterEnvelope;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes.Modes;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.envelopes.Triggers;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestEnvelopes {
        private AmplifierEnvelope amplifierEnvelope;
        private FilterEnvelope filterEnvelope;
        private Envelope3 envelope3;
        private Envelope4 envelope4;
        private PatchData patchData;

        @Before
        public final void setup() {
                patchData = new PatchData();

                amplifierEnvelope = new AmplifierEnvelope(patchData);
                filterEnvelope = new FilterEnvelope(patchData);
                envelope3 = new Envelope3(patchData);
                envelope4 = new Envelope4(patchData);

                setupEnvelope(amplifierEnvelope);
                setupEnvelope(filterEnvelope);
                setupEnvelope(envelope3);
                setupEnvelope(envelope4);
        }

        private void setupEnvelope(final EnvelopeBase envelopeBase) {
                envelopeBase.setAttack(ZeroToPlus127.PLUS119);
                envelopeBase.setAttackLevel(ZeroToPlus127.PLUS83);
                envelopeBase.setDecay(ZeroToPlus127.PLUS11);
                envelopeBase.setDecay2(ZeroToPlus127.PLUS122);
                envelopeBase.setMode(Modes.LOOP_ALL);
                envelopeBase.setTrigger(Triggers.NORMAL);
                envelopeBase.setRelease(ZeroToPlus127.PLUS13);
                envelopeBase.setSustain(ZeroToPlus127.PLUS19);
                envelopeBase.setSustain2(ZeroToPlus127.PLUS84);
        }

        @Test
        public final void testAmplifierEnvelope() {
                final int attack = 211;
                final int attackLevel = 212;
                final int decay = 213;
                final int decay2 = 215;
                final int mode = 208;
                final int release = 217;
                final int sustain = 214;
                final int sustain2 = 216;

                testWriteInsideBoundsEnvelope(attack, attackLevel, decay,
                                decay2, mode, release, sustain, sustain2);

                testReadInsideBoundsEnvelope(amplifierEnvelope, attack,
                                attackLevel, decay, decay2, mode, release,
                                sustain, sustain2);
        }

        @Test
        public final void testEnvelope3() {
                final int attack = 223;
                final int attackLevel = 224;
                final int decay = 225;
                final int decay2 = 227;
                final int mode = 220;
                final int release = 229;
                final int sustain = 226;
                final int sustain2 = 228;

                testWriteInsideBoundsEnvelope(attack, attackLevel, decay,
                                decay2, mode, release, sustain, sustain2);
        }

        @Test
        public final void testEnvelope4() {
                final int attack = 235;
                final int attackLevel = 236;
                final int decay = 237;
                final int decay2 = 239;
                final int mode = 232;
                final int release = 241;
                final int sustain = 238;
                final int sustain2 = 240;

                testWriteInsideBoundsEnvelope(attack, attackLevel, decay,
                                decay2, mode, release, sustain, sustain2);
        }

        @Test
        public final void testEnvelopes() {
                Envelopes envelopes = new Envelopes(patchData);

                assertNotNull(envelopes.getAmplifierEnvelope());
                assertNotNull(envelopes.getFilterEnvelope());
                assertNotNull(envelopes.getEnvelope3());
                assertNotNull(envelopes.getEnvelope4());
        }

        @Test
        public final void testFilterEnvelope() {
                final int attack = 199;
                final int attackLevel = 200;
                final int decay = 201;
                final int decay2 = 203;
                final int mode = 196;
                final int release = 205;
                final int sustain = 202;
                final int sustain2 = 204;

                testWriteInsideBoundsEnvelope(attack, attackLevel, decay,
                                decay2, mode, release, sustain, sustain2);
        }

        private void testReadInsideBoundsEnvelope(
                        final EnvelopeBase envelopeBase, final int attack,
                        final int attackLevel, final int decay,
                        final int decay2, final int mode, final int release,
                        final int sustain, final int sustain2) {
                assertEquals(ZeroToPlus127.PLUS119, envelopeBase.getAttack());
                assertEquals(ZeroToPlus127.PLUS83,
                                envelopeBase.getAttackLevel());
                assertEquals(ZeroToPlus127.PLUS11, envelopeBase.getDecay());
                assertEquals(ZeroToPlus127.PLUS122, envelopeBase.getDecay2());
                assertEquals(Modes.LOOP_ALL, envelopeBase.getMode());
                assertEquals(Triggers.NORMAL, envelopeBase.getTrigger());
                assertEquals(ZeroToPlus127.PLUS13, envelopeBase.getRelease());
                assertEquals(ZeroToPlus127.PLUS19, envelopeBase.getSustain());
                assertEquals(ZeroToPlus127.PLUS84, envelopeBase.getSustain2());
        }

        private void testWriteInsideBoundsEnvelope(final int attack,
                        final int attackLevel, final int decay,
                        final int decay2, final int mode, final int release,
                        final int sustain, final int sustain2) {
                assertEquals(ZeroToPlus127.PLUS119.value,
                                patchData.getPayload()[attack]);
                assertEquals(ZeroToPlus127.PLUS83.value,
                                patchData.getPayload()[attackLevel]);
                assertEquals(ZeroToPlus127.PLUS11.value,
                                patchData.getPayload()[decay]);
                assertEquals(ZeroToPlus127.PLUS122.value,
                                patchData.getPayload()[decay2]);
                assertEquals(Modes.LOOP_ALL.value,
                                patchData.getValue(mode, 0, 5));
                assertEquals(Triggers.NORMAL.value,
                                patchData.getValue(mode, 5, 2));
                assertEquals(ZeroToPlus127.PLUS13.value,
                                patchData.getPayload()[release]);
                assertEquals(ZeroToPlus127.PLUS19.value,
                                patchData.getPayload()[sustain]);
                assertEquals(ZeroToPlus127.PLUS84.value,
                                patchData.getPayload()[sustain2]);
        }
}
