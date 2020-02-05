package com.qa.restAssuredBDD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRequest {

	static String id="";
	
	@BeforeClass
	public void deletData() {
		RestAssured.baseURI="";
		RestAssured.basePath="";
				
	}
	
	@Test
	public void deleteRequest() {
		given()
		.when()
			.delete()
		.then()
			.statusCode(200)
			.extract().response();
	}
}
