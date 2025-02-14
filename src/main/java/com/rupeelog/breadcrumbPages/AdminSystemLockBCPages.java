package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminSystemLockBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),'System Lock')]")
	@CacheLookup
	private WebElement SystemLock;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public AdminSystemLockBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void systemLock() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemLock);
		actions.moveToElement(SystemLock).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String SystemLock = breadcrumb.getText();
		Assert.assertTrue(SystemLock.contains(file.getBreadcrumb("SystemLock")), "SystemLock name not exits in breadcrumb");
		System.out.println(SystemLock);
	}

}
