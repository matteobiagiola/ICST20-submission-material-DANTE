package com.dante.tedd.validation;

import com.dante.parsing.TestCaseFinder;
import com.dante.subjects.Config;
import com.dante.subjects.SetupApp;
import com.dante.tedd.extraction.DependencyGraphExtractor;
import com.dante.tedd.extraction.ExtractionStrategies;
import com.dante.tedd.extraction.coverage_selection.CoverageDrivenGraphExtraction;
import com.dante.tedd.extraction.moea.BiobjectiveDependencyGraphExtraction;
import com.dante.tedd.extraction.originalorder.OriginalOrderDependencyGraphExtractor;
import com.dante.tedd.extraction.string.ConstantStringsAnalyzer;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.exportgraph.GraphExporter;
import com.dante.tedd.validation.recovery.RecoverMissedDependencies;
import com.dante.utils.ExecutionTime;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.util.Arrays;

public class ComputeAndValidateDependencies {


    private final static Logger logger = Logger.getLogger(ComputeAndValidateDependencies.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");
        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        boolean checkForMissing = false;

        Config config = SetupApp.getConfig();
        DependencyGraphExtractor dependencyGraphExtractor = getExtractionStrategy(config);

        Graph<GraphNode<String>, GraphEdge> dependencyGraph = dependencyGraphExtractor.computeDependencies();

        GraphExporter<String> graphExporter = new GraphExporter<>(dependencyGraph);
        graphExporter.export("dependency-graph-"
                + Properties.EXTRACTION_STRATEGY + "-initial");


        if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.BIOBJECTIVE.getStrategyName())
                || Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.SUB_USE.getStrategyName())) {
            checkForMissing = true;
        }

        DependencyRefiner dependencyRefiner = new DependencyRefiner(checkForMissing);

        try {

            if(Properties.INCREMENTAL_REFINEMENT) {
                dependencyRefiner.refineIncrementally(dependencyGraph);
            } else {
                dependencyRefiner.refine(dependencyGraph);
            }

            graphExporter = new GraphExporter<>(dependencyGraph);
            graphExporter.export("dependency-graph-"
                    + Properties.EXTRACTION_STRATEGY + "-final");

            if(checkForMissing) {

                long startTime = System.currentTimeMillis();
                RecoverMissedDependencies recoverMissedDependencies
                        = new RecoverMissedDependencies(dependencyRefiner.getExecutionTimes(), dependencyGraph);
                dependencyGraph = recoverMissedDependencies.computeMissedDependencies();

                graphExporter = new GraphExporter<>(dependencyGraph);
                graphExporter.export("dependency-graph-"
                        + Properties.EXTRACTION_STRATEGY + "-initial-recover-missed");

                int iterationId = dependencyRefiner.getIterationId();
                dependencyRefiner = new DependencyRefiner(recoverMissedDependencies.getExecutionTimes(),
                        false, iterationId);

                dependencyRefiner.refine(dependencyGraph);

                logger.info("Time spent in recovering missed dependencies: "
                        + new ExecutionTime()
                        .computeExecutionTime(Arrays.asList((System.currentTimeMillis() - startTime))));

                graphExporter = new GraphExporter<>(dependencyGraph);
                graphExporter.export("dependency-graph-" + Properties.EXTRACTION_STRATEGY
                        + "-final-recover-missed");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(50);
        }

        // somehow refine hangs
        System.exit(0);
    }

    private static void config(){
        instantiateProperties();
    }

    private static void instantiateProperties(){
        Properties.getInstance().createPropertiesFile();
    }

    private static DependencyGraphExtractor getExtractionStrategy(Config config) {
        String extractionStrategy = Properties.EXTRACTION_STRATEGY;
        for (String strategy: ExtractionStrategies.getValues()){
            if(strategy.equals(ExtractionStrategies.Strategy.ORIGINAL_ORDER.getStrategyName()) && extractionStrategy.equals(strategy)){
                return new OriginalOrderDependencyGraphExtractor();
            } else if(strategy.equals(ExtractionStrategies.Strategy.BIOBJECTIVE.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new BiobjectiveDependencyGraphExtraction(config);
            } else if(strategy.equals(ExtractionStrategies.Strategy.SUB_USE.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new ConstantStringsAnalyzer();
            }   else if(strategy.equals(ExtractionStrategies.Strategy.COVERAGE_DRIVEN.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new CoverageDrivenGraphExtraction(config);
            }
        }
        throw new IllegalArgumentException("Unknown extraction strategy "
                + extractionStrategy + ". See " + ExtractionStrategies.class + " for reference.");
    }
}
