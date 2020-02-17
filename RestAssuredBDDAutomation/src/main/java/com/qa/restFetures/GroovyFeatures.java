package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.annotations.Test;

import groovy.time.BaseDuration.From;
import groovy.transform.stc.FromString;

public class GroovyFeatures {

	@Test(enabled=false)
	public void hasItemsFeatures() {
		given()
		.when()
			.get("http://localhost:3000/posts")
		.then()
			.body("title", hasItems("json-server Update","Rc","json-server","Narech Updated"))
			.body("id", hasItem(1));
	}
	
	@Test(enabled=false)
	public void lenthOfParam() {
		given()
		.when()
			.get("http://localhost:3000/posts")
		.then()
		.log()
		.all()
			.body("title*.length().sum", greaterThan(10));
	}
	
	@Test(enabled=false)
	public void verifyParamAvailability() {
		String string=
		when()
			.get("http://localhost:3000/posts").asString();

	/*	List<String> list=from(string).getList("title");
		for(String country: list) {
			if (country.equalsIgnoreCase("india")) {
				System.out.println("My place found");
			}
		}*/
	}
	
	@Test(enabled=false)
	public void conditionalloop() {
		String res =
			when()
			.get("http://jsonplaceholder.typicode.com/photos/?albumId=1").asString();
		/*List<String> list=from(res).getList("title.findAll{id.name.lenght()>10}.name");
		System.out.println(list);*/
	}
}
