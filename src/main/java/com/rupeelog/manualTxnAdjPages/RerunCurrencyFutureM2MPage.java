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

public class RerunCurrencyFutureM2MPage {

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
	
	@FindBy(linkText = "Rerun Currency Future M2M")
	@CacheLookup 
	private WebElement RerunCurrencyFutureM2M;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement currencyFutureM2MPortfolioAutoSuggSearch;
	
	@FindBy(id = "startDate1")
	@CacheLookup
	private WebElement currencyFutureM2MstartDateClient;
	
	@FindBy(id = "btn1")
	@CacheLookup
	private WebElement submitBtnCurrencyFutureM2MClient;
	
	@FindBy(id = "startDate2")
	@CacheLookup
	private WebElement currencyFutureM2MstartDate2AllClient;
	
	@FindBy(id = "btn2")
	@CacheLookup
	private WebElement submitBtnCurrencyFutureM2MAllClient;
	
	
 	public RerunCurrencyFutureM2MPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjmentRerunCurrencyFutureM2MPageClientTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunCurrencyFutureM2M);
 		actions.moveToElement(RerunCurrencyFutureM2M).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(currencyFutureM2MPortfolioAutoSuggSearch);
 		currencyFutureM2MPortfolioAutoSuggSearch.sendKeys(file.getAdminTestData("currencyFutureM2MPortfolioAutoSuggSearch"));
 		
 		List<WebElement> familylist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<familylist.size(); i++) {
 			if(familylist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectcurrencyFutureM2MPortfolioAutoSuggSearch")));
 			System.out.println(familylist.get(i).getText());
 			familylist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(currencyFutureM2MstartDateClient);
 		currencyFutureM2MstartDateClient.sendKeys(file.getAdminTestData("currencyFutureM2MstartDateClient"));
 		
 		ElementWait.isElementVisible(submitBtnCurrencyFutureM2MClient);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,submitBtnCurrencyFutureM2MClient);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println(" Rerun currency Future M2M for sigle client   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
 	
public void manualTxnAdjmentRerunCurrencyFutureM2MPageAllClientTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunCurrencyFutureM2M);
 		actions.moveToElement(RerunCurrencyFutureM2M).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(currencyFutureM2MstartDate2AllClient);
 		currencyFutureM2MstartDate2AllClient.sendKeys(file.getAdminTestData("cmdityFturM2MstartDateAllClient"));
 		
 		ElementWait.isElementVisible(submitBtnCurrencyFutureM2MAllClient);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,submitBtnCurrencyFutureM2MAllClient);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println(" Rerun currency Future M2M for all client   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
}
