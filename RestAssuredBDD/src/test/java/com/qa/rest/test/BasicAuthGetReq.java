package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.rest.base.TestBase;

import io.restassured.RestAssured;

public class BasicAuthGetReq extends TestBase{

	@Test(enabled = false)
	public void basicAuthenticationUsernamePassword() {
		int statusCode = RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/").getStatusCode();
		System.out.println(statusCode);
	}

	@Test(enabled=false)
	public void basicAuthDynamicCredentials(){
		int statusCode = RestAssured
				.given()
				.when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
				.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, STATUS_CODE_200);
	}
	
	@Test
	public void basicAuthDynamicURL() {
		int statusCode=RestAssured
				.given()
				.get()
				.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, STATUS_CODE_200);
	}
	
}
