package com.qa.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.businesslogic.CRMPage;
import com.qa.businesslogic.LoginPage;
import com.qa.utilities.*;

public class EagleBiz_TestRunner {
	WebDriver driver = null;
	WebDriverWait wait = null;
	TestBase testBase = new TestBase();
	LoginPage loginPage = null;
	CRMPage crmPage = null;

	
	@BeforeClass
	void initiateTest(){
		System.setProperty("webdriver.chrome.driver", TestUtilities.CHROMEDRIVER_PATH);
		driver = new ChromeDriver();
		driver.get(TestUtilities.EAGLEBIZ_TEST_URL);
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1, groups = "login.validCheck", description = "To verify the Login functionality of Eagle Biz with valid scenario.")
	void testLoginFunctionality() throws IOException{
		loginPage = new LoginPage();
		String username = testBase.getLoginData("username");
		String password = testBase.getLoginData("password");
		String testUrl = loginPage.loginUser(driver, username, password);
		Assert.assertEquals(driver.getCurrentUrl(), testUrl);
	}
	
	@Test (priority = 2, groups = "crm.salesRequest", description = "To verify whether the application navigates to Sales Request by selecting the option in the menu item of Eagle Biz.")
	void testCRMSalesRequestNavigation(){
		wait = new WebDriverWait(driver, 10);
		String expected_sr_pageHeader = testBase.getCrmSrData("crm_sr_exp_headerPath");
		crmPage = new CRMPage();
		String actual_sr_pageHeader = crmPage.navigateToSalesRequest(driver, wait);
		Assert.assertEquals(actual_sr_pageHeader, expected_sr_pageHeader);
	}
	
	@Test (priority = 3, groups = "crm.salesRequest", description = "To verify the Sales Request Registration process. ")
	void testCRMSalesRequestRegistration(){
		wait = new WebDriverWait(driver, 10);
		Assert.assertTrue(crmPage.addSalesRequest(driver, wait));
	}
	
	@Test (priority = 4, groups = "crm.salesRequest", description = "To verify the accuracy of data after the Sales Request Registration")
	void testCRMSalesRequestData(){
		wait = new WebDriverWait(driver, 10);
		Assert.assertTrue(crmPage.validateSRRegistration(driver, wait));
	}
	
	@AfterClass
	void tearDown(){
		driver.close();
	}
	
}
