package coverage;

import utils.Properties;
import utils.SessionProvider;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class CoverageReport {

    private List<PercentageCovered> coverage;
    private Set<String> allScriptURLs;
    private final double executionTime;

    public CoverageReport(Set<String> allScriptURLs, List<PercentageCovered> coverage, double executionTime) {
        this.coverage = new ArrayList<>(coverage);
        this.executionTime = executionTime;
        this.allScriptURLs = new HashSet<>(allScriptURLs);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        double totalCoveredPercentage = 0.0;
        for (String scriptURL : this.allScriptURLs) {
            Optional<PercentageCovered> optionalScriptPercentageCovered = this.coverage.stream().filter(percentageCovered ->
                    percentageCovered.getScriptName().equalsIgnoreCase(scriptURL))
                    .findFirst();
            if(optionalScriptPercentageCovered.isPresent()) {
                PercentageCovered percentageCovered = optionalScriptPercentageCovered.get();
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
            } else {
                if(Properties.getInstance().getProperty("coverage_type").equals("bytes")) {
                    try {
                        String srcScript = SessionProvider.getInstance().getResourceFromApp(new URL(scriptURL));
                        stringBuilder.append(scriptURL)
                                .append(Properties.coverageInterLineSeparator)
                                .append(srcScript.length())
                                .append(Properties.coverageInterLineSeparator)
                                .append("[]")
                                .append(Properties.coverageInterLineSeparator)
                                .append("0")
                                .append("%")
                                .append("\n");
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                } else if(Properties.getInstance().getProperty("coverage_type").equals("line")) {
                    throw new UnsupportedOperationException("Not supported yet. See ScriptRangeCoverage " +
                            "buildScriptLine method to see how to construct lines from script source");
                }
            }
        }
        int numOfScripts = this.allScriptURLs.size();
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
