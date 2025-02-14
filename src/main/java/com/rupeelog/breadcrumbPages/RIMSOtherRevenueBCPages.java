package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class RIMSOtherRevenueBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(xpath = "//a[contains(text(),'Other Revenue')]")
	@CacheLookup
	private WebElement otherRevenue;
	
	@FindBy(xpath = "//a[contains(text(),'Brokerage')]")
	@CacheLookup
	private WebElement Brokerage;

		
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Brokerage Validate')]")
	@CacheLookup
	private WebElement BrokerageValidate;
	
	@FindBy(xpath = "//a[contains(text(),'Revenue Misc Upload')]")
	@CacheLookup
	private WebElement RevenueMiscUpload;
	
	public RIMSOtherRevenueBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void brokerage() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(otherRevenue);
		actions.moveToElement(otherRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(Brokerage);
		actions.moveToElement(Brokerage).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Brokerage = breadcrumb.getText();
		Assert.assertTrue(Brokerage.contains(file.getBreadcrumb("Brokerage")), "Brokerage  not exits in breadcrumb");
		System.out.println(Brokerage);
	}	
	
	public void brokerageValidate() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(otherRevenue);
		actions.moveToElement(otherRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(BrokerageValidate);
		actions.moveToElement(BrokerageValidate).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BrokerageValidate = breadcrumb.getText();
		Assert.assertTrue(BrokerageValidate.contains(file.getBreadcrumb("BrokerageValidate")), "BrokerageValidate  not exits in breadcrumb");
		System.out.println(BrokerageValidate);
	}
	
	public void revenueMiscUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(otherRevenue);
		actions.moveToElement(otherRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(RevenueMiscUpload);
		actions.moveToElement(RevenueMiscUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RevenueMiscUpload = breadcrumb.getText();
		Assert.assertTrue(RevenueMiscUpload.contains(file.getBreadcrumb("RevenueMiscUpload")), "RevenueMiscUpload  not exits in breadcrumb");
		System.out.println(RevenueMiscUpload);
	}
}
