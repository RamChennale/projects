package com.qa.httpReq;

import java.util.List;

/*201 and a location header pointed to the new resource
400 if we are not able to create an item*/
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	@SuppressWarnings("unchecked")
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
		Assert.assertEquals(statusCode, 201);
		System.out.println(" Response Body : " + response.getBody().asString());
		JsonPath jsonPath=	response.jsonPath();
		String ResParameter=jsonPath.getString("ResParameter");
		List<String> nameList=	jsonPath.getList("data.name");
		for(String names:nameList) {
			System.out.println(names);
		}
		List<Integer> idList=	jsonPath.getList("data.id");
		for(int i:idList) {
			System.out.println(i);
		}
	}
}
