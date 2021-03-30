package com.qa.httpReq;

import org.testng.Assert;
/*https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=2b1fd2d7f77ccf1b7de9b441571b39b8
 * 
 * https://samples.openweathermap.org/data/2.5/
weather
?q=London,uk&
appid=2b1fd2d7f77ccf1b7de9b441571b39b8*/

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetPassingQueryParameter {

	@Test(enabled = true)
	public void passingQueryParameterGetReq() {
		RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/";
		RequestSpecification request = RestAssured.given();
		Response response = request.queryParam("q", "London,UK").queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
				.get("/weather");
		String res = response.asString();
		System.out.println(response.getStatusCode());
		Assert.assertEquals(res.contains("London"), true);

	}

}
