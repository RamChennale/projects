package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetCookiesFromResponse {

	@Test(enabled = false)
	public void cookies() {
		Response response = get("http://jsonplaceholder.typicode.com/photos/?id=1");
		Map<String, String> cookies = response.getCookies();
		for (Map.Entry<String, String> entry : cookies.entrySet()) {
			System.out.println(entry.getKey() + "	 :  	" + entry.getValue());
		}

	}

	@Test(enabled = false)
	public void getDetailedCookie() {
		Response response = get("http://jsonplaceholder.typicode.com/photos/?id=1");
		Cookie cookie = response.getDetailedCookie("__cfduid");
		System.out.println(" isSecured() : " + cookie.isSecured());
		System.out.println(" cookie Value: " + cookie.getValue());
		System.out.println(" getExpiryDate : " + cookie.getExpiryDate());
	}
	
	@Test(enabled = false)
	public void cookiesMethods() {
		RestAssured.baseURI="http://jsonplaceholder.typicode.com/photos/?id=1";
		Response response= get();
		Map<String, String> cookies=	response.getCookies();
		for(Map.Entry<String, String> entry: cookies.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	@Test(enabled = true)
	public void coonect() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		Response response= get();
		JsonPath jsonPath= new JsonPath(response.asString());
		System.out.println(jsonPath);
	}
}
