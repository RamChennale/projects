package com.qa.restAssuredBDD;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class XMLResValidation {
//http://thomas-bayer.com/sqlrest/CUSTOMER/15/
	
	
	@Test(enabled=false)
	public void verifyStatusCode() {
		given()
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.statusCode(200);
	}
	
	@Test(enabled=false)
	public void singleFieldVerify() {
		when().
		get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body("",equalTo(""));
	}
	
	@Test(enabled=false)
	public void passParamHeader() {
	
		given()
			.contentType("application/XML")
			.header("key","value")
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body("CUSTOMER.ID", equalTo("15"))
			.body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
			.body("CUSTOMER.LASTNAME", equalTo("Clancy"))
			.body("CUSTOMER.STREET", equalTo("319 Upland Pl."))
			.body("CUSTOMER.CITY", equalTo("Seattle"))
			.log().all();
	}
	
	@Test(enabled=false)
	public void XMLCompleteResVerify() {
		when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body("CUSTOMER.text()", equalTo("15BillClancy319 Upland Pl.Seattle"))
			.log().body();
	}
	
	@Test(enabled=false)
	public void XMLhasXPath() {
		when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.statusCode(200)
			.body(hasXPath("/CUSTOMER/ID", containsString("15")))
			.log().everything();
	}
	
	@Test(enabled=true)
	public void XMLhasXpathTextmethod() {
	when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
	.then()
		.statusCode(200)
		.body(hasXPath("/CUSTOMER/ID[text()='15']"))
		.log().headers();
	}
}
