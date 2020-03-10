package com.qa.post;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostReqJSONObject {

	@Test(enabled=true)
	public void postRequestStaticData() {
		
		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.basePath = "/posts";
		
		JSONObject jsonObject= new JSONObject();
		jsonObject.put("id", "1010");
		jsonObject.put("title", "StaticTitle");
		jsonObject.put("author", "StaticAuthor");
		
		given()
			.contentType("application/json")
			.body(jsonObject.toJSONString())
		.when()
			.post("http://localhost:3000/posts")
		.then()
			.statusCode(201);
	}
}
