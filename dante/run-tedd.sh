#!/bin/bash

os=$(uname)

properties_file=$PWD/src/main/resources/app.properties

function checkMainClassName(){
	local main_class_name=$1
	if [[ $main_class_name != "validate_deps_original_order" \
	    && $main_class_name != "validate_deps_biobjective" \
	    && $main_class_name != "validate_deps_sub_use" \
	    && $main_class_name != "validate_deps_coverage_driven" \
	    && $main_class_name != "refine_original_order" \
	    && $main_class_name != "refine_sub_use" \
	    && $main_class_name != "refine_coverage_driven" \
	    && $main_class_name != "refine_biobjective" ]]; then
		echo Unknown main class name: $main_class_name
		exit 1
	fi
}

function checkApplicationName(){
	local application_name_local=$1
	if [[ $application_name_local != "petclinic" && $application_name_local != "splittypie" && $application_name_local != "retroboard" \
		&& $application_name_local != "phoenix" && $application_name_local != "dimeshift" && $application_name_local != "ecommerce" && $application_name_local != "pagekit" ]]; then
		echo Unknown application name: $application_name_local
		exit 1
	fi
}

function runContainer(){
    local application_name_local=$1
    local current_date=$2
    local docker_run_script_folder=./docker/$application_name_local
    if [[ -e $docker_run_script_folder ]]; then
        if [[ -d $docker_run_script_folder ]]; then
            if [[ -f $docker_run_script_folder/run-docker.sh ]]; then
                local pwd=$(pwd)
                cd $docker_run_script_folder
                ./run-docker.sh -p yes -n $application_name_local-$current_date
                sleep 60 # wait for the application to start
                cd $pwd
            else
                echo $docker_run_script_folder/run-docker.sh does not exist
                exit 1
            fi
        else
            echo $docker_run_script_folder is not a directory
            exit 1
        fi
    else
        echo $docker_run_script_folder path does not exists
        exit 1
    fi
}

function stopContainer(){
    local application_name_local=$1
    local current_date=$2
    ids=$(docker ps -a | awk '{ print $1,$2 }' | grep $application_name_local | awk '{print $1}')
    docker stop $ids
    docker rm $ids
}

function checkBoolean(){
    local start_container=$1
	if [[ $start_container != "true" && $start_container != "false" ]]; then
		echo Unknown start container value: $start_container. It is either true or false.
		exit 1
	fi
}

function checkElementStrategy(){
	local element_strategy=$1
	if [[ $element_strategy != "fired" && $element_strategy != "checked" ]]; then
		echo Unknown element strategy: $element_strategy
		exit 1
	fi
}

function setElementStrategy() {
    local application_name_local=$1
    local element_strategy=none
    if [[ $application_name_local == "petclinic" || \
        $application_name_local == "retroboard" || \
         $application_name_local == "dimeshift" || \
         $application_name_local == "ecommerce" || \
         $application_name_local == "pagekit" ]]; then
        element_strategy=fired
    elif [[ $application_name_local == "phoenix" || \
        $application_name_local == "splittypie" ]]; then
        element_strategy=checked
    fi
    if [[ $element_strategy == "fired" ]]; then
		if [[ $os == "Darwin" ]]; then
            sed -i "" "s/GeneratedTestSuite.*.java/GeneratedTestSuiteFired.java/g" $properties_file
            sed -i "" "s/fired_element_strategy=.*/fired_element_strategy=true/g" $properties_file
        else
            sed -i "s/GeneratedTestSuite.*.java/GeneratedTestSuiteFired.java/g" $properties_file
            sed -i "s/fired_element_strategy=.*/fired_element_strategy=true/g" $properties_file
        fi
    elif [[ $element_strategy == "checked" ]]; then
        if [[ $os == "Darwin" ]]; then
            sed -i "" "s/GeneratedTestSuite.*.java/GeneratedTestSuiteChecked.java/g" $properties_file
            sed -i "" "s/fired_element_strategy=.*/fired_element_strategy=false/g" $properties_file
        else
            sed -i "s/GeneratedTestSuite.*.java/GeneratedTestSuiteChecked.java/g" $properties_file
            sed -i "s/fired_element_strategy=.*/fired_element_strategy=false/g" $properties_file
        fi
    else
		exit 1
	fi
	echo "$element_strategy"
}

