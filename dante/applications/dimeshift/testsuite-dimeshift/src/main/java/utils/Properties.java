package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Properties {
	private static Properties ourInstance = new Properties();

	public static String app_url;
	public static String user_dir = System.getProperty("user.dir");
	private java.util.Properties appProps;
	private String appPropertiesPath;
	public final static String coverageInterLineSeparator = "<>";
	public final static String summaryLineCoverageReportStart = "FINAL";

	public List<String> srcFilesToExcludeCodeCoverage = new ArrayList<>();
	public String srcFolderCodeCoverage = "";

	public static Properties getInstance() {
		return ourInstance;
	}

	private Properties() {
		Path currentRelativePath = Paths.get("");
		String currentDirectoryPath = currentRelativePath.toAbsolutePath()
				.toString();
		this.appPropertiesPath = currentDirectoryPath
				+ "/src/main/resources/app.properties";
		try {
			FileInputStream fileInputStream = new FileInputStream(
					this.appPropertiesPath);
			this.appProps = new java.util.Properties();
			this.appProps.load(fileInputStream);
			this.loadAndCheckProperties();
			app_url = this.getProperty("app_url");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadAndCheckProperties() {

		String appUrl = this.getProperty("app_url");
		this.checkPropertyNotEmpty(appUrl, "app_url");

		String dbPort = this.getProperty("db_port");
		this.checkPropertyNotEmpty(dbPort, "db_port");
		this.checkPropertyIsNumber(dbPort);

		String headlessBrowser = this.getProperty("headless_browser");
		this.checkPropertyNotEmpty(headlessBrowser, "headless_browser");

		String numExecutionFlakyTestSuite = this
				.getProperty("num_execution_flaky_test_suite");
		this.checkPropertyNotEmpty(numExecutionFlakyTestSuite,
				"num_execution_flaky_test_suite");
		this.checkPropertyIsNumber(numExecutionFlakyTestSuite);

		String scriptNamesToExclude = this
				.getProperty("script_names_to_exclude");
		String scriptNameToInclude = this.getProperty("script_name_to_include");
		String lineRanges = this.getProperty("line_ranges");
		String sourceMapUrl = this.getProperty("sourcemap_url");

		if (scriptNameToInclude.isEmpty() && scriptNamesToExclude.isEmpty()) {
			throw new IllegalArgumentException(
					"Fill in either script_names_to_exclude "
							+ "or script_name_to_include property");
		}

		if (!scriptNameToInclude.isEmpty() && lineRanges.isEmpty()
				&& sourceMapUrl.isEmpty()) {
			System.out.println("Considering all lines in "
					+ scriptNameToInclude);
		} else if (!scriptNameToInclude.isEmpty() && !sourceMapUrl.isEmpty()) {
			String srcCodeFolder = this.getProperty("src_code_folder");
			this.srcFolderCodeCoverage = srcCodeFolder;
			if (srcCodeFolder.isEmpty())
				throw new IllegalArgumentException(
						"Don't known which src files to consider during code coverage when"
								+ " parsing the sourcemap file " + sourceMapUrl);
			String[] srcCodeFilesToExclude = this.getProperty(
					"src_code_files_to_exclude").split(":");
			if (srcCodeFilesToExclude.length == 0) {
				System.out.println("Considering all files in src code folder "
						+ srcCodeFolder);
			} else {
				this.srcFilesToExcludeCodeCoverage = Arrays
						.asList(srcCodeFilesToExclude);
				if (this.srcFilesToExcludeCodeCoverage.size() == 1
						&& this.srcFilesToExcludeCodeCoverage.get(0).isEmpty()) {
					this.srcFilesToExcludeCodeCoverage.remove(0);
					System.out
							.println("Considering all files in src code folder "
									+ srcCodeFolder);
				}
			}
		}

		String coverageType = this.getProperty("coverage_type");
		this.checkPropertyNotEmpty(coverageType, "coverage_type");

		if (!coverageType.equals("bytes") && !coverageType.equals("line")) {
			throw new IllegalArgumentException(
					"Property coverage_type can be either 'bytes' or 'line'."
							+ " Found: " + coverageType);
		}

	}

	private void checkPropertyIsNumber(String property) {
		try {
			Integer.valueOf(property);
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException(ex);
		}
	}

	private void checkPropertyNotEmpty(String property, String propertyName) {
		if (property.isEmpty())
			throw new IllegalArgumentException("Property " + propertyName
					+ " cannot be empty");
	}

	public String getProperty(String propertyName) {
		String value = this.appProps.getProperty(propertyName);
		if (value == null)
			throw new IllegalStateException("getProperty: property with name "
					+ propertyName + " does not exist in file "
					+ this.appPropertiesPath);
		else
			return value;
	}

	public String getProperty(String propertyName, String defaultValue) {
		return this.appProps.getProperty(propertyName, defaultValue);
	}
}