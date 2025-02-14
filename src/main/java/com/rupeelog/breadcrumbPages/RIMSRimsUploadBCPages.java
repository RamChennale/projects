package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class RIMSRimsUploadBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "Rims Upload")
	@CacheLookup
	private WebElement RimsUpload;
	
	@FindBy(xpath = "//ul//ul//ul//a[contains(text(),'Upload Process')]")
	@CacheLookup
	private WebElement UploadProcess;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public RIMSRimsUploadBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void uploadProcess() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RimsUpload);
		actions.moveToElement(RimsUpload).perform();

		WebDriverWaitFunctions.waitToLoadElement(UploadProcess);
		actions.moveToElement(UploadProcess).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String UploadProcess = breadcrumb.getText();
		Assert.assertTrue(UploadProcess.contains(file.getBreadcrumb("UploadProcess")), "UploadProcess  not exits in breadcrumb");
		System.out.println(UploadProcess);
	}	
	
}
