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

public class CreateFreezePortfolioPage {

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

	@FindBy(linkText = "Freeze Portfolio")
	@CacheLookup
	private WebElement FreezePortfolio;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "portfolioName")
	@CacheLookup
	private WebElement freezPortfolioAutoSugg;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement freezStartDate;

	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement freezEndDate;

	@FindBy(id = "buy")
	@CacheLookup
	private WebElement freezBuyDD;
	
	@FindBy(id = "sell")
	@CacheLookup 
	private WebElement freezSellDD;
	  
	@FindBy(id = "description")
    @CacheLookup 
    private WebElement freezDescription;
	 
	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement saveBtn;
	 
	@FindBy(id = "msg")
	@CacheLookup
	private WebElement result;

	public CreateFreezePortfolioPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createFreezePortfolio() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(ClientManagement);
		actions.moveToElement(ClientManagement).perform();

		ElementWait.isElementVisible(FreezePortfolio);
		actions.moveToElement(FreezePortfolio).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		createBtn.click();

		ElementWait.isElementVisible(freezPortfolioAutoSugg);
		freezPortfolioAutoSugg.sendKeys(file.getDiscPMSTestData("freezPortfolioAutoSugg"));
		
		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("selectfreezPortfolioAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(freezStartDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver,freezStartDate ,
				file.getDiscPMSTestData("freezStartDate"));

		ElementWait.isElementVisible(freezEndDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver,freezEndDate ,
				file.getDiscPMSTestData("freezEndDate"));
		
		ElementWait.isElementVisible(freezBuyDD);
		Select selectfreezBuyDD= new Select(freezBuyDD);
		selectfreezBuyDD.selectByVisibleText(file.getDiscPMSTestData("freezBuyDD"));

		ElementWait.isElementVisible(freezSellDD);
		Select selectfreezSellDD= new Select(freezSellDD);
		selectfreezSellDD.selectByVisibleText(file.getDiscPMSTestData("freezSellDD"));
		
		ElementWait.isElementVisible(freezDescription);
		freezDescription.sendKeys(file.getDiscPMSTestData("freezDescription"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		ElementWait.isElementVisible(result);
		System.out.println("Freeze portfolio : "+result.getText());
	}
}
