package com.dante.suitegenerator.atusa;

import com.dante.parsing.TestCaseFinder;
import com.dante.subjects.Config;
import com.dante.subjects.SetupApp;
import com.dante.suitegenerator.JavaProjectGenerator;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.tedd.execution.TestCaseExecutor;
import com.dante.tedd.execution.TestResult;
import com.dante.tedd.graph.GraphNode;
import com.dante.utils.ExecutionTime;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class RunAtusaTestsInIsolation {

    private final static Logger logger = Logger.getLogger(RunAtusaTestsInIsolation.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        Config config = SetupApp.getConfig();

        SuiteGeneratorConfig suiteGeneratorConfig = config.getSuiteGeneratorConfig();

        JavaProjectGenerator javaProjectGenerator = new JavaProjectGenerator(suiteGeneratorConfig);

        // modifying test suite path to coverage test suite path to compute failure rate of atusa tests
        int indexOfLastSlash = Properties.TEST_SUITE_PATH.lastIndexOf("/");
        Properties.TEST_SUITE_PATH = Properties.TEST_SUITE_PATH.substring(0, indexOfLastSlash)
                + "/" + javaProjectGenerator.getAtusaTestSuiteName() + ".java";

        logger.info(Properties.TEST_SUITE_PATH);

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        TestCaseExecutor<String> testCaseExecutor = new TestCaseExecutor<>();
        Set<Set<GraphNode<String>>> schedules = new LinkedHashSet<>();

        Set<GraphNode<String>> testsThatDidNotFail = new LinkedHashSet<>();
        StringBuilder suiteExecutionResultAsByteString = new StringBuilder();

        int numberOfFailures = 0;

        for (int i = 0; i < Properties.tests_order.length; i++) {
            String testName = Properties.tests_order[i];
            Set<GraphNode<String>> schedule = new HashSet<>();
            schedule.add(new GraphNode<>(testName, i));
            schedules.add(schedule);
        }

        ExecutionTime executionTime = new ExecutionTime();
        long start = System.currentTimeMillis();
        try {
            for (Set<GraphNode<String>> schedule : schedules) {
                Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
                Optional<GraphNode<String>> testCaseThatFailedOptional = getFailureTestCase(results);
                if(testCaseThatFailedOptional.isPresent()){
                    String errorMessage = "Test case " + testCaseThatFailedOptional.get()
                            + " failed on schedule " + schedule;
                    logger.warn(errorMessage);
                    numberOfFailures++;
                    suiteExecutionResultAsByteString.append("0");
                } else {
                    testsThatDidNotFail.addAll(schedule);
                    suiteExecutionResultAsByteString.append("1");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        executionTime = executionTime.computeExecutionTime((System.currentTimeMillis() - start));


        logger.info("=====================================");
        logger.info("Number of failures: " + numberOfFailures + ", in percentage: "
                + ((double) (100 * numberOfFailures) / Properties.tests_order.length) + "%");
        logger.info("Execution time: " + executionTime);
        logger.info("Number of non failing tests: " + testsThatDidNotFail.size());
        logger.info("Tests that did not fail: " + testsThatDidNotFail.stream().map(GraphNode::toString)
                .collect(Collectors.joining("-")));
        logger.info("Suite execution result as byte string: " + suiteExecutionResultAsByteString);
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
