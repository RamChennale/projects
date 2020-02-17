package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class FormParameter {

	@Test
	public void formParameter() {
		given()
			.formParam("post", "Hyderabad")
		.when()
			.post("http://restapi.demoqa.com/utilities/weather/city/{post}")
		.then()
			.statusCode(200);
		
	}
}
