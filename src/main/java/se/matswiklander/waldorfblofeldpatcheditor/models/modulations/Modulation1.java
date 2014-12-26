package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationDestinations;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Modulation1 extends ModulationBase {
        public Modulation1(final PatchData patchData) {
                super(patchData, 261, 262, 263);

                // Init patch
                setSource(ModulationSources.LFO_1);
                setDestination(ModulationDestinations.O1_PITCH);
        }
}
