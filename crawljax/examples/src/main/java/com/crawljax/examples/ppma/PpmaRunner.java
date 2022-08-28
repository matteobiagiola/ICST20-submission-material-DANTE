package com.crawljax.examples.ppma;

import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.plugins.crawloverview.CrawlOverview;
import com.crawljax.stateabstractions.dom.RTEDStateVertexFactory;
import com.crawljax.stateabstractions.embedding.Word2VecEmbeddingStateVertexFactory;
import com.crawljax.stateabstractions.visual.PDiffStateVertexFactory;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;


/**
 * Crawljax runner for the PPMA web application. The crawl will produce
 * output using the {@link CrawlOverview} plugin.
 */
public final class PpmaRunner {

    private final static Logger logger = Logger.getLogger(PpmaRunner.class.getName());

    static final long WAIT_TIME_AFTER_EVENT = 1000;
    static final long WAIT_TIME_AFTER_RELOAD = 1000;

    public final static String URL = "http://localhost:3000/ppma/";

    static final long MAX_RUNTIME = 5;  // minutes

    /**
     * Run this method to start the crawl.
     *
     * @throws IOException when the output folder cannot be created or emptied.
     */
    public static void main(String[] args) throws IOException {

        CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
        PpmaCrawlingRules.setCrawlingRules(builder);
        builder.setMaximumRunTime(MAX_RUNTIME, TimeUnit.MINUTES);

        // SAFs.
//        builder.setStateVertexFactory(new Word2VecEmbeddingStateVertexFactory());
        builder.setStateVertexFactory(new RTEDStateVertexFactory(0.04099));
//        builder.setStateVertexFactory(new PDiffStateVertexFactory(0.20080));

        File customOutput = new File("out" + File.separator + "ppma-acrossapp-rted");
        builder.setOutputDirectory(customOutput);

        CrawljaxRunner crawljax = new CrawljaxRunner(builder.build());
        Instant start = Instant.now();
        try {
            crawljax.call();
            crawljax.stop();
        } catch (Exception ex) {
            logger.error("Exception in Crawljax: " + ex);
        }

        Instant finish = Instant.now();
        float timeElapsed = Duration.between(start, finish).toMinutes();

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("timeElapsed (min): " + timeElapsed);
        String formattedString = String.format("%.02f", (timeElapsed / MAX_RUNTIME) * 100);
        System.out.println("efficacy: " + formattedString + "%");
    }

}
