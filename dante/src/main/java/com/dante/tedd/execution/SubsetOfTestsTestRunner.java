package com.dante.tedd.execution;


import com.dante.utils.Properties;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetOfTestsTestRunner extends BlockJUnit4ClassRunner {

    private List<Method> subsetOfTestsToRun;
    private final static Logger logger = Logger.getLogger(SubsetOfTestsTestRunner.class.getName());
    private boolean firstFailure = false;
    private boolean stopExecutionFirstFailure = false;

    /**
     * Constructs a new {@code ParentRunner} that will run {@code @TestClass}
     *
     * @param testClass
     */
    protected SubsetOfTestsTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    public SubsetOfTestsTestRunner(Class<?> testClass, List<String> namesOfTestCasesToRun,
                                   String stopExecutionFirstFailure) throws InitializationError {
        this(testClass);
        List<Method> testClassMethods = Arrays.asList(testClass.getMethods());
        this.stopExecutionFirstFailure = stopExecutionFirstFailure.equalsIgnoreCase("true");
        this.subsetOfTestsToRun = new LinkedList<>();
        for (Method testClassMethod : testClassMethods) {
            if(testClassMethod.isAnnotationPresent(Test.class)
                    && namesOfTestCasesToRun.contains(testClassMethod.getName())) {
                this.subsetOfTestsToRun.add(testClassMethod);
            }
        }
        // order tests according to original execution order
        this.subsetOfTestsToRun
                .sort(Comparator.comparingInt(SubsetOfTestsTestRunner::getOrderExecutionTestMethod));
    }

    @Override
    protected List<FrameworkMethod> getChildren() {
        return this.subsetOfTestsToRun.stream()
                .map(FrameworkMethod::new)
                .collect(Collectors.toList());
    }

    @Override
    protected void runChild(final FrameworkMethod method, RunNotifier notifier) {
        Description description = describeChild(method);
        if(this.stopExecutionFirstFailure) {
            notifier.addListener(new FailureListener(notifier));
            if (isIgnored(method) || this.firstFailure) {
                logger.debug("Ignoring test method: " + method.getName());
                notifier.fireTestIgnored(description);
            } else {
                try {
                    logger.debug("Running test method: " + method.getName());
                    runLeaf(methodBlock(method), description, notifier);
                } catch (StoppedByUserException ex) {
                    this.firstFailure = true;
                }
            }
        } else {
            if (isIgnored(method)) {
                logger.debug("Ignoring test method: " + method.getName());
                notifier.fireTestIgnored(description);
            } else {
                logger.debug("Running test method: " + method.getName());
                runLeaf(methodBlock(method), description, notifier);
            }
        }
    }

    private static int getOrderExecutionTestMethod(Method method) {
        String methodName = method.getName();
        if(methodName.startsWith("test")) {
            int indexLastT = methodName.lastIndexOf("t");
            String orderAsString = methodName.substring(indexLastT + 1);
            try {
                return Integer.parseInt(orderAsString);
            } catch (NumberFormatException ex) {
                throw new NumberFormatException("Cannot convert "
                        + orderAsString + " in a number");
            }
        }
        throw new IllegalStateException("Method name " + methodName + " must start with 'test'");
    }
}
