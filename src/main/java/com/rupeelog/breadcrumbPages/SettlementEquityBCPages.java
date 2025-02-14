package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class SettlementEquityBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Settlement")
	@CacheLookup
	private WebElement Settlement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[11]/ul[1]/li[2]/a[1]")
	@CacheLookup
	private WebElement Equity;
	
	@FindBy(xpath = "//li[11]//ul[1]//li[2]//ul[1]//li[1]//a[1]")
	@CacheLookup
	private WebElement eSettleCash;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//li[11]//ul[1]//li[2]//ul[1]//li[2]//a[1]")
	@CacheLookup
	private WebElement eSettleStock;
	
	public SettlementEquityBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void eSettleCash() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Settlement);
		actions.moveToElement(Settlement).perform();

		WebDriverWaitFunctions.waitToLoadElement(Equity);
		actions.moveToElement(Equity).perform();

		WebDriverWaitFunctions.waitToLoadElement(eSettleCash);
		actions.moveToElement(eSettleCash).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String eSettleCash = breadcrumb.getText();
		System.out.println(eSettleCash);
		Assert.assertTrue(eSettleCash.contains(file.getBreadcrumb("eSettleCash")), " Settle Cash  not exits in breadcrumb");

	}	
	
	public void eSettleStock() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Settlement);
		actions.moveToElement(Settlement).perform();

		WebDriverWaitFunctions.waitToLoadElement(Equity);
		actions.moveToElement(Equity).perform();

		WebDriverWaitFunctions.waitToLoadElement(eSettleStock);
		actions.moveToElement(eSettleStock).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String eSettleStock = breadcrumb.getText();
		System.out.println(eSettleStock);
		Assert.assertTrue(eSettleStock.contains(file.getBreadcrumb("eSettleStock")), " dSettleStock not exits in breadcrumb");

	}

}
