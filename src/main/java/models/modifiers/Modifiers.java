package main.java.models.modifiers;

import main.java.models.patch.PatchData;

public class Modifiers {
        private final Modifier1 modifier1;
        private final Modifier2 modifier2;
        private final Modifier3 modifier3;
        private final Modifier4 modifier4;

        public Modifiers(final PatchData patchData) {
                modifier1 = new Modifier1(patchData);
                modifier2 = new Modifier2(patchData);
                modifier3 = new Modifier3(patchData);
                modifier4 = new Modifier4(patchData);
        }

        public final Modifier1 getModifer1() {
                return modifier1;
        }

        public final Modifier2 getModifer2() {
                return modifier2;
        }

        public final Modifier3 getModifer3() {
                return modifier3;
        }

        public final Modifier4 getModifer4() {
                return modifier4;
        }
}
