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

public class ConfirmAllocationPage {

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

	@FindBy(linkText = "7. Allocate executed Orders")
	@CacheLookup
	private WebElement AllocateExecutedOrders;
	
	By overlay = By.cssSelector("#loader");

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement caStartDate;

	@FindBy(id = "schemeId")
	@CacheLookup
	private WebElement caChooseScheme;

	@FindBy(id = "go")
	@CacheLookup
	private WebElement goBtn;

	public ConfirmAllocationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void confirmAllocation() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(Orders);
		actions.moveToElement(Orders).perform();

		ElementWait.isElementVisible(AllocateExecutedOrders);
		actions.moveToElement(AllocateExecutedOrders).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(caChooseScheme);
		Select selectcaChooseScheme= new Select(caChooseScheme);
		selectcaChooseScheme.selectByVisibleText(file.getDiscPMSTestData("caChooseScheme"));
		
		ElementWait.isElementVisible(caStartDate);
		caStartDate.sendKeys(file.getDiscPMSTestData("coChooseSchemeModelPortfoliosDD"));

		ElementWait.isElementVisible(goBtn);
		goBtn.click();
		
	}
}
