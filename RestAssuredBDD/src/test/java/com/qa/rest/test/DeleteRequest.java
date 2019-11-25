package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {

	@Test
	public void httpDeleteRequest() {
	 	RequestSpecification requestSpecification= RestAssured.given();
	 	Response response= requestSpecification.delete(" http://localhost:3000/posts/123");
	 	int statusCode=	response.getStatusCode();
	 	Assert.assertEquals(statusCode, 200);
	}
}