function setExtractionStrategy() {
    local extraction_strategy=$1
    if [[ $extraction_strategy != "biobjective" && $extraction_strategy != "original_order"\
        && $extraction_strategy != "coverage_driven" && $extraction_strategy != "sub_use" ]]; then
		echo Unknown element strategy: $extraction_strategy
		exit 1
	fi
	if [[ $os == "Darwin" ]]; then
        sed -i "" "s/extraction_strategy=.*/extraction_strategy=$extraction_strategy/g" $properties_file
    else
        sed -i "s/extraction_strategy=.*/extraction_strategy=$extraction_strategy/g" $properties_file
    fi
}

function setTestSuitePath() {
    local application_name_local=$1
    local element_strategy_local=$2
    element_strategy_local=$(echo $element_strategy_local | awk '{ print toupper( substr( $0, 1, 1 ) ) substr( $0, 2 ); }')
    local test_suite_path_local="$HOME/workspace/ICST20-submission-material-DANTE/dante/applications/$application_name_local/testsuite-$application_name_local/src/main/java/tests/GeneratedTestSuite$element_strategy_local.java"
	if [[ $os == "Darwin" ]]; then
        sed -i "" "s%test_suite_path=.*%test_suite_path=$test_suite_path_local%g" $properties_file
    else
        sed -i "s%test_suite_path=.*%test_suite_path=$test_suite_path_local%g" $properties_file
    fi
}

function setDependencyGraphPath() {
    local application_name_local=$1
    local dependency_graph_path_local="$HOME/workspace/ICST20-submission-material-DANTE/dante/applications/$application_name_local/testsuite-$application_name_local/src/main/resources"
	if [[ $os == "Darwin" ]]; then
        sed -i "" "s%dependency_graph_path=.*%dependency_graph_path=$dependency_graph_path_local%g" $properties_file
    else
        sed -i "s%dependency_graph_path=.*%dependency_graph_path=$dependency_graph_path_local%g" $properties_file
    fi
}

function setApplicationName(){
    local application_name_local=$1
    if [[ $os == "Darwin" ]]; then
        sed -i "" "s/application_name=.*/application_name=$application_name_local/g" $properties_file
    else
        sed -i "s/application_name=.*/application_name=$application_name_local/g" $properties_file
    fi
}

#----------------------------------------------------------------------------------------------------------------------

if test $# -lt 4 ; then echo 'ARGS:
    application_name (petclinic|splittypie|retroboard|phoenix|dimeshift|ecommerce)
    main_class_name (validate_deps_original_order|validate_deps_sub_use|
        validate_deps_coverage_driven|validate_deps_biobjective |
        refine_original_order|refine_coverage_driven|refine_sub_use|refine_biobjective)
    start_container (true|false)
    collect_stats (true|false)'; exit 1 ; fi

