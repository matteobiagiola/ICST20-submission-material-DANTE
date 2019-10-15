package com.dante.tedd.validation.recovery;

import com.dante.tedd.execution.TestCaseExecutor;
import com.dante.tedd.execution.TestResult;
import com.dante.tedd.graph.DependencyGraphManager;
import com.dante.tedd.graph.GraphEdge;
import com.dante.tedd.graph.GraphNode;
import com.dante.tedd.graph.GraphUtils;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class RecoverMissedDependencies {

    private Graph<GraphNode<String>, GraphEdge> graph;
    private List<Long> executionTimes;
    private Set<GraphEdge> dependenciesAddedWhileExecutingIndependentNodes = new LinkedHashSet<>();
    private Set<GraphEdge> dependenciesRemovedBecauseOfCycle = new LinkedHashSet<>();
    private Set<GraphNode<String>> notFailingIndependentNodes = new LinkedHashSet<>();
    private final static Logger logger = Logger.getLogger(RecoverMissedDependencies.class.getName());

    public RecoverMissedDependencies(List<Long> executionTimes,
                                     Graph<GraphNode<String>, GraphEdge> graph){
        this.executionTimes = executionTimes;
        this.graph = graph;
    }

    public Graph<GraphNode<String>, GraphEdge> computeMissedDependencies(){
        TestCaseExecutor<String> testCaseExecutor = new TestCaseExecutor<>();

        Set<GraphNode<String>> nodesOrder = GraphUtils.mapTestsOrderToNodesOrder(Arrays.asList(Properties.tests_order));
        RefinementScheduler<String> originalOrderScheduler = new OriginalOrderScheduler<>(nodesOrder);
        List<GraphNode<String>> nodesOrderList = new ArrayList<>(nodesOrder);

        // maybe it is not necessary to recover missing dependencies when fixed point counter > 0
        Set<GraphNode<String>> independentNodes = this.getIndependentNodes();
        logger.info("Independent nodes: " + independentNodes);
        Graph<GraphNode<String>, GraphEdge> graphFirstStep = this.handleIndependentNodes(originalOrderScheduler,
                independentNodes, testCaseExecutor, nodesOrderList);

        Graph<GraphNode<String>, GraphEdge> graphSecondStep = this.handleNodesWithoutOutgoingEdges(graphFirstStep,
                originalOrderScheduler, testCaseExecutor, nodesOrderList);

        logger.info("Dependencies removed because of cycle: "
                + this.dependenciesRemovedBecauseOfCycle.size() + ". "
                + this.dependenciesRemovedBecauseOfCycle);
        logger.info("Number of dependencies added while executing independent nodes: "
                + this.dependenciesAddedWhileExecutingIndependentNodes.size() + ". "
                + this.dependenciesAddedWhileExecutingIndependentNodes);

        return graphSecondStep;
    }

    private Set<GraphNode<String>> getIndependentNodes(){
        return this.graph.vertexSet().stream()
                .filter(graphNode -> graph.outDegreeOf(graphNode) == 0 && graph.inDegreeOf(graphNode) == 0)
                .collect(Collectors.toSet());
    }

    private Graph<GraphNode<String>, GraphEdge> handleIndependentNodes(RefinementScheduler<String> originalOrderScheduler,
                                                                       Set<GraphNode<String>> independentNodes,
                                                                       TestCaseExecutor<String> testCaseExecutor,
                                                                       List<GraphNode<String>> nodesOrderList){
        long startTime;
        Set<GraphNode<String>> failedTestCases = new LinkedHashSet<>();
        ExecutionTime executionTime = new ExecutionTime();

        Set<Set<GraphNode<String>>> schedulesIndependents = new LinkedHashSet<>();
        for (GraphNode<String> independentNode : independentNodes) {
            Set<GraphNode<String>> schedule = new LinkedHashSet<>();
            schedule.add(independentNode);
            schedulesIndependents.add(schedule);
        }

        // removing edges that create cycle
        Graph<GraphNode<String>, GraphEdge> graphFirstStep
                = this.removeEdgesThatCreateCycle(this.graph, originalOrderScheduler);

        logger.info("Validating independent nodes...");
        for (Set<GraphNode<String>> schedule : schedulesIndependents) {
            try {
                startTime = System.currentTimeMillis();
                Map<GraphNode<String>, TestResult> results = this.executeTests(schedule, testCaseExecutor);
                executionTimes.add((System.currentTimeMillis() - startTime));
                logger.info("Time elapsed: " + executionTime.computeExecutionTime(executionTimes));
                Optional<GraphNode<String>> testCaseThatFailedOptional = this.getFailureTestCase(results);
                if(testCaseThatFailedOptional.isPresent()){
                    logger.warn("Independent test case " + testCaseThatFailedOptional.get() + " failed");
                    failedTestCases.add(testCaseThatFailedOptional.get());
                } else {
                    this.notFailingIndependentNodes.addAll(schedule);
                }
            } catch (InterruptedException | ExecutionException | IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (GraphNode<String> failedTestCase : failedTestCases) {
            int positionInOriginalOrder = failedTestCase.getNumOrder();
            this.addDependenciesTowards(nodesOrderList.subList(0, positionInOriginalOrder),
                    nodesOrderList.get(positionInOriginalOrder), graphFirstStep);
        }

        return graphFirstStep;
    }

    private Graph<GraphNode<String>, GraphEdge> handleNodesWithoutOutgoingEdges(
            Graph<GraphNode<String>, GraphEdge> graphFirstStep,
            RefinementScheduler<String> originalOrderScheduler,
            TestCaseExecutor<String> testCaseExecutor, List<GraphNode<String>> nodesOrderList){

        Set<GraphNode<String>> nonFailingTestCases = new LinkedHashSet<>();
        long startTime;
        Set<GraphNode<String>> failedTestCases = new LinkedHashSet<>();
        ExecutionTime executionTime = new ExecutionTime();

        Set<GraphNode<String>> nodesWithNoOutgoingEdges = graph.vertexSet().stream()
                .filter(graphNode -> graph.outDegreeOf(graphNode) == 0
                        && graph.inDegreeOf(graphNode) > 0
                        && graphNode.getNumOrder() != 0) // exclude the first node
                .collect(Collectors.toSet());

        logger.info("Nodes with no outgoing edges: " + nodesWithNoOutgoingEdges);

        // We execute every node without outgoing edges.
        Set<Set<GraphNode<String>>> schedulesNoOutgoing = new LinkedHashSet<>();
        for (GraphNode<String> nodeWithNoOutgoingEdges : nodesWithNoOutgoingEdges) {
            Set<GraphNode<String>> schedule = new LinkedHashSet<>();
            schedule.add(nodeWithNoOutgoingEdges);
            schedulesNoOutgoing.add(schedule);
        }

        logger.info("Validating nodes with no outgoing edges...");
        for (Set<GraphNode<String>> schedule : schedulesNoOutgoing) {
            try {
                startTime = System.currentTimeMillis();
                Map<GraphNode<String>, TestResult> results =
                        this.executeTests(schedule, testCaseExecutor);
                executionTimes.add((System.currentTimeMillis() - startTime));
                logger.info("Time elapsed: " + executionTime.computeExecutionTime(executionTimes));
                Optional<GraphNode<String>> testCaseThatFailedOptional =
                        this.getFailureTestCase(results);
                if(testCaseThatFailedOptional.isPresent()){
                    logger.warn("Test case with no outgoing edges "
                            + testCaseThatFailedOptional.get() + " failed");
                    failedTestCases.add(testCaseThatFailedOptional.get());
                } else {
                    GraphNode<String> nonFailingTestCase = schedule.stream()
                            .findAny().orElseThrow(IllegalStateException::new);
                    logger.info("Test case with no outgoing edges "
                            + nonFailingTestCase + " did not fail");
                    nonFailingTestCases.add(nonFailingTestCase);
                }
            } catch (InterruptedException | ExecutionException | IOException e) {
                throw new RuntimeException(e);
            }
        }

        // for each failing test case connect it with the preceding ones to find missing dependencies
        for (GraphNode<String> failedTestCase : failedTestCases) {
            int positionInOriginalOrder = failedTestCase.getNumOrder();
            this.addDependenciesTowards(nodesOrderList.subList(0, positionInOriginalOrder),
                    nodesOrderList.get(positionInOriginalOrder), graphFirstStep);
        }

        // for each non failing test case find all the schedules that contain that node
        // and execute them
        this.notFailingIndependentNodes.addAll(nonFailingTestCases);
        Map<GraphNode<String>, Set<GraphNode<String>>> mapFailedTestCaseSchedule
                = new LinkedHashMap<>();
        for (GraphNode<String> nonFailingTestCase : nonFailingTestCases) {
            Set<Set<GraphNode<String>>> schedules =
                    this.findSchedulesThatContainTargetNode(graph,
                            originalOrderScheduler, nonFailingTestCase);
            logger.info("Test if " + nonFailingTestCase + " is an independent node.");
            for (Set<GraphNode<String>> schedule : schedules) {
                try {
                    startTime = System.currentTimeMillis();
                    Map<GraphNode<String>, TestResult> results = this
                            .executeTests(schedule, testCaseExecutor);
                    executionTimes.add((System.currentTimeMillis() - startTime));
                    logger.info("Time elapsed: " + executionTime.computeExecutionTime(executionTimes));
                    Optional<GraphNode<String>> testCaseThatFailedOptional = this
                            .getFailureTestCase(results);
                    if(testCaseThatFailedOptional.isPresent()){
                        GraphNode<String> testCaseThatFailed = testCaseThatFailedOptional.get();
                        if(testCaseThatFailed.equals(nonFailingTestCase)) {
                            throw new IllegalStateException(nonFailingTestCase
                                    + " is not really independent since it fails "
                                    + " on this schedule " + schedule);
                        }
                        logger.warn("Test case that failed: " + testCaseThatFailed);
                        mapFailedTestCaseSchedule.put(testCaseThatFailed, schedule);
                    }
                } catch (InterruptedException | ExecutionException | IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // removing edges that create cycle
        return this.removeEdgesThatCreateCycle(graphFirstStep,
                originalOrderScheduler);
    }

    private Set<Set<GraphNode<String>>> findSchedulesThatContainTargetNode(
            Graph<GraphNode<String>, GraphEdge> graph,
            RefinementScheduler<String> refinementScheduler,
            GraphNode<String> targetNode){
        Set<Set<GraphNode<String>>> result = new LinkedHashSet<>();
        for (GraphEdge graphEdge : graph.edgeSet()) {
            try {
                Set<GraphNode<String>> schedule = refinementScheduler
                        .computeOriginalSchedule(graph, graphEdge);
                if(schedule.contains(targetNode))
                    result.add(schedule);
            } catch (InvalidScheduleException e) {
                logger.warn("Edge " + graphEdge + " to be removed, because it creates a cycle");
            }
        }
        return result;
    }

    private Graph<GraphNode<String>, GraphEdge> removeEdgesThatCreateCycle(Graph<GraphNode<String>, GraphEdge> dependencyGraph,
                                                                           RefinementScheduler<String> refinementScheduler){
        DependencyGraphManager<String> dependencyGraphManager = new DependencyGraphManager<>(dependencyGraph);
        Graph<GraphNode<String>, GraphEdge> graphClone = dependencyGraphManager.duplicate();
        for (GraphEdge graphEdge : graph.edgeSet()) {
            try {
                refinementScheduler.computeOriginalSchedule(graph, graphEdge);
            } catch (InvalidScheduleException e) {
                logger.warn("Removing edge " + graphEdge + " because it creates a cycle");
                this.dependenciesRemovedBecauseOfCycle.add(graphEdge);
                graphClone.removeEdge(graphEdge);
            }
        }
        return graphClone;
    }

    private void addDependenciesTowards(Collection<GraphNode<String>> targetNodes,
                                               GraphNode<String> sourceNode,
                                               Graph<GraphNode<String>, GraphEdge> dependencyGraph){
        for (GraphNode<String> targetNode : targetNodes) {
            Optional<GraphEdge> edgeOptional = GraphUtils
                    .addEdgeToGraphAutomatically(dependencyGraph, sourceNode, targetNode, false);
            if(edgeOptional.isPresent()){
                logger.info("Adding " + edgeOptional.get() + ", needs to be validated.");
                this.dependenciesAddedWhileExecutingIndependentNodes.add(edgeOptional.get());
            }
        }
    }

    private Optional<GraphNode<String>> getFailureTestCase(Map<GraphNode<String>, TestResult> results){
        for (GraphNode<String> graphNode : results.keySet()) {
            if(results.get(graphNode).equals(TestResult.FAIL))
                return Optional.of(graphNode);
        }
        return Optional.empty();
    }

    private Map<GraphNode<String>, TestResult> executeTests(Set<GraphNode<String>> schedule,
                                                                   TestCaseExecutor<String> testCaseExecutor)
            throws InterruptedException,
            ExecutionException,
            IOException {
        logger.info("Executing schedule: " + schedule);
        return new HashMap<>(testCaseExecutor.executeTestsRemoteJUnitCore(schedule));
    }

    public List<Long> getExecutionTimes() {
        return executionTimes;
    }

    public Set<GraphNode<String>> getNotFailingIndependentNodes() {
        return this.notFailingIndependentNodes;
    }
}
