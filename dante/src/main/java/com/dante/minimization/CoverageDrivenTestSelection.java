package com.dante.minimization;

import com.dante.coverage.CoverageReport;
import com.dante.coverage.CoverageReportImporter;
import com.dante.parsing.TestCaseFinder;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.GraphUtils;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

class CoverageDrivenTestSelection {

    private final static Logger logger = Logger.getLogger(CoverageDrivenTestSelection.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkDirectoryExistence(Properties.COVERAGE_REPORTS_DIRECTORY_PATH,
                "coverage_reports_directory_path");
        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");
        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        CoverageReportImporter coverageReportImporter = new CoverageReportImporter();
        CoverageReport coverageReport
                = coverageReportImporter.importReport(Properties.COVERAGE_REPORTS_DIRECTORY_PATH);


        TestSelector testSelector = new TestSelector();

        logger.info("======================================");
        long start = System.currentTimeMillis();
        List<GraphNode<String>> selectedTestCases = testSelector.greedySelectingTestCases(coverageReport);

        StringBuilder solutionByteString = new StringBuilder();
        for (GraphNode<String> test : GraphUtils.mapTestsOrderToNodesOrder(Arrays.asList(Properties.tests_order))) {
            if(selectedTestCases.contains(test)) {
                solutionByteString.append("1");
            } else {
                solutionByteString.append("0");
            }
        }

        logger.info("Time elapsed for coverage driven test selection: "
                + ((System.currentTimeMillis() - start)/1000) + "s");
        logger.info("Selected test cases size: " + selectedTestCases.size());
        logger.info("Selected test cases: " + selectedTestCases);
        logger.info("Solution byte string: " + solutionByteString);
        logger.info("Tests in original test suite: " + coverageReport.getMapTestCovUnits().keySet().size());
        logger.info("======================================");
    }

    private static void config() {
        instantiateProperties();
    }

    private static void instantiateProperties() {
        Properties.getInstance().createPropertiesFile();
    }
}