classpath=$HOME/.m2/repository/io/pebbletemplates/pebble/3.0.8/pebble-3.0.8.jar:$HOME/.m2/repository/org/unbescape/unbescape/1.1.6.RELEASE/unbescape-1.1.6.RELEASE.jar:$HOME/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:$HOME/.m2/repository/com/crawljax/crawljax-core/4.2-SNAPSHOT/crawljax-core-4.2-SNAPSHOT.jar:$HOME/.m2/repository/org/apache/commons/commons-math3/3.6.1/commons-math3-3.6.1.jar:$HOME/.m2/repository/org/apache/commons/commons-text/1.6/commons-text-1.6.jar:$HOME/.m2/repository/ru/yandex/qatools/ashot/ashot/1.5.4/ashot-1.5.4.jar:$HOME/.m2/repository/xmlunit/xmlunit/1.6/xmlunit-1.6.jar:$HOME/.m2/repository/net/sourceforge/nekohtml/nekohtml/1.9.22/nekohtml-1.9.22.jar:$HOME/.m2/repository/xerces/xercesImpl/2.11.0/xercesImpl-2.11.0.jar:$HOME/.m2/repository/xml-apis/xml-apis/1.4.01/xml-apis-1.4.01.jar:$HOME/.m2/repository/net/jcip/jcip-annotations/1.0/jcip-annotations-1.0.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-firefox-driver/3.141.5/selenium-firefox-driver-3.141.5.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-api/3.141.5/selenium-api-3.141.5.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy/1.8.15/byte-buddy-1.8.15.jar:$HOME/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:$HOME/.m2/repository/com/squareup/okhttp3/okhttp/3.11.0/okhttp-3.11.0.jar:$HOME/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.5/selenium-chrome-driver-3.141.5.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-support/3.141.5/selenium-support-3.141.5.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-remote-driver/3.141.5/selenium-remote-driver-3.141.5.jar:$HOME/.m2/repository/com/google/inject/guice/4.2.2/guice-4.2.2.jar:$HOME/.m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar:$HOME/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar:$HOME/.m2/repository/com/google/inject/extensions/guice-assistedinject/4.2.2/guice-assistedinject-4.2.2.jar:$HOME/.m2/repository/io/dropwizard/metrics/metrics-core/4.1.0-rc2/metrics-core-4.1.0-rc2.jar:$HOME/.m2/repository/com/assertthat/selenium-shutterbug/0.9/selenium-shutterbug-0.9.jar:$HOME/.m2/repository/com/codeborne/phantomjsdriver/1.4.4/phantomjsdriver-1.4.4.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv-platform/3.4.3-1.4.3/opencv-platform-3.4.3-1.4.3.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3.jar:$HOME/.m2/repository/org/bytedeco/javacpp/1.4.3/javacpp-1.4.3.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-android-arm.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-android-arm64.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-android-x86.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-android-x86_64.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-ios-arm64.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-ios-x86_64.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-linux-x86.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-linux-x86_64.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-linux-armhf.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-linux-ppc64le.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-macosx-x86_64.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-windows-x86.jar:$HOME/.m2/repository/org/bytedeco/javacpp-presets/opencv/3.4.3-1.4.3/opencv-3.4.3-1.4.3-windows-x86_64.jar:$HOME/.m2/repository/com/google/guava/guava/27.0.1-jre/guava-27.0.1-jre.jar:$HOME/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar:$HOME/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:$HOME/.m2/repository/org/checkerframework/checker-qual/2.5.2/checker-qual-2.5.2.jar:$HOME/.m2/repository/com/google/errorprone/error_prone_annotations/2.2.0/error_prone_annotations-2.2.0.jar:$HOME/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:$HOME/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.17/animal-sniffer-annotations-1.17.jar:$HOME/.m2/repository/org/slf4j/jcl-over-slf4j/1.8.0-beta2/jcl-over-slf4j-1.8.0-beta2.jar:$HOME/.m2/repository/org/slf4j/jul-to-slf4j/1.8.0-beta2/jul-to-slf4j-1.8.0-beta2.jar:$HOME/.m2/repository/ch/qos/logback/logback-classic/1.3.0-alpha4/logback-classic-1.3.0-alpha4.jar:$HOME/.m2/repository/ch/qos/logback/logback-core/1.3.0-alpha4/logback-core-1.3.0-alpha4.jar:$HOME/.m2/repository/com/sun/mail/javax.mail/1.6.0/javax.mail-1.6.0.jar:$HOME/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar:$HOME/.m2/repository/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar:$HOME/.m2/repository/com/crawljax/plugins/crawloverview-plugin/4.2-SNAPSHOT/crawloverview-plugin-4.2-SNAPSHOT.jar:$HOME/.m2/repository/org/apache/velocity/velocity/1.7/velocity-1.7.jar:$HOME/.m2/repository/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar:$HOME/.m2/repository/commons-lang/commons-lang/2.4/commons-lang-2.4.jar:$HOME/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:$HOME/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.7/jackson-databind-2.9.7.jar:$HOME/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:$HOME/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.7/jackson-core-2.9.7.jar:$HOME/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-guava/2.9.7/jackson-datatype-guava-2.9.7.jar:$HOME/.m2/repository/com/crawljax/crawljax-core/4.2-SNAPSHOT/crawljax-core-4.2-SNAPSHOT-tests.jar:$HOME/.m2/repository/com/crawljax/plugins/testcasegenerator/4.2-SNAPSHOT/testcasegenerator-4.2-SNAPSHOT.jar:$HOME/.m2/repository/commons-configuration/commons-configuration/1.5/commons-configuration-1.5.jar:$HOME/.m2/repository/commons-logging/commons-logging/1.1/commons-logging-1.1.jar:$HOME/.m2/repository/logkit/logkit/1.0.1/logkit-1.0.1.jar:$HOME/.m2/repository/avalon-framework/avalon-framework/4.1.3/avalon-framework-4.1.3.jar:$HOME/.m2/repository/javax/servlet/servlet-api/2.3/servlet-api-2.3.jar:$HOME/.m2/repository/commons-digester/commons-digester/1.8/commons-digester-1.8.jar:$HOME/.m2/repository/commons-beanutils/commons-beanutils/1.7.0/commons-beanutils-1.7.0.jar:$HOME/.m2/repository/commons-beanutils/commons-beanutils-core/1.7.0/commons-beanutils-core-1.7.0.jar:$HOME/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:$HOME/.m2/repository/org/xmlunit/xmlunit-core/2.3.0/xmlunit-core-2.3.0.jar:$HOME/.m2/repository/com/googlecode/java-diff-utils/diffutils/1.3.0/diffutils-1.3.0.jar:$HOME/.m2/repository/com/github/davidmoten/rtree/0.8.0.1/rtree-0.8.0.1.jar:$HOME/.m2/repository/com/github/davidmoten/rxjava-extras/0.8.0.7/rxjava-extras-0.8.0.7.jar:$HOME/.m2/repository/io/reactivex/rxjava/1.2.10/rxjava-1.2.10.jar:$HOME/.m2/repository/com/github/davidmoten/guava-mini/0.1/guava-mini-0.1.jar:$HOME/.m2/repository/org/testng/testng/7.0.0-beta1/testng-7.0.0-beta1.jar:$HOME/.m2/repository/com/beust/jcommander/1.72/jcommander-1.72.jar:$HOME/.m2/repository/fr/inria/gforge/spoon/spoon-core/7.3.0/spoon-core-7.3.0.jar:$HOME/.m2/repository/org/eclipse/jdt/org.eclipse.jdt.core/3.15.0/org.eclipse.jdt.core-3.15.0.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.core.resources/3.13.500/org.eclipse.core.resources-3.13.500.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.core.expressions/3.6.500/org.eclipse.core.expressions-3.6.500.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.core.runtime/3.16.0/org.eclipse.core.runtime-3.16.0.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.osgi/3.15.0/org.eclipse.osgi-3.15.0.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.equinox.common/3.10.500/org.eclipse.equinox.common-3.10.500.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.core.jobs/3.10.500/org.eclipse.core.jobs-3.10.500.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.equinox.registry/3.8.500/org.eclipse.equinox.registry-3.8.500.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.equinox.preferences/3.7.500/org.eclipse.equinox.preferences-3.7.500.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.core.contenttype/3.7.400/org.eclipse.core.contenttype-3.7.400.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.equinox.app/1.4.300/org.eclipse.equinox.app-1.4.300.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.core.filesystem/1.7.500/org.eclipse.core.filesystem-1.7.500.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.text/3.9.0/org.eclipse.text-3.9.0.jar:$HOME/.m2/repository/org/eclipse/platform/org.eclipse.core.commands/3.9.500/org.eclipse.core.commands-3.9.500.jar:$HOME/.m2/repository/com/martiansoftware/jsap/2.1/jsap-2.1.jar:$HOME/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:$HOME/.m2/repository/org/apache/maven/maven-model/3.5.0/maven-model-3.5.0.jar:$HOME/.m2/repository/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.jar:$HOME/.m2/repository/org/tukaani/xz/1.8/xz-1.8.jar:$HOME/.m2/repository/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:$HOME/.m2/repository/org/apache/maven/shared/maven-invoker/3.0.1/maven-invoker-3.0.1.jar:$HOME/.m2/repository/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.jar:$HOME/.m2/repository/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.jar:$HOME/.m2/repository/org/jboss/forge/roaster/roaster-api/2.20.8.Final/roaster-api-2.20.8.Final.jar:$HOME/.m2/repository/org/jboss/forge/roaster/roaster-jdt/2.20.8.Final/roaster-jdt-2.20.8.Final.jar:$HOME/.m2/repository/io/github/bonigarcia/webdrivermanager/3.3.0/webdrivermanager-3.3.0.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpclient/4.5.6/httpclient-4.5.6.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpcore/4.4.10/httpcore-4.4.10.jar:$HOME/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:$HOME/.m2/repository/org/rauschig/jarchivelib/1.0.0/jarchivelib-1.0.0.jar:$HOME/.m2/repository/org/jsoup/jsoup/1.11.3/jsoup-1.11.3.jar:$HOME/.m2/repository/org/jgrapht/jgrapht-core/1.3.1/jgrapht-core-1.3.1.jar:$HOME/.m2/repository/org/jheaps/jheaps/0.10/jheaps-0.10.jar:$HOME/.m2/repository/org/jgrapht/jgrapht-ext/1.3.1/jgrapht-ext-1.3.1.jar:$HOME/.m2/repository/com/github/vlsi/mxgraph/jgraphx/3.9.8.1/jgraphx-3.9.8.1.jar:$HOME/.m2/repository/org/jgrapht/jgrapht-io/1.3.1/jgrapht-io-1.3.1.jar:$HOME/.m2/repository/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.jar:$HOME/.m2/repository/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.jar:$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar:$HOME/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$HOME/.m2/repository/org/apache/logging/log4j/log4j-core/2.11.2/log4j-core-2.11.2.jar:$HOME/.m2/repository/org/apache/logging/log4j/log4j-api/2.11.2/log4j-api-2.11.2.jar:$HOME/.m2/repository/com/lexicalscope/jewelcli/jewelcli/0.8.9/jewelcli-0.8.9.jar:$HOME/.m2/repository/org/uma/jmetal/jmetal-core/5.7/jmetal-core-5.7.jar:$HOME/.m2/repository/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar:$HOME/.m2/repository/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.jar:$HOME/.m2/repository/org/apache/commons/commons-collections4/4.2/commons-collections4-4.2.jar:$HOME/.m2/repository/org/hamcrest/hamcrest-all/1.3/hamcrest-all-1.3.jar:$HOME/.m2/repository/org/knowm/xchart/xchart/3.2.2/xchart-3.2.2.jar:$HOME/.m2/repository/de/erichseifert/vectorgraphics2d/VectorGraphics2D/0.11/VectorGraphics2D-0.11.jar:$HOME/.m2/repository/nz/ac/waikato/cms/weka/weka-stable/3.8.1/weka-stable-3.8.1.jar:$HOME/.m2/repository/nz/ac/waikato/cms/weka/thirdparty/java-cup-11b/2015.03.26/java-cup-11b-2015.03.26.jar:$HOME/.m2/repository/nz/ac/waikato/cms/weka/thirdparty/java-cup-11b-runtime/2015.03.26/java-cup-11b-runtime-2015.03.26.jar:$HOME/.m2/repository/nz/ac/waikato/cms/weka/thirdparty/bounce/0.18/bounce-0.18.jar:$HOME/.m2/repository/com/googlecode/matrix-toolkits-java/mtj/1.0.4/mtj-1.0.4.jar:$HOME/.m2/repository/com/github/fommil/netlib/all/1.1.2/all-1.1.2.pom:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_ref-osx-x86_64/1.1/netlib-native_ref-osx-x86_64-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/native_ref-java/1.1/native_ref-java-1.1.jar:$HOME/.m2/repository/com/github/fommil/jniloader/1.1/jniloader-1.1.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_ref-linux-x86_64/1.1/netlib-native_ref-linux-x86_64-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_ref-linux-i686/1.1/netlib-native_ref-linux-i686-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_ref-win-x86_64/1.1/netlib-native_ref-win-x86_64-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_ref-win-i686/1.1/netlib-native_ref-win-i686-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_ref-linux-armhf/1.1/netlib-native_ref-linux-armhf-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_system-osx-x86_64/1.1/netlib-native_system-osx-x86_64-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/native_system-java/1.1/native_system-java-1.1.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_system-linux-x86_64/1.1/netlib-native_system-linux-x86_64-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_system-linux-i686/1.1/netlib-native_system-linux-i686-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_system-linux-armhf/1.1/netlib-native_system-linux-armhf-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_system-win-x86_64/1.1/netlib-native_system-win-x86_64-1.1-natives.jar:$HOME/.m2/repository/com/github/fommil/netlib/netlib-native_system-win-i686/1.1/netlib-native_system-win-i686-1.1-natives.jar:$HOME/.m2/repository/net/sourceforge/f2j/arpack_combined_all/0.1/arpack_combined_all-0.1.jar:$HOME/.m2/repository/com/googlecode/netlib-java/netlib-java/1.1/netlib-java-1.1.jar:$HOME/.m2/repository/com/github/fommil/netlib/core/1.1/core-1.1.jar:$HOME/.m2/repository/org/uma/jmetal/jmetal-algorithm/5.7/jmetal-algorithm-5.7.jar:$HOME/.m2/repository/com/fuzzylite/jfuzzylite/5.0/jfuzzylite-5.0.jar:$HOME/.m2/repository/org/uma/jmetal/jmetal-problem/5.7/jmetal-problem-5.7.jar:$HOME/.m2/repository/org/uma/jmetal/jmetal-exec/5.7/jmetal-exec-5.7.jar:$HOME/workspace/ICST20-submission-material-DANTE/dante/src/main/resources/lib/com.microsoft.z3.jar:$HOME/.m2/repository/org/slf4j/slf4j-nop/1.7.25/slf4j-nop-1.7.25.jar:./target/classes

