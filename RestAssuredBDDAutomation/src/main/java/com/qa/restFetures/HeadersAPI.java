package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;

public class HeadersAPI {

	@Test(enabled = false)
	public void header() {
		String contentType = when()
				.get("http://jsonplaceholder.typicode.com/photos/?id=1")
				.header("content-Type");
		System.out.println("contentType : "+contentType);
	}
	
	@Test(enabled = false)
	public void headers() {
		 Headers headers=
		when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
				.headers();
		for(Header header: headers) {
			System.out.println(header.getName()+" : "+header.getValue());
		}
	}
	
	@Test(enabled = false)
	public void getHeader() {
		String contentType =when().get("http://jsonplaceholder.typicode.com/photos/?id=1").getHeader("content-Type");
				System.out.println("contentType : "+contentType);		
	}

	
	@Test(enabled = false)
	public void getHeaders() {
		 Headers headers =when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
				.getHeaders();
		 System.out.println("getHeaders() : ");
		 for(Header headers2: headers) {
			 System.out.println(headers2.getName()+" : "+headers2.getValue());
		 }
	}
	
}

