package com.rupeelog.manualTxnAdjPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class EquityDividendPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;

	@FindBy(linkText = "Manual Txn Adjustments")
	@CacheLookup
	private WebElement ManualTxnAdjustments;

	@FindBy(linkText = "Rerun Equity dividend")
	@CacheLookup
	private WebElement RerunEquitydividend;

	By overlay = By.cssSelector("#loader");

	// client Test
	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement edPfolioAutoSuggclient;

	@FindBy(id = "startDate1")
	@CacheLookup
	private WebElement edStartDate1client;

	@FindBy(id = "btn1")
	@CacheLookup
	private WebElement runBtnEDClient;

	// Equity Test
	@FindBy(id = "assetEquityStr")
	@CacheLookup
	private WebElement edEquityAutoSugg;

	@FindBy(id = "startDate2")
	@CacheLookup
	private WebElement edEquityStartDate2;

	@FindBy(id = "btn2")
	@CacheLookup
	private WebElement runBtnEDEquity;

	// Run Client Equity Test

	@FindBy(id = "clientIdStr1")
	@CacheLookup
	private WebElement edCEpFolioAutoSugg;

	@FindBy(id = "assetEquityStr1")
	@CacheLookup
	private WebElement edCEequityAutoSugg;

	@FindBy(id = "startDate3")
	@CacheLookup
	private WebElement edCEStartDate3;

	@FindBy(id = "btn2")
	@CacheLookup
	private WebElement runBtnEDCE3;

	public EquityDividendPage(WebDriver driver) {
		this.driver = driver;
	}

	public void manualTxnAdjEDClientTest() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		ElementWait.isElementVisible(RerunEquitydividend);
		actions.moveToElement(RerunEquitydividend).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(edPfolioAutoSuggclient);
		edPfolioAutoSuggclient.sendKeys(file.getAdminTestData("edPfolioAutoSuggclient"));

		List<WebElement> portfoliolist = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));

		for (int i = 0; i < portfoliolist.size(); i++) {
			if (portfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectedPfolioAutoSuggclient")))
				;
			System.out.println(portfoliolist.get(i).getText());
			portfoliolist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(edStartDate1client);
		edStartDate1client.sendKeys(file.getAdminTestData("edStartDate1client"));

		ElementWait.isElementVisible(runBtnEDClient);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver, runBtnEDClient);

		try {
			alert = driver.switchTo().alert();
			System.out.println("Equity Devident for sigle client   : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}

	public void manualTxnAdjEQDEquityTest() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		ElementWait.isElementVisible(RerunEquitydividend);
		actions.moveToElement(RerunEquitydividend).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(edEquityAutoSugg);
		edEquityAutoSugg.sendKeys(file.getAdminTestData("edEquityAutoSugg"));

		List<WebElement> eqlist = driver.findElements(By.xpath("//ul[@id='ui-id-3']//li"));

		for (int i = 0; i < eqlist.size(); i++) {
			if (eqlist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectedEquityAutoSugg")))
				;
			System.out.println(eqlist.get(i).getText());
			eqlist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(edEquityStartDate2);
		edEquityStartDate2.sendKeys(file.getAdminTestData("edEquityStartDate2"));

		ElementWait.isElementVisible(runBtnEDEquity);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver, runBtnEDEquity);

		try {
			alert = driver.switchTo().alert();
			System.out.println(" Equity Dividend Equity  : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}

	public void manualTxnAdjEQDClientEquityTest() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		ElementWait.isElementVisible(RerunEquitydividend);
		actions.moveToElement(RerunEquitydividend).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(edCEpFolioAutoSugg);
		edCEpFolioAutoSugg.sendKeys(file.getAdminTestData("edCEpFolioAutoSugg"));

		List<WebElement> portfoliolist = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));

		for (int i = 0; i < portfoliolist.size(); i++) {
			if (portfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectedCEpFolioAutoSugg")))
				;
			System.out.println(portfoliolist.get(i).getText());
			portfoliolist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(edCEStartDate3);
		edCEStartDate3.sendKeys(file.getAdminTestData("edCEStartDate3"));
		
		ElementWait.isElementVisible(edCEequityAutoSugg);
		edCEequityAutoSugg.sendKeys(file.getAdminTestData("edCEequityAutoSugg"));

		List<WebElement> eqlist = driver.findElements(By.xpath("//ul[@id='ui-id-4']//li"));

		for (int i = 0; i < eqlist.size(); i++) {
			if (eqlist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectedCEequityAutoSugg")))
				;
			System.out.println(eqlist.get(i).getText());
			eqlist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(runBtnEDCE3);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver, runBtnEDCE3);

		try {
			alert = driver.switchTo().alert();
			System.out.println(" Equity Dividend Client Equity  : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
