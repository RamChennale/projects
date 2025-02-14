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

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateCorpusStockInEquityPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Accounting")
	@CacheLookup
	private WebElement AccountingMenu;

	@FindBy(linkText = "Corpus Stock In-Out")
	@CacheLookup
	private WebElement CorpusStockInOut;

	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/a[2]")
	@CacheLookup
	private WebElement selectStockInDD;

	@FindBy(linkText = "Corpus-In Stock Equity")
	@CacheLookup
	private WebElement CorpusInStockEquity;

	@FindBy(xpath = "//iframe[contains(text(),'</div>')]")
	@CacheLookup
	private WebElement createCorpusInStockEQiFrame;
	
	

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement cInSEQClientAcPortfAutoSugg;

	@FindBy(id = "targetDematId")
	@CacheLookup
	private WebElement cInSEQTargetDematDD;

	@FindBy(id = "sourceDematId")
	@CacheLookup
	private WebElement cInSEQSourceDemat;

	@FindBy(id = "assetIdStr")
	@CacheLookup
	private WebElement cInSEQScripNameAutoSugg;

	@FindBy(id = "quantity")
	@CacheLookup
	private WebElement cInSEQQuantity;

	@FindBy(id = "voucherDate")
	@CacheLookup
	private WebElement cInSEQReceiptDate;

	@FindBy(id = "price")
	@CacheLookup
	private WebElement cInSEQRate;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateCorpusStockInEquityPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createCorpusStockInReceiptEQ() {
		file = new FileReaderUtility();
		actions = new Actions(driver);
		
		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(CorpusStockInOut);
		actions.moveToElement(CorpusStockInOut).click().build().perform();

		ElementWait.isElementVisible(selectStockInDD);
		selectStockInDD.click();

		ElementWait.isElementVisible(CorpusInStockEquity);
		CorpusInStockEquity.click();

		// Switching to the i frame
		ElementWait.isElementVisible(createCorpusInStockEQiFrame);
		driver.switchTo().frame(createCorpusInStockEQiFrame);
		
		ElementWait.isElementVisible(cInSEQClientAcPortfAutoSugg);
		cInSEQClientAcPortfAutoSugg.sendKeys(file.getAccountingTestData("cInSEQClientAcPortfAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectcInSEQClientAcPortfAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(cInSEQTargetDematDD);
		Select selectcInSEQTargetDematDD = new Select(cInSEQTargetDematDD);
		selectcInSEQTargetDematDD.selectByVisibleText(file.getAccountingTestData("cInSEQTargetDematDD"));

		ElementWait.isElementVisible(cInSEQSourceDemat);
		Select selectcInSEQSourceDemat = new Select(cInSEQSourceDemat);
		selectcInSEQSourceDemat.selectByVisibleText(file.getAccountingTestData("cInSEQSourceDemat"));
		
		ElementWait.isElementVisible(cInSEQScripNameAutoSugg);
		cInSEQScripNameAutoSugg.sendKeys(file.getAccountingTestData("cInSEQScripNameAutoSugg"));

		List<WebElement> scripNameList = driver.findElements(
				By.xpath("//ul[@id='ui-id-2']//li"));
		for (int i = 0; i < scripNameList.size(); i++) {
			if (scripNameList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectcInSEQScripNameAutoSugg"))) {
				scripNameList.get(i).click();
				break;
			}
		}
		
		ElementWait.isElementVisible(cInSEQQuantity);
		cInSEQQuantity.sendKeys(file.getAccountingTestData("cInSEQQuantity"));

		ElementWait.isElementVisible(cInSEQReceiptDate);
		cInSEQReceiptDate.sendKeys(file.getAccountingTestData("cInSEQReceiptDate"));
		
		ElementWait.isElementVisible(cInSEQRate);
		cInSEQRate.sendKeys(file.getAccountingTestData("cInSEQRate"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message Corpus Stock In Receipt Equity : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
