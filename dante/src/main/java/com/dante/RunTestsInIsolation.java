package com.dante;

import com.dante.coverage.CoverageReport;
import com.dante.coverage.CoverageReportImporter;
import com.dante.parsing.TestCaseFinder;
import com.dante.subjects.Config;
import com.dante.subjects.SetupApp;
import com.dante.suitegenerator.JavaProjectGenerator;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.tedd.execution.TestCaseExecutor;
import com.dante.tedd.execution.TestResult;
import com.dante.tedd.graph.GraphNode;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class RunTestsInIsolation {

    private final static Logger logger = Logger.getLogger(RunTestsInIsolation.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        Config config = SetupApp.getConfig();

        SuiteGeneratorConfig suiteGeneratorConfig = config.getSuiteGeneratorConfig();

        JavaProjectGenerator javaProjectGenerator = new JavaProjectGenerator(suiteGeneratorConfig);

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        TestCaseExecutor<String> testCaseExecutor = new TestCaseExecutor<>();
        Set<Set<GraphNode<String>>> schedules = new LinkedHashSet<>();

        Set<GraphNode<String>> testsThatDidNotFail = new LinkedHashSet<>();

        int numberOfFailures = 0;

        for (int i = 0; i < Properties.tests_order.length; i++) {
            String testName = Properties.tests_order[i];
            Set<GraphNode<String>> schedule = new HashSet<>();
            schedule.add(new GraphNode<>(testName, i));
            schedules.add(schedule);
        }

        try {
            for (Set<GraphNode<String>> schedule : schedules) {
                Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
                Optional<GraphNode<String>> testCaseThatFailedOptional = getFailureTestCase(results);
                if(testCaseThatFailedOptional.isPresent()){
                    String errorMessage = "Test case " + testCaseThatFailedOptional.get()
                            + " failed on schedule " + schedule;
                    logger.warn(errorMessage);
                    numberOfFailures++;
                } else {
                    testsThatDidNotFail.addAll(schedule);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        // FIXME buggy: sometimes it does not recognize the sourcemap (see splittypie/retroboard) --> to fix it, split run and coverage measure as in Atusa
        // modifying test suite path to coverage test suite path to compute coverage of crawljax tests that did not fail
        int indexOfLastSlash = Properties.TEST_SUITE_PATH.lastIndexOf("/");
        Properties.TEST_SUITE_PATH = Properties.TEST_SUITE_PATH.substring(0, indexOfLastSlash) + "/"
                + javaProjectGenerator.getTestSuiteNameCoverage() + ".java";
        logger.info(Properties.TEST_SUITE_PATH);

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        schedules.clear();
        for (GraphNode<String> graphNode : testsThatDidNotFail) {
            Set<GraphNode<String>> schedule = new HashSet<>();
            schedule.add(graphNode);
            schedules.add(schedule);
        }

        try {
            for (Set<GraphNode<String>> schedule : schedules) {
                Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
                Optional<GraphNode<String>> testCaseThatFailedOptional = getFailureTestCase(results);
                if(testCaseThatFailedOptional.isPresent()){
                    String errorMessage = "Test case " + testCaseThatFailedOptional.get()
                            + " failed on schedule " + schedule;
                    logger.warn(errorMessage);
                    numberOfFailures++;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        CoverageReportImporter coverageReportImporter = new CoverageReportImporter();
        CoverageReport coverageReport = coverageReportImporter
                .importReport(Properties.COVERAGE_REPORTS_DIRECTORY_PATH, false);

        logger.info("=====================================");

        logger.info("Number of failures: " + numberOfFailures + ", in percentage: "
                + ((double) (100 * numberOfFailures) / Properties.tests_order.length) + "%");
        logger.info("Number of non failing tests: " + testsThatDidNotFail.size());
        logger.info("Tot percentage covered by these tests: "
                + coverageReport.getTotPercentageCovered() + "%");

        logger.info("=====================================");

        // Somehow it hangs
        System.exit(0);

    }

    private static void config() {
        instantiateProperties();
    }

    private static void instantiateProperties() {
        Properties.getInstance().createPropertiesFile();
    }

    private static Optional<GraphNode<String>> getFailureTestCase(Map<GraphNode<String>, TestResult> results){
        for (GraphNode<String> graphNode : results.keySet()) {
            if(results.get(graphNode).equals(TestResult.FAIL))
                return Optional.of(graphNode);
        }
        return Optional.empty();
    }

    private static Map<GraphNode<String>, TestResult> executeTests(Set<GraphNode<String>> schedule,
                                                                   TestCaseExecutor<String> testCaseExecutor)
            throws InterruptedException,
            ExecutionException,
            IOException {
        logger.info("Running schedule: " + schedule);
        return new HashMap<>(testCaseExecutor.executeTestsRemoteJUnitCore(schedule));
    }
}
