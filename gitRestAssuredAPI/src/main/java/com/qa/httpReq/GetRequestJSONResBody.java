package com.qa.httpReq;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetRequestJSONResBody {

	@Test(enabled=true, priority=1)
	public void getReq1() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification=	RestAssured.given();
		
		Response response=	requestSpecification.request(Method.GET, "/Hyderabad");
		ResponseBody responseBodygetBody=	response.getBody();
		ResponseBody responseBodyBody=	response.body();
		String responseBodyString =response.getBody().asString();
		Assert.assertEquals(responseBodyString.contains("Hyderabad"),true,"Response body contains Hyderabad");
		
		
		/*String responseBody=	response.getBody().asString();
		System.out.println("Response Body : "+responseBody);*/
	}
	
}
//status Line: "HTTP/1.1 200 OK" First part is Http protocol (HTTP/1.1). Second is Status Code (200). Third is the Status message (OK).
