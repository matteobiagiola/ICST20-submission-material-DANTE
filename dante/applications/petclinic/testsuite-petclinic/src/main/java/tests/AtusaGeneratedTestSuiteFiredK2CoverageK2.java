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

public class AtusaGeneratedTestSuiteFiredK2CoverageK2 {

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
		Thread.sleep(3000);
	}

	@Test
	public void test00() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test00");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"));
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Linda");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Linda");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Leary");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Leary");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
	public void test01() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test01");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"));
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Linda");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Linda");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Leary");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Leary");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
	public void test02() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test02");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("RQktAypd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("RQktAypd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("RQktAypd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("RQktAypd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
	public void test04() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test04");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("YFPdeGmD");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("YFPdeGmD");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("xGEXtNEu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("xGEXtNEu");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("COguhzTm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("COguhzTm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("3"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("yFBsYtkm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("yFBsYtkm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("4"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("NIDaqhXe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("NIDaqhXe");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("lhkInfQi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("lhkInfQi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("hpsSffRI");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("hpsSffRI");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zeyngiXh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zeyngiXh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("EkFKUGEC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("EkFKUGEC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("fpRMFfjP");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("fpRMFfjP");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("5"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("ADyrUapY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("ADyrUapY");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("surgery");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("surgery");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("etSLbNMf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("etSLbNMf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("sDDewaGX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("sDDewaGX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zWBqgsGd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zWBqgsGd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("enJwVbRW");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("enJwVbRW");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("MBlOVleo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("MBlOVleo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("5"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("ZTitaKbR");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("ZTitaKbR");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZncmlydY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZncmlydY");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("mmpPwbBi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("mmpPwbBi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OccLlOfU");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OccLlOfU");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lTNQBgAr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lTNQBgAr");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("JhorwuUx");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("JhorwuUx");
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
	public void test05() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test05");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("FpSjENBn");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("FpSjENBn");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("RNaMepzq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("RNaMepzq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("LqCKYETe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("LqCKYETe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("UHhmApJE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("UHhmApJE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XAyRLGBf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XAyRLGBf");
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
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("pRhgsXHC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("pRhgsXHC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("FWIdIvRp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("FWIdIvRp");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cugHbBMj");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cugHbBMj");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("gUqPGVLr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("gUqPGVLr");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("bird");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("bird");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("oxNOBeSz");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("oxNOBeSz");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("tSvlHqiY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("tSvlHqiY");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("UACguMqB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("UACguMqB");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("YFPdeGmD");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("YFPdeGmD");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("xGEXtNEu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("xGEXtNEu");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("COguhzTm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("COguhzTm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("3"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("yFBsYtkm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("yFBsYtkm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("4"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("NIDaqhXe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("NIDaqhXe");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("lhkInfQi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("lhkInfQi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("hpsSffRI");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("hpsSffRI");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zeyngiXh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zeyngiXh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("EkFKUGEC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("EkFKUGEC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("fpRMFfjP");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("fpRMFfjP");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("5"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("ADyrUapY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("ADyrUapY");
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
		List<WebElement> elements5 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("surgery");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("surgery");
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
	public void test08() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test08");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"));
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Linda");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Linda");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Leary");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Leary");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"));
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Linda");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Linda");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Leary");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Leary");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"));
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
	public void test10() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test10");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("pRhgsXHC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("pRhgsXHC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("FWIdIvRp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("FWIdIvRp");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cugHbBMj");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cugHbBMj");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("gUqPGVLr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("gUqPGVLr");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("bird");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("bird");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("fPscyZkp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("fPscyZkp");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("qmXyKuLK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("qmXyKuLK");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("aSkIqUcu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("aSkIqUcu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ldimPfNE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ldimPfNE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("eUWylVxd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("eUWylVxd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OnFZXYBL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OnFZXYBL");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("IbnJPAPL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("IbnJPAPL");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("nrpPUEfX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("nrpPUEfX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("SrUHEhyO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("SrUHEhyO");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ETzcAJEq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ETzcAJEq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("rfdgcXDJ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("rfdgcXDJ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("KvJqjcZE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("KvJqjcZE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("KlKbSeOX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("KlKbSeOX");
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
		List<WebElement> elements6 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("surgery");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("surgery");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("JBnwlvsX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("JBnwlvsX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("ntzDNBZr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("ntzDNBZr");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("aCkOLeuQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("aCkOLeuQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("fIpSAxnT");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("fIpSAxnT");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"));
		if (elements8.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("llPwCaSb");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("llPwCaSb");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("cTXXlsHV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("cTXXlsHV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cTQOXYyt");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cTQOXYyt");
				}
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
	public void test12() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test12");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	}

	@Test
	public void test13() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test13");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("YFPdeGmD");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("YFPdeGmD");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("xGEXtNEu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("xGEXtNEu");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("COguhzTm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("COguhzTm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("3"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("yFBsYtkm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("yFBsYtkm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("4"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("NIDaqhXe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("NIDaqhXe");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("lhkInfQi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("lhkInfQi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("hpsSffRI");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("hpsSffRI");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zeyngiXh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zeyngiXh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("EkFKUGEC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("EkFKUGEC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("fpRMFfjP");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("fpRMFfjP");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("5"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("ADyrUapY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("ADyrUapY");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("surgery");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("surgery");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("etSLbNMf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("etSLbNMf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("sDDewaGX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("sDDewaGX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zWBqgsGd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zWBqgsGd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("enJwVbRW");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("enJwVbRW");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("MBlOVleo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("MBlOVleo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("5"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("ZTitaKbR");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("ZTitaKbR");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("dKiCmkVg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("dKiCmkVg");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("LAFdEtwk");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("LAFdEtwk");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("gdCmebro");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("gdCmebro");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cZvCyirB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cZvCyirB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("CmxUKeWi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("CmxUKeWi");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("XEFkfEdR");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("XEFkfEdR");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("lUdInSMo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("lUdInSMo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("nOiiSUOR");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("nOiiSUOR");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("nvUqvmjL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("nvUqvmjL");
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
	public void test14() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test14");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test15() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test15");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	}

	@Test
	public void test16() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test16");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test17() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test17");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"));
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Linda");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Linda");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Leary");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Leary");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("zNcHNPMu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("zNcHNPMu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ldimPfNE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ldimPfNE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("eUWylVxd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("eUWylVxd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OnFZXYBL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OnFZXYBL");
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ADiQFYjF");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ADiQFYjF");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("radiology");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("OmvJRNvK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("OmvJRNvK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("XmoBZqQi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("XmoBZqQi");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("SJRJFhGX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("SJRJFhGX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("VavRGnBE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("VavRGnBE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("xboaSsRR");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("xboaSsRR");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("radiology");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("VgcJBVhb");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("VgcJBVhb");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("BJhqKAML");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("BJhqKAML");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zFJEYukw");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zFJEYukw");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RAFkWaNe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RAFkWaNe");
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
	public void test20() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test20");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("wCBHQaYk");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("wCBHQaYk");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZncmlydY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZncmlydY");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("mmpPwbBi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("mmpPwbBi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OccLlOfU");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OccLlOfU");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lTNQBgAr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lTNQBgAr");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("JhorwuUx");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("JhorwuUx");
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
	}

	@Test
	public void test22() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test22");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("pRhgsXHC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("pRhgsXHC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("FWIdIvRp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("FWIdIvRp");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cugHbBMj");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cugHbBMj");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("gUqPGVLr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("gUqPGVLr");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("bird");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("bird");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("laUddovi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("laUddovi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("ilAQcrZg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("ilAQcrZg");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("WJSHyAel");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("WJSHyAel");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("LqCKYETe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("LqCKYETe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("UHhmApJE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("UHhmApJE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XAyRLGBf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XAyRLGBf");
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
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("pRhgsXHC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("pRhgsXHC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("FWIdIvRp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("FWIdIvRp");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cugHbBMj");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cugHbBMj");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("gUqPGVLr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("gUqPGVLr");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("bird");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("bird");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("laUddovi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("laUddovi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("ilAQcrZg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("ilAQcrZg");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("WJSHyAel");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("WJSHyAel");
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
	public void test24() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test24");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("YFPdeGmD");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("YFPdeGmD");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("xGEXtNEu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("xGEXtNEu");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("COguhzTm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("COguhzTm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("3"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("yFBsYtkm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("yFBsYtkm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("4"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("NIDaqhXe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("NIDaqhXe");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("lhkInfQi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("lhkInfQi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("hpsSffRI");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("hpsSffRI");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zeyngiXh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zeyngiXh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("EkFKUGEC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("EkFKUGEC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("fpRMFfjP");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("fpRMFfjP");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("5"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("ADyrUapY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("ADyrUapY");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("surgery");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("surgery");
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
	public void test25() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test25");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("dKiCmkVg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("dKiCmkVg");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("LAFdEtwk");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("LAFdEtwk");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("gdCmebro");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("gdCmebro");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cZvCyirB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cZvCyirB");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("CmxUKeWi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("CmxUKeWi");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("XEFkfEdR");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("XEFkfEdR");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("lUdInSMo");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("lUdInSMo");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("nOiiSUOR");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("nOiiSUOR");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("nvUqvmjL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("nvUqvmjL");
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
	public void test26() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test26");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("zNcHNPMu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("zNcHNPMu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	public void test27() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test27");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("FpSjENBn");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("FpSjENBn");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ncuqisud");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ncuqisud");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("zNcHNPMu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("zNcHNPMu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("RlNYwEDE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("RlNYwEDE");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	public void test29() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test29");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test30() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test30");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test31() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test31");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
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
	}

	@Test
	public void test32() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test32");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test33() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test33");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
	}

	@Test
	public void test34() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test34");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("pRhgsXHC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("pRhgsXHC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("FWIdIvRp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("FWIdIvRp");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cugHbBMj");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cugHbBMj");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("gUqPGVLr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("gUqPGVLr");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("bird");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("bird");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("oxNOBeSz");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("oxNOBeSz");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("tSvlHqiY");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("tSvlHqiY");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("UACguMqB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("UACguMqB");
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
	public void test35() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test35");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Sharon");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Sharon");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Ortega");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Ortega");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dentistry");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dentistry");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	}

	@Test
	public void test37() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test37");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test38() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test38");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Sharon");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Sharon");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Ortega");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Ortega");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dentistry");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dentistry");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
	public void test39() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test39");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ewZoPltz");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ewZoPltz");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("BbCiBqch");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("BbCiBqch");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("bird");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("bird");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("tgnVjGLG");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("tgnVjGLG");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("nnQfhLyO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("nnQfhLyO");
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
	public void test40() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test40");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("aSkIqUcu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("aSkIqUcu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ldimPfNE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ldimPfNE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("eUWylVxd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("eUWylVxd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OnFZXYBL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OnFZXYBL");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ADiQFYjF");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ADiQFYjF");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("radiology");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("OmvJRNvK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("OmvJRNvK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("XmoBZqQi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("XmoBZqQi");
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
	public void test41() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test41");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ewZoPltz");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ewZoPltz");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("BbCiBqch");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("BbCiBqch");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("bird");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("bird");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("fPscyZkp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("fPscyZkp");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("qmXyKuLK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("qmXyKuLK");
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
	public void test42() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test42");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test43() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test43");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test44() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test44");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"));
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Linda");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Linda");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Leary");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Leary");
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
	public void test45() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test45");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("zNcHNPMu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("zNcHNPMu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ldimPfNE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ldimPfNE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("eUWylVxd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("eUWylVxd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OnFZXYBL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OnFZXYBL");
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("IbnJPAPL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("IbnJPAPL");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("nrpPUEfX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("nrpPUEfX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("SrUHEhyO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("SrUHEhyO");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ETzcAJEq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ETzcAJEq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("rfdgcXDJ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("rfdgcXDJ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("KvJqjcZE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("KvJqjcZE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("KlKbSeOX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("KlKbSeOX");
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
		List<WebElement> elements5 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("surgery");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("surgery");
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
	public void test46() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test46");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("SJRJFhGX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("SJRJFhGX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("VavRGnBE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("VavRGnBE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("xboaSsRR");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("xboaSsRR");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("radiology");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("VgcJBVhb");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("VgcJBVhb");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("BJhqKAML");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("BJhqKAML");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zFJEYukw");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zFJEYukw");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("RAFkWaNe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("RAFkWaNe");
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
	public void test47() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test47");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test48() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test48");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test49() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test49");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	}

	@Test
	public void test50() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test50");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test51() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test51");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Sharon");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Sharon");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Ortega");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Ortega");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dentistry");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dentistry");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
	public void test52() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test52");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("zNcHNPMu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("zNcHNPMu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ldimPfNE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ldimPfNE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("eUWylVxd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("eUWylVxd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OnFZXYBL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OnFZXYBL");
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("IbnJPAPL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("IbnJPAPL");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("nrpPUEfX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("nrpPUEfX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("SrUHEhyO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("SrUHEhyO");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ETzcAJEq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ETzcAJEq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("rfdgcXDJ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("rfdgcXDJ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("KvJqjcZE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("KvJqjcZE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("KlKbSeOX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("KlKbSeOX");
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
		List<WebElement> elements5 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("surgery");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("surgery");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("JBnwlvsX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("JBnwlvsX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("ntzDNBZr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("ntzDNBZr");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("aCkOLeuQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("aCkOLeuQ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("fIpSAxnT");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("fIpSAxnT");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1]"));
		if (elements7.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("llPwCaSb");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("llPwCaSb");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("cTXXlsHV");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("cTXXlsHV");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cTQOXYyt");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cTQOXYyt");
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
	public void test53() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test53");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZoaGElRK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZoaGElRK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
	public void test54() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test54");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Sharon");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Sharon");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Ortega");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Ortega");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dentistry");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dentistry");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
	public void test55() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test55");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("McTavish");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("McTavish");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test56() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test56");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("aSkIqUcu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("aSkIqUcu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ldimPfNE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ldimPfNE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("eUWylVxd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("eUWylVxd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OnFZXYBL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OnFZXYBL");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("IbnJPAPL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("IbnJPAPL");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("nrpPUEfX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("nrpPUEfX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("SrUHEhyO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("SrUHEhyO");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("YsZzaypi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("YsZzaypi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("JoBsxmzy");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("JoBsxmzy");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("eYbijwqg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("eYbijwqg");
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
	public void test57() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test57");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("aSkIqUcu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("aSkIqUcu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ldimPfNE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ldimPfNE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("eUWylVxd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("eUWylVxd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OnFZXYBL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OnFZXYBL");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("IbnJPAPL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("IbnJPAPL");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("nrpPUEfX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("nrpPUEfX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("SrUHEhyO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("SrUHEhyO");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ETzcAJEq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ETzcAJEq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("rfdgcXDJ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("rfdgcXDJ");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("KvJqjcZE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("KvJqjcZE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("KlKbSeOX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("KlKbSeOX");
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
		List<WebElement> elements6 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2]"));
		if (elements6.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("surgery");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("surgery");
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
	public void test58() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test58");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Sharon");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Sharon");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Ortega");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Ortega");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dentistry");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dentistry");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"));
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Linda");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Linda");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Leary");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Leary");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
	public void test59() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test59");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("LqCKYETe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("LqCKYETe");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("UHhmApJE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("UHhmApJE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("XAyRLGBf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("XAyRLGBf");
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
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("OhNDSVdw");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("OhNDSVdw");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("HwILOgLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("HwILOgLQ");
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
	public void test60() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test60");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
	public void test61() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test61");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("mMxOqZeh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("mMxOqZeh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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
	public void test62() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test62");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Sharon");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Sharon");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Ortega");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Ortega");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dentistry");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dentistry");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1]"));
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Linda");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Linda");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Leary");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Leary");
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
						.xpath(" //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2]"));
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
	public void test63() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test63");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
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
	}

	@Test
	public void test64() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test64");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("YFPdeGmD");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("YFPdeGmD");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("xGEXtNEu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("xGEXtNEu");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("COguhzTm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("COguhzTm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("3"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("yFBsYtkm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("yFBsYtkm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("4"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("NIDaqhXe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("NIDaqhXe");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("BWiWuqXA");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("BWiWuqXA");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("BgfjUqtm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("BgfjUqtm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("BAvJzwFP");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("BAvJzwFP");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("xwrwjpBO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("xwrwjpBO");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("UXgVONyD");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("UXgVONyD");
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
	public void test65() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test65");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("pRhgsXHC");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("pRhgsXHC");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("FWIdIvRp");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("FWIdIvRp");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("cugHbBMj");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("cugHbBMj");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("gUqPGVLr");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("gUqPGVLr");
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
		List<WebElement> elements4 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("bird");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("bird");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("tgnVjGLG");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("tgnVjGLG");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("nnQfhLyO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("nnQfhLyO");
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
	public void test66() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test66");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ZXEXniBh");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ZXEXniBh");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("zdYExEgH");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("zdYExEgH");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("zQgjbFNd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("zQgjbFNd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("cPoIVwyq");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("cPoIVwyq");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("GADFtbzB");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("GADFtbzB");
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("YFPdeGmD");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("YFPdeGmD");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("xGEXtNEu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("xGEXtNEu");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("COguhzTm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("COguhzTm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("3"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("yFBsYtkm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("yFBsYtkm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements5 = driver.findElements(By.id("4"));
			if (inputElements5.size() > 0) {
				try {
					inputElements5.get(0).sendKeys("NIDaqhXe");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements5.get(0).sendKeys("NIDaqhXe");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("BWiWuqXA");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("BWiWuqXA");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("BgfjUqtm");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("BgfjUqtm");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("BAvJzwFP");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("BAvJzwFP");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("3"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("xwrwjpBO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("xwrwjpBO");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By.id("4"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("UXgVONyD");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("UXgVONyD");
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
	public void test67() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test67");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
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
		List<WebElement> elements2 = driver.findElements(By
				.xpath(" //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("cat");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("cat");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("PyYXNCQK");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("PyYXNCQK");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("dKrgQzPf");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("dKrgQzPf");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("sFDFRTmg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("sFDFRTmg");
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
						.xpath(" //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("OhNDSVdw");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("OhNDSVdw");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("HwILOgLQ");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("HwILOgLQ");
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
	public void test68() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test68");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
	public void test69() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test69");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("zNcHNPMu");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("zNcHNPMu");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("ldimPfNE");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("ldimPfNE");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("eUWylVxd");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("eUWylVxd");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("OnFZXYBL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("OnFZXYBL");
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
		List<WebElement> elements3 = driver.findElements(By
				.xpath(" //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("radiology");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("radiology");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("0"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("IbnJPAPL");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("IbnJPAPL");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("1"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("nrpPUEfX");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("nrpPUEfX");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver.findElements(By.id("2"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("SrUHEhyO");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("SrUHEhyO");
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
						.xpath(" //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By.id("0"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("YsZzaypi");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("YsZzaypi");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver.findElements(By.id("1"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("JoBsxmzy");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("JoBsxmzy");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By.id("2"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("eYbijwqg");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("eYbijwqg");
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
	public void test70() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test70");
		driver.get(Properties.app_url);
		Thread.sleep(3000);
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("Jean");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("Jean");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Coleman");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Coleman");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.id("address"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1450 Oak Blvd.");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By.id("city"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("Sun Prairie");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("Sun Prairie");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements4 = driver.findElements(By
					.id("telephone"));
			if (inputElements4.size() > 0) {
				try {
					inputElements4.get(0).sendKeys("6085551749");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements4.get(0).sendKeys("6085551749");
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3]"));
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
						.xpath(" /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2]"));
		if (elements5.size() > 0) {
			List<WebElement> inputElements0 = driver.findElements(By
					.id("owner_name"));
			if (inputElements0.size() > 0) {
				try {
					inputElements0.get(0).sendKeys("rWGmMrGj");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements0.get(0).sendKeys("rWGmMrGj");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				try {
					inputElements1.get(0).sendKeys("Max");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements1.get(0).sendKeys("Max");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver.findElements(By
					.name("birthDate"));
			if (inputElements2.size() > 0) {
				try {
					inputElements2.get(0).sendKeys("1995-09-04");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements2.get(0).sendKeys("1995-09-04");
				}
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				try {
					inputElements3.get(0).sendKeys("lizard");
				} catch (Exception ex) {
					System.out.println(" WARNING: exception - message "
							+ ex.getMessage() + " cause " + ex.getCause());
					Thread.sleep(2000);
					inputElements3.get(0).sendKeys("lizard");
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