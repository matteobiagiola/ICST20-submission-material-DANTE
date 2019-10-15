package flakiness;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.RunListener;

public class TestSuiteFlakinessExecutor {

    public void execute(RunListener runListener, String testSuiteQualifiedName) throws Exception {
        JUnitCore core = new JUnitCore();
        core.addListener(runListener);
        core.run(Class.forName(testSuiteQualifiedName));
    }
}