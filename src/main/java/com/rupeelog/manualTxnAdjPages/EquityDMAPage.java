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

public class EquityDMAPage {

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

	@FindBy(linkText = "Rerun Equity DMA")
	@CacheLookup
	private WebElement RerunEquityDMA;

	By overlay = By.cssSelector("#loader");

	//Equity DMA Run client Test
	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement eqDMAPfolioAutoSuggclient;

	@FindBy(id = "startDate1")
	@CacheLookup
	private WebElement eqDMAStartDate1client;

	@FindBy(id = "btn1")
	@CacheLookup
	private WebElement runBtneqDMAClient;

	//Equity DMA Run Equity Test
	@FindBy(id = "assetEquityStr")
	@CacheLookup
	private WebElement eqDMAEquityAutoSugg;

	@FindBy(id = "startDate2")
	@CacheLookup
	private WebElement eqDMAEquityStartDate2;

	@FindBy(id = "btn2")
	@CacheLookup
	private WebElement runBtneqDMAEquity;

	//Equity DMA Run Client Equity Test

	@FindBy(id = "clientIdStr1")
	@CacheLookup
	private WebElement eqDMACEpFolioAutoSugg;

	@FindBy(id = "assetEquityStr1")
	@CacheLookup
	private WebElement eqDMACEequityAutoSugg;

	@FindBy(id = "startDate3")
	@CacheLookup
	private WebElement eqDMACEStartDate3;

	@FindBy(id = "btn2")
	@CacheLookup
	private WebElement runBtneqDMACE3;

	public EquityDMAPage(WebDriver driver) {
		this.driver = driver;
	}

	public void manualTxnAdjEQDMAClientTest() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		ElementWait.isElementVisible(RerunEquityDMA);
		actions.moveToElement(RerunEquityDMA).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(eqDMAPfolioAutoSuggclient);
		eqDMAPfolioAutoSuggclient.sendKeys(file.getAdminTestData("eqDMAPfolioAutoSuggclient"));

		List<WebElement> portfoliolist = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));

		for (int i = 0; i < portfoliolist.size(); i++) {
			if (portfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selecteqDMAPfolioAutoSuggclient")))
				;
			System.out.println(portfoliolist.get(i).getText());
			portfoliolist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(eqDMAStartDate1client);
		eqDMAStartDate1client.sendKeys(file.getAdminTestData("eqDMAStartDate1client"));

		ElementWait.isElementVisible(runBtneqDMAClient);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver, runBtneqDMAClient);

		try {
			alert = driver.switchTo().alert();
			System.out.println("Equity DMA sigle client   : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}

	public void manualTxnAdjEQDMAAssetEquityTest() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		ElementWait.isElementVisible(RerunEquityDMA);
		actions.moveToElement(RerunEquityDMA).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(eqDMAEquityAutoSugg);
		eqDMAEquityAutoSugg.sendKeys(file.getAdminTestData("eqDMAEquityAutoSugg"));

		List<WebElement> eqlist = driver.findElements(By.xpath("//ul[@id='ui-id-3']//li"));

		for (int i = 0; i < eqlist.size(); i++) {
			if (eqlist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selecteqDMAEquityAutoSugg")))
				;
			System.out.println(eqlist.get(i).getText());
			eqlist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(eqDMAEquityStartDate2);
		eqDMAEquityStartDate2.sendKeys(file.getAdminTestData("eqDMAEquityStartDate2"));

		ElementWait.isElementVisible(runBtneqDMAEquity);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver, runBtneqDMAEquity);

		try {
			alert = driver.switchTo().alert();
			System.out.println(" Equity DMA Run Equity  : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}

	public void manualTxnAdjEQDMAClientAssetEquityTest() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		ElementWait.isElementVisible(RerunEquityDMA);
		actions.moveToElement(RerunEquityDMA).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, runBtneqDMACE3);

		ElementWait.isElementVisible(eqDMACEpFolioAutoSugg);
		eqDMACEpFolioAutoSugg.sendKeys(file.getAdminTestData("eqDMACEpFolioAutoSugg"));

		List<WebElement> portfoliolist = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));

		for (int i = 0; i < portfoliolist.size(); i++) {
			if (portfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectedCEpFolioAutoSugg")))
				;
			System.out.println(portfoliolist.get(i).getText());
			portfoliolist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(eqDMACEStartDate3);
		eqDMACEStartDate3.sendKeys(file.getAdminTestData("eqDMACEStartDate3"));
		
		ElementWait.isElementVisible(eqDMACEequityAutoSugg);
		eqDMACEequityAutoSugg.sendKeys(file.getAdminTestData("eqDMACEequityAutoSugg"));

		List<WebElement> eqlist = driver.findElements(By.xpath("//ul[@id='ui-id-4']//li"));

		for (int i = 0; i < eqlist.size(); i++) {
			if (eqlist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selecteqDMACEequityAutoSugg")))
				;
			System.out.println(eqlist.get(i).getText());
			eqlist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(runBtneqDMACE3);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver, runBtneqDMACE3);

		try {
			alert = driver.switchTo().alert();
			System.out.println(" Equity DMA Client Equity  : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
