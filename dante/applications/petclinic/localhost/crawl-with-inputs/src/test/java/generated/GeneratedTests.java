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
 * Generated @ Thu May 09 22:24:06 CEST 2019
 */

public class GeneratedTests {

    private final String URL = "http://localhost:3000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String TEST_SUITE_PATH = "/Users/matteobiagiola/workspace/dante/applications/petclinic/localhost/crawl0/src/test/java/generated";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.ALL;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(3000, TimeUnit.MILLISECONDS);
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
					"/Users/matteobiagiola/workspace/dante/applications/petclinic/localhost/crawl0/src/test/java/generated/states.json",
					"/Users/matteobiagiola/workspace/dante/applications/petclinic/localhost/crawl0/src/test/java/generated/eventables.json",
					"/Users/matteobiagiola/workspace/dante/applications/petclinic/localhost/crawl0/screenshots",
					"/Users/matteobiagiola/workspace/dante/applications/petclinic/localhost/crawl0/test-results",
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
	public void method_1_2_3_4_5_6_7_8_9(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_3_4_5_6_7_8_9");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=true, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=true, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, class=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "RlNYwEDE"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, class=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Home");
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

	@Test(priority=3)
	public void method_10_11(){
		testSuiteHelper.newCurrentTestMethod("method_10_11");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Home");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=4)
	public void method_1_12_13_14_13_15_16_17_16_18_19_20_21(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_14_13_15_16_17_16_18_19_20_21");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c3=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=19, name=state19}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=23, name=state23}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: Add Owner");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c2=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=23, name=state23}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: < Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c2=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=27, name=state27}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(27)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(27)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c6=, class=btn btn-default}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=24, name=state24}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "McTavish"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Back");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=29, name=state29}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add New Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c7=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "RQktAypd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(30);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 30");

			testSuiteHelper.addStateToReportBuilder(30);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
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
	public void method_3_22_23_1_24_25_26_27_28_29(){
		testSuiteHelper.newCurrentTestMethod("method_3_22_23_1_24_25_26_27_28_29");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=32, name=state32}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Home");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=38, name=state38}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: < Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=42, name=state42}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(42);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 42");

			testSuiteHelper.addStateToReportBuilder(42);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(42)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(42)
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
	public void method_5_30(){
		testSuiteHelper.newCurrentTestMethod("method_5_30");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=44, name=state44}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: Home");
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

	@Test(priority=7)
	public void method_5_6_31_32_33_34_35_9(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_32_33_34_35_9");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=47, name=state47}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "IbnJPAPL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "nrpPUEfX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "SrUHEhyO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(47);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 47");

			testSuiteHelper.addStateToReportBuilder(47);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(47)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(47)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=47, name=state47}, target=StateVertexImpl{id=48, name=state48}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ETzcAJEq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "rfdgcXDJ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "KvJqjcZE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "KlKbSeOX"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=48, name=state48}, target=StateVertexImpl{id=49, name=state49}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Update");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=49, name=state49}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "aSkIqUcu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Delete");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Home");
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

	@Test(priority=8)
	public void method_5_6_7_36(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_36");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, class=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "RlNYwEDE"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Home");
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
	public void method_3_37_38_39_40_41(){
		testSuiteHelper.newCurrentTestMethod("method_3_37_38_39_40_41");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: < Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Home");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=59, name=state59}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=59, name=state59}, target=StateVertexImpl{id=44, name=state44}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Home");
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

	@Test(priority=10)
	public void method_10_42_43_44_45_46_11(){
		testSuiteHelper.newCurrentTestMethod("method_10_42_43_44_45_46_11");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=62, name=state62}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZXEXniBh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "zdYExEgH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zQgjbFNd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cPoIVwyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "GADFtbzB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=62, name=state62}, target=StateVertexImpl{id=63, name=state63}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "YFPdeGmD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "xGEXtNEu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "COguhzTm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "yFBsYtkm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "NIDaqhXe"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=63, name=state63}, target=StateVertexImpl{id=64, name=state64}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "lhkInfQi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "hpsSffRI"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zeyngiXh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "EkFKUGEC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "fpRMFfjP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "5"), "ADyrUapY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=64, name=state64}, target=StateVertexImpl{id=65, name=state65}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Update");
			testSuiteHelper.runInCrawlingPlugins(65);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 65");

			testSuiteHelper.addStateToReportBuilder(65);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(65)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(65)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=65, name=state65}, target=StateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "FWdxmllu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Home");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=11)
	public void method_1_47_48_49_50_51_52_53_30(){
		testSuiteHelper.newCurrentTestMethod("method_1_47_48_49_50_51_52_53_30");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=73, name=state73}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "pRhgsXHC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "FWIdIvRp"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "cugHbBMj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "gUqPGVLr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(73);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 73");

			testSuiteHelper.addStateToReportBuilder(73);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(73)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(73)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=73, name=state73}, target=StateVertexImpl{id=74, name=state74}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "bird"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Update");
			testSuiteHelper.runInCrawlingPlugins(74);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 74");

			testSuiteHelper.addStateToReportBuilder(74);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=74, name=state74}, target=StateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "OhkLQRAZ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Delete");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=44, name=state44}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: Home");
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

	@Test(priority=12)
	public void method_1_12_13_54(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_54");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c3=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=79, name=state79}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Back");
			testSuiteHelper.runInCrawlingPlugins(79);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 79");

			testSuiteHelper.addStateToReportBuilder(79);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(79)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(79)
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
	public void method_1_12_13_55(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_55");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=81, name=state81}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Add Owner");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=14)
	public void method_1_24_25_26_18_56(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_18_56");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=27, name=state27}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(27)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(27)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update Owner, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=84, name=state84}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "McTavish"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Update Owner");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=15)
	public void method_1_24_25_26_18_57(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_18_57");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=27, name=state27}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(27)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(27)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c6=, class=btn btn-default}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=84, name=state84}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "McTavish"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Back");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=16)
	public void method_1_24_25_26_20_58_59(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_20_58_59");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=29, name=state29}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add New Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Pet, attributes={_ngcontent-c7=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=88, name=state88}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "FpSjENBn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Save Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c6=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=89, name=state89}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "RNaMepzq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: < Back");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=17)
	public void method_3_60_42_61(){
		testSuiteHelper.newCurrentTestMethod("method_3_60_42_61");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=62, name=state62}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZXEXniBh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "zdYExEgH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zQgjbFNd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cPoIVwyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "GADFtbzB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=62, name=state62}, target=StateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: Home");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_3_22_62_63_23_64(){
		testSuiteHelper.newCurrentTestMethod("method_3_22_62_63_23_64");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=32, name=state32}, target=StateVertexImpl{id=95, name=state95}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(95);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 95");

			testSuiteHelper.addStateToReportBuilder(95);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(95)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(95)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c3=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=95, name=state95}, target=StateVertexImpl{id=32, name=state32}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: < Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=32, name=state32}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Home");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=98, name=state98}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(98);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 98");

			testSuiteHelper.addStateToReportBuilder(98);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(98)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(98)
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
	public void method_1_24_65(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_65");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=100, name=state100}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: Back");
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

	@Test(priority=20)
	public void method_1_24_25_28_66(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_28_66");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=103, name=state103}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(103);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");

			testSuiteHelper.addStateToReportBuilder(103);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
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
	public void method_5_49_67(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_67");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=44, name=state44}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Home");
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

	@Test(priority=22)
	public void method_5_6_31_68(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_68");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: Home");
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

	@Test(priority=23)
	public void method_5_6_31_69_7_70_71_36(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_69_7_70_71_36");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, class=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "RlNYwEDE"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=113, name=state113}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(113);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 113");

			testSuiteHelper.addStateToReportBuilder(113);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(113)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(113)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=113, name=state113}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Home");
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

	@Test(priority=24)
	public void method_5_6_31_32_72(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_32_72");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=47, name=state47}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "IbnJPAPL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "nrpPUEfX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "SrUHEhyO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(47);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 47");

			testSuiteHelper.addStateToReportBuilder(47);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(47)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(47)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=47, name=state47}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "HRZQCPFg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: Delete");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=25)
	public void method_5_6_31_32_33_73(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_32_33_73");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=47, name=state47}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "IbnJPAPL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "nrpPUEfX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "SrUHEhyO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(47);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 47");

			testSuiteHelper.addStateToReportBuilder(47);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(47)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(47)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=47, name=state47}, target=StateVertexImpl{id=48, name=state48}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ETzcAJEq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "rfdgcXDJ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "KvJqjcZE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "KlKbSeOX"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c6=, class=btn btn-default}}, source=StateVertexImpl{id=48, name=state48}, target=StateVertexImpl{id=120, name=state120}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: Cancel");
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

	@Test(priority=26)
	public void method_5_6_31_32_33_34(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_32_33_34");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=47, name=state47}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "IbnJPAPL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "nrpPUEfX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "SrUHEhyO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(47);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 47");

			testSuiteHelper.addStateToReportBuilder(47);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(47)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(47)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=47, name=state47}, target=StateVertexImpl{id=48, name=state48}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ETzcAJEq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "rfdgcXDJ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "KvJqjcZE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "KlKbSeOX"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=48, name=state48}, target=StateVertexImpl{id=49, name=state49}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Update");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=27)
	public void method_5_6_7_70_71_74(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_70_71_74");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, class=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "RlNYwEDE"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=113, name=state113}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(113);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 113");

			testSuiteHelper.addStateToReportBuilder(113);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(113)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(113)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=113, name=state113}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, class=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=49, name=state49}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: Specialties");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=28)
	public void method_3_37_75_76_77_78_79(){
		testSuiteHelper.newCurrentTestMethod("method_3_37_75_76_77_78_79");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=128, name=state128}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Save Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=128, name=state128}, target=StateVertexImpl{id=129, name=state129}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=129, name=state129}, target=StateVertexImpl{id=130, name=state130}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Linda"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Leary"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(130);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 130");

			testSuiteHelper.addStateToReportBuilder(130);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(130)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(130)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=130, name=state130}, target=StateVertexImpl{id=131, name=state131}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: Delete Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=131, name=state131}, target=StateVertexImpl{id=132, name=state132}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(132);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 132");

			testSuiteHelper.addStateToReportBuilder(132);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(132)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(132)
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
	public void method_3_37_38_80(){
		testSuiteHelper.newCurrentTestMethod("method_3_37_38_80");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: < Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=134, name=state134}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(80), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(134);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 134");

			testSuiteHelper.addStateToReportBuilder(134);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(134)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(134)
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
	public void method_40_81_82_83(){
		testSuiteHelper.newCurrentTestMethod("method_40_81_82_83");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=59, name=state59}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=59, name=state59}, target=StateVertexImpl{id=71, name=state71}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=49, name=state49}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: Specialties");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=31)
	public void method_10_42_84_46(){
		testSuiteHelper.newCurrentTestMethod("method_10_42_84_46");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=62, name=state62}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZXEXniBh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "zdYExEgH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zQgjbFNd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cPoIVwyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "GADFtbzB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=62, name=state62}, target=StateVertexImpl{id=65, name=state65}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "GYRoWERi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(65);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 65");

			testSuiteHelper.addStateToReportBuilder(65);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(65)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(65)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=65, name=state65}, target=StateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "FWdxmllu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
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
	public void method_10_42_43_85(){
		testSuiteHelper.newCurrentTestMethod("method_10_42_43_85");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=62, name=state62}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZXEXniBh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "zdYExEgH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zQgjbFNd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cPoIVwyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "GADFtbzB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=62, name=state62}, target=StateVertexImpl{id=63, name=state63}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "YFPdeGmD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "xGEXtNEu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "COguhzTm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "yFBsYtkm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "NIDaqhXe"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=63, name=state63}, target=StateVertexImpl{id=16, name=state16}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "jPouyMcp"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
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
	public void method_10_42_43_44_86(){
		testSuiteHelper.newCurrentTestMethod("method_10_42_43_44_86");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=62, name=state62}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZXEXniBh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "zdYExEgH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zQgjbFNd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cPoIVwyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "GADFtbzB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=62, name=state62}, target=StateVertexImpl{id=63, name=state63}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "YFPdeGmD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "xGEXtNEu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "COguhzTm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "yFBsYtkm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "NIDaqhXe"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=63, name=state63}, target=StateVertexImpl{id=64, name=state64}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "lhkInfQi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "hpsSffRI"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zeyngiXh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "EkFKUGEC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "fpRMFfjP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "5"), "ADyrUapY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=64, name=state64}, target=StateVertexImpl{id=146, name=state146}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(86), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(146);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 146");

			testSuiteHelper.addStateToReportBuilder(146);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(146)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(146)
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
	public void method_1_87(){
		testSuiteHelper.newCurrentTestMethod("method_1_87");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: Pet Types");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=35)
	public void method_5_49_50_88(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_50_88");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "neCgxMmP"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: Delete");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=36)
	public void method_5_49_50_89_90(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_50_89_90");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=153, name=state153}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ewZoPltz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "BbCiBqch"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(153);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 153");

			testSuiteHelper.addStateToReportBuilder(153);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(153)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(153)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=153, name=state153}, target=StateVertexImpl{id=154, name=state154}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "bird"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(154);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 154");

			testSuiteHelper.addStateToReportBuilder(154);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(154)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(154)
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
	public void method_5_49_50_51_91_92(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_50_51_91_92");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=73, name=state73}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "pRhgsXHC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "FWIdIvRp"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "cugHbBMj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "gUqPGVLr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(73);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 73");

			testSuiteHelper.addStateToReportBuilder(73);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(73)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(73)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=73, name=state73}, target=StateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "bird"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=156, name=state156}, target=StateVertexImpl{id=157, name=state157}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "tgnVjGLG"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "nnQfhLyO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: Edit");
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

	@Test(priority=38)
	public void method_5_49_50_51_52_93_94(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_50_51_52_93_94");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=73, name=state73}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "pRhgsXHC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "FWIdIvRp"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "cugHbBMj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "gUqPGVLr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(73);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 73");

			testSuiteHelper.addStateToReportBuilder(73);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(73)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(73)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=73, name=state73}, target=StateVertexImpl{id=74, name=state74}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "bird"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Update");
			testSuiteHelper.runInCrawlingPlugins(74);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 74");

			testSuiteHelper.addStateToReportBuilder(74);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=74, name=state74}, target=StateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "lCjYZEAm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "nufJMVny"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "FZLPlaZc"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=156, name=state156}, target=StateVertexImpl{id=154, name=state154}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "kXHvarAZ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "PlOZsXKI"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(154);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 154");

			testSuiteHelper.addStateToReportBuilder(154);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(154)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(154)
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
	public void method_1_12_13_95(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_95");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=163, name=state163}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(95), "Event fired: Add Owner");
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

	@Test(priority=40)
	public void method_1_12_13_96(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_96");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=165, name=state165}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(165);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 165");

			testSuiteHelper.addStateToReportBuilder(165);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(165)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(165)
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
	public void method_1_24_25_26_97_98(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_97_98");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=167, name=state167}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(167);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 167");

			testSuiteHelper.addStateToReportBuilder(167);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(167)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(167)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Pet, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=167, name=state167}, target=StateVertexImpl{id=168, name=state168}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "rWGmMrGj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(98), "Event fired: Save Pet");
			testSuiteHelper.runInCrawlingPlugins(168);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 168");

			testSuiteHelper.addStateToReportBuilder(168);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(168)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(168)
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
	public void method_1_24_25_26_18_56(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_18_56");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=27, name=state27}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(27)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(27)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update Owner, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=84, name=state84}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "McTavish"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Update Owner");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=43)
	public void method_1_24_25_26_20_99(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_20_99");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=29, name=state29}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add New Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c7=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=89, name=state89}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "wCBHQaYk"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: < Back");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=44)
	public void method_1_24_25_26_20_58_100(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_20_58_100");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=29, name=state29}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add New Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Pet, attributes={_ngcontent-c7=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=88, name=state88}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "FpSjENBn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Save Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Pet, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=168, name=state168}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "ncuqisud"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: Save Pet");
			testSuiteHelper.runInCrawlingPlugins(168);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 168");

			testSuiteHelper.addStateToReportBuilder(168);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(168)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(168)
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
	public void method_3_4(){
		testSuiteHelper.newCurrentTestMethod("method_3_4");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=true, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Veterinarians");
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

	@Test(priority=46)
	public void method_3_22_101_102_103_104_105(){
		testSuiteHelper.newCurrentTestMethod("method_3_22_101_102_103_104_105");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=32, name=state32}, target=StateVertexImpl{id=178, name=state178}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(178);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 178");

			testSuiteHelper.addStateToReportBuilder(178);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(178)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(178)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=178, name=state178}, target=StateVertexImpl{id=179, name=state179}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(179);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 179");

			testSuiteHelper.addStateToReportBuilder(179);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(179)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(179)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=179, name=state179}, target=StateVertexImpl{id=129, name=state129}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=129, name=state129}, target=StateVertexImpl{id=181, name=state181}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Linda"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Leary"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: Save Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=181, name=state181}, target=StateVertexImpl{id=182, name=state182}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: Delete Vet");
			testSuiteHelper.runInCrawlingPlugins(182);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 182");

			testSuiteHelper.addStateToReportBuilder(182);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(182)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(182)
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
	public void method_3_22_62_106_107(){
		testSuiteHelper.newCurrentTestMethod("method_3_22_62_106_107");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=32, name=state32}, target=StateVertexImpl{id=95, name=state95}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(95);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 95");

			testSuiteHelper.addStateToReportBuilder(95);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(95)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(95)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=95, name=state95}, target=StateVertexImpl{id=179, name=state179}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(179);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 179");

			testSuiteHelper.addStateToReportBuilder(179);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(179)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(179)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=179, name=state179}, target=StateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: Delete Vet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=48)
	public void method_1_24_108(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_108");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=187, name=state187}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(108), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(187);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 187");

			testSuiteHelper.addStateToReportBuilder(187);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(187)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(187)
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
	public void method_1_24_25_109(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_109");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=84, name=state84}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(109), "Event fired: Jean Coleman");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=50)
	public void method_5_6_31_110_111(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_110_111");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=191, name=state191}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ADiQFYjF"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(110), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=191, name=state191}, target=StateVertexImpl{id=192, name=state192}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "OmvJRNvK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "XmoBZqQi"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(111), "Event fired: Edit");
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

	@Test(priority=51)
	public void method_5_6_31_32_112(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_32_112");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=47, name=state47}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "IbnJPAPL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "nrpPUEfX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "SrUHEhyO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(47);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 47");

			testSuiteHelper.addStateToReportBuilder(47);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(47)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(47)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=47, name=state47}, target=StateVertexImpl{id=194, name=state194}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "YsZzaypi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "JoBsxmzy"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "eYbijwqg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(112), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(194);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 194");

			testSuiteHelper.addStateToReportBuilder(194);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(194)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(194)
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
	public void method_5_6_31_32_33_113_114_115(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_31_32_33_113_114_115");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "zNcHNPMu"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ldimPfNE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "eUWylVxd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OnFZXYBL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=47, name=state47}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "IbnJPAPL"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "nrpPUEfX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "SrUHEhyO"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(47);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 47");

			testSuiteHelper.addStateToReportBuilder(47);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(47)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(47)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=47, name=state47}, target=StateVertexImpl{id=48, name=state48}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ETzcAJEq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "rfdgcXDJ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "KvJqjcZE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "KlKbSeOX"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=48, name=state48}, target=StateVertexImpl{id=196, name=state196}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(113), "Event fired: Update");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=196, name=state196}, target=StateVertexImpl{id=197, name=state197}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "JBnwlvsX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "ntzDNBZr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "aCkOLeuQ"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "fIpSAxnT"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(114), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(197);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 197");

			testSuiteHelper.addStateToReportBuilder(197);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(197)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(197)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=197, name=state197}, target=StateVertexImpl{id=198, name=state198}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "llPwCaSb"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "cTXXlsHV"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "cTQOXYyt"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(115), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(198);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 198");

			testSuiteHelper.addStateToReportBuilder(198);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(198)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(198)
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
	public void method_3_37_38_39(){
		testSuiteHelper.newCurrentTestMethod("method_3_37_38_39");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: < Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Home");
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

	@Test(priority=54)
	public void method_3_37_75_116_117(){
		testSuiteHelper.newCurrentTestMethod("method_3_37_75_116_117");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=128, name=state128}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Save Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=128, name=state128}, target=StateVertexImpl{id=57, name=state57}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(116), "Event fired: Delete Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=204, name=state204}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(117), "Event fired: Add Vet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=55)
	public void method_3_37_75_76_77_118(){
		testSuiteHelper.newCurrentTestMethod("method_3_37_75_76_77_118");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=128, name=state128}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Save Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=128, name=state128}, target=StateVertexImpl{id=129, name=state129}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=129, name=state129}, target=StateVertexImpl{id=130, name=state130}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Linda"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Leary"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(130);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 130");

			testSuiteHelper.addStateToReportBuilder(130);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(130)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(130)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=130, name=state130}, target=StateVertexImpl{id=207, name=state207}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(118), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(207);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 207");

			testSuiteHelper.addStateToReportBuilder(207);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(207)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(207)
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
	public void method_3_37_75_76_77_118(){
		testSuiteHelper.newCurrentTestMethod("method_3_37_75_76_77_118");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=128, name=state128}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Save Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=128, name=state128}, target=StateVertexImpl{id=129, name=state129}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=129, name=state129}, target=StateVertexImpl{id=130, name=state130}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Linda"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Leary"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(130);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 130");

			testSuiteHelper.addStateToReportBuilder(130);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(130)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(130)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=130, name=state130}, target=StateVertexImpl{id=207, name=state207}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(118), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(207);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 207");

			testSuiteHelper.addStateToReportBuilder(207);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(207)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(207)
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
	public void method_3_37_75_76_77_78_119(){
		testSuiteHelper.newCurrentTestMethod("method_3_37_75_76_77_78_119");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet']/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=128, name=state128}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Sharon"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Ortega"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), "dentistry"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Save Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=128, name=state128}, target=StateVertexImpl{id=129, name=state129}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Edit Vet");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=129, name=state129}, target=StateVertexImpl{id=130, name=state130}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Linda"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Leary"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(130);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 130");

			testSuiteHelper.addStateToReportBuilder(130);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(130)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(130)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=130, name=state130}, target=StateVertexImpl{id=131, name=state131}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: Delete Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=131, name=state131}, target=StateVertexImpl{id=207, name=state207}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(119), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(207);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 207");

			testSuiteHelper.addStateToReportBuilder(207);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(207)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(207)
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
	public void method_40_41(){
		testSuiteHelper.newCurrentTestMethod("method_40_41");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=59, name=state59}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=59, name=state59}, target=StateVertexImpl{id=44, name=state44}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Home");
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
	public void method_10_42_120_121(){
		testSuiteHelper.newCurrentTestMethod("method_10_42_120_121");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=62, name=state62}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZXEXniBh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "zdYExEgH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zQgjbFNd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cPoIVwyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "GADFtbzB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=62, name=state62}, target=StateVertexImpl{id=216, name=state216}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "SJRJFhGX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "VavRGnBE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "xboaSsRR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(120), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(216);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 216");

			testSuiteHelper.addStateToReportBuilder(216);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(216)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(216)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=216, name=state216}, target=StateVertexImpl{id=217, name=state217}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "VgcJBVhb"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "BJhqKAML"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zFJEYukw"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "RAFkWaNe"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(121), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(217);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 217");

			testSuiteHelper.addStateToReportBuilder(217);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(217)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(217)
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
	public void method_10_42_43_122(){
		testSuiteHelper.newCurrentTestMethod("method_10_42_43_122");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=62, name=state62}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZXEXniBh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "zdYExEgH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zQgjbFNd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cPoIVwyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "GADFtbzB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=62, name=state62}, target=StateVertexImpl{id=63, name=state63}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "YFPdeGmD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "xGEXtNEu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "COguhzTm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "yFBsYtkm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "NIDaqhXe"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=63, name=state63}, target=StateVertexImpl{id=219, name=state219}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "BWiWuqXA"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "BgfjUqtm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "BAvJzwFP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "xwrwjpBO"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "UXgVONyD"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(122), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(219);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 219");

			testSuiteHelper.addStateToReportBuilder(219);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(219)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(219)
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
	public void method_10_42_43_44_123_124_125(){
		testSuiteHelper.newCurrentTestMethod("method_10_42_43_44_123_124_125");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=62, name=state62}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZXEXniBh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "zdYExEgH"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zQgjbFNd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cPoIVwyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "GADFtbzB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=62, name=state62}, target=StateVertexImpl{id=63, name=state63}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "radiology"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "YFPdeGmD"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "xGEXtNEu"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "COguhzTm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "yFBsYtkm"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "NIDaqhXe"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=63, name=state63}, target=StateVertexImpl{id=64, name=state64}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "lhkInfQi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "hpsSffRI"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zeyngiXh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "EkFKUGEC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "fpRMFfjP"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "5"), "ADyrUapY"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'specialty']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=64, name=state64}, target=StateVertexImpl{id=221, name=state221}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "surgery"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(123), "Event fired: Update");
			testSuiteHelper.runInCrawlingPlugins(221);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 221");

			testSuiteHelper.addStateToReportBuilder(221);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(221)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(221)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[2]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=221, name=state221}, target=StateVertexImpl{id=222, name=state222}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "etSLbNMf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "sDDewaGX"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "zWBqgsGd"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "enJwVbRW"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "MBlOVleo"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "5"), "ZTitaKbR"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(124), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(222);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 222");

			testSuiteHelper.addStateToReportBuilder(222);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(222)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(222)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=222, name=state222}, target=StateVertexImpl{id=223, name=state223}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ZncmlydY"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "mmpPwbBi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "OccLlOfU"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "lTNQBgAr"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "JhorwuUx"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(125), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(223);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 223");

			testSuiteHelper.addStateToReportBuilder(223);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(223)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(223)
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
	public void method_1_126_127_128(){
		testSuiteHelper.newCurrentTestMethod("method_1_126_127_128");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=222, name=state222}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(126), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(222);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 222");

			testSuiteHelper.addStateToReportBuilder(222);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(222)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(222)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[3]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=222, name=state222}, target=StateVertexImpl{id=226, name=state226}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "dKiCmkVg"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "LAFdEtwk"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "gdCmebro"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "cZvCyirB"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "4"), "CmxUKeWi"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(127), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(226);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 226");

			testSuiteHelper.addStateToReportBuilder(226);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(226)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(226)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'specialties']/TBODY[1]/TR[4]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=226, name=state226}, target=StateVertexImpl{id=227, name=state227}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "XEFkfEdR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "lUdInSMo"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "nOiiSUOR"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "nvUqvmjL"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(128), "Event fired: Edit");
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

	@Test(priority=63)
	public void method_5_49_67(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_67");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=44, name=state44}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Home");
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

	@Test(priority=64)
	public void method_5_49_50_129(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_50_129");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=154, name=state154}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "OhNDSVdw"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "HwILOgLQ"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(129), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(154);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 154");

			testSuiteHelper.addStateToReportBuilder(154);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(154)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(154)
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
	public void method_5_49_50_89_130_131(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_50_89_130_131");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=153, name=state153}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "ewZoPltz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "BbCiBqch"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(153);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 153");

			testSuiteHelper.addStateToReportBuilder(153);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(153)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(153)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=153, name=state153}, target=StateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "bird"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(130), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=156, name=state156}, target=StateVertexImpl{id=234, name=state234}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "fPscyZkp"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "qmXyKuLK"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(131), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(234);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 234");

			testSuiteHelper.addStateToReportBuilder(234);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(234)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(234)
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
	public void method_5_49_50_51_132_133(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_50_51_132_133");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=73, name=state73}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "pRhgsXHC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "FWIdIvRp"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "cugHbBMj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "gUqPGVLr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(73);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 73");

			testSuiteHelper.addStateToReportBuilder(73);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(73)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(73)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=73, name=state73}, target=StateVertexImpl{id=236, name=state236}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "bird"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(132), "Event fired: Update");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=236, name=state236}, target=StateVertexImpl{id=237, name=state237}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "laUddovi"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "ilAQcrZg"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "WJSHyAel"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(133), "Event fired: Edit");
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

	@Test(priority=67)
	public void method_5_49_50_51_91_134_135(){
		testSuiteHelper.newCurrentTestMethod("method_5_49_50_51_91_134_135");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=71, name=state71}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "LqCKYETe"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "UHhmApJE"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "XAyRLGBf"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "cat"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "PyYXNCQK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "dKrgQzPf"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "sFDFRTmg"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=73, name=state73}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "pRhgsXHC"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "FWIdIvRp"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "cugHbBMj"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "gUqPGVLr"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(73);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 73");

			testSuiteHelper.addStateToReportBuilder(73);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(73)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(73)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'pettype']/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=73, name=state73}, target=StateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/DIV[1]/INPUT[1]"), "bird"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[2]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=156, name=state156}, target=StateVertexImpl{id=236, name=state236}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "DfqbauJo"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "PROwcKyq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "GISVBAzG"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "3"), "bWzzuGMR"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(134), "Event fired: Delete");
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
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'pettypes']/TBODY[1]/TR[3]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=236, name=state236}, target=StateVertexImpl{id=240, name=state240}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "0"), "oxNOBeSz"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "1"), "tSvlHqiY"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "2"), "UACguMqB"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(135), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
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
	public void method_1_12_13_136(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_136");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=243, name=state243}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(136), "Event fired: Add Owner");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=69)
	public void method_1_12_13_137(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_137");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=245, name=state245}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(137), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(245);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 245");

			testSuiteHelper.addStateToReportBuilder(245);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(245)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(245)
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
	public void method_1_24_25_26_97_138(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_97_138");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=167, name=state167}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(167);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 167");

			testSuiteHelper.addStateToReportBuilder(167);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(167)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(167)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Pet, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=167, name=state167}, target=StateVertexImpl{id=247, name=state247}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "mMxOqZeh"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(138), "Event fired: Save Pet");
			testSuiteHelper.runInCrawlingPlugins(247);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 247");

			testSuiteHelper.addStateToReportBuilder(247);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(247)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(247)
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
	public void method_1_24_25_26_18_56(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_18_56");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=27, name=state27}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(27)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(27)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update Owner, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=84, name=state84}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "McTavish"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Update Owner");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=72)
	public void method_1_24_25_26_20_139(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_20_139");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=29, name=state29}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add New Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Pet, attributes={_ngcontent-c7=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=247, name=state247}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "ZoaGElRK"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(139), "Event fired: Save Pet");
			testSuiteHelper.runInCrawlingPlugins(247);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 247");

			testSuiteHelper.addStateToReportBuilder(247);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(247)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(247)
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
	public void method_1_24_25_26_20_58_59(){
		testSuiteHelper.newCurrentTestMethod("method_1_24_25_26_20_58_59");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Jean"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Coleman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "1450 Oak Blvd."));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "Sun Prairie"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "6085551749"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Jean Coleman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=24, name=state24}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Jean Coleman");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=29, name=state29}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add New Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Pet, attributes={_ngcontent-c7=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=88, name=state88}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "FpSjENBn"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Save Pet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c6=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=89, name=state89}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "owner_name"), "RNaMepzq"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Max"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.name, "birthDate"), "1995-09-04"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/DIV[1]/SELECT[1]"), "lizard "));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: < Back");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=74)
	public void method_3_140_141_142(){
		testSuiteHelper.newCurrentTestMethod("method_3_140_141_142");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=179, name=state179}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(179);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 179");

			testSuiteHelper.addStateToReportBuilder(179);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(179)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(179)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=179, name=state179}, target=StateVertexImpl{id=256, name=state256}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(141), "Event fired: Edit Vet");
			testSuiteHelper.runInCrawlingPlugins(256);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 256");

			testSuiteHelper.addStateToReportBuilder(256);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(256)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(256)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'vet_form']/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c3=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=256, name=state256}, target=StateVertexImpl{id=257, name=state257}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"), "Linda"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"), "Leary"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(142), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(257);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 257");

			testSuiteHelper.addStateToReportBuilder(257);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(257)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(257)
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
	public void method_3_140_107(){
		testSuiteHelper.newCurrentTestMethod("method_3_140_107");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=179, name=state179}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(140), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(179);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 179");

			testSuiteHelper.addStateToReportBuilder(179);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(179)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(179)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //TABLE[@id = 'vets']/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=179, name=state179}, target=StateVertexImpl{id=32, name=state32}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: Delete Vet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}


}	 
