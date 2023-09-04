package com.ex.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@BookOPS",
        features = "src/test/resources/features/book-operationAPI.feature",
        glue = {"com.ex"},
        monochrome = true)
public class CucumberRunnerTests extends AbstractTestNGCucumberTests{

}
