package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.test.context.TestExecutionListeners;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CollectResponse {

	@Test(enabled=false)
	public void collectResponse() {
		Response response=
		given()
		.when()
			.get("")
		.then()
			.extract()
			.response();
		System.out.println("content Type : "+response.contentType());
		System.out.println("status Code : "+response.statusCode());
		System.out.println("Url : "+response.jsonPath().getString("url"));
		
	}
	
	@Test(enabled=false)
	public void postReq() {
		given()
		.header("contentType","application/json")
		.param("parameterName", "parameterValues")
		.when()
			.post("")
		.then()
			.and()
			.statusCode(200)
			.log().all();
	}
	
	@Test(enabled=false)
	public void getLinkandClick() {
		String href=
				given()
				.when()
					.get("url")
				.then()
					.contentType(ContentType.JSON)
					.body("Title", equalTo("Google"))
					.extract()
					.path("url");
		when().get(href).then().statusCode(200);
	
		String href1=when().get("url").andReturn().jsonPath().getString("url");
		int statusCode= when().get(href1).thenReturn().statusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
}
