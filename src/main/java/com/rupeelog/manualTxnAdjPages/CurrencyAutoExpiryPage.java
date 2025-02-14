package com.rupeelog.manualTxnAdjPages;

import java.util.List;

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
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class CurrencyAutoExpiryPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;
	
	@FindBy(linkText = "Manual Txn Adjustments")
	@CacheLookup
	private WebElement ManualTxnAdjustments;
	
	@FindBy(linkText = "Rerun Currency Option Auto Expiry")
	@CacheLookup 
	private WebElement RerunCurrencyOptionAutoExpiry;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement currencyOptPortfolioAutoSugg;
	
	@FindBy(id = "startDate1")
	@CacheLookup
	private WebElement currencyOptStartDate1Client;
	
	@FindBy(id = "btn1")
	@CacheLookup
	private WebElement submitBtnCurrencyOptClient;
	
	@FindBy(id = "startDate2")
	@CacheLookup
	private WebElement currencyOptStartDate2AllClient;
	
	@FindBy(id = "btn2")
	@CacheLookup
	private WebElement submitBtnCurrencyOptAllClient;
	
	
 	public CurrencyAutoExpiryPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjCurrencyAutoExpiryClientTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunCurrencyOptionAutoExpiry);
 		actions.moveToElement(RerunCurrencyOptionAutoExpiry).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(currencyOptPortfolioAutoSugg);
 		currencyOptPortfolioAutoSugg.sendKeys(file.getAdminTestData("currencyOptPortfolioAutoSugg"));
 		
 		List<WebElement> portfoliolist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<portfoliolist.size(); i++) {
 			if(portfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectcurrencyOptPortfolioAutoSugg")));
 			System.out.println(portfoliolist.get(i).getText());
 			portfoliolist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(currencyOptStartDate1Client);
 		currencyOptStartDate1Client.sendKeys(file.getAdminTestData("currencyOptStartDate1Client"));
 		
 		ElementWait.isElementVisible(submitBtnCurrencyOptClient);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,submitBtnCurrencyOptClient);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println(" Rerun currency Option Auto expiry for sigle client   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
 	
public void manualTxnAdjCurrencyAutoExpiryAllClientTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunCurrencyOptionAutoExpiry);
 		actions.moveToElement(RerunCurrencyOptionAutoExpiry).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(currencyOptStartDate2AllClient);
 		currencyOptStartDate2AllClient.sendKeys(file.getAdminTestData("currencyOptStartDate2AllClient"));
 		
 		ElementWait.isElementVisible(submitBtnCurrencyOptAllClient);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,submitBtnCurrencyOptAllClient);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println(" Rerun currency option auto expiry for all client   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
}