application_name=$1
main_class_name=$2
start_container=$3
collect_stats=$4

current_date=$(date '+%d-%m-%Y_%H-%M')

checkMainClassName $main_class_name
checkApplicationName $application_name
checkBoolean $start_container
checkBoolean $collect_stats

setApplicationName $application_name
element_strategy=$(setElementStrategy $application_name)
setTestSuitePath $application_name $element_strategy
setDependencyGraphPath $application_name
./setup-project-classpath.sh $application_name

if [[ $start_container == "true" ]]; then
    runContainer $application_name $current_date
fi

status=257
extraction_strategy=
if [[ $main_class_name == "validate_deps_original_order" ]]; then
    extraction_strategy=original_order
    setExtractionStrategy $extraction_strategy
    java -Xms2048m -Xmx2048m -cp $classpath \
        com.dante.tedd.validation.ComputeAndValidateDependencies \
            > $HOME/Desktop/logs"_"$main_class_name"_"$application_name.txt \
            2> $HOME/Desktop/errors"_"$main_class_name"_"$application_name.txt
    status=${?}
elif [[ $main_class_name == "validate_deps_biobjective" ]]; then
    extraction_strategy=biobjective
    setExtractionStrategy $extraction_strategy
    java -Xms2048m -Xmx2048m -cp $classpath \
        com.dante.tedd.validation.ComputeAndValidateDependencies \
        > $HOME/Desktop/logs"_"$main_class_name"_"$application_name.txt \
            2> $HOME/Desktop/errors"_"$main_class_name"_"$application_name.txt
    status=${?}
