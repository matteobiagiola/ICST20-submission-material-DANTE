package com.dante.parsing;

import com.dante.utils.NumberUtils;
import com.dante.utils.Properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CrawlingActionsParser {

    public List<TestCase> getTestCases(File driverActionsFile) {
        List<TestCase> result = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(driverActionsFile))) {
            String line;
            List<String> testStatements = new LinkedList<>();
            int statementCounter = 0;
            int testCaseCounter = 0;
            while ((line = br.readLine()) != null) {
                if(line.equals(Properties.CRAWL_PATH_SEPARATOR)) {
                    TestCase testCase = new TestCase(testStatements, testCaseCounter);
                    result.add(testCase);
                    testStatements = new LinkedList<>();
                    testCaseCounter++;
                } else {
                    testStatements.add(line);
                }
                statementCounter++;
            }
            if(testCaseCounter != 0) {
                TestCase testCase = new TestCase(testStatements, testCaseCounter);
                result.add(testCase);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(result.isEmpty()){
            throw new RuntimeException("File " + driverActionsFile + " must contain at least on test case!");
        }

        // assign each test case a unique name

        int numberOfLeadingZeros = NumberUtils.getNumberOfDigits(result.size());
        for(TestCase testCase: result) {
            // String format below will add leading zeros (the %0 syntax)
            // to the number above.
            // The length of the formatted string will be numberOfLeadingZeros characters.
            String name = "test" + String.format("%0" + numberOfLeadingZeros + "d", testCase.getOrder());
            testCase.setName(name);
        }

        return result;
    }

}
