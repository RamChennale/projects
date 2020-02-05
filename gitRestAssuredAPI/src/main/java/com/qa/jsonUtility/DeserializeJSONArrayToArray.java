package com.qa.jsonUtility;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeserializeJSONArrayToArray {

	@Test()
	public void deSerializeJSON_ArrayToArray() {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.get();
		System.out.println(response.asString());
		System.out.println("===================");

		/*
		 * JsonPath jsonPathEvaluater= response.jsonPath(); List<Integer> list=
		 * jsonPathEvaluater.getList("data.id"); for(Integer id:list) {
		 * System.out.println("ID : "+id); }
		 */
		JsonPath jsonPath = response.jsonPath();
		System.out.println("==========JSON variables fetching ===========");
		String page = jsonPath.getString("page");
		String per_page = jsonPath.getString("per_page");
		String total = jsonPath.getString("total");
		String total_pages = jsonPath.getString("total_pages");
		System.out.print("per_page" + per_page);
		System.out.print("total" + total);
		System.out.print("total_pages" + total_pages);
		System.out.println("==========JSON Array elements fetching ===========");
		List<String> first_name = jsonPath.getList("data.first_name");
		for(String s:first_name) {
			System.out.println("first_name  :"+ first_name);
		}
		List<String> email = jsonPath.getList("data.email");
		for(String emails:email) {
			System.out.println("emails :"+emails);
		}
		// DeSerialize JSON Array to Array
		// ArrayDataExtractbyPOJO[] data=jsonPathEvaluater.getObject("data",
		// ArrayDataExtractbyPOJO.class);

	}
}
