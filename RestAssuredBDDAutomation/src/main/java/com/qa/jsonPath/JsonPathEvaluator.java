package com.qa.jsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import scala.Array;

public class JsonPathEvaluator {

	@Test
	public void jsonPathEvaluator() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/employees";
		Response response=
		given().
		when().get().
		then().extract().response();

		List<ArrayList<String>> listL = new ArrayList<ArrayList<String>>();
		
		JsonPath jsonPath=response.jsonPath();
		String id= jsonPath.getString("data.id");
		String employee_name=jsonPath.getString("data.employee_name");
		String employee_salary=jsonPath.getString("data.employee_salary");
		String employee_age=jsonPath.getString("data.employee_age");
		
		System.out.println("id: "+id);
		System.out.println("employee_name: "+employee_name);
		System.out.println("employee_salary: "+employee_salary);
		System.out.println("employee_age: "+employee_age);
		
		//String prettyPrintJsonString=jsonPath.prettyPrint();
		//System.out.println(prettyPrintJsonString);
		
		String prettifyJsonString= jsonPath.prettify();
	}
}
