package com.dante.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.dante.subjects.ApplicationNames;
import com.dante.subjects.Config;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.tedd.extraction.DependencyGraphExtractionConfig;
import com.dante.utils.Properties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EcommerceConfig extends Config {

    private static final String url = "http://localhost:3000";
    private static final int waitTimeAfterReload = 250;

    public EcommerceConfig() {
        super(ApplicationNames.Name.ECOMMERCE.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 200, waitTimeAfterReload);

        builder.crawlRules().click("SPAN");
        builder.crawlRules().click("BUTTON");
        builder.crawlRules().click("A");

        builder.crawlRules().dontClick("BUTTON")
                .underXPath("/HTML[1]/BODY[1]/MY-APP[1]/DIV[1]/NAVBAR[1]/NAV[1]/DIV[1]/DIV[1]/BUTTON[1]");
        builder.crawlRules().dontClick("A")
                .underXPath("//DIV[@id = 'carousel-example-generic']/A[1]");
        builder.crawlRules().dontClick("A")
                .underXPath("//DIV[@id = 'carousel-example-generic']/A[2]");

        builder.setHandleSameFormInputsOncePerState(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);

        List<List<Integer>> lineRanges = new ArrayList<>();
        lineRanges.add(Arrays.asList(1, 942));
        suiteGeneratorConfig.setScriptNamesToExclude(new ArrayList<>());
        suiteGeneratorConfig.setScriptNameToInclude("bundle-0fda149fe4");
        suiteGeneratorConfig.setLineRanges(lineRanges);
        suiteGeneratorConfig.setFiredElementStrategy(true);

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        DependencyGraphExtractionConfig dependencyGraphExtractionConfig = new DependencyGraphExtractionConfig();
        dependencyGraphExtractionConfig.setParetoFrontSolution(Properties.BIOBJECTIVE_DEPENDENCY_GRAPH_BYTE_STRING);
        dependencyGraphExtractionConfig.setFixedSelectedTestSuite(Properties.COVERAGE_DRIVEN_TEST_SELECTION_BYTE_STRING);

        return dependencyGraphExtractionConfig;
    }
}
