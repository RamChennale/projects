package com.qa.restAssuredBDD;

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
	
	/*to verify multiple fields: need to access by JSON object/array by . o perator access 
	.body("result.city", equalTo("HyderabadBengaluruChennai"))*/
	
	@Test(enabled=false)
	public void verifyMultipleFields() {
		when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Bengaluru")
		.then()
			.body("City", equalTo("Bengaluru"))
			.body("Temperature",equalTo("29.1 Degree celsius"))
			.body("Humidity",equalTo("33 Percent"))
			.body("WeatherDescription",equalTo("few clouds"))
			.body("WindSpeed",equalTo("2.1 Km per hour"));
	}
	
	@Test(enabled=true)
	public void hasItemsMultipleFields() {
		when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Bengaluru")
		.then()
			.body("result.City", hasItems("Bengaluru","Hyd","chennai"))
			.log().everything();
	}

	//To set a parameter and headers
	@Test(enabled=false)
	public void setParameter() {
		given()
		.param("name", "Ram")
		.header("Myheader","INDIAN");
	}
	
	
}
