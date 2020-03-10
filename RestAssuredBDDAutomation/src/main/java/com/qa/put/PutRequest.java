package com.qa.put;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.utility.RestUtil;

import io.restassured.RestAssured;

public class PutRequest {

	static HashMap<String, String> hashMap =new HashMap<String, String>();
	static String id="3211j5q";
	static String title;
	static String author;
	
	@BeforeClass(enabled=true)
	public void putData() {
		title = RestUtil.getTitle();
		author = RestUtil.getAuthor();
		hashMap.put("title", title);
		hashMap.put("author", author);

		RestAssured.baseURI = "http://localhost:3000/";
		RestAssured.basePath = "posts/"+id;
	}

	
	@Test(enabled=true)
	public void putRequest() {
		given()
			.contentType("application/json")
			.body(hashMap)
		.when()
			.put()
		.then()
			.statusCode(200);
	}
	
	@Test(enabled=false)
	public void putRequestJSONObject() {
		String id="3211j5q";
		RestAssured.baseURI = "http://localhost:3000/";
		RestAssured.basePath = "posts/"+id;
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("title", "Ramtitle");
		jsonObject.put("author", "RAMauthor");
		
		given()
			.contentType("application/json")
			.body(jsonObject.toJSONString())
		.when()
			.put()
		.then()
			.statusCode(200);
	}
}
