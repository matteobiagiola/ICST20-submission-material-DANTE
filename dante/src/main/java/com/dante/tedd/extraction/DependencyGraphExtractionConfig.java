package com.dante.tedd.extraction;

public class DependencyGraphExtractionConfig {

    private String dependencyGraphOptimized;
    private String fixedMinimizedTestSuite;

    public void setParetoFrontSolution(String dependencyGraphOptimized) {
        this.dependencyGraphOptimized = dependencyGraphOptimized
                .replaceAll("\\s+","-");
    }

    public String getParetoFrontSolution() {
        if(dependencyGraphOptimized == null)
            throw new UnsupportedOperationException("Pareto front solution not set!");
        return dependencyGraphOptimized;
    }

    public void setFixedMinimizedTestSuite(String fixedMinimizedTestSuite) {
        this.fixedMinimizedTestSuite = fixedMinimizedTestSuite;
    }

    public String getFixedMinimizedTestSuite() {
        if(fixedMinimizedTestSuite == null)
            throw new UnsupportedOperationException("Fixed minimized test suite not set!");
        return fixedMinimizedTestSuite;
    }
}
