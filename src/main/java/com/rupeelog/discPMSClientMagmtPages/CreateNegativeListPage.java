package com.rupeelog.discPMSClientMagmtPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class CreateNegativeListPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Disc PMS")
	@CacheLookup
	private WebElement DiscPMS;

	@FindBy(linkText = "Client Management")
	@CacheLookup
	private WebElement ClientManagement;

	@FindBy(linkText = "Negative List")
	@CacheLookup
	private WebElement NegativeList;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "clientName")
	@CacheLookup
	private WebElement nlClientNameAutoSugg;

	@FindBy(id = "client")
	@CacheLookup
	private WebElement nlSpecificInstrumentRdoBtn;

	@FindBy(id = "assetClass")
	@CacheLookup
	private WebElement nlAssetClassDD;

	@FindBy(id = "equityName")
	@CacheLookup
	private WebElement nlEquityNameAutoSugg;
	
	@FindBy(id = "startDate")
	@CacheLookup 
	private WebElement nlStartDate;
	
	@FindBy(id = "head_btnSave")
	@CacheLookup 
	private WebElement saveBtn;
	
	public CreateNegativeListPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createNegativeList() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(ClientManagement);
		actions.moveToElement(ClientManagement).perform();

		ElementWait.isElementVisible(NegativeList);
		actions.moveToElement(NegativeList).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		createBtn.click();

		ElementWait.isElementVisible(nlClientNameAutoSugg);
		nlClientNameAutoSugg.sendKeys(file.getDiscPMSTestData("nlClientNameAutoSugg"));
		
		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectnlClientNameAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(nlSpecificInstrumentRdoBtn);
		nlSpecificInstrumentRdoBtn.click();
		
		ElementWait.isElementVisible(nlAssetClassDD);
		Select selectnlAssetClassDD= new Select(nlAssetClassDD);
		selectnlAssetClassDD.selectByVisibleText(file.getDiscPMSTestData("nlAssetClassDD"));
		

		ElementWait.isElementVisible(nlEquityNameAutoSugg);
		nlEquityNameAutoSugg.sendKeys(file.getDiscPMSTestData("nlEquityNameAutoSugg"));
		
		List<WebElement> eqList = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
		for (int i = 0; i < eqList.size(); i++) {
			if (eqList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectnlEquityNameAutoSugg"))) {
				eqList.get(i).click();
				break;
			}
		}
		
		ElementWait.isElementVisible(nlStartDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver,nlStartDate ,
				file.getDiscPMSTestData("nlStartDate"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
	}
}
