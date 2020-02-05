package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;


public class JsonPathResponse {

	public void JSONPathResponse() {
		JsonPath jsonPath=
		given()
		.when().get("url")
		.then()
			.extract()
			.jsonPath();
		String url=	jsonPath.getString("url");
		}
}
