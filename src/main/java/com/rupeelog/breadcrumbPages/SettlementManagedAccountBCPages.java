package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class SettlementManagedAccountBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Settlement")
	@CacheLookup
	private WebElement Settlement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[11]/ul[1]/li[3]/a[1]")
	@CacheLookup
	private WebElement ManagedAccount;
	
	@FindBy(xpath = "//li[11]//ul[1]//li[3]//ul[1]//li[1]//a[1]")
	@CacheLookup
	private WebElement maSettleCash;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public SettlementManagedAccountBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void maSettleCash() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Settlement);
		actions.moveToElement(Settlement).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccount);
		actions.moveToElement(ManagedAccount).perform();

		WebDriverWaitFunctions.waitToLoadElement(maSettleCash);
		actions.moveToElement(maSettleCash).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String maSettleCash = breadcrumb.getText();
		System.out.println(maSettleCash);
		Assert.assertTrue(maSettleCash.contains(file.getBreadcrumb("maSettleCash")), " maSettleCash  not exits in breadcrumb");

	}	
	
}
