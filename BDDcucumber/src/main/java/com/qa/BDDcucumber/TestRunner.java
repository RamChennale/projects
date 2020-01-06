package com.qa.BDDcucumber;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features= {"features"},glue= {"com.qa.stepDefination"})
public class TestRunner {

}
