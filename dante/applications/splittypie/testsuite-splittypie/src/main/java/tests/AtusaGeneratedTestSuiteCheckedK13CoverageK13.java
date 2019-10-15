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

public class AtusaGeneratedTestSuiteCheckedK13CoverageK13 {

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
		Thread.sleep(2000);
	}

	@Test
	public void test00() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test00");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state171 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test01() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test01");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state131:state131->state218
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test02() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test02");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state66:state66->state67 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
	}

	@Test
	public void test03() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test03");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state15:state15->state75 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
	}

	@Test
	public void test04() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test04");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state39:state39->state50:
		 * state50->state266
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test05() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test05");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state171 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test06() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test06");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state31:state31->state15:state15->state142
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test07() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test07");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state31:state31->state51:state51->state280
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test08() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test08");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state21:state21->state43:state43->state48:
		 * state48->state91:state91->state270
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test09() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test09");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state23:state23->state68:state68->state48:
		 * state48->state91:state91->state270
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("grgtozQu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("grgtozQu");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("bkQOvkxr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("bkQOvkxr");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("jGBggOPt");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("jGBggOPt");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state43:state43->state79 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test11() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test11");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state31:state31->state51:state51->state280
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test12() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test12");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state66:state66->state67 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
	}

	@Test
	public void test13() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test13");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state39:state39->state50:
		 * state50->state51:state51->state280
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state155 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test15() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test15");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state15:state15->state75 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
	}

	@Test
	public void test16() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test16");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state155 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test17() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test17");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state39:state39->state48:
		 * state48->state67
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
	public void test18() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test18");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state23:state23->state27:state27->state60 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[1]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("grgtozQu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("grgtozQu");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("bkQOvkxr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("bkQOvkxr");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("jGBggOPt");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("jGBggOPt");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[2]/DIV[1]/DIV[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
	}

	@Test
	public void test19() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test19");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state29:state29->state62 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("SHSnBvIC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("SHSnBvIC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("WzxFilIx");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("WzxFilIx");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cYQLPBlH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cYQLPBlH");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
	}

	@Test
	public void test20() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test20");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state29:state29->state66:state66->state67 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("SHSnBvIC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("SHSnBvIC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("WzxFilIx");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("WzxFilIx");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cYQLPBlH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cYQLPBlH");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
	}

	@Test
	public void test21() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test21");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state29:state29->state116:state116->state75
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("SHSnBvIC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("SHSnBvIC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("WzxFilIx");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("WzxFilIx");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cYQLPBlH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cYQLPBlH");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
	}

	@Test
	public void test22() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test22");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state15:state15->state171 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test23() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test23");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state127:state127->state131
		 * :state131->state218
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test24() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test24");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state15:state15->state171 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test25() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test25");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state21:state21->state66:state66->state202
		 * :state202->state67
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state21:state21->state43:state43->state50:
		 * state50->state266
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test27() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test27");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state39:state39->state48:
		 * state48->state91:state91->state270
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test28() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test28");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state27:state27->state43:state43->state48:
		 * state48->state91:state91->state270
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("MaVcOAkY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("MaVcOAkY");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("PsBROusy");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("PsBROusy");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("QACzjkDb");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("QACzjkDb");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test29() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test29");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state21:state21->state43:state43->state48:
		 * state48->state91:state91->state270
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
		codeCoverage.setTestCaseNameBeingExecuted("test30");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state29:state29->state62 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("SHSnBvIC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("SHSnBvIC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("WzxFilIx");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("WzxFilIx");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cYQLPBlH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cYQLPBlH");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
	}

	@Test
	public void test31() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test31");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state27:state27->state43:state43->state50:
		 * state50->state266
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("MaVcOAkY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("MaVcOAkY");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("PsBROusy");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("PsBROusy");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("QACzjkDb");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("QACzjkDb");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test32() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test32");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state39:state39->state50:
		 * state50->state266
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test33() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test33");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state29:state29->state66:state66->state202
		 * :state202->state67
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("SHSnBvIC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("SHSnBvIC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("WzxFilIx");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("WzxFilIx");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cYQLPBlH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cYQLPBlH");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
	public void test34() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test34");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state31:state31->state21:state21->state142
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test35() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test35");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state31:state31->state21:state21->state155
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test36() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test36");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state15:state15->state142 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test37() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test37");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state15:state15->state142 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test38() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test38");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state31:state31->state60 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
	}

	@Test
	public void test39() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test39");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state31:state31->state60 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
	}

	@Test
	public void test40() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test40");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state31:state31->state79 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test41() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test41");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state31:state31->state15:state15->state171
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test42() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test42");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state27:state27->state60 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("MaVcOAkY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("MaVcOAkY");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("PsBROusy");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("PsBROusy");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("QACzjkDb");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("QACzjkDb");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
	}

	@Test
	public void test43() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test43");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state21:state21->state43:state43->state48:
		 * state48->state67
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
	public void test44() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test44");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state31:state31->state15:state15->state131
		 * :state131->state218
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test45() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test45");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state29:state29->state66:state66->state67 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("SHSnBvIC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("SHSnBvIC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("WzxFilIx");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("WzxFilIx");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cYQLPBlH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cYQLPBlH");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
	}

	@Test
	public void test46() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test46");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state31:state31->state79 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test47() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test47");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state27:state27->state60 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("MaVcOAkY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("MaVcOAkY");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("PsBROusy");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("PsBROusy");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("QACzjkDb");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("QACzjkDb");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
	}

	@Test
	public void test48() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test48");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state31:state31->state21:state21->state171
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Euro (EUR)");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("kUEiIJLQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cxrRyfAv");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cxrRyfAv");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RMgVOjqp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RMgVOjqp");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test49() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test49");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state142 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test50() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test50");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/* path: index->state5:state5->state21:state21->state142 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	}

	@Test
	public void test51() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test51");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state39:state39->state48:
		 * state48->state91:state91->state270
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[1]/P[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test52() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test52");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state21:state21->state43:state43->state50:
		 * state50->state266
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rIELzoeB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rIELzoeB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("GMTRubvo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("GMTRubvo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("DNlXLjYe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("DNlXLjYe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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
	public void test53() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test53");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		/*
		 * path:
		 * index->state5:state5->state15:state15->state131:state131->state218
		 */
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("MWerTqrB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("MWerTqrB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("xOecSHlV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("xOecSHlV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XWSutkTq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XWSutkTq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Euro (EUR)");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Euro (EUR)");
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
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