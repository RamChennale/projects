package com.qa.BDDrestAssured;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class TestBasicFeatures {

	@Test(enabled=false)
	public void testStatusCode() {
		given().
		when().
		then().log().all();
		}
	
/*	@Test(enabled=false)
	public void testStatusCode() {
		RestAssured.given()
		.get("http://jsonplaceholder.typicode.com/posts/")
		.then().statusCode(200);
		}*/
	@Test(enabled=false)
	public void testLog() {
		given()
		.get("http://jsonplaceholder.typicode.com/posts/")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(enabled=false)
	public void verifyData() {
		given()
		.get("")
		.then();
	}
	
	
}
