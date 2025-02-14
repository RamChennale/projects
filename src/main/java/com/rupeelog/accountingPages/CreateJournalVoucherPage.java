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

public class CreateJournalVoucherPage {

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

	@FindBy(linkText = "Journal Voucher")
	@CacheLookup
	private WebElement JournalVoucher;

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement jvPortfolioAutoSugg;

	@FindBy(id = "voucherDate")
	@CacheLookup
	private WebElement jvVoucherDate;

	@FindBy(id = "subgroupId_")
	@CacheLookup
	private WebElement jvAccGroupsDD_1;

	@FindBy(id = "fixedLedgerId_")
	@CacheLookup
	private WebElement jvLedgerNameDD_1;

	@FindBy(id = "debitAmount_1")
	@CacheLookup
	private WebElement jvDebitAmount_1;

	@FindBy(id = "creditAmount_1")
	@CacheLookup
	private WebElement jvCreditAmount_1;

	@FindBy(id = "narration_1")
	@CacheLookup
	private WebElement jvNarration_1;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateJournalVoucherPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createJournalVoucher() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(ManualVoucher);
		actions.moveToElement(ManualVoucher).click().build().perform();

		ElementWait.isElementVisible(selectManualVoucherTypeDD);
		selectManualVoucherTypeDD.click();

		ElementWait.isElementVisible(JournalVoucher);
		JournalVoucher.click();

		ElementWait.isElementVisible(jvPortfolioAutoSugg);
		jvPortfolioAutoSugg.sendKeys(file.getAccountingTestData("jvPortfolioAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectjvPortfolioAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(jvVoucherDate);
		jvVoucherDate.sendKeys(file.getAccountingTestData("jvVoucherDate"));
		
		ElementWait.isElementVisible(jvAccGroupsDD_1);
		Select selectjvAccGroupsDD_1 = new Select(jvAccGroupsDD_1);
		selectjvAccGroupsDD_1.selectByVisibleText(file.getAccountingTestData("jvAccGroupsDD_1"));

		ElementWait.isElementVisible(jvLedgerNameDD_1);
		Select selectjvLedgerNameDD_1 = new Select(jvLedgerNameDD_1);
		selectjvLedgerNameDD_1.selectByVisibleText(file.getAccountingTestData("jvLedgerNameDD_1"));

		ElementWait.isElementVisible(jvDebitAmount_1);
		jvDebitAmount_1.sendKeys(file.getAccountingTestData("jvDebitAmount_1"));

		ElementWait.isElementVisible(jvCreditAmount_1);
		jvCreditAmount_1.sendKeys(file.getAccountingTestData("jvCreditAmount_1"));

		ElementWait.isElementVisible(jvNarration_1);
		jvNarration_1.sendKeys(file.getAccountingTestData("jvNarration_1"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message create Journal Voucher : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
