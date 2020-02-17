package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
public class AssertionOnResponse {

	@Test(enabled=false)
	public void assertionOnResponse() {
		String response=
		when().get("http://jsonplaceholder.typicode.com/photos/?id=1").asString();

		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().assertThat().body(equalTo(response));
	}
	
	@Test(enabled=false)
	public void verifyResContentType() {
		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().contentType(ContentType.JSON).log().all();
	}
	
	@Test(enabled=false)
	public void verifyCookie() {
		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().log().all().assertThat().cookie("__cfduid", "d273aeb46548604eb11fa6ff6c81781791581403105");
	}
	
	@Test(enabled=true)
	public void lambdaExp() {
		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then()
		.body("url", endsWith("92c952"));
	}
}
