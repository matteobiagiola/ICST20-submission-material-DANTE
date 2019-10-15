package com.dante.coverage;

public class CoverageReportSummaryLine {

    private final double totPercentageCovered;
    private final int numOfScriptsExercised;
    private final double executionTime;

    public CoverageReportSummaryLine(double totPercentageCovered, int numOfScriptsExercised, double executionTime) {
        this.totPercentageCovered = totPercentageCovered;
        this.numOfScriptsExercised = numOfScriptsExercised;
        this.executionTime = executionTime;
    }

    public double getTotPercentageCovered() {
        return totPercentageCovered;
    }

    public int getNumOfScriptsExercised() {
        return numOfScriptsExercised;
    }

    public double getExecutionTime() {
        return executionTime;
    }

    @Override
    public String toString() {
        return "Percentage covered: " + totPercentageCovered + " - Num of scripts exercised: "
                + numOfScriptsExercised + " - " + " Execution time: " + executionTime;
    }
}
