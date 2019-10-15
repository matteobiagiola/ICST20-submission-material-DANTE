#!/bin/bash

# run test suite (application has to be active on http://localhost:3000)
cp=$(mvn dependency:build-classpath | grep ".jar:")

java -cp "$cp:./target/classes" main.CheckSuiteFlakiness {{test_suite_qualified_name}}