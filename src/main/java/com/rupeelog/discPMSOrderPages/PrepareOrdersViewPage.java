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

public class PrepareOrdersViewPage {

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

	@FindBy(linkText = "3. Prepare Orders")
	@CacheLookup
	private WebElement PrepareOrders;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "modelPortfolios")
	@CacheLookup
	private WebElement povChooseModelPortfDD;
	
	@FindBy(xpath = "//h4[contains(text(),'Asset List')]")
	@CacheLookup
	private WebElement povAssetList;

	public PrepareOrdersViewPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void prepareOrdersView() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(Orders);
		actions.moveToElement(Orders).perform();

		ElementWait.isElementVisible(PrepareOrders);
		actions.moveToElement(PrepareOrders).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(povChooseModelPortfDD);
		Select selectpovChooseModelPortfDD= new Select(povChooseModelPortfDD);
		selectpovChooseModelPortfDD.selectByVisibleText(file.getDiscPMSTestData("povChooseModelPortfDD"));
		
		ElementWait.isElementVisible(povAssetList);
		Assert.assertTrue(povAssetList.getText().contains("Asset List"), "Prepare Orders Asset List not displayed.");
		System.out.println("povAssetList.isDisplayed() "+ povAssetList.isDisplayed());
	}
}
