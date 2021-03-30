package com.qa.httpReq;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestSatusLine {

	@Test(enabled = true)
	public void validateResp() {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get();

		String status_Line = response.getStatusLine();
		System.out.println("status Line : " + status_Line);
		Assert.assertEquals(status_Line, "HTTP/1.1 200 OK");
		System.out.println(response.asString());
	}
}
// status Line: "HTTP/1.1 200 OK" First part is Http protocol (HTTP/1.1). Second
// is Status Code (200). Third is the Status message (OK).
