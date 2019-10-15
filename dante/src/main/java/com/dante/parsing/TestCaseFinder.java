package com.dante.parsing;

import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import spoon.reflect.code.CtComment;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;

import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestCaseFinder {

    private final static Logger logger = Logger.getLogger(TestCaseFinder.class.getName());

    public TestCaseFinder(){
    }

    private List<File> getClassFiles(File file){
        List<File> result = new ArrayList<>();
        if(file.isDirectory()){
            for (File child: file.listFiles()){
                result.addAll(this.getClassFiles(child));
            }
        }else if(file.getName().contains(".java")) {
            result.add(file);
        }
        return result;
    }

    private static Function<String, Function<Optional<CtClass<?>>, CtClass<?>>> getCtClassFromOptionalCtClass = errorMessage ->
        optional -> {
            if(optional.isPresent()) return optional.get();
            else throw new IllegalStateException(errorMessage);
        };

    private static Predicate<Optional<?>> isEmptyOptional = Optional::isPresent;

    public List<CtClass<?>> getTestCaseParsedRepresentation(File file){
        List<File> classFiles = this.getClassFiles(file);
        List<CtClass<?>> parsedClasses =
                classFiles.stream()
                .map(file1 -> {
                    TestCaseParser testCaseParser = new TestCaseParser(file1);
                    return testCaseParser.getCtRepresentationOfClass(); // optional because some of them may not be classes
                })
                .filter(isEmptyOptional)
                .map(getCtClassFromOptionalCtClass.apply(this.getClass().getName() + ": file " + file.getAbsolutePath() + " is not a class"))
                .collect(Collectors.toList());
        List<String> testsToConsider = Arrays.asList(Properties.tests_order);
        parsedClasses = parsedClasses.stream().filter(parsedClass ->
                testsToConsider.contains(parsedClass.getSimpleName())).collect(Collectors.toList());
        return parsedClasses;
    }

    public String[] getTestCaseOrder(){
        File testSuiteFile = new File(Properties.TEST_SUITE_PATH);
        TestCaseParser testCaseParser = new TestCaseParser(testSuiteFile);
        Optional<CtClass<?>> ctClassTestSuiteOptional = testCaseParser.getCtRepresentationOfClass();
        if(!ctClassTestSuiteOptional.isPresent()) {
            throw new IllegalStateException("Impossible to get compile time representation of class "
                    + testSuiteFile.getAbsolutePath());
        }
        CtClass<?> ctClassTestSuite = ctClassTestSuiteOptional.get();
        List<CtMethod> testMethods = ctClassTestSuite.getMethods().stream()
                .filter(ctMethod -> {
                    List<CtAnnotation<?>> annotations = ctMethod.getAnnotations();
                    Optional<CtAnnotation<?>> optionalTestAnnotation = annotations.stream()
                            .filter(ctAnnotation -> ctAnnotation.getType().getSimpleName().equals("Test"))
                            .findAny();
                    return optionalTestAnnotation.isPresent();
                })
                .collect(Collectors.toList());
        if(testMethods.isEmpty()) {
            throw new IllegalStateException("There should be at least one test case in "
                    + Properties.TEST_SUITE_PATH);
        }
        // order test cases according to the order in which they appear in the source code which is the correct order
        testMethods.sort(Comparator.comparingInt(method -> method.getPosition().getLine()));
        List<String> testMethodNames = new LinkedList<>();
        for (CtMethod testMethod : testMethods) {
            testMethodNames.add(testMethod.getSimpleName());
        }
        return testMethodNames.toArray(new String[0]);
    }

    public List<CtMethod> getCtMethodRepresentation(){
        File testSuiteFile = new File(Properties.TEST_SUITE_PATH);
        TestCaseParser testCaseParser = new TestCaseParser(testSuiteFile);
        Optional<CtClass<?>> ctClassTestSuiteOptional = testCaseParser.getCtRepresentationOfClass();
        if(!ctClassTestSuiteOptional.isPresent()) {
            throw new IllegalStateException("Impossible to get compile time representation of class "
                    + testSuiteFile.getAbsolutePath());
        }
        CtClass<?> ctClassTestSuite = ctClassTestSuiteOptional.get();
        List<CtMethod> testMethods = ctClassTestSuite.getMethods().stream()
                .filter(ctMethod -> {
                    List<CtAnnotation<?>> annotations = ctMethod.getAnnotations();
                    Optional<CtAnnotation<?>> optionalTestAnnotation = annotations.stream()
                            .filter(ctAnnotation -> ctAnnotation.getType().getSimpleName().equals("Test"))
                            .findAny();
                    return optionalTestAnnotation.isPresent();
                })
                .collect(Collectors.toList());
        if(testMethods.isEmpty()) {
            throw new IllegalStateException("There should be at least one test case in "
                    + Properties.TEST_SUITE_PATH);
        }
        // order test cases according to the order in which they appear in the source code which is the correct order
        testMethods.sort(Comparator.comparingInt(method -> method.getPosition().getLine()));
        return testMethods;
    }
}
