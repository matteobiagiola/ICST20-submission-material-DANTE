#!/bin/bash

# run test suite (application has to be active on http://localhost:4200)
cp=$(mvn dependency:build-classpath | grep ".jar:")

java -cp "$cp:./target/classes" main.CheckSuiteFlakiness tests.GeneratedTestSuiteChecked
