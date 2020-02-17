package com.qa.restAssuredBDD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.utility.RestUtil;

import io.restassured.RestAssured;

public class PostRequest {

	static String id;
	static String title;
	static String author;
	static HashMap map = new HashMap<Object, Object>();

	@BeforeClass(enabled=false)
	public void postData() {
		id = RestUtil.getId();
		title = RestUtil.getTitle();
		author = RestUtil.getAuthor();
		map.put("id", id);
		map.put("title", title);
		map.put("author", author);

		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.basePath = "/posts";
	}

	@Test(enabled=false)
	public void postRequest() {
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		.then()
			.statusCode(201);
	}
	
	@Test(enabled=true)
	public void postRequestStaticData() {
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
