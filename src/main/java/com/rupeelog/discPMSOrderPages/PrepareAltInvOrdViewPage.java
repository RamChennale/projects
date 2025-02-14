package com.rupeelog.discPMSOrderPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class PrepareAltInvOrdViewPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Disc PMS")
	@CacheLookup
	private WebElement DiscPMS;

	@FindBy(linkText = "Orders")
	@CacheLookup
	private WebElement Orders;

	@FindBy(linkText = "4. Prepare Alternative Invest Orders")
	@CacheLookup
	private WebElement PrepareAlternativeInvestOrders;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "schemeId")
	@CacheLookup
	private WebElement paioChooseScheme;
	
	@FindBy(id = "portfolioId")
	@CacheLookup
	private WebElement paioChoosePortfolio;
	
	@FindBy(xpath = "//h2[@id='buytxt']")
	@CacheLookup
	private WebElement buy;
	
	public PrepareAltInvOrdViewPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void prepareAltInvOrdViewPage() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(Orders);
		actions.moveToElement(Orders).perform();

		ElementWait.isElementVisible(PrepareAlternativeInvestOrders);
		actions.moveToElement(PrepareAlternativeInvestOrders).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(paioChooseScheme);
		Select selectpaioChooseScheme= new Select(paioChooseScheme);
		selectpaioChooseScheme.selectByVisibleText(file.getDiscPMSTestData("paioChooseScheme"));

		ElementWait.isElementVisible(paioChoosePortfolio);
		Select selectpaioChoosePortfolio= new Select(paioChoosePortfolio);
		selectpaioChoosePortfolio.selectByVisibleText(file.getDiscPMSTestData("paioChoosePortfolio"));
		
		ElementWait.isElementVisible(buy);
		Assert.assertTrue(buy.getText().contains("Buy"), "Prepare Alt Orders Inv List not displayed.");
		System.out.println("buy.isDisplayed() "+ buy.isDisplayed());
	}
}
