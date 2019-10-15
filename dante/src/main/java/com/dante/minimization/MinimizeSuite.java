package com.dante.minimization;

import com.dante.coverage.CoverageReport;
import com.dante.coverage.CoverageReportImporter;
import com.dante.parsing.TestCaseFinder;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.dot.importgraph.GraphImporter;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

class MinimizeSuite {

    private final static Logger logger = Logger.getLogger(MinimizeSuite.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.VALIDATED_GRAPH_PATH,
                "validated_graph_path");
        Properties.getInstance().checkDirectoryExistence(Properties.COVERAGE_REPORTS_DIRECTORY_PATH,
                "coverage_reports_directory_path");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        GraphImporter graphImporter = new GraphImporter();
        Graph<GraphNode<String>, GraphEdge> dependencyGraph =
                graphImporter.importGraph(Properties.VALIDATED_GRAPH_PATH);

        CoverageReportImporter coverageReportImporter = new CoverageReportImporter();
        CoverageReport coverageReport
                = coverageReportImporter.importReport(Properties.COVERAGE_REPORTS_DIRECTORY_PATH);


        Minimizer minimizer = new Minimizer();

        logger.info("======================================");
        logger.info("Finding solution to the minimization problem...");
        long start = System.currentTimeMillis();
        minimizer.minimizeTestSuite(coverageReport, dependencyGraph, false);
        logger.info("Time elapsed for minimization: " + ((System.currentTimeMillis() - start)/1000) + "s");
        logger.info("======================================");

//        System.out.println();
//        logger.info("======================================");
//        logger.info("Finding all the solutions to the minimization problem...");
//        start = System.currentTimeMillis();
//        minimizer.minimizeTestSuite(coverageReport, dependencyGraph, true);
//        logger.info("Time elapsed for minimization: " + ((System.currentTimeMillis() - start)/1000) + "s");
//        logger.info("======================================");
    }

    private static void config() {
        instantiateProperties();
    }

    private static void instantiateProperties() {
        Properties.getInstance().createPropertiesFile();
    }
}
