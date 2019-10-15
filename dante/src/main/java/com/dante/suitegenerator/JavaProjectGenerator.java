package com.dante.suitegenerator;

import com.dante.parsing.TestCase;
import com.dante.suitegenerator.templatengine.PebbleTemplateEngine;
import com.dante.suitegenerator.templatengine.TemplateEngine;
import com.dante.utils.FileUtils;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaProjectGenerator {

    private final String testSuiteProjectDirPath;
    private final String testSuiteProjectSrcDirPath;
    private final String mainPackageDirPath;
    private final String testsPackageDirPath;
    private final String utilsPackageDirPath;
    private final String flakinessPackageDirPath;
    private final String coveragePackageDirPath;
    private final String resourcesDirPath;
    private final String testsPackageName = "tests";

    private SuiteGeneratorConfig suiteGeneratorConfig;

    private String testSuiteName;
    private String atusaTestSuiteName;
    private String testSuiteNameCoverage;
    private String atusaTestSuiteNameCoverage;

    private final File staticFilesDirectory = new File("src" + File.separator + "main"
            + File.separator + "resources" + File.separator + "staticfiles");

    private final static Logger logger = Logger.getLogger(JavaProjectGenerator.class.getName());

    public JavaProjectGenerator(SuiteGeneratorConfig suiteGeneratorConfig) {

        this.suiteGeneratorConfig = suiteGeneratorConfig;

        File javaProjectDir = new File(this.suiteGeneratorConfig.getTestSuiteProjectDirPath());
        this.testSuiteProjectDirPath = javaProjectDir.getAbsolutePath() + File.separator
                + "testsuite-" + suiteGeneratorConfig.getApplicationName();
        this.testSuiteProjectSrcDirPath = javaProjectDir.getAbsolutePath() + File.separator
                + "testsuite-" + suiteGeneratorConfig.getApplicationName() + File.separator + "src" + File.separator
                + "main" + File.separator + "java";
        this.mainPackageDirPath = testSuiteProjectSrcDirPath + File.separator + "main";
        this.testsPackageDirPath = testSuiteProjectSrcDirPath + File.separator + this.testsPackageName;
        this.utilsPackageDirPath = testSuiteProjectSrcDirPath + File.separator + "utils";
        this.flakinessPackageDirPath = testSuiteProjectSrcDirPath + File.separator + "flakiness";
        this.coveragePackageDirPath = testSuiteProjectSrcDirPath + File.separator + "coverage";
        this.resourcesDirPath = testSuiteProjectDirPath + File.separator + "src" + File.separator
                + "main" + File.separator + "resources";

        this.testSuiteName = "GeneratedTestSuite"
                + (suiteGeneratorConfig.isFiredElementStrategy() ? "Fired" : "Checked");
        this.atusaTestSuiteName = "AtusaGeneratedTestSuite"
                + (suiteGeneratorConfig.isFiredElementStrategy() ? "Fired" : "Checked")
                + "K" + Properties.K_SHORTEST_PATH;
        this.testSuiteNameCoverage = this.testSuiteName + "Coverage";
        this.atusaTestSuiteNameCoverage = this.atusaTestSuiteName + "CoverageK" + Properties.K_SHORTEST_PATH;

    }

    public void generateJavaProject(List<TestCase> testCases) {

        if(testCases != null && testCases.isEmpty()) {
            throw new IllegalStateException("Test cases cannot be null nor empty");
        }

        logger.info("Generating test suite for application " + suiteGeneratorConfig.getApplicationName());

        boolean projectDirectoryExists = this.generateDirectoryStructure();

        if(!projectDirectoryExists) {
            this.setupProjectRootDirectory();
            this.fillResourcesDir();
            this.fillFlakinessPackage();
            this.fillCoveragePackage();
            this.fillUtilsPackage();
            this.fillMainPackage();
        }

        this.fillTestsPackage(testCases);
        this.setupRunFiles();
    }

    private boolean generateDirectoryStructure() {

        File testSuiteProjectDir = new File(this.testSuiteProjectDirPath);

        if(testSuiteProjectDir.exists()){
            logger.info("Project directory " + testSuiteProjectDir + " exists");
            return true;
        }

        logger.info("Creating project directory " + testSuiteProjectDir);

        File testSuiteProjectSrcDir = new File(this.testSuiteProjectSrcDirPath);
        if(!testSuiteProjectSrcDir.mkdirs()){
            throw new RuntimeException("Failed to create one of the directories in " + testSuiteProjectSrcDir);
        }

        File mainPackageDir = new File(this.mainPackageDirPath);
        if(!mainPackageDir.mkdir()){
            throw new RuntimeException("Failed to create directory " + mainPackageDir);
        }

        File testsPackageDir = new File(this.testsPackageDirPath);
        if(!testsPackageDir.mkdir()){
            throw new RuntimeException("Failed to create directory " + testsPackageDir);
        }

        File utilsPackageDir = new File(this.utilsPackageDirPath);
        if(!utilsPackageDir.mkdir()){
            throw new RuntimeException("Failed to create directory " + utilsPackageDir);
        }

        File flakinessPackageDir = new File(this.flakinessPackageDirPath);
        if(!flakinessPackageDir.mkdir()){
            throw new RuntimeException("Failed to create directory " + flakinessPackageDir);
        }

        File coveragePackageDir = new File(this.coveragePackageDirPath);
        if(!coveragePackageDir.mkdir()){
            throw new RuntimeException("Failed to create directory " + coveragePackageDir);
        }

        File resourcesDir = new File(this.resourcesDirPath);
        if(!resourcesDir.mkdir()){
            throw new RuntimeException("Failed to create directory " + resourcesDir);
        }

        return false;
    }

    private void setupProjectRootDirectory() {

        Map<String, Object> context = new LinkedHashMap<>();

        context.put("application_name", suiteGeneratorConfig.getApplicationName());
        TemplateEngine templateEngine = new PebbleTemplateEngine(context);
        templateEngine.render("pom.xml",
                new File(this.testSuiteProjectDirPath + File.separator + "pom.xml"));

    }

    private void setupRunFiles() {
        Map<String, Object> context = new LinkedHashMap<>();
        context.put("app_url", suiteGeneratorConfig.getUrl());
        context.put("test_suite_name", this.testSuiteName);
        context.put("test_suite_name_coverage", this.testSuiteNameCoverage);
        TemplateEngine templateEngine = new PebbleTemplateEngine(context);
        templateEngine.render("compile-and-run.sh",
                new File(this.testSuiteProjectDirPath + File.separator
                        + "compile-and-run-" + (Properties.FIRED_ELEMENT_STRATEGY ? "fired" : "checked") + ".sh"));
        context.clear();
        context.put("test_suite_qualified_name", this.testsPackageName + "." + this.testSuiteName);
        templateEngine = new PebbleTemplateEngine(context);
        templateEngine.render("run-flakiness.sh",
                new File(this.testSuiteProjectDirPath + File.separator
                        + "run-flakiness-" + (Properties.FIRED_ELEMENT_STRATEGY ? "fired" : "checked") + ".sh"));
    }

    private void fillResourcesDir() {
        Map<String, Object> context = new LinkedHashMap<>();
        context.put("app_url", suiteGeneratorConfig.getUrl());
        context.put("script_names_to_exclude", String.join(":", suiteGeneratorConfig.getScriptNamesToExclude()));
        context.put("script_name_to_include", suiteGeneratorConfig.getScriptNameToInclude());
        context.put("line_ranges", suiteGeneratorConfig.getLineRanges().stream().
                map(lineRange -> lineRange.get(0) + "," + lineRange.get(1)).collect(Collectors.joining(":")));
        context.put("sourcemap_url", suiteGeneratorConfig.getSourcemapURL());
        context.put("src_code_folder", suiteGeneratorConfig.getSrcCodeFolder());
        context.put("src_code_files_to_exclude", String.join(":",
                suiteGeneratorConfig.getSrcCodeFilesToExclude()));

        TemplateEngine templateEngine = new PebbleTemplateEngine(context);
        templateEngine.render("app.properties",
                new File(this.resourcesDirPath + File.separator + "app.properties"));
    }

    private void fillCoveragePackage() {
        try {

            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "CodeCoverage.java"), new File(this.coveragePackageDirPath
                    + File.separator + "CodeCoverage.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "CoverageRangeWrapper.java"), new File(this.coveragePackageDirPath
                    + File.separator + "CoverageRangeWrapper.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "CoverageReport.java"), new File(this.coveragePackageDirPath
                    + File.separator + "CoverageReport.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "ScriptRangeCoverage.java"), new File(this.coveragePackageDirPath
                    + File.separator + "ScriptRangeCoverage.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "Line.java"), new File(this.coveragePackageDirPath
                    + File.separator + "Line.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "LineRange.java"), new File(this.coveragePackageDirPath
                    + File.separator + "LineRange.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "PercentageCovered.java"), new File(this.coveragePackageDirPath
                    + File.separator + "PercentageCovered.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "SourceMapParser.java"), new File(this.coveragePackageDirPath
                    + File.separator + "SourceMapParser.java"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillFlakinessPackage() {
        try {

            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                            + "CheckFlakiness.java"), new File(this.flakinessPackageDirPath
                            + File.separator + "CheckFlakiness.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                            + "TestSuiteFlakinessExecutor.java"), new File(this.flakinessPackageDirPath
                            + File.separator + "TestSuiteFlakinessExecutor.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                            + "TestCaseFlakinessExecutionListener.java"), new File(this.flakinessPackageDirPath
                            + File.separator + "TestCaseFlakinessExecutionListener.java"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillMainPackage() {
        try {

            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "TestSuiteExecutor.java"), new File(this.mainPackageDirPath
                    + File.separator + "TestSuiteExecutor.java"));

            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "CheckSuiteFlakiness.java"), new File(this.mainPackageDirPath
                    + File.separator + "CheckSuiteFlakiness.java"));

            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "SourceMapTest.java"), new File(this.mainPackageDirPath
                    + File.separator + "SourceMapTest.java"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillTestsPackage(List<TestCase> testCases) {

        Map<String, Object> context = new LinkedHashMap<>();
        List<String> testNames = this.getTestNames(testCases);
        Map<String, List<String>> mapStatements = this.mapTestNameToStatement(testCases);
        context.put("test_suite_name", this.testSuiteName);
        context.put("test_names", testNames);
        context.put("map_statements", mapStatements);
        context.put("wait_time_after_reload", suiteGeneratorConfig.getWaitTimeAfterReload());

        TemplateEngine templateEngine = new PebbleTemplateEngine(context);
        templateEngine.render("TestSuite.java",
                new File(this.testsPackageDirPath + File.separator + this.testSuiteName + ".java"));

        // test suite for coverage purpose
        context.put("test_suite_name", this.testSuiteNameCoverage);
        templateEngine = new PebbleTemplateEngine(context);
        templateEngine.render("TestSuiteCoverage.java",
                new File(this.testsPackageDirPath + File.separator + this.testSuiteNameCoverage + ".java"));
    }

    // it assumes that the java project with the crawler generated test suite already exists
    public void generateAtusaTests(List<TestCase> testCases) {

        if(!new File(this.testsPackageDirPath).exists())
            throw new IllegalStateException("Tests package " + this.testsPackageDirPath + " does not exist!");

        Map<String, Object> context = new LinkedHashMap<>();
        List<String> testNames = this.getTestNames(testCases);
        Map<String, List<String>> mapStatements = this.mapTestNameToStatement(testCases);
        context.put("test_suite_name", this.atusaTestSuiteName);
        context.put("test_names", testNames);
        context.put("map_statements", mapStatements);
        context.put("wait_time_after_reload", suiteGeneratorConfig.getWaitTimeAfterReload());

        TemplateEngine templateEngine = new PebbleTemplateEngine(context);
        templateEngine.render("TestSuite.java",
                new File(this.testsPackageDirPath + File.separator + this.atusaTestSuiteName + ".java"));

        // test suite for coverage purpose
        context.put("test_suite_name", this.atusaTestSuiteNameCoverage);
        templateEngine = new PebbleTemplateEngine(context);
        templateEngine.render("TestSuiteCoverage.java",
                new File(this.testsPackageDirPath + File.separator + this.atusaTestSuiteNameCoverage + ".java"));

    }

    private List<String> getTestNames(List<TestCase> testCases) {
        List<String> testNames = new LinkedList<>();
        for(TestCase testCase: testCases) {
            testNames.add(testCase.getName());
        }
        return testNames;
    }

    private Map<String, List<String>> mapTestNameToStatement(List<TestCase> testCases) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        for(TestCase testCase: testCases) {
            map.put(testCase.getName(), testCase.getStatements());
        }
        return map;
    }

    private void fillUtilsPackage() {
        try {

            Map<String, Object> context = new LinkedHashMap<>();
            context.put("coverage_inter_line_separator", Properties.coverageInterLineSeparator);
            context.put("summary_line_coverage_report_start", Properties.summaryLineCoverageReportStart);
            TemplateEngine templateEngine = new PebbleTemplateEngine(context);
            templateEngine.render("Properties.java",
                    new File(this.utilsPackageDirPath + File.separator + "Properties.java"));

            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "ResetAppState.java"), new File(this.utilsPackageDirPath
                    + File.separator + "ResetAppState.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "DriverProvider.java"), new File(this.utilsPackageDirPath
                    + File.separator + "DriverProvider.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "SessionProvider.java"), new File(this.utilsPackageDirPath
                    + File.separator + "SessionProvider.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "FileUtils.java"), new File(this.utilsPackageDirPath
                    + File.separator + "FileUtils.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "SetsUtils.java"), new File(this.utilsPackageDirPath
                    + File.separator + "SetsUtils.java"));

            // copy flakiness fixer classes
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "BasePageObject.java"), new File(this.utilsPackageDirPath
                    + File.separator + "BasePageObject.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "CustomWebDriverWait.java"), new File(this.utilsPackageDirPath
                    + File.separator + "CustomWebDriverWait.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "Wait.java"), new File(this.utilsPackageDirPath
                    + File.separator + "Wait.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "JavascriptActions.java"), new File(this.utilsPackageDirPath
                    + File.separator + "JavascriptActions.java"));
            FileUtils.copyFile(new File(this.staticFilesDirectory + File.separator
                    + "ExpectedConditionElementToBeClickable.java"), new File(this.utilsPackageDirPath
                    + File.separator + "ExpectedConditionElementToBeClickable.java"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getAtusaTestSuiteNameCoverage() {
        return atusaTestSuiteNameCoverage;
    }

    public String getAtusaTestSuiteName() {
        return atusaTestSuiteName;
    }

    public String getTestSuiteName() {
        return testSuiteName;
    }

    public String getTestSuiteNameCoverage() {
        return testSuiteNameCoverage;
    }
}
