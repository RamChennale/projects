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

public class CreateContraVoucherPage {

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

	@FindBy(linkText = "NRI Contra Voucher")
	@CacheLookup
	private WebElement NRIContraVoucher;

	@FindBy(id = "voucherDate")
	@CacheLookup
	private WebElement cvVoucherDate;

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement cvPortfolioAutoSugg;

	@FindBy(id = "bankId")
	@CacheLookup
	private WebElement cvSrcBankDD;

	@FindBy(id = "ledgerBankId")
	@CacheLookup
	private WebElement cvTargetBankDD;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement cvAmount;

	@FindBy(id = "instrumentType")
	@CacheLookup
	private WebElement cvInstrumentTypeDD;

	@FindBy(id = "confirmationNum")
	@CacheLookup
	private WebElement cvInstRefNo;

	@FindBy(id = "chequeDate")
	@CacheLookup
	private WebElement cvInstDate;

	@FindBy(id = "paymentInFavour")
	@CacheLookup
	private WebElement cvPaymentInFavour;

	@FindBy(id = "narration")
	@CacheLookup
	private WebElement cvNarration;
	
	@FindBy(xpath = "//input[@value='Save']")
	@CacheLookup
	private WebElement saveBtn;

	public CreateContraVoucherPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createContraVoucher() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(ManualVoucher);
		actions.moveToElement(ManualVoucher).click().build().perform();

		ElementWait.isElementVisible(selectManualVoucherTypeDD);
		selectManualVoucherTypeDD.click();

		ElementWait.isElementVisible(NRIContraVoucher);
		NRIContraVoucher.click();

		ElementWait.isElementVisible(cvVoucherDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver, cvVoucherDate, file.getAccountingTestData("cvVoucherDate"));

		ElementWait.isElementVisible(cvPortfolioAutoSugg);
		cvPortfolioAutoSugg.sendKeys(file.getAccountingTestData("cvPortfolioAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectcvPortfolioAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}
		
		ElementWait.isElementVisible(cvSrcBankDD);
		Select selectcvSrcBankDD = new Select(cvSrcBankDD);
		selectcvSrcBankDD.selectByVisibleText(file.getAccountingTestData("cvSrcBankDD"));
		
		ElementWait.isElementVisible(cvTargetBankDD);
		Select selectcvTargetBankDD = new Select(cvTargetBankDD);
		selectcvTargetBankDD.selectByVisibleText(file.getAccountingTestData("cvTargetBankDD"));

		ElementWait.isElementVisible(cvAmount);
		cvAmount.sendKeys(file.getAccountingTestData("cvAmount"));
		
		ElementWait.isElementVisible(cvInstrumentTypeDD);
		Select selectcvInstrumentTypeDD = new Select(cvInstrumentTypeDD);
		selectcvInstrumentTypeDD.selectByVisibleText(file.getAccountingTestData("cvInstrumentTypeDD"));

		ElementWait.isElementVisible(cvInstRefNo);
		cvInstRefNo.sendKeys(file.getAccountingTestData("cvInstRefNo"));

		ElementWait.isElementVisible(cvInstDate);
		cvInstDate.sendKeys(file.getAccountingTestData("cvInstDate"));

		ElementWait.isElementVisible(cvPaymentInFavour);
		cvPaymentInFavour.sendKeys(file.getAccountingTestData("cvPaymentInFavour"));

		ElementWait.isElementVisible(cvNarration);
		cvNarration.sendKeys(file.getAccountingTestData("cvNarration"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message create contra Voucher : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
