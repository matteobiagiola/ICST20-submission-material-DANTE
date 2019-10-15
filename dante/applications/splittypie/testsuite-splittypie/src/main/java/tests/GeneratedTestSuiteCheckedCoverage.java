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
import utils.BasePageObject;
import utils.DriverProvider;
import utils.Properties;
import utils.SessionProvider;

/**
 * @implNote TO RUN OFFLINE
 * */
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
		Thread.sleep(3001);
		basePageObject = new BasePageObject(driver);
	}

	@Before
	public void setUp() throws Exception {
		driver.get(Properties.app_url);
		Thread.sleep(201);

	}

	@Test
	public void test00() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test00");
		driver.get("http://localhost:4200");
		Thread.sleep(201);

		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oMZGSpYo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("IEPHDNTM");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pMTWAEuL");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("atcamkzO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("VqZdpnop");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ffdAtgae");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("sxuobMzX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PdievlQZ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("jaUQzNmR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
	}

	@Test
	public void test01() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test01");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HsKYzFMb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("nKODIeKN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LvokyZBT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PkStpTAI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xbPkBllc");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("zNcwGJVx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xglrzBaU");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UZfrrtZM");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ggjsohsd");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AhmBTwIX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uwWSdDfV");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("QErpaLCT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kenmZPPM");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("iDibZYEi");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ndijXsMR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("RqQyDLCh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("KXeedcEo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GGjyrIkA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("QjOgnSXw");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZrNChDod");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NRKbdoiy");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ygfUJaFF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xuQaANLd");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GimVsdOi");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
	}

	@Test
	public void test02() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test02");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvjyhGZe");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dJVGvksS");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HsxHHpKF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oCoTnsVX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test03() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test03");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
	}

	@Test
	public void test04() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test04");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FRJbNXXd");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("mFSmUQih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("abZSSMuI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("jRowgOxq");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test05() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test05");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
	}

	@Test
	public void test06() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test06");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
	}

	@Test
	public void test07() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test07");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"))
				.click();
	}

	@Test
	public void test08() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test08");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("qEdoDtvE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uaYWYufD");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DlSfaLQp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("IJlEeByf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("YbfEHCBZ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("jQrwkGMN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("czKjKSRy");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PECLeNXB");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("bNjmOKLi");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("MWsMOAEr");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("WxqCPzXn");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fCvcfjBD");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("KVpiJjdj");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("MyLYRXUz");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dImMiqpU");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("khdSuYTw");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oEudpOCo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DxfMxJpf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DkGKgCBE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
	}

	@Test
	public void test09() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test09");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		// click on link to go to home page
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/nav[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
	}

	@Test
	public void test10() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test10");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test11() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test11");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test12() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test12");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("odXYXFvU");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HRCoCrRE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UTzzIHns");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("cfDbMvIC");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("splBhWBh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test13() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test13");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("khdSuYTw");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oEudpOCo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DxfMxJpf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DkGKgCBE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test14() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test14");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
//				.click();
	}

	@Test
	public void test15() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test15");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test16() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test16");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"))
//				.click();
	}

	@Test
	public void test17() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test17");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JqRTcUEr");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("VXuHAQJm");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("goWUikgY");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("MugmmyMv");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("VrvUfFzA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test18() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test18");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("khdSuYTw");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oEudpOCo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DxfMxJpf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DkGKgCBE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"))
//				.click();
	}

	@Test
	public void test19() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test19");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PmYLlPmI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("khdSuYTw");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oEudpOCo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DxfMxJpf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DkGKgCBE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("qjYSJFjP");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
//				.click();
	}

	@Test
	public void test20() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test20");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HMayLLDx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kgIrnNFa");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
	}

	@Test
	public void test21() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test21");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HMayLLDx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kgIrnNFa");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
