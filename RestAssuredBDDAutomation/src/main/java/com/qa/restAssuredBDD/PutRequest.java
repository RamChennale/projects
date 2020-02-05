package com.qa.restAssuredBDD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.utility.RestUtil;

import io.restassured.RestAssured;

public class PutRequest {

	static HashMap<String, String> hashMap =new HashMap<String, String>();
	static String id="123DHBueH2qZ6";
	static String title;
	static String author;
	
	@BeforeClass
	public void putData() {
		title = RestUtil.getTitle();
		author = RestUtil.getAuthor();
		hashMap.put("title", title);
		hashMap.put("author", author);

		RestAssured.baseURI = "http://localhost:3000/";
		RestAssured.basePath = "posts/"+id;
	}
	
	@Test
	public void putRequest() {
		given()
			.contentType("application/json")
			.body(hashMap)
		.when()
			.put()
		.then()
			.statusCode(200);
	}
}
