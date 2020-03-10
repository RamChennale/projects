package com.qa.json;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.utility.RestUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class JSONResValidation {

	@Test(enabled=false)
	public void allLogs() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Bengaluru")
		.then()
		.log().all();
	}
	
	@Test(enabled=false)
	public void verfiySingleField() {
		get("http://restapi.demoqa.com/utilities/weather/city/Bengaluru")
		.then()
		.body("City", equalTo("Bengaluru"))
		.log().all();
	}
	
	@Test(enabled=false)
	public void verifyMultipleFields() {
		given().
		when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Bengaluru").
		then()
			.body("City", equalTo("Bengaluru"))
			.body("WindSpeed",equalTo("2.1 Km per hour"))
			.assertThat().body("City", equalTo("Bengaluru"));
	}
	
	@Test(enabled=false)
	public void assertionBodyParameters() {
		given().
		when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Bengaluru").
		then()
			.assertThat().body("City", equalTo("Bengaluru"))
			.assertThat().body("WindSpeed",equalTo("2.1 Km per hour"))
			.assertThat().body("City", equalTo("Bengaluru"));
	}
	
	@Test(enabled=true)
	public void hasItemsMultipleFields() {
		when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Bengaluru")
		.then()
			.body("result.City", hasItems("Bengaluru","Hyd","chennai"))
			.log().everything();
	}
}