elif [[ $main_class_name == "validate_deps_coverage_driven" ]]; then
    extraction_strategy=coverage_driven
    setExtractionStrategy $extraction_strategy
    java -Xms2048m -Xmx2048m -cp $classpath \
        com.dante.tedd.validation.ComputeAndValidateDependencies \
        > $HOME/Desktop/logs"_"$main_class_name"_"$application_name.txt \
            2> $HOME/Desktop/errors"_"$main_class_name"_"$application_name.txt
    status=${?}
elif [[ $main_class_name == "validate_deps_sub_use" ]]; then
    extraction_strategy=sub_use
    setExtractionStrategy $extraction_strategy
    java -Xms2048m -Xmx2048m -cp $classpath \
        com.dante.tedd.validation.ComputeAndValidateDependencies \
        > $HOME/Desktop/logs"_"$main_class_name"_"$application_name.txt \
            2> $HOME/Desktop/errors"_"$main_class_name"_"$application_name.txt
    status=${?}
elif [[ $main_class_name == "refine_original_order" ]]; then
    extraction_strategy=original_order
    setExtractionStrategy $extraction_strategy
    java -Xms2048m -Xmx2048m -cp $classpath \
        com.dante.tedd.validation.ValidateDependencies \
        > $HOME/Desktop/logs"_"$main_class_name"_"$application_name.txt \
            2> $HOME/Desktop/errors"_"$main_class_name"_"$application_name.txt
    status=${?}
