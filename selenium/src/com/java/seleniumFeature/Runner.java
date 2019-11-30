package com.java.seleniumFeature;

import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class Runner extends TestBase {

	
	@Test
	public void loginHes() {
		HtmlTags o1 = new HtmlTags(driver);
		o1.login();
	}
	
}
