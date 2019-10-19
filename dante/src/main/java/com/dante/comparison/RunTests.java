package com.dante.comparison;

import com.dante.parsing.TestCaseFinder;
import com.dante.tedd.execution.TestCaseExecutor;
import com.dante.tedd.execution.TestResult;
import com.dante.tedd.graph.GraphNode;
import com.dante.utils.ExecutionTime;
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
import java.util.stream.Collectors;

public class RunTests {

    private final static Logger logger = Logger.getLogger(RunTests.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");
        Properties.getInstance().checkPropertyNotEmpty(Properties.TECHNIQUE,
                "technique");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        TestCaseExecutor<String> testCaseExecutor = new TestCaseExecutor<>();
        Set<Set<GraphNode<String>>> schedules = new LinkedHashSet<>();

        Set<GraphNode<String>> testsThatDidNotBreak = new LinkedHashSet<>();
        StringBuilder suiteExecutionResultAsByteString = new StringBuilder();

        int numberOfBreakages = 0;
        Set<GraphNode<String>> allTests = new LinkedHashSet<>();

        if(Properties.TECHNIQUE.equals(Techniques.Technique.DANTE.getTechniqueName())) {
            // execute dante minimized test suite
            Properties.getInstance().checkPropertyNotEmpty(Properties.SOLUTION_BYTE_STRING,
                    "solution_byte_string");
            String solutionAsByteString = Properties.SOLUTION_BYTE_STRING;
            if (solutionAsByteString.toCharArray().length != Properties.tests_order.length) {
                throw new IllegalArgumentException("Solution given by the solver " + solutionAsByteString + " does not have" +
                        " the same number of tests " + solutionAsByteString.toCharArray().length + " as the test suite "
                        + Properties.tests_order.length);
            }
            char[] solutionAsByteArray = solutionAsByteString.toCharArray();
            Set<GraphNode<String>> testsInMinimizedSuite = new LinkedHashSet<>();
            for (int i = 0; i < Properties.tests_order.length; i++) {
                String testName = Properties.tests_order[i];
                GraphNode<String> testNode = new GraphNode<>(testName, i);
                allTests.add(testNode);
                if(solutionAsByteArray[i] == '1') {
                    testsInMinimizedSuite.add(testNode);
                }
            }
            if(testsInMinimizedSuite.isEmpty()) {
                throw new RuntimeException("Solution as string does not contain any '1'");
            }
            Set<GraphNode<String>> schedule;
            schedule = new LinkedHashSet<>(testsInMinimizedSuite);
            schedules.add(schedule);
        } else {
            // crawljax and atusa tests are executed in isolation
            for (int i = 0; i < Properties.tests_order.length; i++) {
                String testName = Properties.tests_order[i];
                Set<GraphNode<String>> schedule = new HashSet<>();
                GraphNode<String> testNode = new GraphNode<>(testName, i);
                schedule.add(testNode);
                allTests.add(testNode);
                schedules.add(schedule);
            }
        }

        ExecutionTime executionTime = new ExecutionTime();
        long start = System.currentTimeMillis();
        try {
            for (Set<GraphNode<String>> schedule : schedules) {
                Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
                Optional<GraphNode<String>> testCaseThatBrokeOptional = getBrokenTestCase(results);
                if(testCaseThatBrokeOptional.isPresent()){
                    String errorMessage = "Test case " + testCaseThatBrokeOptional.get()
                            + " broke on schedule " + schedule;
                    logger.warn(errorMessage);
                    numberOfBreakages++;
                } else {
                    testsThatDidNotBreak.addAll(schedule);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        executionTime = executionTime.computeExecutionTime((System.currentTimeMillis() - start));

        for (GraphNode<String> testNode : allTests) {
            if(testsThatDidNotBreak.contains(testNode)) {
                suiteExecutionResultAsByteString.append("1");
            } else {
                // in dante's case we are going to pretend that a non executed test is a broken test
                suiteExecutionResultAsByteString.append("0");
            }
        }

        logger.info("=====================================");
        logger.info("Number of breakages: " + numberOfBreakages + ", in percentage: "
                + ((double) (100 * numberOfBreakages) / Properties.tests_order.length) + "%");
        logger.info("Execution time: " + executionTime);
        logger.info("Number of non breaking tests: " + testsThatDidNotBreak.size());
        logger.info("Tests that did not break: " + testsThatDidNotBreak.stream().map(GraphNode::toString)
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

    private static Optional<GraphNode<String>> getBrokenTestCase(Map<GraphNode<String>, TestResult> results){
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
