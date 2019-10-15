package main;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.RunListener;

public class TestSuiteExecutor {

    public static void main(String[] args) throws Exception {
        execute();
    }

    public static void execute() throws Exception {
        long start = System.currentTimeMillis();
        JUnitCore core = new JUnitCore();
        core.run(Class.forName("tests.GeneratedTestSuite"));
        System.out.println("Time elapsed: "
                + ((System.currentTimeMillis() - start) / 1000));
    }
}