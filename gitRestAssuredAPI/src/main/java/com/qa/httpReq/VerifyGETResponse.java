package com.qa.httpReq;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class VerifyGETResponse {

	@Test(enabled = false, priority = 1)
	public void verifyStatusCode1() {
		// 1. create service request
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
		RequestSpecification request = RestAssured.given();
		//2. send GET request
		Response response=	request.get();
		//3. Verify statusCode
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

	
	@Test(enabled = false, priority = 3)
	public void verifyStatusLine1() {
		// 1. create service request
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
		RequestSpecification request = RestAssured.given();
		//2. send GET request
		Response response=	request.get();
		//3. Verify statusCode
		String statusLine =response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}

	@Test(enabled = true, priority = 5)
	public void verifyHeader() {
		// 1. create service request
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
		RequestSpecification request = RestAssured.given();
		//2. send GET request
		Response response=	request.get();
		//3. Verify Headers
		Headers headers =response.getHeaders();
		String headerAsString=headers.toString();
		System.out.println("=========");
		System.out.println("COMPLETE HEADER : "+headerAsString);
		System.out.println(headerAsString);
		System.out.println("=========");
		String content_Type=response.getHeader("Content-Type");
		System.out.println(content_Type+" content_Type Verified");
		Assert.assertEquals(content_Type, "application/json");
		String content_lenght=response.getHeader("Content-Length");
		Assert.assertEquals(content_lenght, "162");	
		System.out.println(content_lenght+"content_lenght Verified");
	}
	
	
	
	
	
	
	@Test(enabled = false, priority = 4)
	public void verifyStatusLine2() {
		// 1. create service request
		Response response = RestAssured.get("http://restapi.demoqa.com/utilities/weather/city");
		
		//2. Verify statusCode
		String statusLine= response.getStatusLine();
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	
	@Test(enabled = false, priority = 2)
	public void verifyStatusCode2() {
		// 1. create service request
		Response response = RestAssured.get("http://restapi.demoqa.com/utilities/weather/city");
		
		//2. Verify statusCode
		int statusCode= response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

}
