package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class ResSpecification {

ResponseSpecification responseSpecification;
	
	@Test(enabled = true)
	public void setUp() {
		ResponseSpecBuilder builder= new ResponseSpecBuilder();
		builder.expectStatusCode(200);
		builder.expectContentType(ContentType.JSON);
		builder.expectCookie("__cfduid");
		responseSpecification=builder.build();
				
	}
	@Test(enabled = true)
	public void reqSpecification() {
		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?albumId=1")
		.then().spec(responseSpecification);
	}
}
