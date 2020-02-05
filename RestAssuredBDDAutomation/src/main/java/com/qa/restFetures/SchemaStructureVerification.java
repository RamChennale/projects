package com.qa.restFetures;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.jsonschema.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class SchemaStructureVerification {

	@Test(enabled = true)
	public void verifySchemaStructure() {
		given()
			. contentType("application/json")
		.when()
			.get("http://jsonplaceholder.typicode.com/photos")
		.then()
			.assertThat()
			.body(matchesJsonSchemaInClasspath("C:/Users/ramchennale/git/RestAssuredBDDAutomation/resource/schemaStructure.json"));
			//.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("C:/Users/ramchennale/git/RestAssuredBDDAutomation/resource/schemaStructure.json"));

	}
}

/*.body(JsonSchemaValidator
		.matchesJsonSchemaInClasspath("C:/Users/ramchennale/git/RestAssuredBDDAutomation/resource/schemaStructure.json"));
*/
