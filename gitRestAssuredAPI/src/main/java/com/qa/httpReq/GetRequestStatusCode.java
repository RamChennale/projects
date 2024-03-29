package com.qa.httpReq;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestStatusCode {

	@Test(enabled = true)
	public void validateResp() {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get();
		int Status_Code = response.getStatusCode();
		System.out.println("Status Code :" + Status_Code);
		Assert.assertEquals(Status_Code, 200);
		
	}
}
// status Line: "HTTP/1.1 200 OK" First part is Http protocol (HTTP/1.1). Second
// is Status Code (200). Third is the Status message (OK).
