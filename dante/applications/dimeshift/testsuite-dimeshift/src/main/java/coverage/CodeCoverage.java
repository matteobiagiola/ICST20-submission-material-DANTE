package coverage;

import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.type.profiler.CoverageRange;
import io.webfolder.cdp.type.profiler.FunctionCoverage;
import io.webfolder.cdp.type.profiler.ScriptCoverage;
import utils.FileUtils;
import utils.Properties;
import utils.SessionProvider;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CodeCoverage {

    private Session session;
    private List<String> namesOfTestCasesExecuted = new LinkedList<>();
    private String testCaseNameBeingExecuted;
    private Map<String, ScriptRangeCoverage> cumulativeCoverage = new LinkedHashMap<>();
    private Map<String, ScriptRangeCoverage> cumulativeCoveragePerTest = new LinkedHashMap<>();
    private Map<String, Double> executionTimePerTest = new LinkedHashMap<>();
    private File coverageReportsDir;
    private List<String> scriptNamesToExclude = new ArrayList<>();
    private String scriptNameToInclude;
    private Set<LineRange> lineRanges = new HashSet<>();

    public CodeCoverage(Session session) {
        if(session == null)
            throw new IllegalArgumentException("Session cannot be null");
        this.session = session;

        this.setupCoverageProperties();
    }

    private void setupCoverageProperties() {
        this.coverageReportsDir = new File(utils.Properties.user_dir + "/coverage-reports");
        FileUtils.createDirIfDoesNotExist(coverageReportsDir);

        System.out.println("Sourcemap url: " + Properties.getInstance().getProperty("sourcemap_url"));

        this.scriptNameToInclude = Properties.getInstance().getProperty("script_name_to_include");
        if(this.scriptNameToInclude.isEmpty()) {
            // consider scripts to exclude if script to include property is empty
            String scriptNamesToExcludeProperty = Properties.getInstance().getProperty("script_names_to_exclude");
            this.scriptNamesToExclude = Arrays.asList(scriptNamesToExcludeProperty.split(":"));
        } else {
            String lineRangesProperty = Properties.getInstance().getProperty("line_ranges");
            if(lineRangesProperty.split(":").length > 0) {
                if(lineRangesProperty.split(":").length == 1
                        && lineRangesProperty.split(":")[0].isEmpty()) {
                    this.lineRanges = new LinkedHashSet<>();
                } else {
                    this.lineRanges = Arrays.stream(lineRangesProperty.split(":"))
                            .map(range -> {
                                String[] startAndEndOffset = range.split(",");
                                return new LineRange(Integer.valueOf(startAndEndOffset[0]),
                                        Integer.valueOf(startAndEndOffset[1]));
                            })
                            .collect(Collectors.toSet());
                }
            } else {
                this.lineRanges = new LinkedHashSet<>();
            }
        }

        if(!Properties.getInstance().getProperty("sourcemap_url").isEmpty()) {
            SourceMapParser sourceMapParser = new SourceMapParser();
            this.lineRanges = new HashSet<>(sourceMapParser.getLineRanges());
        }
    }

    private void startCoverageCollection(){
        // Collect accurate call counts beyond simple 'covered' or 'not covered'.
        boolean callCount = false;
        // Collect block-based coverage.
        boolean detailed = false;
        this.session.getCommand().getProfiler().startPreciseCoverage(callCount, detailed);
    }

    public void saveCoverage(boolean intermediate){

        if(intermediate) {
            // compute test execution time
            Long end = System.currentTimeMillis();
            Double start = this.executionTimePerTest.get(this.testCaseNameBeingExecuted);
            if(start != null) {
                this.executionTimePerTest.put(this.testCaseNameBeingExecuted, (end - start)/1000);
            } else {
                throw new RuntimeException("Test case name " + this.testCaseNameBeingExecuted + " not executed");
            }

            List<ScriptCoverage> scriptCoverageList = this.session.getCommand().getProfiler()
                    .takePreciseCoverage();
            this.session.getCommand().getProfiler().stopPreciseCoverage();

            for (ScriptCoverage coverage : scriptCoverageList) {

                // scripts to ignore (libraries)
                if(this.ignore(coverage)){
                    continue;
                }

                // scripts to consider
                if(!this.consider(coverage)){
                    continue;
                }

//                System.out.println("Coverage url: " + coverage.getUrl());

                String srcScriptName = coverage.getUrl();
                String scriptSource;

                //FIXME sometimes not able to find source script
//            try{
//                scriptSource = this.session.getCommand().getDebugger().getScriptSource(coverage.getScriptId());
//            } catch (Exception ex) {
//                System.err.println("Could not get source of script " + srcScriptName
//                        + ". Message: " + ex.getMessage());
//                continue;
//            }

                try {
                    scriptSource = SessionProvider.getInstance()
                            .getResourceFromApp(new URL(coverage.getUrl()));
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }

                ScriptRangeCoverage scriptRangeCoverage = this.cumulativeCoverage.get(srcScriptName);
                ScriptRangeCoverage scriptRangeCoveragePerTest = this.cumulativeCoveragePerTest.get(srcScriptName);
                if(scriptRangeCoverage == null){
                    scriptRangeCoverage = new ScriptRangeCoverage(srcScriptName, scriptSource, lineRanges);
                }
                if(scriptRangeCoveragePerTest == null) {
                    scriptRangeCoveragePerTest = new ScriptRangeCoverage(srcScriptName, scriptSource, lineRanges);
                }

                List<FunctionCoverage> functions = coverage.getFunctions();

                for (FunctionCoverage functionCoverage : functions) {

//                    if (functionCoverage.getFunctionName().isEmpty()) {
//                        continue;
//                    }

                    for (CoverageRange range : functionCoverage.getRanges()) {
                        // considering only ranges that are covered at least once
                        if(range.getCount() > 0 && !this.isEmptyRange(range)
                                && !this.isWholeFileRange(range, scriptRangeCoverage.getScriptSourceLength())) {
                            this.isWholeFileRange(range, scriptRangeCoverage.getScriptSourceLength());
                            CoverageRangeWrapper coverageRangeWrapper
                                    = new CoverageRangeWrapper(functionCoverage.getFunctionName(),
                                    range.getStartOffset(), range.getEndOffset(), range.getCount());
//                            System.out.println("Coverage range: " + coverageRangeWrapper);
                            if(scriptRangeCoverage.canAddRange(coverageRangeWrapper)) {

                                Set<CoverageRangeWrapper> overlappingCoverageObjects
                                        = scriptRangeCoverage.getOverlappingCoverageObjects(coverageRangeWrapper);
                                if(overlappingCoverageObjects.isEmpty()) {
//                                    System.out.println("Coverage range added: " + coverageRangeWrapper);
                                    scriptRangeCoverage.addRange(coverageRangeWrapper);
                                    scriptRangeCoveragePerTest.addRange(coverageRangeWrapper);
                                } else {
                                    for (CoverageRangeWrapper overlappingCoverageObject : overlappingCoverageObjects) {
//                                        System.out.println("Coverage range added: " + overlappingCoverageObject);
                                        scriptRangeCoverage.addRange(overlappingCoverageObject);
                                        scriptRangeCoveragePerTest.addRange(overlappingCoverageObject);
                                    }
                                }
                            }
                        }

                    }
//                    System.out.println();
                }

                if(!scriptRangeCoverage.getRangesCovered().isEmpty()) {
                    this.cumulativeCoverage.put(srcScriptName, scriptRangeCoverage);
                    this.cumulativeCoveragePerTest.put(srcScriptName, scriptRangeCoveragePerTest);
                }
            }
        }

        List<PercentageCovered> percentageCoveredOfEachScript;

        if(intermediate) {
            percentageCoveredOfEachScript = this.computeCoverageReport(this.cumulativeCoveragePerTest);
        } else {
            percentageCoveredOfEachScript = this.computeCoverageReport(this.cumulativeCoverage);
        }

        File testCoverageReport;

        if(intermediate) {
            testCoverageReport = new File(this.coverageReportsDir + "/"
                    + this.testCaseNameBeingExecuted + ".txt");
        } else {
            testCoverageReport = new File(this.coverageReportsDir
                    + "/test-suite-report.txt");
            this.session.getCommand().getProfiler().disable();
        }

        double executionTime = 0.0;
        if(intermediate) {
            executionTime = this.executionTimePerTest.get(this.testCaseNameBeingExecuted);
        } else {
            for (String testCaseName : this.executionTimePerTest.keySet()) {
                executionTime += this.executionTimePerTest.get(testCaseName);
            }
        }

        FileUtils.writeFile(new CoverageReport(SessionProvider.getInstance().getAllScriptURLs(),
                        percentageCoveredOfEachScript, executionTime).toString(),
                testCoverageReport.getAbsolutePath());

    }

    private List<PercentageCovered> computeCoverageReport(Map<String, ScriptRangeCoverage> collectedCoverage) {
        List<PercentageCovered> result = new ArrayList<>();
        for (String scriptName : collectedCoverage.keySet()) {
            // with TreeSet characters should be ordered in ascending order
            TreeSet<Integer> allCharactersCovered = new TreeSet<>();
            ScriptRangeCoverage scriptRangeCoverage = collectedCoverage.get(scriptName);

            List<CoverageRangeWrapper> rangesCovered
                    = new LinkedList<>(scriptRangeCoverage.getRangesCovered());
            for (CoverageRangeWrapper rangeCovered : rangesCovered) {
                allCharactersCovered.addAll(rangeCovered.flattenRange());
//                if(rangeCovered.getStartOffset() < scriptRangeCoverage.getScriptSourceLength()
//                        && rangeCovered.getEndOffset() < scriptRangeCoverage.getScriptSourceLength()) {
//                    allCharactersCovered.addAll(rangeCovered.flattenRange());
//                } else if(rangeCovered.getStartOffset() < scriptRangeCoverage.getScriptSourceLength()
//                        && rangeCovered.getEndOffset() > scriptRangeCoverage.getScriptSourceLength()) {
//                    allCharactersCovered.addAll(rangeCovered.flattenRange(scriptRangeCoverage.getScriptSourceLength()));
//                }
            }

            result.add(new PercentageCovered(scriptName,
                    allCharactersCovered,
                    scriptRangeCoverage.getScriptSourceLength(),
                    scriptRangeCoverage.getScriptLines()));
        }

        return result;
    }

    public void setTestCaseNameBeingExecuted(String testCaseNameBeingExecuted) {

        this.startCoverageCollection();

        this.testCaseNameBeingExecuted = testCaseNameBeingExecuted;
        this.namesOfTestCasesExecuted.add(testCaseNameBeingExecuted);
        long start = System.currentTimeMillis();
        this.executionTimePerTest.put(testCaseNameBeingExecuted, (double) start);
    }

    public void resetCoveragePerTest() {
        this.cumulativeCoveragePerTest.clear();
    }

    private boolean ignore(ScriptCoverage coverage) {
        String scriptUrl = coverage.getUrl().trim();
        if(!scriptUrl.contains(".js"))
            return true;
        if(scriptUrl.contains(".min.js"))
            return true;
        if(this.isKnownThirdParty(scriptUrl))
            return true;
        int indexLastSeparator = scriptUrl.lastIndexOf("/");
        int indexExtension = scriptUrl.indexOf(".js");
        scriptUrl = scriptUrl.substring(indexLastSeparator + 1, indexExtension);
        for (String scriptNameToExclude : this.scriptNamesToExclude) {
            if(scriptUrl.contains(scriptNameToExclude))
                return true;
        }
        return false;
    }

    private boolean isKnownThirdParty(String scriptUrl) {
        return scriptUrl.contains("google") || scriptUrl.contains("facebook")
                || scriptUrl.contains("twitter");
    }

    private boolean consider(ScriptCoverage coverage) {
        if(this.scriptNameToInclude.isEmpty()) {
            return true;
        }
        String scriptUrl = coverage.getUrl().trim();
        return scriptUrl.contains(this.scriptNameToInclude);
    }

    private boolean isWholeFileRange(CoverageRange range, int scriptLength) {
        int diff = Math.abs((range.getEndOffset() - range.getStartOffset()) - scriptLength);
        if(diff == 0 || diff == 1){
            return true;
        }
        return false;
    }

    private boolean isEmptyRange(CoverageRange range) {
        return Math.abs(range.getEndOffset() - range.getStartOffset()) == 0;
    }
}