//				.click();
	}

	@Test
	public void test22() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test22");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test23() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test23");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/DIV[1]/DIV[1]")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dHTDavfO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GesAcSqH");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tMupokRO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("VeoTSqNo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("KNQibhNA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test24() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test24");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PmYLlPmI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vnZRKmoR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZNwBumDs");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ssJsGOXN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vpzsXvTR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("geySMrbW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("cSojmnzX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("KdCOJLtj");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PXoJJKky");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GFSdSFMN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("jreTEXAd");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oPuRWeRj");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("avRetKIR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PBYtPgCc");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("zKJJrCoI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fMKPEjPI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GpeXIFqv");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fohbhwhc");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FNDkFbrq");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("SGdugLNl");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("huehkJvv");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("zjIhTvTu");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dukdfMzu");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("OyFWAUvx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("yVAKyvbI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("zeVIUoql");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("wJEBgUCF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ikAlHyyG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FhIRTnea");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("hDtJjiyC");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("QybXVfem");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("TeFAICFI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HCCgEmmJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ePwEXWMh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("TujJroXH");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("rqDqnrzR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("shrNPqpF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvvdRPhy");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ylwIpsZs");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("syrCiucJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LXtUDyOs");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fVmNCHxz");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("wMkGnUpn");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("IhVxIvIm");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PAmzuVZE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kaaxZtuh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xayzbrGH");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("cmmTdKGg");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("mJvgehQn");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UAksCTLi");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HmWxwPLc");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("cRfMOVXU");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("XCQnqHAh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("WDbqtaGT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JZgeXPZq");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("QYSBxium");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FXuqYoLN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("BJfcTPdb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UeTNUIsx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
	}

	@Test
	public void test25() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test25");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PmYLlPmI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vnZRKmoR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("khdSuYTw");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oEudpOCo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DxfMxJpf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DkGKgCBE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("qjYSJFjP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xWaLRbgn");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test26() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test26");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PmYLlPmI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vnZRKmoR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FMttnrYX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("khdSuYTw");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("oEudpOCo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DxfMxJpf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DkGKgCBE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("qjYSJFjP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xWaLRbgn");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("XzlFTKWS");
//		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("RhuYPzAD");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tFZIiQtP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("YjmepJtW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AyAPEWxh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("WvhRMGiq");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("XDOcOAqd");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("lemKQrTB");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
	}

	@Test
	public void test27() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test27");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]")).sendKeys("12 20 shopping");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]")).click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]"));
//                    driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).sendKeys("2019-05-07");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).sendKeys("2019-04-09");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      DkGKgCBE ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      DkGKgCBE ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).sendKeys("2019-05-07");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).sendKeys("2019-04-09");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      oEudpOCo ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      oEudpOCo ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).sendKeys("2019-05-07");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).sendKeys("2019-04-09");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      DxfMxJpf ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      DxfMxJpf ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).sendKeys("2019-05-07");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).sendKeys("2019-04-09");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      xWaLRbgn ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      xWaLRbgn ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).sendKeys("2019-05-07");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).sendKeys("2019-04-09");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      oEudpOCo ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      oEudpOCo ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).sendKeys("2019-05-07");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).sendKeys("2019-04-09");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      oEudpOCo ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      oEudpOCo ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).sendKeys("2019-05-07");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).sendKeys("2019-04-09");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      Select payer... ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      Select payer... ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]")).sendKeys("2019-05-07");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).clear();
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]")).sendKeys("2019-04-09");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      xWaLRbgn ");
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SELECT[1]")).sendKeys("      xWaLRbgn ");
	}

	@Test
	public void test28() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test28");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HMayLLDx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kgIrnNFa");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZLXQucbP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("awmFgirb");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test29() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test29");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"))
//				.click();
	}

	@Test
	public void test30() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test30");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test31() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test31");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PmYLlPmI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vnZRKmoR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FMttnrYX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("cglTskfh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZNwBumDs");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ssJsGOXN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZFyxWjOW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xAVZvmzp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GkKxMsvO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JVbkETcp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xggXvidG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fOhNpIuA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvPreelR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("lfCqBQxF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pdQzFKLj");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("SlKhLnsu");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[8]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[8]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kSNtxeML");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test32() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test32");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.sendKeys("2019-05-07");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.sendKeys("2019-04-09");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.sendKeys("2019-05-07");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.sendKeys("2019-04-09");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.sendKeys("2019-05-07");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.sendKeys("2019-04-09");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.sendKeys("2019-05-07");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.sendKeys("2019-04-09");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.sendKeys("2019-05-07");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.sendKeys("2019-04-09");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
//				.click();
	}

	@Test
	public void test33() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test33");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
