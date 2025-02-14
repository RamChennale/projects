package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminPasswordBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(linkText = "Password")
	@CacheLookup
	private WebElement Password;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'MF Exchange Password')]")
	@CacheLookup
	private WebElement MFExchangePassword; 
	
	@FindBy(xpath = "//a[contains(text(),'RTA Email Password')]")
	@CacheLookup
	private WebElement RTAEmailPassword; 
	
	public AdminPasswordBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void mfExchangePassword() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Password);
		actions.moveToElement(Password).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFExchangePassword);
		actions.moveToElement(MFExchangePassword).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFExchangePassword = breadcrumb.getText();
		Assert.assertTrue(MFExchangePassword.contains(file.getBreadcrumb("MFExchangePassword")), "MFExchangePassword name not exits in breadcrumb");
		System.out.println(MFExchangePassword);
	}
	
	public void rtaEmailPassword() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Password);
		actions.moveToElement(Password).perform();

		WebDriverWaitFunctions.waitToLoadElement(RTAEmailPassword);
		actions.moveToElement(RTAEmailPassword).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RTAEmailPassword = breadcrumb.getText();
		Assert.assertTrue(RTAEmailPassword.contains(file.getBreadcrumb("RTAEmailPassword")), "RTAEmailPassword name not exits in breadcrumb");
		System.out.println(RTAEmailPassword);
	}

}
