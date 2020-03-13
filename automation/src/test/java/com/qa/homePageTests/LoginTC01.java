package com.qa.homePageTests;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;


public class LoginTC01 extends TestBase{

private static Logger logger = Logger.getLogger(LoginTC01.class);

	
	@Test
	public void verifyLogin() throws InterruptedException {
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		//login.loginAppl();
		login.login(username,password);
		logger.info("User logged in application successfully.");
	}
}
