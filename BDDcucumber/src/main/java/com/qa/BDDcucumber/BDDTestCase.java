package com.qa.BDDcucumber;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features= {"features"}, glue= {"com.qa.BDDcucumber"})
public class BDDTestCase {

	
}