package tests;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import utils.DriverProvider;
import utils.Properties;
import utils.BasePageObject;

public class GeneratedTestSuiteFired {

	private static WebDriver driver;
	private static BasePageObject basePageObject;

	@BeforeClass
	public static void oneTimeSetUp() throws Exception {
		driver = DriverProvider.getInstance().getDriver();
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		basePageObject = new BasePageObject(driver);
	}

	@Before
	public void setUp() throws Exception {
		driver.get(Properties.app_url);
		Thread.sleep(1001);
	}

	@Test
	public void test000() throws Exception {
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
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
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
	}

	@Test
	public void test001() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test002() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Peter");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Mulligan");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("cat ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("hamster ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("bird ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("snake ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dog ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test003() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
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
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test004() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test005() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
		Thread.sleep(600);
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
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test006() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test007() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test008() throws Exception {
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
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test009() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
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
		Thread.sleep(500);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test010() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test011() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test012() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Peter");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test013() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Peter");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test014() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Mulligan");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("cat ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("hamster ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("bird ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("snake ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dog ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Mulligan");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("cat ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("hamster ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("bird ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("snake ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dog ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test015() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
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
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test016() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
	}

	@Test
	public void test017() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test018() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test019() throws Exception {
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
	public void test020() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test021() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
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
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test022() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
	}

	@Test
	public void test023() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
				By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test024() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test025() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
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
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
	}

	@Test
	public void test026() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(300);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("James");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Stevens");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test027() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test028() throws Exception {
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
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
	}

	@Test
	public void test029() throws Exception {
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
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test030() throws Exception {
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
	public void test031() throws Exception {
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
	}

	@Test
	public void test032() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
	}

	@Test
	public void test033() throws Exception {
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
	public void test034() throws Exception {
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
	}

	@Test
	public void test035() throws Exception {
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
	public void test036() throws Exception {
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
				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test037() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test038() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test039() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Mulligan");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("cat ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("hamster ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("bird ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("snake ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dog ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test040() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Peter");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test041() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Mulligan");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("cat ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("hamster ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("bird ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("snake ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dog ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test042() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Mulligan");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("cat ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("hamster ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("bird ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("snake ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dog ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Mulligan");
		driver.findElement(By.name("birthDate")).clear();
		driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("cat ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("hamster ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("bird ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("snake ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dog ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("lizard ");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test043() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
	}

	@Test
	public void test044() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("James");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Stevens");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test045() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test046() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test047() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Eduardo");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Black");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("McFarland");
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys("6085555387");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
				.click();
	}

	@Test
	public void test048() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test049() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
	}

	@Test
	public void test050() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
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
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test051() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test052() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test053() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("James");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Stevens");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test054() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("James");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Stevens");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test055() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("Linda");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Jenkins");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("dentistry");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("radiology");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
				.sendKeys("surgery");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.sendKeys("James");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.clear();
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
				.sendKeys("Stevens");
		driver.findElement(
				By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test056() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test057() throws Exception {
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
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test058() throws Exception {
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
	}

	@Test
	public void test059() throws Exception {
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
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test060() throws Exception {
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test061() throws Exception {
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
	public void test062() throws Exception {
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
	public void test063() throws Exception {
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
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
				.click();
	}

	@Test
	public void test064() throws Exception {
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
				By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(100);
		driver.findElement(
				By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
				.click();
	}

	// @Test
	// public void test065() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dog");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("snake");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test066() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test067() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test068() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Mulligan");
	// driver.findElement(By.name("birthDate")).clear();
	// driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("cat ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("hamster ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("bird ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("snake ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dog ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test069() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Peter");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test070() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Mulligan");
	// driver.findElement(By.name("birthDate")).clear();
	// driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("cat ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("hamster ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("bird ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("snake ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dog ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test071() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Mulligan");
	// driver.findElement(By.name("birthDate")).clear();
	// driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("cat ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("hamster ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("bird ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("snake ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dog ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Mulligan");
	// driver.findElement(By.name("birthDate")).clear();
	// driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("cat ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("hamster ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("bird ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("snake ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dog ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test072() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test073() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test074() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test075() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.get("http://localhost:3000");
	// Thread.sleep(1001);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.get("http://localhost:3000");
	// Thread.sleep(1001);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test076() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test077() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test078() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test079() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test080() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test081() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test082() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test083() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test084() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test085() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test086() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test087() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test088() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test089() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test090() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test091() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test092() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test093() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test094() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test095() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test096() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dog");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test097() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dog");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("snake");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test098() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test099() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test100() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Mulligan");
	// driver.findElement(By.name("birthDate")).clear();
	// driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("cat ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("hamster ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("bird ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("snake ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dog ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test101() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Peter");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test102() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Mulligan");
	// driver.findElement(By.name("birthDate")).clear();
	// driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("cat ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("hamster ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("bird ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("snake ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dog ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test103() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Mulligan");
	// driver.findElement(By.name("birthDate")).clear();
	// driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("cat ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("hamster ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("bird ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("snake ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dog ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Mulligan");
	// driver.findElement(By.name("birthDate")).clear();
	// driver.findElement(By.name("birthDate")).sendKeys("1999-08-06");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("cat ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("hamster ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("bird ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("snake ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dog ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("lizard ");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test104() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test105() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test106() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[3]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(600);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[3]/TD[3]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test107() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test108() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test109() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test110() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Eduardo");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Black");
	// driver.findElement(By.id("address")).clear();
	// driver.findElement(By.id("address")).sendKeys("105 N. Lake St.");
	// driver.findElement(By.id("city")).clear();
	// driver.findElement(By.id("city")).sendKeys("McFarland");
	// driver.findElement(By.id("telephone")).clear();
	// driver.findElement(By.id("telephone")).sendKeys("6085555387");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test111() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test112() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test113() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test114() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test115() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test116() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test117() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test118() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("Linda");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Jenkins");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"))
	// .sendKeys("surgery");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test119() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[2]/TD[3]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test120() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
	// .sendKeys("James");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"))
	// .sendKeys("Stevens");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test121() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test122() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test123() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(500);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test124() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dentistry");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("radiology");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
	// .click();
	// }
	//
	// @Test
	// public void test125() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test126() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test127() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test128() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dog");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"))
	// .click();
	// }
	//
	// @Test
	// public void test129() throws Exception {
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("dog");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("//TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"))
	// .click();
	// Thread.sleep(100);
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .clear();
	// driver.findElement(
	// By.xpath("/HTML[1]/BODY/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"))
	// .sendKeys("snake");
	// driver.findElement(
	// By.xpath("//FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"))
	// .click();
	// }

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}