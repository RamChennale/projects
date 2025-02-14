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

public class FutureM2MPage {

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
	
	@FindBy(linkText = "Rerun Future M2M")
	@CacheLookup 
	private WebElement RerunFutureM2M;
	
	By overlay= By.cssSelector("#loader");
	
	//Client Test
	
	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement futureM2MPfolioAutoSugg;
	
	@FindBy(id = "startDate1")
	@CacheLookup
	private WebElement futureM2MstartDate1Client;
	
	@FindBy(id = "btn1")
	@CacheLookup
	private WebElement submitBtnCurrencyFutureM2MClient;
	
	@FindBy(id = "startDate2")
	@CacheLookup
	private WebElement futureM2MstartDate2AllClient;
	
	@FindBy(id = "btn2")
	@CacheLookup
	private WebElement submitBtnFutureM2MAllClient;
	
	
 	public FutureM2MPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjmentFutureM2MPageClientTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunFutureM2M);
 		actions.moveToElement(RerunFutureM2M).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(futureM2MPfolioAutoSugg);
 		futureM2MPfolioAutoSugg.sendKeys(file.getAdminTestData("futureM2MPfolioAutoSugg"));
 		
 		List<WebElement> pfoliolist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<pfoliolist.size(); i++) {
 			if(pfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectfutureM2MPfolioAutoSugg")));
 			System.out.println(pfoliolist.get(i).getText());
 			pfoliolist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(futureM2MstartDate1Client);
 		futureM2MstartDate1Client.sendKeys(file.getAdminTestData("futureM2MstartDate1Client"));
 		
 		ElementWait.isElementVisible(submitBtnCurrencyFutureM2MClient);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,submitBtnCurrencyFutureM2MClient);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("Future M2M for sigle client   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
 	
public void manualTxnAdjFutureM2MPageAllClientTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunFutureM2M);
 		actions.moveToElement(RerunFutureM2M).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(futureM2MstartDate2AllClient);
 		futureM2MstartDate2AllClient.sendKeys(file.getAdminTestData("futureM2MstartDate2AllClient"));
 		
 		ElementWait.isElementVisible(submitBtnFutureM2MAllClient);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,submitBtnFutureM2MAllClient);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("Future M2M for all client   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
}
