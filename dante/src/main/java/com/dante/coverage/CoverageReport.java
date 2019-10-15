package com.dante.coverage;

import com.dante.tedd.graph.GraphNode;
import weka.Run;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CoverageReport {

    private Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases;
    private Map<GraphNode<String>, Double> mapTestCaseExecutionTime;
    private Map<GraphNode<String>, Set<CovUnit>> mapTestCovUnits;
    private Double totPercentageCovered = 0.0;

    public CoverageReport(Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases,
                          Map<GraphNode<String>, Double> mapTestCaseExecutionTime) {
        this.mapCovUnitCoveringTestCases = new HashMap<>(mapCovUnitCoveringTestCases);
        this.mapTestCaseExecutionTime = new HashMap<>(mapTestCaseExecutionTime);
    }

    public CoverageReport(Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases,
                          Map<GraphNode<String>, Double> mapTestCaseExecutionTime,
                          Map<GraphNode<String>, Set<CovUnit>> mapTestCovUnits) {
        this.mapCovUnitCoveringTestCases = new HashMap<>(mapCovUnitCoveringTestCases);
        this.mapTestCaseExecutionTime = new HashMap<>(mapTestCaseExecutionTime);
        this.mapTestCovUnits = new HashMap<>(mapTestCovUnits);
    }

    public CoverageReport(Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases,
                          Map<GraphNode<String>, Double> mapTestCaseExecutionTime,
                          Map<GraphNode<String>, Set<CovUnit>> mapTestCovUnits,
                          double totPercentageCovered) {
        this.mapCovUnitCoveringTestCases = new HashMap<>(mapCovUnitCoveringTestCases);
        this.mapTestCaseExecutionTime = new HashMap<>(mapTestCaseExecutionTime);
        this.mapTestCovUnits = new HashMap<>(mapTestCovUnits);
        this.totPercentageCovered = totPercentageCovered;
    }

    public Map<CovUnit, List<GraphNode<String>>> getMapCovUnitCoveringTestCases() {
        return new HashMap<>(mapCovUnitCoveringTestCases);
    }

    public Map<GraphNode<String>, Double> getMapTestCaseExecutionTime() {
        return new HashMap<>(mapTestCaseExecutionTime);
    }

    public Map<GraphNode<String>, Set<CovUnit>> getMapTestCovUnits() {
        if(mapTestCovUnits.isEmpty())
            throw new RuntimeException("Map test coverage units not set!");
        return mapTestCovUnits;
    }

    public Double getTotPercentageCovered() {
        if(totPercentageCovered.equals(0.0))
            throw new RuntimeException("Tot percentage covered not set");
        return totPercentageCovered;
    }
}
