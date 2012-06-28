package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.DriveCurves;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.FmSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Left64ToRight63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Filter2 extends FilterBase {
        public Filter2(final PatchData patchData) {
                super(patchData, 97, 98, 100, 101, 102, 106, 107, 108, 109,
                                110, 111, 112, 113, 114, 115);

                // Init patch
                setType(Types.BYPASS);
                setCutoff(ZeroToPlus127.PLUS127);
                setResonance(ZeroToPlus127.ZERO);
                setDrive(ZeroToPlus127.ZERO);
                setDriveCurve(DriveCurves.CLIPPING);
                setKeyTrack(Minus200PercentToPlus196Percent.ZEROPERCENT);
                setEnvAmount(Minus64ToPlus63.ZERO);
                setEnvVelocity(Minus64ToPlus63.ZERO);
                setModSource(ModulationSources.OFF);
                setModAmount(Minus64ToPlus63.ZERO);
                setFmSource(FmSources.OFF);
                setFmAmount(OffToPlus127.OFF);
                setPan(Left64ToRight63.MIDDLE);
                setPanSource(ModulationSources.LFO_2);
                setPanAmount(Minus64ToPlus63.ZERO);
        }
}
