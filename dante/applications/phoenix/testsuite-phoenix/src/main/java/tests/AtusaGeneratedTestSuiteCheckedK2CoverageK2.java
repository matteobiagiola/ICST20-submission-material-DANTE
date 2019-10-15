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

public class AtusaGeneratedTestSuiteCheckedK2CoverageK2 {

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
		Thread.sleep(1000);
	}

	@Test
	public void test00() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test00");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("card_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a card");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a card");
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
	}

	@Test
	public void test01() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test01");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("card_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a card");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a card");
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
	public void test02() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test02");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/HEADER[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	public void test03() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test03");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("card_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a card");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a card");
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
	}

	@Test
	public void test04() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test04");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]"));
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
	public void test05() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test05");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("card_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a card");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a card");
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
	}

	@Test
	public void test06() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test06");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("if I could fly");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("if I could fly");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("just a description");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("just a description");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("just a comment");
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
	public void test07() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test07");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
	}

	@Test
	public void test08() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test08");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	public void test09() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test09");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]"));
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
		codeCoverage.setTestCaseNameBeingExecuted("test10");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("if I could fly");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("if I could fly");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("just a description");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("just a description");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("just a comment");
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
	public void test11() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test11");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	}

	@Test
	public void test12() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test12");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	public void test13() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test13");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[2]/I[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FOOTER[1]/A[1]"));
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
	public void test14() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test14");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[2]/I[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FOOTER[1]/A[1]"));
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
	public void test15() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test15");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	}

	@Test
	public void test16() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test16");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
	}

	@Test
	public void test17() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test17");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	public void test18() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test18");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	public void test19() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test19");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]"));
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
	public void test20() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test20");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/HEADER[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	public void test21() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test21");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	}

	@Test
	public void test22() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test22");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	public void test23() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test23");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]"));
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
	public void test24() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test24");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	public void test25() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test25");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("card_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a card");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a card");
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
	public void test26() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test26");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("if I could fly");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("if I could fly");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("just a description");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("just a description");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("just a comment");
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
	public void test27() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test27");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
	}

	@Test
	public void test28() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test28");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("list_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("phantom of the opera");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("phantom of the opera");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("card_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a card");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a card");
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
	}

	@Test
	public void test29() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test29");
		driver.get(Properties.app_url);
		Thread.sleep(1000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1]"));
		if (elements0.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).clear();
				try {
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("john@phoenix-trello.com");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).clear();
				try {
					inputElements1.get(0).sendKeys("12345678");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("12345678");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1]"));
		if (elements1.size() > 0) {
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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
						.xpath(" /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/HEADER[1]/A[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("just a comment");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("just a comment");
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