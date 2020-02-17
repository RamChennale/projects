package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class SetCookieInRequest {

	//@Test(enabled=true, priority=1)
	public void setCookie() {
		given().cookie("__cfduid")
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1").then().statusCode(200).log().all();
	}
	
	@Test(enabled=true, priority=2)
	public void getCookie() {
		Response response= 
		given()
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().statusCode(200).extract().response();
		Map<String, String> cookies=	response.getCookies();
		
		for(Map.Entry<String, String> entry: cookies.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
