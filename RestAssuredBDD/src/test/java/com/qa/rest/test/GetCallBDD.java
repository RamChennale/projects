package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {

	@Test
	public void numOfCircuits_2017() {

		given().when().get("http://ergast.com/api/f1/2008/circuits.json").
		then().assertThat().statusCode(200).
		and().
		body("MRData.CircuitTable.Circuits.circuitId", hasSize(18)).
		and().
		header("content-length", equalTo("4142"));
		System.out.println("=============================");
		int statusCode= get("http://ergast.com/api/f1/2008/circuits.json").statusCode();
		System.out.println("Get status Code : "+statusCode);
		Assert.assertEquals(statusCode, 200);
		System.out.println("=============================");
		long time= RestAssured.get("http://ergast.com/api/f1/2008/circuits.json").getTime();
		System.out.println("Request time too to response : "+time);
		System.out.println("=============================");
	}
}
