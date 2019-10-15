package com.dante.minimization;

import com.dante.parsing.TestCaseFinder;
import com.dante.tedd.execution.TestCaseExecutor;
import com.dante.tedd.execution.TestResult;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.GraphUtils;
import com.dante.tedd.graph.dot.importgraph.GraphImporter;
import com.dante.tedd.validation.scheduling.InvalidScheduleException;
import com.dante.tedd.validation.scheduling.OriginalOrderScheduler;
import com.dante.tedd.validation.scheduling.RefinementScheduler;
import com.dante.utils.ExecutionTime;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jgrapht.Graph;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class MeasureMinimizationReductionRate {

    private final static Logger logger = Logger.getLogger(MeasureMinimizationReductionRate.class.getName());

    /**
     * @implNote It checks if the final graph obtained with the runtime validation is correct
     */
    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        String solutionAsByteString = Properties.SOLUTION_BYTE_STRING;
        if (solutionAsByteString.toCharArray().length != Properties.tests_order.length) {
            throw new IllegalArgumentException("Solution given by the solver " + solutionAsByteString + " does not have" +
                    " the same number of tests " + solutionAsByteString.toCharArray().length + " as the test suite "
                    + Properties.tests_order.length);
        }

        TestCaseExecutor<String> testCaseExecutor = new TestCaseExecutor<>();
        long starTime;
        long endTime;
        Set<GraphNode<String>> schedule;

        Set<GraphNode<String>> allTests = new LinkedHashSet<>();
        Set<GraphNode<String>> testsInMinimizedSuite = new LinkedHashSet<>();
        char[] solutionAsByteArray = solutionAsByteString.toCharArray();
        for (int i = 0; i < Properties.tests_order.length; i++) {
            String test = Properties.tests_order[i];
            GraphNode<String> testNode = new GraphNode<>(test, i);
            allTests.add(testNode);
            if(solutionAsByteArray[i] == '1') {
                testsInMinimizedSuite.add(testNode);
            }
        }

        if(testsInMinimizedSuite.isEmpty()) {
            throw new RuntimeException("Solution as string does not contain any '1'");
        }

        try {


            logger.info("Executing original test suite...");
            starTime = System.currentTimeMillis();
            schedule = new LinkedHashSet<>(allTests);
            Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
            Optional<GraphNode<String>> testCaseThatFailedOptional = getFailureTestCase(results);
            if(testCaseThatFailedOptional.isPresent()){
                String errorMessage = "Test case " + testCaseThatFailedOptional.get()
                        + " failed on schedule " + schedule + ", test suite might be flaky!";
                throw new RuntimeException(errorMessage);
            }
            endTime = System.currentTimeMillis();
            long timeToExecuteOriginalTestSuite = endTime - starTime;


            logger.info("Executing minimized test suite...");
            schedule = new LinkedHashSet<>(testsInMinimizedSuite);
            starTime = System.currentTimeMillis();
            results = executeTests(schedule, testCaseExecutor);
            testCaseThatFailedOptional = getFailureTestCase(results);
            if(testCaseThatFailedOptional.isPresent()){
                String errorMessage = "Test case " + testCaseThatFailedOptional.get()
                        + " failed on schedule " + schedule + ". Something went wrong during validation/minimization!";
                throw new RuntimeException(errorMessage);
            }
            endTime = System.currentTimeMillis();
            long timeToExecuteMinimizedTestSuite = endTime - starTime;

            logger.info("=====================================");

            logger.info("Number of tests in original suite: " + allTests.size());
            logger.info("Number of tests in minimized suite: " + testsInMinimizedSuite.size());
            logger.info("Minimization rate reduction: "
                    + ((double) (allTests.size() - testsInMinimizedSuite.size()) / allTests.size()) * 100 + "%");
            logger.info("Original suite execution time: "
                    + new ExecutionTime().computeExecutionTime(timeToExecuteOriginalTestSuite));
            logger.info("Minimized suite execution time: "
                    + new ExecutionTime().computeExecutionTime(timeToExecuteMinimizedTestSuite));
            logger.info("Minimization time rate reduction: "
                    + ((double) (timeToExecuteOriginalTestSuite - timeToExecuteMinimizedTestSuite) / timeToExecuteOriginalTestSuite) * 100 + "%");


            logger.info("=====================================");

        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        // Somehow it hangs
        System.exit(0);

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
        return new HashMap<>(testCaseExecutor.executeTestsRemoteJUnitCore(schedule));
    }

    private static void config() {
        instantiateProperties();
    }

    private static void instantiateProperties() {
        Properties.getInstance().createPropertiesFile();
    }
}
