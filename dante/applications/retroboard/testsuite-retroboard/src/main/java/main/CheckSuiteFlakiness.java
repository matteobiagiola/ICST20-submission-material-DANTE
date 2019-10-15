package main;

import flakiness.CheckFlakiness;
import utils.ResetAppState;

public class CheckSuiteFlakiness {

    public static void main(String[] args) throws Exception {

        if(args != null && args.length == 1) {
            String testSuiteQualifiedName = args[0];

            try {
                Class.forName(testSuiteQualifiedName);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

            ResetAppState.reset();

            CheckFlakiness checkFlakiness = new CheckFlakiness();
            checkFlakiness.check(testSuiteQualifiedName);
        }


    }
}
