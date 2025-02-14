package com.rupeelog.discPMSOrderPages;

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

public class PlaceOrdViewPage {

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

	@FindBy(linkText = "5. Place Orders")
	@CacheLookup
	private WebElement PlaceOrders;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "modelPortfolios")
	@CacheLookup
	private WebElement povModelPortfolio;

	public PlaceOrdViewPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void placeOrdView() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(Orders);
		actions.moveToElement(Orders).perform();

		ElementWait.isElementVisible(PlaceOrders);
		actions.moveToElement(PlaceOrders).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(povModelPortfolio);
		Select selectpovModelPortfolio= new Select(povModelPortfolio);
		selectpovModelPortfolio.selectByVisibleText(file.getDiscPMSTestData("povModelPortfolio"));
		
	}
}
