package com.rupeelog.reportsPages;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class ViewRMReportsPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Reports")
	@CacheLookup
	private WebElement Reports;

	@FindBy(linkText = "RM Reports")
	@CacheLookup
	private WebElement RMReports;

	@FindBy(xpath = "//input[@type='search']")
	@CacheLookup
	private WebElement searchBox;

	@FindBy(xpath = "//a[text()='View Report']")
	@CacheLookup
	private WebElement ViewReportLink;

	public ViewRMReportsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void viewRMReport() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Reports);
		action.moveToElement(Reports).perform();

		ElementWait.isElementVisible(RMReports);
		action.moveToElement(RMReports).click().build().perform();

		ElementWait.isElementVisible(searchBox);
		searchBox.sendKeys(file.getReportsTestData("searchPortfolio"));

		String parentWindow=	driver.getWindowHandle();
 
		ElementWait.isElementVisible(ViewReportLink);
		ViewReportLink.click();
		
		Set<String> windSet=driver.getWindowHandles();
		System.out.println("Before removing first window "+windSet.size());
		
		windSet.remove(windSet.iterator().next());
		System.out.println("After removing first window "+windSet.size());
		
		String lastWind=windSet.iterator().next();
		driver.switchTo().window(lastWind);
		
		WebElement verifyReportWind=driver.findElement(By.xpath("//a[contains(text(),'Portfolio Summary')]"));
		ElementWait.isElementVisible(verifyReportWind);
		System.out.println("Window title :  "+ driver.getTitle());
		System.out.println("New windo URL : "+driver.getCurrentUrl());
		
		driver.switchTo().window(parentWindow);
	}

}
