package com.dante.tedd.validation;

import com.dante.parsing.TestCaseFinder;
import com.dante.tedd.extraction.ExtractionStrategies;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.exportgraph.GraphExporter;
import com.dante.tedd.graph.dot.importgraph.GraphImporter;
import com.dante.tedd.validation.recovery.RecoverMissedDependencies;
import com.dante.utils.ExecutionTime;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.io.File;
import java.util.Arrays;

public class ValidateDependencies {

    private final static Logger logger = Logger.getLogger(ComputeAndValidateDependencies.class.getName());


    /**
     * @implNote it takes a dependency graph (obtained either manually or automatically) and refines it
     * */
    public static void main(String[] args){

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");
        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        boolean checkForMissing = false;

        GraphImporter graphImporter = new GraphImporter();

        if(!new File(Properties.GRAPH_PATH).exists()) {
            throw new IllegalArgumentException("Dependency graph path " + Properties.GRAPH_PATH + " does not exist");
        }

        Graph<GraphNode<String>, GraphEdge> dependencyGraph = graphImporter.importGraph(Properties.GRAPH_PATH);

        GraphExporter<String> graphExporter;

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
                    + Properties.EXTRACTION_STRATEGY + "-final-refine");

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
                        +  "-final-recover-missed");
            }

        } catch (Exception e) {
            e.printStackTrace();
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
}
