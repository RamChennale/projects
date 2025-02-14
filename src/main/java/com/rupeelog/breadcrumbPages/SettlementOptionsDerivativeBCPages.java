package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class SettlementOptionsDerivativeBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Settlement")
	@CacheLookup
	private WebElement Settlement;
	
	@FindBy(linkText = "Options (Derivative)")
	@CacheLookup
	private WebElement OptionsDerivative;
	
	@FindBy(xpath = "//a[contains(text(),'Custodian - Settle Cash')]")
	@CacheLookup
	private WebElement CustodianSettleCash;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public SettlementOptionsDerivativeBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void custodianSettleCash() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Settlement);
		actions.moveToElement(Settlement).perform();

		WebDriverWaitFunctions.waitToLoadElement(OptionsDerivative);
		actions.moveToElement(OptionsDerivative).perform();

		WebDriverWaitFunctions.waitToLoadElement(CustodianSettleCash);
		actions.moveToElement(CustodianSettleCash).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CustodianSettleCash = breadcrumb.getText();
		System.out.println(CustodianSettleCash);
		Assert.assertTrue(CustodianSettleCash.contains(file.getBreadcrumb("CustodianSettleCash")), " CustodianSettleCash not exits in breadcrumb");

	}	
}
