package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class RIMSNonMFRevenueBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "Non MF Revenue")
	@CacheLookup
	private WebElement nonMFRevenue;
	
	@FindBy(xpath = "//a[contains(text(),'1. Non MF Rate Card Upload')]")
	@CacheLookup
	private WebElement NonMFRateCardUpload1;

		
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public RIMSNonMFRevenueBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void nonMFRateCardUpload1() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(nonMFRevenue);
		actions.moveToElement(nonMFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(NonMFRateCardUpload1);
		actions.moveToElement(NonMFRateCardUpload1).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String NonMFRateCardUpload1 = breadcrumb.getText();
		Assert.assertTrue(NonMFRateCardUpload1.contains(file.getBreadcrumb("NonMFRateCardUpload1")), "NonMFRateCardUpload1  not exits in breadcrumb");
		System.out.println(NonMFRateCardUpload1);
	}	
	
}
