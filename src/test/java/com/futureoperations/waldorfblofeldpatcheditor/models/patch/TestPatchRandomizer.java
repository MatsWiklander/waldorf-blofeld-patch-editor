package test.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch;

import static org.junit.Assert.assertEquals;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums.CategoryFilters;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.Patch;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchRandomizer;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.models.patch.PatchRepository;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverters;

import org.junit.Test;

import test.java.com.futureoperations.waldorfblofeldpatcheditor.utils.Helpers;

public class TestPatchRandomizer {

        private int generateRandomValue(int lowerBound, int upperBound) {
                return (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
        }

        @Test
        public void testCreateAllTypesOfPatches() throws IOException {
                Helpers helpers = new Helpers();

                helpers.getClass();

                byte[] blofeldFactorySoundSet = Helpers
                                .readForumOneTwoThreeFromSystemResource();

                PatchRepository patchRepository = new PatchRepository();
                PatchRepository newPatchRepository = new PatchRepository();

                patchRepository.read(blofeldFactorySoundSet);

                for (CategoryFilters categoryFilter : CategoryFilters.values()) {
                        if (categoryFilter != CategoryFilters.OFF
                                        && categoryFilter != CategoryFilters.INIT) {
                                ArrayList<Patch> filteredPatches = patchRepository
                                                .filterByCategory(categoryFilter);
                                int target = 10;

                                while (filteredPatches.size() != target
                                                && filteredPatches.size() != 0) {
                                        filteredPatches.remove(generateRandomValue(
                                                        0,
                                                        filteredPatches.size() - 1));
                                }

                                if (filteredPatches.size() != 0) {
                                        PatchRandomizer patchRandomizer = new PatchRandomizer(
                                                        filteredPatches);

                                        ArrayList<Patch> newPatches = patchRandomizer
                                                        .createPatches(85);

                                        if (newPatches.size() != 0) {
                                                int i = 1;

                                                for (Patch newPatch : newPatches) {
                                                        newPatch.setCategory(EnumConverters
                                                                        .convertCategories(categoryFilter.value - 1));
                                                        newPatch.setName(EnumConverters
                                                                        .convertCategories(categoryFilter.value - 1).name
                                                                        + String.format("%02d",
                                                                                        i));
                                                        i++;
                                                }

                                                newPatchRepository
                                                                .read(newPatches);
                                        }
                                }
                        }
                }

                newPatchRepository.sortByCategoryAndName();

                newPatchRepository.realignPatches();

                byte[] newPatches = newPatchRepository.write();

                FileOutputStream fos = new FileOutputStream("allsorts.syx");
                fos.write(newPatches);

                fos.flush();
                fos.close();
        }

        @Test
        public void testCreateCS80Patches() throws IOException {
                byte[] blofeldFactorySoundSet = Helpers
                                .readForumOneTwoThreeFromSystemResource();

                PatchRepository patchRepository = new PatchRepository();

                patchRepository.read(blofeldFactorySoundSet);

                ArrayList<Patch> filteredPatches = patchRepository
                                .filterByName("CS80");

                PatchRandomizer patchRandomizer = new PatchRandomizer(
                                filteredPatches);

                patchRepository.clear();

                patchRepository.read(patchRandomizer.createPatches(1024));

                patchRepository.sortByCategoryAndName();

                patchRepository.realignPatches();

                byte[] newPatches = patchRepository.write();

                FileOutputStream fos = new FileOutputStream("cs80.syx");
                fos.write(newPatches);

                fos.flush();
                fos.close();
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
        public void testCreatePatches() throws IOException {
                byte[] blofeldFactorySoundSet = Helpers
                                .readBlofeldFactorySoundSetFromSystemResource();

                PatchRepository patchRepository = new PatchRepository();

                patchRepository.read(blofeldFactorySoundSet);

                ArrayList<Patch> filteredPatches = patchRepository
                                .filterByCategory(CategoryFilters.PAD);

                int target = 10;

                while (filteredPatches.size() != target) {
                        filteredPatches.remove(generateRandomValue(0,
                                        filteredPatches.size() - 1));
                }

                PatchRandomizer patchRandomizer = new PatchRandomizer(
                                filteredPatches);

                patchRepository.clear();

                patchRepository.read(patchRandomizer.createPatches(1024));

                patchRepository.sortByCategoryAndName();

                patchRepository.realignPatches();

                byte[] newPatches = patchRepository.write();

                FileOutputStream fos = new FileOutputStream("test.syx");
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
