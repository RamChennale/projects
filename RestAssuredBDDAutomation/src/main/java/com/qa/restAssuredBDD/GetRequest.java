package com.qa.restAssuredBDD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetRequest {

	@Test(enabled=false, priority=1)
	public void getRequest() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.log().all();
	}
	
	@Test(enabled=false,priority=2)
	public void verifyStatusCode() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.statusCode(200);
	}
	
	@Test(enabled=false,priority=3)
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
	
	@Test(enabled=false,priority=4)
	public void verifyStatusLine() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.statusLine("HTTP/1.1 200 OK");
	}
	
	@Test(enabled=false,priority=5)
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
