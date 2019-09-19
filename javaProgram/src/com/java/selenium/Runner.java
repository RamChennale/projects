package com.java.selenium;

import org.testng.annotations.Test;

public class Runner extends TestBase {

	
	@Test
	public void loginHes() {
		HtmlTags o1 = new HtmlTags(driver);
		o1.login();
	}
	
}
