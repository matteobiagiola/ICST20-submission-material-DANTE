package tests;

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

public class GeneratedTestSuiteCheckedCoverageOld {

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

		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(75);
		driver.get("http://localhost:3000/petclinic/owners");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(75);
		driver.get("http://localhost:3000/petclinic/owners/2");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
	}

	@Test
	public void test01() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test01");

		driver.get("http://localhost:3000/petclinic/owners/add");
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(75);
		driver.get("http://localhost:3000/petclinic/owners/2");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(75);
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("gMANLURQ");
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("ZcufOhQs");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("WvCHtszR");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("ulaKUfuw");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("AFZygLRe");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
				.click();
		Thread.sleep(75);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("uWVxYsLc");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("dxyQxZNw");
		driver.findElement(By.id("type")).sendKeys("dog ");
		driver.findElement(By.id("type")).sendKeys("dog ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("UBGAkaub");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("xUGlmgHa");
		driver.findElement(By.id("type")).sendKeys("bird ");
		driver.findElement(By.id("type")).sendKeys("bird ");
		driver.findElement(
				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(75);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("zeRABVFk");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("MgjCRoRb");
		driver.findElement(By.id("type")).sendKeys("bird ");
		driver.findElement(By.id("type")).sendKeys("bird ");
		driver.findElement(
				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}
//
//	@Test
//	public void test02() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test02");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/3");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("uDpBrLtS");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("WAESlayS");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test03() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test03");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("KhJypbUt");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("NLqkexKG");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("zFAdLvqV");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("TEASvPXw");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("nSMSSigG");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("gbgrJZcW");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("hILwviwE");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test04() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test04");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test05() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test05");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test06() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test06");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("kKxKQttu");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("AeQboXEk");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test07() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test07");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mpbIpgjw");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("mLLntSnC");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("UktrRLtV");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("HmDPHiBL");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ACaszfoK");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test08() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test08");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/3");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[2]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test09() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test09");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("HRuDBFoY");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("KyFqhHOY");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("IKVrZSLL");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("pbJOfUNo");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("fTTsTdRF");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("bpObeYsm");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("aRVCtaDe");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test10() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test10");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("LFJPXLkO");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("szXOFreZ");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("JNdCfpnr");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("dPDhwttV");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("LwHOpHRD");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("UQmWmKwc");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("EkJZXtSd");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("LQBriRZU");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("ebzyVHuM");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("nqULWAoo");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test11() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test11");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("arGYXSXd");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("nwKzKrWS");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test12() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test12");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("uWVxYsLc");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("dxyQxZNw");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("CWdlCQKZ");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("LMgMGmlS");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("cJYhOjgl");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("PoHYNTxa");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("jlQkJwDj");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("DADEGMOO");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("hBQfbLqH");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("UwLClxBL");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test13() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test13");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("uWVxYsLc");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("dxyQxZNw");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("UBGAkaub");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("xUGlmgHa");
//		driver.findElement(By.id("type")).sendKeys("bird ");
//		driver.findElement(By.id("type")).sendKeys("bird ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("wGGHfBSB");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("YwWYVymN");
//		driver.findElement(By.id("type")).sendKeys("lizard ");
//		driver.findElement(By.id("type")).sendKeys("lizard ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("rTxFhupY");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("OEQGNdvH");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test14() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test14");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/4");
//	}
//
//	@Test
//	public void test15() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test15");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/3");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test16() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test16");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/3");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("QuRaCcst");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("xvDnQzXl");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test17() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test17");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("kcbaMUJp");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("YTfniUqJ");
//		driver.findElement(By.id("type")).sendKeys("lizard ");
//		driver.findElement(By.id("type")).sendKeys("lizard ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test18() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test18");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("OUGPcJAv");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("YmnvWwJS");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("mGNLyCRJ");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("ppapRvZr");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("KQRiMfpE");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("kgiGDUpW");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("SescPbza");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("BZAyRLUL");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("FHcpVSvp");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("GDudUBOb");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test19() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test19");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("vMbCeNlV");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("dVDwAWnZ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test20() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test20");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//	}
//
//	@Test
//	public void test21() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test21");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/3");
//	}
//
//	@Test
//	public void test22() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test22");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("tanxGzZo");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("bTZcdSPJ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("lwwcMmpJ");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("QcNqNaEB");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test23() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test23");
//
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test24() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test24");
//
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("MLJlcxIS");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("xwIRXoOo");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test25() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test25");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/4");
//	}
//
//	@Test
//	public void test26() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test26");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("FNQJMAPp");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("OnSmVDOA");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test27() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test27");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("HoCAeVrq");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("fIBruITf");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("tNAihqnN");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("TTumyfCy");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("exVCIMed");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("rDvwQqYL");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("mNhLJYZI");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("QSZLayja");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("BEnNnZOa");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("rzhCLYtJ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test28() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test28");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("pHNxhkXu");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("ZlMsyCKh");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test29() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test29");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("LFJPXLkO");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("szXOFreZ");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("JNdCfpnr");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("dPDhwttV");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("LwHOpHRD");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("WPCVcUbB");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("WsXHbwzP");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("bVRiLOnz");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("gKxHzXBJ");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("AMUNEzTG");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test30() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test30");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("FitPhyjh");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("QoYbGxcP");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test31() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test31");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("uWVxYsLc");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("dxyQxZNw");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("xlZxfIXC");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("qdPlMEXY");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("pMhLwACy");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("pToyqrfK");
//		driver.findElement(By.id("type")).sendKeys("lizard ");
//		driver.findElement(By.id("type")).sendKeys("lizard ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//	}
//
//	@Test
//	public void test32() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test32");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("uWVxYsLc");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("dxyQxZNw");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(By.id("type")).sendKeys("dog ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("UBGAkaub");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("xUGlmgHa");
//		driver.findElement(By.id("type")).sendKeys("bird ");
//		driver.findElement(By.id("type")).sendKeys("bird ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("DGWbSPri");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("sAAmzKgd");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(By.id("type")).sendKeys("cat ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("JOlQGAbi");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("uzeGmUyW");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(By.id("type")).sendKeys("hamster ");
//		driver.findElement(
//				By.xpath("//MAT-CALENDAR[@id = 'mat-datepicker-0']/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3]"))
//				.click();
//	}
//
//	@Test
//	public void test33() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test33");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/5");
//	}
//
//	@Test
//	public void test34() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test34");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/3");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("fTNPtfDb");
//		driver.findElement(By.name("birthDate")).clear();
//		driver.findElement(By.name("birthDate")).sendKeys("ZVBOjBlW");
//		driver.findElement(By.id("type")).sendKeys("bird ");
//		driver.findElement(By.id("type")).sendKeys("bird ");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test35() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test35");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DL[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test36() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test36");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/4");
//	}
//
//	@Test
//	public void test37() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test37");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("CzEDoPLv");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test38() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test38");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("xGGXZlKl");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("rIteTPIU");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test39() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test39");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("tanxGzZo");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("bTZcdSPJ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test40() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test40");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("tanxGzZo");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("bTZcdSPJ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("SHyRDckj");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("eFxXqrsw");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test41() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test41");
//
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test42() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test42");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/5");
//	}
//
//	@Test
//	public void test43() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test43");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//	}
//
//	@Test
//	public void test44() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test44");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//		Thread.sleep(75);
//
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/6");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/TABLE[2]/TBODY[1]/TR[1]/APP-PET-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/APP-VISIT-LIST[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.name("date")).clear();
//		driver.findElement(By.name("date")).sendKeys("uWCdsbsj");
//		driver.findElement(By.id("description")).clear();
//		driver.findElement(By.id("description")).sendKeys("lwFbHzbA");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'visit']/DIV[1]/DIV[1]/DIV[1]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test45() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test45");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
//				.click();
//	}
//
//	@Test
//	public void test46() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test46");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/5");
//	}
//
//	@Test
//	public void test47() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test47");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("vFJBjvJp");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test48() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test48");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test49() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test49");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("HWyuSAbu");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test50() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test50");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("tanxGzZo");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("bTZcdSPJ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test51() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test51");
//
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test52() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test52");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/6");
//	}
//
//	@Test
//	public void test53() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test53");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/7");
//	}
//
//	@Test
//	public void test54() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test54");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/6");
//	}
//
//	@Test
//	public void test55() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test55");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/6");
//		Thread.sleep(1000);
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/6");
//		Thread.sleep(1000);
//
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/6");
//	}
//
//	@Test
//	public void test56() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test56");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test57() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test57");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("oFnFgfhh");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test58() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test58");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test59() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test59");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("tanxGzZo");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("bTZcdSPJ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test60() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test60");
//
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[3]/TD[3]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test61() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test61");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/7");
//	}
//
//	@Test
//	public void test62() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test62");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/8");
//	}
//
//	@Test
//	public void test63() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test63");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/7");
//	}
//
//	@Test
//	public void test64() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test64");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test65() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test65");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test66() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test66");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("tanxGzZo");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("bTZcdSPJ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[3]/TD[3]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test67() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test67");
//
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[3]/TD[3]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test68() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test68");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/8");
//	}
//
//	@Test
//	public void test69() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test69");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/9");
//	}
//
//	@Test
//	public void test70() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test70");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/8");
//	}
//
//	@Test
//	public void test71() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test71");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test72() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test72");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test73() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test73");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("tanxGzZo");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("bTZcdSPJ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test74() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test74");
//
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test75() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test75");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/9");
//	}
//
//	@Test
//	public void test76() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test76");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/10");
//	}
//
//	@Test
//	public void test77() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test77");
//
//		driver.get("http://localhost:3000/petclinic/owners");
//		Thread.sleep(1000);
//		driver.get("http://localhost:3000/petclinic/owners/2");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.get("http://localhost:3000/petclinic/owners/9");
//	}
//
//	@Test
//	public void test78() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test78");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test79() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test79");
//
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
//				.click();
//	}
//
//	@Test
//	public void test80() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test80");
//
//		driver.get("http://localhost:3000/petclinic/vets/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("tanxGzZo");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("bTZcdSPJ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(By.id("specialties")).sendKeys(" radiology ");
//		driver.findElement(
//				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
//				.click();
//		Thread.sleep(75);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test81() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test81");
//
//		driver.get("http://localhost:3000/petclinic/vets");
//		Thread.sleep(1000);
//		driver.findElement(
//				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
//				.click();
//	}
//
//	@Test
//	public void test82() throws Exception {
//		codeCoverage.setTestCaseNameBeingExecuted("test82");
//
//		driver.get("http://localhost:3000/petclinic/owners/add");
//		Thread.sleep(1000);
//		driver.findElement(By.id("firstName")).clear();
//		driver.findElement(By.id("firstName")).sendKeys("mNHEJfUT");
//		driver.findElement(By.id("lastName")).clear();
//		driver.findElement(By.id("lastName")).sendKeys("OUFKPXVx");
//		driver.findElement(By.id("address")).clear();
//		driver.findElement(By.id("address")).sendKeys("GqvDjDap");
//		driver.findElement(By.id("city")).clear();
//		driver.findElement(By.id("city")).sendKeys("nkiMrnQG");
//		driver.findElement(By.id("telephone")).clear();
//		driver.findElement(By.id("telephone")).sendKeys("ksWhxuch");
//		driver.findElement(
//				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
//				.click();
//	}

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