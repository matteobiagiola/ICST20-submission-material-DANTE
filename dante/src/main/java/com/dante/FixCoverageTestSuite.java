package com.dante;

import com.dante.parsing.TestCaseFinder;
import com.dante.utils.FileUtils;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FixCoverageTestSuite {

    private final static Logger logger = Logger.getLogger(FixCoverageTestSuite.class.getName());

    public static void main(String[] args) {

        config();

        Properties.getInstance().checkFileExistence(Properties.TEST_SUITE_PATH,
                "test_suite_path");

        String appUrl = "http://localhost:3000";
        int waitTimeoutReload = 1000;

        Properties.tests_order = new TestCaseFinder().getTestCaseOrder();

        File javaFile = new File(Properties.TEST_SUITE_PATH);
        String javaFileCoveragePath = javaFile.getAbsolutePath().substring(0, javaFile.getAbsolutePath().indexOf(".java"))
                + "Coverage.java";
        File javaFileCoverage = new File(javaFileCoveragePath);
        try {
            String content = Files.lines(javaFileCoverage.toPath()).map(String::valueOf)
                    .collect(Collectors.joining("\n"));
            JavaClassSource javaClass = Roaster.parse(JavaClassSource.class, content);
            List<MethodSource<JavaClassSource>> methods = javaClass.getMethods();
            methods = methods.stream().filter(method -> method.hasAnnotation("org.junit.Test")).collect(Collectors.toList());
            for (MethodSource<JavaClassSource> method : methods) {
                List<String> oldStatements = new LinkedList<>(Arrays.asList(method.getBody().split("\n")));
                List<String> newStatements = new LinkedList<>();
                newStatements.add("codeCoverage.setTestCaseNameBeingExecuted(\"" + method.getName() + "\");");
                newStatements.add("driver.get(\"" + appUrl + "\");");
                newStatements.add("Thread.sleep(" + waitTimeoutReload + ");");
                newStatements.add("\n");
                newStatements.addAll(oldStatements);
                method.setBody(String.join("\n", newStatements));
            }
            FileUtils.writeFile(javaClass.toString(), javaFileCoverage.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void config() {
        instantiateProperties();
    }

    private static void instantiateProperties() {
        Properties.getInstance().createPropertiesFile();
    }
}
