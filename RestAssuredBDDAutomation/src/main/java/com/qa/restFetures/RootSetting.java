package com.qa.restFetures;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RootSetting {
	
	@SuppressWarnings("deprecation")
	public void setRootName() {
		given()
			.get("")
		.then()
			.root("result.names")
			.body("name", equalTo("ram"))
			.statusCode(200);
	}
	
	@SuppressWarnings("deprecation")
	public void removeRootSettingName() {
		given()
			.get("")
		.then()
			.root("result.names")
			.body("name", equalTo("ram"))
			.statusCode(200)
			.detachRoot("names")
			.body("names.name", equalTo("ram"));
	}
}