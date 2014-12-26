package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays;

import static org.junit.Assert.assertEquals;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.Effect1;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.Polarities;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.Bypass;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.Chorus;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.ClkDelay;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.Delay;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.Flanger;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.Overdrive;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.Phaser;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.Reverb;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.effects.overlays.TripleFx;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ClkDelayLengths;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.DriveCurves;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchData;

import org.junit.Before;
import org.junit.Test;

public class TestOverlays {
        private PatchData patchData;
        private Effect1 effect1;

        @Before
        public final void setup() {
                patchData = new PatchData();
                effect1 = new Effect1(patchData);
        }

        @Test
        public final void testBypass() {
                Bypass bypass = new Bypass();
                bypass.setEffectBase(effect1);
        }

        @Test
        public final void testChorus() {
                Chorus chorus = new Chorus();
                chorus.setEffectBase(effect1);

                chorus.setDepth(ZeroToPlus127.PLUS18);
                chorus.setSpeed(ZeroToPlus127.PLUS47);

                assertEquals(ZeroToPlus127.PLUS18, chorus.getDepth());
                assertEquals(ZeroToPlus127.PLUS47, chorus.getSpeed());
        }

        @Test
        public final void testClkDelay() {
                ClkDelay clkDelay = new ClkDelay();
                clkDelay.setEffectBase(effect1);

                clkDelay.setCutoff(ZeroToPlus127.PLUS10);
                clkDelay.setFeedback(ZeroToPlus127.PLUS96);
                clkDelay.setLength(ClkDelayLengths._7_BARS);
                clkDelay.setPolarity(Polarities.NEGATIVE);
                clkDelay.setSpread(Minus64ToPlus63.MINUS32);

                assertEquals(ZeroToPlus127.PLUS10, clkDelay.getCutoff());
                assertEquals(ZeroToPlus127.PLUS96, clkDelay.getFeedback());
                assertEquals(ClkDelayLengths._7_BARS, clkDelay.getLength());
                assertEquals(Polarities.NEGATIVE, clkDelay.getPolarity());
                assertEquals(Minus64ToPlus63.MINUS32, clkDelay.getSpread());
        }

        @Test
        public final void testDelay() {
                Delay delay = new Delay();
                delay.setEffectBase(effect1);

                delay.setCutoff(ZeroToPlus127.PLUS10);
                delay.setFeedback(ZeroToPlus127.PLUS96);
                delay.setLength(ZeroToPlus127.PLUS77);
                delay.setPolarity(Polarities.NEGATIVE);
                delay.setSpread(Minus64ToPlus63.MINUS32);

                assertEquals(ZeroToPlus127.PLUS10, delay.getCutoff());
                assertEquals(ZeroToPlus127.PLUS96, delay.getFeedback());
                assertEquals(ZeroToPlus127.PLUS77, delay.getLength());
                assertEquals(Polarities.NEGATIVE, delay.getPolarity());
                assertEquals(Minus64ToPlus63.MINUS32, delay.getSpread());
        }

        @Test
        public final void testFlanger() {
                Flanger flanger = new Flanger();
                flanger.setEffectBase(effect1);

                flanger.setDepth(ZeroToPlus127.PLUS54);
                flanger.setFeedback(ZeroToPlus127.PLUS98);
                flanger.setPolarity(Polarities.POSITIVE);
                flanger.setSpeed(ZeroToPlus127.PLUS126);

                assertEquals(ZeroToPlus127.PLUS54, flanger.getDepth());
                assertEquals(ZeroToPlus127.PLUS98, flanger.getFeedback());
                assertEquals(Polarities.POSITIVE, flanger.getPolarity());
                assertEquals(ZeroToPlus127.PLUS126, flanger.getSpeed());
        }

