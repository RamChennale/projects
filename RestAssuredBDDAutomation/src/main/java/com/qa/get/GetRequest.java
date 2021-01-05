package com.qa.get;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	static {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/";
		RestAssured.basePath="/Hyderabad";
	}
	
	@Test(enabled=true)
	public void verifyStatusCode() {
		
	Response res=	(Response) given().
		when().
		then()
		.response();
//			.statusCode(200);
			System.out.println(res.getContentType());
	}
	
	@Test(enabled=false)
	public void verifyStatusLine() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.statusLine("HTTP/1.1 200 OK");
	}
	
	@Test(enabled=false)
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
	
	@Test(enabled=false)
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
