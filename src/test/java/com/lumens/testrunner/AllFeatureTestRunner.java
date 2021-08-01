package com.lumens.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Features"},glue = {"com.lumens.stepdefinations"})
public class AllFeatureTestRunner {

}
