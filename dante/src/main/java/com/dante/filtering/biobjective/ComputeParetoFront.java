package com.dante.filtering.biobjective;

import com.dante.parsing.TestCaseFinder;
import com.dante.tedd.extraction.DependencyGraphExtractor;
import com.dante.tedd.extraction.originalorder.OriginalOrderDependencyGraphExtractor;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.exportgraph.GraphExporter;
import com.dante.utils.ExecutionTime;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;
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

import java.util.Arrays;
import java.util.List;

/**
 * Class for configuring and running the NSGA-II algorithm (binary encoding)
 *
 * @author Antonio J. Nebro <antonio@lcc.uma.es>
 */

public class ComputeParetoFront extends AbstractAlgorithmRunner {

    private final static Logger logger = Logger.getLogger(ComputeParetoFront.class.getName());

    /**
     * @param args Command line arguments.
     * @throws ClassNotFoundException
     * Invoking command:
    java org.uma.jmetal.runner.multiobjective.NSGAIIBinaryRunner problemName [referenceFront]
     */
    public static void main(String[] args) throws Exception {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();
        logger.info("Tests order: " + Arrays.asList(Properties.tests_order));

        DependencyGraphExtractor dependencyGraphExtractor
                = new OriginalOrderDependencyGraphExtractor();

        Graph<GraphNode<String>, GraphEdge> dependencyGraph = dependencyGraphExtractor.computeDependencies();
        logger.info("Number of tests: " + dependencyGraph.vertexSet().size());
        logger.info("Number of dependencies: " + dependencyGraph.edgeSet().size());

        GraphExporter<String> graphExporter = new GraphExporter<>(dependencyGraph);
        graphExporter.export("graph-original-order");

        Properties.GRAPH_PATH = graphExporter.getDependencyGraphPath();
        logger.info("Graph path: " + Properties.GRAPH_PATH);

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

        BinaryProblem problem;
        Algorithm<List<BinarySolution>> algorithm;
        CrossoverOperator<BinarySolution> crossover;
        MutationOperator<BinarySolution> mutation;
        SelectionOperator<List<BinarySolution>, BinarySolution> selection;

        String problemName = "com.dante.filtering.biobjective.DependencyGraphProblem";
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
