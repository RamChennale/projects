package com.rupeelog.discPMSOrderPages;

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

public class CancelOrdPage {

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

	@FindBy(linkText = "6. Cancel Orders")
	@CacheLookup
	private WebElement CancelOrders;
	
	By overlay = By.cssSelector("#loader");

	@FindBy(id = "mpfolio")
	@CacheLookup
	private WebElement coChooseSchemeRdoBtn;

	@FindBy(id = "modelPortfolios")
	@CacheLookup
	private WebElement coChooseSchemeModelPortfoliosDD;

	@FindBy(id = "cancel")
	@CacheLookup
	private WebElement cancelBtn;

	public CancelOrdPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void cancelOrder() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(Orders);
		actions.moveToElement(Orders).perform();

		ElementWait.isElementVisible(CancelOrders);
		actions.moveToElement(CancelOrders).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(coChooseSchemeRdoBtn);
		coChooseSchemeRdoBtn.click();

		ElementWait.isElementVisible(coChooseSchemeModelPortfoliosDD);
		Select selectcoChooseSchemeModelPortfoliosDD= new Select(coChooseSchemeModelPortfoliosDD);
		selectcoChooseSchemeModelPortfoliosDD.selectByVisibleText(file.getDiscPMSTestData("coChooseSchemeModelPortfoliosDD"));
		
		ElementWait.isElementVisible(cancelBtn);
		cancelBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Cancel order : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
		
	}
}
