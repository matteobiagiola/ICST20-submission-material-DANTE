package coverage;

import utils.Properties;

import java.util.ArrayList;
import java.util.List;

public class CoverageReport {

    private List<PercentageCovered> coverage;
    private final double executionTime;

    public CoverageReport(List<PercentageCovered> coverage, double executionTime) {
        this.coverage = new ArrayList<>(coverage);
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        double totalCoveredPercentage = 0.0;
        for (PercentageCovered percentageCovered : this.coverage) {
            totalCoveredPercentage += percentageCovered.getPercentage();
            if(Properties.getInstance().getProperty("coverage_type").equals("bytes")) {
                stringBuilder.append(percentageCovered.getScriptName())
                        .append(Properties.coverageInterLineSeparator)
                        .append(percentageCovered.getTotalNumberOfCharacters())
                        .append(Properties.coverageInterLineSeparator)
                        .append(percentageCovered.getAllCharactersCovered())
                        .append(Properties.coverageInterLineSeparator)
                        .append(percentageCovered.getPercentage())
                        .append("%")
                        .append("\n");
            } else if(Properties.getInstance().getProperty("coverage_type").equals("line")) {
                stringBuilder.append(percentageCovered.getScriptName())
                        .append(Properties.coverageInterLineSeparator)
                        .append(percentageCovered.getTotalNumberOfLines())
                        .append(Properties.coverageInterLineSeparator)
                        .append(percentageCovered.getCoveredLines())
                        .append(Properties.coverageInterLineSeparator)
                        .append(percentageCovered.getPercentage())
                        .append("%")
                        .append("\n");
            } else {
                throw new RuntimeException("Unknown coverage type: "
                        + Properties.getInstance().getProperty("coverage_type"));
            }
        }
        int numOfScripts = this.coverage.size();
        stringBuilder.append(Properties.summaryLineCoverageReportStart)
                .append(Properties.coverageInterLineSeparator)
                .append(PercentageCovered.round(totalCoveredPercentage / numOfScripts, 2))
                .append("%")
                .append(Properties.coverageInterLineSeparator)
                .append(numOfScripts)
                .append(Properties.coverageInterLineSeparator)
                .append(PercentageCovered.round(executionTime, 2))
                .append("s");
        return stringBuilder.toString();
    }
}
