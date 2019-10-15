package com.crawljax.examples;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Identification;
import com.crawljax.forms.FormInput;
import com.crawljax.plugins.testcasegenerator.TestSuiteGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.CrawlRules.FormFillMode;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.plugins.crawloverview.CrawlOverview;

import ch.qos.logback.classic.Logger;

/**
 * Example of running Crawljax with the CrawlOverview plugin on a single-page web app. The crawl
 * will produce output using the {@link CrawlOverview} plugin. Default output dir is "out".
 */
public final class CrawlExample {

	private static final long WAIT_TIME_AFTER_EVENT = 200;
	private static final long WAIT_TIME_AFTER_RELOAD = 200;

	/**
	 * Run this method to start the crawl.
	 * 
	 * @throws IOException
	 *             when the output folder cannot be created or emptied.
	 */
	public static void main(String[] args) throws IOException {

		String URL = args[0];

		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);

		builder.crawlRules().setFormFillMode(FormFillMode.RANDOM);

		// click these elements
		builder.crawlRules().clickDefaultElements();
		 /*builder.crawlRules().click("A");
		 builder.crawlRules().click("button");*/
		builder.crawlRules().crawlHiddenAnchors(true);
		builder.crawlRules().crawlFrames(false);
		builder.setUnlimitedCrawlDepth();
		builder.setUnlimitedRuntime();
//		builder.setMaximumRunTime(5, TimeUnit.MINUTES);
		builder.setUnlimitedStates();

		InputSpecification inputSpecification = new InputSpecification();

		// addressbook
		inputSpecification.inputField(new FormInput(FormInput.InputType.TEXT,
				new Identification(Identification.How.name, "user"), "admin"));
		inputSpecification.inputField(new FormInput(FormInput.InputType.TEXT,
				new Identification(Identification.How.name, "pass"), "secret"));
		builder.crawlRules().dontClick("a").underXPath("/html[1]/body[1]/div[1]/div[5]/ul[1]/li[1]");
		builder.crawlRules().dontClick("a").underXPath("/html[1]/body[1]/div[1]/div[3]/ul[1]/li[7]");
		builder.crawlRules().dontClick("a").underXPath("/html[1]/body[1]/div[1]/div[3]/ul[1]/li[8]");
		builder.crawlRules().dontClick("button").underXPath("/html[1]/body[1]/div[1]/div[4]/form[2]/div[1]/input[1]");

		// petclinic
		inputSpecification.inputField(new FormInput(FormInput.InputType.TEXT,
				new Identification(Identification.How.name,
						"telephone"), "123456789"));
		inputSpecification.inputField(new FormInput(FormInput.InputType.TEXT,
				new Identification(Identification.How.xpath,
						"/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/UI-VIEW[1]/PET-FORM[1]/FORM[1]/DIV[3]/DIV[1]/INPUT[1]"),
				"10/11/2019"));

		builder.crawlRules().setInputSpec(inputSpecification);

		//builder.setMaximumStates(10);
		//builder.setMaximumDepth(3);
		builder.crawlRules().clickElementsInRandomOrder(false);

		// Set timeouts
		builder.crawlRules().waitAfterReloadUrl(WAIT_TIME_AFTER_RELOAD, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterEvent(WAIT_TIME_AFTER_EVENT, TimeUnit.MILLISECONDS);

		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME, 1));

		// CrawlOverview
		builder.addPlugin(new CrawlOverview());
		builder.addPlugin(new TestSuiteGenerator());

		CrawljaxRunner crawljax = new CrawljaxRunner(builder.build());
		crawljax.call();

	}

}
