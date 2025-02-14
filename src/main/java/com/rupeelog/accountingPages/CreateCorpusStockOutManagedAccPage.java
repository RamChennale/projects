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

public class CreateCorpusStockOutManagedAccPage {

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

	@FindBy(linkText = "Corpus-Out Stock Managed Acc")
	@CacheLookup
	private WebElement CorpusOutStockManagedAcc;

	@FindBy(xpath = "//iframe[contains(text(),'</div>')]")
	@CacheLookup
	private WebElement createCorpusInStockDebtiFrame;

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement cOutSMAClientAccPortfAutoSugg;

	@FindBy(id = "voucherDate")
	@CacheLookup
	private WebElement cOutSMAstockOutDate;

	@FindBy(id = "advisorId")
	@CacheLookup
	private WebElement cOutSMAmaAdvisorDD;

	@FindBy(id = "assetId")
	@CacheLookup
	private WebElement cOutSMAmaSchemeDD;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement cOutSMAcorpOutAmt;

	@FindBy(id = "recordDate")
	@CacheLookup
	private WebElement cOutSMAdate;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateCorpusStockOutManagedAccPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createCorpusStockOutManagedAcc() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(CorpusStockInOut);
		actions.moveToElement(CorpusStockInOut).click().build().perform();

		ElementWait.isElementVisible(selectStockOutDD);
		selectStockOutDD.click();

		ElementWait.isElementVisible(CorpusOutStockManagedAcc);
		CorpusOutStockManagedAcc.click();

		// Switching to the i frame
		ElementWait.isElementVisible(createCorpusInStockDebtiFrame);
		driver.switchTo().frame(createCorpusInStockDebtiFrame);

		ElementWait.isElementVisible(cOutSMAClientAccPortfAutoSugg);
		cOutSMAClientAccPortfAutoSugg.sendKeys(file.getAccountingTestData("cOutSMAClientAccPortfAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectcOutSMAClientAccPortfAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(cOutSMAstockOutDate);
		cOutSMAstockOutDate.sendKeys(file.getAccountingTestData("cOutSMAstockOutDate"));

		ElementWait.isElementVisible(cOutSMAmaAdvisorDD);
		Select selectcOutSMAmaAdvisorDD = new Select(cOutSMAmaAdvisorDD);
		selectcOutSMAmaAdvisorDD.selectByVisibleText(file.getAccountingTestData("cOutSMAmaAdvisorDD"));

		ElementWait.isElementVisible(cOutSMAmaSchemeDD);
		Select selectcOutSMAmaSchemeDD = new Select(cOutSMAmaSchemeDD);
		selectcOutSMAmaSchemeDD.selectByVisibleText(file.getAccountingTestData("cOutSMAmaSchemeDD"));

		ElementWait.isElementVisible(cOutSMAcorpOutAmt);
		cOutSMAcorpOutAmt.sendKeys(file.getAccountingTestData("cOutSMAcorpOutAmt"));
		
		ElementWait.isElementVisible(cOutSMAdate);
		cOutSMAdate.sendKeys(file.getAccountingTestData("cOutSMAdate"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message Corpus Stock Out Managed Account : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
