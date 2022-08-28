package com.crawljax.examples;

import com.crawljax.browser.EmbeddedBrowser;
import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.CrawlRules;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.plugins.crawloverview.CrawlOverview;
import com.crawljax.stateabstractions.embedding.Word2VecEmbeddingStateVertexFactory;

import java.util.concurrent.TimeUnit;

public class EmbeddingExample {
    private static final long WAIT_TIME_AFTER_EVENT = 500;
    private static final long WAIT_TIME_AFTER_RELOAD = 500;
    //    private static final String URL = "http://localhost:9966/petclinic/";  // http://localhost:3000/
    private static final String URL = "http://localhost/addressbook-mod/addressbook/";

    public static void main(String[] args) throws Exception {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
//      1. set crawl rules
        builder.crawlRules().setFormFillMode(CrawlRules.FormFillMode.RANDOM);
        builder.crawlRules().clickDefaultElements();
        builder.crawlRules().crawlHiddenAnchors(true);
        builder.crawlRules().crawlFrames(true);
        builder.crawlRules().clickElementsInRandomOrder(false);
        builder.crawlRules().setCrawlNearDuplicates(false);
        builder.setUnlimitedStates();
        builder.setMaximumRunTime(5, TimeUnit.MINUTES);
        builder.setUnlimitedCrawlDepth();
//        System.out.println(builder.config.getStateVertexFactory());
//        builder.setStateVertexFactory(new RTEDStateVertexFactory(0.04099));
        builder.setStateVertexFactory(new Word2VecEmbeddingStateVertexFactory());
//        builder.setStateVertexFactory(new ColorHistogramStateVertexFactory());
        builder.crawlRules().waitAfterReloadUrl(WAIT_TIME_AFTER_RELOAD, TimeUnit.MILLISECONDS);
        builder.crawlRules().waitAfterEvent(WAIT_TIME_AFTER_EVENT, TimeUnit.MILLISECONDS);
        builder.setBrowserConfig(new BrowserConfiguration(EmbeddedBrowser.BrowserType.CHROME, 1));
        builder.addPlugin(new CrawlOverview());

        CrawljaxRunner crawljax = new CrawljaxRunner(builder.build());
        crawljax.call();

    }
}
