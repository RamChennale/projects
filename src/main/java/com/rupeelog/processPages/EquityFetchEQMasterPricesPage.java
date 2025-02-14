package com.rupeelog.processPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class EquityFetchEQMasterPricesPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Equity")
	@CacheLookup
	private WebElement Equity;

	@FindBy(linkText = "Fetch Prices for Equity Masters")
	@CacheLookup
	private WebElement FetchPricesforEquityMasters;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "run")
	@CacheLookup
	private WebElement fetchEQPriceBtn;

	public EquityFetchEQMasterPricesPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void equityFetchEQMasterPrices() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Equity);
		action.moveToElement(Equity).perform();

		ElementWait.isElementVisible(FetchPricesforEquityMasters);
		action.moveToElement(FetchPricesforEquityMasters).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(fetchEQPriceBtn);
		ElementWait.scrollToFindElement(driver, fetchEQPriceBtn);
		fetchEQPriceBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" Fetch Prices for Equity Masters : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
