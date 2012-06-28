package test.java.models.effects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import main.java.models.effects.EffectTypes;
import main.java.models.effects.overlays.Bypass;
import main.java.models.effects.overlays.Chorus;
import main.java.models.effects.overlays.ClkDelay;
import main.java.models.effects.overlays.Delay;
import main.java.models.effects.overlays.Flanger;
import main.java.models.effects.overlays.Overdrive;
import main.java.models.effects.overlays.Phaser;
import main.java.models.effects.overlays.Reverb;
import main.java.models.effects.overlays.TripleFx;

import org.junit.Test;

public class TestEffectTypes {
        @Test
        public final void testFactory() {
                assertTrue(EffectTypes.BYPASS.get() instanceof Bypass);
                assertTrue(EffectTypes.CHORUS.get() instanceof Chorus);
                assertTrue(EffectTypes.FLANGER.get() instanceof Flanger);
                assertTrue(EffectTypes.PHASER.get() instanceof Phaser);
                assertTrue(EffectTypes.OVERDRIVE.get() instanceof Overdrive);
                assertTrue(EffectTypes.TRIPLE_FX.get() instanceof TripleFx);
                assertTrue(EffectTypes.DELAY.get() instanceof Delay);
                assertTrue(EffectTypes.CLK_DELAY.get() instanceof ClkDelay);
                assertTrue(EffectTypes.REVERB.get() instanceof Reverb);
        }

        @Test
        public final void testOrdinal() {
                assertEquals(0, EffectTypes.BYPASS.ordinal());
                assertEquals(1, EffectTypes.CHORUS.ordinal());
                assertEquals(2, EffectTypes.FLANGER.ordinal());
                assertEquals(3, EffectTypes.PHASER.ordinal());
                assertEquals(4, EffectTypes.OVERDRIVE.ordinal());
                assertEquals(5, EffectTypes.TRIPLE_FX.ordinal());
                assertEquals(6, EffectTypes.DELAY.ordinal());
                assertEquals(7, EffectTypes.CLK_DELAY.ordinal());
                assertEquals(8, EffectTypes.REVERB.ordinal());

        }
}
