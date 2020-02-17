package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParameter {

	@Test(enabled=false)
	public void DummyQueryParameterOnlyGetReq() {
		given()
			.queryParam("book", "jave")
			.queryParam("key", "value")
			.queryParam("q", "London,UK")
			.queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
		.when().get("https://samples.openweathermap.org/data/2.5/")
		.then().statusCode(400);
	}
	
	@Test(enabled=true)
	public void queryParameter() {
		RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/";
		Response response=
		given()
			.queryParam("q", "London,UK")
			.queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
		.when()
			.get("/weather")
		.then()
			.extract()
			.response();
		String res=	response.asString();
		JsonPath jsonPath= new JsonPath(res);
	}
}

/*What is Query Parameter?
Query Parameter is used to filter or sort the resources.

For example, In case, if we need to filter out the students based on their class or section, we are going to use ‘Query Parameter’.

GET /students?class=9&section=B

Sometimes there is a confusion between Query Parameter and URI Parameter (or Path Parameter). ‘Path Parameter’ is basically used to identify a specific resource.

For example, In case, if we need to identify a student based on his/her rollNumber, we are going to use ‘Path Parameter’.*/