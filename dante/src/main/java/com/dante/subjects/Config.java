package com.dante.subjects;

import com.crawljax.browser.EmbeddedBrowser;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.BrowserOptions;
import com.crawljax.core.configuration.CrawlRules;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.plugins.crawloverview.CrawlOverview;
import com.crawljax.plugins.testcasegenerator.TestSuiteGenerator;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.tedd.extraction.DependencyGraphExtractionConfig;
import com.dante.utils.FileUtils;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class Config {

    private final static Logger logger = Logger.getLogger(Config.class.getName());

    private final String applicationName;

    // Shared properties
    private String outputDirFilePath;
    private String seleniumActionsDirFilePath;
    private String seleniumActionsFileName;

    public Config(String applicationName) {
        this.applicationName = applicationName;
        this.outputDirFilePath = Properties.user_dir + File.separator + "applications"
                + File.separator + this.applicationName;
        if(!new File(this.outputDirFilePath).exists()) {
            logger.info("Creating crawler output directory: " + this.outputDirFilePath);
            if(!new File(this.outputDirFilePath).mkdir())
                throw new RuntimeException("Failed in creating directory: " + this.outputDirFilePath);
        }
        this.seleniumActionsDirFilePath = this.outputDirFilePath;
        this.seleniumActionsFileName = "selenium-actions-" + this.applicationName + "-"
                + (Properties.FIRED_ELEMENT_STRATEGY ? "fired" : "checked") + ".txt";
    }

    protected SuiteGeneratorConfig testSuiteGeneratorCommonConfig(String url, int waitTimeAfterReload) {

        String seleniumActionsFilePath = this.seleniumActionsDirFilePath + File.separator
                + this.seleniumActionsFileName;
        String testSuiteProjectDirPath = this.outputDirFilePath;

        return this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload, seleniumActionsFilePath,
                testSuiteProjectDirPath);

    }

    protected SuiteGeneratorConfig testSuiteGeneratorCommonConfig(String url, int waitTimeAfterReload,
                                                                  String seleniumActionsFilePath,
                                                                  String testSuiteProjectDirPath) {

        try {
            new URL(url);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }

        Properties.getInstance().checkFileExistence(seleniumActionsFilePath,
                "driver_actions_dir_file_path");
        Properties.getInstance().checkDirectoryExistence(testSuiteProjectDirPath,
                "test_suite_project_dir_path");


        SuiteGeneratorConfig suiteGeneratorConfig = new SuiteGeneratorConfig();
        suiteGeneratorConfig.setCrawlerResultsFilePath(testSuiteProjectDirPath
                + "/localhost/crawl-with-inputs/result.json");
        suiteGeneratorConfig.setDriverActionsFilePath(seleniumActionsFilePath);
        suiteGeneratorConfig.setTestSuiteProjectDirPath(testSuiteProjectDirPath);
        suiteGeneratorConfig.setApplicationName(this.applicationName);
        suiteGeneratorConfig.setUrl(url);
        suiteGeneratorConfig.setWaitTimeAfterReload(waitTimeAfterReload);

        return suiteGeneratorConfig;

    }

    protected CrawljaxConfiguration.CrawljaxConfigurationBuilder crawljaxCommonConfig(String url,
                                                                                      int maxRuntimeMin,
                                                                                      int waitTimeAfterEvent,
                                                                                      int waitTimeAfterReload) {
        try {
            new URL(url);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }

        Properties.getInstance().checkDirectoryExistence(this.outputDirFilePath,
                "output_dir_file_path");
        Properties.getInstance().checkDirectoryExistence(this.seleniumActionsDirFilePath,
                "driver_actions_dir_file_path");
        Properties.getInstance().checkFileExistence(this.seleniumActionsDirFilePath,
                "driver_actions_file_name");

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(url);

        if(Properties.FORM_TRAINING) {
            builder.crawlRules().setFormFillMode(CrawlRules.FormFillMode.TRAINING);
        } else {
            builder.crawlRules().setFormFillMode(CrawlRules.FormFillMode.RANDOM);
        }

        // click these elements
        builder.crawlRules().clickDefaultElements();
        builder.crawlRules().crawlHiddenAnchors(false);
        builder.crawlRules().crawlFrames(false);
        builder.setUnlimitedCrawlDepth();
        builder.setMaximumRunTime(maxRuntimeMin, TimeUnit.MINUTES);
        builder.setUnlimitedStates();

        CrawljaxConfiguration.CandidateElementsMode candidateElementsMode = Properties.FIRED_ELEMENT_STRATEGY ?
                CrawljaxConfiguration.CandidateElementsMode.fired :
                CrawljaxConfiguration.CandidateElementsMode.checked;
        builder.setConsiderCandidateElementsOnce(candidateElementsMode);

        File seleniumActionsDir = new File(this.seleniumActionsDirFilePath);
        FileUtils.createDirIfDoesNotExist(seleniumActionsDir);
        builder.setSeleniumActionsDir(seleniumActionsDir.getAbsolutePath());
        builder.setSeleniumActionsFileName(this.seleniumActionsFileName);

        builder.setCrawlPathSeparator(Properties.CRAWL_PATH_SEPARATOR);

        builder.setOutputDirectory(new File(this.outputDirFilePath));

        //builder.setMaximumStates(10);
        //builder.setMaximumDepth(3);
        builder.crawlRules().clickElementsInRandomOrder(false);

        // FIXME Set timeouts (bug of Crawljax to fix that's why they are swapped)
        builder.crawlRules().waitAfterReloadUrl(waitTimeAfterEvent, TimeUnit.MILLISECONDS);
        builder.crawlRules().waitAfterEvent(waitTimeAfterReload, TimeUnit.MILLISECONDS);

        BrowserConfiguration browserConfiguration;
        BrowserOptions browserOptions = new BrowserOptions(BrowserOptions.MACBOOK_PRO_RETINA_PIXEL_DENSITY);
        if(Properties.HEADLESS) {
            browserConfiguration =
                    new BrowserConfiguration(EmbeddedBrowser.BrowserType.CHROME_HEADLESS, 1, browserOptions);
        } else {
            browserConfiguration =
                    new BrowserConfiguration(EmbeddedBrowser.BrowserType.CHROME, 1, browserOptions);
        }
        builder.setBrowserConfig(browserConfiguration);

        // CrawlOverview
        builder.addPlugin(new CrawlOverview());
        builder.addPlugin(new TestSuiteGenerator());

        return builder;

    }

    public abstract CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig();

    public abstract SuiteGeneratorConfig getSuiteGeneratorConfig();

    public abstract DependencyGraphExtractionConfig getDependencyGraphExtractionConfig();
}
