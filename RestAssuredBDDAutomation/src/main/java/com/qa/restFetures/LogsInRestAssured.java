package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class LogsInRestAssured {

	@Test(enabled = true)
	public void responseLogs() {
		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?albumId=1")
		.then()
			.log().all()
			.log().body().contentType(ContentType.JSON)
			.log().cookies()
			.log().everything()
			.log().headers()
			.log().ifStatusCodeIsEqualTo(200)
			.log().ifValidationFails()
			.log().ifError();
	}
}
