package com.qa.rest.test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {

	@SuppressWarnings("unchecked")
	@Test
	public void httpPutRequest() {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.header("Content-Type", "application/json");

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("title", "updatedTitle");
		jsonObject.put("author", "author-Ram chennale");
		requestSpecification.body(jsonObject.toJSONString());

		Response response = requestSpecification.put("http://localhost:3000/posts/123");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}
}
