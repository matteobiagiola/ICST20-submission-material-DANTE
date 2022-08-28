package com.crawljax.examples.petclinic;

import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.examples.claroline.ClarolineRunner;
import com.crawljax.plugins.crawloverview.CrawlOverview;
import com.crawljax.stateabstractions.embedding.Word2VecEmbeddingStateVertexFactory;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * Crawljax runner for the Angular Phonecat web application. The crawl will
 * produce output using the {@link CrawlOverview} plugin.
 *
 */
public final class PetclinicRunner {
    private final static Logger logger = Logger.getLogger(PetclinicRunner.class.getName());


    static final long WAIT_TIME_AFTER_EVENT = 1000;
    static final long WAIT_TIME_AFTER_RELOAD = 1000;
    public static final String URL = "http://localhost:9966/petclinic/";

    /**
     * Run this method to start the crawl.
     *
     * @throws IOException when the output folder cannot be created or emptied.
     */
    public static void main(String[] args) throws IOException {

        CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);

        PetclinicCrawlingRules.setCrawlingRules(builder);


        builder = CrawljaxConfiguration.builderFor(URL);
        PetclinicCrawlingRules.setCrawlingRules(builder);

        long max_runtime = 0;
        if (args.length == 1) {
            max_runtime = Long.parseLong(args[0]);
            builder.setMaximumRunTime(max_runtime, TimeUnit.MINUTES);
        }
        builder.setStateVertexFactory(new Word2VecEmbeddingStateVertexFactory());

        CrawljaxRunner crawljax = new CrawljaxRunner(builder.build());

        Instant start = Instant.now();
        try {
            crawljax.call();
            crawljax.stop();
        } catch (Exception ex) {
            logger.error("Exception in crawljax: " + ex);
        }

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMinutes();
        System.out.println("timeElapsed (min): " + timeElapsed);
        System.out.println("efficacy: " + timeElapsed / max_runtime * 100);


    }

}