        @Test
        public final void testOverdrive() {
                Overdrive overdrive = new Overdrive();
                overdrive.setEffectBase(effect1);

                overdrive.setCurve(DriveCurves.OSC_1_MOD);
                overdrive.setCutoff(ZeroToPlus127.PLUS20);
                overdrive.setDrive(ZeroToPlus127.PLUS34);
                overdrive.setPostGain(ZeroToPlus127.PLUS49);

                assertEquals(DriveCurves.OSC_1_MOD, overdrive.getCurve());
                assertEquals(ZeroToPlus127.PLUS20, overdrive.getCutoff());
                assertEquals(ZeroToPlus127.PLUS34, overdrive.getDrive());
                assertEquals(ZeroToPlus127.PLUS49, overdrive.getPostGain());
        }

        @Test
        public final void testPhaser() {
                Phaser phaser = new Phaser();
                phaser.setEffectBase(effect1);

                phaser.setCenter(ZeroToPlus127.PLUS9);
                phaser.setDepth(ZeroToPlus127.PLUS71);
                phaser.setFeedback(ZeroToPlus127.PLUS76);
                phaser.setPolarity(Polarities.NEGATIVE);
                phaser.setSpacing(ZeroToPlus127.PLUS10);
                phaser.setSpeed(ZeroToPlus127.PLUS102);

                assertEquals(ZeroToPlus127.PLUS9, phaser.getCenter());
                assertEquals(ZeroToPlus127.PLUS71, phaser.getDepth());
                assertEquals(ZeroToPlus127.PLUS76, phaser.getFeedback());
                assertEquals(Polarities.NEGATIVE, phaser.getPolarity());
                assertEquals(ZeroToPlus127.PLUS10, phaser.getSpacing());
                assertEquals(ZeroToPlus127.PLUS102, phaser.getSpeed());
        }

        @Test
        public final void testReverb() {
                Reverb reverb = new Reverb();
                reverb.setEffectBase(effect1);

                reverb.setDamping(ZeroToPlus127.PLUS90);
                reverb.setDecay(ZeroToPlus127.PLUS14);
                reverb.setDiffusion(ZeroToPlus127.PLUS48);
                reverb.setHighpass(ZeroToPlus127.PLUS56);
                reverb.setLowpass(ZeroToPlus127.PLUS68);
                reverb.setShape(ZeroToPlus127.PLUS20);
                reverb.setSize(ZeroToPlus127.PLUS83);

                assertEquals(ZeroToPlus127.PLUS90, reverb.getDamping());
                assertEquals(ZeroToPlus127.PLUS14, reverb.getDecay());
                assertEquals(ZeroToPlus127.PLUS48, reverb.getDiffusion());
                assertEquals(ZeroToPlus127.PLUS56, reverb.getHighpass());
                assertEquals(ZeroToPlus127.PLUS68, reverb.getLowpass());
                assertEquals(ZeroToPlus127.PLUS20, reverb.getShape());
                assertEquals(ZeroToPlus127.PLUS83, reverb.getSize());
        }

        @Test
        public final void testTripleFx() {
                TripleFx tripleFx = new TripleFx();
                tripleFx.setEffectBase(effect1);

                tripleFx.setChorusMix(ZeroToPlus127.PLUS27);
                tripleFx.setDepth(ZeroToPlus127.PLUS44);
                tripleFx.setOverdrive(ZeroToPlus127.PLUS24);
                tripleFx.setSampleAndHold(ZeroToPlus127.PLUS7);
                tripleFx.setSpeed(ZeroToPlus127.PLUS103);

                assertEquals(ZeroToPlus127.PLUS27, tripleFx.getChorusMix());
                assertEquals(ZeroToPlus127.PLUS44, tripleFx.getDepth());
                assertEquals(ZeroToPlus127.PLUS24, tripleFx.getOverdrive());
                assertEquals(ZeroToPlus127.PLUS7, tripleFx.getSampleAndHold());
                assertEquals(ZeroToPlus127.PLUS103, tripleFx.getSpeed());
        }
}
