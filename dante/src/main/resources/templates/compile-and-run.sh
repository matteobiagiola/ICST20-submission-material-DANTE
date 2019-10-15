#!/bin/bash

function checkBoolean(){
    local boolean=$1
	if [[ $boolean != "true" && $boolean != "false" ]]; then
		echo Unknown boolean value: $boolean. It is either true or false.
		exit 1
	fi
}

if test $# -lt 2 ; then echo 'ARGS: compile [true|false], coverage [true|false]' ; exit 1 ; fi

compile=$1
coverage=$2

checkBoolean $compile
checkBoolean $coverage

if [[ $compile == "true" ]]; then
    # compile
    mvn clean compile
fi

# run test suite (application has to be active on {{app_url}})
cp=$(mvn dependency:build-classpath | grep ".jar:")

if [[ $coverage == "true" ]]; then
    java -cp "$cp:./target/classes" org.junit.runner.JUnitCore tests.{{test_suite_name_coverage}}

else
    java -cp "$cp:./target/classes" org.junit.runner.JUnitCore tests.{{test_suite_name}}

fi