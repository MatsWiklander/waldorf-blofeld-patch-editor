package test.java.futureoperations.waldorfblofeldpatcheditor.models.filters;

import static org.junit.Assert.assertEquals;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.DriveCurves;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.FmSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Left64ToRight63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus200PercentToPlus196Percent;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Filter1;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Filter2;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.FilterBase;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Types;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestFilter12 {
        private Filter1 filter1;
        private Filter2 filter2;
        private PatchData patchData;

        @Before
        public final void setup() {
                patchData = new PatchData();
                filter1 = new Filter1(patchData);
                filter2 = new Filter2(patchData);

                setupFilter(filter1);
                setupFilter(filter2);
        }

        private void setupFilter(final FilterBase filterBase) {
                filterBase.setType(Types.COMB_PLUS);
                filterBase.setCutoff(ZeroToPlus127.PLUS104);
                filterBase.setResonance(ZeroToPlus127.PLUS11);
                filterBase.setDrive(ZeroToPlus127.PLUS120);
                filterBase.setDriveCurve(DriveCurves.HARD);
                filterBase.setKeyTrack(Minus200PercentToPlus196Percent.MINUS103PERCENT);
                filterBase.setEnvAmount(Minus64ToPlus63.PLUS56);
                filterBase.setEnvVelocity(Minus64ToPlus63.MINUS46);
                filterBase.setModSource(ModulationSources.CONTROL_Z);
                filterBase.setModAmount(Minus64ToPlus63.PLUS25);
                filterBase.setFmSource(FmSources.LFO_2);
                filterBase.setFmAmount(OffToPlus127.PLUS40);
                filterBase.setPan(Left64ToRight63.RIGHT_17);
                filterBase.setPanSource(ModulationSources.FOOT_CTRL);
                filterBase.setPanAmount(Minus64ToPlus63.MINUS32);
        }

        @Test
        public final void testFilter1() {
                final int type = 77;
                final int cutoff = 78;
                final int resonance = 80;
                final int drive = 81;
                final int driveCurve = 82;
                final int keyTrack = 86;
                final int envAmount = 87;
                final int envVelocity = 88;
                final int modSource = 89;
                final int modAmount = 90;
                final int fmSource = 91;
                final int fmAmount = 92;
                final int pan = 93;
                final int panSource = 94;
                final int panAmount = 95;

                testWriteInsideBoundsFilter(type, cutoff, resonance, drive,
                                driveCurve, keyTrack, envAmount, envVelocity,
                                modSource, modAmount, fmSource, fmAmount, pan,
                                panSource, panAmount);

                testReadInsideBoundsFilter(filter1, type, cutoff, resonance,
                                drive, driveCurve, keyTrack, envAmount,
                                envVelocity, modSource, modAmount, fmSource,
                                fmAmount, pan, panSource, panAmount);
        }

        @Test
        public final void testFilter2() {
                final int type = 97;
                final int cutoff = 98;
                final int resonance = 100;
                final int drive = 101;
                final int driveCurve = 102;
                final int keyTrack = 106;
                final int envAmount = 107;
                final int envVelocity = 108;
                final int modSource = 109;
                final int modAmount = 110;
                final int fmSource = 111;
                final int fmAmount = 112;
                final int pan = 113;
                final int panSource = 114;
                final int panAmount = 115;

                testWriteInsideBoundsFilter(type, cutoff, resonance, drive,
                                driveCurve, keyTrack, envAmount, envVelocity,
                                modSource, modAmount, fmSource, fmAmount, pan,
                                panSource, panAmount);
        }

        private void testReadInsideBoundsFilter(final FilterBase filterBase,
                        final int type, final int cutoff, final int resonance,
                        final int drive, final int driveCurve,
                        final int keyTrack, final int envAmount,
                        final int envVelocity, final int modSource,
                        final int modAmount, final int fmSource,
                        final int fmAmount, final int pan, final int panSource,
                        final int panAmount) {
                assertEquals(Types.COMB_PLUS, filterBase.getType());
                assertEquals(ZeroToPlus127.PLUS104, filterBase.getCutoff());
                assertEquals(ZeroToPlus127.PLUS11, filterBase.getResonance());
                assertEquals(ZeroToPlus127.PLUS120, filterBase.getDrive());
                assertEquals(DriveCurves.HARD, filterBase.getDriveCurve());
                assertEquals(Minus200PercentToPlus196Percent.MINUS103PERCENT,
                                filterBase.getKeyTrack());
                assertEquals(Minus64ToPlus63.PLUS56, filterBase.getEnvAmount());
                assertEquals(Minus64ToPlus63.MINUS46,
                                filterBase.getEnvVelocity());
                assertEquals(ModulationSources.CONTROL_Z,
                                filterBase.getModSource());
                assertEquals(Minus64ToPlus63.PLUS25, filterBase.getModAmount());
                assertEquals(FmSources.LFO_2, filterBase.getFmSource());
                assertEquals(OffToPlus127.PLUS40, filterBase.getFmAmount());
                assertEquals(Left64ToRight63.RIGHT_17, filterBase.getPan());
                assertEquals(ModulationSources.FOOT_CTRL,
                                filterBase.getPanSource());
                assertEquals(Minus64ToPlus63.MINUS32, filterBase.getPanAmount());
        }

        private void testWriteInsideBoundsFilter(final int type,
                        final int cutoff, final int resonance, final int drive,
                        final int driveCurve, final int keyTrack,
                        final int envAmount, final int envVelocity,
                        final int modSource, final int modAmount,
                        final int fmSource, final int fmAmount, final int pan,
                        final int panSource, final int panAmount) {
                assertEquals(Types.COMB_PLUS.value,
                                patchData.getPayload()[type]);
                assertEquals(ZeroToPlus127.PLUS104.value,
                                patchData.getPayload()[cutoff]);
                assertEquals(ZeroToPlus127.PLUS11.value,
                                patchData.getPayload()[resonance]);
                assertEquals(ZeroToPlus127.PLUS120.value,
                                patchData.getPayload()[drive]);
                assertEquals(DriveCurves.HARD.value,
                                patchData.getPayload()[driveCurve]);
                assertEquals(Minus200PercentToPlus196Percent.MINUS103PERCENT.value,
                                patchData.getPayload()[keyTrack]);
                assertEquals(Minus64ToPlus63.PLUS56.value,
                                patchData.getPayload()[envAmount]);
                assertEquals(Minus64ToPlus63.MINUS46.value,
                                patchData.getPayload()[envVelocity]);
                assertEquals(ModulationSources.CONTROL_Z.value,
                                patchData.getPayload()[modSource]);
                assertEquals(Minus64ToPlus63.PLUS25.value,
                                patchData.getPayload()[modAmount]);
                assertEquals(FmSources.LFO_2.value,
                                patchData.getPayload()[fmSource]);
                assertEquals(OffToPlus127.PLUS40.value,
                                patchData.getPayload()[fmAmount]);
                assertEquals(Left64ToRight63.RIGHT_17.value,
                                patchData.getPayload()[pan]);
                assertEquals(ModulationSources.FOOT_CTRL.value,
                                patchData.getPayload()[panSource]);
                assertEquals(Minus64ToPlus63.MINUS32.value,
                                patchData.getPayload()[panAmount]);
        }
}
