package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class OperationsUploadsBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[contains(text(),'Operations')]")
	@CacheLookup
	private WebElement Operations;
	
	@FindBy(xpath = "//a[contains(text(),'Uploads')]")
	@CacheLookup
	private WebElement Uploads;
	
	@FindBy(xpath = "//a[contains(text(),'Document Download')]")
	@CacheLookup
	private WebElement DocumentDownload;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//li[17]//ul[1]//li[1]//ul[1]//li[2]//a[1]")
	@CacheLookup
	private WebElement DocumentUpload;
	
	public OperationsUploadsBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void documentDownload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Operations);
		actions.moveToElement(Operations).perform();

		WebDriverWaitFunctions.waitToLoadElement(Uploads);
		actions.moveToElement(Uploads).perform();

		WebDriverWaitFunctions.waitToLoadElement(DocumentDownload);
		actions.moveToElement(DocumentDownload).click().build().perform();

		/*
		 * WebDriverWaitFunctions.waitToLoadElement(breadcrumb); String DocumentDownload
		 * = breadcrumb.getText(); System.out.println(DocumentDownload);
		 * Assert.assertTrue(DocumentDownload.contains(file.getBreadcrumb(
		 * "DocumentDownload")), "DocumentDownload  not exits in breadcrumb");
		 */	
	}	
	
	public void documentUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Operations);
		actions.moveToElement(Operations).perform();

		WebDriverWaitFunctions.waitToLoadElement(Uploads);
		actions.moveToElement(Uploads).perform();

		WebDriverWaitFunctions.waitToLoadElement(DocumentUpload);
		actions.moveToElement(DocumentUpload).click().build().perform();

		/*
		 * WebDriverWaitFunctions.waitToLoadElement(breadcrumb); String DocumentUpload =
		 * breadcrumb.getText(); System.out.println(DocumentUpload);
		 * Assert.assertTrue(DocumentUpload.contains(file.getBreadcrumb("DocumentUpload"
		 * )), "DocumentUpload  not exits in breadcrumb");
		 */	
	}	
}
