package com.dante.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.dante.subjects.Config;
import com.dante.suitegenerator.SuiteGeneratorConfig;
import com.dante.tedd.extraction.DependencyGraphExtractionConfig;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultConfig extends Config {

    private final static Logger logger = Logger.getLogger(DefaultConfig.class.getName());

    public DefaultConfig() {
        super(Properties.APPLICATION_NAME);
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {
        return this.crawljaxCommonConfig(Properties.URL, Properties.MAX_RUNTIME,
                Properties.WAIT_TIME_AFTER_EVENT, Properties.WAIT_TIME_AFTER_RELOAD);
    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {
        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(Properties.URL,
                Properties.WAIT_TIME_AFTER_RELOAD, Properties.DRIVER_ACTIONS_FILE_PATH,
                Properties.TEST_SUITE_PROJECT_DIR_PATH);

        List<String> scriptNamesToExclude = Arrays.asList(Properties.SCRIPT_NAMES_TO_EXCLUDE);
        String scriptNameToInclude = Properties.SCRIPT_NAME_TO_INCLUDE;
        if(scriptNamesToExclude.size() == 0 && scriptNameToInclude.isEmpty())
            throw new IllegalArgumentException("Neither script_names_to_exclude nor script_name_to_include were set");

        List<String> lineRanges = Arrays.asList(Properties.LINE_RANGES);

        if(!scriptNameToInclude.isEmpty() && lineRanges.size() == 0)
            logger.warn("line_ranges properties not specified. Considering all lines in script "
                    + Properties.SCRIPT_NAME_TO_INCLUDE);

        Properties.getInstance().checkMultiValueProperty(Properties.SCRIPT_NAMES_TO_EXCLUDE, ",",
                "script_names_to_exclude", true);
        Properties.getInstance().checkMultiValueProperty(Properties.LINE_RANGES, ":",
                "line_ranges", true);

        List<List<Integer>> lineRangesParsed = new ArrayList<>();
        for (String lineRange : lineRanges) {
            String[] startEndOffset = lineRange.split(",");
            if(startEndOffset.length != 2)
                throw new IllegalArgumentException("Line range " + lineRange
                        + " must be of length 2. Found: " + startEndOffset.length);
            List<Integer> startEndOffsetParsed = new ArrayList<>();
            String startOffset = startEndOffset[0];
            String endOffset = startEndOffset[1];
            try {
                startEndOffsetParsed.add(Integer.valueOf(startOffset));
                startEndOffsetParsed.add(Integer.valueOf(endOffset));
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException(ex);
            }
            lineRangesParsed.add(startEndOffsetParsed);
        }

        suiteGeneratorConfig.setScriptNameToInclude(scriptNameToInclude);
        suiteGeneratorConfig.setScriptNamesToExclude(scriptNamesToExclude);
        suiteGeneratorConfig.setLineRanges(lineRangesParsed);

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        throw new UnsupportedOperationException("In default config dependency graph " +
                "extraction using multiobjective optimization is not supported. " +
                "The only possibility is to extract the graph using the original order.");
    }
}
