package com.rupeelog.manualTxnAdjPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class RerunEquitySplitBonusPage {

	WebDriver driver;
	FileReaderUtility file;
	Actions actions;
	Alert alert;

	@FindBy(xpath = "//*[text()='Admin']")
	@CacheLookup
	private WebElement adminMenu;

	@FindBy(xpath = "//a[contains(text(),'Manual Txn Adjustments')]")
	@CacheLookup
	private WebElement manualTxnAdjustments;

	@FindBy(xpath = "//a[contains(text(),'Rerun Equity Split Bonus')]")
	@CacheLookup
	private WebElement rerunEquitySplitBonus;
	
	//Run Split Bonus Process For a Particular Client
	@FindBy(xpath = "//input[@id='clientIdStr']")
	@CacheLookup
	private WebElement clientPortfolioNameAutoSuggSearch;

	@FindBy(xpath = "//input[@id='startDate1']")
	@CacheLookup
	private WebElement Clientdate;

	@FindBy(xpath = "//input[@id='btn1']")
	@CacheLookup
	private WebElement runClietnButton;
	
	//Run Split Bonus Process For a Particular Asset
	
	@FindBy(xpath = "//input[@id='assetEquityStr']")
	@CacheLookup
	private WebElement assetEquityAutoSuggSearch;
	
	@FindBy(xpath = "//input[@id='startDate2']")
	@CacheLookup
	private WebElement assetDate;

	@FindBy(xpath = "//input[@id='btn2']")
	@CacheLookup
	private WebElement runAssetButton;
	
	//Run Split Bonus Process For a Portfolio and Asset Combination
	
	@FindBy(xpath = "//input[@id='clientIdStr1']")
	@CacheLookup
	private WebElement combiPortfolioNameAutoSuggSearch;
	
	@FindBy(xpath = "//input[@id='assetEquityStr1']")
	@CacheLookup
	private WebElement combiAssetEquity;
	
	@FindBy(xpath = "//input[@id='startDate3']")
	@CacheLookup
	private WebElement CombinationDate;

	@FindBy(xpath = "//input[@id='btn3']")
	@CacheLookup
	private WebElement runCombinationButton;
	

	public RerunEquitySplitBonusPage(WebDriver driver) {
		this.driver = driver;
	}

	public void runSplitBonusParticularClient() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();

		WebDriverWaitFunctions.waitToLoadElement(manualTxnAdjustments);
		actions.moveToElement(manualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(rerunEquitySplitBonus);
		actions.moveToElement(rerunEquitySplitBonus).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(clientPortfolioNameAutoSuggSearch);
		clientPortfolioNameAutoSuggSearch
				.sendKeys(file.getAdminManualTxAdjustmentData("clientPortfolioNameAutoSuggSearch"));

		WebDriverWaitFunctions.waitToLoadAllElements(driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li")));
		List<WebElement> portfolioList = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));

		WebDriverWaitFunctions.waitToLoadAllElements(portfolioList);
		for (int i = 0; i < portfolioList.size(); i++) {
			if (portfolioList.get(i).getText()
					.equalsIgnoreCase(file.getAdminManualTxAdjustmentData("selectParticularClientPortfolio"))) {
				portfolioList.get(i).click();
			}
		}

		WebDriverWaitFunctions.waitToLoadElement(Clientdate);
		Clientdate.sendKeys(file.getAdminManualTxAdjustmentData("Clientdate"));

		WebDriverWaitFunctions.waitToLoadElement(runClietnButton);
		runClietnButton.click();
		try {
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			String alertText = alert.getText();
			Assert.assertTrue(alertText.contains("Please check the EOD Process dashboard for Process log"),
					"Failed to Run Split Bonus for Particular Asset");
			alert.accept();
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}

	public void runSplitBonusParticularAsset() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();

		WebDriverWaitFunctions.waitToLoadElement(manualTxnAdjustments);
		actions.moveToElement(manualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(rerunEquitySplitBonus);
		actions.moveToElement(rerunEquitySplitBonus).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(assetEquityAutoSuggSearch);
		assetEquityAutoSuggSearch
				.sendKeys(file.getAdminManualTxAdjustmentData("assetEquityAutoSuggSearch"));

		WebDriverWaitFunctions.waitToLoadAllElements(driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li")));
		List<WebElement> assetList = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		WebDriverWaitFunctions.waitToLoadAllElements(assetList);
		for (int i = 0; i < assetList.size(); i++) {
			if (assetList.get(i).getText()
					.equalsIgnoreCase(file.getAdminManualTxAdjustmentData("selectParticularAsset"))) {
				assetList.get(i).click();
			}
		}

		WebDriverWaitFunctions.waitToLoadElement(assetDate);
		assetDate.sendKeys(file.getAdminManualTxAdjustmentData("assetDate"));

		WebDriverWaitFunctions.waitToLoadElement(runAssetButton);
		runAssetButton.click();
		try {
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			String alertText = alert.getText();
			Assert.assertTrue(alertText.contains("Please check the EOD Process dashboard for Process log"),
					"Failed to Run Split Bonus for Particular Asset");
			alert.accept();
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}

	public void runSplitBonusBothPortfolioAsset() throws InterruptedException {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();

		WebDriverWaitFunctions.waitToLoadElement(manualTxnAdjustments);
		actions.moveToElement(manualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(rerunEquitySplitBonus);
		actions.moveToElement(rerunEquitySplitBonus).click().build().perform();
		
		//Note: conflict is creating for selection of Portfolio and Asset as both are Auto suggestion search fields
		
		WebDriverWaitFunctions.waitToLoadElement(combiPortfolioNameAutoSuggSearch);
		combiPortfolioNameAutoSuggSearch
				.sendKeys(file.getAdminManualTxAdjustmentData("clientPortfolioNameAutoSuggSearch"));
		
		WebDriverWaitFunctions.waitToLoadAllElements(driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li")));
		List<WebElement> portfolioList = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));

		for (int i = 0; i < portfolioList.size(); i++) {
			if (portfolioList.get(i).getText()
					.equalsIgnoreCase(file.getAdminManualTxAdjustmentData("selectParticularClientPortfolio"))) {
				portfolioList.get(i).click();
			}
		}
		Thread.sleep(2000);
		WebDriverWaitFunctions.waitToLoadElement(combiAssetEquity);
		combiAssetEquity
				.sendKeys(Keys.chord(file.getAdminManualTxAdjustmentData("assetEquityAutoSuggSearch")));
		//WebDriverWaitFunctions.waitToLoadAllElements(driver.findElements(
			//	By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li")));
		List<WebElement> assetList = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		for (int i = 0; i < assetList.size(); i++) {
			if (assetList.get(i).getText()
					.equalsIgnoreCase(file.getAdminManualTxAdjustmentData("selectParticularAsset"))) {
				assetList.get(i).click();
			}
		}
		Thread.sleep(2000);
		WebDriverWaitFunctions.waitToLoadElement(CombinationDate);
		CombinationDate.sendKeys(file.getAdminManualTxAdjustmentData("assetDate"));
		
		/*
		//Duplicate repeated code
		WebDriverWaitFunctions.waitToLoadElement(combiAssetEquity);
		combiAssetEquity.clear();
		combiAssetEquity
				.sendKeys(file.getAdminManualTxAdjustmentData("assetEquityAutoSuggSearch"));

		List<WebElement> assetList1 = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		for (int i = 0; i < assetList1.size(); i++) {
			if (assetList1.get(i).getText()
					.equalsIgnoreCase(file.getAdminManualTxAdjustmentData("selectParticularAsset"))) {
				assetList1.get(i).click();
			}
		}
		
		*/

		WebDriverWaitFunctions.waitToLoadElement(runCombinationButton);
		runCombinationButton.click();
		try {
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert message: "+alert.getText());
			alert.accept();
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}

}
