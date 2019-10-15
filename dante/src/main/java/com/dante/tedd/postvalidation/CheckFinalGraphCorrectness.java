package com.dante.tedd.postvalidation;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CheckFinalGraphCorrectness {

    private final static Logger logger = Logger.getLogger(CheckFinalGraphCorrectness.class.getName());

    /**
     * @implNote It checks if the final graph obtained with the runtime validation is correct
     */
    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");
        Properties.getInstance().checkFileExistence(Properties.FINAL_GRAPH_PATH,
                "final_graph_path");

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        TestCaseExecutor<String> testCaseExecutor = new TestCaseExecutor<>();
        Set<Set<GraphNode<String>>> schedules = new LinkedHashSet<>();
        List<Long> executionTimes = new ArrayList<>();
        List<Integer> scheduleLengths = new ArrayList<>();
        int falseNegatives = 0;
        int dependenciesRemovedBecauseOfCycle = 0;
        long maxExecutionTime = 0;
        Set<GraphNode<String>> maxTimeSchedule = new LinkedHashSet<>();
        long starTime;
        long endTime;

        int totalNumberOfSchedulesExecuted = 0;

        logger.info("Checking final graph: " + Properties.FINAL_GRAPH_PATH);

        GraphImporter graphImporter = new GraphImporter();
        Graph<GraphNode<String>, GraphEdge> graph = graphImporter.importGraph(Properties.FINAL_GRAPH_PATH);

        try {

            Set<GraphNode<String>> independentNodes = graph.vertexSet().stream()
                    .filter(graphNode -> graph.outDegreeOf(graphNode) == 0 && graph.inDegreeOf(graphNode) == 0)
                    .collect(Collectors.toSet());
            logger.info("Independent nodes: " + independentNodes);

            logger.info("Validating independent nodes...");
            for (GraphNode<String> independentNode : independentNodes) {
                Set<GraphNode<String>> schedule = new LinkedHashSet<>();
                schedule.add(independentNode);
                scheduleLengths.add(schedule.size());
                schedules.add(schedule);
            }

            totalNumberOfSchedulesExecuted = totalNumberOfSchedulesExecuted + schedules.size();

            for (Set<GraphNode<String>> schedule : schedules) {
                starTime = System.currentTimeMillis();
                Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
                endTime = System.currentTimeMillis() - starTime;
                logger.info("Execution of schedule " + schedule + " took " + ((double) endTime / 1000) + " s");
                executionTimes.add(endTime);
                Optional<GraphNode<String>> testCaseThatFailedOptional = getFailureTestCase(results);
                if(testCaseThatFailedOptional.isPresent()){
                    String errorMessage = "Validation check failed!!! Test case "
                            + testCaseThatFailedOptional.get() + " failed on schedule " + schedule;
                    logger.warn(errorMessage);
                    falseNegatives++;
                }
            }

            schedules.clear();

            Set<GraphNode<String>> nodesOrder = GraphUtils.mapTestsOrderToNodesOrder(Arrays.asList(Properties.tests_order));
            RefinementScheduler<String> originalOrderScheduler = new OriginalOrderScheduler<>(nodesOrder);

            for (GraphEdge graphEdge : graph.edgeSet()) {
                try {
                    Set<GraphNode<String>> schedule = originalOrderScheduler.computeOriginalSchedule(graph, graphEdge);
                    scheduleLengths.add(schedule.size());
                    logger.info("Schedule with dep " + graphEdge + ": " + schedule);
                    schedules.add(schedule);
                } catch (InvalidScheduleException e) {
                    e.printStackTrace();
                    dependenciesRemovedBecauseOfCycle++;
                }
            }

            logger.info("Validating all the other paths...");

            totalNumberOfSchedulesExecuted = totalNumberOfSchedulesExecuted + schedules.size();

            for (Set<GraphNode<String>> schedule : schedules) {
                starTime = System.currentTimeMillis();
                Map<GraphNode<String>, TestResult> results = executeTests(schedule, testCaseExecutor);
                endTime = System.currentTimeMillis() - starTime;
                executionTimes.add(endTime);
                logger.info("Execution of schedule " + schedule + " took " + ((double) endTime / 1000) + " s");
                if(endTime > maxExecutionTime){
                    maxExecutionTime = endTime;
                    maxTimeSchedule = new LinkedHashSet<>(schedule);
                }
                Optional<GraphNode<String>> testCaseThatFailedOptional = getFailureTestCase(results);
                if(testCaseThatFailedOptional.isPresent()){
                    String errorMessage = "Validation check failed!!! Test case "
                            + testCaseThatFailedOptional.get() + " failed on schedule " + schedule;
                    logger.warn(errorMessage);
                    falseNegatives++;
                }
            }

            double averageRuntimeSchedulesParallelized = ((double) executionTimes.stream().mapToLong(Long::new).sum()
                    / (double) executionTimes.size());
            double averageScheduleLengths = ((double) scheduleLengths.stream()
                    .mapToInt(Integer::new).sum() / scheduleLengths.size());

            logger.info("=====================================");

            logger.info("Total number of schedules executed: " + totalNumberOfSchedulesExecuted + " (independent nodes " +
                    independentNodes.size() + "). Deps: " + graph.edgeSet().size());
            logger.info("Total execution time: " + new ExecutionTime().computeExecutionTime(executionTimes));
            logger.info("False negatives: " + falseNegatives);
            logger.info("Average runtime schedules parallelized: " + (averageRuntimeSchedulesParallelized / 1000) + " s");
            logger.info("Schedule with the highest runtime of "
                    + ((double) maxExecutionTime / 1000) + " s: " + maxTimeSchedule);
            logger.info("Average schedule lengths: " + averageScheduleLengths);
            logger.info("Dependencies removed because of cycle: " + dependenciesRemovedBecauseOfCycle);

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
