package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class RIMSRimsUpdateBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(xpath = "//a[contains(text(),'RIMS Update')]")
	@CacheLookup
	private WebElement RIMSUpdate;
	
	@FindBy(xpath = "//a[contains(text(),'Family-wise Split Master')]")
	@CacheLookup
	private WebElement FamilywiseSplitMaster;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'MF Rate Card Delete')]")
	@CacheLookup
	private WebElement MFRateCardDelete;
	
	@FindBy(xpath = "//a[contains(text(),'Misc Caln')]")
	@CacheLookup
	private WebElement MiscCaln;
	
	@FindBy(xpath = "//a[contains(text(),'RIMS Txn Delete')]")
	@CacheLookup
	private WebElement RIMSTxnDelete;
	
	@FindBy(xpath = "//a[contains(text(),'RM Wise Rev Split(B)')]")
	@CacheLookup
	private WebElement RMWiseRevSplitB;
	
	public RIMSRimsUpdateBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void familywiseSplitMaster() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSUpdate);
		actions.moveToElement(RIMSUpdate).perform();

		WebDriverWaitFunctions.waitToLoadElement(FamilywiseSplitMaster);
		actions.moveToElement(FamilywiseSplitMaster).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FamilywiseSplitMaster = breadcrumb.getText();
		Assert.assertTrue(FamilywiseSplitMaster.contains(file.getBreadcrumb("FamilywiseSplitMaster")), "FamilywiseSplitMaster  not exits in breadcrumb");
		System.out.println(FamilywiseSplitMaster);
	}	
	
	public void mfRateCardDelete() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSUpdate);
		actions.moveToElement(RIMSUpdate).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRateCardDelete);
		actions.moveToElement(MFRateCardDelete).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFRateCardDelete = breadcrumb.getText();
		Assert.assertTrue(MFRateCardDelete.contains(file.getBreadcrumb("MFRateCardDelete")), "MFRateCardDelete  not exits in breadcrumb");
		System.out.println(MFRateCardDelete);
	}	
	
	public void miscCaln() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSUpdate);
		actions.moveToElement(RIMSUpdate).perform();

		WebDriverWaitFunctions.waitToLoadElement(MiscCaln);
		actions.moveToElement(MiscCaln).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MiscCaln = breadcrumb.getText();
		Assert.assertTrue(MiscCaln.contains(file.getBreadcrumb("MiscCaln")), " MiscCaln not exits in breadcrumb");
		System.out.println(MiscCaln);
	}	
	
	public void rimsTxnDelete() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSUpdate);
		actions.moveToElement(RIMSUpdate).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSTxnDelete);
		actions.moveToElement(RIMSTxnDelete).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RIMSTxnDelete = breadcrumb.getText();
		Assert.assertTrue(RIMSTxnDelete.contains(file.getBreadcrumb("RIMSTxnDelete")), " RIMSTxnDelete not exits in breadcrumb");
		System.out.println(RIMSTxnDelete);
	}	
	
	public void rmWiseRevSplitB() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSUpdate);
		actions.moveToElement(RIMSUpdate).perform();

		WebDriverWaitFunctions.waitToLoadElement(RMWiseRevSplitB);
		actions.moveToElement(RMWiseRevSplitB).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RMWiseRevSplitB = breadcrumb.getText();
		Assert.assertTrue(RMWiseRevSplitB.contains(file.getBreadcrumb("RMWiseRevSplitB")), " RMWiseRevSplitB not exits in breadcrumb");
		System.out.println(RMWiseRevSplitB);
	}	
		
}
