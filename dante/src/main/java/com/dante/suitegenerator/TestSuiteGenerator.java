package com.dante.suitegenerator;

import com.dante.parsing.CrawlingActionsParser;
import com.dante.parsing.TestCase;
import com.dante.subjects.Config;
import com.dante.subjects.SetupApp;
import com.dante.utils.Properties;

import java.io.File;
import java.util.List;

public class TestSuiteGenerator {

    public static void main(String[] args){

        config();

        Config config = SetupApp.getConfig();

        SuiteGeneratorConfig suiteGeneratorConfig = config.getSuiteGeneratorConfig();
        File driverActionsFile = new File(suiteGeneratorConfig.getDriverActionsFilePath());

        CrawlingActionsParser crawlingActionsParser = new CrawlingActionsParser();
        List<TestCase> testCases = crawlingActionsParser.getTestCases(driverActionsFile);

        JavaProjectGenerator javaProjectGenerator = new JavaProjectGenerator(suiteGeneratorConfig);
        javaProjectGenerator.generateJavaProject(testCases);

    }

    private static void config(){
        instantiateProperties();
    }

    private static void instantiateProperties(){
        Properties.getInstance().createPropertiesFile();
    }


}
