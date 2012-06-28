package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.Bypass;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.Chorus;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.ClkDelay;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.Delay;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.Flanger;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.Overdrive;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.Overlayable;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.Phaser;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.Reverb;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays.TripleFx;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum EffectTypes implements EnumConverter<EffectTypes> {
        BYPASS(0, "Bypass"), CHORUS(1, "Chorus"), FLANGER(2, "Flanger"), PHASER(
                        3, "Phaser"), OVERDRIVE(4, "Overdrive"), TRIPLE_FX(5,
                        "Triple FX"), DELAY(6, "Delay"), CLK_DELAY(7,
                        "Clk. Delay"), REVERB(8, "Reverb");

        public final int value;

        public final String name;
        private static ReverseEnumMap<EffectTypes> map = new ReverseEnumMap<EffectTypes>(
                        EffectTypes.class);

        private EffectTypes(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public EffectTypes convert(final int value) {
                return map.get(value);
        }

        public Overlayable get() {
                switch (this) {
                case CLK_DELAY:
                        return new ClkDelay();
                case FLANGER:
                        return new Flanger();
                case CHORUS:
                        return new Chorus();
                case DELAY:
                        return new Delay();
                case OVERDRIVE:
                        return new Overdrive();
                case PHASER:
                        return new Phaser();
                case REVERB:
                        return new Reverb();
                case TRIPLE_FX:
                        return new TripleFx();
                default:
                        return new Bypass();
                }
        }
}
