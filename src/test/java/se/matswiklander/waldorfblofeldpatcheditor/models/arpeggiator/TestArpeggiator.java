package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Arpeggiator;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Clocks;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Directions;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Lengths;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Modes;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.OneTo10;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.OneTo16;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Patterns;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.SortOrders;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Tempos;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.arpeggiator.Velocities;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Test;

public class TestArpeggiator {
        @Test
        public final void testArpeggiator() {
                PatchData patchData = new PatchData();
                Arpeggiator arpeggiator = new Arpeggiator(patchData);

                final int mode = 311;
                final int pattern = 312;
                final int clock = 314;
                final int length = 315;
                final int octave = 316;
                final int direction = 317;
                final int sortOrder = 318;
                final int velocity = 319;
                final int timingFactor = 320;
                final int patternReset = 322;
                final int patternLength = 323;
                final int tempo = 326;

                arpeggiator.setMode(Modes.ONE_SHOT);
                arpeggiator.setPattern(Patterns.PATTERN12);
                arpeggiator.setClock(Clocks._1_16DOT);
                arpeggiator.setLength(Lengths._12_BARS);
                arpeggiator.setOctave(OneTo10._2);
                arpeggiator.setDirection(Directions.ALT_UP);
                arpeggiator.setSortOrder(SortOrders.AS_PLAYED);
                arpeggiator.setVelocity(Velocities.FIX_32);
                arpeggiator.setTimingFactor(ZeroToPlus127.PLUS108);
                arpeggiator.setPatternReset(OffOn.ON);
                arpeggiator.setPatternLength(OneTo16._10);
                arpeggiator.setTempo(Tempos.BPM106);

                assertEquals(Modes.ONE_SHOT.value, patchData.getPayload()[mode]);
                assertEquals(Patterns.PATTERN12.value,
                                patchData.getPayload()[pattern]);
                assertEquals(Clocks._1_16DOT.value,
                                patchData.getPayload()[clock]);
                assertEquals(Lengths._12_BARS.value,
                                patchData.getPayload()[length]);
                assertEquals(OneTo10._2.value, patchData.getPayload()[octave]);
                assertEquals(Directions.ALT_UP.value,
                                patchData.getPayload()[direction]);
                assertEquals(SortOrders.AS_PLAYED.value,
                                patchData.getPayload()[sortOrder]);
                assertEquals(Velocities.FIX_32.value,
                                patchData.getPayload()[velocity]);
                assertEquals(ZeroToPlus127.PLUS108.value,
                                patchData.getPayload()[timingFactor]);
                assertEquals(OffOn.ON.value,
                                patchData.getPayload()[patternReset]);
                assertEquals(OneTo16._10.value,
                                patchData.getPayload()[patternLength]);
                assertEquals(Tempos.BPM106.value, patchData.getPayload()[tempo]);

                assertEquals(Modes.ONE_SHOT, arpeggiator.getMode());
                assertEquals(Patterns.PATTERN12, arpeggiator.getPattern());
                assertEquals(Clocks._1_16DOT, arpeggiator.getClock());
                assertEquals(Lengths._12_BARS, arpeggiator.getLength());
                assertEquals(OneTo10._2, arpeggiator.getOctave());
                assertEquals(Directions.ALT_UP, arpeggiator.getDirection());
                assertEquals(SortOrders.AS_PLAYED, arpeggiator.getSortOrder());
                assertEquals(Velocities.FIX_32, arpeggiator.getVelocity());
                assertEquals(ZeroToPlus127.PLUS108,
                                arpeggiator.getTimingFactor());
                assertEquals(OffOn.ON, arpeggiator.getPatternReset());
                assertEquals(OneTo16._10, arpeggiator.getPatternLength());
                assertEquals(Tempos.BPM106, arpeggiator.getTempo());

                assertNotNull(arpeggiator.getPatterns());
        }
}
