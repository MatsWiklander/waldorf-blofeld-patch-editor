package test.java.futureoperations.waldorfblofeldpatcheditor.models.oscillators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.AllocationModes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.GlideModes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.Oscillators;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.UnisonoModes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Test;

public class TestOscillators {
        @Test
        public final void testOscillators() {
                final int osc2SyncToO3 = 49;
                final int pitchSource = 50;
                final int pitchAmount = 51;
                final int glide = 53;
                final int glideMode = 56;
                final int glideRate = 57;
                final int allocationMode = 58;
                final int unisonoDetune = 59;

                PatchData patchData = new PatchData();
                Oscillators oscillators = new Oscillators(patchData);

                assertNotNull(oscillators.getOscillator1());
                assertNotNull(oscillators.getOscillator2());
                assertNotNull(oscillators.getOscillator3());

                oscillators.setUnisonoMode(UnisonoModes._4);
                oscillators.setAllocationMode(AllocationModes.MONO);
                oscillators.setGlide(OffOn.ON);
                oscillators.setGlideMode(GlideModes.PORTAMENTO);
                oscillators.setGlideRate(ZeroToPlus127.PLUS94);
                oscillators.setOsc2SyncToO3(OffOn.ON);
                oscillators.setPitchAmount(Minus64ToPlus63.MINUS13);
                oscillators.setPitchSource(ModulationSources.CONTROL_X);
                oscillators.setUnisonoDetune(ZeroToPlus127.PLUS96);

                assertEquals(49, patchData.getPayload()[allocationMode]);

                assertEquals(OffOn.ON.value, patchData.getPayload()[glide]);

                assertEquals(GlideModes.PORTAMENTO.value,
                                patchData.getPayload()[glideMode]);

                assertEquals(ZeroToPlus127.PLUS94.value,
                                patchData.getPayload()[glideRate]);

                assertEquals(OffOn.ON.value,
                                patchData.getPayload()[osc2SyncToO3]);

                assertEquals(Minus64ToPlus63.MINUS13.value,
                                patchData.getPayload()[pitchAmount]);

                assertEquals(ModulationSources.CONTROL_X.value,
                                patchData.getPayload()[pitchSource]);

                assertEquals(ZeroToPlus127.PLUS96.value,
                                patchData.getPayload()[unisonoDetune]);

                assertEquals(AllocationModes.MONO,
                                oscillators.getAllocationMode());
                assertEquals(OffOn.ON, oscillators.getGlide());
                assertEquals(GlideModes.PORTAMENTO, oscillators.getGlideMode());
                assertEquals(ZeroToPlus127.PLUS94, oscillators.getGlideRate());
                assertEquals(OffOn.ON, oscillators.getOsc2SyncToO3());
                assertEquals(Minus64ToPlus63.MINUS13,
                                oscillators.getPitchAmount());
                assertEquals(ModulationSources.CONTROL_X,
                                oscillators.getPitchSource());
                assertEquals(ZeroToPlus127.PLUS96,
                                oscillators.getUnisonoDetune());
                assertEquals(UnisonoModes._4, oscillators.getUnisonoMode());
        }
}