elif [[ $main_class_name == "refine_coverage_driven" ]]; then
    extraction_strategy=coverage_driven
    setExtractionStrategy $extraction_strategy
    java -Xms2048m -Xmx2048m -cp $classpath \
        com.dante.tedd.validation.ValidateDependencies \
        > $HOME/Desktop/logs"_"$main_class_name"_"$application_name.txt \
            2> $HOME/Desktop/errors"_"$main_class_name"_"$application_name.txt
    status=${?}
elif [[ $main_class_name == "refine_sub_use" ]]; then
    extraction_strategy=sub_use
    setExtractionStrategy $extraction_strategy
    java -Xms2048m -Xmx2048m -cp $classpath \
        com.dante.tedd.validation.ValidateDependencies \
        > $HOME/Desktop/logs"_"$main_class_name"_"$application_name.txt \
            2> $HOME/Desktop/errors"_"$main_class_name"_"$application_name.txt
    status=${?}
elif [[ $main_class_name == "refine_biobjective" ]]; then
    extraction_strategy=biobjective
    setExtractionStrategy $extraction_strategy
    java -Xms2048m -Xmx2048m -cp $classpath \
        com.dante.tedd.validation.ValidateDependencies \
        > $HOME/Desktop/logs"_"$main_class_name"_"$application_name.txt \
            2> $HOME/Desktop/errors"_"$main_class_name"_"$application_name.txt
    status=${?}
