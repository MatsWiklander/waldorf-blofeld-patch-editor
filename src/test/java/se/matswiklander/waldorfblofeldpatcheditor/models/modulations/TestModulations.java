package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationDestinations;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation1;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation10;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation11;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation12;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation13;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation14;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation15;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation16;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation2;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation3;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation4;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation5;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation6;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation7;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation8;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulation9;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.ModulationBase;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.modulations.Modulations;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestModulations {
        private PatchData patchData;
        private Modulation1 modulation1;
        private Modulation2 modulation2;
        private Modulation3 modulation3;
        private Modulation4 modulation4;
        private Modulation5 modulation5;
        private Modulation6 modulation6;
        private Modulation7 modulation7;
        private Modulation8 modulation8;
        private Modulation9 modulation9;
        private Modulation10 modulation10;
        private Modulation11 modulation11;
        private Modulation12 modulation12;
        private Modulation13 modulation13;
        private Modulation14 modulation14;
        private Modulation15 modulation15;
        private Modulation16 modulation16;

        @Before
        public final void setup() {
                patchData = new PatchData();

                modulation1 = new Modulation1(patchData);
                modulation2 = new Modulation2(patchData);
                modulation3 = new Modulation3(patchData);
                modulation4 = new Modulation4(patchData);
                modulation5 = new Modulation5(patchData);
                modulation6 = new Modulation6(patchData);
                modulation7 = new Modulation7(patchData);
                modulation8 = new Modulation8(patchData);
                modulation9 = new Modulation9(patchData);
                modulation10 = new Modulation10(patchData);
                modulation11 = new Modulation11(patchData);
                modulation12 = new Modulation12(patchData);
                modulation13 = new Modulation13(patchData);
                modulation14 = new Modulation14(patchData);
                modulation15 = new Modulation15(patchData);
                modulation16 = new Modulation16(patchData);
        }

        private void setupModulation(final ModulationBase modulationBase) {
                modulationBase.setAmount(Minus64ToPlus63.ZERO);
                modulationBase.setSource(ModulationSources.AMP_ENV);
                modulationBase.setDestination(ModulationDestinations.AE_ATTACK);
        }

        @Test
        public final void testModulation1() {
                final int source = 261;
                final int destination = 262;
                final int amount = 263;

                setupModulation(modulation1);

                testWriteInsideBoundsModulation(source, destination, amount);

                testReadInsideBoundsModulation(modulation1);
        }

        @Test
        public final void testModulation10() {
                final int source = 288;
                final int destination = 289;
                final int amount = 290;

                setupModulation(modulation10);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation11() {
                final int source = 291;
                final int destination = 292;
                final int amount = 293;

                setupModulation(modulation11);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation12() {
                final int source = 294;
                final int destination = 295;
                final int amount = 296;

                setupModulation(modulation12);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation13() {
                final int source = 297;
                final int destination = 298;
                final int amount = 299;

                setupModulation(modulation13);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation14() {
                final int source = 300;
                final int destination = 301;
                final int amount = 302;

                setupModulation(modulation14);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation15() {
                final int source = 303;
                final int destination = 304;
                final int amount = 305;

                setupModulation(modulation15);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation16() {
                final int source = 306;
                final int destination = 307;
                final int amount = 308;

                setupModulation(modulation16);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation2() {
                final int source = 264;
                final int destination = 265;
                final int amount = 266;

                setupModulation(modulation2);

                testWriteInsideBoundsModulation(source, destination, amount);

        }

        @Test
        public final void testModulation3() {
                final int source = 267;
                final int destination = 268;
                final int amount = 269;

                setupModulation(modulation3);

                testWriteInsideBoundsModulation(source, destination, amount);

        }

        @Test
        public final void testModulation4() {
                final int source = 270;
                final int destination = 271;
                final int amount = 272;

                setupModulation(modulation4);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation5() {
                final int source = 273;
                final int destination = 274;
                final int amount = 275;

                setupModulation(modulation5);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation6() {
                final int source = 276;
                final int destination = 277;
                final int amount = 278;

                setupModulation(modulation6);

                testWriteInsideBoundsModulation(source, destination, amount);

        }

        @Test
        public final void testModulation7() {
                final int source = 279;
                final int destination = 280;
                final int amount = 281;

                setupModulation(modulation7);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation8() {
                final int source = 282;
                final int destination = 283;
                final int amount = 284;

                setupModulation(modulation8);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulation9() {
                final int source = 285;
                final int destination = 286;
                final int amount = 287;

                setupModulation(modulation9);

                testWriteInsideBoundsModulation(source, destination, amount);
        }

        @Test
        public final void testModulations() {
                Modulations modulations = new Modulations(patchData);

                assertNotNull(modulations.getModulation1());
                assertNotNull(modulations.getModulation2());
                assertNotNull(modulations.getModulation3());
                assertNotNull(modulations.getModulation4());
                assertNotNull(modulations.getModulation5());
                assertNotNull(modulations.getModulation6());
                assertNotNull(modulations.getModulation7());
                assertNotNull(modulations.getModulation8());
                assertNotNull(modulations.getModulation9());
                assertNotNull(modulations.getModulation10());
                assertNotNull(modulations.getModulation11());
                assertNotNull(modulations.getModulation12());
                assertNotNull(modulations.getModulation13());
                assertNotNull(modulations.getModulation14());
                assertNotNull(modulations.getModulation15());
                assertNotNull(modulations.getModulation16());
        }

        private void testReadInsideBoundsModulation(
                        final ModulationBase modulationBase) {
                assertEquals(Minus64ToPlus63.ZERO, modulationBase.getAmount());
                assertEquals(ModulationSources.AMP_ENV,
                                modulationBase.getSource());
                assertEquals(ModulationDestinations.AE_ATTACK,
                                modulationBase.getDestination());
        }

        private void testWriteInsideBoundsModulation(final int source,
                        final int destination, final int amount) {
                assertEquals(Minus64ToPlus63.ZERO.value,
                                patchData.getPayload()[amount]);
                assertEquals(ModulationSources.AMP_ENV.value,
                                patchData.getPayload()[source]);
                assertEquals(ModulationDestinations.AE_ATTACK.value,
                                patchData.getPayload()[destination]);
        }
}