//				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
//				.click();
	}

	@Test
	public void test34() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test34");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GkKxMsvO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JVbkETcp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xggXvidG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fOhNpIuA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvPreelR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
	}

	@Test
	public void test35() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test35");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PmYLlPmI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vnZRKmoR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZNwBumDs");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ssJsGOXN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GkKxMsvO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JVbkETcp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xggXvidG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fOhNpIuA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvPreelR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("lfCqBQxF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pdQzFKLj");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test36() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test36");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
//		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("sTwvsodM");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PQpcVVoF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("gzcrfFQG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("qsgbyoox");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("EIeXAJYB");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("gLaGunGo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("BUNpyWZi");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("sXlNezys");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("elWjZVrx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("wjbdYkpz");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LTvXEYDp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("hSYipAts");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("jcIDgPqR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("WcWcFrkx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("qZaXXYzl");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("proxwLGV");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dDZsritQ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("WwFNrwfd");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JHaXEwMZ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("skoMjiqD");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("IbAVWZST");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CWdzoXuD");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CMrFFlGc");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("RiltgxAa");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pjERkmzV");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tmNryEyI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("lPISTIKc");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("iRCrshDX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("lQFkAWrh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("wMwxoolM");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("YqEzYRGc");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZhePcCIn");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("dwVzdClY");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqCIcnww");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uNDELlid");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("XOPvfPed");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("WpOVlzMU");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("USMoIZTu");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("yowjHWlX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("yHfcXrLT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("aWoMVmPw");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZOgVdBzD");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("alzXtkkv");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("qviMBcTJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("sHSbWLGd");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("YgKYSlWf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("mzbmpyjS");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("awbXBxlD");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kZOnPXiv");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
	}

	@Test
	public void test37() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test37");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HMayLLDx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kgIrnNFa");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZLXQucbP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("awmFgirb");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
	}

	@Test
	public void test38() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test38");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HMayLLDx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kgIrnNFa");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZLXQucbP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("awmFgirb");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test39() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test39");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
	}

	@Test
	public void test40() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test40");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HMayLLDx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kgIrnNFa");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZLXQucbP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("awmFgirb");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("goXtBkPx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("RllABlBV");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("jaMaxhmF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("TikOCyKi");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NRjTBJiH");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("XyIIbfXb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("QmTMCthZ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("IKDXjRUU");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uRdFsOCv");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UKGGncUJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pHilbjYc");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xrkgfhUi");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("iawekvPS");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("IExtwSdV");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JNPQdZQb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NoTnnPnu");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("zSWfMgSt");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("YsMLltMk");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pTaopVLu");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("zAomZeUe");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ofQCCqUR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pubCkTtF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PeByAJNv");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("cdmDtJTX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("udTyslOV");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("QuDezSdD");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ApXzaQLk");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NUnyPKxl");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("eXBTvXRE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NRhFClcy");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("olscqtgd");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pPlNveuK");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xUOCaUIG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("yKujnZYJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tezNHFwl");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("rbiZiDPp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ThBrucLr");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("SbBxwQVi");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("DPrDbPDr");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("aaxeTpJh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vhEUFTxf");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kjouIMLb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("WgYWGTXn");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("rvORtFog");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("OtKKINCa");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("jTpTiEir");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xfUNpGiv");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vOFTHMLU");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("gzPqwdNy");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
	}

	@Test
	public void test41() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test41");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test42() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test42");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
