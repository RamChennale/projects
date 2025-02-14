package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class HeldAwayTxnUploadBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Held Away")
	@CacheLookup
	private WebElement HeldAway;
	
	@FindBy(xpath = "//a[text()='Transaction Upload']")
	@CacheLookup
	private WebElement TransactionUpload;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public HeldAwayTxnUploadBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void transactionUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(HeldAway);
		actions.moveToElement(HeldAway).perform();

		WebDriverWaitFunctions.waitToLoadElement(TransactionUpload);
		actions.moveToElement(TransactionUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String TransactionUpload = breadcrumb.getText();
		System.out.println(TransactionUpload);
		Assert.assertTrue(TransactionUpload.contains(file.getBreadcrumb("TransactionUpload")), " TransactionUpload not exits in breadcrumb");

	}	
}
