package com.dante.suitegenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SuiteGeneratorConfig {

    private String driverActionsFilePath;
    private String crawlerResultsFilePath;
    private String testSuiteProjectDirPath;
    private List<String> scriptNamesToExclude = new ArrayList<>();
    private String scriptNameToInclude = "";
    private List<List<Integer>> lineRanges = new ArrayList<>();
    private String applicationName;
    private String url;
    private int waitTimeAfterReload;
    private String sourcemapURL = "";
    private String srcCodeFolder = "";
    private List<String> srcCodeFilesToExclude = new ArrayList<>();
    private boolean firedElementStrategy = false;


    public SuiteGeneratorConfig() {
    }


    public boolean isFiredElementStrategy() {
        return firedElementStrategy;
    }

    public void setFiredElementStrategy(boolean firedElementStrategy) {
        this.firedElementStrategy = firedElementStrategy;
    }

    public String getTestSuiteProjectDirPath() {
        if(testSuiteProjectDirPath == null || testSuiteProjectDirPath.isEmpty())
            throw new IllegalStateException("Value of testSuiteProjectDirPath not set");
        return testSuiteProjectDirPath;
    }

    public void setTestSuiteProjectDirPath(String testSuiteProjectDirPath) {
        this.testSuiteProjectDirPath = testSuiteProjectDirPath;
    }

    public String getCrawlerResultsFilePath() {
        if(crawlerResultsFilePath == null || crawlerResultsFilePath.isEmpty())
            throw new IllegalStateException("Value of crawlerResultsFilePat not set");
        return crawlerResultsFilePath;
    }

    public void setCrawlerResultsFilePath(String crawlerResultsFilePath) {
        this.crawlerResultsFilePath = crawlerResultsFilePath;
    }

    public String getDriverActionsFilePath() {
        if(driverActionsFilePath == null || driverActionsFilePath.isEmpty())
            throw new IllegalStateException("Value of driverActionsFilePath not set");
        return driverActionsFilePath;
    }

    public void setDriverActionsFilePath(String driverActionsFilePath) {
        this.driverActionsFilePath = driverActionsFilePath;
    }

    public List<String> getScriptNamesToExclude() {
        return scriptNamesToExclude;
    }

    public void setScriptNamesToExclude(List<String> scriptNamesToExclude) {
        this.scriptNamesToExclude = scriptNamesToExclude;
    }

    public String getScriptNameToInclude() {
        return scriptNameToInclude;
    }

    public void setScriptNameToInclude(String scriptNameToInclude) {
        this.scriptNameToInclude = scriptNameToInclude;
    }

    public List<List<Integer>> getLineRanges() {
        return lineRanges;
    }

    public void setLineRanges(List<List<Integer>> lineRanges) {
        List<Integer> lineRangesFlatten = new LinkedList<>();
        for (List<Integer> lineRange : lineRanges) {
            if(lineRange.size() != 2) throw new IllegalArgumentException("Line range must have size 2. Found: "
                    + lineRange.size() + ", " + lineRange);
            if(!(lineRange.get(1) > lineRange.get(0)))
                throw new IllegalArgumentException("In line range " + lineRange
                        + " second element must be > than first one");
            lineRangesFlatten.add(lineRange.get(0));
            lineRangesFlatten.add(lineRange.get(1));
        }
        List<Integer> lineRangesOrdered = new LinkedList<>(lineRangesFlatten);
        lineRangesOrdered.sort(Comparator.comparingInt(line -> line));

        for (int i = 0; i < lineRangesOrdered.size(); i++) {
            Integer lineOrdered = lineRangesOrdered.get(i);
            Integer lineOriginal = lineRangesFlatten.get(i);
            if(!lineOrdered.equals(lineOriginal))
                throw new IllegalArgumentException("Line ranges are not ordered. Ordered list: " + lineRangesOrdered
                        + ". Not ordered list: " + lineRangesFlatten + ". Element mismatch: original "
                        + lineOriginal + ", ordered " + lineOrdered + " at index " + i);
        }
        this.lineRanges = lineRanges;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWaitTimeAfterReload() {
        return waitTimeAfterReload;
    }

    public void setWaitTimeAfterReload(int waitTimeAfterReload) {
        this.waitTimeAfterReload = waitTimeAfterReload;
    }

    public String getSourcemapURL() {
        return sourcemapURL;
    }

    public void setSourcemapURL(String sourcemapURL) {
        this.sourcemapURL = sourcemapURL;
    }

    public String getSrcCodeFolder() {
        return srcCodeFolder;
    }

    public void setSrcCodeFolder(String srcCodeFolder) {
        this.srcCodeFolder = srcCodeFolder;
    }

    public List<String> getSrcCodeFilesToExclude() {
        return srcCodeFilesToExclude;
    }

    public void setSrcCodeFilesToExclude(List<String> srcCodeFilesToExclude) {
        this.srcCodeFilesToExclude = srcCodeFilesToExclude;
    }

}
