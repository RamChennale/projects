package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class MasterMutualFundBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Master']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[contains(text(),'Mutual Fund')]")
	@CacheLookup
	private WebElement MutualFund;

	@FindBy(xpath = "//a[contains(text(),'Asset Management Company')]")
	@CacheLookup
	private WebElement AssetManagementCompany;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;

	@FindBy(xpath = "//a[contains(text(),'MF Classification')]")
	@CacheLookup
	private WebElement MFClassification;

	@FindBy(xpath = "//a[contains(text(),'MF Fund Manager')]")
	@CacheLookup
	private WebElement MFFundManager;

	@FindBy(xpath = "//a[contains(text(),'Registrar(RTA)')]")
	@CacheLookup
	private WebElement RegistrarRTA;

	@FindBy(xpath = "//a[contains(text(),'RTA Txn Type Mapping')]")
	@CacheLookup
	private WebElement RTATxnTypeMapping;

	public MasterMutualFundBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void assetManagementCompany() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(AssetManagementCompany);
		actions.moveToElement(AssetManagementCompany).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String AssetManagementCompany = breadcrumb.getText();
		Assert.assertTrue(AssetManagementCompany.contains(file.getBreadcrumb("AssetManagementCompany")), "Asset Management Company name not exits in breadcrumb");
		System.out.println(AssetManagementCompany);
	}

	public void mfClassification() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFClassification);
		actions.moveToElement(MFClassification).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFClassification = breadcrumb.getText();
		Assert.assertTrue(MFClassification.contains(file.getBreadcrumb("MFClassification")), "MF Classification name not exits in breadcrumb");
		System.out.println(MFClassification);
	}

	public void mfFundManager() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFFundManager);
		actions.moveToElement(MFFundManager).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFFundManager = breadcrumb.getText();
		Assert.assertTrue(MFFundManager.contains(file.getBreadcrumb("MFFundManager")), "MF FundManager name not exits in breadcrumb");
		System.out.println(MFFundManager);
	}

	public void registrarRTA() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(RegistrarRTA);
		actions.moveToElement(RegistrarRTA).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RegistrarRTA = breadcrumb.getText();
		Assert.assertTrue(RegistrarRTA.contains(file.getBreadcrumb("RegistrarRTA")), "Registrar RTA name not exits in breadcrumb");
		System.out.println(RegistrarRTA);
	}

	public void rtaTxnTypeMapping() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(RTATxnTypeMapping);
		actions.moveToElement(RTATxnTypeMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RTATxnTypeMapping = breadcrumb.getText();
		Assert.assertTrue(RTATxnTypeMapping.contains(file.getBreadcrumb("RTATxnTypeMapping")), "RTA Txn Type Mapping name not exits in breadcrumb");
		System.out.println(RTATxnTypeMapping);
	}

}
