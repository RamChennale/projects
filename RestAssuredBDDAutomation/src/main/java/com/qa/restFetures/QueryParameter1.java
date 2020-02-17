package com.qa.restFetures;

//https://reqres.in/api/users?page=2&id=5
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParameter1 {

	@Test(enabled = true)
	public void queryParameter() {
		RestAssured.baseURI = "https://reqres.in/api";
		Response response = null;
		try {
			given().queryParam("page", 2).queryParam("id", 5)
			.when().get("/users")
			.then().statusCode(200)
					.and()
					.log().all();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
 * What is Query Parameter? Query Parameter is used to filter or sort the
 * resources.
 * 
 * For example, In case, if we need to filter out the students based on their
 * class or section, we are going to use ‘Query Parameter’.
 * 
 * GET /students?class=9&section=B
 * 
 * Sometimes there is a confusion between Query Parameter and URI Parameter (or
 * Path Parameter). ‘Path Parameter’ is basically used to identify a specific
 * resource.
 * 
 * For example, In case, if we need to identify a student based on his/her
 * rollNumber, we are going to use ‘Path Parameter’.
 */