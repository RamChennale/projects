package com.qa.jsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.mapper.factory.GsonObjectMapperFactory;
import io.restassured.response.Response;

public class JsonPathMethods {
	@Test(enabled=true)
	public void JOSNPathEvaluator() {
		Response response=
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.assertThat().body("City", equalTo("Hyderabad")).extract().response();
		
		JsonPath jsonPath= response.jsonPath();
		
		System.out.println(response.asString());
	
		System.out.println(jsonPath.getString("City"));
		System.out.println("jsonPath"+jsonPath.getByte("City"));
		System.out.println("jsonPath"+jsonPath.getChar("City"));
		System.out.println("jsonPath"+jsonPath.getDouble("City"));
		System.out.println("jsonPath"+jsonPath.getFloat("City"));
		System.out.println("jsonPath"+jsonPath.getInt("City"));
		System.out.println("jsonPath"+jsonPath.getLong("City"));
		System.out.println("jsonPath"+jsonPath.getShort("City"));
		System.out.println("jsonPath"+jsonPath.getString(("City")));
		System.out.println("jsonPath"+jsonPath.toString());
		System.out.println("jsonPath"+jsonPath.prettify());
		System.out.println("jsonPath"+jsonPath.prettyPrint());
		System.out.println("jsonPath"+jsonPath.get("path"));
		System.out.println("jsonPath"+jsonPath.getBoolean("path"));
		System.out.println("jsonPath"+jsonPath.getJsonObject("path"));
		System.out.println("jsonPath"+jsonPath.getList("City"));
		System.out.println("jsonPath"+jsonPath.getMap("City"));
		System.out.println("jsonPath"+jsonPath.setRootPath("rootPath"));
		//System.out.println("jsonPath"+jsonPath.using(GsonObjectMapperFactory.class));
		System.out.println("jsonPath"+jsonPath.from("file"));
		System.out.println("jsonPath"+jsonPath.given("file"));
		System.out.println("jsonPath"+jsonPath.with("file"));
		jsonPath.reset();

		//One more way
		JsonPath jsonPath1= new JsonPath(response.asString());
		System.out.println("jsonPath : "+jsonPath1.getString("City"));//jsonPath : Hyderabad
	}
}








