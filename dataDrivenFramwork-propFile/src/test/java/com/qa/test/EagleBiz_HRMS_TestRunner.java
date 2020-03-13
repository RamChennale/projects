package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.base.TestBase;
import com.qa.businesslogic.HRMSPage;
import com.qa.businesslogic.LoginPage;
import com.qa.utilities.TestUtilities;

public class EagleBiz_HRMS_TestRunner {
	
	WebDriver driver = null;
	WebDriverWait wait = null;
	TestBase testBase = new TestBase();
	LoginPage loginPage = new LoginPage();
	HRMSPage hrmsPage = new HRMSPage();
	
	
	@BeforeClass
	public void initiate(){
		System.setProperty("webdriver.chrome.driver", TestUtilities.CHROMEDRIVER_PATH);
		driver = new ChromeDriver();
		driver.get(TestUtilities.EAGLEBIZ_TEST_URL);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1, groups = "login.validCheck", description="To verify the login functionality when the user logs in as an HR")
	public void testLoginForHR(){
		String username_hr = testBase.getLoginData("username_hr");
		String password = testBase.getLoginData("password");
		String testUrl = loginPage.loginUser(driver, username_hr, password);
		Assert.assertEquals(driver.getCurrentUrl(), testUrl);
	}
	
	@Test(priority = 2, description = "To verify the HR Indent Registration functionality")
	public void testHrIndentRegistration(){
		wait = new WebDriverWait(driver, 10);
		Assert.assertTrue(hrmsPage.addHrIndent(driver, wait));
	}
	
	
	@AfterClass
	void tearDown(){
		driver.close();
	}

}
