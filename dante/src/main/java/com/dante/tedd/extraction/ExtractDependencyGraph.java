package com.dante.tedd.extraction;

import com.dante.parsing.TestCaseFinder;
import com.dante.subjects.Config;
import com.dante.subjects.SetupApp;
import com.dante.tedd.extraction.coverage_selection.CoverageDrivenGraphExtraction;
import com.dante.tedd.extraction.moea.MoeaDependencyGraphExtraction;
import com.dante.tedd.extraction.originalorder.OriginalOrderDependencyGraphExtractor;
import com.dante.tedd.extraction.string.ConstantStringsAnalyzer;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.exportgraph.GraphExporter;
import com.dante.utils.Properties;
import org.jgrapht.Graph;

public class ExtractDependencyGraph {

    public static void main(String[] args) {

        config();

        Config config = SetupApp.getConfig();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        DependencyGraphExtractor dependencyGraphExtractor = getExtractionStrategy(config);

        Graph<GraphNode<String>, GraphEdge> graph = dependencyGraphExtractor.computeDependencies();
        GraphExporter<String> graphExporter = new GraphExporter<>(graph);

        String graphName = "graph";
        if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.ORIGINAL_ORDER.getStrategyName())) {
            graphName += "-original-order";
        } else if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.MOEA.getStrategyName())) {
            graphName += "-moea";
        } else if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.SUB_USE.getStrategyName())) {
            graphName += "-string";
        } else if(Properties.EXTRACTION_STRATEGY.equals(ExtractionStrategies.Strategy.COVERAGE.getStrategyName())) {
            graphName += "-coverage";
        }

        graphExporter.export(graphName);

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
            } else if(strategy.equals(ExtractionStrategies.Strategy.MOEA.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new MoeaDependencyGraphExtraction(config);
            } else if(strategy.equals(ExtractionStrategies.Strategy.SUB_USE.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new ConstantStringsAnalyzer();
            }else if(strategy.equals(ExtractionStrategies.Strategy.COVERAGE.getStrategyName()) && extractionStrategy.equals(strategy)) {
                return new CoverageDrivenGraphExtraction(config);
            }
        }
        throw new IllegalArgumentException("Unknown extraction strategy "
                + extractionStrategy + ". See " + ExtractionStrategies.class + " for reference.");
    }
}
