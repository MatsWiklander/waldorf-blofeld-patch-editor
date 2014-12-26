package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.filters;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.DriveCurves;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.FmSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Left64ToRight63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.OffToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

public class Filter1 extends FilterBase {
        public Filter1(final PatchData patchData) {
                super(patchData, 77, 78, 80, 81, 82, 86, 87, 88, 89, 90, 91,
                                92, 93, 94, 95);

                // Init patch
                setType(Types.LP_24DB);
                setCutoff(ZeroToPlus127.PLUS127);
                setResonance(ZeroToPlus127.ZERO);
                setDrive(ZeroToPlus127.ZERO);
                setDriveCurve(DriveCurves.CLIPPING);
                setKeyTrack(Minus200PercentToPlus196Percent.ZEROPERCENT);
                setEnvAmount(Minus64ToPlus63.ZERO);
                setEnvVelocity(Minus64ToPlus63.ZERO);
                setModSource(ModulationSources.LFO_1);
                setModAmount(Minus64ToPlus63.ZERO);
                setFmSource(FmSources.OFF);
                setFmAmount(OffToPlus127.OFF);
                setPan(Left64ToRight63.MIDDLE);
                setPanSource(ModulationSources.LFO_1);
                setPanAmount(Minus64ToPlus63.ZERO);
        }
}
