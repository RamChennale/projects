package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class CONNECT_HTTPS {

	@Test(enabled=true)
	public void connectForHTTPS() {
		given()
		.when().request("CONNECT", "https://jsonplaceholder.typicode.com/posts")
		.then().log().all();
		
	}
}
