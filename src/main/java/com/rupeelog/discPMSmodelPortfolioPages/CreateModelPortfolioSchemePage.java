package com.rupeelog.discPMSmodelPortfolioPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class CreateModelPortfolioSchemePage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Disc PMS")
	@CacheLookup
	private WebElement DiscPMS;

	@FindBy(linkText = "Model Portfolio")
	@CacheLookup
	private WebElement ModelPortfolio;

	@FindBy(linkText = "Model Portfolio Scheme")
	@CacheLookup
	private WebElement ModelPortfolioScheme;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "name")
	@CacheLookup
	private WebElement mpsName;

	@FindBy(id = "code")
	@CacheLookup
	private WebElement mpsCode;

	@FindBy(id = "orgnId")
	@CacheLookup
	private WebElement mpsOrgnDD;

	@FindBy(id = "risks")
	@CacheLookup
	private WebElement mpsRisksDD;

	@FindBy(id = "status")
	@CacheLookup
	private WebElement mpsStatusDD;

	@FindBy(id = "benchmark")
	@CacheLookup
	private WebElement mpsBenchmarkDD;

	@FindBy(id = "basis")
	@CacheLookup
	private WebElement mpsBasis;

	@FindBy(id = "CustodyProvider")
	@CacheLookup
	private WebElement mpsCustodyProviderDD;

	@FindBy(id = "custodyCode")
	@CacheLookup
	private WebElement mpsCustodyCode;

	@FindBy(id = "contingencyCash")
	@CacheLookup
	private WebElement mpsContingencyCash;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement mpsStartDate;

	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement mpsEndDate;

	@FindBy(id = "description")
	@CacheLookup
	private WebElement mpsDescription;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement mpsAmount;

	@FindBy(id = "isMfRegularAllow")
	@CacheLookup
	private WebElement mpsIsMfRegularAllowDD;

	@FindBy(id = "isUnlistedEqAllow")
	@CacheLookup
	private WebElement mpsIsUnlistedEqAllowDD;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateModelPortfolioSchemePage(WebDriver driver) {
		this.driver = driver;
	}

	public void createModelPortfolioScheme() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(ModelPortfolio);
		actions.moveToElement(ModelPortfolio).perform();

		ElementWait.isElementVisible(ModelPortfolioScheme);
		actions.moveToElement(ModelPortfolioScheme).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		createBtn.click();

		ElementWait.isElementVisible(mpsName);
		mpsName.sendKeys(file.getDiscPMSTestData("mpsName"));

		ElementWait.isElementVisible(mpsCode);
		mpsCode.sendKeys(file.getDiscPMSTestData("mpsCode"));

		ElementWait.isElementVisible(mpsOrgnDD);
		Select selectmpsOrgnDD= new Select(mpsOrgnDD);
		selectmpsOrgnDD.selectByVisibleText(file.getDiscPMSTestData("mpsOrgnDD"));

		ElementWait.isElementVisible(mpsRisksDD);
		Select selectmpsRisksDD= new Select(mpsRisksDD);
		selectmpsRisksDD.selectByVisibleText(file.getDiscPMSTestData("mpsRisksDD"));
		
		ElementWait.isElementVisible(mpsStatusDD);
		Select selectmpsStatusDD= new Select(mpsStatusDD);
		selectmpsStatusDD.selectByVisibleText(file.getDiscPMSTestData("mpsStatusDD"));

		ElementWait.isElementVisible(mpsBenchmarkDD);
		Select selectmpsBenchmarkDD= new Select(mpsBenchmarkDD);
		selectmpsBenchmarkDD.selectByVisibleText(file.getDiscPMSTestData("mpsBenchmarkDD"));

		//ElementWait.isElementVisible(mpsBasis);
		//mpsBasis.sendKeys(file.getDiscPMSTestData("mpsBasis"));
		
		ElementWait.isElementVisible(mpsCustodyProviderDD);
		Select selectmpsCustodyProviderDD= new Select(mpsCustodyProviderDD);
		selectmpsCustodyProviderDD.selectByVisibleText(file.getDiscPMSTestData("mpsCustodyProviderDD"));

		ElementWait.isElementVisible(mpsCustodyCode);
		mpsCustodyCode.sendKeys(file.getDiscPMSTestData("mpsCustodyCode"));

		ElementWait.isElementVisible(mpsContingencyCash);
		mpsContingencyCash.sendKeys(file.getDiscPMSTestData("mpsContingencyCash"));

		ElementWait.isElementVisible(mpsStartDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver,mpsStartDate ,
				file.getDiscPMSTestData("mpsStartDate"));

		ElementWait.isElementVisible(mpsEndDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver,mpsEndDate ,
				file.getDiscPMSTestData("mpsEndDate"));
		
		ElementWait.isElementVisible(mpsDescription);
		mpsDescription.sendKeys(file.getDiscPMSTestData("mpsDescription"));
		
		ElementWait.isElementVisible(mpsAmount);
		mpsAmount.sendKeys(file.getDiscPMSTestData("mpsAmount"));

		ElementWait.isElementVisible(mpsIsMfRegularAllowDD);
		Select selectmpsIsMfRegularAllowDD= new Select(mpsIsMfRegularAllowDD);
		selectmpsIsMfRegularAllowDD.selectByVisibleText(file.getDiscPMSTestData("mpsIsMfRegularAllowDD"));

		ElementWait.isElementVisible(mpsIsUnlistedEqAllowDD);
		Select selectmpsIsUnlistedEqAllowDD= new Select(mpsIsUnlistedEqAllowDD);
		selectmpsIsUnlistedEqAllowDD.selectByVisibleText(file.getDiscPMSTestData("mpsIsUnlistedEqAllowDD"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
