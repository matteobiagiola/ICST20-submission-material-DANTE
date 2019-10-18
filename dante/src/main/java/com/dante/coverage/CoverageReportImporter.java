package com.dante.coverage;

import com.dante.tedd.graph.GraphNode;
import com.dante.utils.NumberUtils;
import com.dante.utils.Properties;
import com.dante.utils.Randomness;
import com.dante.utils.SetsUtils;
import org.apache.log4j.Logger;
import org.opencv.core.Mat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CoverageReportImporter {

    private final static Logger logger = Logger.getLogger(CoverageReportImporter.class.getName());
    private List<String> filesToConsider = new LinkedList<>();

    public CoverageReportImporter() {

    }

    public CoverageReportImporter(List<String> filesToConsider) {
        this.filesToConsider = new LinkedList<>(filesToConsider);
    }

    public CoverageReport importReport(String coverageReportsDirectoryPath, boolean importSuiteReport) {

        Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases = new HashMap<>();
        Map<GraphNode<String>, Double> mapTestCaseExecutionTime = new HashMap<>();
        Map<String, Integer> mapScriptTotCovUnit = new HashMap<>();
        File coverageReportsDirectory = new File(coverageReportsDirectoryPath);
        List<File> coverageFilesPerTest = this.getCoverageFilePerTest(coverageReportsDirectory);
        File coverageFileSuite = null;
        if(importSuiteReport) {
            coverageFileSuite = this.getCoverageFileSuite(coverageReportsDirectory);
        }
        Map<String, Set<CovUnit>> mapScriptCovUnits = new HashMap<>();
        Map<GraphNode<String>, Set<CovUnit>> mapTestCovUnits = new HashMap<>();

        double sumPercentageCoverage = 0.0;

        int numTests = 0;
        for (File coverageFileTest : coverageFilesPerTest) {
            String testName = coverageFileTest.getName().replace(".txt","");
            GraphNode<String> test = new GraphNode<>(testName, numTests);
            List<CoverageReportLine> coverageReportLines = this.getCoverageReportLines(coverageFileTest);
            for (CoverageReportLine coverageReportLine : coverageReportLines) {
                if(mapScriptCovUnits.get(coverageReportLine.getScriptName()) == null) {
                    mapScriptCovUnits.put(coverageReportLine.getScriptName(),
                            new HashSet<>(coverageReportLine.getUnits()));
                    mapScriptTotCovUnit.put(coverageReportLine.getScriptName(), coverageReportLine.getTotCovUnit());
                } else {
                    Set<CovUnit> collectorCovUnits = mapScriptCovUnits.get(coverageReportLine.getScriptName());
                    collectorCovUnits.addAll(coverageReportLine.getUnits());
                    logger.debug("cov units incremental size: " + collectorCovUnits.size()
                            + " cov file: " + coverageFileTest.getName());
                }

                if(mapTestCovUnits.get(test) == null) {
                    mapTestCovUnits.put(test, new HashSet<>(coverageReportLine.getUnits()));
                } else {
                    Set<CovUnit> collectorCovUnits = mapTestCovUnits.get(test);
                    collectorCovUnits.addAll(coverageReportLine.getUnits());
                }
            }
            CoverageReportSummaryLine coverageReportSummaryLine = this.getSummaryCovUnit(coverageFileTest);
            this.checkResults(coverageReportLines, coverageReportSummaryLine);

            mapTestCaseExecutionTime.put(test, coverageReportSummaryLine.getExecutionTime());
            numTests++;
        }

        for (String scriptName : mapScriptCovUnits.keySet()) {
            int totCovUnit = mapScriptTotCovUnit.get(scriptName);
            Set<CovUnit> covUnits = mapScriptCovUnits.get(scriptName);

            logger.info("Script name: " + scriptName);
            logger.info("covUnits size: " + covUnits.size());
            logger.info("Tot cov unit: " + totCovUnit);
            double percentageCovered = 0.0;
            if(covUnits.size() > 0) {
                percentageCovered = NumberUtils
                        .round(((double) covUnits.size() / totCovUnit), 4);
                System.out.println(scriptName + "<>" + totCovUnit + "<>"
                        + NumberUtils.round((percentageCovered * 100), 4) + "%");
            }
            sumPercentageCoverage += percentageCovered;
        }
        double totPercentageCovered = NumberUtils.round(((sumPercentageCoverage
                / mapScriptCovUnits.keySet().size()) * 100), 2);

        if(importSuiteReport) {
            List<CoverageReportLine> coverageReportLines = this.getCoverageReportLines(coverageFileSuite);
            CoverageReportSummaryLine coverageReportSummaryLine = this.getSummaryCovUnit(coverageFileSuite);
            this.checkResults(coverageReportLines, coverageReportSummaryLine);
            this.checkResultsSum(coverageReportLines, mapScriptCovUnits);
        }

        Set<CovUnit> allCovUnits = mapScriptCovUnits.values().stream()
                .reduce((covUnits1, covUnits2) -> {
                    Set<CovUnit> result = new HashSet<>();
                    result.addAll(covUnits1);
                    result.addAll(covUnits2);
                    return result;
                }).orElseThrow(RuntimeException::new);

        for (CovUnit covUnit : allCovUnits) {
            for (GraphNode<String> test : mapTestCovUnits.keySet()) {
                if(mapTestCovUnits.get(test).contains(covUnit)) {
                    if(mapCovUnitCoveringTestCases.get(covUnit) == null) {
                        List<GraphNode<String>> collectorCoveringTests = new ArrayList<>();
                        collectorCoveringTests.add(test);
                        mapCovUnitCoveringTestCases.put(covUnit, collectorCoveringTests);
                    } else {
                        List<GraphNode<String>> collectorCoveringTests = mapCovUnitCoveringTestCases.get(covUnit);
                        collectorCoveringTests.add(test);
                        mapCovUnitCoveringTestCases.put(covUnit, collectorCoveringTests);
                    }
                }
            }
        }

        if(importSuiteReport) {
            return new CoverageReport(mapCovUnitCoveringTestCases, mapTestCaseExecutionTime, mapTestCovUnits);
        } else {
            return new CoverageReport(mapCovUnitCoveringTestCases, mapTestCaseExecutionTime, mapTestCovUnits, totPercentageCovered);
        }

    }

    public CoverageReport importReport(String coverageReportsDirectoryPath) {
        return importReport(coverageReportsDirectoryPath, true);
    }

    private void checkResults(List<CoverageReportLine> coverageReportLines, CoverageReportSummaryLine coverageReportSummaryLine) {
        if(coverageReportLines.size() != coverageReportSummaryLine.getNumOfScriptsExercised())
            throw new RuntimeException("# of cov units (" + coverageReportLines.size()
                    + ") does not match with # of scripts exercised ("
                    + coverageReportSummaryLine.getNumOfScriptsExercised() + ")");
        double sumPercentage = coverageReportLines.stream().mapToDouble(CoverageReportLine::getPercentageCovered).sum()
                / coverageReportSummaryLine.getNumOfScriptsExercised();
        if(NumberUtils.round(sumPercentage, 2) != NumberUtils.round(coverageReportSummaryLine.getTotPercentageCovered(), 2))
            if(Math.abs(NumberUtils.round(sumPercentage, 2)
                    - NumberUtils.round(coverageReportSummaryLine.getTotPercentageCovered(), 2)) > 0.2) {
                throw new RuntimeException("Sum of percentages covered cov units (" + NumberUtils.round(sumPercentage, 2)
                        + ") different from tot percentage covered ("
                        + NumberUtils.round(coverageReportSummaryLine.getTotPercentageCovered(), 2) + ")");
            }
    }

    private void checkResultsSum(List<CoverageReportLine> coverageReportLines, Map<String, Set<CovUnit>> mapScriptCovUnits) {
        for (CoverageReportLine coverageReportLine : coverageReportLines) {
            if(mapScriptCovUnits.get(coverageReportLine.getScriptName()).size() != coverageReportLine.getUnits().size())
                throw new RuntimeException("Size sum cov units ("
                        + mapScriptCovUnits.get(coverageReportLine.getScriptName()).size()
                        + ") must be equal to tot cov units (" + coverageReportLine.getUnits().size() + ")");
            double percentageCovered = NumberUtils.round((((double) mapScriptCovUnits.get(coverageReportLine.getScriptName()).size() * 100)
                    / (double) coverageReportLine.getTotCovUnit()), 2);
            if(percentageCovered != NumberUtils.round(coverageReportLine.getPercentageCovered(), 2)) {
                if(Math.abs(percentageCovered - NumberUtils.round(coverageReportLine.getPercentageCovered(), 2)) > 0.2) {
                    throw new RuntimeException("Sum of percentages covered cov units (" + percentageCovered
                            + ") for script " + coverageReportLine.getScriptName() + " different from tot percentage covered ("
                            + coverageReportLine.getPercentageCovered() + ")");
                }
            }
            Set<CovUnit> difference = SetsUtils.setsDifference(mapScriptCovUnits.get(coverageReportLine.getScriptName()),
                    new HashSet<>(coverageReportLine.getUnits()));
            if(!difference.isEmpty())
                throw new RuntimeException("Difference between sum cov units ("
                        + mapScriptCovUnits.get(coverageReportLine.getScriptName()).size()
                        + ") for script " + coverageReportLine.getScriptName() + " and tot cov units ("
                        + coverageReportLine.getUnits().size() + ") must be 0. Found: " + difference.size());
        }
    }

    private List<File> getCoverageFilePerTest(File coverageReportsDirectoryPath) {
        File[] files =  coverageReportsDirectoryPath.listFiles();
        if(files == null || files.length == 0) {
            throw new RuntimeException("No files in " + coverageReportsDirectoryPath);
        }
        List<File> result = new LinkedList<>();
        for (File file : files) {
            // file with '-' is suite coverage report
            if(!file.getName().contains("-") && this.filesToConsider.isEmpty())
                result.add(file);
            else if(!file.getName().contains("-")
                    && this.filesToConsider.contains(file.getName().replace(".txt", "")))
                result.add(file);
        }

        // order files according to suffix number
        result.sort(Comparator.comparingInt(file -> {
            String fileNum = file.getName().replace("test","")
                    .replace(".txt","");
            try{
                return Integer.valueOf(fileNum);
            } catch (NumberFormatException ex) {
                throw new RuntimeException("File " + file.getName() + " must have a number as suffix: " + ex);
            }
        }));
        return result;
    }

    private File getCoverageFileSuite(File coverageReportsDirectoryPath) {
        File[] files =  coverageReportsDirectoryPath.listFiles();
        if(files == null || files.length == 0) {
            throw new RuntimeException("No files in " + coverageReportsDirectoryPath);
        }
        for (File file : files) {
            // file with '-' is suite coverage report
            if(file.getName().contains("-"))
                return file;
        }
        throw new RuntimeException("No suite coverage file in " + coverageReportsDirectoryPath);
    }

    private List<CoverageReportLine> getCoverageReportLines(File testCoverageFile) {
        List<CoverageReportLine> result = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(testCoverageFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(!line.startsWith(Properties.summaryLineCoverageReportStart)) {
                    String[] lineSplit = line.split(Properties.coverageInterLineSeparator);
                    if(lineSplit.length == 4) {
                        String scriptName = lineSplit[0];
                        String totCovUnit = lineSplit[1];
                        String units = lineSplit[2];
                        String percentageCovered = lineSplit[3];

                        if(!scriptName.endsWith(".js"))
                            throw new RuntimeException("First property of line must be a script name ending in .js"
                                    + ". Found: " + scriptName);
                        if(!(units.startsWith("[") && units.endsWith("]")))
                            throw new RuntimeException("Third property of line must be a list []"
                                    + ". Found: " + units);
                        if(!percentageCovered.contains("%"))
                            throw new RuntimeException("Fourth property of line must be a percentage %"
                                    + ". Found: " + percentageCovered);
                        try {
                            int totCovUnitCast = Integer.valueOf(totCovUnit);
                            double percentageCoveredCast = Double
                                    .valueOf(percentageCovered.replace("%", ""));
                            String unitsPolished = units.replace("[", "")
                                    .replace("]","").replaceAll("\\s+","");
                            String[] unitsSplit = unitsPolished.split(",");
                            List<CovUnit> unitsCast = new ArrayList<>();
                            if(unitsSplit.length != 0 && !(unitsSplit.length == 1 && unitsSplit[0].isEmpty())) {
                                unitsCast = Arrays.stream(unitsSplit).map(Integer::valueOf)
                                        .map(unit -> new CovUnit(unit, scriptName))
                                        .collect(Collectors.toList());
                            }
                            result.add(new CoverageReportLine(scriptName, totCovUnitCast, unitsCast, percentageCoveredCast));
                        } catch (NumberFormatException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        throw new RuntimeException("Line in coverage report " + testCoverageFile
                                + " must have 4 properties. Found: " + lineSplit.length + ". Line: " + line);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(result.isEmpty()){
            throw new RuntimeException("File " + testCoverageFile + " must contain at least one line!");
        }

        return result;
    }

    private CoverageReportSummaryLine getSummaryCovUnit(File testCoverageFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(testCoverageFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.startsWith(Properties.summaryLineCoverageReportStart)) {
                    String[] lineSplit = line.split(Properties.coverageInterLineSeparator);
                    if(lineSplit.length == 4) {
                        String finalKeyword = lineSplit[0];
                        String totPercentageCovered = lineSplit[1];
                        String numOfScriptsExercised = lineSplit[2];
                        String executionTime = lineSplit[3];
                        if(!finalKeyword.equals(Properties.summaryLineCoverageReportStart))
                            throw new RuntimeException("First property of final line must be "
                                    + Properties.summaryLineCoverageReportStart + ". Found: " + finalKeyword);
                        if(!totPercentageCovered.contains("%"))
                            throw new RuntimeException("Second property of final line must be a percentage %"
                                    + ". Found: " + totPercentageCovered);
                        if(!executionTime.contains("s"))
                            throw new RuntimeException("Fourth property of final line must be an execution time in s"
                                    + ". Found: " + executionTime);
                        try {
                            double totPercentageCoveredCast = Double
                                    .valueOf(totPercentageCovered.replace("%", ""));
                            int numOfScriptsExercisedCast = Integer.valueOf(numOfScriptsExercised);
                            double executionTimeCast = Double
                                    .valueOf(executionTime.replace("s", ""));
                            return new CoverageReportSummaryLine(totPercentageCoveredCast,
                                    numOfScriptsExercisedCast, executionTimeCast);
                        } catch (NumberFormatException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        throw new RuntimeException("Final line in coverage report " + testCoverageFile
                                + " must have 4 properties. Found: " + lineSplit.length + ". Final line: " + line);
                    }
                }
            }
            throw new RuntimeException("Final line in coverage report " + testCoverageFile
                    + " not found. It must start with " + Properties.summaryLineCoverageReportStart);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public CoverageReport mockReport(int numOfCovUnits, Set<GraphNode<String>> allNodes) {
        Map<CovUnit, List<GraphNode<String>>> mapCovUnitCoveringTestCases = new HashMap<>();
        Map<GraphNode<String>, Double> mapTestCaseExecutionTime = new HashMap<>();
        String scriptName = "asd"; // considering only one script
        for (int i = 0; i < numOfCovUnits; i++) {
            int lengthSubset = Randomness.nextInt(1, allNodes.size());
            Set<GraphNode<String>> subset = new HashSet<>();
            for (int j = 0; j < lengthSubset; j++) {
                subset.add(Randomness.choice(allNodes));
            }
            mapCovUnitCoveringTestCases.put(new CovUnit(i, scriptName), new ArrayList<>(subset));
        }
        return new CoverageReport(mapCovUnitCoveringTestCases, mapTestCaseExecutionTime);
    }
}
