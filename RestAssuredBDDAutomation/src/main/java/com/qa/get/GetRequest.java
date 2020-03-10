package com.qa.get;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest {
	static {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/";
		RestAssured.basePath="/Hyderabad";
	}
	
	@Test(enabled=true)
	public void verifyStatusCode() {
		
		given().
		when().
		then()
			.statusCode(200);
			
	}
	
	@Test(enabled=true)
	public void verifyStatusLine() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.statusLine("HTTP/1.1 200 OK");
	}
	
	@Test(enabled=true)
	public void verifyHeader() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.header("Content-Type", "application/json")
			.header("Server", "nginx")
			.header("Content-Length", "162")
			.header("Connection", "keep-alive")
			.header("Content-Encoding", "gzip")
			.header("Cache-Control", "max-age=0");
	}
	
	@Test(enabled=true)
	public void verifyBodyParam() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.assertThat().body("City", equalTo("Hyderabad"))
			.assertThat().body("Temperature", equalTo("29.31 Degree celsius"))
			.assertThat().body("Humidity", equalTo("48 Percent"))
			.assertThat().body("WeatherDescription", equalTo("haze"))
			.assertThat().body("WindSpeed", equalTo("2.1 Km per hour"))
			.assertThat().body("WindDirectionDegree", equalTo("230 Degree"));
	}
}
