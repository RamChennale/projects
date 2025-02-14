package com.rupeelog.discPMSOrderPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class ViewVarianceForAccPortfolioPage {

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

	@FindBy(linkText = "2. Variance for Accounting Portfolio")
	@CacheLookup
	private WebElement VarianceForAccountingPortfolio;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "accountingPortfolio")
	@CacheLookup
	private WebElement varianceAccPortfolioAutoSugg;

	@FindBy(id = "go")
	@CacheLookup
	private WebElement goBtn;
	
	
	public ViewVarianceForAccPortfolioPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void viewVarianceForAccPortfolio() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(Orders);
		actions.moveToElement(Orders).perform();

		ElementWait.isElementVisible(VarianceForAccountingPortfolio);
		actions.moveToElement(VarianceForAccountingPortfolio).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(varianceAccPortfolioAutoSugg);
		varianceAccPortfolioAutoSugg.sendKeys(file.getDiscPMSTestData("varianceAccPortfolioAutoSugg"));
		
		List<WebElement> portfList=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		
		for(int i=0; i<portfList.size(); i++) {
			if(portfList.get(i).getText().equalsIgnoreCase(file.getDiscPMSTestData("selectvarianceAccPortfolioAutoSugg")))
				portfList.get(i).click();
			break;
		}
		
		ElementWait.isElementVisible(goBtn);
		goBtn.click();
		
	}
}
