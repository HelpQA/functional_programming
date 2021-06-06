# DIGIT Test Automation Framework Setup guide
##### Table of Contents
* [About the Project](#about-the-project)
  * [Technology Used](#technology-used)
  * [Dependencies Used](#dependencies-used)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Clone Project](#clone-project)
  * [Configurations](#configurations)
* [List Of Tags](#list-of-tags)
* [Execution](#execution)
* [Reporting](#reporting)


<!-- ABOUT THE PROJECT -->
## About The Project
DIGIT Test Automation framework majorly deals with various API services validation. It enables to test and validate back end services across all active environments and as well as tenant ids. For more details on framework architecture please refer the [documentation](https://digit-discuss.atlassian.net/wiki/spaces/EPE/pages/1028521985/Automation+Framework+Knowledge+Base)
 
<!-- Technology Used -->
### Technology Used
 * [Java](https://www.java.com/en/)
 * [JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript)
 * [Karate](https://github.com/intuit/karate)
 * [Cucumber](https://cucumber.io/docs/cucumber/api/)
 * [JUnit](https://junit.org/junit4/)

### Dependencies Used
In this section we have listed down some of the major libraries which is being used by the test automation framework as a `maven dependency` that is defined in `pom.xml`. 
* `karate-core` : To provide core features of `karate`.
* `karate-junit4` : To facilitate `JUnit` testing this dependency is required.
* `karate-gatling` : To perform API Performance test. For more details on performance test with karate, checkout [here](https://intuit.github.io/karate/karate-gatling/)
* `karate-apache` : To make use of karate in `maven` project.
* `karate-netty` : To `mock` API calls locally. For more details please checkout [here](https://intuit.github.io/karate/karate-netty/) 
* `cucumber-jvm-parallel-plugin` : To facilitate `parallel execution`.
* `poi` and `poi-ooxml` : To work with the latest and older versions of `excel` file.
* `log4j-api` : An interface that handles logs.
* `allure-junit4` : To facilitate `Test Reports` along with `JUnit` runner.
* `allure-cucumber4-jvm` : To facilitate `Test Reports` along with `Cucumber JVM` and helps to log `feature` file steps into the test report. 

<!-- Getting Started --> 
## Getting Started
This framework requires below prerequisites to be covered

<!-- Prerequisites --> 
### Prerequisites
To set up this framework, two mandatory softwares need to be installed into the system. Follow below step by step setup guidelines.
 ###### On Windows
 * [Download JDK 8](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)
 * [Download maven 3.6.3](https://maven.apache.org/download.cgi)
 * [JDK Installation Guide](https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-DAF345BA-B3E7-4CF2-B87A-B6662D691840)
 * [maven Installation Guide](https://maven.apache.org/install.html)
###### On Mac
 * First install [HomeBrew](https://brew.sh/)
 * To install OpenJDK 8 with brew, execute `$ brew cask install adoptopenjdk8` on terminal
 * To install maven into the system, execute `$ brew install maven` on terminal
 

<!--Configurations-->
### Configurations
  ###### Application Level 
  * Create role action mapping as per the requirement 
  * Create a new user as per the mapped role
  ###### Project Level 
   Environment configuration files needs to be created in `local` by following below steps.
   * Create environment specific files with `.yaml` extension anywhere in the local directory 
   * It is recommended to provide environment specific names to the files (like: `qa.yaml`, `uat.yaml`, `config.yaml` etc.) 
   * Please keep the environment specific data in the config file as per below format.  
 
<!--List Of Tags--> 
 ###### For example 
 `mvn clean test "-DconfigPath= /User/apple/Documents/qa.yaml" "-Dkarate.options=--tags @tag_sample classpath:com/automation"`  
 `mvn clean test "-DconfigPath=/Users/macbookair/guru_smartkids_repo/automation/qa.yaml" "-Dkarate.options=--tags @getHomeworkBySubject classpath:com/smartkids"`

`mvn clean test "-DconfigPath=C:\Users\sahil\Documents\SmartKid\automation\qa.yaml" "-Dkarate.options=--tags @getHomeworkBySubject classpath:com/smartkids"`


