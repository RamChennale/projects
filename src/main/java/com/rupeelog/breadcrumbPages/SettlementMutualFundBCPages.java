package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class SettlementMutualFundBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Settlement")
	@CacheLookup
	private WebElement Settlement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[11]/ul[1]/li[4]/a[1]")
	@CacheLookup
	private WebElement MutualFund;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[11]/ul[1]/li[4]/ul[1]/li[1]/a[1]")
	@CacheLookup
	private WebElement mfSettleCash;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[11]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
	@CacheLookup
	private WebElement mfSettleStock;
	
	public SettlementMutualFundBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void mfSettleCash() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Settlement);
		actions.moveToElement(Settlement).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(mfSettleCash);
		actions.moveToElement(mfSettleCash).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String mfSettleCash = breadcrumb.getText();
		System.out.println(mfSettleCash);
		Assert.assertTrue(mfSettleCash.contains(file.getBreadcrumb("mfSettleCash")), " mfSettleCash not exits in breadcrumb");

	}	
	

	public void mfSettleStock() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Settlement);
		actions.moveToElement(Settlement).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(mfSettleStock);
		actions.moveToElement(mfSettleStock).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String mfSettleStock = breadcrumb.getText();
		System.out.println(mfSettleStock);
		Assert.assertTrue(mfSettleStock.contains(file.getBreadcrumb("mfSettleStock")), "mfSettleStock  not exits in breadcrumb");

	}	
	
}
