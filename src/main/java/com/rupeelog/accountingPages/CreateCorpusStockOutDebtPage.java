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

public class CreateCorpusStockOutDebtPage {

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

	@FindBy(linkText = "Corpus-Out Stock Debt")
	@CacheLookup
	private WebElement CorpusOutStockDebt;

	@FindBy(xpath = "//iframe[contains(text(),'</div>')]")
	@CacheLookup
	private WebElement createCorpusInStockDebtiFrame;

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement cOutSDebtClientAccPortfAutoSugg;

	@FindBy(id = "sourceDematId")
	@CacheLookup
	private WebElement cOutSDebtSourceDemat;

	@FindBy(id = "targetDematId")
	@CacheLookup
	private WebElement cOutSDebtTargetDematDD;

	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement cOutSDebtWithdrawalDate;

	@FindBy(id = "withdrawType")
	@CacheLookup
	private WebElement cOutSDebtWithdrawalRateDD;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	@CacheLookup
	private WebElement cOutSDebtCheckBox;

	@FindBy(id = "originalQty_")
	@CacheLookup
	private WebElement cOutSDebtWithdrawalQuantity;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateCorpusStockOutDebtPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createCorpusStockOutDebt() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(CorpusStockInOut);
		actions.moveToElement(CorpusStockInOut).click().build().perform();

		ElementWait.isElementVisible(selectStockOutDD);
		selectStockOutDD.click();

		ElementWait.isElementVisible(CorpusOutStockDebt);
		CorpusOutStockDebt.click();

		// Switching to the i frame
		ElementWait.isElementVisible(createCorpusInStockDebtiFrame);
		driver.switchTo().frame(createCorpusInStockDebtiFrame);

		ElementWait.isElementVisible(cOutSDebtClientAccPortfAutoSugg);
		cOutSDebtClientAccPortfAutoSugg.sendKeys(file.getAccountingTestData("cOutSDebtClientAccPortfAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectcOutSDebtClientAccPortfAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(cOutSDebtSourceDemat);
		Select selectcOutSDebtSourceDemat = new Select(cOutSDebtSourceDemat);
		selectcOutSDebtSourceDemat.selectByVisibleText(file.getAccountingTestData("cOutSDebtSourceDemat"));

		ElementWait.isElementVisible(cOutSDebtTargetDematDD);
		Select selectcOutSDebtTargetDematDD = new Select(cOutSDebtTargetDematDD);
		selectcOutSDebtTargetDematDD.selectByVisibleText(file.getAccountingTestData("cOutSDebtTargetDematDD"));

		ElementWait.isElementVisible(cOutSDebtWithdrawalDate);
		cOutSDebtWithdrawalDate.sendKeys(file.getAccountingTestData("cOutSDebtWithdrawalDate"));

		ElementWait.isElementVisible(cOutSDebtWithdrawalRateDD);
		Select selectcOutSDebtWithdrawalRateDD = new Select(cOutSDebtWithdrawalRateDD);
		selectcOutSDebtWithdrawalRateDD.selectByVisibleText(file.getAccountingTestData("cOutSDebtWithdrawalRateDD"));

		ElementWait.isElementVisible(cOutSDebtCheckBox);
		if (cOutSDebtCheckBox.isSelected())
			System.out.println("Check box already selected");
		else {
			cOutSDebtCheckBox.click();
		}

		ElementWait.isElementVisible(cOutSDebtWithdrawalQuantity);
		cOutSDebtWithdrawalQuantity.sendKeys(file.getAccountingTestData("cOutSDebtWithdrawalQuantity"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message Corpus Stock Out Receipt Debt : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
