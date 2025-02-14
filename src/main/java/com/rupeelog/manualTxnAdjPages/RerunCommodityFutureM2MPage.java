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

public class RerunCommodityFutureM2MPage {

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
	
	@FindBy(linkText = "Rerun Commodity Future M2M")
	@CacheLookup 
	private WebElement RerunCommodityFutureM2M;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement cmdityFturM2MPortfolioAutoSuggSearch;
	
	@FindBy(id = "startDate1")
	@CacheLookup
	private WebElement cmdityFturM2MstartDateClient;
	
	@FindBy(id = "btn1")
	@CacheLookup
	private WebElement runRerunComdtyFutureM2MBtnClient;
	
	@FindBy(id = "startDate2")
	@CacheLookup
	private WebElement cmdityFturM2MstartDateAllClient;
	
	@FindBy(id = "btn2")
	@CacheLookup
	private WebElement runRerunComdtyFutureM2MBtnAllClient;
	
	
 	public RerunCommodityFutureM2MPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjmentRerunComdtyFutureM2MPageClientTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunCommodityFutureM2M);
 		actions.moveToElement(RerunCommodityFutureM2M).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		
 		ElementWait.isElementVisible(cmdityFturM2MPortfolioAutoSuggSearch);
 		cmdityFturM2MPortfolioAutoSuggSearch.sendKeys(file.getAdminTestData("cmdityFturM2MPortfolioAutoSuggSearch"));
 		
 		List<WebElement> familylist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<familylist.size(); i++) {
 			if(familylist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectcmdityFturM2MPortfolioAutoSuggSearch")));
 			System.out.println(familylist.get(i).getText());
 			familylist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(cmdityFturM2MstartDateClient);
 		cmdityFturM2MstartDateClient.sendKeys(file.getAdminTestData("cmdityFturM2MstartDateClient"));
 		
 		ElementWait.isElementVisible(runRerunComdtyFutureM2MBtnClient);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,runRerunComdtyFutureM2MBtnClient);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println(" Rerun Commodity Future M2M for sigle client   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
 	
public void manualTxnAdjmentRerunComdtyFutureM2MPageAllClientTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunCommodityFutureM2M);
 		actions.moveToElement(RerunCommodityFutureM2M).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(cmdityFturM2MstartDateAllClient);
 		cmdityFturM2MstartDateAllClient.sendKeys(file.getAdminTestData("cmdityFturM2MstartDateAllClient"));
 		
 		ElementWait.isElementVisible(runRerunComdtyFutureM2MBtnAllClient);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,runRerunComdtyFutureM2MBtnAllClient);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println(" Rerun Commodity Future M2M for all client   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
}