else
    echo Unknonw class name: $main_class_name
    exit 1
fi

dependency_graph_path="$HOME/workspace/ICST20-submission-material-DANTE/dante/applications/$application_name/testsuite-$application_name/src/main/resources"

if [[ $status == 50 && $collect_stats == "true" ]]; then
    # copy last dependency graph in appropriate dir and rename it as initial
    dependency_graphs=($(ls -t $dependency_graph_path))
    dependency_graph=${dependency_graphs[0]}
    echo More recent dependency graph: $dependency_graph. Copy in $dependency_graph_path.
    cp $dependency_graph_path/$dependency_graph "$dependency_graph_path/graph-initial-$extraction_strategy-$application_name.txt"
fi

if [[ $collect_stats == "true" ]]; then
    ./collect-stats.sh $application_name $main_class_name $extraction_strategy
fi

if [[ $start_container == "true" ]]; then
    stopContainer $application_name $current_date
fi

if [[ $status == 50 && $collect_stats == "true" ]]; then
    # rename it properly after copy in results
    mv "$dependency_graph_path/graph-initial-$application_name.txt" "$dependency_graph_path/dependency-graph-initial-$application_name.txt"
    # start refine
    new_main_class_name="refine_"
    if [[ $main_class_name == *original_order ]]; then
        new_main_class_name=$new_main_class_name"original_order"
    elif [[ $main_class_name == *biobjective ]]; then
        new_main_class_name=$new_main_class_name"biobjective"
    fi
    echo New main class name: $new_main_class_name
    ./run-tedd.sh $new_main_class_name $application_name $start_container $collect_stats
fi