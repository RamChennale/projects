package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
public class ReqSpecification {

	 RequestSpecification requestSpecification;
	
	@Test(enabled = true)
	public void setUp() {
		RequestSpecBuilder builder= new RequestSpecBuilder();
		//builder.addParam("parameterName", "parameterValues");
		builder.addCookie("__cfduid");
		builder.addHeader("content-Type", "application/json");
		requestSpecification=builder.build();
	}
	@Test(enabled = true)
	public void reqSpecification() {
		given().spec(requestSpecification)
		.when().get("http://jsonplaceholder.typicode.com/photos/?albumId=1")
		.then().statusCode(200);
	}
}
