package com.dante.minimization;

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

public class FixMinimizedTestSuite {

    private final static Logger logger = Logger.getLogger(FixMinimizedTestSuite.class.getName());

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


            logger.info("Fixing minimized test suite...");
            schedule = new LinkedHashSet<>(testsInMinimizedSuite);
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

            // One by one heuristics
//            while(testCaseThatFailedOptional.isPresent()){
//                GraphNode<String> testCaseThatFailed = testCaseThatFailedOptional.get();
//                endTime = System.currentTimeMillis();
//                logger.info("Test case " + testCaseThatFailed + " failed on schedule " + schedule);
//                logger.info("Time elapsed: " + new ExecutionTime().computeExecutionTime(endTime - starTime));
//                Set<GraphNode<String>> testsTillFailedOne = schedule.stream()
//                        .filter(node -> node.getNumOrder() < testCaseThatFailed.getNumOrder())
//                        .collect(Collectors.toSet());
//                Set<GraphNode<String>> allTestsTillFailedOne = allTests.stream()
//                        .filter(node -> node.getNumOrder() < testCaseThatFailed.getNumOrder())
//                        .collect(Collectors.toSet());
//
//                Set<GraphNode<String>> preconditions = SetsUtils
//                        .setsDifference(allTestsTillFailedOne, testsTillFailedOne);
//                List<GraphNode<String>> orderedPreconditions = new LinkedList<>(preconditions);
//                orderedPreconditions.sort(new ComparatorNodesIncreasing<>());
//                preconditions = new LinkedHashSet<>(orderedPreconditions);
//
//                logger.info("Test case " + testCaseThatFailed + " probably depends on " +
//                        "one or more of the following tests: " + preconditions);
//                if(!previousTestCaseThatFailedOptional.equals(testCaseThatFailedOptional)) {
//                    previousTestCaseThatFailedOptional = testCaseThatFailedOptional;
//
//                }
//
//                if(preconditions.isEmpty()) {
//                    throw new RuntimeException("Adding all preconditions did not let "
//                            + testCaseThatFailed + " to pass");
//                }
//
//                GraphNode<String> preconditionToAdd = new LinkedList<>(preconditions)
//                        .get(preconditionCounter);
//
//                logger.info("Adding precondition: " + preconditionToAdd);
//
//                schedule.add(preconditionToAdd);
//                List<GraphNode<String>> orderedSchedule = new ArrayList<>(schedule);
//                orderedSchedule.sort(new ComparatorNodesIncreasing<>());
//                schedule = new LinkedHashSet<>(orderedSchedule);
//                logger.info("Schedule: " + schedule);
//                results = executeTests(schedule, testCaseExecutor);
//                testCaseThatFailedOptional = getFailureTestCase(results);
//
//            }

            long endTimeTotal = System.currentTimeMillis();
            long timeToFixMinimizedTestSuite = endTimeTotal - starTimeTotal;

            logger.info("Executing final minimized test suite: " + schedule);
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

//            logger.info("Executing original test suite...");
//            starTime = System.currentTimeMillis();
//            schedule = new LinkedHashSet<>(allTests);
//            results = executeTests(schedule, testCaseExecutor);
//            testCaseThatFailedOptional = getFailureTestCase(results);
//            if(testCaseThatFailedOptional.isPresent()){
//                String errorMessage = "Test case " + testCaseThatFailedOptional.get()
//                        + " failed on schedule " + schedule + ", test suite might be flaky!";
//                throw new RuntimeException(errorMessage);
//            }
//            endTime = System.currentTimeMillis();
//            long timeToExecuteOriginalTestSuite = endTime - starTime;


            logger.info("=====================================");

            logger.info("Number of tests in original suite: " + allTests.size());
            logger.info("Number of tests in minimized suite: " + numberOfTestsInFinalTestSuite);
            logger.info("Minimization rate reduction: "
                    + ((double) (allTests.size() - numberOfTestsInFinalTestSuite) / allTests.size()) * 100 + "%");
            logger.info("Time to fix test suite: "
                    + new ExecutionTime().computeExecutionTime(timeToFixMinimizedTestSuite));
            logger.info("Final minimized test suite: " + newSolutionAsByteArrayString.toString());

//            logger.info("Original suite execution time: "
//                    + new ExecutionTime().computeExecutionTime(timeToExecuteOriginalTestSuite));
            logger.info("Original suite execution time: ...");
            logger.info("Minimized suite execution time: "
                    + new ExecutionTime().computeExecutionTime(timeToExecuteMinimizedTestSuite));
//            logger.info("Minimization time rate reduction: "
//                    + ((double) (timeToExecuteOriginalTestSuite - timeToExecuteMinimizedTestSuite) / timeToExecuteOriginalTestSuite) * 100 + "%");
            logger.info("Minimization time rate reduction: ...%");


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
