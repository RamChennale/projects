package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class SettlementDebtBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Settlement")
	@CacheLookup
	private WebElement Settlement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[11]/ul[1]/li[1]/a[1]")
	@CacheLookup
	private WebElement Debt;
	
	@FindBy(xpath = "//li[11]//ul[1]//li[1]//ul[1]//li[1]//a[1]")
	@CacheLookup
	private WebElement dSettleCash;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//li[11]//ul[1]//li[1]//ul[1]//li[2]//a[1]")
	@CacheLookup
	private WebElement dSettleStock;
	
	public SettlementDebtBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void debtSettleCash() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Settlement);
		actions.moveToElement(Settlement).perform();

		WebDriverWaitFunctions.waitToLoadElement(Debt);
		actions.moveToElement(Debt).perform();

		WebDriverWaitFunctions.waitToLoadElement(dSettleCash);
		actions.moveToElement(dSettleCash).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String dSettleCash = breadcrumb.getText();
		System.out.println(dSettleCash);
		Assert.assertTrue(dSettleCash.contains(file.getBreadcrumb("dSettleCash")), " Settle Cash  not exits in breadcrumb");

	}	
	
	public void dSettleStock() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Settlement);
		actions.moveToElement(Settlement).perform();

		WebDriverWaitFunctions.waitToLoadElement(Debt);
		actions.moveToElement(Debt).perform();

		WebDriverWaitFunctions.waitToLoadElement(dSettleStock);
		actions.moveToElement(dSettleStock).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String dSettleStock = breadcrumb.getText();
		System.out.println(dSettleStock);
		Assert.assertTrue(dSettleStock.contains(file.getBreadcrumb("dSettleStock")), " dSettleStock not exits in breadcrumb");

	}

}
