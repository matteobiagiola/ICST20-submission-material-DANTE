package com.crawljax.examples.ppma;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.CrawlRules.FormFillMode;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Eventable;
import com.crawljax.core.state.Identification;
import com.crawljax.forms.FormInput;
import com.crawljax.plugins.crawloverview.CrawlOverview;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class PpmaCrawlingRules {

    /**
     * List of crawling rules for the AddressBook application.
     */
    public static void setCrawlingRules(CrawljaxConfigurationBuilder builder) {

        /* crawling rules. */
        builder.crawlRules().clickElementsInRandomOrder(true);
        builder.crawlRules().clickDefaultElements();
        builder.crawlRules().crawlHiddenAnchors(true);
        builder.crawlRules().crawlFrames(true);
        builder.crawlRules().clickOnce(true);
        builder.crawlRules().addEventType(Eventable.EventType.hover);

        builder.crawlRules().setFormFillMode(FormFillMode.RANDOM);

        /* do not click these. */
        builder.crawlRules().dontClick("a").withText("Export to CSV");
        builder.crawlRules().dontClick("input").withAttribute("id", "upload-file");
//		builder.crawlRules().dontClick("a").withText("Tags");
//		builder.crawlRules().dontClick("a").withText("Settings");
//		builder.crawlRules().dontClick("a").withText("Profile");

        //builder.crawlRules().setCrawlPriorityMode(CrawlPriorityMode.OLDEST_FIRST);

        /* set timeouts. */
        builder.setUnlimitedCrawlDepth();
        builder.setUnlimitedStates();
        builder.crawlRules().waitAfterReloadUrl(PpmaRunner.WAIT_TIME_AFTER_RELOAD, TimeUnit.MILLISECONDS);
        builder.crawlRules().waitAfterEvent(PpmaRunner.WAIT_TIME_AFTER_EVENT, TimeUnit.MILLISECONDS);

        /* set browser. */
        builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1));

        /* input data. */
        builder.crawlRules().setInputSpec(PpmaCrawlingRules.ppmaInputSpecification());

        /* CrawlOverview. */
        builder.addPlugin(new CrawlOverview());
    }

    /**
     * List of inputs to crawl the AddressBook application.
     */
    static InputSpecification ppmaInputSpecification() {

        Form loginForm = new Form();
        InputSpecification inputPpma = new InputSpecification();

        FormInput loginInput = loginForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "LoginForm_username"));
        loginInput.inputValues("admin");

        FormInput passwordInput = loginForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.id, "LoginForm_password"));
        passwordInput.inputValues("admin");

        inputPpma.setValuesInForm(loginForm).beforeClickElement("a")
                .underXPath("//*[@id='login-form']/div/div[2]/a");

        return inputPpma;
    }

}
