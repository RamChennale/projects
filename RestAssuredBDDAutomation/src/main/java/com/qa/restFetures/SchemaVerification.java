package com.qa.restFetures;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

public class SchemaVerification {

	  @Test
	    public void testJsonSchema() {
	 
	        RestAssured.given()
	            .when()
	            .get("https://jsonplaceholder.typicode.com/comments?postId=1")
	            .then()
	            .assertThat()
	            .body(matchesJsonSchemaInClasspath("C:/Users/ramchennale/git/RestAssuredBDDAutomation/resource/JsonSchemaFile.JSON"));
	    }
}
