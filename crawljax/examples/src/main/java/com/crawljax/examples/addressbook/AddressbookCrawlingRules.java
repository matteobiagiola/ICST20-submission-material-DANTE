package com.crawljax.examples.addressbook;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.CrawlRules.FormFillMode;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.plugins.crawloverview.CrawlOverview;

import java.util.concurrent.TimeUnit;

public class AddressbookCrawlingRules {

    /**
     * List of crawling rules for the AddressBook application.
     */
    public static void setCrawlingRules(CrawljaxConfigurationBuilder builder) {

        /* crawling rules. */
        builder.crawlRules().clickElementsInRandomOrder(false);
        builder.crawlRules().clickDefaultElements();
        builder.crawlRules().crawlHiddenAnchors(true);
        builder.crawlRules().crawlFrames(false);
        builder.crawlRules().clickOnce(false);

        builder.crawlRules().setFormFillMode(FormFillMode.RANDOM);

        /* do not click these. */
        builder.crawlRules().dontClick("a").withText("php-addressbook");
        builder.crawlRules().dontClick("a").withText("v8.2.5");

        /* set timeouts. */
        builder.setUnlimitedCrawlDepth();
//        builder.setMaximumRunTime(5, TimeUnit.MINUTES);
        builder.setUnlimitedStates();
        builder.crawlRules().waitAfterReloadUrl(AddressbookRunner.WAIT_TIME_AFTER_RELOAD, TimeUnit.MILLISECONDS);
        builder.crawlRules().waitAfterEvent(AddressbookRunner.WAIT_TIME_AFTER_EVENT, TimeUnit.MILLISECONDS);

        /* set browser. */
        builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1));

        /* input data. */
        builder.crawlRules().setInputSpec(AddressbookCrawlingRules.AddressBookInputSpecification());

        /* CrawlOverview. */
        builder.addPlugin(new CrawlOverview());
//        builder.addPlugin(new AddressbookCleanup());
    }

    /**
     * List of inputs to crawl the AddressBook application.
     */
    static InputSpecification AddressBookInputSpecification() {

        InputSpecification inputAddressBook = new InputSpecification();

        AddressbookForms.login(inputAddressBook);
        AddressbookForms.searchForm(inputAddressBook);
        AddressbookForms.newEntry(inputAddressBook);
        AddressbookForms.newUser(inputAddressBook);
        AddressbookForms.newGroup(inputAddressBook);

        return inputAddressBook;
    }

}
