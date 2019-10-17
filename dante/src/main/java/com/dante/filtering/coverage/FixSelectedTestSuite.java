package com.dante.filtering.coverage;

import com.dante.parsing.TestCaseFinder;
import com.dante.tedd.execution.TestCaseExecutor;
import com.dante.tedd.execution.TestResult;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.utils.ComparatorNodesIncreasing;
import com.dante.utils.ExecutionTime;
import com.dante.utils.Properties;
import com.dante.utils.SetsUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class FixSelectedTestSuite {

    private final static Logger logger = Logger.getLogger(FixSelectedTestSuite.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        String solutionAsByteString = Properties.COVERAGE_DRIVEN_TEST_SELECTION_BYTE_STRING;
        if (solutionAsByteString.toCharArray().length != Properties.tests_order.length) {
            throw new IllegalArgumentException("Solution given by the selector " + solutionAsByteString + " does not have" +
                    " the same number of tests " + solutionAsByteString.toCharArray().length + " as the test suite "
                    + Properties.tests_order.length);
        }

        TestCaseExecutor<String> testCaseExecutor = new TestCaseExecutor<>();
        long starTime;
        long endTime;
        Set<GraphNode<String>> schedule;

        Set<GraphNode<String>> allTests = new LinkedHashSet<>();
        Set<GraphNode<String>> testsInSelectedSuite = new LinkedHashSet<>();
        char[] solutionAsByteArray = solutionAsByteString.toCharArray();
        for (int i = 0; i < Properties.tests_order.length; i++) {
            String test = Properties.tests_order[i];
            GraphNode<String> testNode = new GraphNode<>(test, i);
            allTests.add(testNode);
            if(solutionAsByteArray[i] == '1') {
                testsInSelectedSuite.add(testNode);
            }
        }

        if(testsInSelectedSuite.isEmpty()) {
            throw new RuntimeException("Solution as string does not contain any '1'");
        }

        try {


            logger.info("Fixing selected test suite...");
            schedule = new LinkedHashSet<>(testsInSelectedSuite);
            long starTimeTotal = System.currentTimeMillis();
            starTime = System.currentTimeMillis();
            Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
            Optional<GraphNode<String>> testCaseThatFailedOptional = getFailureTestCase(results);
            Optional<GraphNode<String>> previousTestCaseThatFailedOptional = testCaseThatFailedOptional;
            Set<GraphNode<String>> previoulsyAddedPreconditions = new HashSet<>();
            int numOfPreconditionsToAdd = 1;
            int preconditionCounter = 0;

            // moving window heuristics
            while(testCaseThatFailedOptional.isPresent()){
                GraphNode<String> testCaseThatFailed = testCaseThatFailedOptional.get();
                endTime = System.currentTimeMillis();
                logger.info("Test case " + testCaseThatFailed + " failed on schedule " + schedule);
                logger.info("Time elapsed: " + new ExecutionTime().computeExecutionTime(endTime - starTime));
                Set<GraphNode<String>> testsTillFailedOne = schedule.stream()
                        .filter(node -> node.getNumOrder() < testCaseThatFailed.getNumOrder())
                        .collect(Collectors.toSet());
                Set<GraphNode<String>> allTestsTillFailedOne = allTests.stream()
                        .filter(node -> node.getNumOrder() < testCaseThatFailed.getNumOrder())
                        .collect(Collectors.toSet());

                Set<GraphNode<String>> preconditions = SetsUtils
                        .setsDifference(allTestsTillFailedOne, testsTillFailedOne);
                List<GraphNode<String>> orderedPreconditions = new LinkedList<>(preconditions);
                orderedPreconditions.sort(new ComparatorNodesIncreasing<>());
                preconditions = new LinkedHashSet<>(orderedPreconditions);

                logger.info("Test case " + testCaseThatFailed + " probably depends on " +
                        "one or more of the following tests: " + preconditions);
                if(!previousTestCaseThatFailedOptional.equals(testCaseThatFailedOptional)) {
                    previousTestCaseThatFailedOptional = testCaseThatFailedOptional;

                    numOfPreconditionsToAdd = 1;
                    preconditionCounter = 0;

                    previoulsyAddedPreconditions.clear();
                } else if(previousTestCaseThatFailedOptional.equals(testCaseThatFailedOptional)
                        && preconditionCounter == preconditions.size()) {
                    previoulsyAddedPreconditions.clear();

                    numOfPreconditionsToAdd++;
                    preconditionCounter = 0;
                }

                Set<GraphNode<String>> preconditionsToAdd =
                        getSubsetPreconditions(preconditions, numOfPreconditionsToAdd,
                                preconditionCounter);
                preconditionCounter++;

                if(previoulsyAddedPreconditions.containsAll(preconditionsToAdd)) {
                    previoulsyAddedPreconditions.clear();

                    numOfPreconditionsToAdd++;
                    preconditionCounter = 0;
                    preconditionsToAdd =
                            getSubsetPreconditions(preconditions, numOfPreconditionsToAdd,
                                    preconditionCounter);
                    preconditionCounter++;

                } else {
                    previoulsyAddedPreconditions.addAll(preconditionsToAdd);
                }

                logger.info("Adding preconditions: " + preconditionsToAdd);

                schedule.addAll(preconditionsToAdd);
                List<GraphNode<String>> orderedSchedule = new ArrayList<>(schedule);
                orderedSchedule.sort(new ComparatorNodesIncreasing<>());
                schedule = new LinkedHashSet<>(orderedSchedule);
                logger.info("Schedule: " + schedule);
                results = executeTests(schedule, testCaseExecutor);
                testCaseThatFailedOptional = getFailureTestCase(results);

                // the first condition is to avoid carrying test cases that are not useful to fix the test suite
                // the second condition is to avoid loop
                if((testCaseThatFailedOptional.isPresent()
                        && testCaseThatFailedOptional.equals(previousTestCaseThatFailedOptional))
                        || testCaseThatFailedOptional.isPresent() && testCaseThatFailedOptional.get().getNumOrder()
                        < previousTestCaseThatFailedOptional.get().getNumOrder()) {

                    logger.info("Removing added preconditions: " + preconditionsToAdd);
                    schedule.removeAll(preconditionsToAdd);
                    testCaseThatFailedOptional = previousTestCaseThatFailedOptional;
                }
            }

            long endTimeTotal = System.currentTimeMillis();
            long timeToFixSelectedTestSuite = endTimeTotal - starTimeTotal;

            logger.info("Executing final filtered test suite: " + schedule);
            results = executeTests(schedule, testCaseExecutor);
            testCaseThatFailedOptional = getFailureTestCase(results);
            if(testCaseThatFailedOptional.isPresent()){
                String errorMessage = "Test case " + testCaseThatFailedOptional.get()
                        + " failed on schedule " + schedule + ". Something went wrong during validation/selection!";
                throw new RuntimeException(errorMessage);
            }

            StringBuilder newSolutionAsByteArrayString = new StringBuilder();
            int numberOfTestsInFinalTestSuite = 0;
            for (int i = 0; i < solutionAsByteArray.length; i++) {
                char solution = solutionAsByteArray[i];
                final int position = i;
                if(solution == '1') {
                    newSolutionAsByteArrayString.append("1");
                    numberOfTestsInFinalTestSuite++;
                } else {
                    Optional<GraphNode<String>> optionalNodeInFinalSchedule = schedule.stream()
                            .filter(node -> node.getNumOrder() == position).findFirst();
                    if(optionalNodeInFinalSchedule.isPresent()) {
                        newSolutionAsByteArrayString.append("1");
                        numberOfTestsInFinalTestSuite++;
                    } else {
                        newSolutionAsByteArrayString.append("0");
                    }
                }
            }


            logger.info("=====================================");

            logger.info("Number of tests in original suite: " + allTests.size());
            logger.info("Number of tests in filtered suite: " + numberOfTestsInFinalTestSuite);
            logger.info("Filtered rate reduction: "
                    + ((double) (allTests.size() - numberOfTestsInFinalTestSuite) / allTests.size()) * 100 + "%");
            logger.info("Time to fix selected test suite: "
                    + new ExecutionTime().computeExecutionTime(timeToFixSelectedTestSuite));
            logger.info("Final filtered test suite: " + newSolutionAsByteArrayString.toString());

            logger.info("=====================================");

        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        // Somehow it hangs
        System.exit(0);

    }

    private static Set<GraphNode<String>> getSubsetPreconditions(Set<GraphNode<String>> preconditions,
                                                                 int preconditionsToAdd, int preconditionCounter) {
        if(preconditionCounter == preconditions.size()) {
            throw new IllegalArgumentException("Precondition counter: " + preconditionCounter
                    + " = number of preconditions: " + preconditions.size());
        }
        if(preconditionCounter + preconditionsToAdd > preconditions.size()) {
            return preconditions;
        }
        return new LinkedHashSet<>(new LinkedList<>(preconditions).subList(preconditionCounter,
                preconditionCounter + preconditionsToAdd));
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
