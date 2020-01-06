package com.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qa.base.TestBase;

public class CaptureScreenshotFailedTCPOM extends TestBase {

	@FindBy(xpath="//a[@href='/Students/Index'][text()=\"Home\"]")
	private WebElement home;
	
	 public CaptureScreenshotFailedTCPOM(WebDriver driver){
		CaptureScreenshotFailedTCPOM.driver=driver;
	}
	
	 public void captureScreenshotFailedTestCase() {
			home.click();
			String expectedTitle="Testing Control";
			String title= driver.getTitle();
			Assert.assertEquals(title, expectedTitle,"Assertion failed");
		}

}
