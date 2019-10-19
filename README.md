# ICST20-submission-material-DANTE
Submission material for ICST 2020 paper "Dependency-Aware Web Test Generation"

This repository contains the tool implementing the approach described in an ICST20 submission, together with the subjects used in the evaluation. DANTE has been tested in MacOS Mojave 10.14.6 and Ubuntu (18.04 LTS).

## 1. Automatic Setup
A virtual machine running Ubuntu 18.04 LTS is available for download at ... . The virtual machine contains this repository and all the dependencies needed to run DANTE on the test suite subjects. 

The virtual machine was created with VirtualBox and was exported in the `.ova` format, a platform-independent distribution format for virtual machines. It can be imported by any virtualization software although it was tested only on VirtualBox and VMWare Fusion. Instructions on how to import an `.ova` format virtual machine in VirtualBox and VMWare Fusion are listed below:

- VirtualBox: https://www.techjunkie.com/ova-virtualbox/
- VMWare Fusion: https://pubs.vmware.com/fusion-5/index.jsp?topic=%2Fcom.vmware.fusion.help.doc%2FGUID-275EF202-CF74-43BF-A9E9-351488E16030.html

The minimum amount of RAM to assign to the virtual machine is `4GB`.

Login credentials:
- username: `icst20-dante`
- password: `icst20-dante`

If the automatic setup worked, you can skip to [the run experiments section](#2-run-the-experiments---crawling-after-the-setup). Otherwise procede to the [manual setup section](#11-manual-setup).

#### 1.1 Manual Setup
Steps to configure the environment will be provided soon.

## 2. Run the experiments (Crawling - after the setup)
The script to run the crawling is [run-crawling.sh](https://github.com/anon-icst2020/ICST20-submission-material-DANTE/blob/master/dante/run-crawling.sh). 

The first argument is the `application_name`. The available values are:
- `phoenix|dimeshift|splittypie|retroboard|petclinic|ecommerce`

The second argument is the `headless` flag which determines if the browser starts headless or with the GUI. The available values are:
- `true|false`

The third argument is a number, `crawling_max_runtime` which determines a timeout for the crawler.

We are going to choose the `ecommerce` application to show how the tool works, since the single steps that come later are much faster to execute than with the subject systems we used in the paper. The results in the paper can be replicated but it simply takes longer.

The following commands in this README assume you are in the `~/workspace/ICST20-submission-material-DANTE/dante` folder, assuming that `~` indicates the path to the home directory in your system:

- `./run-crawling.sh ecommerce false 5` (the crawler terminates the exploration in ~3 min)

After the crawling the folder `dante/applications/ecommerce/localhost/crawl-with-inputs` is created, which contains the results of the crawling. In the folder `dante/applications/ecommerce` there is a file called `selenium-actions-ecommerce-fired.txt` which lists the test cases created by the crawler while it was exploring the application. The crawling generates around 18 tests.

## 3. Run the experiments (Create java projects from crawling - after the setup and step 2)
In this step the `dante/applications/ecommerce/seletion-actions-ecommerce-fired.txt` is used to generate the test suite. The script to create the test suite and run it is [generate-java-project-from-crawling.sh](https://github.com/anon-icst2020/ICST20-submission-material-DANTE/blob/master/dante/generate-java-project-from-crawling.sh). 

The first argument is `application_name` and the second argument is `headless`. Following with the `ecommerce` example the command to run is:
- `./generate-java-project-from-crawling.sh ecommerce false` 

The command generates the java project with the test suite and runs it. It also collects the coverage of all tests.

## 4. Run the experiments (Fix flakiness in created JUnit test suites - after the setup and step 3)
In the running example with the `ecommerce` application, the test suite is not flaky. In general, DANTE does not fix flakiness automatically, therefore the generated test suite needs to be fixed. In particular the applications `splittypie` and `phoenix` are challenging in terms of flakiness since in `splittypie` there are many notifications that hide web elements and the menu in `phoenix` is not deterministic (the order of the items in the menu keeps changing).  

Another task that has to be performed manually is the implementation of the reset state class, which is called both by the validation script (i.e. `tedd`) and when the tests are run in isolation (i.e. `atusa` and `crawljax`). An example is the [ResetAppState](https://github.com/anon-icst2020/ICST20-submission-material-DANTE/blob/master/dante/applications/dimeshift/testsuite-dimeshift/src/main/java/utils/ResetAppState.java) class of the `dimeshift` application. However, with the `ecommerce` application, it is not needed to implement the reset state class, since closing the browser after each test case execution is enough to completely clean up the state of the web application.

## 5. Run the experiments (Filtering - after the setup and step 4)
In this step we provide to techniques to filter the dependencies of the test suite before the validation step. DANTE has two filtering techniques although in the paper we show that the first one (i.e. the [coverage-driven filter](#51-coverage-driven-filter)) is more efficient.

### 5.1 Coverage-driven filter
The script to run the coverage-driven filter is [run-coverage-driven-filter.sh](https://github.com/anon-icst2020/ICST20-submission-material-DANTE/blob/master/dante/run-coverage-driven-filter.sh). The first argument is the `application_name` and the second one is the `headless` flag.

With the running example `ecommerce` the command to run is:
- `./run-coverage-driven-filter.sh ecommerce false`

The coverage-driven filter selects two tests, namely `test00` and `test13`. Such test suite does not need to be fixed because `test13` does not depend on `test00`. The results can be seen in the logs saved in the `Desktop` folder, named `logs_CoverageDrivenTestSelection_ecommerce.txt`.
 
### 5.2 Bi-objective filter
The script to run the coverage-driven filter is [run-biobjective-filter.sh](https://github.com/anon-icst2020/ICST20-submission-material-DANTE/blob/master/dante/run-biobjective-filter.sh). The first argument is the `application_name` and the second one is the `plot_pareto_front` flag which determines if the computed pareto front is going to be plotted (an R script is used).

With the running example `ecommerce` the command to run is:
- `./run-biobjective-filter.sh ecommerce true`

The plot of the pareto front is saved in the `Desktop/ecommerce-biobjective-filter` folder. The solution chosen is picked by computing the derivative at all points in the pareto front and taking the point with the maximum derivative. In the running example the solution chosen is the one in which the dependency graph has 12 dependencies with a recovery cost of 2.38 (as reported in the logs in the `Desktop` folder named `logs_ComputeParetoBestSolution_ecommerce.txt`).

## 6. Run the experiments (Dependency validation - after the setup and step 5)
Coming soon.

## 7. Run the experiments (Test minimization - after the setup and step 6)
Coming soon.


