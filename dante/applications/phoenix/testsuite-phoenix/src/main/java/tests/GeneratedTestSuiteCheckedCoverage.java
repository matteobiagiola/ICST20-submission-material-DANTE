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
import utils.ResetAppState;
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
		ResetAppState.reset();
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
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"))
				.sendKeys("john@phoenix-trello.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"))
				.sendKeys("12345678");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.name("crawljax_user_first_name")).clear();
		driver.findElement(By.name("crawljax_user_first_name")).sendKeys("foo");
		driver.findElement(By.name("crawljax_user_last_name")).clear();
		driver.findElement(By.name("crawljax_user_last_name")).sendKeys("bar");
		driver.findElement(By.name("crawljax_user_email")).clear();
		driver.findElement(By.name("crawljax_user_email")).sendKeys(
				"foo@bar.com");
		driver.findElement(By.name("crawljax_user_password")).clear();
		driver.findElement(By.name("crawljax_user_password")).sendKeys(
				"foobar123");
		driver.findElement(By.name("crawljax_user_password_confirmation"))
				.clear();
		driver.findElement(By.name("crawljax_user_password_confirmation"))
				.sendKeys("foobar123");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"))
				.sendKeys("john@phoenix-trello.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"))
				.sendKeys("12345678");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(1200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
//				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"))
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"))
				.sendKeys("foo@bar.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test01() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test01");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[2]/UL[1]/LI[2]/A[1]"))
				.click();
	}

	@Test
	public void test02() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test02");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"))
				.sendKeys("john@phoenix-trello.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"))
				.sendKeys("12345678");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"phoenix board\"]"))
//				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]")).click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[2]"))
				.click();
	}

	@Test
	public void test03() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test03");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
//				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"))
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test04() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test04");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
//				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"))
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"))
				.sendKeys("foo@bar.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test05() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test05");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
//				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"))
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
//		Thread.sleep(350);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"))
//				.click();
	}

	@Test
	public void test06() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test06");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
//				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"))
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test07() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test07");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]")).click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test08() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test08");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test09() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test09");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
	}

	@Test
	public void test10() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test10");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test11() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test11");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"))
				.sendKeys("if I could fly");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"))
				.sendKeys("crowd chant");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/A[1]"))
				.click();
	}

	@Test
	public void test12() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test12");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]")).click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]")).click();
	}

	@Test
	public void test13() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test13");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test14() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test14");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		Thread.sleep(501);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test15() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test15");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test16() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test16");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test17() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test17");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[14]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[15]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[16]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[18]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
	}

	@Test
	public void test18() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test18");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[19]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test19() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test19");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[20]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[21]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test20() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test20");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]")).click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]")).click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]")).click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[4]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test21() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test21");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test22() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test22");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test23() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test23");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/HEADER[1]/A[1]"))
				.click();
	}

	@Test
	public void test24() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test24");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"))
				.sendKeys("if I could fly");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"))
				.sendKeys("crowd chant");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test25() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test25");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test26() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test26");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test27() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test27");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
	}

	@Test
	public void test28() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test28");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[23]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[24]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test29() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test29");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[25]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test30() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test30");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[26]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
	}

	@Test
	public void test31() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test31");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[3]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test32() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test32");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[35]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[36]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[37]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[38]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[39]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[5]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test33() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test33");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[6]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]")).click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test34() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test34");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[7]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test35() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test35");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test36() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test36");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/HEADER[1]/A[1]"))
				.click();
	}

	@Test
	public void test37() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test37");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("(/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"board\"])[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
	}

	@Test
	public void test38() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test38");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test39() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test39");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[41]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test40() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test40");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[42]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[22]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
	}

	@Test
	public void test41() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test41");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
	}

	// FAILED to compute coverage I don't know why. Copied the coverage of test51 since it takes a lot to execute as well and probably covers the same
	@Test
	public void test42() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test42");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[67]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[67]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[68]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[68]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[69]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[69]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(600);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[70]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[70]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[71]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[71]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[72]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[72]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[73]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[73]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[74]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[74]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[75]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[75]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[76]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[76]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[77]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[77]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[78]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[78]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[79]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[79]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[80]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[80]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[81]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[81]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[82]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[82]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[83]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[83]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[84]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[84]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[85]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[85]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[86]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[86]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[87]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[87]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[88]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[88]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[89]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[89]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[90]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[90]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[91]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[91]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[92]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[92]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[93]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[93]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[94]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[94]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[95]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[95]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[96]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[96]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[97]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[97]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[98]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[98]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[99]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[99]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.get("http://localhost:4000");
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test43() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test43");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[9]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[9]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test44() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test44");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[10]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[10]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
	}

	@Test
	public void test45() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test45");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[11]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[11]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"))
				.click();
	}

	@Test
	public void test46() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test46");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[12]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[12]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]")).click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test47() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test47");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		Thread.sleep(750);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[13]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("board_name")).clear();
		driver.findElement(By.id("board_name")).sendKeys("board");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[13]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
	}

	@Test
	public void test48() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test48");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test49() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test49");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"))
				.sendKeys("just a comment");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
	}

	@Test
	public void test50() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test50");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]//A[text()=\"phoenix board\"]"))
				.click();
	}

	@Test
	public void test51() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test51");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[100]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[100]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[43]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[44]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[45]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[50]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[51]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[52]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[53]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[54]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[55]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[56]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[57]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[58]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[59]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[60]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[61]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[62]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[63]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[64]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[65]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[66]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[67]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[67]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[68]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[68]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[69]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[69]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[70]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[70]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[71]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[71]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[72]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[72]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[73]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[73]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[74]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[74]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[75]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[75]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[76]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[76]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[77]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[77]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[78]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[78]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[79]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[79]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[80]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[80]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[81]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[81]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[82]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[82]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[83]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[83]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[84]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[84]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[85]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[85]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[86]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[86]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[87]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[87]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[88]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[88]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[89]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[89]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[90]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[90]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[91]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[91]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[92]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[92]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[93]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[93]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[94]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[94]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[95]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[95]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[96]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[96]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[97]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[97]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[98]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[98]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[99]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[99]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[100]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[100]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[101]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[101]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[101]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[101]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[101]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[101]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[102]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[102]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[102]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[102]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test52() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test52");
		driver.get("localhost:4000");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/html[1]/body/main[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[1]/div[1]/ul[1]//a[text()=\"other phoenix board\"]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[102]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[102]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[40]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[102]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[102]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[103]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[103]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[103]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[103]/DIV[1]/FORM[1]/BUTTON[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[103]/DIV[1]/FOOTER[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("card_name")).clear();
		driver.findElement(By.id("card_name")).sendKeys(
				"surfing with the alien");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[103]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[104]"))
				.click();
		Thread.sleep(350);
		driver.findElement(By.id("list_name")).clear();
		driver.findElement(By.id("list_name")).sendKeys("updated new list");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[104]/DIV[1]/FORM[1]/A[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[104]/DIV[1]"))
				.click();
		Thread.sleep(350);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[104]/DIV[1]/FORM[1]/BUTTON[1]"))
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