package com.qa.restAssuredBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete {
	static String id="1010";
	@BeforeClass
	public void deletData() {
		RestAssured.baseURI = "http://localhost:3000/";
		RestAssured.basePath = "posts/"+id;
		
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
