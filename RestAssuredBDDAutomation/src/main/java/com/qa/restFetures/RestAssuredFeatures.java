package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.security.KeyStore;

import io.restassured.RestAssured;
import io.restassured.config.RedirectConfig;

public class RestAssuredFeatures {

	public void restAssuredFeatures() {
		int port=9090;
		KeyStore truststore = null;
		RestAssured.authentication = basic("userName", "password");
		RestAssured.basePath = "/register";
		RestAssured.baseURI = "http://restapi.com/demo";
		// RestAssured.config=RestAssured.config =
		// config().redirect(redirectConfig().followRedirects(true).and().maxRedirects(0));
		RestAssured.port=9090;
		RestAssured.reset();
		RestAssured.rootPath="api.rest.com";
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.trustStore(truststore);
		RestAssured.get();
		RestAssured.post();
		RestAssured.put();
		RestAssured.delete();
	}
}
