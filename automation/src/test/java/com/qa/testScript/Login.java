package com.qa.testScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.loginPage.LoginPage;


public class Login extends TestBase{

private static Logger logger = Logger.getLogger(Login.class);

	
	@Test
	public void verifyLogin() throws InterruptedException {
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		//login.loginAppl();
		login.login(username,password);
		logger.info("User logged in GEMS application successfully.");
	}
}
