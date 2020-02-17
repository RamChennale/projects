package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

public class SetMultipleCookies {

	@Test(enabled=true)
	public void setMultipleCookies() {

		Cookie cookie= new Cookie.Builder("__cfduid", "d0ce55799feba571a8f09a11dcfe369721581398190")
								   .setSecured(true)
								   .build();
		Cookie cookie1= new Cookie.Builder("__cfduid")
								  .setSecured(true).setComment("cookie is secured comment")
								  .build();
		Cookie cookie2= new Cookie.Builder("__cfduid", "d0ce55799feba571a8f09a11dcfe369721581398190")
								  .setSecured(false).setComment("put comment in cookie")
								  .build(); 
		Cookies cookies= new Cookies(cookie, cookie1, cookie2);
		Response response=
		given().header("ContentType", "application/json").cookies(cookies)
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().extract().response();

		Map<String,  String> map= response.getCookies();
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}

