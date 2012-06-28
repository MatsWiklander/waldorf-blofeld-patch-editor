package test.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Accents;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Lengths;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern1;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern10;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern11;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern12;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern13;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern14;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern15;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern16;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern2;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern3;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern4;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern5;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern6;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern7;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern8;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Pattern9;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.PatternBase;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Patterns;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Steps;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.patterns.Timings;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.OffOn;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestPatterns {
        private Pattern1 pattern1;
        private Pattern2 pattern2;
        private Pattern3 pattern3;
        private Pattern4 pattern4;
        private Pattern5 pattern5;
        private Pattern6 pattern6;
        private Pattern7 pattern7;
        private Pattern8 pattern8;
        private Pattern9 pattern9;
        private Pattern10 pattern10;
        private Pattern11 pattern11;
        private Pattern12 pattern12;
        private Pattern13 pattern13;
        private Pattern14 pattern14;
        private Pattern15 pattern15;
        private Pattern16 pattern16;

        private PatchData patchData;

        @Before
        public final void setup() {
                patchData = new PatchData();

                pattern1 = new Pattern1(patchData);
                pattern2 = new Pattern2(patchData);
                pattern3 = new Pattern3(patchData);
                pattern4 = new Pattern4(patchData);
                pattern5 = new Pattern5(patchData);
                pattern6 = new Pattern6(patchData);
                pattern7 = new Pattern7(patchData);
                pattern8 = new Pattern8(patchData);
                pattern9 = new Pattern9(patchData);
                pattern10 = new Pattern10(patchData);
                pattern11 = new Pattern11(patchData);
                pattern12 = new Pattern12(patchData);
                pattern13 = new Pattern13(patchData);
                pattern14 = new Pattern14(patchData);
                pattern15 = new Pattern15(patchData);
                pattern16 = new Pattern16(patchData);
        }

        private void setupReadPattern(final int pattern, final int timing) {
                patchData.getPayload()[pattern] = 54;
                patchData.getPayload()[timing] = 49;
        }

        private void setupWritePattern(final PatternBase patternBase) {
                patternBase.setAccent(Accents.PLUS32);
                patternBase.setGlide(OffOn.ON);
                patternBase.setLength(Lengths.MINUS2);
                patternBase.setStep(Steps.FIRST_PLUS_LAST);
                patternBase.setTiming(Timings.PLUS1);
        }

        @Test
        public final void testPatterns() {
                Patterns patterns = new Patterns(patchData);

                assertNotNull(patterns.getPattern1());
                assertNotNull(patterns.getPattern2());
                assertNotNull(patterns.getPattern3());
                assertNotNull(patterns.getPattern4());
                assertNotNull(patterns.getPattern5());
                assertNotNull(patterns.getPattern6());
                assertNotNull(patterns.getPattern7());
                assertNotNull(patterns.getPattern8());
                assertNotNull(patterns.getPattern9());
                assertNotNull(patterns.getPattern10());
                assertNotNull(patterns.getPattern11());
                assertNotNull(patterns.getPattern12());
                assertNotNull(patterns.getPattern13());
                assertNotNull(patterns.getPattern14());
                assertNotNull(patterns.getPattern15());
                assertNotNull(patterns.getPattern16());

        }

        private void testReadInsideBoundsPattern(final PatternBase patternBase) {
                assertEquals(Steps.FIRST, patternBase.getStep());
                assertEquals(OffOn.OFF, patternBase.getGlide());
                assertEquals(Accents.PLUS64, patternBase.getAccent());

                assertEquals(Timings.MINUS3, patternBase.getTiming());
                assertEquals(Lengths.MINUS1, patternBase.getLength());
        }

        @Test
        public final void testReadPattern1() {
                final int pattern = 327;
                final int timing = 343;

                setupReadPattern(pattern, timing);

                testReadInsideBoundsPattern(pattern1);
        }

        private void testWriteInsideBoundsPattern(final int pattern,
                        final int timing) {
                assertEquals(93, patchData.getPayload()[pattern]);
                assertEquals(37, patchData.getPayload()[timing]);
        }

        @Test
        public final void testWritePattern1() {
                final int pattern = 327;
                final int timing = 343;

                setupWritePattern(pattern1);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern10() {
                final int pattern = 336;
                final int timing = 352;

                setupWritePattern(pattern10);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern11() {
                final int pattern = 337;
                final int timing = 353;

                setupWritePattern(pattern11);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern12() {
                final int pattern = 338;
                final int timing = 354;

                setupWritePattern(pattern12);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern13() {
                final int pattern = 339;
                final int timing = 355;

                setupWritePattern(pattern13);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern14() {
                final int pattern = 340;
                final int timing = 356;

                setupWritePattern(pattern14);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern15() {
                final int pattern = 341;
                final int timing = 357;

                setupWritePattern(pattern15);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern16() {
                final int pattern = 342;
                final int timing = 358;

                setupWritePattern(pattern16);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern2() {
                final int pattern = 328;
                final int timing = 344;

                setupWritePattern(pattern2);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern3() {
                final int pattern = 329;
                final int timing = 345;

                setupWritePattern(pattern3);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern4() {
                final int pattern = 330;
                final int timing = 346;

                setupWritePattern(pattern4);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern5() {
                final int pattern = 331;
                final int timing = 347;

                setupWritePattern(pattern5);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern6() {
                final int pattern = 332;
                final int timing = 348;

                setupWritePattern(pattern6);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern7() {
                final int pattern = 333;
                final int timing = 349;

                setupWritePattern(pattern7);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern8() {
                final int pattern = 334;
                final int timing = 350;

                setupWritePattern(pattern8);

                testWriteInsideBoundsPattern(pattern, timing);
        }

        @Test
        public final void testWritePattern9() {
                final int pattern = 335;
                final int timing = 351;

                setupWritePattern(pattern9);

                testWriteInsideBoundsPattern(pattern, timing);
        }
}
