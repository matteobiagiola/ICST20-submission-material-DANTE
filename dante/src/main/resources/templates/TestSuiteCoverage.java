package tests;

import java.util.concurrent.TimeUnit;
import java.util.List;

import coverage.CodeCoverage;
import io.webfolder.cdp.session.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import utils.BasePageObject;
import utils.DriverProvider;
import utils.Properties;
import utils.SessionProvider;

public class {{test_suite_name}} {

    private static WebDriver driver;
    private static Session session;
    private static CodeCoverage codeCoverage;
    private static BasePageObject basePageObject;

    @BeforeClass
    public static void oneTimeSetUp() throws Exception {
        driver = DriverProvider.getInstance().getDriver();
        session = SessionProvider.getInstance().createSession(driver);
        codeCoverage = new CodeCoverage(session);
        driver.get(Properties.app_url);
        Thread.sleep(2000);
        basePageObject = new BasePageObject(driver);
    }

    @Before
    public void setUp() throws Exception {
        driver.get(Properties.app_url);
        Thread.sleep({{wait_time_after_reload}});
    }

    {% for test_name in test_names %}
    @Test
    public void {{test_name}}() throws Exception {
        codeCoverage.setTestCaseNameBeingExecuted("{{test_name}}");
        driver.get(Properties.app_url);
        Thread.sleep({{wait_time_after_reload}});
        {% for statement in map_statements.get(test_name) %}
            {{statement}}

        {% endfor %}
    }

    {% endfor %}


    @After
    public void saveIntermediateReport() throws Exception {
        codeCoverage.saveCoverage(true);
        codeCoverage.resetCoveragePerTest();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        codeCoverage.saveCoverage(false);
        session.close();
        driver.quit();
    }

}
