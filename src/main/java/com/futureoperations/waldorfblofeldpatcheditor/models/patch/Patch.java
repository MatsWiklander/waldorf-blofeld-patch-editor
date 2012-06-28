package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.amplifier.Amplifier;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.arpeggiator.Arpeggiator;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Effect1;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.effects.Effect2;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.envelopes.Envelopes;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.filters.Filters;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos.Lfos;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.mixers.Mixers;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modifiers.Modifiers;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.modulations.Modulations;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.oscillators.Oscillators;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

public class Patch {
        private final PatchData patchData;
        private final Oscillators oscillators;
        private final Mixers mixers;
        private final Filters filters;
        private final Amplifier amplifier;
        private final Effect1 effect1;
        private final Effect2 effect2;
        private final Lfos lfos;
        private final Envelopes envelopes;
        private final Modifiers modifiers;
        private final Modulations modulations;
        private final Arpeggiator arpeggiator;
        private Banks bank;
        private ZeroToPlus127 number;

        private final int nameIndex = 363;

        private final int categoryIndex = 379;

        public Patch() {
                patchData = new PatchData();

                for (int i = 0; i < patchData.getPayload().length; i++) {
                        patchData.getPayload()[i] = 16;
                }

                oscillators = new Oscillators(patchData);

                mixers = new Mixers(patchData);

                filters = new Filters(patchData);

                amplifier = new Amplifier(patchData);

                effect1 = new Effect1(patchData);

                effect2 = new Effect2(patchData);

                lfos = new Lfos(patchData);

                envelopes = new Envelopes(patchData);

                modifiers = new Modifiers(patchData);

                modulations = new Modulations(patchData);

                arpeggiator = new Arpeggiator(patchData);

                // Init patch
                bank = Banks.A;
                number = ZeroToPlus127.ZERO;
                setCategory(Categories.INIT);
                setName("Init");
                patchData.writeReserved();
        }

        public final Amplifier getAmplifier() {
                return amplifier;
        }

        public final Arpeggiator getArpeggiator() {
                return arpeggiator;
        }

        public Banks getBank() {
                return bank;
        }

        public final Categories getCategory() {
                return EnumConverters.convertCategories(patchData
                                .getValue(categoryIndex));
        }

        public byte getChecksum() {
                byte checksum = 0x00;

                for (int i = 0; i < patchData.getPayload().length; i++) {
                        checksum += patchData.getPayload()[i];
                }

                return (byte) (checksum & 0x7f);
        }

        public final Effect1 getEffect1() {
                return effect1;
        }

        public final Effect2 getEffect2() {
                return effect2;
        }

        public final Envelopes getEnvelopes() {
                return envelopes;
        }

        public final Filters getFilters() {
                return filters;
        }

        public final Lfos getLfos() {
                return lfos;
        }

        public final Mixers getMixers() {
                return mixers;
        }

        public final Modifiers getModifiers() {
                return modifiers;
        }

        public final Modulations getModulations() {
                return modulations;
        }

        public final String getName() {
                String name = "";

                for (int i = 0; i < 16; i++) {
                        name += new Character(
                                        (char) patchData.getValue(nameIndex + i));
                }

                name = name.trim();

                return name;
        }

        public ZeroToPlus127 getNumber() {
                return number;
        }

        public final Oscillators getOscillators() {
                return oscillators;
        }

        public final PatchData getPatchData() {
                return patchData;
        }

        public void setBank(final Banks bank) {
                this.bank = bank;
        }

        public final void setCategory(final Categories category) {
                patchData.setValue(categoryIndex, category.value);
        }

        public final void setName(final String name) {
                for (int i = 0; i < 16; i++) {
                        patchData.getPayload()[363 + i] = ' ';
                }

                for (int i = 0; i < name.length(); i++) {
                        patchData.setValue(363 + i, (byte) name.charAt(i));
                }
        }

        public void setNumber(final ZeroToPlus127 number) {
                this.number = number;
        }
}
