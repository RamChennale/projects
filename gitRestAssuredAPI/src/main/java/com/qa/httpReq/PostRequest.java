package com.qa.httpReq;

/*201 and a location header pointed to the new resource
400 if we are not able to create an item*/
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	@Test
	public void postRequest() {
		// Step 1: Create a Request pointing to the Service
		RestAssured.baseURI = "http://localhost:3000/posts";
		RequestSpecification request = RestAssured.given();

		// Step 2: Create a JSON request to add fields
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", "103");
		jsonObject.put("title", "titlePOST");
		jsonObject.put("author", "Ramji");

		// Step 3:Add header to a POST request
		request.header("Content-Type", "application/json");

		// Step 4: Add JSON body in the request and send the Request
		request.body(jsonObject.toJSONString());
		Response response = request.post();

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
		System.out.println(" Response Body : " + response.getBody().asString());

	}
}
