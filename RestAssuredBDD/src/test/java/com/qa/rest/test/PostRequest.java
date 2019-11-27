package com.qa.rest.test;

import org.json.simple.JSONObject;
import org.testng.Assert;
/*JSON server : A dummy server for API testing where data created as like real time data 
https://github.com/typicode/json-server
*/
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	@Test
	public void httpPostRequest() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", "123");
		jsonObject.put("title", "JSONtitle");
		jsonObject.put("author", "Ram chennale");

		request.body(jsonObject.toJSONString());

		Response response = request.post("http://localhost:3000/posts");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);

	}
}
