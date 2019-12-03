package com.qa.httpReq;
import org.json.simple.JSONObject;
import org.testng.Assert;
/*202 Accepted- if the action will likely succeed but has not yet enacted.
204 No Content- If successful and if no further information requires to supply.
200 OK – If the action executes and the response message includes a representation describing the status.
*/import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {

	@Test
	public void deleteRequest() {
		
		//1. Create request
		RestAssured.baseURI="https://reqres.in/api/users/7";
		RequestSpecification request=RestAssured.given();
		
		//2. If required to pass an delete parameter id.
		JSONObject jsonObject= new JSONObject();
		//jsonObject.put("id", "7");
		
		//3. Add header 
		request.header("Content-Type", "application/json");
		
		//4. Pass need parameter and execute request
		//request.body(jsonObject.toJSONString());
		Response response=	request.delete();
		
		//5. Validate success response
		int status_code=response.getStatusCode();
		Assert.assertEquals(status_code, 204);
		System.out.println("status code is : "+status_code);
		
	}
}
