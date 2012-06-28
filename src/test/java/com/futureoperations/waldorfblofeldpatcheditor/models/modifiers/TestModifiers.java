package test.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ModulationSources;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Modifier1;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Modifier2;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Modifier3;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Modifier4;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.ModifierBase;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Modifiers;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Operators;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestModifiers {
        private Modifier1 modifier1;
        private Modifier2 modifier2;
        private Modifier3 modifier3;
        private Modifier4 modifier4;

        private PatchData patchData;

        @Before
        public final void setup() {
                patchData = new PatchData();
                modifier1 = new Modifier1(patchData);
                modifier2 = new Modifier2(patchData);
                modifier3 = new Modifier3(patchData);
                modifier4 = new Modifier4(patchData);

                setupModifier(modifier1);
                setupModifier(modifier2);
                setupModifier(modifier3);
                setupModifier(modifier4);
        }

        private void setupModifier(final ModifierBase modifierBase) {
                modifierBase.setSourceA(ModulationSources.CONTROL_Z);
                modifierBase.setSourceB(ModulationSources.FOOT_CTRL);
                modifierBase.setOperation(Operators.OR);
                modifierBase.setConstant(Minus64ToPlus63.MINUS19);
        }

        @Test
        public final void testModifier1() {
                final int sourceA = 245;
                final int sourceB = 246;
                final int operation = 247;
                final int constant = 248;

                testWriteInsideBoundsModifier(sourceA, sourceB, operation,
                                constant);

                testReadInsideBoundsModifier(modifier1);
        }

        @Test
        public final void testModifier2() {
                final int sourceA = 249;
                final int sourceB = 250;
                final int operation = 251;
                final int constant = 252;

                testWriteInsideBoundsModifier(sourceA, sourceB, operation,
                                constant);
        }

        @Test
        public final void testModifier3() {
                final int sourceA = 253;
                final int sourceB = 254;
                final int operation = 255;
                final int constant = 256;

                testWriteInsideBoundsModifier(sourceA, sourceB, operation,
                                constant);
        }

        @Test
        public final void testModifier4() {
                final int sourceA = 257;
                final int sourceB = 258;
                final int operation = 259;
                final int constant = 260;

                testWriteInsideBoundsModifier(sourceA, sourceB, operation,
                                constant);
        }

        @Test
        public final void testModifiers() {
                Modifiers modifiers = new Modifiers(patchData);

                assertNotNull(modifiers.getModifer1());
                assertNotNull(modifiers.getModifer2());
                assertNotNull(modifiers.getModifer3());
                assertNotNull(modifiers.getModifer4());
        }

        private void testReadInsideBoundsModifier(
                        final ModifierBase modifierBase) {
                assertEquals(ModulationSources.CONTROL_Z,
                                modifierBase.getSourceA());
                assertEquals(ModulationSources.FOOT_CTRL,
                                modifierBase.getSourceB());
                assertEquals(Operators.OR, modifierBase.getOperation());
                assertEquals(Minus64ToPlus63.MINUS19,
                                modifierBase.getConstant());
        }

        private void testWriteInsideBoundsModifier(final int sourceA,
                        final int sourceB, final int operation,
                        final int constant) {
                assertEquals(ModulationSources.CONTROL_Z.value,
                                patchData.getPayload()[sourceA]);
                assertEquals(ModulationSources.FOOT_CTRL.value,
                                patchData.getPayload()[sourceB]);
                assertEquals(Operators.OR.value,
                                patchData.getPayload()[operation]);
                assertEquals(Minus64ToPlus63.MINUS19.value,
                                patchData.getPayload()[constant]);
        }
}
