package com.qa.restFetures;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.Test;

public class ResponseasStringasByteArrayasInpustStream {

	public void asString() {
		String string=
		given()
		.when()
			.get("url").asString();
	}
	
	@Test(enabled=false)
	public void inputStream() {
		InputStream inputStream=
				given()
				.when()
					.get("url").asInputStream();
		
		try {
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	@Test(enabled=false)
	public void asByteArray() {
		byte[] array=	when().get("url").asByteArray();
		System.out.println(array.length);
	}
}
