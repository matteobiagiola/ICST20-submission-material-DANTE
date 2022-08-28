package com.crawljax.examples.mrbs;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.CrawlRules.FormFillMode;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.plugins.crawloverview.CrawlOverview;

import java.util.concurrent.TimeUnit;

public class MrbsCrawlingRules {

    /**
     * List of crawling rules for the MRBS application.
     */
    public static void setCrawlingRules(CrawljaxConfigurationBuilder builder) {

        /* crawling rules. */
        builder.crawlRules().clickElementsInRandomOrder(false);
        builder.crawlRules().clickDefaultElements();
        builder.crawlRules().crawlHiddenAnchors(true);
        builder.crawlRules().crawlFrames(false);
        builder.crawlRules().clickOnce(false);
//		builder.crawlRules().addEventType(EventType.hover);

        builder.crawlRules().setFormFillMode(FormFillMode.RANDOM);

//		builder.crawlRules().click("a", "button", "input");

        /* do not click these. */
//		builder.crawlRules().dontClick("a").withText("php-MRBS");
//		builder.crawlRules().dontClick("a").withText("v9.0.0.1");
//		builder.crawlRules().dontClick("a").withText("map");
//		builder.crawlRules().dontClick("a").withText("export");
//		builder.crawlRules().dontClick("a").withText("import");

        //builder.crawlRules().setCrawlPriorityMode(CrawlPriorityMode.OLDEST_FIRST);

        /* set timeouts. */
        builder.setUnlimitedCrawlDepth();
        // builder.setMaximumRunTime(30, TimeUnit.MINUTES);
        builder.setUnlimitedStates();
        //builder.setMaximumStates(150);
        //builder.setUnlimitedRuntime();
//		builder.setMaximumRunTime(5, TimeUnit.MINUTES);
        builder.crawlRules().waitAfterReloadUrl(MrbsRunner.WAIT_TIME_AFTER_RELOAD, TimeUnit.MILLISECONDS);
        builder.crawlRules().waitAfterEvent(MrbsRunner.WAIT_TIME_AFTER_EVENT, TimeUnit.MILLISECONDS);

        /* set browser. */
        builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1));

        /* input data. */
        builder.crawlRules().setInputSpec(MrbsCrawlingRules.mrbsInputSpecification());

        /* CrawlOverview. */
        builder.addPlugin(new CrawlOverview());
    }

    /**
     * List of inputs to crawl the MRBS application.
     */
    static InputSpecification mrbsInputSpecification() {

        InputSpecification inputMrbs = new InputSpecification();

        MrbsForms.login(inputMrbs);

        return inputMrbs;
    }

}
