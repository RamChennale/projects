package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessAutoRequestBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;

	
	@FindBy(xpath = "//a[contains(text(),'Auto Request')]")
	@CacheLookup
	private WebElement AutoRequest;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public ProcessAutoRequestBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void autoRequest() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(AutoRequest);
		actions.moveToElement(AutoRequest).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String AutoRequest = breadcrumb.getText();
		Assert.assertTrue(AutoRequest.contains(file.getBreadcrumb("AutoRequest")), "AutoRequest  not exits in breadcrumb");
		System.out.println(AutoRequest);
	}	
	
}
