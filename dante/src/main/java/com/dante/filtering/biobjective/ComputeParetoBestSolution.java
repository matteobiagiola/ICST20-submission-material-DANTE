package com.dante.filtering.biobjective;

import com.dante.utils.Properties;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ComputeParetoBestSolution {

    private final static Logger logger = Logger.getLogger(ComputeParetoBestSolution.class.getName());

    public static class ObjectivesPair {

        private final double numOfDeps;
        private final double cost;

        public ObjectivesPair(String numOfDeps, String cost) {
            this.numOfDeps = Double.valueOf(numOfDeps);
            this.cost = Double.valueOf(cost);
        }

        public double getCost() {
            return cost;
        }

        public double getNumOfDeps() {
            return numOfDeps;
        }

        @Override
        public boolean equals(Object other) {
            if(other == this)
                return true;

            if(other instanceof ObjectivesPair){
                ObjectivesPair otherObjectivesPair = (ObjectivesPair) other;
                return Objects.equals(this.cost, otherObjectivesPair.cost) &&
                        Objects.equals(this.numOfDeps, otherObjectivesPair.numOfDeps);
            }

            return false;
        }

        @Override
        public int hashCode(){
            return Objects.hash(this.cost, this.numOfDeps);
        }

        @Override
        public String toString() {
            return numOfDeps + "-" + cost;
        }
    }

    public static void main(String[] args) {

        config();

        if(args != null && args.length == 1) {

            File optimizationResultsDir = new File(args[0]);
            if(optimizationResultsDir.exists() && optimizationResultsDir.isDirectory()) {
                List<File> resultsFile = getFunAndVarFiles(optimizationResultsDir);
                File funFile = resultsFile.stream()
                        .filter(file -> file.getName().equals("FUN-" + Properties.APPLICATION_NAME + ".tsv"))
                        .findFirst().orElseThrow(RuntimeException::new);
                File varFile = resultsFile.stream()
                        .filter(file -> file.getName().equals("VAR-" + Properties.APPLICATION_NAME + ".tsv"))
                        .findFirst().orElseThrow(RuntimeException::new);
                LinkedList<ObjectivesPair> originalObjectives = parseFunFile(funFile);
                LinkedList<ObjectivesPair> orderedObjectives = new LinkedList<>(originalObjectives);
                orderedObjectives.sort(((o1, o2) -> {
                    if(o1.getCost() > o2.getCost()) {
                        return -1;
                    } else if(o1.getCost() < o2.getCost()) {
                        return 1;
                    }
                    return 0;
                }));

                LinkedList<String> solutions = parseVarFile(varFile);

                if(solutions.size() == originalObjectives.size()) {
                    List<Double> derivatives = computeDerivatives(orderedObjectives);

                    Double maxDerivative = derivatives.stream().mapToDouble(Double::doubleValue)
                            .max().orElseThrow(RuntimeException::new);

                    int indexOfMax = -1;
                    for (int i = 0; i < derivatives.size(); i++) {
                        Double derivative = derivatives.get(i);
                        if(derivative.equals(maxDerivative)) {
                            indexOfMax = i;
                            break;
                        }
                    }

                    if(indexOfMax != -1) {
                        ObjectivesPair objectivePairInOrderedList = orderedObjectives.get(indexOfMax + 1);
                        int indexOfObjectivePairInOriginalList = -1;
                        for (int i = 0; i < originalObjectives.size(); i++) {
                            ObjectivesPair objectivesPair = originalObjectives.get(i);
                            if(objectivesPair.equals(objectivePairInOrderedList)) {
                                indexOfObjectivePairInOriginalList = i;
                                break;
                            }
                        }
                        if(indexOfObjectivePairInOriginalList != -1) {
                            logger.info("Max derivative: " + maxDerivative);
                            logger.info("Pair of objectives where derivative is max (index: " + (indexOfObjectivePairInOriginalList
                                    + 1) + "): " + originalObjectives.get(indexOfObjectivePairInOriginalList));
                            logger.info("Correspondent solution: "
                                    + solutions.get(indexOfObjectivePairInOriginalList));
                        } else {
                            throw new RuntimeException("Could not find objective pair " + objectivePairInOrderedList
                                    + " in original objectives pair list");
                        }

                    } else {
                        throw new RuntimeException("Max derivative not found");
                    }
                } else {
                    throw new RuntimeException("Solutions and objectives must be the same size. Found "
                            + solutions.size() + " solutions and " + originalObjectives.size() + " pair of objectives");
                }
            } else {
                throw new IllegalArgumentException("First argument " + args[0]
                        + " does not exist or it is not a directory");
            }

        } else {
            throw new IllegalArgumentException("First argument must be the " +
                    "directory with graph optimization results");
        }
    }


    private static List<File> getFunAndVarFiles(File optimizationResultsDir) {
        File[] files = optimizationResultsDir.listFiles();
        if(files != null) {
            return Arrays.stream(files)
                    .filter(file -> file.getName().equals("FUN-" + Properties.APPLICATION_NAME + ".tsv")
                                || file.getName().equals("VAR-" + Properties.APPLICATION_NAME + ".tsv"))
                    .collect(Collectors.toList());
        }
        throw new RuntimeException("Optimization results dir " + optimizationResultsDir + " is empty");
    }

    private static LinkedList<ObjectivesPair> parseFunFile(File funFile) {
        LinkedList<ObjectivesPair> objectives = new LinkedList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(funFile));
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            for (String line : lines) {
                String[] depsAndCost = line.split("\\s+");
                if(depsAndCost.length != 2) {
                    throw new RuntimeException("Unexpected line if " + funFile + ", " + line
                            + ". Must have space as separator and contain two doubles.");
                }
                String deps = depsAndCost[0];
                String cost = depsAndCost[1];
                objectives.add(new ObjectivesPair(deps, cost));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(objectives.isEmpty()) {
            throw new RuntimeException("List of objectives cannot be empty");
        }

        return objectives;
    }

    private static LinkedList<String> parseVarFile(File varFile) {

        LinkedList<String> solutions = new LinkedList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(varFile));
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            solutions.addAll(lines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(solutions.isEmpty()) {
            throw new RuntimeException("List of solutions cannot be empty");
        }

        return solutions;

    }

    private static LinkedList<Double> computeDerivatives(LinkedList<ObjectivesPair> objectives) {
        LinkedList<Double> derivatives = new LinkedList<>();
        for (int i = 0; i < objectives.size() - 1; i++) {
            double currentCost = objectives.get(i).getCost();
            double nextCost = objectives.get(i + 1).getCost();
            double currentDeps = objectives.get(i).getNumOfDeps();
            double nextDeps = objectives.get(i + 1).getNumOfDeps();

            double derivative;

            if(currentDeps == nextDeps) {
                derivative = Double.MAX_VALUE;
                logger.debug(derivative);
            } else {
                derivative = (currentCost - nextCost) / Math.abs(currentDeps - nextDeps);
                logger.debug(currentCost + " - " + nextCost + " / |"
                        + currentDeps + " - " + nextDeps + "| = " + derivative);
            }

            derivatives.add(derivative);
        }

        if(derivatives.isEmpty()) {
            throw new RuntimeException("List of derivatives cannot be empty");
        }

        return derivatives;
    }

    private static void config(){
        instantiateProperties();
    }

    private static void instantiateProperties(){
        Properties.getInstance().createPropertiesFile();
    }

}
