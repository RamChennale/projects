package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

public class RestAssuredCustomParsers {

	@Test(enabled=true)
	public void restAssuredParsers() {
		RestAssured.registerParser("ContentType.XML", Parser.XML);

		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().using().parser("ContentType.XML", Parser.XML).log().all();
	}
}
