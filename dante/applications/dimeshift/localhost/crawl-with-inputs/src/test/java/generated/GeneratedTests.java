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
 * Generated @ Tue Oct 08 17:28:29 CEST 2019
 */

public class GeneratedTests {

    private final String URL = "http://localhost:3000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String TEST_SUITE_PATH = "/Users/matteobiagiola/workspace/dante/applications/dimeshift/localhost/crawl0/src/test/java/generated";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.ALL;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(2500, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(1500, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME, 1, new BrowserOptions(false, 2)));
		return builder.build();
	}	
	
	@BeforeClass
	public void oneTimeSetUp(){
		try {
			//load needed data from json files
			testSuiteHelper = new TestSuiteHelper(
					getTestConfiguration(),
					"/Users/matteobiagiola/workspace/dante/applications/dimeshift/localhost/crawl0/src/test/java/generated/states.json",
					"/Users/matteobiagiola/workspace/dante/applications/dimeshift/localhost/crawl0/src/test/java/generated/eventables.json",
					"/Users/matteobiagiola/workspace/dante/applications/dimeshift/localhost/crawl0/screenshots",
					"/Users/matteobiagiola/workspace/dante/applications/dimeshift/localhost/crawl0/test-results",
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
	public void method_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$ dimeshift, attributes={class=btn btn-info btn-lg btn-logo, href=/}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: $ dimeshift");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Home, attributes={class=menu_category menu_category_home, data-i18n=Home, href=/}}, source=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Home");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1], element=Element{node=[A: null], tag=A, text=Register, attributes={data-i18n=Register, href=/user/registration}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Register");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sign In, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/signin}}, source=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_login"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"), "foobar123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Sign In");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1], element=Element{node=[A: null], tag=A, text=Register, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/registration}}, source=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_username"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"), "adminadmin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Register");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={aria-hidden=true, class=close, data-dismiss=modal, type=button}}, source=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_login"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"), "foobar123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ×");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1], element=Element{node=[A: null], tag=A, text=Sign In, attributes={class=signin_caller, data-i18n=Sign In, href=/user/signin}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Sign In");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[2], element=Element{node=[A: null], tag=A, text=Restore your password, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/restore}}, source=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=10, name=state10, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_username"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[2]/INPUT[1]"), "adminadmin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Restore your password");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Register, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/registration}}, source=PerceptualImageHashStateVertexImpl{id=10, name=state10, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Register");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Registration..., id=registration_modal_form_submit, type=submit, value=Sign Up}}, source=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_login"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			formInputs.add(new FormInput(FormInput.InputType.PASSWORD, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"), "foobar123"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(12);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 12");

			testSuiteHelper.addStateToReportBuilder(12);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(12)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(12)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Goals, attributes={class=menu_category menu_category_wallets, data-i18n=Goals, href=/plans}}, source=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=14, name=state14, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Goals");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Home, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=14, name=state14, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "ooooohhh"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_goal_balance"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_start_currency"), "United States Dollar"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_goal_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(12);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 12");

			testSuiteHelper.addStateToReportBuilder(12);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(12)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(12)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add, attributes={class=btn btn-primary btn-xs, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=17, name=state17, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., id=add_wallet_modal_form_submit, type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=17, name=state17, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Wallets, attributes={href=http://localhost:3000/wallets}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Wallets");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add, attributes={class=btn btn-primary, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=21, name=state21, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(21);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 21");

			testSuiteHelper.addStateToReportBuilder(21);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(21)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(21)
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
	public void method_19_20_21(){
		testSuiteHelper.newCurrentTestMethod("method_19_20_21");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Trash, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Trash");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=55, name=state55, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Yours");
			testSuiteHelper.runInCrawlingPlugins(55);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 55");

			testSuiteHelper.addStateToReportBuilder(55);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(55)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(55)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Shared with you, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=55, name=state55, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Shared with you");
			testSuiteHelper.runInCrawlingPlugins(56);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 56");

			testSuiteHelper.addStateToReportBuilder(56);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(56)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(56)
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
	public void method_15_22_23_24(){
		testSuiteHelper.newCurrentTestMethod("method_15_22_23_24");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(59);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 59");

			testSuiteHelper.addStateToReportBuilder(59);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(59)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(59)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Set Goal, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=14, name=state14, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Set Goal");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=5)
	public void method_25_26_27_28_29_30_31_32_33_34(){
		testSuiteHelper.newCurrentTestMethod("method_25_26_27_28_29_30_31_32_33_34");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Hide, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=64, name=state64, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Hide");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Canceling..., type=submit, value=Cancel}}, source=PerceptualImageHashStateVertexImpl{id=64, name=state64, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Manage Accesses, attributes={class=btn btn-default btn-xs item_button_accesses}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=68, name=state68, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: Manage Accesses");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Give Access}}, source=PerceptualImageHashStateVertexImpl{id=68, name=state68, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=69, name=state69, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(69);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 69");

			testSuiteHelper.addStateToReportBuilder(69);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(69)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(69)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Remove Access, attributes={class=btn btn-default btn-xs item_button_remove_access, data-id=1, href=#}}, source=PerceptualImageHashStateVertexImpl{id=69, name=state69, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=70, name=state70, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Remove Access");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=process_button btn btn-danger pull-left, data-loading-text=Removing..., type=button, value=Yes, Remove}}, source=PerceptualImageHashStateVertexImpl{id=70, name=state70, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=68, name=state68, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Give Access}}, source=PerceptualImageHashStateVertexImpl{id=68, name=state68, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=72, name=state72, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
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
	public void method_19_35(){
		testSuiteHelper.newCurrentTestMethod("method_19_35");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Trash, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Trash");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Shared with you, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Shared with you");
			testSuiteHelper.runInCrawlingPlugins(56);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 56");

			testSuiteHelper.addStateToReportBuilder(56);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(56)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(56)
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
	public void method_19_20_21(){
		testSuiteHelper.newCurrentTestMethod("method_19_20_21");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Trash, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Trash");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=55, name=state55, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Yours");
			testSuiteHelper.runInCrawlingPlugins(55);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 55");

			testSuiteHelper.addStateToReportBuilder(55);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(55)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(55)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Shared with you, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=55, name=state55, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Shared with you");
			testSuiteHelper.runInCrawlingPlugins(56);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 56");

			testSuiteHelper.addStateToReportBuilder(56);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(56)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(56)
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
	public void method_15_36(){
		testSuiteHelper.newCurrentTestMethod("method_15_36");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Set Goal, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=14, name=state14, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Set Goal");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=9)
	public void method_15_22_37_38_39_40_41_42_43_44_45_46_47_43_48(){
		testSuiteHelper.newCurrentTestMethod("method_15_22_37_38_39_40_41_42_43_44_45_46_47_43_48");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[20]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=October 2019, attributes={class=btn btn-default btn-sm  btn-info btn-block, id=goto_next, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: October 2019");
			testSuiteHelper.runInCrawlingPlugins(84);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 84");

			testSuiteHelper.addStateToReportBuilder(84);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(84)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(84)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[22]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=August 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: August 2019");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=October 2019, attributes={class=btn btn-default btn-sm btn-info, id=goto_current, type=button}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: October 2019");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[25]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=October 2019, attributes={class=btn btn-default btn-sm  btn-info btn-block, id=goto_next, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=89, name=state89, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: October 2019");
			testSuiteHelper.runInCrawlingPlugins(89);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 89");

			testSuiteHelper.addStateToReportBuilder(89);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(89)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(89)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[27]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=89, name=state89, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=August 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: August 2019");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info, id=goto_next, type=button}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(92);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 92");

			testSuiteHelper.addStateToReportBuilder(92);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(92)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(92)
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
	public void method_15_22_23_49(){
		testSuiteHelper.newCurrentTestMethod("method_15_22_23_49");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(59);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 59");

			testSuiteHelper.addStateToReportBuilder(59);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(59)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(59)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=94, name=state94, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(94);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 94");

			testSuiteHelper.addStateToReportBuilder(94);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(94)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(94)
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
	public void method_50(){
		testSuiteHelper.newCurrentTestMethod("method_50");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Shared with you, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=96, name=state96, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Shared with you");
			testSuiteHelper.runInCrawlingPlugins(96);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 96");

			testSuiteHelper.addStateToReportBuilder(96);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(96)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(96)
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
	public void method_25_26_51_52(){
		testSuiteHelper.newCurrentTestMethod("method_25_26_51_52");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Hide, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=64, name=state64, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Hide");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=process_button btn btn-danger pull-left, data-loading-text=Removing..., type=button, value=Yes, Hide It}}, source=PerceptualImageHashStateVertexImpl{id=64, name=state64, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(99);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 99");

			testSuiteHelper.addStateToReportBuilder(99);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add, attributes={class=btn btn-primary btn-xs, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=100, name=state100, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Add");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=13)
	public void method_53_27_28_29_30_31_32_33(){
		testSuiteHelper.newCurrentTestMethod("method_53_27_28_29_30_31_32_33");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(12);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(12)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(12)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Canceling..., type=submit, value=Cancel}}, source=PerceptualImageHashStateVertexImpl{id=64, name=state64, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Manage Accesses, attributes={class=btn btn-default btn-xs item_button_accesses}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=68, name=state68, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: Manage Accesses");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Give Access}}, source=PerceptualImageHashStateVertexImpl{id=68, name=state68, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=69, name=state69, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(69);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 69");

			testSuiteHelper.addStateToReportBuilder(69);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(69)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(69)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Remove Access, attributes={class=btn btn-default btn-xs item_button_remove_access, data-id=1, href=#}}, source=PerceptualImageHashStateVertexImpl{id=69, name=state69, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=70, name=state70, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "foo@bar.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Remove Access");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=process_button btn btn-danger pull-left, data-loading-text=Removing..., type=button, value=Yes, Remove}}, source=PerceptualImageHashStateVertexImpl{id=70, name=state70, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=68, name=state68, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: ");
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

	@Test(priority=14)
	public void method_25_28_29(){
		testSuiteHelper.newCurrentTestMethod("method_25_28_29");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=15)
	public void method_19_54_55_20(){
		testSuiteHelper.newCurrentTestMethod("method_19_54_55_20");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Trash, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Trash");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Both, attributes={class=origin_menu, data-origin=both, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=114, name=state114, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Both");
			testSuiteHelper.runInCrawlingPlugins(114);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 114");

			testSuiteHelper.addStateToReportBuilder(114);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(114)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(114)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Restore, attributes={class=btn btn-default btn-xs item_button_restore}}, source=PerceptualImageHashStateVertexImpl{id=114, name=state114, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Restore");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=55, name=state55, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Yours");
			testSuiteHelper.runInCrawlingPlugins(55);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 55");

			testSuiteHelper.addStateToReportBuilder(55);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(55)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(55)
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
	public void method_57_15_58(){
		testSuiteHelper.newCurrentTestMethod("method_57_15_58");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(117);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(117)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(117)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add, attributes={class=btn btn-primary btn-xs, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=117, name=state117, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=17, name=state17, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=120, name=state120, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(120);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 120");

			testSuiteHelper.addStateToReportBuilder(120);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(120)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(120)
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
	public void method_59_60_61(){
		testSuiteHelper.newCurrentTestMethod("method_59_60_61");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
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
	public void method_59_22_37_62(){
		testSuiteHelper.newCurrentTestMethod("method_59_22_37_62");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[16]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
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
	public void method_59_22_37_38_63_64(){
		testSuiteHelper.newCurrentTestMethod("method_59_22_37_38_63_64");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=128, name=state128, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(128);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 128");

			testSuiteHelper.addStateToReportBuilder(128);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(128)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(128)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[50]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=128, name=state128, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=20)
	public void method_59_22_37_38_39_65(){
		testSuiteHelper.newCurrentTestMethod("method_59_22_37_38_39_65");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[20]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=21)
	public void method_59_22_60_61_41_66(){
		testSuiteHelper.newCurrentTestMethod("method_59_22_60_61_41_66");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=October 2019, attributes={class=btn btn-default btn-sm  btn-info btn-block, id=goto_next, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: October 2019");
			testSuiteHelper.runInCrawlingPlugins(84);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 84");

			testSuiteHelper.addStateToReportBuilder(84);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(84)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(84)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[22]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=22)
	public void method_59_22_60_61_43_67_68(){
		testSuiteHelper.newCurrentTestMethod("method_59_22_60_61_43_67_68");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=August 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: August 2019");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=October 2019, attributes={class=btn btn-default btn-sm btn-info, id=goto_current, type=button}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=135, name=state135, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: October 2019");
			testSuiteHelper.runInCrawlingPlugins(135);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");

			testSuiteHelper.addStateToReportBuilder(135);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[70]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=135, name=state135, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=23)
	public void method_59_22_60_61_43_44_69(){
		testSuiteHelper.newCurrentTestMethod("method_59_22_60_61_43_44_69");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=August 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: August 2019");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=October 2019, attributes={class=btn btn-default btn-sm btn-info, id=goto_current, type=button}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: October 2019");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[25]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=24)
	public void method_59_22_60_61_46_70(){
		testSuiteHelper.newCurrentTestMethod("method_59_22_60_61_46_70");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=October 2019, attributes={class=btn btn-default btn-sm  btn-info btn-block, id=goto_next, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=89, name=state89, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: October 2019");
			testSuiteHelper.runInCrawlingPlugins(89);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 89");

			testSuiteHelper.addStateToReportBuilder(89);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(89)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(89)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[27]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=89, name=state89, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=25)
	public void method_59_22_23_71(){
		testSuiteHelper.newCurrentTestMethod("method_59_22_23_71");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(59);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 59");

			testSuiteHelper.addStateToReportBuilder(59);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(59)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(59)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[8]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=26)
	public void method_59_16(){
		testSuiteHelper.newCurrentTestMethod("method_59_16");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Wallets, attributes={href=http://localhost:3000/wallets}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Wallets");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
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
	public void method_72_51_73(){
		testSuiteHelper.newCurrentTestMethod("method_72_51_73");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=process_button btn btn-danger pull-left, data-loading-text=Removing..., type=button, value=Yes, Hide It}}, source=PerceptualImageHashStateVertexImpl{id=64, name=state64, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(99);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 99");

			testSuiteHelper.addStateToReportBuilder(99);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add, attributes={class=btn btn-primary btn-xs, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=147, name=state147, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(147);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 147");

			testSuiteHelper.addStateToReportBuilder(147);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(147)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(147)
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
	public void method_74_75(){
		testSuiteHelper.newCurrentTestMethod("method_74_75");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(117);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(117)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(117)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=117, name=state117, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=process_button btn btn-danger pull-left, data-loading-text=Removing..., type=button, value=Yes, Hide It}}, source=PerceptualImageHashStateVertexImpl{id=64, name=state64, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=29)
	public void method_25_28_29(){
		testSuiteHelper.newCurrentTestMethod("method_25_28_29");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: ");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=30)
	public void method_19_35(){
		testSuiteHelper.newCurrentTestMethod("method_19_35");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Trash, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Trash");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Shared with you, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Shared with you");
			testSuiteHelper.runInCrawlingPlugins(56);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 56");

			testSuiteHelper.addStateToReportBuilder(56);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(56)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(56)
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
	public void method_19_54_76_77(){
		testSuiteHelper.newCurrentTestMethod("method_19_54_76_77");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(18);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Trash, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Trash");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Both, attributes={class=origin_menu, data-origin=both, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=114, name=state114, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Both");
			testSuiteHelper.runInCrawlingPlugins(114);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 114");

			testSuiteHelper.addStateToReportBuilder(114);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(114)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(114)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Restore, attributes={class=btn btn-default btn-xs item_button_restore}}, source=PerceptualImageHashStateVertexImpl{id=114, name=state114, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=157, name=state157, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Restore");
			testSuiteHelper.runInCrawlingPlugins(157);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 157");

			testSuiteHelper.addStateToReportBuilder(157);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(157)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(157)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=-$40.00 Remove RestoreYours, attributes={class=list-group-item item, data-id=3, href=http://localhost:3000/wallets/3}}, source=PerceptualImageHashStateVertexImpl{id=157, name=state157, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=158, name=state158, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: -$40.00 Remove RestoreYours");
			testSuiteHelper.runInCrawlingPlugins(158);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 158");

			testSuiteHelper.addStateToReportBuilder(158);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(158)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(158)
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
	public void method_56_78(){
		testSuiteHelper.newCurrentTestMethod("method_56_78");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(117);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(117)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(117)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=117, name=state117, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=33)
	public void method_79_80(){
		testSuiteHelper.newCurrentTestMethod("method_79_80");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(117);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(117)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(117)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=3, href=http://localhost:3000/wallets/3}}, source=PerceptualImageHashStateVertexImpl{id=117, name=state117, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=163, name=state163, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(80), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(163);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 163");

			testSuiteHelper.addStateToReportBuilder(163);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(163)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(163)
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
	public void method_81_82_83(){
		testSuiteHelper.newCurrentTestMethod("method_81_82_83");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=166, name=state166, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(166);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 166");

			testSuiteHelper.addStateToReportBuilder(166);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(166)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(166)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[108]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=166, name=state166, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=35)
	public void method_81_22_60_84(){
		testSuiteHelper.newCurrentTestMethod("method_81_22_60_84");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=36)
	public void method_81_22_37_85(){
		testSuiteHelper.newCurrentTestMethod("method_81_22_37_85");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=173, name=state173, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Add Income");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=37)
	public void method_86_37_38_87_88(){
		testSuiteHelper.newCurrentTestMethod("method_86_37_38_87_88");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(174);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(174)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(174)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=174, name=state174, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(86), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=176, name=state176, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[123]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=176, name=state176, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=38)
	public void method_81_22_37_38_63_64(){
		testSuiteHelper.newCurrentTestMethod("method_81_22_37_38_63_64");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=128, name=state128, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(128);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 128");

			testSuiteHelper.addStateToReportBuilder(128);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(128)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(128)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[50]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=128, name=state128, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=39)
	public void method_81_22_60_61_43_89(){
		testSuiteHelper.newCurrentTestMethod("method_81_22_60_61_43_89");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=August 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: August 2019");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info, id=goto_next, type=button}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=181, name=state181, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(181);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 181");

			testSuiteHelper.addStateToReportBuilder(181);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(181)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(181)
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
	public void method_81_22_60_61_43_67_68(){
		testSuiteHelper.newCurrentTestMethod("method_81_22_60_61_43_67_68");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[38]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: September 2019");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=August 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=83, name=state83, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: August 2019");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=October 2019, attributes={class=btn btn-default btn-sm btn-info, id=goto_current, type=button}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=135, name=state135, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: October 2019");
			testSuiteHelper.runInCrawlingPlugins(135);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");

			testSuiteHelper.addStateToReportBuilder(135);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[70]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=135, name=state135, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=41)
	public void method_81_22_23_90(){
		testSuiteHelper.newCurrentTestMethod("method_81_22_23_90");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(59);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 59");

			testSuiteHelper.addStateToReportBuilder(59);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(59)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(59)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=185, name=state185, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(185);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 185");

			testSuiteHelper.addStateToReportBuilder(185);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(185)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(185)
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
	public void method_91_92_93(){
		testSuiteHelper.newCurrentTestMethod("method_91_92_93");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=191, name=state191, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(191);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 191");

			testSuiteHelper.addStateToReportBuilder(191);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(191)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(191)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=-$20.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=4, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=191, name=state191, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=192, name=state192, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: -$20.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(192);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 192");

			testSuiteHelper.addStateToReportBuilder(192);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(192)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(192)
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
	public void method_94_76(){
		testSuiteHelper.newCurrentTestMethod("method_94_76");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(164);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(164)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(164)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Trash, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=164, name=state164, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: Trash");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Restore, attributes={class=btn btn-default btn-xs item_button_restore}}, source=PerceptualImageHashStateVertexImpl{id=114, name=state114, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=157, name=state157, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Restore");
			testSuiteHelper.runInCrawlingPlugins(157);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 157");

			testSuiteHelper.addStateToReportBuilder(157);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(157)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(157)
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
	public void method_96_15_78(){
		testSuiteHelper.newCurrentTestMethod("method_96_15_78");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(196);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(196)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(196)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Add, attributes={class=btn btn-primary btn-xs, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=196, name=state196, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=17, name=state17, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=45)
	public void method_97_98_99(){
		testSuiteHelper.newCurrentTestMethod("method_97_98_99");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=204, name=state204, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(98), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(204);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 204");

			testSuiteHelper.addStateToReportBuilder(204);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(204)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(204)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[156]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=204, name=state204, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=46)
	public void method_97_22_82_83(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_82_83");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=166, name=state166, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(166);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 166");

			testSuiteHelper.addStateToReportBuilder(166);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(166)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(166)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[108]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=166, name=state166, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=47)
	public void method_97_22_37_100(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_37_100");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[16]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=48)
	public void method_97_22_37_38_101_102(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_37_38_101_102");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=213, name=state213, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(213);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 213");

			testSuiteHelper.addStateToReportBuilder(213);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(213)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(213)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[171]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=213, name=state213, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=49)
	public void method_97_22_37_38_87_88(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_37_38_87_88");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=176, name=state176, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[123]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=176, name=state176, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=50)
	public void method_97_22_23_71(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_23_71");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(59);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 59");

			testSuiteHelper.addStateToReportBuilder(59);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(59)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(59)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[8]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=51)
	public void method_103_104_105(){
		testSuiteHelper.newCurrentTestMethod("method_103_104_105");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=224, name=state224, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(224);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 224");

			testSuiteHelper.addStateToReportBuilder(224);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(224)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(224)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=-$20.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=4, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=224, name=state224, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=192, name=state192, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: -$20.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(192);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 192");

			testSuiteHelper.addStateToReportBuilder(192);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(192)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(192)
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
	public void method_103_28_92_106(){
		testSuiteHelper.newCurrentTestMethod("method_103_28_92_106");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=191, name=state191, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(191);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 191");

			testSuiteHelper.addStateToReportBuilder(191);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(191)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(191)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Hide, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=191, name=state191, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=227, name=state227, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: Hide");
			testSuiteHelper.runInCrawlingPlugins(227);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 227");

			testSuiteHelper.addStateToReportBuilder(227);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(227)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(227)
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
	public void method_97_107_108(){
		testSuiteHelper.newCurrentTestMethod("method_97_107_108");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Wallets, attributes={href=http://localhost:3000/wallets}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=229, name=state229, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: Wallets");
			testSuiteHelper.runInCrawlingPlugins(229);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 229");

			testSuiteHelper.addStateToReportBuilder(229);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(229)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(229)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[186]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=229, name=state229, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(108), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=54)
	public void method_109(){
		testSuiteHelper.newCurrentTestMethod("method_109");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=-$20.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=4, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=192, name=state192, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(109), "Event fired: -$20.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(192);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 192");

			testSuiteHelper.addStateToReportBuilder(192);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(192)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(192)
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
	public void method_97_22_110_111(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_110_111");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=236, name=state236, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(110), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[190]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=236, name=state236, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(111), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=56)
	public void method_97_22_98_99(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_98_99");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=204, name=state204, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(98), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(204);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 204");

			testSuiteHelper.addStateToReportBuilder(204);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(204)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(204)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[156]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=204, name=state204, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=57)
	public void method_97_22_37_38_112_113(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_37_38_112_113");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=241, name=state241, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(241);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 241");

			testSuiteHelper.addStateToReportBuilder(241);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(241)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(241)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[201]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=241, name=state241, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(113), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=58)
	public void method_97_22_37_38_101_102(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_37_38_101_102");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(80);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 80");

			testSuiteHelper.addStateToReportBuilder(80);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(80)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(80)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Income, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=80, name=state80, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Income");
			testSuiteHelper.runInCrawlingPlugins(81);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 81");

			testSuiteHelper.addStateToReportBuilder(81);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(81)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(81)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Add}}, source=PerceptualImageHashStateVertexImpl{id=81, name=state81, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=213, name=state213, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_amount"), "100"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "income description"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(213);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 213");

			testSuiteHelper.addStateToReportBuilder(213);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(213)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(213)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[171]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=September 2019, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=213, name=state213, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=129, name=state129, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: September 2019");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=59)
	public void method_97_22_23_24(){
		testSuiteHelper.newCurrentTestMethod("method_97_22_23_24");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=set total to, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: set total to");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Set}}, source=PerceptualImageHashStateVertexImpl{id=58, name=state58, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "input_total"), "5000"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(59);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 59");

			testSuiteHelper.addStateToReportBuilder(59);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(59)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(59)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Set Goal, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=14, name=state14, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Set Goal");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=60)
	public void method_103_28_104_114(){
		testSuiteHelper.newCurrentTestMethod("method_103_28_104_114");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=224, name=state224, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(224);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 224");

			testSuiteHelper.addStateToReportBuilder(224);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(224)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(224)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[4], element=Element{node=[A: null], tag=A, text=$0.00 Hide Edit Manage AccessesYours, attributes={class=list-group-item item, data-id=5, href=http://localhost:3000/wallets/5}}, source=PerceptualImageHashStateVertexImpl{id=224, name=state224, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=249, name=state249, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(114), "Event fired: $0.00 Hide Edit Manage AccessesYours");
			testSuiteHelper.runInCrawlingPlugins(249);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 249");

			testSuiteHelper.addStateToReportBuilder(249);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(249)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(249)
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
	public void method_103_28_104_115(){
		testSuiteHelper.newCurrentTestMethod("method_103_28_104_115");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=224, name=state224, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(224);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 224");

			testSuiteHelper.addStateToReportBuilder(224);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(224)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(224)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Hide, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=224, name=state224, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=227, name=state227, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(115), "Event fired: Hide");
			testSuiteHelper.runInCrawlingPlugins(227);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 227");

			testSuiteHelper.addStateToReportBuilder(227);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(227)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(227)
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
	public void method_103_28_92_116(){
		testSuiteHelper.newCurrentTestMethod("method_103_28_92_116");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(200);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(200)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(200)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Yours, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=200, name=state200, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "add_transaction_text"), "transaction"));
			formInputs.add(new FormInput(FormInput.InputType.NUMBER, new Identification(How.id, "add_transaction_amount"), "20"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Yours");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=63, name=state63, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(66);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 66");

			testSuiteHelper.addStateToReportBuilder(66);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(66)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(66)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Saving..., type=submit, value=Save}}, source=PerceptualImageHashStateVertexImpl{id=66, name=state66, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=191, name=state191, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[1]/INPUT[1]"), "Yours"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.id, "input_currency"), "United States Dollar"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(191);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 191");

			testSuiteHelper.addStateToReportBuilder(191);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(191)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(191)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=191, name=state191, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=253, name=state253, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(116), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(253);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 253");

			testSuiteHelper.addStateToReportBuilder(253);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(253)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(253)
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
