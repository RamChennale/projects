package com.qa.rest.base;

import org.testng.annotations.BeforeMethod;

import com.qa.rest.inteface.TestBaseI;

import io.restassured.RestAssured;

public class TestBase implements TestBaseI{

	@BeforeMethod
	public void setUp() {
		RestAssured.authentication =RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication/";
	}

}
