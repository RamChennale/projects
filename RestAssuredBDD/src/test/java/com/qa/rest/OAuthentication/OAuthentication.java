package com.qa.rest.OAuthentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OAuthentication {

	@Test
	public void oAuthe() {
		Response response = RestAssured.given().auth()
				.oauth("KmRBDQSOuA6wYNgQTQkIRX8pK", 
						"SyV1fUeXu31lnwxWENTYsMAyTGZOySUBEKfV8Kl0Tq7WiNXXiT",
						"720163044-RGdlveUnvGjfQSdmjnFenGWybOVLXKkhUo5qKGqK",
						"HAZ86sQ2BVhE0AqUA9qPgZoLxgtEO6XF548aYg2hc6ENO")
				.post("https://api.twitter.com/1.1/statuses/destroy/1199264659280293888.json");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getBody().jsonPath().prettify());
	}
}

/*.post("https://api.twitter.com/1.1/statuses/update.json?status=my second tweet from API");
System.out.println(response.getStatusCode());
System.out.println(response.getBody().asString());
System.out.println(response.getBody().jsonPath().prettify());
JsonPath jsonPath=	response.jsonPath();
String tweetId= jsonPath.get("id_str");
System.out.println("My tweet ID : "+tweetId);

.post("https://api.twitter.com/1.1/statuses/destroy/1199264659280293888.json");

*/