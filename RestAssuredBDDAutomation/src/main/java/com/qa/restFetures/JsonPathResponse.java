package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;

public class JsonPathResponse {

	@Test(enabled = false)
	public void stringResponse() {
		String string = given().when().get("http://jsonplaceholder.typicode.com/photos/?id=1").then().extract()
				.asString();
		System.out.println(string);

	}

	@Test(enabled = false)
	public void stringJSON() {
		String str = when().get("http://jsonplaceholder.typicode.com/photos/?albumId=1").then().extract().asString();
		JsonPath jsonPath = new JsonPath(str);
		List<Integer> listId = jsonPath.get("id");
		System.out.println(listId);
		List<String> listtitle = jsonPath.get("title");
		System.out.println(listtitle);
		System.out.println("getList()========complete lis");
		List<Integer> list = jsonPath.getList("id");
		System.out.println(list);
		System.out.println("Complete response in string: ==============");
		System.out.println(str);
	}

	@Test(enabled = true)
	public void getJsonPath() {
		JsonPath jsonPath = when().get("http://jsonplaceholder.typicode.com/photos/?albumId=1").then().extract().jsonPath();
		
		String albumId= jsonPath.getString("albumId");
		System.out.println("albumId"+albumId);
		List<Integer> list=	jsonPath.getList("id");
		System.out.println(list);
		}

	@Test(enabled = false)
	public void JsonPathResponse() {
		JsonPath jsonPath = given().when().get("http://jsonplaceholder.typicode.com/photos/?id=1").then().extract()
				.jsonPath();
		System.out.println(jsonPath);
	}
}
