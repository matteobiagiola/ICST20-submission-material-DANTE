package tests;

import java.util.concurrent.TimeUnit;
import java.util.List;

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

public class AtusaGeneratedTestSuiteChecked {

	private static WebDriver driver;
	private static BasePageObject basePageObject;

	@BeforeClass
	public static void oneTimeSetUp() throws Exception {
		driver = DriverProvider.getInstance().getDriver();
		driver.get(Properties.app_url);
		basePageObject = new BasePageObject(driver);
	}

	@Before
	public void setUp() throws Exception {
		driver.get(Properties.app_url);
		Thread.sleep(2500);
	}

	@Test
	public void test00() throws Exception {
		List<WebElement> elements0 = driver.findElements(By
				.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
			elements1.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test01() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test02() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test03() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test04() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_email"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test05() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("great plan");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_goal_balance"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("100");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_start_currency"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("United States Dollar");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("input_goal_currency"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("United States Dollar");
			}
			elements3.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test06() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test07() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			elements4.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test08() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2]"));
		if (elements4.size() > 0) {
			elements4.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test09() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements4.size() > 0) {
			elements4.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test10() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test11() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test12() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2]"));
		if (elements4.size() > 0) {
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test13() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test14() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test15() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test16() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test17() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]/DIV[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test18() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]/DIV[2]/BUTTON[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test19() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("input_currency"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("United States Dollar");
			}
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver.findElements(By
				.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			elements6.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test20() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("input_currency"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("United States Dollar");
			}
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test21() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("input_currency"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("United States Dollar");
			}
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test22() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1]"));
		if (elements6.size() > 0) {
			elements6.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test23() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[1]/A[1]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements6.size() > 0) {
			elements6.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test24() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test25() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test26() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[3]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_email"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_email"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements6.size() > 0) {
			elements6.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test27() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("500");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test28() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("500");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[5]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test29() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("500");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[13]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test30() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_total"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("500");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[22]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test31() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_total"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("500");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[35]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test32() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_total"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("500");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[48]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test33() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_amount"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("1000");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("input_description"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("description");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[6]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test34() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_amount"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("1000");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("input_description"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("description");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[16]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test35() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_amount"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("1000");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("input_description"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("description");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[16]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test36() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_amount"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("1000");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_description"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("description");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test37() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_amount"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("1000");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_description"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("description");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test38() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_amount"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("1000");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_description"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("description");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[54]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test39() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_amount"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("1000");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_description"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("description");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[54]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test40() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_amount"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("1000");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_description"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("description");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements3 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).clear();
				inputElements3.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[62]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test41() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[8]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test42() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[8]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test43() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[27]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@Test
	public void test44() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("foo@bar.com");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).clear();
				inputElements2.get(0).sendKeys("foobar123");
			}
			elements1.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements2.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("Others");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("United States Dollar");
			}
			elements4.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[4]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements6.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements7.get(0).click();
			Thread.sleep(1000);
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[27]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				inputElements0.get(0).sendKeys("transaction");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				inputElements1.get(0).sendKeys("20");
			}
			elements8.get(0).click();
			Thread.sleep(1000);
		}
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}