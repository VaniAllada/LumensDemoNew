package com.lumens.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Features"},glue = {"com.lumens.stepdefinations"},dryRun = false,
monochrome = true,
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extendreport.html"})
public class AllFeatureTestRunner {

}
