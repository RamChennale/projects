package com.rupeelog.accountingPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WaitToLoadElement;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class CorpusCash_In_OutPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(xpath = "//*[text()='Accounting']")
	@CacheLookup
	private WebElement AccountingMenu;

	@FindBy(xpath = "//a[contains(text(),'Corpus Cash In-Out')]")
	@CacheLookup
	private WebElement corpusCashInOut;

	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/a[2]")
	@CacheLookup
	private WebElement selectTypeOfCorpus;

	@FindBy(xpath = "//a[@id='createCorpusIn']")
	@CacheLookup
	private WebElement createCorpusIn;

	@FindBy(xpath = "//div[@id='modalWindowCCV']//iframe")
	@CacheLookup
	private WebElement createCorpusIniFrame;

	@FindBy(xpath = "//input[@name='clientIdStr']")
	@CacheLookup
	private WebElement clientAccountPortfolioAutoSuggSearch;

	@FindBy(xpath = "//select[@id='sourceBankId']")
	@CacheLookup
	private WebElement sourceBankDD;

	@FindBy(xpath = "//input[@id='amount']")
	@CacheLookup
	private WebElement amount;

	@FindBy(xpath = "//select[@id='bankId']")
	@CacheLookup
	private WebElement targetBankDD;

	@FindBy(xpath = "//select[@id='instrumentType']")
	@CacheLookup
	private WebElement instrumentType;

	@FindBy(xpath = "//input[@id='referenceNo']")
	@CacheLookup
	private WebElement referenceNo;

	@FindBy(xpath = "//input[@id='voucherDate']")
	@CacheLookup
	private WebElement instrumentDated;

	@FindBy(xpath = "//textarea[@id='code']")
	@CacheLookup
	private WebElement narrationRemarks;

	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement save;
	
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancelButton;

	//Create Corpus Out Cash
	@FindBy(xpath = "//a[@id='createCorpusOut']")
	@CacheLookup
	private WebElement createCorpusOut;
	
	@FindBy(xpath = "//select[@id='targetBankId']")
	@CacheLookup
	private WebElement targetBankIdDDInOutCash;
	

	public CorpusCash_In_OutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void corpus_InCash() {
		file = new FileReaderUtility();
		actions = new Actions(driver);
		
		WaitToLoadElement.waitToLoadElement(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		WaitToLoadElement.waitToLoadElement(corpusCashInOut);
		actions.moveToElement(corpusCashInOut).click().build().perform();

		WaitToLoadElement.waitToLoadElement(selectTypeOfCorpus);
		selectTypeOfCorpus.click();

		WaitToLoadElement.waitToLoadElement(createCorpusIn);
		createCorpusIn.click();

		// Switching to the i frame
		WaitToLoadElement.waitToLoadElement(createCorpusIniFrame);
		driver.switchTo().frame(createCorpusIniFrame);

		WaitToLoadElement.waitToLoadElement(clientAccountPortfolioAutoSuggSearch);
		clientAccountPortfolioAutoSuggSearch
				.sendKeys(file.getAccountingTestData("clientAccountPortfolioAutoSuggSearch"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		//WaitToLoadElement.waitToLoadAllElements(clientPortfolioWebElementList);
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectClientAccountPortfolio"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		WaitToLoadElement.waitToLoadElement(sourceBankDD);
		Select sourceBankDDSL = new Select(sourceBankDD);
		sourceBankDDSL.selectByVisibleText(file.getAccountingTestData("sourceBankDD"));

		WaitToLoadElement.waitToLoadElement(amount);
		amount.sendKeys(file.getAccountingTestData("amount"));

		WaitToLoadElement.waitToLoadElement(targetBankDD);
		Select targetBankDDSL = new Select(targetBankDD);
		targetBankDDSL.selectByVisibleText(file.getAccountingTestData("targetBankDD"));

		WaitToLoadElement.waitToLoadElement(instrumentType);
		Select instrumentTypeSL = new Select(instrumentType);
		instrumentTypeSL.selectByVisibleText(file.getAccountingTestData("instrumentType"));

		WaitToLoadElement.waitToLoadElement(referenceNo);
		referenceNo.sendKeys(file.getAccountingTestData("referenceNo"));

		WaitToLoadElement.waitToLoadElement(instrumentDated);
		instrumentDated.sendKeys(file.getAccountingTestData("instrumentDated"));

		WaitToLoadElement.waitToLoadElement(narrationRemarks);
		narrationRemarks.sendKeys(file.getAccountingTestData("narrationRemarks"));

		WaitToLoadElement.waitToLoadElement(save);
		save.click();
		
		try {
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			//Assert.assertEquals(alert.getText(), expectedAlertText, "Failed to create corpus In Cash");
			System.out.println("Alert Message: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}

	public void corpus_OutCash() {

		file = new FileReaderUtility();
		actions = new Actions(driver);
		WaitToLoadElement.waitToLoadElement(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		WaitToLoadElement.waitToLoadElement(corpusCashInOut);
		actions.moveToElement(corpusCashInOut).click().build().perform();

		WaitToLoadElement.waitToLoadElement(selectTypeOfCorpus);
		selectTypeOfCorpus.click();

		WaitToLoadElement.waitToLoadElement(createCorpusOut);
		createCorpusOut.click();

		// Switching to the i frame
		WaitToLoadElement.waitToLoadElement(createCorpusIniFrame);
		driver.switchTo().frame(createCorpusIniFrame);

		WaitToLoadElement.waitToLoadElement(clientAccountPortfolioAutoSuggSearch);
		clientAccountPortfolioAutoSuggSearch
				.sendKeys(file.getAccountingTestData("outCashclientAccountPortfolioAutoSuggSearch"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		//WaitToLoadElement.waitToLoadAllElements(clientPortfolioWebElementList);
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("outCashselectClientAccountPortfolio"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		WaitToLoadElement.waitToLoadElement(sourceBankDD);
		Select sourceBankDDSL = new Select(sourceBankDD);
		sourceBankDDSL.selectByVisibleText(file.getAccountingTestData("outCashsourceBankDD"));

		WaitToLoadElement.waitToLoadElement(amount);
		amount.sendKeys(file.getAccountingTestData("outCashamount"));

		WaitToLoadElement.waitToLoadElement(targetBankIdDDInOutCash);
		Select targetBankDDSL = new Select(targetBankIdDDInOutCash);
		targetBankDDSL.selectByVisibleText(file.getAccountingTestData("outCashtargetBankDD"));

		WaitToLoadElement.waitToLoadElement(instrumentType);
		Select instrumentTypeSL = new Select(instrumentType);
		instrumentTypeSL.selectByVisibleText(file.getAccountingTestData("outCashinstrumentType"));

		WaitToLoadElement.waitToLoadElement(referenceNo);
		referenceNo.sendKeys(file.getAccountingTestData("outCashreferenceNo"));

		WaitToLoadElement.waitToLoadElement(instrumentDated);
		instrumentDated.sendKeys(file.getAccountingTestData("outCashinstrumentDated"));

		WaitToLoadElement.waitToLoadElement(narrationRemarks);
		narrationRemarks.sendKeys(file.getAccountingTestData("outCashnarrationRemarks"));

		WaitToLoadElement.waitToLoadElement(save);
		save.click();
		try {
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
		
		/*
		 * WebDriverWaitFunctions.waitToLoadElement(cancelButton); cancelButton.click();
		 */
	}
}
