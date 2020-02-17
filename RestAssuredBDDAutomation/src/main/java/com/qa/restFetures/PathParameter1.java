package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PathParameter1 {

	@Test(enabled = true)
	public void pathParameter() {
		String id = "24947";

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/";
		Response response = null;

		try {
			response = RestAssured.given().pathParam("id", id).when().get("/{id}");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Response :" + response.asString());
		System.out.println("Status Code :" + response.getStatusCode());
		System.out.println(
				"Does Reponse contains 'employee_salary'? :" + response.asString().contains("employee_salary"));

		assertEquals(200, response.getStatusCode());
	}
}
