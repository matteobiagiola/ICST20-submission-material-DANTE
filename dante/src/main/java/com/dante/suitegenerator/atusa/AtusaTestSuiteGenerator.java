package com.dante.suitegenerator.atusa;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.dante.parsing.TestCase;
import com.dante.subjects.Config;
import com.dante.subjects.SetupApp;
import com.dante.suitegenerator.JavaProjectGenerator;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.utils.Properties;

import java.io.File;
import java.util.List;

public class AtusaTestSuiteGenerator {

    public static void main(String[] args){

        config();

        Config config = SetupApp.getConfig();

        SuiteGeneratorConfig suiteGeneratorConfig = config.getSuiteGeneratorConfig();
        File crawlerResultsFile = new File(suiteGeneratorConfig.getCrawlerResultsFilePath());

        ModelTestCasesExtractor modelTestCasesExtractor = new ModelTestCasesExtractor();
        List<TestCase> testCases = modelTestCasesExtractor.extractTestCases(crawlerResultsFile, config);

        JavaProjectGenerator javaProjectGenerator = new JavaProjectGenerator(suiteGeneratorConfig);
        javaProjectGenerator.generateAtusaTests(testCases);

    }

    private static void config(){
        instantiateProperties();
    }

    private static void instantiateProperties(){
        Properties.getInstance().createPropertiesFile();
    }


}
