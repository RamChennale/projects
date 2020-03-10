package com.qa.BDDrestAssured;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestDemo {

	@Test(enabled = true)
	public void getReq1() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification = RestAssured.given();

		Response response = requestSpecification.request(Method.GET, "/Hyderabad");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body : " + responseBody);
	}

	@Test(enabled = true)
	public void getReq2() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get("/Hyderabad");
		System.out.println(response.asString());
	}

	@Test(enabled = true)
	public void validateResp() {
		// Step 1: Create a Request pointing to the Service
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

		RequestSpecification requestSpecification = RestAssured.given();
		// Step 2: execute request/send the Request
		Response response = requestSpecification.get("/Hyderabad");
		int Status_Code = response.getStatusCode();
		System.out.println("Status Code :" + Status_Code);
		Assert.assertEquals(Status_Code, 200);

		String status_Line = response.getStatusLine();
		System.out.println("status Line : " + status_Line);
		Assert.assertEquals(status_Line, "HTTP/1.1 200 OK");
		System.out.println(response.asString());
	}

	@Test(enabled = false)
	public void deleteRequest() {
		// 1. Create request
		RestAssured.baseURI = "https://reqres.in/api/users/1";
		RequestSpecification request = RestAssured.given();
		// 2. If required to pass an delete parameter id.
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", "7");
		// 3. Add header
		request.header("Content-Type", "application/json");
		// 4. Pass need parameter and execute request
		request.body(jsonObject.toJSONString());
		Response response = request.get();
		// 5. Validate success response
		int statuscod = response.getStatusCode();
		String strgetBody = response.getBody().asString();
		String ctentType = response.getContentType();
		System.out.println("statuscod" + statuscod);
		System.out.println("strgetBody" + strgetBody);
		System.out.println("ctentType" + ctentType);
	}

	@Test(enabled = false)
	public void getDemo() {
		// Step 1: Create a Request pointing to the Service
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RestAssured.basePath = "/Hyderabad";
		RequestSpecification requestSpecification = RestAssured.given();

		// Step 2: execute request/send the Request
		Response response = requestSpecification.get();
		int Status_Code = response.getStatusCode();
		System.out.println("Status Code :" + Status_Code);
		Assert.assertEquals(Status_Code, 200);

		String status_Line = response.getStatusLine();
		System.out.println("status Line : " + status_Line);
		Assert.assertEquals(status_Line, "HTTP/1.1 200 OK");
		System.out.println(response.asString());
	}
}