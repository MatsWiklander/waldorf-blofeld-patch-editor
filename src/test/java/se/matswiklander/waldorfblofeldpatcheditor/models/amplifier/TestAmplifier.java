package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.amplifier;

import static org.junit.Assert.assertEquals;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.amplifier.Amplifier;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Test;

public class TestAmplifier {
        @Test
        public final void testAmplifier() {
                final int volume = 121;
                final int velocity = 122;
                final int modSource = 123;
                final int modAmount = 124;

                PatchData patchData = new PatchData();
                Amplifier amplifier = new Amplifier(patchData);

                amplifier.setVolume(ZeroToPlus127.PLUS104);
                amplifier.setVelocity(Minus64ToPlus63.PLUS59);
                amplifier.setModSource(ModulationSources.MAXIMUM);
                amplifier.setModAmount(Minus64ToPlus63.PLUS52);

                assertEquals(ZeroToPlus127.PLUS104.value,
                                patchData.getPayload()[volume]);
                assertEquals(Minus64ToPlus63.PLUS59.value,
                                patchData.getPayload()[velocity]);
                assertEquals(ModulationSources.MAXIMUM.value,
                                patchData.getPayload()[modSource]);
                assertEquals(Minus64ToPlus63.PLUS52.value,
                                patchData.getPayload()[modAmount]);

                assertEquals(ZeroToPlus127.PLUS104, amplifier.getVolume());
                assertEquals(Minus64ToPlus63.PLUS59, amplifier.getVelocity());
                assertEquals(ModulationSources.MAXIMUM,
                                amplifier.getModSource());
                assertEquals(Minus64ToPlus63.PLUS52, amplifier.getModAmount());
        }
}
