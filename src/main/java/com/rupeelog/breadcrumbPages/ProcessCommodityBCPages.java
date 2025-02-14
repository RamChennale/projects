package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessCommodityBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(linkText = "Commodity")
	@CacheLookup
	private WebElement Commodity;
	
	@FindBy(xpath = "//a[contains(text(),'Commodity Txn - Not Validated')]")
	@CacheLookup
	private WebElement CommodityTxnNotValidated;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public ProcessCommodityBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void  commodityTxnNotValidated() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Commodity);
		actions.moveToElement(Commodity).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommodityTxnNotValidated);
		actions.moveToElement(CommodityTxnNotValidated).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CommodityTxnNotValidated = breadcrumb.getText();
		Assert.assertTrue(CommodityTxnNotValidated.contains(file.getBreadcrumb("CommodityTxnNotValidated")), "CommodityTxnNotValidated  not exits in breadcrumb");
		System.out.println(CommodityTxnNotValidated);
	}	
	
}
