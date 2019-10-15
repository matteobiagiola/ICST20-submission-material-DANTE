package com.dante.coverage;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CoverageReportLine {

    private final String scriptName;
    private final int totCovUnit;
    private List<CovUnit> units;
    private final double percentageCovered;

    public CoverageReportLine(String scriptName, int totCovUnit, List<CovUnit> units, double percentageCovered) {
        this.scriptName = scriptName;
        this.totCovUnit = totCovUnit;
        this.units = new LinkedList<>(units);
        this.percentageCovered = percentageCovered;
    }

    public String getScriptName() {
        return scriptName;
    }

    public int getTotCovUnit() {
        return totCovUnit;
    }

    public List<CovUnit> getUnits() {
        return new LinkedList<>(units);
    }

    public double getPercentageCovered() {
        return percentageCovered;
    }

    @Override
    public boolean equals(Object other){
        if(other == this)
            return true;

        if(other instanceof CoverageReportLine){
            CoverageReportLine otherCoverageReportLine = (CoverageReportLine) other;
            return Objects.equals(this.scriptName, otherCoverageReportLine.scriptName) &&
                    Objects.equals(this.totCovUnit, otherCoverageReportLine.totCovUnit) &&
                    Objects.equals(this.percentageCovered, otherCoverageReportLine.percentageCovered) &&
                    Objects.equals(this.units, otherCoverageReportLine.units);
        }

        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.scriptName);
    }

    @Override
    public String toString() {
        return "Script name: " + scriptName + " - Tot cov units: "
                + totCovUnit + " - " + " Units: " + units + " - Percentage covered: "
                + percentageCovered;
    }
}
