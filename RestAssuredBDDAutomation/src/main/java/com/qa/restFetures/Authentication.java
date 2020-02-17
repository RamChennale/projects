package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

public class Authentication {

	//Default Authentication
	@Test(enabled=false)
	public void defaultbasicAuth() {
	RestAssured.authentication=basic("ToolsQA", "TestPassword");
		when().get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
		.then().log().all();
	}
	
	@Test(enabled=false)
	public void basicChallAuthTyp1() {
		given()
			.auth().basic("ToolsQA", "TestPassword")
		.when().get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
		.then().log().all();
	}
	
	@Test(enabled=false)
	public void preemptiveAuthTyp2() {
		given()
			.auth()
			.preemptive()
			.basic("ToolsQA", "TestPassword")
		.when().get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
		.then().log().all();
	}
	
	@Test(enabled=false)
	public void digestAuthTyp3() {
		given()
			.auth()
			.digest("ToolsQA", "TestPassword")
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().using().parser("ContentType.XML", Parser.XML).log().all();
	}
}
