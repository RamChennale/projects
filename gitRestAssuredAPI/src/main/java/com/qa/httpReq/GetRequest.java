package com.qa.httpReq;

//200 for OK with Body (Updated response)
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

	@Test(enabled=false)
	public void getReq1() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification=	RestAssured.given();
		
		Response response=	requestSpecification.request(Method.GET, "/Hyderabad");
		String responseBody=	response.getBody().asString();
		System.out.println("Response Body : "+responseBody);
	}
	
	@Test(enabled=false)
	public void getReq2() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification=	RestAssured.given();
		Response response= requestSpecification.get("/Hyderabad");
		System.out.println(response.asString());
	}
	@Test(enabled=false)
	public void validateResp() {
		// Step 1: Create a Request pointing to the Service
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification requestSpecification=	RestAssured.given();
		// Step 2: execute request/send the Request
		Response response= requestSpecification.get("/Hyderabad");
		int Status_Code =response.getStatusCode();
		System.out.println("Status Code :"+Status_Code);
		Assert.assertEquals(Status_Code, 200);

		String status_Line=response.getStatusLine();
		System.out.println("status Line : "+status_Line);
		Assert.assertEquals(status_Line, "HTTP/1.1 200 OK");
		System.out.println(response.asString());
	}
	
	@Test(enabled=true)
	public void getRequest() {
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification requestSpecification=	RestAssured.given();
		Response response= requestSpecification.get();
		System.out.println(response.asString());
	}
}
//status Line: "HTTP/1.1 200 OK" First part is Http protocol (HTTP/1.1). Second is Status Code (200). Third is the Status message (OK).