//				.click();
		Thread.sleep(500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test43() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test43");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PmYLlPmI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vnZRKmoR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FMttnrYX");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("cglTskfh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZNwBumDs");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ssJsGOXN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZFyxWjOW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xAVZvmzp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GkKxMsvO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JVbkETcp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xggXvidG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fOhNpIuA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvPreelR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("lfCqBQxF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pdQzFKLj");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[7]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("SlKhLnsu");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[8]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[8]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kSNtxeML");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ul[1]/li[7]/div[1]/div[1]/span[1]/button[1]"))
				.click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ul[1]/li[7]/div[1]/div[1]/span[1]/button[1]"))
				.click();
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(600);
//		basePageObject.takeScreenshot("test43",1);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GkKxMsvO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JVbkETcp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xggXvidG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fOhNpIuA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvPreelR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HMayLLDx");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("kgIrnNFa");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test44() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test44");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("PmYLlPmI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vnZRKmoR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZNwBumDs");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ssJsGOXN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GkKxMsvO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JVbkETcp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xggXvidG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fOhNpIuA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvPreelR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[5]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("lfCqBQxF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[6]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("pdQzFKLj");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[3]/BUTTON[1]"));
	}

	@Test
	public void test45() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test45");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
	}

	@Test
	public void test46() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test46");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("HWaPYqgW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("Ndraignq");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("OqUnYvHH");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("arROGRmh");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("wKhqeksG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("MEnkeLrN");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tvkzuPDa");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("KxyPZjWL");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NwUFAkRl");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test47() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test47");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(500);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
		Thread.sleep(1000);
		basePageObject.sendKeys(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"),
				"12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test48() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test48");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GkKxMsvO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JVbkETcp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xggXvidG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fOhNpIuA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvPreelR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test49() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test49");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(600);
//		basePageObject.takeScreenshot("test49", 1);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test50() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test50");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test51() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test51");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.get("http://localhost:4200");
	}

	@Test
	public void test52() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test52");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
	}

	@Test
	public void test53() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test53");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("XrIiRxyg");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("WvAdQJpr");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AOJJrfWE");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("sYvIZKEj");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("cCLbLAUG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/SPAN[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test54() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test54");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
//		driver.get("http://localhost:4200");
//		Thread.sleep(201);
//		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(200);
//		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
//		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
	}

	@Test
	public void test55() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test55");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
//		driver.get("http://localhost:4200");
//		Thread.sleep(201);
//		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(200);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(200);
//		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
//		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		Thread.sleep(200);
//		driver.get("http://localhost:4200");
//		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
	}

	@Test
	public void test56() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test56");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
//		driver.get("http://localhost:4200");
//		Thread.sleep(201);
//		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(200);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(200);
//		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
//		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
//		Thread.sleep(200);
//		driver.get("http://localhost:4200");
//		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
	}

	@Test
	public void test57() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test57");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]"))
				.click();
	}

	@Test
	public void test58() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test58");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(600);
//		basePageObject.takeScreenshot("test58", 1);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
	}

	@Test
	public void test59() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test59");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
	}

	@Test
	public void test60() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test60");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("FqJAbrzJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ftojKVQI");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("NuaLlPfJ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/INPUT[1]"))
				.sendKeys("2019-05-07");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/INPUT[1]"))
				.sendKeys("2019-04-09");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(500);
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
//				.click();
		Thread.sleep(500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test61() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test61");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("AuxqbEQF");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("vsRQvXjR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("LWsFmVoT");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("UdiuVwKW");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("ZgSvDwON");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("tcHeypJP");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("CBtMJklb");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("GkKxMsvO");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("JVbkETcp");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("xggXvidG");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[3]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("fOhNpIuA");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[4]/DIV[1]/DIV[1]/INPUT[1]"))
				.sendKeys("uvPreelR");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Euro (EUR)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("Pound sterling (GBP)");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"))
				.sendKeys("United States dollar (USD)");
		basePageObject.saveButtonClick(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
	}

	@Test
	public void test62() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test62");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
	}

	@Test
	public void test63() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test63");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(600);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
	}

	@Test
	public void test64() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test64");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]"))
				.click();
	}

	@Test
	public void test65() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test65");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"))
//				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(600);
//		basePageObject.takeScreenshot("test65", 1);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
	}

	@Test
	public void test66() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test66");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(600);
//		basePageObject.takeScreenshot("test66", 1);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
	}

	@Test
	public void test67() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test67");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(600);
//		basePageObject.takeScreenshot("test67", 1);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
	}

	@Test
	public void test68() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test68");
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(600);
//		basePageObject.takeScreenshot("test68", 1);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		basePageObject.waitForElementBeingPresentOnPage(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		driver.get("http://localhost:4200");
		Thread.sleep(201);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]"));
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("12 20 shopping");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"))
				.click();
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[2]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
		basePageObject.waitForElementBeingClickable(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		basePageObject.click(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		Thread.sleep(200);
		basePageObject.clickSettleUp(By.xpath("/HTML[1]/BODY/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/DIV[1]/DIV[1]/LI[1]/BUTTON[1]"));
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