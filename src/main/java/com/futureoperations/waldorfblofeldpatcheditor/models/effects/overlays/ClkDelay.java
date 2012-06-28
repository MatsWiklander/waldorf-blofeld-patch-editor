package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.overlays;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.EffectBase;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Polarities;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ClkDelayLengths;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class ClkDelay implements Overlayable {
        private EffectBase effectBase;

        public final ZeroToPlus127 getCutoff() {
                return effectBase.getParameter6();
        }

        public final ZeroToPlus127 getFeedback() {
                return effectBase.getParameter5();
        }

        public final ClkDelayLengths getLength() {
                return EnumConverters.convertClkDelayLengths(effectBase
                                .getParameter11().value);
        }

        public final Polarities getPolarity() {
                return EnumConverters.convertPolarities(effectBase
                                .getParameter9().value);
        }

        public final Minus64ToPlus63 getSpread() {
                return EnumConverters.convertMinus64ToPlus63(effectBase
                                .getParameter10().value);
        }

        public final void setCutoff(final ZeroToPlus127 cutoff) {
                effectBase.setParameter6(cutoff);
        }

        @Override
        public final void setEffectBase(final EffectBase effectBase) {
                this.effectBase = effectBase;
        }

        public final void setFeedback(final ZeroToPlus127 feedback) {
                effectBase.setParameter5(feedback);
        }

        public final void setLength(final ClkDelayLengths length) {
                effectBase.setParameter11(EnumConverters
                                .convertZeroToPlus127(length.value));
        }

        public final void setPolarity(final Polarities polarity) {
                effectBase.setParameter9(EnumConverters
                                .convertZeroToPlus127(polarity.value));
        }

        public final void setSpread(final Minus64ToPlus63 spread) {
                effectBase.setParameter10(EnumConverters
                                .convertZeroToPlus127(spread.value));
        }
}
