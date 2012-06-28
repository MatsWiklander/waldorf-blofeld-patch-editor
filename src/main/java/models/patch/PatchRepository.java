package main.java.models.patch;

import java.util.ArrayList;
import java.util.Collections;

import main.java.models.enums.CategoryFilters;
import main.java.utils.EnumConverters;

import org.apache.log4j.Logger;

public class PatchRepository {
        Logger logger = Logger.getLogger(this.getClass());

        private final ArrayList<Patch> patches;

        public PatchRepository() {
                patches = new ArrayList<Patch>();
        }

        public final void clear() {
                patches.clear();
        }

        public final ArrayList<Patch> filterByCategory(
                        final CategoryFilters categoryFilter) {
                ArrayList<Patch> filteredPatches = new ArrayList<Patch>();

                for (Patch filteredPatch : patches) {
                        if (categoryFilter == CategoryFilters.ARP
                                        && filteredPatch.getCategory() == Categories.ARP) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.ATMO
                                        && filteredPatch.getCategory() == Categories.ATMO) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.ATMO
                                        && filteredPatch.getCategory() == Categories.ATMO) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.BASS
                                        && filteredPatch.getCategory() == Categories.BASS) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.DRUM
                                        && filteredPatch.getCategory() == Categories.DRUM) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.FX
                                        && filteredPatch.getCategory() == Categories.FX) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.INIT
                                        && filteredPatch.getCategory() == Categories.INIT) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.KEYS
                                        && filteredPatch.getCategory() == Categories.KEYS) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.LEAD
                                        && filteredPatch.getCategory() == Categories.LEAD) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.MONO
                                        && filteredPatch.getCategory() == Categories.MONO) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.PAD
                                        && filteredPatch.getCategory() == Categories.PAD) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.PERC
                                        && filteredPatch.getCategory() == Categories.PERC) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.POLY
                                        && filteredPatch.getCategory() == Categories.POLY) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.SEQ
                                        && filteredPatch.getCategory() == Categories.SEQ) {
                                filteredPatches.add(filteredPatch);
                        }

                        if (categoryFilter == CategoryFilters.OFF) {
                                filteredPatches.add(filteredPatch);
                        }
                }

                return filteredPatches;
        }

        public final ArrayList<Patch> filterByName(final String name) {
                ArrayList<Patch> filteredPatches = new ArrayList<Patch>();

                for (Patch filteredPatch : patches) {
                        if (filteredPatch.getName().matches(".*" + name + ".*")) {
                                filteredPatches.add(filteredPatch);
                        }
                }

                return filteredPatches;
        }

        public ArrayList<Patch> getPatches() {
                return patches;
        }

        public final void read(ArrayList<Patch> contents) {
                for (Patch patch : contents) {
                        patches.add(patch);
                }
        }

        public final void read(final byte[] contents) {
                int start = 0;
                int end = 0;
                int bank = 0;
                int number = 0;

                for (int i = 0; i < contents.length; i++) {
                        if (contents[i] == (byte) 0xf0) {
                                start = i;
                        }

                        if (contents[i] == (byte) 0xf7) {
                                end = i;
                        }

                        if (start != -1 && end != -1
                                        && contents[start + 1] == (byte) 0x3e
                                        && contents[start + 2] == (byte) 0x13
                                        && contents[start + 4] == (byte) 0x10) {
                                bank = contents[start + 5];
                                number = contents[start + 6];

                                Patch newPatch = new Patch();

                                newPatch.setBank(EnumConverters
                                                .convertBanks(bank));
                                newPatch.setNumber(EnumConverters
                                                .convertZeroToPlus127(number));
                                System.arraycopy(contents, start + 7, newPatch
                                                .getPatchData().getPayload(),
                                                0, 383);

                                patches.add(newPatch);

                                start = -1;
                                end = -1;
                        }
                }
        }

        public final void realignPatches() {
                for (int i = 0; i < patches.size(); i++) {
                        patches.get(i).setBank(
                                        EnumConverters.convertBanks(i / 128));
                        patches.get(i)
                                        .setNumber(EnumConverters
                                                        .convertZeroToPlus127(i % 128));

                        logger.trace(String.format("Bank %02d - %02d => %s",
                                        i / 128, i % 128, patches.get(i)
                                                        .getName()));
                }
        }

        public final void sortByCategoryAndName() {
                Collections.sort(patches, new CategoryNameComparator());
        }

        public final byte[] write() {
                byte[] contents = new byte[392 * patches.size()];

                for (int i = 0; i < patches.size(); i++) {
                        contents[392 * i] = (byte) 0xf0;
                        contents[392 * i + 1] = (byte) 0x3e;
                        contents[392 * i + 2] = (byte) 0x13;
                        contents[392 * i + 3] = (byte) 0x00;
                        contents[392 * i + 4] = (byte) 0x10;
                        contents[392 * i + 5] = (byte) patches.get(i).getBank().value;
                        contents[392 * i + 6] = (byte) patches.get(i)
                                        .getNumber().value;
                        System.arraycopy(patches.get(i).getPatchData()
                                        .getPayload(), 0, contents,
                                        392 * i + 7, patches.get(i)
                                                        .getPatchData()
                                                        .getPayload().length);
                        contents[392 * (i + 1) - 2] = patches.get(i)
                                        .getChecksum();
                        contents[392 * (i + 1) - 1] = (byte) 0xf7;
                }

                return contents;
        }
}
