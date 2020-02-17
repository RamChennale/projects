package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class PathParameter {

	@Test(enabled=true)
	public void pathParameter() {
		given()
			.contentType(ContentType.JSON)
			.pathParams("post", "1")
		.when()
			.get("http://localhost:3000/posts/{post}")
		.then()
			.statusCode(201)
			.and()
			.log().all();
	}
}
/*
.pathParam("post", "Hyderabad")
.when()
.get("http://restapi.demoqa.com/utilities/weather/city/{post}")*/