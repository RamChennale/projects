package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
public class SetHeader {

	@Test(enabled=true)
	public void setHeader() {
		Header header= new Header("Content-Type", "application/json");
		Header header1= new Header("Content-Encoding", "gzip");
		Header header2= new Header("Content-Type", "application/json");
		Headers headers= new Headers(header,header1,header2);
		
		given()
			.header("Content-Type", "application/json")
			.header(header)
			.headers(headers)
		.when().get("http://jsonplaceholder.typicode.com/photos/?id=1")
		.then().statusCode(200).log().headers();
	}
}
