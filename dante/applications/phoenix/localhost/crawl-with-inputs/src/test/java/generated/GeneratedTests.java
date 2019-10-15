package generated;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.BrowserOptions;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.core.state.Identification;
import com.crawljax.core.state.Identification.How;
import com.crawljax.forms.FormInput;
import com.crawljax.plugins.testcasegenerator.TestConfiguration.StateEquivalenceAssertionMode;
import com.crawljax.plugins.testcasegenerator.TestSuiteHelper;

/*
 * Generated @ Thu May 09 23:47:31 CEST 2019
 */

public class GeneratedTests {

    private final String URL = "http://localhost:4000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String TEST_SUITE_PATH = "/Users/matteobiagiola/workspace/dante/applications/phoenix/localhost/crawl0/src/test/java/generated";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.ALL;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(1000, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(1000, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME, 1, new BrowserOptions(false, 2)));
		return builder.build();
	}	
	
	@BeforeClass
	public void oneTimeSetUp(){
		try {
			//load needed data from json files
			testSuiteHelper = new TestSuiteHelper(
					getTestConfiguration(),
					"/Users/matteobiagiola/workspace/dante/applications/phoenix/localhost/crawl0/src/test/java/generated/states.json",
					"/Users/matteobiagiola/workspace/dante/applications/phoenix/localhost/crawl0/src/test/java/generated/eventables.json",
					"/Users/matteobiagiola/workspace/dante/applications/phoenix/localhost/crawl0/screenshots",
					"/Users/matteobiagiola/workspace/dante/applications/phoenix/localhost/crawl0/test-results",
					URL, TEST_SUITE_PATH);
		}
		catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@AfterClass
	public void oneTimeTearDown(){
		try {
			testSuiteHelper.tearDown();
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@BeforeMethod
	public void setUp(){
		try {
			testSuiteHelper.goToInitialUrl();		
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}	
	
	@AfterMethod
	public void getStatusAndDuration(ITestResult tr) {
		long duration = tr.getEndMillis() - tr.getStartMillis();
		long nanos = TimeUnit.MILLISECONDS.toNanos(duration);
		String message = "none";
		if (tr.getThrowable() != null) {
			message = tr.getThrowable().getMessage();
		}

		switch (tr.getStatus()) {
			case ITestResult.SUCCESS:
				testSuiteHelper.markLastMethodAsSucceeded(nanos);
				break;
			case ITestResult.FAILURE:
				testSuiteHelper.markLastMethodAsFailed(message, nanos);
				break;
			case ITestResult.SKIP:
				testSuiteHelper.markLastMethodAsSkipped(nanos);
				break;
		}
	}
	
	/*
	 * Test Cases
	 */
	 
	@Test(priority=1)
	public void method_0(){
		testSuiteHelper.newCurrentTestMethod("method_0");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		try {
			//initial state
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=2)
	public void method_1_2_3_4_5_6_7_8_9_10_11_12_13(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_3_4_5_6_7_8_9_10_11_12_13");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Create new account, attributes={data-reactid=.0.0.0.2, href=/sign_up}}, source=DHashStateVertexImpl{id=0, name=index, DHASH=0000000000000000000001000000010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=2, name=state2, DHASH=0000000000000000000001000000010000000100000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"), "john@phoenix-trello.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"), "12345678"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Create new account");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Sign in, attributes={data-reactid=.0.0.0.2, href=/sign_in}}, source=DHashStateVertexImpl{id=2, name=state2, DHASH=0000000000000000000001000000010000000100000000000000000000000000}, target=DHashStateVertexImpl{id=0, name=index, DHASH=0000000000000000000001000000010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "crawljax_user_first_name"), "foo"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "crawljax_user_last_name"), "bar"));
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.name, "crawljax_user_email"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.name, "crawljax_user_password"), "foobar123"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.name, "crawljax_user_password_confirmation"), "foobar123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Sign in");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign in, attributes={data-reactid=.0.0.0.1.3, type=submit}}, source=DHashStateVertexImpl{id=0, name=index, DHASH=0000000000000000000001000000010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"), "john@phoenix-trello.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"), "12345678"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Sign in");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.1, href=#}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.0.0.4, href=#}}, source=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0.0.4, href=#}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=15, name=state15, DHASH=0000000000110000000100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=3)
	public void method_14(){
		testSuiteHelper.newCurrentTestMethod("method_14");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(4);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Sign out, attributes={data-reactid=.0.0.0.2.0.1.0, href=#, id=crawler-sign-out}}, source=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=0, name=index, DHASH=0000000000000000000001000000010000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: Sign out");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=4)
	public void method_3_4_15_16_17_18_19(){
		testSuiteHelper.newCurrentTestMethod("method_3_4_15_16_17_18_19");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign in, attributes={data-reactid=.0.0.0.1.3, type=submit}}, source=DHashStateVertexImpl{id=0, name=index, DHASH=0000000000000000000001000000010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[1]/INPUT[1]"), "john@phoenix-trello.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/MAIN[1]/FORM[1]/DIV[2]/INPUT[1]"), "12345678"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Sign in");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$7-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=close, data-reactid=.0.0.1.0.2.0.0.0, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix card, attributes={class=cards-wrapper, data-reactid=.0.0.1.0.1.0.0.0:$5.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: other phoenix card");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=, attributes={class=delete, data-reactid=.0.0.1.0.2.0.0.1, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=5)
	public void method_4_5_6_20_21(){
		testSuiteHelper.newCurrentTestMethod("method_4_5_6_20_21");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(4);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.1, href=#}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=28, name=state28, DHASH=0000000000110000010100000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card, data-reactid=.0.0.1.0.1.0.0.0:$5.0.1.$31, draggable=true, id=card_31, style=display:block;}}, source=DHashStateVertexImpl{id=28, name=state28, DHASH=0000000000110000010100000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=6)
	public void method_4_5_8_11_22_23_24(){
		testSuiteHelper.newCurrentTestMethod("method_4_5_8_11_22_23_24");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(4);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0.0.4, href=#}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=33, name=state33, DHASH=0000000000101010010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(33);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 33");

			testSuiteHelper.addStateToReportBuilder(33);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(33)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(33)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=7)
	public void method_4_5_8_11_12_25_26_27_28_29(){
		testSuiteHelper.newCurrentTestMethod("method_4_5_8_11_12_25_26_27_28_29");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(4);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$87.0.2.1, href=#}}, source=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=36, name=state36, DHASH=0000000000101000010001010100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(36);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 36");

			testSuiteHelper.addStateToReportBuilder(36);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(36)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(36)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$87.0.2.0.0.4, href=#}}, source=DHashStateVertexImpl{id=36, name=state36, DHASH=0000000000101000010001010100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=39, name=state39, DHASH=0000000010001011010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=8)
	public void method_30_31_32_33_34_35_36_37(){
		testSuiteHelper.newCurrentTestMethod("method_30_31_32_33_34_35_36_37");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(4);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add new board..., attributes={data-reactid=.0.0.1.0.0.1.1.0.0, id=add_new_board}}, source=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=41, name=state41, DHASH=0000000001010010000000100000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(41);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 41");

			testSuiteHelper.addStateToReportBuilder(41);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(41)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(41)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.4, href=#}}, source=DHashStateVertexImpl{id=41, name=state41, DHASH=0000000001010010000000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=DHashStateVertexImpl{id=4, name=state4, DHASH=0000000001011000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=41, name=state41, DHASH=0000000001010010000000100000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(41);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 41");

			testSuiteHelper.addStateToReportBuilder(41);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(41)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(41)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create board, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.2, type=submit}}, source=DHashStateVertexImpl{id=41, name=state41, DHASH=0000000001010010000000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Create board");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=45, name=state45, DHASH=0000000001000000110000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(45);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 45");

			testSuiteHelper.addStateToReportBuilder(45);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(45)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(45)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=DHashStateVertexImpl{id=45, name=state45, DHASH=0000000001000000110000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=45, name=state45, DHASH=0000000001000000110000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(45);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 45");

			testSuiteHelper.addStateToReportBuilder(45);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(45)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(45)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=45, name=state45, DHASH=0000000001000000110000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=9)
	public void method_38_5_16_39_40(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_16_39_40");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit, attributes={data-reactid=.0.0.1.0.2.0.0.2.0.4, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=54, name=state54, DHASH=0000000000000010000001100010001000000010000001100000001000000010}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.2.0.0.2.0.0.4, href=#}}, source=DHashStateVertexImpl{id=54, name=state54, DHASH=0000000000000010000001100010001000000010000001100000001000000010}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"), "if I could fly"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"), "just a description"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=10)
	public void method_38_5_6_41(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_6_41");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.1, href=#}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.0}}, source=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=57, name=state57, DHASH=0000000000101000010001000100000001000000110000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(57);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 57");

			testSuiteHelper.addStateToReportBuilder(57);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(57)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(57)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=11)
	public void method_38_5_6_20_42(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_6_20_42");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.1, href=#}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=28, name=state28, DHASH=0000000000110000010100000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card-content, data-reactid=.0.0.1.0.1.0.0.0:$5.0.1.$31.0}}, source=DHashStateVertexImpl{id=28, name=state28, DHASH=0000000000110000010100000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_38_5_8_11_43_44_45_46(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_8_11_43_44_45_46");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$89.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=63, name=state63, DHASH=0000000010001010010000100000001000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$89.0.2.0.0.4, href=#}}, source=DHashStateVertexImpl{id=63, name=state63, DHASH=0000000010001010010000100000001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=13)
	public void method_38_5_8_11_22_47(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_8_11_22_47");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=39, name=state39, DHASH=0000000010001011010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=14)
	public void method_38_5_8_11_22_23_48_49(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_8_11_22_23_48_49");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$91.0.2.1, href=#}}, source=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=15)
	public void method_38_5_8_11_12_50_51(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_8_11_12_50_51");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(71);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 71");

			testSuiteHelper.addStateToReportBuilder(71);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(71)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(71)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$93.0.2.1, href=#}}, source=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=16)
	public void method_38_5_8_11_12_25_52(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_8_11_12_25_52");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=17)
	public void method_38_5_8_11_12_25_26_53_54(){
		testSuiteHelper.newCurrentTestMethod("method_38_5_8_11_12_25_26_53_54");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$87.0.2.1, href=#}}, source=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=36, name=state36, DHASH=0000000000101000010001010100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(36);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 36");

			testSuiteHelper.addStateToReportBuilder(36);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(36)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(36)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$87.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=36, name=state36, DHASH=0000000000101000010001010100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$94.0.2.1, href=#}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_55_56_57_58(){
		testSuiteHelper.newCurrentTestMethod("method_55_56_57_58");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add new board..., attributes={data-reactid=.0.0.1.0.0.1.1.0.0, id=add_new_board}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=82, name=state82, DHASH=0000000000110000000000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.4, href=#}}, source=DHashStateVertexImpl{id=82, name=state82, DHASH=0000000000110000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(49);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 49");

			testSuiteHelper.addStateToReportBuilder(49);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[4], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=DHashStateVertexImpl{id=49, name=state49, DHASH=0000000000110010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=82, name=state82, DHASH=0000000000110000000000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create board, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.2, type=submit}}, source=DHashStateVertexImpl{id=82, name=state82, DHASH=0000000000110000000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Create board");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=19)
	public void method_59_16_60_61(){
		testSuiteHelper.newCurrentTestMethod("method_59_16_60_61");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Members, attributes={class=button, data-reactid=.0.0.1.0.2.0.0.3.1, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=88, name=state88, DHASH=0000000000000110000000010000010100000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: Members");
			testSuiteHelper.runInCrawlingPlugins(88);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 88");

			testSuiteHelper.addStateToReportBuilder(88);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(88)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(88)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/HEADER[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=close, data-reactid=.0.0.1.0.2.0.0.3.2.0.1, href=#}}, source=DHashStateVertexImpl{id=88, name=state88, DHASH=0000000000000110000000010000010100000110000000100000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=20)
	public void method_59_5_16_39_62(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_16_39_62");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit, attributes={data-reactid=.0.0.1.0.2.0.0.2.0.4, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=54, name=state54, DHASH=0000000000000010000001100010001000000010000001100000001000000010}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save card, attributes={data-reactid=.0.0.1.0.2.0.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=54, name=state54, DHASH=0000000000000010000001100010001000000010000001100000001000000010}, target=DHashStateVertexImpl{id=91, name=state91, DHASH=0000000000000010000000100000011000000110001000100000001000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/INPUT[1]"), "if I could fly"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/FORM[1]/TEXTAREA[1]"), "just a description"));
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Save card");
			testSuiteHelper.runInCrawlingPlugins(91);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 91");

			testSuiteHelper.addStateToReportBuilder(91);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(91)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(91)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=21)
	public void method_59_5_6_20(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_6_20");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.1, href=#}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.EMAIL, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/INPUT[1]"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$5.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=8, name=state8, DHASH=0000000001100000010000000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=28, name=state28, DHASH=0000000000110000010100000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=22)
	public void method_59_5_8_11_63(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_63");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$85.0}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=23)
	public void method_59_5_8_11_43_44_64_65(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_43_44_64_65");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$95.0.2.1, href=#}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=24)
	public void method_59_5_8_11_43_44_45_66_67_68_69(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_43_44_45_66_67_68_69");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$89.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=63, name=state63, DHASH=0000000010001010010000100000001000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$89.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=63, name=state63, DHASH=0000000010001010010000100000001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$92.0.2.1, href=#}}, source=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=100, name=state100, DHASH=0000000001101000000001010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(100);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 100");

			testSuiteHelper.addStateToReportBuilder(100);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(100)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(100)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$92.0.2.0.0.4, href=#}}, source=DHashStateVertexImpl{id=100, name=state100, DHASH=0000000001101000000001010000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=25)
	public void method_59_5_8_11_22_70_71(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_22_70_71");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=26)
	public void method_59_5_8_11_22_23_72(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_22_23_72");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=27)
	public void method_59_5_8_11_22_23_48_73(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_22_23_48_73");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=28)
	public void method_59_5_8_11_12_50_74(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_12_50_74");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(71);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 71");

			testSuiteHelper.addStateToReportBuilder(71);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(71)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(71)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=29)
	public void method_59_5_8_11_12_25_75(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_12_25_75");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card, data-reactid=.0.0.1.0.1.0.0.0:$85.0.1.$32, draggable=true, id=card_32, style=display:block;}}, source=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=30)
	public void method_59_5_8_11_12_25_26_76_77(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_12_25_26_76_77");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$87.0.2.1, href=#}}, source=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=36, name=state36, DHASH=0000000000101000010001010100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(36);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 36");

			testSuiteHelper.addStateToReportBuilder(36);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(36)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(36)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$87.0.2.0}}, source=DHashStateVertexImpl{id=36, name=state36, DHASH=0000000000101000010001010100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=115, name=state115, DHASH=0000000001101000000101000100010001000100010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(115);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 115");

			testSuiteHelper.addStateToReportBuilder(115);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[17]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$101.0.2.1, href=#}}, source=DHashStateVertexImpl{id=115, name=state115, DHASH=0000000001101000000101000100010001000100010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=31)
	public void method_59_5_8_11_22_70_64_78(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_8_11_22_70_64_78");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=32)
	public void method_59_5_16_79_80(){
		testSuiteHelper.newCurrentTestMethod("method_59_5_16_79_80");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2], element=Element{node=[A: null], tag=A, text=Tags, attributes={class=button, data-reactid=.0.0.1.0.2.0.0.3.3, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Tags");
			testSuiteHelper.runInCrawlingPlugins(122);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 122");

			testSuiteHelper.addStateToReportBuilder(122);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/HEADER[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=close, data-reactid=.0.0.1.0.2.0.0.3.4.0.1, href=#}}, source=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}, target=DHashStateVertexImpl{id=123, name=state123, DHASH=0000000010000010000000100000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(80), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(123);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 123");

			testSuiteHelper.addStateToReportBuilder(123);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(123)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(123)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=33)
	public void method_81_82_83_84(){
		testSuiteHelper.newCurrentTestMethod("method_81_82_83_84");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[5]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add new board..., attributes={data-reactid=.0.0.1.0.0.1.1.0.0, id=add_new_board}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=125, name=state125, DHASH=0000000001010010000000000100000001000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.4, href=#}}, source=DHashStateVertexImpl{id=125, name=state125, DHASH=0000000001010010000000000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[5], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=DHashStateVertexImpl{id=86, name=state86, DHASH=0000000001010010000000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=125, name=state125, DHASH=0000000001010010000000000100000001000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(125);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 125");

			testSuiteHelper.addStateToReportBuilder(125);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[5]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create board, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.2, type=submit}}, source=DHashStateVertexImpl{id=125, name=state125, DHASH=0000000001010010000000000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: Create board");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=34)
	public void method_85_16_60_86(){
		testSuiteHelper.newCurrentTestMethod("method_85_16_60_86");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Members, attributes={class=button, data-reactid=.0.0.1.0.2.0.0.3.1, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=88, name=state88, DHASH=0000000000000110000000010000010100000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: Members");
			testSuiteHelper.runInCrawlingPlugins(88);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 88");

			testSuiteHelper.addStateToReportBuilder(88);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(88)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(88)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=John Doe, attributes={data-reactid=.0.0.1.0.2.0.0.3.2.1.$57.0, href=#}}, source=DHashStateVertexImpl{id=88, name=state88, DHASH=0000000000000110000000010000010100000110000000100000000000000000}, target=DHashStateVertexImpl{id=131, name=state131, DHASH=0000000000000010000000010000010100000110000001100000001000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(86), "Event fired: John Doe");
			testSuiteHelper.runInCrawlingPlugins(131);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 131");

			testSuiteHelper.addStateToReportBuilder(131);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(131)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(131)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=35)
	public void method_85_5_8_11_87(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_87");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=, attributes={class=cards-wrapper, data-reactid=.0.0.1.0.1.0.0.0:$85.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=36)
	public void method_85_5_8_11_22_70_88(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_22_70_88");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[7]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=37)
	public void method_85_5_8_11_22_70_45_89_90(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_22_70_45_89_90");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$89.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=63, name=state63, DHASH=0000000010001010010000100000001000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(63);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 63");

			testSuiteHelper.addStateToReportBuilder(63);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(63)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(63)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$89.0.2.0}}, source=DHashStateVertexImpl{id=63, name=state63, DHASH=0000000010001010010000100000001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(71);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 71");

			testSuiteHelper.addStateToReportBuilder(71);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(71)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(71)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=38)
	public void method_85_5_8_11_22_23_48_67_91(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_22_23_48_67_91");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$92.0.2.1, href=#}}, source=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=100, name=state100, DHASH=0000000001101000000001010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(100);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 100");

			testSuiteHelper.addStateToReportBuilder(100);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(100)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(100)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$96.0.2.1, href=#}}, source=DHashStateVertexImpl{id=100, name=state100, DHASH=0000000001101000000001010000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=39)
	public void method_85_5_8_11_22_92(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_22_92");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$86.0}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=40)
	public void method_85_5_8_11_22_23_93_94(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_22_23_93_94");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$111.0.2.1, href=#}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=41)
	public void method_85_5_8_11_22_23_48_95(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_22_23_48_95");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card, data-reactid=.0.0.1.0.1.0.0.0:$86.0.1.$34, draggable=true, id=card_34, style=display:block;}}, source=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(95), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=42)
	public void method_85_5_8_11_12_50_96(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_12_50_96");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(71);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 71");

			testSuiteHelper.addStateToReportBuilder(71);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(71)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(71)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[9]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$93.0}}, source=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=43)
	public void method_85_5_8_11_12_25_97(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_12_25_97");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card-content, data-reactid=.0.0.1.0.1.0.0.0:$85.0.1.$32.0}}, source=DHashStateVertexImpl{id=35, name=state35, DHASH=0000000000101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=44)
	public void method_85_5_8_11_22_70_64_98(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_8_11_22_70_64_98");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[12]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(98), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=45)
	public void method_85_5_16_99(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_16_99");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save comment, attributes={data-reactid=.0.0.1.0.2.0.0.2.1.0.2.1, type=submit}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=162, name=state162, DHASH=0000000000000010000000100000001000000110000001100000001000000010}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: Save comment");
			testSuiteHelper.runInCrawlingPlugins(162);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 162");

			testSuiteHelper.addStateToReportBuilder(162);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(162)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(162)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=46)
	public void method_85_5_16_79_100(){
		testSuiteHelper.newCurrentTestMethod("method_85_5_16_79_100");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2], element=Element{node=[A: null], tag=A, text=Tags, attributes={class=button, data-reactid=.0.0.1.0.2.0.0.3.3, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Tags");
			testSuiteHelper.runInCrawlingPlugins(122);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 122");

			testSuiteHelper.addStateToReportBuilder(122);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tag green , data-reactid=.0.0.1.0.2.0.0.3.4.1.$green.0, href=#}}, source=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}, target=DHashStateVertexImpl{id=164, name=state164, DHASH=0000000000000010000000100000010100000101000001010000001000000010}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(164);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 164");

			testSuiteHelper.addStateToReportBuilder(164);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=47)
	public void method_101_102_103_104(){
		testSuiteHelper.newCurrentTestMethod("method_101_102_103_104");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(129);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[6]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add new board..., attributes={data-reactid=.0.0.1.0.0.1.1.0.0, id=add_new_board}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=169, name=state169, DHASH=0000000001010010000000000001000000010000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(169);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 169");

			testSuiteHelper.addStateToReportBuilder(169);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(169)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(169)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.4, href=#}}, source=DHashStateVertexImpl{id=169, name=state169, DHASH=0000000001010010000000000001000000010000000000000000000000000000}, target=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(129);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 129");

			testSuiteHelper.addStateToReportBuilder(129);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(129)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(129)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[6], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=DHashStateVertexImpl{id=129, name=state129, DHASH=0000000001010010000000000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=169, name=state169, DHASH=0000000001010010000000000001000000010000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(169);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 169");

			testSuiteHelper.addStateToReportBuilder(169);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(169)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(169)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[6]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create board, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.2, type=submit}}, source=DHashStateVertexImpl{id=169, name=state169, DHASH=0000000001010010000000000001000000010000000000000000000000000000}, target=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: Create board");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=48)
	public void method_105_8_11_22_70_106(){
		testSuiteHelper.newCurrentTestMethod("method_105_8_11_22_70_106");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card, data-reactid=.0.0.1.0.1.0.0.0:$5.0.1.$33, draggable=true, id=card_33, style=display:block;}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=175, name=state175, DHASH=0000000000000010000000110000001000000110000001100000001000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(175);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 175");

			testSuiteHelper.addStateToReportBuilder(175);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(175)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(175)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=49)
	public void method_105_5_8_11_22_23_48_67_107(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_8_11_22_23_48_67_107");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[8]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$92.0.2.1, href=#}}, source=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=100, name=state100, DHASH=0000000001101000000001010000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(100);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 100");

			testSuiteHelper.addStateToReportBuilder(100);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(100)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(100)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[13]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$97.0.2.1, href=#}}, source=DHashStateVertexImpl{id=100, name=state100, DHASH=0000000001101000000001010000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=50)
	public void method_105_5_8_11_22_108(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_8_11_22_108");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=, attributes={class=cards-wrapper, data-reactid=.0.0.1.0.1.0.0.0:$86.0.1}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(108), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=51)
	public void method_105_5_8_11_22_23_93_109(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_8_11_22_23_93_109");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$112.0.2.1, href=#}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(109), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=52)
	public void method_105_5_8_11_22_23_48_110(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_8_11_22_23_48_110");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card-content, data-reactid=.0.0.1.0.1.0.0.0:$86.0.1.$34.0}}, source=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(110), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=53)
	public void method_105_5_8_11_12_50(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_8_11_12_50");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0}}, source=DHashStateVertexImpl{id=14, name=state14, DHASH=0000000000110000000100000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=71, name=state71, DHASH=0000000001101000010001000100000001000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(71);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 71");

			testSuiteHelper.addStateToReportBuilder(71);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(71)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(71)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=54)
	public void method_105_5_8_11_22_70_64_111(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_8_11_22_70_64_111");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card, data-reactid=.0.0.1.0.1.0.0.0:$85.0.1.$35, draggable=true, id=card_35, style=display:block;}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(111), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=55)
	public void method_105_5_16_112_113(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_16_112_113");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[2]/I[1], element=Element{node=[I: null], tag=I, text=, attributes={class=fa fa-trash-o, data-reactid=.0.0.1.0.2.0.0.1.0}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=196, name=state196, DHASH=0000000000101000000101000101010000010100010101000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(196);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 196");

			testSuiteHelper.addStateToReportBuilder(196);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(196)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(196)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[46]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$130.0.2.1, href=#}}, source=DHashStateVertexImpl{id=196, name=state196, DHASH=0000000000101000000101000101010000010100010101000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(113), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=56)
	public void method_105_5_16_79_114_115(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_16_79_114_115");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2], element=Element{node=[A: null], tag=A, text=Tags, attributes={class=button, data-reactid=.0.0.1.0.2.0.0.3.3, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Tags");
			testSuiteHelper.runInCrawlingPlugins(122);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 122");

			testSuiteHelper.addStateToReportBuilder(122);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tag yellow , data-reactid=.0.0.1.0.2.0.0.3.4.1.$yellow.0, href=#}}, source=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}, target=DHashStateVertexImpl{id=199, name=state199, DHASH=0000000000000010000000100000010100000101000001010010001000000010}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(114), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(199);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 199");

			testSuiteHelper.addStateToReportBuilder(199);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(199)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(199)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tag yellow selected, data-reactid=.0.0.1.0.2.0.0.3.4.1.$yellow.0, href=#}}, source=DHashStateVertexImpl{id=199, name=state199, DHASH=0000000000000010000000100000010100000101000001010010001000000010}, target=DHashStateVertexImpl{id=200, name=state200, DHASH=0000000000000010000000100000010100000101001001010000001000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(115), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(200);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 200");

			testSuiteHelper.addStateToReportBuilder(200);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=57)
	public void method_105_5_8_11_22_70_116(){
		testSuiteHelper.newCurrentTestMethod("method_105_5_8_11_22_70_116");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card-content, data-reactid=.0.0.1.0.1.0.0.0:$5.0.1.$33.0}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(116), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=58)
	public void method_117_118_119_120(){
		testSuiteHelper.newCurrentTestMethod("method_117_118_119_120");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(173);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[7]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add new board..., attributes={data-reactid=.0.0.1.0.0.1.1.0.0, id=add_new_board}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=206, name=state206, DHASH=0000000001010010000000000001001000000010000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(117), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(206);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 206");

			testSuiteHelper.addStateToReportBuilder(206);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(206)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(206)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.4, href=#}}, source=DHashStateVertexImpl{id=206, name=state206, DHASH=0000000001010010000000000001001000000010000000000000000000000000}, target=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(118), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(173);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 173");

			testSuiteHelper.addStateToReportBuilder(173);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(173)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(173)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[7], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=DHashStateVertexImpl{id=173, name=state173, DHASH=0000000001010010000000000001100000000000000000000000000000000000}, target=DHashStateVertexImpl{id=206, name=state206, DHASH=0000000001010010000000000001001000000010000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(119), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(206);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 206");

			testSuiteHelper.addStateToReportBuilder(206);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(206)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(206)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[7]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create board, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.2, type=submit}}, source=DHashStateVertexImpl{id=206, name=state206, DHASH=0000000001010010000000000001001000000010000000000000000000000000}, target=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: Create board");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=59)
	public void method_121_8_11_22_122(){
		testSuiteHelper.newCurrentTestMethod("method_121_8_11_22_122");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(210);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Save list or cancel, attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(122), "Event fired: Save list or cancel");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=60)
	public void method_121_5_8_11_22_23_93_123(){
		testSuiteHelper.newCurrentTestMethod("method_121_5_8_11_22_23_93_123");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(210);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$113.0.2.1, href=#}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(123), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=61)
	public void method_121_5_8_11_22_70_64_124(){
		testSuiteHelper.newCurrentTestMethod("method_121_5_8_11_22_70_64_124");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(210);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card-content, data-reactid=.0.0.1.0.1.0.0.0:$85.0.1.$35.0}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(124), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=62)
	public void method_121_5_16_112_125(){
		testSuiteHelper.newCurrentTestMethod("method_121_5_16_112_125");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(210);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[2]/I[1], element=Element{node=[I: null], tag=I, text=, attributes={class=fa fa-trash-o, data-reactid=.0.0.1.0.2.0.0.1.0}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=196, name=state196, DHASH=0000000000101000000101000101010000010100010101000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(196);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 196");

			testSuiteHelper.addStateToReportBuilder(196);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(196)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(196)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[47]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$131.0.2.1, href=#}}, source=DHashStateVertexImpl{id=196, name=state196, DHASH=0000000000101000000101000101010000010100010101000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(125), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=63)
	public void method_121_5_16_79_126_127(){
		testSuiteHelper.newCurrentTestMethod("method_121_5_16_79_126_127");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(210);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2], element=Element{node=[A: null], tag=A, text=Tags, attributes={class=button, data-reactid=.0.0.1.0.2.0.0.3.3, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Tags");
			testSuiteHelper.runInCrawlingPlugins(122);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 122");

			testSuiteHelper.addStateToReportBuilder(122);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tag orange , data-reactid=.0.0.1.0.2.0.0.3.4.1.$orange.0, href=#}}, source=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}, target=DHashStateVertexImpl{id=236, name=state236, DHASH=0000000000000010000000100000010100000101000001010000001000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(126), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(236);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 236");

			testSuiteHelper.addStateToReportBuilder(236);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(236)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(236)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tag orange selected, data-reactid=.0.0.1.0.2.0.0.3.4.1.$orange.0, href=#}}, source=DHashStateVertexImpl{id=236, name=state236, DHASH=0000000000000010000000100000010100000101000001010000001000000000}, target=DHashStateVertexImpl{id=237, name=state237, DHASH=0000000010000010000000100000010100000101000001010000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(127), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(237);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 237");

			testSuiteHelper.addStateToReportBuilder(237);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(237)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(237)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=64)
	public void method_121_5_8_11_22_70_128(){
		testSuiteHelper.newCurrentTestMethod("method_121_5_8_11_22_70_128");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(210);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$89.0}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(128), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=65)
	public void method_129_130_131_132(){
		testSuiteHelper.newCurrentTestMethod("method_129_130_131_132");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(210);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add new board..., attributes={data-reactid=.0.0.1.0.0.1.1.0.0, id=add_new_board}}, source=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(129), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(243);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 243");

			testSuiteHelper.addStateToReportBuilder(243);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.4, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(130), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(210);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 210");

			testSuiteHelper.addStateToReportBuilder(210);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(210)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(210)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=DHashStateVertexImpl{id=210, name=state210, DHASH=0000000001010010000000000001001000000000000000000000000000000000}, target=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(131), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(243);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 243");

			testSuiteHelper.addStateToReportBuilder(243);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create board, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.2, type=submit}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=44, name=state44, DHASH=0000000000000000000000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "board_name"), "just a board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(132), "Event fired: Create board");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=66)
	public void method_133_8_11_22_23_93_134(){
		testSuiteHelper.newCurrentTestMethod("method_133_8_11_22_23_93_134");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$114.0.2.1, href=#}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(134), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=67)
	public void method_133_5_8_11_22_70_64_135(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_64_135");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card, data-reactid=.0.0.1.0.1.0.0.0:$85.0.1.$36, draggable=true, id=card_36, style=display:block;}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(135), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=68)
	public void method_133_5_16_112_136(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_16_112_136");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[2]/I[1], element=Element{node=[I: null], tag=I, text=, attributes={class=fa fa-trash-o, data-reactid=.0.0.1.0.2.0.0.1.0}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=196, name=state196, DHASH=0000000000101000000101000101010000010100010101000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(196);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 196");

			testSuiteHelper.addStateToReportBuilder(196);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(196)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(196)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[48]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$132.0.2.1, href=#}}, source=DHashStateVertexImpl{id=196, name=state196, DHASH=0000000000101000000101000101010000010100010101000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(136), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=69)
	public void method_133_5_16_79_137(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_16_79_137");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/A[2], element=Element{node=[A: null], tag=A, text=Tags, attributes={class=button, data-reactid=.0.0.1.0.2.0.0.3.3, href=#}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Tags");
			testSuiteHelper.runInCrawlingPlugins(122);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 122");

			testSuiteHelper.addStateToReportBuilder(122);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=tag red , data-reactid=.0.0.1.0.2.0.0.3.4.1.$red.0, href=#}}, source=DHashStateVertexImpl{id=122, name=state122, DHASH=0000000000000010000000100000010100000101000001010000000000000000}, target=DHashStateVertexImpl{id=236, name=state236, DHASH=0000000000000010000000100000010100000101000001010000001000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(137), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(236);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 236");

			testSuiteHelper.addStateToReportBuilder(236);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(236)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(236)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=70)
	public void method_133_5_8_11_22_70_138(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_138");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[5]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=, attributes={class=cards-wrapper, data-reactid=.0.0.1.0.1.0.0.0:$89.0.1}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(138), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=71)
	public void method_133_5_8_11_22_23_93_139(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_139");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$115.0.2.1, href=#}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(139), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=72)
	public void method_133_5_8_11_22_70_64_140(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_64_140");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card-content, data-reactid=.0.0.1.0.1.0.0.0:$85.0.1.$36.0}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=73)
	public void method_133_5_16_112_141(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_16_112_141");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=other phoenix listother phoenix cardAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$5.0}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: other phoenix listother phoenix cardAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[2]/I[1], element=Element{node=[I: null], tag=I, text=, attributes={class=fa fa-trash-o, data-reactid=.0.0.1.0.2.0.0.1.0}}, source=DHashStateVertexImpl{id=23, name=state23, DHASH=0000000000000010000000100000011000000110000000100000011000000010}, target=DHashStateVertexImpl{id=196, name=state196, DHASH=0000000000101000000101000101010000010100010101000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.xpath, "/HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/TEXTAREA[1]"), "just a comment"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(196);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 196");

			testSuiteHelper.addStateToReportBuilder(196);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(196)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(196)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[49]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$133.0.2.1, href=#}}, source=DHashStateVertexImpl{id=196, name=state196, DHASH=0000000000101000000101000101010000010100010101000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(141), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=74)
	public void method_133_5_8_11_22_70_142(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_142");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$90.0}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=68, name=state68, DHASH=0000000001101000000001000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(142), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(68);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 68");

			testSuiteHelper.addStateToReportBuilder(68);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(68)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(68)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=75)
	public void method_133_5_8_11_22_23_93_143(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_143");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$116.0.2.1, href=#}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(143), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=76)
	public void method_133_5_8_11_22_70_64_144(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_64_144");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card, data-reactid=.0.0.1.0.1.0.0.0:$87.0.1.$37, draggable=true, id=card_37, style=display:block;}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(144), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=77)
	public void method_133_5_8_11_22_70(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=78)
	public void method_133_5_8_11_22_23_93_145(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_145");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$117.0.2.1, href=#}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(145), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=79)
	public void method_133_5_8_11_22_70_64_146(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_64_146");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card-content, data-reactid=.0.0.1.0.1.0.0.0:$87.0.1.$37.0}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=133, name=state133, DHASH=0000000000000010000000110000011000000110000000100000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(146), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=80)
	public void method_133_5_8_11_22_23_93_147(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_147");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(147), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=81)
	public void method_133_5_8_11_22_70_64_148(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_64_148");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[10]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$94.0}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(148), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=82)
	public void method_133_5_8_11_22_23_93_149(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_149");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[34]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=38, name=state38, DHASH=0000000010001000010000010000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(149), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=83)
	public void method_133_5_8_11_22_70_64_150(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_64_150");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[11]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$95.0}}, source=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(150), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=84)
	public void method_133_5_8_11_22_23_93_151(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_151");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=just a card, attributes={class=card-content, data-reactid=.0.0.1.0.1.0.0.0:$86.0.1.$43.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=29, name=state29, DHASH=0000000000000010000000100000011000000110000000100000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(151), "Event fired: just a card");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=85)
	public void method_133_5_8_11_22_70_64(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_70_64");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(62);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 62");

			testSuiteHelper.addStateToReportBuilder(62);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(62)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(62)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$90.0.2.1, href=#}}, source=DHashStateVertexImpl{id=62, name=state62, DHASH=0000000010001010010000100000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=76, name=state76, DHASH=0000000001101000010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(76);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 76");

			testSuiteHelper.addStateToReportBuilder(76);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(76)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(76)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=86)
	public void method_133_5_8_11_22_23_93_152(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_152");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[27]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$111.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(152), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=87)
	public void method_133_5_8_11_22_23_93_153(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_153");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[28]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$112.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(153), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=88)
	public void method_133_5_8_11_22_23_93_154(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_154");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[29]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$113.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(154), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=89)
	public void method_133_5_8_11_22_23_93_155(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_155");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[30]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$114.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(155), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=90)
	public void method_133_5_8_11_22_23_93_156(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_156");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[31]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$115.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(156), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=91)
	public void method_133_5_8_11_22_23_93_157(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_157");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[32]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$116.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(157), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=92)
	public void method_133_5_8_11_22_23_93_158(){
		testSuiteHelper.newCurrentTestMethod("method_133_5_8_11_22_23_93_158");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(243);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(243)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(243)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Boards, attributes={data-reactid=.0.0.0.0.0.0.0, href=#}}, source=DHashStateVertexImpl{id=243, name=state243, DHASH=0000000001010010000000000001000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Boards");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/HEADER[1]/NAV[1]/UL[1]/LI[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=other phoenix board, attributes={data-reactid=.0.0.0.0.0.0.1.1.$8-other-phoenix-board.0, href=#}}, source=DHashStateVertexImpl{id=5, name=state5, DHASH=0000000001011000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: other phoenix board");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=6, name=state6, DHASH=0000000001100000010000000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=DHashStateVertexImpl{id=10, name=state10, DHASH=0000000000010000001100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(13);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 13");

			testSuiteHelper.addStateToReportBuilder(13);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(13)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(13)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=DHashStateVertexImpl{id=13, name=state13, DHASH=0000000000110000010100000000000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Add new list...");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.1, href=#}}, source=DHashStateVertexImpl{id=31, name=state31, DHASH=0000000000101001010001000100000000000000000000000000000000000000}, target=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "phantom of the opera"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add a new card...");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/FOOTER[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add or cancel, attributes={class=card form, data-reactid=.0.0.1.0.1.0.0.0:$86.0.2.0}}, source=DHashStateVertexImpl{id=32, name=state32, DHASH=0000000000101010010001000100010000000000000000000000000000000000}, target=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add or cancel");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[33]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=phantom of the operaAdd a new card..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.0:$117.0}}, source=DHashStateVertexImpl{id=144, name=state144, DHASH=0000000001101000010001000100000001000000010000000000000000000000}, target=DHashStateVertexImpl{id=64, name=state64, DHASH=0000000010001010010000000000000000000000000000000000000000000000}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXTAREA, new Identification(How.id, "card_name"), "just a card"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(158), "Event fired: phantom of the operaAdd a new card...");
			testSuiteHelper.runInCrawlingPlugins(64);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 64");

			testSuiteHelper.addStateToReportBuilder(64);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(64)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(64)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}


}	 
