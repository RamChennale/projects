package com.qa.restAssuredBDD;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.utility.RestUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseObject {

	static HashMap<String, String> hashMap= new HashMap<String, String>();
	static String id;
	static String title;
	static String authour;
	
	@BeforeClass(enabled=true)
	public void testData() {
		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.basePath = "/posts";
		
		id=RestUtil.getId();
		title=RestUtil.getTitle();
		authour=RestUtil.getAuthor();
		hashMap.put("id", id);
		hashMap.put("title", title);
		hashMap.put("authour", authour);
	}
	
	@Test(enabled=true)
	public void postReq() {
		Response response=
				given()
					.contentType("application/json")
					.body(hashMap)
				.when()
					.post()
				.then()
				.statusCode(201)
				.extract().response();
		String jsonResponse= response.asString();
		System.out.println(jsonResponse);
	}
}
