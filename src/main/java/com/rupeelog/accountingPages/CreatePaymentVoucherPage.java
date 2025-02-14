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

public class CreatePaymentVoucherPage {

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

	@FindBy(linkText = "Payment Voucher")
	@CacheLookup
	private WebElement PaymentVoucher;

	@FindBy(id = "voucherDate")
	@CacheLookup
	private WebElement pvVoucherDate;

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement pvPortfolioAutoSugg;

	@FindBy(id = "bankId")
	@CacheLookup
	private WebElement pvBankDD;

	@FindBy(id = "subgroupId")
	@CacheLookup
	private WebElement pvAccTypeDD;

	@FindBy(id = "fixedLedgerId")
	@CacheLookup
	private WebElement pvSecLedDD;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement pvAmount;

	@FindBy(id = "instrumentType")
	@CacheLookup
	private WebElement pvInstrumentTypeDD;

	@FindBy(id = "confirmationNum")
	@CacheLookup
	private WebElement pvInstRefNo;

	@FindBy(id = "chequeDate")
	@CacheLookup
	private WebElement pvInstDate;

	@FindBy(id = "paymentInFavour")
	@CacheLookup
	private WebElement pvPaymentInFavour;

	@FindBy(id = "narration")
	@CacheLookup
	private WebElement pvNarration;
	
	@FindBy(xpath = "//input[@value='Save']")
	@CacheLookup
	private WebElement saveBtn;

	public CreatePaymentVoucherPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createPaymentVoucher() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(ManualVoucher);
		actions.moveToElement(ManualVoucher).click().build().perform();

		ElementWait.isElementVisible(selectManualVoucherTypeDD);
		selectManualVoucherTypeDD.click();

		ElementWait.isElementVisible(PaymentVoucher);
		PaymentVoucher.click();

		ElementWait.isElementVisible(pvVoucherDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver, pvVoucherDate, file.getAccountingTestData("pvVoucherDate"));

		ElementWait.isElementVisible(pvPortfolioAutoSugg);
		pvPortfolioAutoSugg.sendKeys(file.getAccountingTestData("pvPortfolioAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectpvPortfolioAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}
		
		ElementWait.isElementVisible(pvBankDD);
		Select selectpvBankDD = new Select(pvBankDD);
		selectpvBankDD.selectByVisibleText(file.getAccountingTestData("pvBankDD"));
		
		ElementWait.isElementVisible(pvAccTypeDD);
		Select selectpvAccTypeDD = new Select(pvAccTypeDD);
		selectpvAccTypeDD.selectByVisibleText(file.getAccountingTestData("pvAccTypeDD"));
		
		ElementWait.isElementVisible(pvSecLedDD);
		Select selectpvSecLedDD = new Select(pvSecLedDD);
		selectpvSecLedDD.selectByVisibleText(file.getAccountingTestData("pvSecLedDD"));

		ElementWait.isElementVisible(pvAmount);
		pvAmount.sendKeys(file.getAccountingTestData("pvAmount"));
		
		ElementWait.isElementVisible(pvInstrumentTypeDD);
		Select selectpvInstrumentTypeDD = new Select(pvInstrumentTypeDD);
		selectpvInstrumentTypeDD.selectByVisibleText(file.getAccountingTestData("pvInstrumentTypeDD"));

		ElementWait.isElementVisible(pvInstRefNo);
		pvInstRefNo.sendKeys(file.getAccountingTestData("pvInstRefNo"));

		ElementWait.isElementVisible(pvInstDate);
		pvInstDate.sendKeys(file.getAccountingTestData("pvInstDate"));

		ElementWait.isElementVisible(pvPaymentInFavour);
		pvPaymentInFavour.sendKeys(file.getAccountingTestData("pvPaymentInFavour"));

		ElementWait.isElementVisible(pvNarration);
		pvNarration.sendKeys(file.getAccountingTestData("pvNarration"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message create payment Voucher : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
