package com.qa.BDDrestAssured;



import java.util.HashMap;

import org.hamcrest.collection.HasItemInArray;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class TestBasicFeatures {

	private static final ResponseAwareMatcher<Response> HashMap = null;

	@Test(enabled=false)
	public void testStatusCode() {
		RestAssured.given()
		.get("http://jsonplaceholder.typicode.com/posts/")
		.then().statusCode(200);
		}
	@Test(enabled=false)
	public void testLog() {
		RestAssured.given()
		.get("http://jsonplaceholder.typicode.com/posts/")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(enabled=false)
	public void verifyData() {
		RestAssured.given()
		.get("")
		.then()
		.body("checking data from response body", HashMap);
	}
	
	
}
