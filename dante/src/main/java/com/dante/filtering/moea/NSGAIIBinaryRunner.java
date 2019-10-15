package com.dante.filtering.moea;

import com.dante.utils.ExecutionTime;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.uma.jmetal.algorithm.Algorithm;
import org.uma.jmetal.algorithm.multiobjective.nsgaii.NSGAIIBuilder;
import org.uma.jmetal.operator.CrossoverOperator;
import org.uma.jmetal.operator.MutationOperator;
import org.uma.jmetal.operator.SelectionOperator;
import org.uma.jmetal.operator.impl.crossover.SinglePointCrossover;
import org.uma.jmetal.operator.impl.mutation.BitFlipMutation;
import org.uma.jmetal.operator.impl.selection.BinaryTournamentSelection;
import org.uma.jmetal.problem.BinaryProblem;
import org.uma.jmetal.solution.BinarySolution;
import org.uma.jmetal.util.AbstractAlgorithmRunner;
import org.uma.jmetal.util.AlgorithmRunner;
import org.uma.jmetal.util.JMetalLogger;
import org.uma.jmetal.util.ProblemUtils;

import java.util.List;

/**
 * Class for configuring and running the NSGA-II algorithm (binary encoding)
 *
 * @author Antonio J. Nebro <antonio@lcc.uma.es>
 */

public class NSGAIIBinaryRunner extends AbstractAlgorithmRunner {

    private final static Logger logger = Logger.getLogger(NSGAIIBinaryRunner.class.getName());

    /**
     * @param args Command line arguments.
     * @throws ClassNotFoundException
     * Invoking command:
    java org.uma.jmetal.runner.multiobjective.NSGAIIBinaryRunner problemName [referenceFront]
     */
    public static void main(String[] args) throws Exception {

        config();

        int populationSize = 100;
        int maxEvaluations = 1000000;

        if(args != null) {
            if(args.length == 1) {
                populationSize = Integer.valueOf(args[0]);
            } else if(args.length == 2) {
                populationSize = Integer.valueOf(args[0]);
                maxEvaluations = Integer.valueOf(args[1]);
            }
        }

        logger.info("Population size: " + populationSize);
        logger.info("Max evaluations: " + maxEvaluations);

        long start = System.currentTimeMillis();

        Properties.getInstance().checkFileExistence(Properties.GRAPH_PATH,
                "graph_path");

        BinaryProblem problem;
        Algorithm<List<BinarySolution>> algorithm;
        CrossoverOperator<BinarySolution> crossover;
        MutationOperator<BinarySolution> mutation;
        SelectionOperator<List<BinarySolution>, BinarySolution> selection;

        String problemName = "com.dante.filtering.moea.DependencyGraphProblem";
        String referenceParetoFront = "";

        problem = (BinaryProblem) ProblemUtils.<BinarySolution> loadProblem(problemName);

        double crossoverProbability = 0.75;
        crossover = new SinglePointCrossover(crossoverProbability);

        double mutationProbability = 1.0 / problem.getNumberOfVariables();
        mutation = new BitFlipMutation(mutationProbability);

        selection = new BinaryTournamentSelection<>();

        algorithm = new NSGAIIBuilder<>(problem, crossover, mutation, populationSize)
                .setSelectionOperator(selection)
                .setMaxEvaluations(maxEvaluations)
                .build();

        AlgorithmRunner algorithmRunner = new AlgorithmRunner.Executor(algorithm).execute();

        List<BinarySolution> population = algorithm.getResult();
        long computingTime = algorithmRunner.getComputingTime();

        JMetalLogger.logger.info("Total execution time: "
                + new ExecutionTime().computeExecutionTime(computingTime));

        logger.info("Total execution time: "
                + new ExecutionTime().computeExecutionTime(System.currentTimeMillis() - start));

        printFinalSolutionSet(population);
        if (!referenceParetoFront.equals("")) {
            printQualityIndicators(population, referenceParetoFront);
        }

    }

    private static void config(){
        instantiateProperties();
    }

    private static void instantiateProperties(){
        Properties.getInstance().createPropertiesFile();
    }
}
