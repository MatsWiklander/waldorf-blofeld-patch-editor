package main.java.models.modulations;

import main.java.models.enums.ModulationDestinations;
import main.java.models.enums.ModulationSources;
import main.java.models.patch.PatchData;

public class Modulation1 extends ModulationBase {
        public Modulation1(final PatchData patchData) {
                super(patchData, 261, 262, 263);

                // Init patch
                setSource(ModulationSources.LFO_1);
                setDestination(ModulationDestinations.O1_PITCH);
        }
}
