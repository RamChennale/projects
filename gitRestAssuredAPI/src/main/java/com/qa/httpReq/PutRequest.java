package com.qa.httpReq;

/*204 for OK (but no content) 
200 for OK with Body (Updated response)
400 if the supplied data was invalid*/

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {

	@Test
	public void putRequest() {
		//1. Create request
		RestAssured.baseURI="https://reqres.in/api/users/7";
		RequestSpecification request=	RestAssured.given();
		
		//2. Create JSON object to pass parameters 
		JSONObject jsonObject= new JSONObject();
		jsonObject.put("name", "Ram");
		jsonObject.put("job", "Tester");
		
		//3. Add header to request 
		request.header("Content-Type", "application/json");
		
		//4. Pass parameters in body and run method 
		request.body(jsonObject.toJSONString());
		Response response=	request.put();
		
		//5. Validate response
		int status_Code=response.getStatusCode();
		Assert.assertEquals(status_Code, 200);
		
		String updatedRespose=	response.getBody().asString();
		System.out.println(updatedRespose);
	}
}
