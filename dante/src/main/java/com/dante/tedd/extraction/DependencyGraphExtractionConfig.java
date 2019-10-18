package com.dante.tedd.extraction;

public class DependencyGraphExtractionConfig {

    private String dependencyGraphOptimized;
    private String fixedSelectedTestSuite;

    public void setParetoFrontSolution(String dependencyGraphOptimized) {
        this.dependencyGraphOptimized = dependencyGraphOptimized
                .replaceAll("\\s+","-");
    }

    public String getParetoFrontSolution() {
        if(dependencyGraphOptimized == null)
            throw new UnsupportedOperationException("Pareto front solution not set!");
        return dependencyGraphOptimized;
    }

    public void setFixedSelectedTestSuite(String fixedSelectedTestSuite) {
        this.fixedSelectedTestSuite = fixedSelectedTestSuite;
    }

    public String getFixedSelectedTestSuite() {
        if(fixedSelectedTestSuite == null)
            throw new UnsupportedOperationException("Fixed minimized test suite not set!");
        return fixedSelectedTestSuite;
    }
}
