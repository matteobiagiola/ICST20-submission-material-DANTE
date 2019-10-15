package tests;

import java.util.concurrent.TimeUnit;

import coverage.CodeCoverage;
import io.webfolder.cdp.session.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import utils.BasePageObject;
import utils.DriverProvider;
import utils.Properties;
import utils.SessionProvider;

public class GeneratedTestSuiteCheckedCoverage {

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
		Thread.sleep(2001);
		basePageObject = new BasePageObject(driver);
	}

	@Before
	public void setUp() throws Exception {
		driver.get(Properties.app_url);
		Thread.sleep(1000);
	}

	@Test
	public void test0() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test0");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
	}

	@Test
	public void test1() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test1");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("foo@bar.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys("foo@bar.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"))
				.sendKeys("foobar123");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(By.id("input_username")).clear();
		driver.findElement(By.id("input_username")).sendKeys("asd@asd.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"))
				.sendKeys("adminadmin");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("foo@bar.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys("foo@bar.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"))
				.sendKeys("foobar123");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(By.id("input_username")).clear();
		driver.findElement(By.id("input_username")).sendKeys("asd@asd.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"))
				.sendKeys("adminadmin");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys("foo@bar.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("foo@bar.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys("foo@bar.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"))
				.sendKeys("foobar123");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Others");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Others");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Others");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Others");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Others");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Others");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Others");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Others");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(By.id("input_currency")).sendKeys(
				"United States Dollar");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(By.id("add_transaction_text")).clear();
		driver.findElement(By.id("add_transaction_text")).sendKeys(
				"transaction");
		driver.findElement(By.id("add_transaction_text")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("add_transaction_amount")).clear();
		driver.findElement(By.id("add_transaction_amount")).sendKeys("20");
		driver.findElement(By.id("add_transaction_amount"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
	}

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