package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SSLandTLScertification {

	@Test(enabled=false)
	public void SSLcertification() {
		RestAssured.useRelaxedHTTPSValidation();
		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?albumId=1")
		.then().statusCode(200);
	}
	
	@Test(enabled=true)
	public void TLScertification() {
		given().relaxedHTTPSValidation("TLS")
		.when().get("http://jsonplaceholder.typicode.com/photos/?albumId=1")
		.then().statusCode(200);
	}
}
