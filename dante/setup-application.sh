#!/bin/bash

petclinic_classpath=$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar:$HOME/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-edge-driver/3.141.59/selenium-edge-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-firefox-driver/3.141.59/selenium-firefox-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-ie-driver/3.141.59/selenium-ie-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-opera-driver/3.141.59/selenium-opera-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-remote-driver/3.141.59/selenium-remote-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-safari-driver/3.141.59/selenium-safari-driver-3.141.59.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy/1.8.15/byte-buddy-1.8.15.jar:$HOME/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:$HOME/.m2/repository/com/google/guava/guava/25.0-jre/guava-25.0-jre.jar:$HOME/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:$HOME/.m2/repository/org/checkerframework/checker-compat-qual/2.0.0/checker-compat-qual-2.0.0.jar:$HOME/.m2/repository/com/google/errorprone/error_prone_annotations/2.1.3/error_prone_annotations-2.1.3.jar:$HOME/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:$HOME/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar:$HOME/.m2/repository/com/squareup/okhttp3/okhttp/3.11.0/okhttp-3.11.0.jar:$HOME/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-support/3.4.0/selenium-support-3.4.0.jar:$HOME/.m2/repository/cglib/cglib-nodep/3.2.4/cglib-nodep-3.2.4.jar:$HOME/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:$HOME/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpclient/4.5.3/httpclient-4.5.3.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpcore/4.4.6/httpcore-4.4.6.jar:$HOME/.m2/repository/net/java/dev/jna/jna/4.1.0/jna-4.1.0.jar:$HOME/.m2/repository/net/java/dev/jna/jna-platform/4.1.0/jna-platform-4.1.0.jar:$HOME/.m2/repository/io/github/bonigarcia/webdrivermanager/3.3.0/webdrivermanager-3.3.0.jar:$HOME/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:$HOME/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:$HOME/.m2/repository/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.jar:$HOME/.m2/repository/org/rauschig/jarchivelib/1.0.0/jarchivelib-1.0.0.jar:$HOME/.m2/repository/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:$HOME/.m2/repository/org/jsoup/jsoup/1.11.3/jsoup-1.11.3.jar:$HOME/.m2/repository/io/webfolder/cdp4j/3.0.8/cdp4j-3.0.8.jar:$HOME/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar:$HOME/.m2/repository/com/atlassian/sourcemap/sourcemap/1.7.7/sourcemap-1.7.7.jar:$HOME/.m2/repository/mysql/mysql-connector-java/6.0.5/mysql-connector-java-6.0.5.jar
splittypie_classpath=$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar:$HOME/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-edge-driver/3.141.59/selenium-edge-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-firefox-driver/3.141.59/selenium-firefox-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-ie-driver/3.141.59/selenium-ie-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-opera-driver/3.141.59/selenium-opera-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-remote-driver/3.141.59/selenium-remote-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-safari-driver/3.141.59/selenium-safari-driver-3.141.59.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy/1.8.15/byte-buddy-1.8.15.jar:$HOME/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:$HOME/.m2/repository/com/google/guava/guava/25.0-jre/guava-25.0-jre.jar:$HOME/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:$HOME/.m2/repository/org/checkerframework/checker-compat-qual/2.0.0/checker-compat-qual-2.0.0.jar:$HOME/.m2/repository/com/google/errorprone/error_prone_annotations/2.1.3/error_prone_annotations-2.1.3.jar:$HOME/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:$HOME/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar:$HOME/.m2/repository/com/squareup/okhttp3/okhttp/3.11.0/okhttp-3.11.0.jar:$HOME/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-support/3.4.0/selenium-support-3.4.0.jar:$HOME/.m2/repository/cglib/cglib-nodep/3.2.4/cglib-nodep-3.2.4.jar:$HOME/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:$HOME/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpclient/4.5.3/httpclient-4.5.3.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpcore/4.4.6/httpcore-4.4.6.jar:$HOME/.m2/repository/net/java/dev/jna/jna/4.1.0/jna-4.1.0.jar:$HOME/.m2/repository/net/java/dev/jna/jna-platform/4.1.0/jna-platform-4.1.0.jar:$HOME/.m2/repository/io/github/bonigarcia/webdrivermanager/3.6.2/webdrivermanager-3.6.2.jar:$HOME/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:$HOME/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:$HOME/.m2/repository/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.jar:$HOME/.m2/repository/org/rauschig/jarchivelib/1.0.0/jarchivelib-1.0.0.jar:$HOME/.m2/repository/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:$HOME/.m2/repository/org/jsoup/jsoup/1.11.3/jsoup-1.11.3.jar:$HOME/.m2/repository/io/webfolder/cdp4j/3.0.8/cdp4j-3.0.8.jar:$HOME/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar:$HOME/.m2/repository/com/atlassian/sourcemap/sourcemap/1.7.7/sourcemap-1.7.7.jar
retroboard_classpath=$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar:$HOME/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-edge-driver/3.141.59/selenium-edge-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-firefox-driver/3.141.59/selenium-firefox-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-ie-driver/3.141.59/selenium-ie-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-opera-driver/3.141.59/selenium-opera-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-remote-driver/3.141.59/selenium-remote-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-safari-driver/3.141.59/selenium-safari-driver-3.141.59.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy/1.8.15/byte-buddy-1.8.15.jar:$HOME/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:$HOME/.m2/repository/com/google/guava/guava/25.0-jre/guava-25.0-jre.jar:$HOME/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:$HOME/.m2/repository/org/checkerframework/checker-compat-qual/2.0.0/checker-compat-qual-2.0.0.jar:$HOME/.m2/repository/com/google/errorprone/error_prone_annotations/2.1.3/error_prone_annotations-2.1.3.jar:$HOME/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:$HOME/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar:$HOME/.m2/repository/com/squareup/okhttp3/okhttp/3.11.0/okhttp-3.11.0.jar:$HOME/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-support/3.4.0/selenium-support-3.4.0.jar:$HOME/.m2/repository/cglib/cglib-nodep/3.2.4/cglib-nodep-3.2.4.jar:$HOME/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:$HOME/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpclient/4.5.3/httpclient-4.5.3.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpcore/4.4.6/httpcore-4.4.6.jar:$HOME/.m2/repository/net/java/dev/jna/jna/4.1.0/jna-4.1.0.jar:$HOME/.m2/repository/net/java/dev/jna/jna-platform/4.1.0/jna-platform-4.1.0.jar:$HOME/.m2/repository/io/github/bonigarcia/webdrivermanager/3.3.0/webdrivermanager-3.3.0.jar:$HOME/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:$HOME/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:$HOME/.m2/repository/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.jar:$HOME/.m2/repository/org/rauschig/jarchivelib/1.0.0/jarchivelib-1.0.0.jar:$HOME/.m2/repository/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:$HOME/.m2/repository/org/jsoup/jsoup/1.11.3/jsoup-1.11.3.jar:$HOME/.m2/repository/io/webfolder/cdp4j/3.0.8/cdp4j-3.0.8.jar:$HOME/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar:$HOME/.m2/repository/com/atlassian/sourcemap/sourcemap/1.7.7/sourcemap-1.7.7.jar
phoenix_classpath=$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar:$HOME/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-edge-driver/3.141.59/selenium-edge-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-firefox-driver/3.141.59/selenium-firefox-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-ie-driver/3.141.59/selenium-ie-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-opera-driver/3.141.59/selenium-opera-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-remote-driver/3.141.59/selenium-remote-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-safari-driver/3.141.59/selenium-safari-driver-3.141.59.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy/1.8.15/byte-buddy-1.8.15.jar:$HOME/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:$HOME/.m2/repository/com/google/guava/guava/25.0-jre/guava-25.0-jre.jar:$HOME/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:$HOME/.m2/repository/org/checkerframework/checker-compat-qual/2.0.0/checker-compat-qual-2.0.0.jar:$HOME/.m2/repository/com/google/errorprone/error_prone_annotations/2.1.3/error_prone_annotations-2.1.3.jar:$HOME/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:$HOME/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar:$HOME/.m2/repository/com/squareup/okhttp3/okhttp/3.11.0/okhttp-3.11.0.jar:$HOME/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-support/3.4.0/selenium-support-3.4.0.jar:$HOME/.m2/repository/cglib/cglib-nodep/3.2.4/cglib-nodep-3.2.4.jar:$HOME/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:$HOME/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpclient/4.5.3/httpclient-4.5.3.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpcore/4.4.6/httpcore-4.4.6.jar:$HOME/.m2/repository/net/java/dev/jna/jna/4.1.0/jna-4.1.0.jar:$HOME/.m2/repository/net/java/dev/jna/jna-platform/4.1.0/jna-platform-4.1.0.jar:$HOME/.m2/repository/io/github/bonigarcia/webdrivermanager/3.3.0/webdrivermanager-3.3.0.jar:$HOME/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:$HOME/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:$HOME/.m2/repository/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.jar:$HOME/.m2/repository/org/rauschig/jarchivelib/1.0.0/jarchivelib-1.0.0.jar:$HOME/.m2/repository/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:$HOME/.m2/repository/org/jsoup/jsoup/1.11.3/jsoup-1.11.3.jar:$HOME/.m2/repository/io/webfolder/cdp4j/3.0.8/cdp4j-3.0.8.jar:$HOME/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar:$HOME/.m2/repository/com/atlassian/sourcemap/sourcemap/1.7.7/sourcemap-1.7.7.jar:$HOME/.m2/repository/org/postgresql/postgresql/42.2.1/postgresql-42.2.1.jar
dimeshift_classpath=$HOME/.m2/repository/junit/junit/4.12/junit-4.12.jar:$HOME/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-edge-driver/3.141.59/selenium-edge-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-firefox-driver/3.141.59/selenium-firefox-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-ie-driver/3.141.59/selenium-ie-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-opera-driver/3.141.59/selenium-opera-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-remote-driver/3.141.59/selenium-remote-driver-3.141.59.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-safari-driver/3.141.59/selenium-safari-driver-3.141.59.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy/1.8.15/byte-buddy-1.8.15.jar:$HOME/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:$HOME/.m2/repository/com/google/guava/guava/25.0-jre/guava-25.0-jre.jar:$HOME/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:$HOME/.m2/repository/org/checkerframework/checker-compat-qual/2.0.0/checker-compat-qual-2.0.0.jar:$HOME/.m2/repository/com/google/errorprone/error_prone_annotations/2.1.3/error_prone_annotations-2.1.3.jar:$HOME/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:$HOME/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar:$HOME/.m2/repository/com/squareup/okhttp3/okhttp/3.11.0/okhttp-3.11.0.jar:$HOME/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:$HOME/.m2/repository/org/seleniumhq/selenium/selenium-support/3.4.0/selenium-support-3.4.0.jar:$HOME/.m2/repository/cglib/cglib-nodep/3.2.4/cglib-nodep-3.2.4.jar:$HOME/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:$HOME/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpclient/4.5.3/httpclient-4.5.3.jar:$HOME/.m2/repository/org/apache/httpcomponents/httpcore/4.4.6/httpcore-4.4.6.jar:$HOME/.m2/repository/net/java/dev/jna/jna/4.1.0/jna-4.1.0.jar:$HOME/.m2/repository/net/java/dev/jna/jna-platform/4.1.0/jna-platform-4.1.0.jar:$HOME/.m2/repository/io/github/bonigarcia/webdrivermanager/3.3.0/webdrivermanager-3.3.0.jar:$HOME/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:$HOME/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:$HOME/.m2/repository/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.jar:$HOME/.m2/repository/org/rauschig/jarchivelib/1.0.0/jarchivelib-1.0.0.jar:$HOME/.m2/repository/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:$HOME/.m2/repository/org/jsoup/jsoup/1.11.3/jsoup-1.11.3.jar:$HOME/.m2/repository/io/webfolder/cdp4j/3.0.8/cdp4j-3.0.8.jar:$HOME/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar:$HOME/.m2/repository/com/atlassian/sourcemap/sourcemap/1.7.7/sourcemap-1.7.7.jar:$HOME/.m2/repository/mysql/mysql-connector-java/6.0.5/mysql-connector-java-6.0.5.jar

