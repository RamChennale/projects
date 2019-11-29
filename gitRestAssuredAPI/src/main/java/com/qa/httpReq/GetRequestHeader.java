package com.qa.httpReq;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestHeader {

	@Test(enabled = true)
	public void validateHeaderResp() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get("/Hyderabad");
		/*
		 * Content-Type, Server, Content-Encoding
		 */
		String content_Type= response.getHeader("Content-Type");
		Assert.assertEquals(content_Type,"application/json");
		String server=response.getHeader("Server");
		Assert.assertEquals(server,"nginx");
		String content_Encoding= response.getHeader("Content-Encoding");
		Assert.assertEquals(content_Encoding,"gzip");
		
		System.out.println("content Type value : "+content_Type);
		System.out.println("Server name : "+server);
		System.out.println("content Encoding language : "+content_Encoding);
	}
	
	@Test(enabled=false)
	public void headers() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification= RestAssured.given();
		Response response=requestSpecification.get("/Hyderabad");
		Headers allheader=  response.headers();
		//Headers class implements the Iterable interface.
		for(Header headers: allheader) {
			System.out.println("Header Key : "+headers.getName()+" Header Value :"+headers.getValue());
		}
		
	}
	
	@Test(enabled = false)
	public void getAllHeaders() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get("/Hyderabad");
		System.out.println(response.getHeaders());
		}
}
