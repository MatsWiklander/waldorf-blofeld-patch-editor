package main.java.models.arpeggiator.patterns;

import main.java.models.patch.PatchData;

public class Patterns {
        private final Pattern1 pattern1;
        private final Pattern2 pattern2;
        private final Pattern3 pattern3;
        private final Pattern4 pattern4;
        private final Pattern5 pattern5;
        private final Pattern6 pattern6;
        private final Pattern7 pattern7;
        private final Pattern8 pattern8;
        private final Pattern9 pattern9;
        private final Pattern10 pattern10;
        private final Pattern11 pattern11;
        private final Pattern12 pattern12;
        private final Pattern13 pattern13;
        private final Pattern14 pattern14;
        private final Pattern15 pattern15;
        private final Pattern16 pattern16;

        public Patterns(final PatchData patchData) {
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

        public final Pattern1 getPattern1() {
                return pattern1;
        }

        public final Pattern10 getPattern10() {
                return pattern10;
        }

        public final Pattern11 getPattern11() {
                return pattern11;
        }

        public final Pattern12 getPattern12() {
                return pattern12;
        }

        public final Pattern13 getPattern13() {
                return pattern13;
        }

        public final Pattern14 getPattern14() {
                return pattern14;
        }

        public final Pattern15 getPattern15() {
                return pattern15;
        }

        public final Pattern16 getPattern16() {
                return pattern16;
        }

        public final Pattern2 getPattern2() {
                return pattern2;
        }

        public final Pattern3 getPattern3() {
                return pattern3;
        }

        public final Pattern4 getPattern4() {
                return pattern4;
        }

        public final Pattern5 getPattern5() {
                return pattern5;
        }

        public final Pattern6 getPattern6() {
                return pattern6;
        }

        public final Pattern7 getPattern7() {
                return pattern7;
        }

        public final Pattern8 getPattern8() {
                return pattern8;
        }

        public final Pattern9 getPattern9() {
                return pattern9;
        }
}
