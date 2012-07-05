package test.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch;

import static org.junit.Assert.assertEquals;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.CategoryFilters;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.Minus64ToPlus63;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.ZeroToPlus127;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.Categories;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.Patch;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchRandomizer;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchRepository;

import org.junit.Test;

import test.java.com.futureoperations.waldorfblofeldpatcheditor.utils.Helpers;

public class TestPatchRandomizer {
        private int generateRandomValue(int lowerBound, int upperBound) {
                return (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
        }

        private void reducePatchCount(ArrayList<Patch> filteredPatches) {
                int target = 5;

                while (filteredPatches.size() != target
                                && filteredPatches.size() != 0) {
                        filteredPatches.remove(generateRandomValue(0,
                                        filteredPatches.size() - 1));
                }
        }

        @Test
        public void testCreateAllTypesOfPatches() throws IOException {
                Helpers helpers = new Helpers();

                helpers.getClass();

                byte[] forumOneTwoThreeSoundSet = Helpers
                                .readForumOneTwoThreeFromSystemResource();

                PatchRepository patchRepository = new PatchRepository();
                patchRepository.read(forumOneTwoThreeSoundSet);

                for (CategoryFilters categoryFilter : CategoryFilters.values()) {
                        if (categoryFilter != CategoryFilters.OFF
                                        && categoryFilter != CategoryFilters.INIT) {
                                ArrayList<Patch> originalFilteredPatches = patchRepository
                                                .filterByCategory(categoryFilter);

                                PatchRepository newPatchRepository = new PatchRepository();

                                ArrayList<Patch> newPatches = new ArrayList<Patch>();

                                for (int i = 0; i < 1024; i++) {
                                        ArrayList<Patch> copyOfOriginalFilteredPatches = new ArrayList<Patch>();

                                        copyOfOriginalFilteredPatches
                                                        .addAll(originalFilteredPatches);

                                        reducePatchCount(copyOfOriginalFilteredPatches);

                                        if (copyOfOriginalFilteredPatches
                                                        .size() != 0) {
                                                PatchRandomizer patchRandomizer = new PatchRandomizer(
                                                                copyOfOriginalFilteredPatches);

                                                ArrayList<Patch> newPatch = patchRandomizer
                                                                .createPatches(1);

                                                newPatch.get(0)
                                                                .setCategory(Categories.INIT);

                                                newPatch.get(0)
                                                                .getAmplifier()
                                                                .setVolume(ZeroToPlus127.PLUS127);

                                                newPatch.get(0)
                                                                .getAmplifier()
                                                                .setVelocity(Minus64ToPlus63.MINUS64);

                                                newPatch.get(0)
                                                                .setName(categoryFilter.name
                                                                                + String.format(" %04d",
                                                                                                i));

                                                newPatches.add(newPatch.get(0));
                                        }
                                }

                                newPatchRepository.read(newPatches);

                                newPatchRepository.sortByCategoryAndName();

                                newPatchRepository.realignPatches();

                                byte[] patchRepositoryRawData = newPatchRepository
                                                .write();

                                FileOutputStream fos = new FileOutputStream(
                                                categoryFilter.name
                                                                .toLowerCase()
                                                                + ".syx");
                                fos.write(patchRepositoryRawData);

                                fos.flush();
                                fos.close();
                        }
                }
        }

        @Test
        public void testCreateInitPatches() throws IOException {
                PatchRepository patchRepository = new PatchRepository();

                ArrayList<Patch> patches = new ArrayList<Patch>();
                for (int i = 0; i < 128; i++) {
                        Patch patch = new Patch();
                        patches.add(patch);
                }

                patchRepository.read(patches);

                patchRepository.sortByCategoryAndName();

                patchRepository.realignPatches();

                byte[] newPatches = patchRepository.write();

                PatchRepository newPatchRepository = new PatchRepository();

                newPatchRepository.read(newPatches);

                assertEquals(128, newPatchRepository.getPatches().size());

                FileOutputStream fos = new FileOutputStream("init.syx");
                fos.write(newPatches);

                fos.flush();
                fos.close();
        }

        @Test
        public void testPatchRandomizer() throws IOException {
                byte[] blofeldFactorySoundSet = Helpers
                                .readBlofeldFactorySoundSetFromSystemResource();

                PatchRepository patchRepository = new PatchRepository();

                patchRepository.read(blofeldFactorySoundSet);

                ArrayList<Patch> filteredPatches = patchRepository
                                .filterByCategory(CategoryFilters.FX);

                PatchRandomizer patchRandomizer = new PatchRandomizer(
                                filteredPatches);

                patchRepository.clear();

                patchRepository.read(patchRandomizer.createPatches(128));

                assertEquals(128, patchRepository.getPatches().size());
        }
}
