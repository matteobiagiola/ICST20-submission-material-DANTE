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

public class AtusaGeneratedTestSuiteFiredK2 {

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
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test01() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test02() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test03() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements8.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test04() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test05() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test06() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test07() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test08() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test09() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[2]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test10() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test11() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[2]"));
		if (elements6.size() > 0) {
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test12() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[16]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements8.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements9 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements9.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements9.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test13() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_total"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("transaction");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("20");
				}
				inputElements2.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements8.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements9 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements9.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements9.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test14() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements6.size() > 0) {
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements7.size() > 0) {
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test15() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[3]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_email"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test16() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_total"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("transaction");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("20");
				}
				inputElements2.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements8.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements9 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements9.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements9.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test17() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test18() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test19() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test20() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test21() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test22() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[3]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_email"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test23() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[4]"));
		if (elements6.size() > 0) {
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test24() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[186]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test25() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test26() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements8.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test27() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test28() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[16]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements8.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements9 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements9.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements9.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test29() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test30() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("input_total"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("5000");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("5000");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements8.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test31() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[4]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test32() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1]"));
		if (elements6.size() > 0) {
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test33() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test34() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test35() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
		if (elements5.size() > 0) {
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements6.size() > 0) {
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test36() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements2.size() > 0) {
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements4.size() > 0) {
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test37() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"));
		if (elements0.size() > 0) {
			try {
				elements0.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_username"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("adminadmin");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("adminadmin");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements1.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("input_login"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_email"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("foo@bar.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("foo@bar.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("foobar123");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("foobar123");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements2.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements3.size() > 0) {
			try {
				elements3.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Yours");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Yours");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("input_currency"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("United States Dollar");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("United States Dollar");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements4.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("add_transaction_text"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("transaction");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("transaction");
				}
				inputElements0.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By
					.id("add_transaction_amount"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("20");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("20");
				}
				inputElements1.get(0).sendKeys(Keys.ENTER);
			} else {
				throw new RuntimeException("Input element not found");
			}
			try {
				elements5.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements6 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[1]/A[1]"));
		if (elements6.size() > 0) {
			try {
				elements6.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements7 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2]"));
		if (elements7.size() > 0) {
			try {
				elements7.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements8 = driver
				.findElements(By
						.xpath(" //DIV[@class=\"page_holder\"]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements8.size() > 0) {
			try {
				elements8.get(0).click();
				Thread.sleep(2000);
			} catch (Exception ex) {
				System.out.println(" WARNING: exception - message "
						+ ex.getMessage() + " cause " + ex.getCause());
			}
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}