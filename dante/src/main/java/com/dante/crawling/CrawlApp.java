package com.dante.crawling;

import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.stateabstractions.embedding.Word2VecEmbeddingStateVertexFactory;
import com.dante.subjects.Config;
import com.dante.subjects.SetupApp;
import com.dante.utils.Properties;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class CrawlApp {

	private final static Logger logger = Logger.getLogger(CrawlApp.class.getName());

	/**
	 * Run this method to start the crawl.
	 * 
	 * @throws IOException
	 *             when the output folder cannot be created or emptied.
	 */
	public static void main(String[] args) {

		config();

		Properties.getInstance().checkPropertyNotEmpty(Properties.CRAWL_PATH_SEPARATOR,
				"crawl_path_separator");

		Config config = SetupApp.getConfig();
		CrawljaxConfigurationBuilder builder = config.getCrawljaxConfig();
//      builder.setStateVertexFactory(new RTEDStateVertexFactory());
		builder.setStateVertexFactory(new Word2VecEmbeddingStateVertexFactory());

		CrawljaxRunner crawljax = new CrawljaxRunner(builder.build());

		try {
			crawljax.call();
		} catch (Exception ex) {
			logger.error("Exception in crawljax: " + ex);
		}

	}

	private static void config(){
		instantiateProperties();
	}

	private static void instantiateProperties(){
		Properties.getInstance().createPropertiesFile();
	}
}
