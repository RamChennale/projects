package com.rupeelog.orderMAPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.WaitToLoadElement;

public class OrderMABuySellWithoutRiskPage {

	WebDriver driver;
	Actions actions;

	@FindBy(xpath = "//*[text()='Order']")
	@CacheLookup
	private WebElement order;
	@FindBy(xpath = "//*[text()='Managed Accounts']")
	@CacheLookup
	private WebElement managedAccounts;
	@FindBy(xpath = "//body/div[@id='Maincontent']/div[@id='fluid']/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li[3]/ul[1]/li[3]/a[1]")
	@CacheLookup
	private WebElement maPreOrder;

	@FindBy(xpath = "//input[@id='portfolioName']")
	@CacheLookup
	private WebElement portfolioNameAutoSuggeSearch; // PORTFOLIO NAME IS AutoSuggeSearch DROPDOWN but not VISIBLE FROM
														// UI and When entered TEXT test app hanged and unresponsive.

	@FindBy(xpath = "//select[@id='fundId']")
	@CacheLookup
	private WebElement maFundDD;

	@FindBy(xpath = "//select[@id='advisorId']")
	@CacheLookup
	private WebElement maAdviserDD;

	@FindBy(xpath = "//select[@id='assetId']")
	@CacheLookup
	private WebElement maSchemeDD;

	@FindBy(xpath = "//select[@id='txnType']")
	@CacheLookup
	private WebElement txnTypeDD;

	@FindBy(xpath = "//input[@id='txnDateStr']")
	@CacheLookup
	private WebElement txnDate;

	@FindBy(xpath = "//input[@id='amount']")
	@CacheLookup
	private WebElement investmentAmount;

	@FindBy(xpath = "//input[@id='remarks']")
	@CacheLookup
	private WebElement remarks;

	@FindBy(xpath = "//input[@id='fees']")
	@CacheLookup
	private WebElement fees;

	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement saveButton;

	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancelButton;

	public OrderMABuySellWithoutRiskPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void addMAPreOrder() throws InterruptedException {
		actions = new Actions(driver);
		
		WaitToLoadElement.waitToLoadElement(order);
		actions.moveToElement(order).perform();
		
		WaitToLoadElement.waitToLoadElement(managedAccounts);
		actions.moveToElement(managedAccounts).perform();
		
		WaitToLoadElement.waitToLoadElement(maPreOrder);
		actions.moveToElement(maPreOrder).click().build().perform();

		Thread.sleep(2000);
		WaitToLoadElement.waitToLoadElement(portfolioNameAutoSuggeSearch);

		portfolioNameAutoSuggeSearch.sendKeys("Automation");
		List<WebElement> portFoliolist = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));
		for (int i = 0; i < portFoliolist.size(); i++) {
			if (portFoliolist.get(i).getText()
					.equalsIgnoreCase("IA149499E149501_JJSPL4785K_Automation Testing_Automation Testing")) {
				portFoliolist.get(i).click();
				break;
			}
		}
		WaitToLoadElement.waitToLoadElement(maFundDD);
		Select maFundSelect = new Select(maFundDD);
		maFundSelect.selectByVisibleText("AIF Funds");

		WaitToLoadElement.waitToLoadElement(maAdviserDD);
		Select maAdviserDDSelect = new Select(maAdviserDD);
		maAdviserDDSelect.selectByVisibleText("Rupeelog AMC");

		WaitToLoadElement.waitToLoadElement(maSchemeDD);
		// ****************
		maSchemeDD.click(); // High priority issue in product, in first attempt failed to load the scheme
							// values in drop down.
		// ****************
		WaitToLoadElement.waitToLoadElement(maSchemeDD);
		Select maSchemeDDSelect = new Select(maSchemeDD);
		maSchemeDDSelect.selectByIndex(1);

		WaitToLoadElement.waitToLoadElement(txnTypeDD);
		Select txnTypeDDselect = new Select(txnTypeDD);
		txnTypeDDselect.selectByVisibleText("Buy");
		WaitToLoadElement.waitToLoadElement(txnDate);
		txnDate.sendKeys("06/10/2020");
		WaitToLoadElement.waitToLoadElement(investmentAmount);
		investmentAmount.sendKeys("10000");
		WaitToLoadElement.waitToLoadElement(remarks);
		remarks.sendKeys("Best offers at pre order");
		WaitToLoadElement.waitToLoadElement(fees);
		fees.sendKeys("1000");
		WaitToLoadElement.waitToLoadElement(saveButton);
		Thread.sleep(5000);
		// saveButton.click();
	}

}
