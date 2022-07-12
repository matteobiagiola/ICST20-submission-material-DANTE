# ICST20-submission-material-DANTE
Submission material for ICST 2020 paper "Dependency-Aware Web Test Generation"

This repository contains the tool implementing the approach described in an ICST20 submission, together with the subjects used in the evaluation. DANTE has been tested in MacOS Mojave 10.14.6 and Ubuntu (18.04 LTS).

## 1. Automatic Setup
A virtual machine running Ubuntu 18.04 LTS is available for download [here](https://drive.switch.ch/index.php/s/w307bjzHz3tmwXm/download) . The virtual machine contains this repository and all the dependencies needed to run DANTE on the test suite subjects. 

The virtual machine was created with VirtualBox and was exported in the `.ova` format, a platform-independent distribution format for virtual machines. It can be imported by any virtualization software although it was tested only on VirtualBox and VMWare Fusion. Instructions on how to import an `.ova` format virtual machine in VirtualBox and VMWare Fusion are listed below:

- VirtualBox: https://www.techjunkie.com/ova-virtualbox/
- VMWare Fusion: https://pubs.vmware.com/fusion-5/index.jsp?topic=%2Fcom.vmware.fusion.help.doc%2FGUID-275EF202-CF74-43BF-A9E9-351488E16030.html

The minimum amount of RAM to assign to the virtual machine is `4GB`.

Login credentials:
- username: `icst20-dante`
- password: `icst20dante`

If the automatic setup worked, you can skip to [the run experiments section](#2-run-the-experiments-crawling---after-the-setup). Otherwise procede to the [manual setup section](#11-manual-setup).

#### 1.1 Manual Setup
- Install java 1.8 ([instructions for MacOS](https://mkyong.com/java/how-to-install-java-on-mac-osx/#homebrew-install-latest-java-on-macos));

- Install [Maven 3.6.0](https://archive.apache.org/dist/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.zip);

- Install `crawljax` locally by going to the [directory](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/crawljax) on the terminal and typing `mvn install -DskipTests`;

- Create the directory `~/.m2/repository/com` and move inside it the content of the [atlassian-custom-library](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/atlassian-custom-library) directory. This is because the `sourcemap` library version (1.7.7) used in this project is no longer supported;

- Rename the [app.example.properties](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/src/main/resources/app.example.properties) file as `app.properties` and the [log4j.example.properties](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/src/main/resources/log4j.example.properties) file as `log4j.properties`.



## 2. Run the experiments (Crawling - after the setup)
The script to run the crawling is [run-crawling.sh](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/run-crawling.sh). 

The first argument is the `application_name`. The available values are:

- `phoenix|dimeshift|splittypie|retroboard|petclinic|ecommerce`

The second argument is the `headless` flag which determines if the browser starts headless or with the GUI. The available values are:

- `true|false`

The third argument is a number, `crawling_max_runtime` which determines a timeout for the crawler.

We are going to choose the `ecommerce` application to show how the tool works, since the single steps that come later are much faster to execute than with the subject systems we used in the paper. The results in the paper can be replicated but it simply takes longer:

- the output of the crawler applied to the subject systems will be available soon;

- the coverage reports for the subject systems used in the paper will be available soon;

The following commands in this README assume you are in the `~/workspace/ICST20-submission-material-DANTE/dante` folder, assuming that `~` indicates the path to the home directory in your system:

- `./run-crawling.sh ecommerce false 5` (the crawler terminates the exploration in ~3 min)

After crawling the folder `dante/applications/ecommerce/localhost/crawl-with-inputs` is created, which contains the results of the crawling. In the folder `dante/applications/ecommerce` there is a file called `selenium-actions-ecommerce-fired.txt` which lists the test cases created by the crawler while it was exploring the application. The crawling generates around 18 tests.

## 3. Run the experiments (Create java projects from crawling - after the setup and step 2)
In this step the `dante/applications/ecommerce/seletion-actions-ecommerce-fired.txt` is used to generate the test suite. The script to create the test suite and run it is [generate-java-project-from-crawling.sh](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/generate-java-project-from-crawling.sh). 

The first argument is `application_name` and the second argument is `headless`. Following with the `ecommerce` example the command to run is:

- `./generate-java-project-from-crawling.sh ecommerce false` 

The command generates the java project with the test suite and runs it. It also collects the coverage of all tests.

## 4. Run the experiments (Fix flakiness in created JUnit test suites - after the setup and step 3)
In the running example with the `ecommerce` application, the test suite is not flaky. In general, DANTE does not fix flakiness automatically, therefore the generated test suite needs to be fixed. In particular the applications `splittypie` and `phoenix` are challenging in terms of flakiness since in `splittypie` there are many notifications that hide web elements and the menu in `phoenix` is not deterministic (the order of the items in the menu randomly changes).  

Another task that has to be performed manually is the implementation of the reset state class, which is called both by the validation script (i.e. `tedd`) and when the tests are executed in isolation (i.e. `atusa` and `crawljax`). An example is the [ResetAppState](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/applications/dimeshift/testsuite-dimeshift/src/main/java/utils/ResetAppState.java) class of the `dimeshift` application. However, with the `ecommerce` application, it is not needed to implement the reset state class, since closing the browser after each test case execution is enough to completely clean up the state of the web application.

## 5. Run the experiments (Filtering - after the setup and step 4)
In this step we provide two techniques to filter the dependencies of the test suite before the validation step. DANTE has two filtering techniques although in the paper we show that the first one (i.e. the [coverage-driven filter](#51-coverage-driven-filter)) is more efficient.

### 5.1 Coverage-driven filter
The script to run the coverage-driven filter is [run-coverage-driven-filter.sh](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/run-coverage-driven-filter.sh). The first argument is the `application_name` and the second one is the `headless` flag.

With the running example `ecommerce` the command to run is:

- `./run-coverage-driven-filter.sh ecommerce false` (it takes ~15 s)

The coverage-driven filter selects two tests, namely `test00` and `test13`. Such test suite does not need to be fixed because `test13` does not depend on `test00`. The results can be seen in the logs saved in the `Desktop` folder, named `logs_CoverageDrivenTestSelection_ecommerce.txt`.
 
### 5.2 Bi-objective filter
The script to run the coverage-driven filter is [run-biobjective-filter.sh](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/run-biobjective-filter.sh). The first argument is the `application_name` and the second one is the `plot_pareto_front` flag which determines if the computed pareto front is going to be plotted (an R script is used).

With the running example `ecommerce` the command to run is:

- `./run-biobjective-filter.sh ecommerce true` (it takes ~50 s)

The plot of the pareto front is saved in the `Desktop/ecommerce-biobjective-filter` folder. The solution chosen is picked by computing the derivative at all points in the pareto front and taking the point with the maximum derivative. In the running example the solution chosen is the one in which the dependency graph has 12 dependencies with a recovery cost of 2.38 (as reported in the logs in the `Desktop` folder named `logs_ComputeParetoBestSolution_ecommerce.txt`).

## 6. Run the experiments (Dependency validation - after the setup and step 5)
The script to run the test dependency validation is [run-tedd.sh](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/run-tedd.sh). 

The first argument is the `application_name`;

The second one is the `main_class_name` which determines the extraction strategy used to generate the initial test dependency graph and if the validation will be performed from scratch (prefixed with `validate_deps_[extraction_strategy]`) or starting from a partially validated dependency graph (prefixed with `refine_[extraction_strategy]`). The available values are:

- `validate_deps_original_order | validate_deps_sub_use | validate_deps_coverage_driven | validate_deps_biobjective | refine_original_order | refine_coverage_driven | refine_sub_use | refine_biobjective`

Therefore theare are four extraction strategies, namely `original_order | sub_use | coverage_driven | biobjective`. In DANTE we are interested to evaluate the `coverage_driven` and the `biobjective` options.

The third argument is the `start_container` flag (either `true` or `false`) which determines if the docker container with the application under test is going to be started or not. Finally, the fourth argument is the `collect_stats` flag. If `true` the dependency graphs obtained during the iterations as well as the final dependency graph are saved in the `Desktop/[application_name]-validation-[extraction_strategy]`.

For our running example `ecommerce` we run the following commands:

- `./run-tedd.sh ecommerce validate_deps_biobjective true true` (it takes ~5 s, see log file `logs_validate_deps_coverage_driven_ecommerce.txt` in the `Desktop` folder)

- `./run-tedd.sh ecommerce validate_deps_coverage_driven true true` (it takes ~10 min, see log file `logs_validate_deps_biobjective_ecommerce.txt` in the `Desktop` folder)

In the first case the final dependency graph is `dependency-graph-biobjective-final-recover-missed-ecommerce.txt` in the folder `Desktop/ecommerce-validation-biobjective`. This graph contains two dependencies, namely `test16 -> test14` and `test15 -> test14`. In the second case the final dependency graph is `dependency-graph-coverage_driven-final-ecommerce.txt` in the folder `Desktop/ecommerce-validation-coverage_driven`. The validation step confirms the result of the fixed selected test suite algorithm performed in the [coverage-driven filter step](#51-coverage-driven-filter), which states that `test00` and `test13`, the selected test cases, are not dependent.

## 7. Run the experiments (Test minimization - after the setup and step 6)
The script to run the test minimization is [run-minimization.sh](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/run-minimization.sh). The first argument is the `application_name`, the second argument is the `headless` flag and the third argument is the `extraction_strategy`, either `biobjective` or `coverage_driven`. The minimization step uses the [Z3 SAT solver](https://github.com/Z3Prover/z3) to minimize the initial test suite generated by the crawler (composed of 18 tests for the `ecommerce` application) taking into account the coverage reports computed at [step 2](#2-run-the-experiments-crawling---after-the-setup) and the test dependencies computed at [step 6](#6-run-the-experiments-dependency-validation---after-the-setup-and-step-5). Finally, the minimized test suite is executed to make sure that every test in the minimized test suite passes.

Following our running example `ecommerce` we run the following commands:

- `./run-minimization.sh ecommerce true biobjective` 

- `./run-minimization.sh ecommerce true coverage_driven` 

Log files can be found in the `Desktop` folder named, respectively, `logs_MinimizedTestSuite_biobjective_ecommerce.txt` and `logs_MinimizedTestSuite_coverage_driven_ecommerce.txt`. In both cases the minimized test suite is composed of two tests, namely `test00` and `test13`. To make sure that both tests pass see the logs `logs_ExecuteMinimizedTestSuite_biobjective_ecommerce.txt` and `logs_ExecuteMinimizedTestSuite_coverage_driven_ecommerce.txt`.

## 8. Run the experiments (Comparison - after the setup and step 7)
Here we compare DANTE with Crawljax and Atusa in terms of JS code coverage. The script to run the test minimization is [run-tests-and-measure-coverage.sh](https://github.com/matteobiagiola/ICST20-submission-material-DANTE/blob/master/dante/run-tests-and-measure-coverage.sh). The first argument is the `application_name`, the second argument is the `headless` flag and the third argument is the `technique` whose values are `dante|crawljax|atusa`. The fourth argument is the `extraction_strategy` but it is required only when the `technique` is `dante`.

To run the comparison we execute the following commands:
- `./run-tests-and-measure-coverage.sh ecommerce true dante coverage_driven` (same results can be obtained with the `biobjective` extraction strategy)

- `./run-tests-and-measure-coverage.sh ecommerce true crawljax`

- `./run-tests-and-measure-coverage.sh ecommerce true atusa`

The log files `logs_RunTests_[technique]_ecommerce.txt` in the `Desktop` folder report the tests that passed as well as the tests that broke. The log files `logs_MeasureCoverageOfTests_[technique]_ecommerce.txt` in the `Desktop` folder report the code coverage achieved by the non-broken tests.

All techniques achieve the same code coverage, i.e. `97%`, but with different test suite sizes and breakage rates:
- DANTE generates two tests and none of them break (breakage rate `0%`). Coverage reports are in the `dante/applications/ecommerce/testsuite-ecommerce/date-coverage-reports`;
- Crawljax generates 18 tests and two of them break (breakage rate `11%`) Coverage reports are in the `dante/applications/ecommerce/testsuite-ecommerce/crawljax-coverage-reports`;
- Atusa generates 37 tests and none of them break (breakage rate `0%`) Coverage reports are in the `dante/applications/ecommerce/testsuite-ecommerce/atusa-coverage-reports-k-15`. The value of `k` is determined automatically as described in the paper.
