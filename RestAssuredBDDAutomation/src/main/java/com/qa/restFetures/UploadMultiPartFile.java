package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertTrue;
import java.io.File;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UploadMultiPartFile {

	@Test
	public void uploadFile() {
		File testUploadFile = new File("C:\\temp\\testfile.png"); // Specify your own location and file

		RestAssured.baseURI = "http://localhost:8080";
		Response response = 
				
				given()
					.multiPart(testUploadFile)
				.when()
					.post("/uploadFile");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		assertTrue(response.asString().contains("successfully uploaded"));
	}
}
