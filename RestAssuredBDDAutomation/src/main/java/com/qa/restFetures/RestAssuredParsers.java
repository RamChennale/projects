package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class RestAssuredParsers {

	@Test(enabled=true)
	public void restAssuredParsers() {
		RestAssured.defaultParser=Parser.HTML;
		RestAssured.defaultParser=Parser.JSON;
		RestAssured.defaultParser=Parser.TEXT;
		RestAssured.defaultParser=Parser.XML;

		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().using().defaultParser(Parser.XML).log().all();
	}
}
