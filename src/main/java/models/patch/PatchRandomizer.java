package main.java.models.patch;

import java.util.ArrayList;

import main.java.models.arpeggiator.patterns.Accents;
import main.java.models.arpeggiator.patterns.PatternBase;
import main.java.models.arpeggiator.patterns.Steps;
import main.java.models.arpeggiator.patterns.Timings;
import main.java.models.enums.OffOn;
import main.java.models.oscillators.OscillatorBase;

import org.apache.log4j.Logger;

public class PatchRandomizer {
        Logger logger = Logger.getLogger(this.getClass());

        private final ArrayList<Patch> sourcePatches;
        private final double[] median = new double[383];
        private final double[] deviation = new double[383];
        private final double[] upperBounds = new double[383];
        private final double[] lowerBounds = new double[383];

        public PatchRandomizer(ArrayList<Patch> sourcePatches) {
                this.sourcePatches = sourcePatches;
        }

        private void calculateBounds() {
                for (int i = 0; i < median.length; i++) {
                        upperBounds[i] = median[i] + deviation[i];
                        lowerBounds[i] = median[i] - deviation[i];
                }
        }

        private final void calculateMad() {
                double[] rawData = new double[sourcePatches.size()];

                for (int i = 0; i < median.length; i++) {
                        int j = 0;

                        for (Patch patch : sourcePatches) {
                                rawData[j] = patch.getPatchData().getPayload()[i];
                                j++;
                        }

                        median[i] = calculateMedian(rawData);

                        for (int k = 0; k < rawData.length; k++) {
                                rawData[k] = Math.sqrt(Math.pow(rawData[k]
                                                - median[i], 2.0));
                        }

                        deviation[i] = calculateMedian(rawData);
                }
        }

        private final double calculateMedian(final double[] rawData) {
                java.util.Arrays.sort(rawData);

                int middle = rawData.length / 2;

                if (middle % 2 == 1) {
                        return rawData[middle];
                } else {
                        return (rawData[middle - 1] + rawData[middle]) / 2.0;
                }
        }

        public final ArrayList<Patch> createPatches(final int numberOfPatches) {
                ArrayList<Patch> patches = new ArrayList<Patch>();

                calculateMad();
                calculateBounds();
                dumpMad();

                int k = 1;

                for (int i = 0; i < numberOfPatches; i++) {
                        Patch patch = new Patch();

                        for (int j = 0; j < lowerBounds.length; j++) {
                                patch.getPatchData().getPayload()[j] = generateRandomValue(
                                                lowerBounds[j], upperBounds[j]);

                        }

                        snapOscillator(patch.getOscillators().getOscillator1());
                        snapOscillator(patch.getOscillators().getOscillator2());
                        snapOscillator(patch.getOscillators().getOscillator3());
                        randomizeArpeggiator(patch);

                        patch.setCategory(Categories.INIT);

                        patch.setName(patch.getCategory().name
                                        + String.format(" %04d", k++));

                        patches.add(patch);
                }

                return patches;
        }

        private final void dumpMad() {
                for (int i = 0; i < median.length; i++) {
                        logger.info(median[i] + " +/- " + deviation[i]);
                }
        }

        private byte generateRandomValue(double lowerBound, double upperBound) {
                if (upperBound > 127) {
                        upperBound = 127;
                }

                return (byte) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
        }

        private void randomizeArpeggiator(final Patch patch) {
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern1());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern2());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern3());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern4());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern5());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern6());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern7());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern8());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern9());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern10());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern11());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern12());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern13());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern14());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern15());
                randomizeArpeggiatorStep(patch.getArpeggiator().getPatterns()
                                .getPattern16());

        }

        private void randomizeArpeggiatorStep(final PatternBase patternBase) {
                patternBase.setAccent(Accents.values()[generateRandomValue(0,
                                Accents.values().length - 1)]);
                patternBase.setGlide(OffOn.values()[generateRandomValue(0,
                                OffOn.values().length - 1)]);
                patternBase.setLength(main.java.models.arpeggiator.patterns.Lengths
                                .values()[generateRandomValue(0,
                                main.java.models.arpeggiator.patterns.Lengths
                                                .values().length - 1)]);
                patternBase.setStep(Steps.values()[generateRandomValue(0,
                                Steps.values().length - 1)]);
                patternBase.setTiming(Timings.values()[generateRandomValue(0,
                                Timings.values().length - 1)]);
        }

        private final void snapOscillator(final OscillatorBase oscillatorBase) {
                oscillatorBase.setBendRange(oscillatorBase.getBendRange());
                oscillatorBase.setOctave(oscillatorBase.getOctave());
                oscillatorBase.setSemitone(oscillatorBase.getSemitone());
        }
}
