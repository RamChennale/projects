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
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification requestSpecification=	RestAssured.given();
		Response response= requestSpecification.get();
		System.out.println(response.asString());
		System.out.println("===================");
		
		JsonPath jsonPathEvaluater= response.jsonPath();
		List<Integer> list=	jsonPathEvaluater.getList("data.id");
		for(Integer id:list) {
			System.out.println("ID : "+id);
		}
		
		//DeSerialize JSON Array to Array
		//ArrayDataExtractbyPOJO[] data=jsonPathEvaluater.getObject("data", ArrayDataExtractbyPOJO.class);
		
	}
}
