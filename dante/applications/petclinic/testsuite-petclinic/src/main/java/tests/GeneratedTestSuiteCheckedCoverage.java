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
		Thread.sleep(3000);
		basePageObject = new BasePageObject(driver);
	}

	@Before
	public void setUp() throws Exception {
		driver.get(Properties.app_url);
		Thread.sleep(1000);
	}

	@Test
	public void test00() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test00");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dog");
		driver.findElement(
				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(600);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("snake");
		driver.findElement(
				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test01() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test01");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test02() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test02");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dog");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test03() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test03");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dog");
		driver.findElement(
				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test04() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test04");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dog");
		driver.findElement(
				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("snake");
		driver.findElement(
				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test05() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test05");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test06() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test06");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test07() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test07");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test08() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test08");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dog");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test09() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test09");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
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