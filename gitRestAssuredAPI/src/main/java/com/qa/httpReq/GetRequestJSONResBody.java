package com.qa.httpReq;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetRequestJSONResBody {

	@Test(enabled = true, priority = 1)
	public void getVerifyJSONResBody() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET, "/Hyderabad");
		String responseBygetBody = response.getBody().asString();
		String responseByBody = response.body().asString();
		String responseBodyString = response.getBody().asString();
		Assert.assertEquals(responseBodyString.contains("Hyderabad"), true, "Response body contains Hyderabad");
		System.out.println("JSON Response : " + responseBodyString);

		JsonPath jsonPath = response.jsonPath();
		String tokenInString = jsonPath.getString("token");
		int token = Integer.parseInt(tokenInString);
		List<Integer> id = jsonPath.getList("data.id");
		List<String> name = jsonPath.getList("data.name");
		for (Integer i : id) {
			System.out.println("Id: " + i);
		}
		for (String names : name) {
			System.out.println("Names: " + names);
		}

		JsonPath jsonPathEvaluator = response.jsonPath();
		String city = jsonPathEvaluator.getString("City");
		Assert.assertEquals(city, "Hyderabad", "City 'Hyderabad' dose not found.");

		String temperature = jsonPathEvaluator.getString("Temperature");
		String humidity = jsonPathEvaluator.getString("Humidity");
		String weatherDescription = jsonPathEvaluator.getString("WeatherDescription");
		String windSpeed = jsonPathEvaluator.getString("WindSpeed");
		String windDirectionDegree = jsonPathEvaluator.getString("WindDirectionDegree");

		System.out.println("Extracting parameter from JSON object :" + city);
	}

}
// status Line: "HTTP/1.1 200 OK" First part is Http protocol (HTTP/1.1). Second
// is Status Code (200). Third is the Status message (OK).
