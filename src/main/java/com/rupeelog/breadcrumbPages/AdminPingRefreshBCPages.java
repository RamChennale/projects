package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminPingRefreshBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),'Ping Refresh')]")
	@CacheLookup
	private WebElement PingRefresh;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public AdminPingRefreshBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void pingRefresh() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(PingRefresh);
		actions.moveToElement(PingRefresh).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String PingRefresh = breadcrumb.getText();
		Assert.assertTrue(PingRefresh.contains(file.getBreadcrumb("PingRefresh")), "PingRefresh name not exits in breadcrumb");
		System.out.println(PingRefresh);
	}

}
