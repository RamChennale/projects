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
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class CreateReceiptVoucherPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Accounting")
	@CacheLookup
	private WebElement AccountingMenu;

	@FindBy(linkText = "Manual Voucher")
	@CacheLookup
	private WebElement ManualVoucher;

	@FindBy(xpath = "//body/div[@id='Maincontent']/div[@id='fluid']/div[1]/div[2]/div[1]/div[1]/fieldset[2]/div[3]/div[1]/a[2]")
	@CacheLookup
	private WebElement selectManualVoucherTypeDD;

	@FindBy(linkText = "Receipt Voucher")
	@CacheLookup
	private WebElement ReceiptVoucher;

	@FindBy(id = "voucherDate")
	@CacheLookup
	private WebElement rvVoucherDate;

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement rvPortfolioAutoSugg;

	@FindBy(id = "bankId")
	@CacheLookup
	private WebElement rvBankDD;

	@FindBy(id = "subgroupId")
	@CacheLookup
	private WebElement rvAccTypeDD;

	@FindBy(id = "fixedLedgerId")
	@CacheLookup
	private WebElement rvSecLedDD;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement rvAmount;

	@FindBy(id = "instrumentType")
	@CacheLookup
	private WebElement rvInstrumentTypeDD;

	@FindBy(id = "confirmationNum")
	@CacheLookup
	private WebElement rvInstRefNo;

	@FindBy(id = "chequeDate")
	@CacheLookup
	private WebElement rvInstDate;

	@FindBy(id = "narration")
	@CacheLookup
	private WebElement rvNarration;

	@FindBy(xpath = "//input[@value='Save']")
	@CacheLookup
	private WebElement saveBtn;

	public CreateReceiptVoucherPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createReceiptVoucher() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(ManualVoucher);
		actions.moveToElement(ManualVoucher).click().build().perform();

		ElementWait.isElementVisible(selectManualVoucherTypeDD);
		selectManualVoucherTypeDD.click();

		ElementWait.isElementVisible(ReceiptVoucher);
		ReceiptVoucher.click();

		ElementWait.isElementVisible(rvVoucherDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver, rvVoucherDate, file.getAccountingTestData("rvVoucherDate"));

		ElementWait.isElementVisible(rvPortfolioAutoSugg);
		rvPortfolioAutoSugg.sendKeys(file.getAccountingTestData("rvPortfolioAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectrvPortfolioAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}
		
		ElementWait.isElementVisible(rvBankDD);
		Select selectrvBankDD = new Select(rvBankDD);
		selectrvBankDD.selectByVisibleText(file.getAccountingTestData("rvBankDD"));
		
		ElementWait.isElementVisible(rvAccTypeDD);
		Select selectrvAccTypeDD = new Select(rvAccTypeDD);
		selectrvAccTypeDD.selectByVisibleText(file.getAccountingTestData("rvAccTypeDD"));
		
		ElementWait.isElementVisible(rvSecLedDD);
		Select selectrvSecLedDD = new Select(rvSecLedDD);
		selectrvSecLedDD.selectByVisibleText(file.getAccountingTestData("rvSecLedDD"));

		ElementWait.isElementVisible(rvAmount);
		rvAmount.sendKeys(file.getAccountingTestData("rvAmount"));
		
		ElementWait.isElementVisible(rvInstrumentTypeDD);
		Select selectrvInstrumentTypeDD = new Select(rvInstrumentTypeDD);
		selectrvInstrumentTypeDD.selectByVisibleText(file.getAccountingTestData("rvInstrumentTypeDD"));

		ElementWait.isElementVisible(rvInstRefNo);
		rvInstRefNo.sendKeys(file.getAccountingTestData("rvInstRefNo"));

		ElementWait.isElementVisible(rvInstDate);
		rvInstDate.sendKeys(file.getAccountingTestData("rvInstDate"));

		ElementWait.isElementVisible(rvNarration);
		rvNarration.sendKeys(file.getAccountingTestData("rvNarration"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message create Receipt Voucher : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
