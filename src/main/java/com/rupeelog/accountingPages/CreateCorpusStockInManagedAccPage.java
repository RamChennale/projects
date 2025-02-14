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

public class CreateCorpusStockInManagedAccPage {

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

	@FindBy(linkText = "Corpus-In Stock Managed Acc")
	@CacheLookup
	private WebElement CorpusInStockManagedAcc;

	@FindBy(xpath = "//iframe[contains(text(),'</div>')]")
	@CacheLookup
	private WebElement createCorpusInStockMAiFrame;
	
	

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement cInSMAClientAcPortfAutoSugg;

	@FindBy(id = "voucherDate")
	@CacheLookup
	private WebElement cInSMAReceiptDate;

	@FindBy(id = "advisorId")
	@CacheLookup
	private WebElement cInSMAadvisorDD;

	@FindBy(id = "assetId")
	@CacheLookup
	private WebElement cInSMASchemeDD;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement cInSMAamount;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateCorpusStockInManagedAccPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createCorpusStockInManagedAcc() {
		file = new FileReaderUtility();
		actions = new Actions(driver);
		
		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(CorpusStockInOut);
		actions.moveToElement(CorpusStockInOut).click().build().perform();

		ElementWait.isElementVisible(selectStockInDD);
		selectStockInDD.click();

		ElementWait.isElementVisible(CorpusInStockManagedAcc);
		CorpusInStockManagedAcc.click();

		// Switching to the i frame
		ElementWait.isElementVisible(createCorpusInStockMAiFrame);
		driver.switchTo().frame(createCorpusInStockMAiFrame);
		
		ElementWait.isElementVisible(cInSMAClientAcPortfAutoSugg);
		cInSMAClientAcPortfAutoSugg.sendKeys(file.getAccountingTestData("cInSMAClientAcPortfAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(
				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectcInSMAClientAcPortfAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(cInSMAReceiptDate);
		cInSMAReceiptDate.sendKeys(file.getAccountingTestData("cInSMAReceiptDate"));
		
		ElementWait.isElementVisible(cInSMAadvisorDD);
		Select selectcInSMAadvisorDD = new Select(cInSMAadvisorDD);
		selectcInSMAadvisorDD.selectByVisibleText(file.getAccountingTestData("cInSMAadvisorDD"));

		ElementWait.isElementVisible(cInSMASchemeDD);
		Select selectcInSMASchemeDD = new Select(cInSMASchemeDD);
		selectcInSMASchemeDD.selectByVisibleText(file.getAccountingTestData("cInSMASchemeDD"));
		
		ElementWait.isElementVisible(cInSMAamount);
		cInSMAamount.sendKeys(file.getAccountingTestData("cInSMAamount"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message Corpus Stock In Receipt MA : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
}
