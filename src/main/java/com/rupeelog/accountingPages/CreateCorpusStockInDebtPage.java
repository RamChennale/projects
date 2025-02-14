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

public class CreateCorpusStockInDebtPage {

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

	@FindBy(linkText = "Corpus-In Stock Debt")
	@CacheLookup
	private WebElement CorpusInStockDebt;

	@FindBy(xpath = "//iframe[contains(text(),'</div>')]")
	@CacheLookup
	private WebElement createCorpusInStockDebtiFrame;
	
	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement cInSDebtClientAcPortfAutoSugg;

	@FindBy(id = "targetDematId")
	@CacheLookup
	private WebElement cInSDebtTargetDematDD;

	@FindBy(id = "sourceDematId")
	@CacheLookup
	private WebElement cInSDebtSourceDematDD;

	@FindBy(id = "issuerId")
	@CacheLookup
	private WebElement cInSDebtIssuerDD;

	@FindBy(id = "assetId")
	@CacheLookup
	private WebElement cInSDebtInstruDD;
	
	@FindBy(id = "quantity")
	@CacheLookup
	private WebElement cInSDebtQuantity;

	@FindBy(id = "voucherDate")
	@CacheLookup
	private WebElement cInSDebtReceiptDate;

	@FindBy(id = "price")
	@CacheLookup
	private WebElement cInSDebtPrice;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateCorpusStockInDebtPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createCorpusStockInReceiptDebt() {
		file = new FileReaderUtility();
		actions = new Actions(driver);
		
		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(CorpusStockInOut);
		actions.moveToElement(CorpusStockInOut).click().build().perform();

		ElementWait.isElementVisible(selectStockInDD);
		selectStockInDD.click();

		ElementWait.isElementVisible(CorpusInStockDebt);
		CorpusInStockDebt.click();

		// Switching to the i frame
		ElementWait.isElementVisible(createCorpusInStockDebtiFrame);
		driver.switchTo().frame(createCorpusInStockDebtiFrame);
		
		ElementWait.isElementVisible(cInSDebtClientAcPortfAutoSugg);
		cInSDebtClientAcPortfAutoSugg.sendKeys(file.getAccountingTestData("cInSDebtClientAcPortfAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(
				By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectcInSDebtClientAcPortfAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(cInSDebtTargetDematDD);
		Select selectcInSDebtTargetDematDD = new Select(cInSDebtTargetDematDD);
		selectcInSDebtTargetDematDD.selectByVisibleText(file.getAccountingTestData("cInSDebtTargetDematDD"));

		ElementWait.isElementVisible(cInSDebtSourceDematDD);
		Select selectcInSDebtSourceDemat = new Select(cInSDebtSourceDematDD);
		selectcInSDebtSourceDemat.selectByVisibleText(file.getAccountingTestData("cInSDebtSourceDematDD"));
		
		ElementWait.isElementVisible(cInSDebtIssuerDD);
		Select selectcInSDebtIssuerDD = new Select(cInSDebtIssuerDD);
		selectcInSDebtIssuerDD.selectByVisibleText(file.getAccountingTestData("cInSDebtIssuerDD"));
		
		ElementWait.isElementVisible(cInSDebtInstruDD);
		Select selectcInSDebtInstruDD = new Select(cInSDebtInstruDD);
		selectcInSDebtInstruDD.selectByVisibleText(file.getAccountingTestData("cInSDebtInstruDD"));
		
		ElementWait.isElementVisible(cInSDebtQuantity);
		cInSDebtQuantity.sendKeys(file.getAccountingTestData("cInSDebtQuantity"));

		ElementWait.isElementVisible(cInSDebtReceiptDate);
		cInSDebtReceiptDate.sendKeys(file.getAccountingTestData("cInSDebtReceiptDate"));
		
		ElementWait.isElementVisible(cInSDebtPrice);
		cInSDebtPrice.sendKeys(file.getAccountingTestData("cInSDebtPrice"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message Corpus Stock In Receipt Debt : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
