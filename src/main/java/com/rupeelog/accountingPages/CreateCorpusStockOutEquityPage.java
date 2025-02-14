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

public class CreateCorpusStockOutEquityPage {

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

	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[2]/a[2]")
	@CacheLookup
	private WebElement selectStockOutDD;

	@FindBy(linkText = "Corpus-Out Stock Equity")
	@CacheLookup
	private WebElement CorpusOutStockEquity;

	@FindBy(xpath = "//iframe[contains(text(),'</div>')]")
	@CacheLookup
	private WebElement createCorpusInStockEQiFrame;

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement cOutSEQClientAccPortfAutoSugg;

	@FindBy(id = "sourceDematId")
	@CacheLookup
	private WebElement cOutSEQSourceDemat;

	@FindBy(id = "targetDematId")
	@CacheLookup
	private WebElement cOutSEQTargetDematDD;

	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement cOutSEQWithdrawalDate;

	@FindBy(id = "withdrawType")
	@CacheLookup
	private WebElement cOutSEQWithdrawalRateDD;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	@CacheLookup
	private WebElement cOutSEQCheckBox;

	@FindBy(id = "originalQty_")
	@CacheLookup
	private WebElement cOutSEQWithdrawalQuantity;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateCorpusStockOutEquityPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createCorpusStockOutEquity() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(CorpusStockInOut);
		actions.moveToElement(CorpusStockInOut).click().build().perform();

		ElementWait.isElementVisible(selectStockOutDD);
		selectStockOutDD.click();

		ElementWait.isElementVisible(CorpusOutStockEquity);
		CorpusOutStockEquity.click();

		// Switching to the i frame
		ElementWait.isElementVisible(createCorpusInStockEQiFrame);
		driver.switchTo().frame(createCorpusInStockEQiFrame);

		ElementWait.isElementVisible(cOutSEQClientAccPortfAutoSugg);
		cOutSEQClientAccPortfAutoSugg.sendKeys(file.getAccountingTestData("cOutSEQClientAccPortfAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectcOutSEQClientAccPortfAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(cOutSEQSourceDemat);
		Select selectcOutSEQSourceDemat = new Select(cOutSEQSourceDemat);
		selectcOutSEQSourceDemat.selectByVisibleText(file.getAccountingTestData("cOutSEQSourceDemat"));

		ElementWait.isElementVisible(cOutSEQTargetDematDD);
		Select selectcOutSEQTargetDematDD = new Select(cOutSEQTargetDematDD);
		selectcOutSEQTargetDematDD.selectByVisibleText(file.getAccountingTestData("cOutSEQTargetDematDD"));

		ElementWait.isElementVisible(cOutSEQWithdrawalDate);
		cOutSEQWithdrawalDate.sendKeys(file.getAccountingTestData("cOutSEQWithdrawalDate"));

		ElementWait.isElementVisible(cOutSEQWithdrawalRateDD);
		Select selectcOutSEQWithdrawalRateDD = new Select(cOutSEQWithdrawalRateDD);
		selectcOutSEQWithdrawalRateDD.selectByVisibleText(file.getAccountingTestData("cOutSEQWithdrawalRateDD"));

		ElementWait.isElementVisible(cOutSEQCheckBox);
		if (cOutSEQCheckBox.isSelected())
			System.out.println("Check box already selected");
		else {
			cOutSEQCheckBox.click();
		}

		ElementWait.isElementVisible(cOutSEQWithdrawalQuantity);
		cOutSEQWithdrawalQuantity.sendKeys(file.getAccountingTestData("cOutSEQWithdrawalQuantity"));

		ElementWait.isElementVisible(saveBtn);
		// saveBtn.click();

		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message Corpus Stock Out Receipt Equity : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
