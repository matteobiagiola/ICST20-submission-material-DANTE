package com.dante.comparison;

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

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class MeasureCoverageOfTests {

    private final static Logger logger = Logger.getLogger(MeasureCoverageOfTests.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");
        Properties.getInstance().checkPropertyNotEmpty(Properties.SUITE_EXECUTION_RESULT_BYTE_STRING,
                "suite_execution_result_byte_string");
        Properties.getInstance().checkPropertyNotEmpty(Properties.TECHNIQUE,
                "technique");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        String suiteExecutionResultByteString = Properties.SUITE_EXECUTION_RESULT_BYTE_STRING;
        if (suiteExecutionResultByteString.toCharArray().length != Properties.tests_order.length) {
            throw new IllegalArgumentException("Byte string of suite execution result " + suiteExecutionResultByteString + " does not have" +
                    " the same number of tests " + suiteExecutionResultByteString.toCharArray().length + " as the test suite "
                    + Properties.tests_order.length);
        }

        TestCaseExecutor<String> testCaseExecutor = new TestCaseExecutor<>();
        Set<Set<GraphNode<String>>> schedules = new LinkedHashSet<>();

        char[] suiteExecutionResultByteArray = suiteExecutionResultByteString.toCharArray();
        if(Properties.TECHNIQUE.equals(Techniques.Technique.DANTE.getTechniqueName())) {
            // execute dante minimized test suite
            Set<GraphNode<String>> schedule = new HashSet<>();
            for (int i = 0; i < Properties.tests_order.length; i++) {
                String testName = Properties.tests_order[i];
                if(suiteExecutionResultByteArray[i] == '1') {
                    GraphNode<String> graphNode = new GraphNode<>(testName, i);
                    schedule.add(graphNode);
                }
            }
            schedules.add(schedule);
        } else {
            // crawljax and atusa tests are executed in isolation
            for (int i = 0; i < Properties.tests_order.length; i++) {
                String testName = Properties.tests_order[i];
                if(suiteExecutionResultByteArray[i] == '1') {
                    Set<GraphNode<String>> schedule = new HashSet<>();
                    GraphNode<String> graphNode = new GraphNode<>(testName, i);
                    schedule.add(graphNode);
                    schedules.add(schedule);
                }
            }
        }

        try {
            for (Set<GraphNode<String>> schedule : schedules) {
                Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
                Optional<GraphNode<String>> testCaseThatFailedOptional = getFailureTestCase(results);
                if(testCaseThatFailedOptional.isPresent()){
                    String errorMessage = "Test case " + testCaseThatFailedOptional.get()
                            + " failed on schedule " + schedule;
                    logger.warn(errorMessage);
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
