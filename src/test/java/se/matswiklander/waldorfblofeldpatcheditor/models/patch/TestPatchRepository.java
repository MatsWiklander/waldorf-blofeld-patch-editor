package test.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.enums.CategoryFilters;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.Patch;
import main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch.PatchRepository;

import org.junit.Test;

import test.java.se.matswiklander.waldorfblofeldpatcheditor.utils.Helpers;

public class TestPatchRepository {
        @Test
        public void testFilteredPatches() throws IOException {
                byte[] blofeldFactorySoundSet = Helpers
                                .readBlofeldFactorySoundSetFromSystemResource();

                PatchRepository patchRepository = new PatchRepository();

                patchRepository.read(blofeldFactorySoundSet);

                ArrayList<Patch> filteredPatches = patchRepository
                                .filterByCategory(CategoryFilters.ARP);
                assertEquals(98, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.ATMO);
                assertEquals(170, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.BASS);
                assertEquals(130, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.DRUM);
                assertEquals(2, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.FX);
                assertEquals(68, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.INIT);
                assertEquals(1, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.KEYS);
                assertEquals(72, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.LEAD);
                assertEquals(17, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.MONO);
                assertEquals(73, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.PAD);
                assertEquals(168, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.PERC);
                assertEquals(73, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.POLY);
                assertEquals(192, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.SEQ);
                assertEquals(45, filteredPatches.size());

                filteredPatches = patchRepository.filterByCategory(CategoryFilters.OFF);
                assertEquals(1024, filteredPatches.size());
        }

        @Test
        public void testPatchRepository() throws IOException {
                byte[] blofeldFactorySoundSet = Helpers
                                .readBlofeldFactorySoundSetFromSystemResource();

                assertEquals(401408, blofeldFactorySoundSet.length);

                PatchRepository patchRepository = new PatchRepository();

                patchRepository.read(blofeldFactorySoundSet);

                assertEquals(1024, patchRepository.getPatches().size());
        }
}