os=$(uname)

properties_file=$PWD/src/main/resources/app.properties

function checkProjectName(){
	local application_name_local=$1
	if [[ $application_name_local != "petclinic" && $application_name_local != "splittypie" && $application_name_local != "retroboard" \
		&& $application_name_local != "phoenix" && $application_name_local != "dimeshift" ]]; then
		echo Unknown application name: $application_name_local
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

function setTestSuite() {
    local element_strategy=$1
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
        echo Unknown element strategy: $element_strategy
		exit 1
	fi
	local test_suite_file=$(grep test_suite_path= $properties_file | awk -F'=' '{print $2}')
    if [[ -f $test_suite_file ]]; then
        echo Test suite $test_suite_file set!
    else
        echo Test suite $test_suite_file does not exist!
        exit 1
    fi
}

function setClasspath(){
    local application_name_local=$1
    local application_classpath=
    if [[ $application_name_local == "petclinic" ]]; then
        application_classpath=$petclinic_classpath
    elif [[ $application_name_local == "splittypie" ]]; then
        application_classpath=$splittypie_classpath
    elif [[ $application_name_local == "retroboard" ]]; then
        application_classpath=$retroboard_classpath
    elif [[ $application_name_local == "phoenix" ]]; then
        application_classpath=$phoenix_classpath
    elif [[ $application_name_local == "dimeshift" ]]; then
        application_classpath=$dimeshift_classpath
    else
        echo Unknown application name: $application_name_local
        exit 1
    fi
    if [[ $os == "Darwin" ]]; then
        sed -i "" "s%project_classpath=.*$%project_classpath=$application_classpath%g" $properties_file
    else
        sed -i "s%project_classpath=.*$%project_classpath=$application_classpath%g" $properties_file
    fi
}

function setApplicationRelatedVariables(){
    local application_name_local=$1
    local current_application=$(grep application_name= $properties_file | awk -F'=' '{print $2}')
    if [[ $current_application != $application_name_local ]]; then
        if [[ $os == "Darwin" ]]; then
            sed -i "" "s/$current_application/$application_name_local/g" $properties_file
        else
            sed -i "s/$current_application/$application_name_local/g" $properties_file
        fi
    fi
}

#----------------------------------------------------------------------------------------------------------------------

if test $# -lt 3 ; then echo 'ARGS: application_name (petclinic|splittypie|retroboard|phoenix|dimeshift) crawljax_element_strategy (fired|checked)' ; exit 1 ; fi

application_name=$1
crawljax_element_strategy=$2

checkProjectName $application_name
checkElementStrategy $crawljax_element_strategy
setClasspath $application_name
setApplicationRelatedVariables $application_name
setTestSuite $crawljax_element_strategy