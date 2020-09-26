package com.qa.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TestDemoUtility {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//*[text()='Admin']")
	@CacheLookup
	private WebElement adminMenu;

	@FindBy(xpath = "//*[text()='Client-On-Boarding']")
	@CacheLookup
	private WebElement clientSubMenu;

	@FindBy(xpath = "//*[text()='KYPH']")
	@CacheLookup
	private WebElement kyph;

	@FindBy(xpath = "//input[@id='createFcp']")
	@CacheLookup
	private WebElement createKyphFCPButton;

	// specific
	@FindBy(xpath = "//span[contains(text(),'Specific')]")
	@CacheLookup
	private WebElement specific;

	@FindBy(xpath = "//select[@id='specific_salutation']")
	@CacheLookup
	private WebElement salutationDD;

	@FindBy(xpath = "//select[@id='spec_riskProfileId']")
	@CacheLookup
	private WebElement riskProfileInvestPlcyDD;

	@FindBy(xpath = "//select[@id='pmlaRiskId']")
	@CacheLookup
	private WebElement riskProfilePMLAplcyDD;

	@FindBy(xpath = "//select[@id='specific_clientHA']")
	@CacheLookup
	private WebElement doseClientAssetOthrIADD;


	// KRA status
	@FindBy(xpath = "//select[@id='specific_cdsl']")
	@CacheLookup
	private WebElement cdslDD;

	@FindBy(xpath = "//select[@id='specific_nsdl']")
	@CacheLookup
	private WebElement nsdlDD;

	@FindBy(xpath = "//select[@id='specific_dotex']")
	@CacheLookup
	private WebElement dotexDD;

	@FindBy(xpath = "//select[@id='specific_cams']")
	@CacheLookup
	private WebElement camsDD;

	@FindBy(xpath = "//select[@id='specific_karvy']")
	@CacheLookup
	private WebElement karvyDD;

	@FindBy(xpath = "//input[@id='specific_annivDate']")
	@CacheLookup
	private WebElement annivDate;

	@FindBy(xpath = "//input[@id='specific_spouseDob']")
	@CacheLookup
	private WebElement dobSpouseDate;

	@FindBy(xpath = "//select[@id='specific_defaultAdd']")
	@CacheLookup
	private WebElement defaultAddDD;

	@FindBy(xpath = "//input[@id='commenceDate']")
	@CacheLookup
	private WebElement commenceDate;

	@FindBy(xpath = "//input[@id='specific_uid']")
	@CacheLookup
	private WebElement uid;

	TestDemoUtility(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void test() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		WaitToLoadElement.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();
		WaitToLoadElement.waitToLoadElement(clientSubMenu);
		actions.moveToElement(clientSubMenu).perform();
		WaitToLoadElement.waitToLoadElement(kyph);
		actions.moveToElement(kyph).click().build().perform();
		ScrollPageToFindElement.findElementByPageScrolling(driver, createKyphFCPButton);
		WaitToLoadElement.waitToLoadElement(createKyphFCPButton);
		createKyphFCPButton.click();

		WaitToLoadElement.waitToLoadElement(specific);
		specific.click();
		
		WaitToLoadElement.waitToLoadElement(salutationDD);
		Select salutationDDSL = new Select(salutationDD);
		salutationDDSL.selectByVisibleText(file.getAdminCOBTestData("salutation"));

		WaitToLoadElement.waitToLoadElement(riskProfileInvestPlcyDD);
		Select riskProfileInvestPlcyDDSL = new Select(riskProfileInvestPlcyDD);
		riskProfileInvestPlcyDDSL.selectByVisibleText(file.getAdminCOBTestData("riskProfInvetPlcy"));

		WaitToLoadElement.waitToLoadElement(riskProfilePMLAplcyDD);
		Select riskProfilePMLAplcyDDSL = new Select(riskProfilePMLAplcyDD);
		riskProfilePMLAplcyDDSL.selectByVisibleText(file.getAdminCOBTestData("riskProfPMLAPlcy"));

		WaitToLoadElement.waitToLoadElement(doseClientAssetOthrIADD);
		Select doseClientAssetOthrIADDSL = new Select(doseClientAssetOthrIADD);
		doseClientAssetOthrIADDSL.selectByVisibleText(file.getAdminCOBTestData("doeCltHavAsset"));

		// KRA
		WaitToLoadElement.waitToLoadElement(cdslDD);
		Select cdslDDSL = new Select(cdslDD);
		cdslDDSL.selectByVisibleText(file.getAdminCOBTestData("cdsl"));

		WaitToLoadElement.waitToLoadElement(nsdlDD);
		Select nsdlDDSL = new Select(nsdlDD);
		nsdlDDSL.selectByVisibleText(file.getAdminCOBTestData("nsdl"));

		WaitToLoadElement.waitToLoadElement(dotexDD);
		Select dotexDDSL = new Select(dotexDD);
		dotexDDSL.selectByVisibleText(file.getAdminCOBTestData("dotex"));

		WaitToLoadElement.waitToLoadElement(camsDD);
		Select camsDDSL = new Select(camsDD);
		camsDDSL.selectByVisibleText(file.getAdminCOBTestData("cams"));

		WaitToLoadElement.waitToLoadElement(karvyDD);
		Select karvyDDSL = new Select(karvyDD);
		karvyDDSL.selectByVisibleText(file.getAdminCOBTestData("karvya"));

		WaitToLoadElement.waitToLoadElement(annivDate);
		annivDate.sendKeys(file.getAdminCOBTestData("annivDate"));

		WaitToLoadElement.waitToLoadElement(dobSpouseDate);
		dobSpouseDate.sendKeys(file.getAdminCOBTestData("dobSpouse"));

		WaitToLoadElement.waitToLoadElement(defaultAddDD);
		Select defaultAddDDSL = new Select(defaultAddDD);
		defaultAddDDSL.selectByVisibleText(file.getAdminCOBTestData("defAdr"));

		WaitToLoadElement.waitToLoadElement(commenceDate);

		commenceDate.sendKeys(file.getAdminCOBTestData("dateCommen"));

		WaitToLoadElement.waitToLoadElement(uid);
		uid.sendKeys(file.getAdminCOBTestData("uid"));

	}
	
	public void linuxTest() {
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setHeadless(true);
		
		System.setProperty("webdriver.chrome.driver", "./browser/chromedriver");
		driver = new ChromeDriver(chromeOptions);
	}
}
