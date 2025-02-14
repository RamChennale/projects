package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminDeleteReportSchedulerBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),'Delete Report Scheduler')]")
	@CacheLookup
	private WebElement DeleteReportScheduler;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public AdminDeleteReportSchedulerBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void deleteReportScheduler() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(DeleteReportScheduler);
		actions.moveToElement(DeleteReportScheduler).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String DeleteReportScheduler = breadcrumb.getText();
		Assert.assertTrue(DeleteReportScheduler.contains(file.getBreadcrumb("DeleteReportScheduler")), "DeleteReportScheduler name not exits in breadcrumb");
		System.out.println(DeleteReportScheduler);
	}

}
