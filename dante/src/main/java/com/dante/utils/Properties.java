package com.dante.utils;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Properties {
    public static String home_dir = System.getProperty("user.home");
    public static String file_separator = System.getProperty("file.separator");
    public static String javaHome = System.getProperty("java.home");
    public static String user_dir = System.getProperty("user.dir");
    public static String mvn_package_structure = "src/main/java";
    public static String multi_value_property_separator = ":";
    public static String classpath_separator = ":";
    public static String[] tests_order = new String[] {""};
    public static String[] knownWordsSeparators = {" ", " - ", ", "};
    public final static String coverageInterLineSeparator = "<>";
    public final static String summaryLineCoverageReportStart = "FINAL";
    private java.util.Properties appProps;
    private String appPropertiesPath;
    /** All fields representing values, inserted via reflection */
    private static Map<String, Field> parameterMap = new HashMap<>();
    /**
     * This exception is used when a non-existent parameter is accessed
     */
    public static class NoSuchParameterException extends Exception {

        private static final long serialVersionUID = 9074828392047742535L;

        public NoSuchParameterException(String key) {
            super("No such property defined: " + key);
        }
    }

    static {
        // need to do it once, to capture all the default values
        reflectMap();
    }

    private final static Logger logger = Logger.getLogger(Properties.class.getName());
    private static Properties ourInstance;

    /**
     * Parameters are fields of the Properties class, annotated with this
     * annotation. The key parameter is used to identify values in property
     * files or on the command line, the group is used in the config file or
     * input plugins to organize parameters, and the description is also
     * displayed there.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Parameter {
        String key();

        String group();

        String description();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface IntValue {
        int min() default Integer.MIN_VALUE;

        int max() default Integer.MAX_VALUE;
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface LongValue {
        long min() default Long.MIN_VALUE;

        long max() default Long.MAX_VALUE;
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface DoubleValue {
        double min() default -(Double.MAX_VALUE - 1); // FIXXME: Check

        double max() default Double.MAX_VALUE;
    }

    @Parameter(key = "driver_actions_file_path", group = "suite-generator", description = "Path of file where driver actions were written during crawling of a certain application.")
    public static String DRIVER_ACTIONS_FILE_PATH = "";

    @Parameter(key = "test_suite_project_dir_path", group = "suite-generator", description = "Path of the directory where the test suite project is going to be placed.")
    public static String TEST_SUITE_PROJECT_DIR_PATH = "";

    @Parameter(key = "script_names_to_exclude", group = "suite-generator", description = "Comma separated list of script names to EXCLUDE during js code coverage analysis. Minified libraries are excluded by default.")
    public static String[] SCRIPT_NAMES_TO_EXCLUDE = new String[]{""};

    @Parameter(key = "script_name_to_include", group = "suite-generator", description = "Script name to INCLUDE during js code coverage analysis. Needed when the application under test uses a framework where every source file is put in a single file. When this property is not empty the previous one is not considered.")
    public static String SCRIPT_NAME_TO_INCLUDE = "";

    @Parameter(key = "line_ranges", group = "suite-generator", description = "Colon separated list of line ranges to consider while analyzing js coverage for the script script_name_to_include. In fact when a framework is used to develop the application under test in the single file there are also libraries that the user may not be interested to cover. If this property is empty when property script_name_to_include is not empty then all lines are considered in the file specified in the script_name_to_include property.")
    public static String[] LINE_RANGES = new String[]{""};

    @Parameter(key = "k_shortest_path", group = "suite-generator", description = "Value of k in k-shortest-path algorithm to generate ATUSA tests.")
    public static int K_SHORTEST_PATH = 1;

    @Parameter(key = "fired_element_strategy", group = "crawling", description = "Enable fired element strategy that considers an element as clickable in a state if it has not been fired. Default is checked or seen.")
    public static boolean FIRED_ELEMENT_STRATEGY = false;

    @Parameter(key = "form_training", group = "crawling", description = "If true the crawler will ask the user to fill forms with values during crawling. If false the filling strategy will be random.")
    public static boolean FORM_TRAINING = false;

    @Parameter(key = "headless", group = "crawling", description = "Enable CHROME headless.")
    public static boolean HEADLESS = false;

    @Parameter(key = "crawl_path_separator", group = "crawling", description = "Separator used for separating crawl paths during crawling.")
    public static String CRAWL_PATH_SEPARATOR = "";

    @Parameter(key = "url", group = "crawling", description = "URL of the application to be crawled.")
    public static String URL = "";

    @Parameter(key = "wait_time_after_event", group = "crawling", description = "Wait time after event.")
    public static int WAIT_TIME_AFTER_EVENT = 150;

    @Parameter(key = "wait_time_after_reload", group = "crawling", description = "Wait time after reload.")
    public static int WAIT_TIME_AFTER_RELOAD = 50;

    @Parameter(key = "max_runtime", group = "crawling", description = "Max runtime of crawling in min.")
    public static int MAX_RUNTIME = 30;

    @Parameter(key = "application_name", group = "default", description = "Name of the web application under test. See ApplicationNames class for values.")
    public static String APPLICATION_NAME = "";

    @Parameter(key = "ground_truth_check", group = "tedd-refine", description = "If enabled the dependency graph in 'graph_path' is the ground truth, therefore all the dependencies in that graph must be either manifest or uninteresting.")
    public static boolean GROUND_TRUTH_CHECK = false;

    @Parameter(key = "graph_path", group = "tedd-refine", description = "Dependency graph path. File must exist if 'refine' property value is true.")
    public static String GRAPH_PATH = "";

    @Parameter(key = "extraction_strategy", group = "tedd-extraction", description = "Strategy used to extract the dependency graph. See ExtractionStrategies class for values.")
    public static String EXTRACTION_STRATEGY = "";

    @Parameter(key = "consider_indirect_dependencies", group = "tedd-extraction", description = "Computation of indirect dependencies during dependency graph multi-objective optimization. It applies if extraction_strategy=moea.")
    public static boolean CONSIDER_INDIRECT_DEPENDENCIES = false;

    @Parameter(key = "coverage_driven_test_selection_byte_string", group = "tedd-extraction", description = "Byte string solution given by the coverage driven test selection. It applies if extraction_strategy=coverage.")
    public static String COVERAGE_DRIVEN_TEST_SELECTION_BYTE_STRING = "";

    @Parameter(key = "write_actions", group = "tedd-extraction", description = "Write operations mapped to selenium actions separated by ':'. It applies if extraction_strategy = 'sub_use'.")
    public static String[] WRITE_ACTIONS = new String[] {"sendKeys"};

    @Parameter(key = "reset_class_name", group = "tedd-runtime", description = "Qualified name of reset class in project with test suite. The algorithm needs to reset the application state and the project with test suite must implement a reset method.")
    public static String RESET_CLASS_NAME = "";

    @Parameter(key = "reset_method_name", group = "tedd-runtime", description = "Name of the method of the reset class in project with test suite. The method is going to be called at runtime.")
    public static String RESET_METHOD_NAME = "";

    @Parameter(key = "project_classpath", group = "tedd-runtime", description = "Classpath of project with test suite.")
    public static String PROJECT_CLASSPATH = "";

    @Parameter(key = "stop_execution_first_failure", group = "tedd-runtime", description = "Stop test suite / schedule execution after first failure.")
    public static boolean STOP_EXECUTION_FIRST_FAILURE = false;

    @Parameter(key = "print_intermediate_graphs",  group = "tedd-default", description = "If true all intermediate dependency graphs are printed during the refinement.")
    public static boolean PRINT_INTERMEDIATE_GRAPHS = false;

    @Parameter(key = "test_suite_path", group = "tedd-default", description = "Absolute path of test suite in file system.")
    public static String TEST_SUITE_PATH = "";

    @Parameter(key = "final_graph_path", group = "tedd-validation-check", description = "Absolute path of the final graph to be checked.")
    public static String FINAL_GRAPH_PATH = "";

    @Parameter(key = "dependency_graph_path", group = "tedd-algorithm", description = "Absolute path of dependency graph dot files in file system.")
    public static String DEPENDENCY_GRAPH_PATH = "";

    @Parameter(key = "refinement_strategy", group = "tedd-algorithm", description = "Strategy used to select edges in the dependency graph. See RefinementStrategies class for values.")
    public static String REFINEMENT_STRATEGY = "";

    @Parameter(key = "incremental_refinement", group = "tedd-algorithm", description = "If true the dependency graph is validated incrementally starting from the bottom (tests placed first in the test suite).")
    public static boolean INCREMENTAL_REFINEMENT = false;

    @Parameter(key = "validated_graph_path", group = "suite-minimization", description = "Absolute path of the validated graph to be imported for suite minimization.")
    public static String VALIDATED_GRAPH_PATH = "";

    @Parameter(key = "coverage_reports_directory_path", group = "suite-minimization", description = "Absolute path of the coverage reports directory to be analyzed.")
    public static String COVERAGE_REPORTS_DIRECTORY_PATH = "";

    @Parameter(key = "solution_byte_string", group = "suite-minimization", description = "String representing the solution given by the solver as byte string. If byte = 1 the corresponding test, in order, must be in the minimized suite.")
    public static String SOLUTION_BYTE_STRING = "";

    @Parameter(key = "suite_execution_result_byte_string", group = "collect-coverage-reports", description = "String representing the execution of a test suite. If byte = 1 the corresponding test, in order, must be executed for measuring coverage since it did not fail.")
    public static String SUITE_EXECUTION_RESULT_BYTE_STRING = "";


    private void checkProperties(){
        this.checkPropertyNotEmpty(Properties.APPLICATION_NAME, "application_name");
    }

    public void createPropertiesFile() {

        StringBuffer buffer = new StringBuffer();

        Map<String, Set<Parameter>> fieldMap = new HashMap<>();
        for (Field f : Properties.class.getFields()) {
            if (f.isAnnotationPresent(Parameter.class)) {
                Parameter p = f.getAnnotation(Parameter.class);
                if (!fieldMap.containsKey(p.group()))
                    fieldMap.put(p.group(), new HashSet<>());

                fieldMap.get(p.group()).add(p);
            }
        }

        for (String group : fieldMap.keySet()) {

            buffer.append("#--------------------------------------\n");
            buffer.append("# ");
            buffer.append(group);
            buffer.append("\n#--------------------------------------\n\n");
            for (Parameter p : fieldMap.get(group)) {
                buffer.append("# ");
                buffer.append(p.description());
                buffer.append("\n");
                buffer.append(p.key());
                buffer.append("=");
                try {
                    buffer.append(getStringValue(p.key()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                buffer.append("\n\n");
            }
        }

        if(!new File(this.appPropertiesPath).exists()){
            FileUtils.writeFile(buffer.toString(), this.appPropertiesPath);
            logger.debug("Created properties file in " + this.appPropertiesPath + ". Please fill it with proper values.");
            System.exit(0);
        } else {
            FileUtils.writeFile(buffer.toString(), this.appPropertiesPath);
        }


    }

    /**
     * Determine fields that are declared as parameters
     */
    private static void reflectMap() {
        for (Field f : Properties.class.getFields()) {
            if (f.isAnnotationPresent(Parameter.class)) {
                Parameter p = f.getAnnotation(Parameter.class);
                parameterMap.put(p.key(), f);
            }
        }
    }

    public void checkPropertyNotEmpty(String property, String propertyName){
        if(property.isEmpty())
            throw new IllegalArgumentException("Property " + propertyName + " cannot be empty in " + this.appPropertiesPath);
    }

    public void checkMultiValueProperty(String[] values, String valueSeparator, String propertyName, boolean canBeEmpty){
        List<String> valuesList = Arrays.asList(values);
        if(valuesList.size() == 1 && valuesList.get(0).isEmpty()){ // different also from empty string
            if(!canBeEmpty){
                throw new IllegalArgumentException("Invalid property " + propertyName + "; empty string not valid value");
            }
        } else if(valuesList.size() == 1){
            String property = valuesList.get(0);
            if(!property.contains(valueSeparator)){
                // it maybe a multi-value property that for the moment has a single value
                Pattern pattern = Pattern.compile("[A-Za-z]+"); // check that property only contains characters
                if (!pattern.matcher(property).matches()) {
                    throw new IllegalArgumentException("Invalid property " + propertyName);
                }
            }
        } else if (valuesList.isEmpty() && !canBeEmpty) {
            throw new IllegalArgumentException("Invalid property " + propertyName);
        }
    }

    public void checkFileExistence(String property, String propertyName){
        this.checkPropertyNotEmpty(property, propertyName);
        File filePathFile = new File(property);
        if(!filePathFile.exists())
            throw new IllegalArgumentException("File " + filePathFile
                    + " does not exist");
    }

    public void checkDirectoryExistence(String property, String propertyName){
        this.checkFileExistence(property, propertyName);
        if(!new File(property).isDirectory())
            throw new IllegalArgumentException("File " + new File(property)
                    + " is not a directory");
    }

    // TODO find classpath pattern
    private void checkClasspath(String classpath){
//        Pattern pattern = Pattern.compile("(\w)");
//        if (!pattern.matcher(classpath).matches()) {
//            throw new IllegalArgumentException("Invalid property " + classpath);
//        }
    }

    // TODO check that resetMethodName is a static method of class resetClassName
    private void checkStaticMethod(String resetClassName, String testsPath, String resetMethodName){

    }

    public String getProperty(String propertyName){
        String value = this.appProps.getProperty(propertyName);
        if(value == null)
            throw new IllegalStateException("getProperty: property with name " + propertyName
                    + " does not exist in " + this.appPropertiesPath);
        else return value;
    }

    public String getProperty(String propertyName, String defaultValue){
        return this.appProps.getProperty(propertyName, defaultValue);
    }

    /**
     * Get class of parameter
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @return a {@link Class} object.
     */
     private static Class<?> getType(String key) throws NoSuchParameterException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);
        return f.getType();
    }

    /**
     * Get description string of parameter
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @return a {@link String} object.
     */
    private static String getDescription(String key)
            throws NoSuchParameterException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);
        Parameter p = f.getAnnotation(Parameter.class);
        return p.description();
    }

    /**
     * Get group name of parameter
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @return a {@link String} object.
     */
    private static String getGroup(String key) throws NoSuchParameterException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);
        Parameter p = f.getAnnotation(Parameter.class);
        return p.group();
    }

    /**
     * Get integer boundaries
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @return a {@link com.dante.utils.Properties.IntValue} object.
     */
    private static IntValue getIntLimits(String key)
            throws NoSuchParameterException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);
        return f.getAnnotation(IntValue.class);
    }

    /**
     * Get long boundaries
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @return a {@link com.dante.utils.Properties.LongValue} object.
     */
    private static LongValue getLongLimits(String key)
            throws NoSuchParameterException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);
        return f.getAnnotation(LongValue.class);
    }

    /**
     * Get double boundaries
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @return a {@link com.dante.utils.Properties.DoubleValue} object.
     */
    private static DoubleValue getDoubleLimits(String key)
            throws NoSuchParameterException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);
        return f.getAnnotation(DoubleValue.class);
    }

    /**
     * Get an integer parameter value
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     * @return a int.
     */
    private static int getIntegerValue(String key)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        return parameterMap.get(key).getInt(null);
    }

    /**
     * Get an integer parameter value
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     * @return a long.
     */
    private static long getLongValue(String key)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        return parameterMap.get(key).getLong(null);
    }

    /**
     * Get a boolean parameter value
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     * @return a boolean.
     */
    private static boolean getBooleanValue(String key)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        return parameterMap.get(key).getBoolean(null);
    }

    /**
     * Get a double parameter value
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     * @return a double.
     */
    private static double getDoubleValue(String key)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        return parameterMap.get(key).getDouble(null);
    }

    /**
     * Get parameter value as string (works for all types)
     *
     * @param key
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     * @return a {@link String} object.
     */
    private static String getStringValue(String key)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        StringBuffer sb = new StringBuffer();
        Object val = parameterMap.get(key).get(null);
        if (val != null && val.getClass().isArray()) {
            int len = Array.getLength(val);
            for (int i = 0; i < len; i++) {
                if (i > 0)
                    sb.append(multi_value_property_separator);

                sb.append(Array.get(val, i));
            }
        } else {
            sb.append(val);
        }
        return sb.toString();
    }

    /**
     * Set parameter to new integer value
     *
     * @param key
     *            a {@link String} object.
     * @param value
     *            a int.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     */
    private void setValue(String key, int value)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);

        if (f.isAnnotationPresent(IntValue.class)) {
            IntValue i = f.getAnnotation(IntValue.class);
            if (value < i.min() || value > i.max())
                throw new IllegalArgumentException();
        }

        f.setInt(this, value);
    }

    /**
     * Set parameter to new long value
     *
     * @param key
     *            a {@link String} object.
     * @param value
     *            a long.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     */
    private void setValue(String key, long value)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);

        if (f.isAnnotationPresent(LongValue.class)) {
            LongValue i = f.getAnnotation(LongValue.class);
            if (value < i.min() || value > i.max())
                throw new IllegalArgumentException();
        }

        f.setLong(this, value);
    }

    /**
     * Set parameter to new boolean value
     *
     * @param key
     *            a {@link String} object.
     * @param value
     *            a boolean.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     */
    private void setValue(String key, boolean value)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);
        f.setBoolean(this, value);
    }

    /**
     * Set parameter to new double value
     *
     * @param key
     *            a {@link String} object.
     * @param value
     *            a double.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     */
    private void setValue(String key, double value)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key))
            throw new NoSuchParameterException(key);

        Field f = parameterMap.get(key);
        if (f.isAnnotationPresent(DoubleValue.class)) {
            DoubleValue i = f.getAnnotation(DoubleValue.class);
            if (value < i.min() || value > i.max())
                throw new IllegalArgumentException();
        }
        f.setDouble(this, value);
    }

    /**
     * Set parameter to new value from String
     *
     * @param key
     *            a {@link String} object.
     * @param value
     *            a {@link String} object.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void setValue(String key, String value)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key)) {
            throw new NoSuchParameterException(key);
        }

        Field f = parameterMap.get(key);
        //Enum
        if (f.getType().isEnum()) {
            f.set(null, Enum.valueOf((Class<Enum>) f.getType(),
                    value.toUpperCase()));
        }
        //Integers
        else if (f.getType().equals(int.class)) {
            setValue(key, Integer.parseInt(value));
        } else if (f.getType().equals(Integer.class)) {
            setValue(key, (Integer) Integer.parseInt(value));
        }
        //Long
        else if (f.getType().equals(long.class)) {
            setValue(key, Long.parseLong(value));
        } else if (f.getType().equals(Long.class)) {
            setValue(key, (Long) Long.parseLong(value));
        }
        //Boolean
        else if (f.getType().equals(boolean.class)) {
            setValue(key, strictParseBoolean(value));
        } else if (f.getType().equals(Boolean.class)) {
            setValue(key, (Boolean) strictParseBoolean(value));
        }
        //Double
        else if (f.getType().equals(double.class)) {
            setValue(key, Double.parseDouble(value));
        } else if (f.getType().equals(Double.class)) {
            setValue(key, (Double) Double.parseDouble(value));
        }
        //Array
        else if (f.getType().isArray()) {
            if (f.getType().isAssignableFrom(String[].class)) {
                setValue(key, value.split(multi_value_property_separator));
            }
        } else {
            f.set(null, value);
        }
    }

    /**
     * we need this strict function because Boolean.parseBoolean silently
     * ignores malformed strings
     *
     * @param s string
     * @return boolean
     */
    private boolean strictParseBoolean(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException(
                    "empty string does not represent a valid boolean");
        }

        if (s.equalsIgnoreCase("true")) {
            return true;
        }

        if (s.equalsIgnoreCase("false")) {
            return false;
        }

        throw new IllegalArgumentException(
                "Invalid string representing a boolean: " + s);
    }

    /**
     * <p>
     * setValue
     * </p>
     *
     * @param key
     *            a {@link String} object.
     * @param value
     *            an array of {@link String} objects.
     * @throws com.dante.utils.Properties.NoSuchParameterException
     *             if any.
     * @throws IllegalArgumentException
     *             if any.
     * @throws IllegalAccessException
     *             if any.
     */
    private void setValue(String key, String[] value)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key)) {
            throw new NoSuchParameterException(key);
        }

        Field f = parameterMap.get(key);

        f.set(this, value);
    }

    /**
     * Set the given <code>key</code> variable to the given input Object
     * <code>value</code>
     *
     * @param key
     * @param value
     * @throws NoSuchParameterException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    private void setValue(String key, Object value)
            throws NoSuchParameterException, IllegalArgumentException,
            IllegalAccessException {
        if (!parameterMap.containsKey(key)) {
            throw new NoSuchParameterException(key);
        }

        Field f = parameterMap.get(key);

        f.set(this, value);
    }


    /**
     * Initialize properties from property file or command line parameters
     */
    private void initializeProperties() throws IllegalStateException{

        for (String parameter : parameterMap.keySet()) {
            try {
                String property = System.getProperty(parameter);
                if (property == null) {
                    property = this.appProps.getProperty(parameter);
                }
                if (property != null) {
                    setValue(parameter, property);
                }
            } catch (Exception e) {
                throw new IllegalStateException("Wrong parameter settings for '" + parameter + "': " + e.getCause());
            }
        }

    }

    /**
     * Load and initialize a properties file from a given path
     *
     * @param propertiesPath
     *            a {@link String} object.
     */
    private void loadProperties(String propertiesPath) {
        loadPropertiesFile(propertiesPath);
        initializeProperties();
        if(new File(propertiesPath).exists()){
            this.checkProperties();
        }
    }

    /**
     * Load a properties file
     *
     * @param propertiesPath
     *            a {@link String} object.
     */
    private void loadPropertiesFile(String propertiesPath) {
        this.appProps = new java.util.Properties();
        try {
            InputStream in;
            File propertiesFile = new File(propertiesPath);
            if (propertiesFile.exists()) {
                in = new FileInputStream(propertiesPath);
                this.appProps.load(in);
            } else {
                in = this.getClass().getClassLoader()
                        .getResourceAsStream(propertiesPath);
                if (in != null) {
                    this.appProps.load(in);
                }
            }
        } catch (Exception e) {
            logger.warn("Error: Could not find configuration file "
                    + propertiesPath);
        }
    }

    /** Constructor */
    private Properties(boolean loadProperties) {
        if (loadProperties){
            Path currentRelativePath = Paths.get("");
            String currentDirectoryPath = currentRelativePath.toAbsolutePath().toString();
            this.appPropertiesPath = currentDirectoryPath + "/src/main/resources/app.properties";
            this.loadProperties(appPropertiesPath);
        }

        Path currentRelativePath = Paths.get("");
        String currentDirectoryPath = currentRelativePath.toAbsolutePath().toString();
        String log4jPropertiesFilePath = currentDirectoryPath + "/src/main/resources/log4j.properties";
        if(!new File(log4jPropertiesFilePath).exists())
            throw new RuntimeException("Log4j properties file " + log4jPropertiesFilePath + " does not exist");
    }

    /**
     * Singleton accessor
     *
     * @return a {@link com.dante.utils.Properties} object.
     */
    public static Properties getInstance() {
        if (ourInstance == null)
            ourInstance = new Properties(true);
        return ourInstance;
    }
}
