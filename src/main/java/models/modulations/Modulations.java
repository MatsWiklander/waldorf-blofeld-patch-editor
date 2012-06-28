package main.java.models.modulations;

import main.java.models.patch.PatchData;

public class Modulations {
        private final Modulation1 modulation1;
        private final Modulation2 modulation2;
        private final Modulation3 modulation3;
        private final Modulation4 modulation4;
        private final Modulation5 modulation5;
        private final Modulation6 modulation6;
        private final Modulation7 modulation7;
        private final Modulation8 modulation8;
        private final Modulation9 modulation9;
        private final Modulation10 modulation10;
        private final Modulation11 modulation11;
        private final Modulation12 modulation12;
        private final Modulation13 modulation13;
        private final Modulation14 modulation14;
        private final Modulation15 modulation15;
        private final Modulation16 modulation16;

        public Modulations(final PatchData patchData) {
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

        public final Modulation1 getModulation1() {
                return modulation1;
        }

        public final Modulation10 getModulation10() {
                return modulation10;
        }

        public final Modulation11 getModulation11() {
                return modulation11;
        }

        public final Modulation12 getModulation12() {
                return modulation12;
        }

        public final Modulation13 getModulation13() {
                return modulation13;
        }

        public final Modulation14 getModulation14() {
                return modulation14;
        }

        public final Modulation15 getModulation15() {
                return modulation15;
        }

        public final Modulation16 getModulation16() {
                return modulation16;
        }

        public final Modulation2 getModulation2() {
                return modulation2;
        }

        public final Modulation3 getModulation3() {
                return modulation3;
        }

        public final Modulation4 getModulation4() {
                return modulation4;
        }

        public final Modulation5 getModulation5() {
                return modulation5;
        }

        public final Modulation6 getModulation6() {
                return modulation6;
        }

        public final Modulation7 getModulation7() {
                return modulation7;
        }

        public final Modulation8 getModulation8() {
                return modulation8;
        }

        public final Modulation9 getModulation9() {
                return modulation9;
        }
}
