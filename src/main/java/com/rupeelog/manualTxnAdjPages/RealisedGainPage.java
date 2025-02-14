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
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class RealisedGainPage {

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
	
	@FindBy(linkText = "Rerun Realised Gain")
	@CacheLookup 
	private WebElement RerunRealisedGain;
	
	By overlay= By.cssSelector("#loader");
	
	//Portfolio Test (Run Future(Equity, Currency, Commodity) Realised Gain Process For a Portfolio)
	
	@FindBy(id = "clientIdStr2")
	@CacheLookup
	private WebElement rgPfolioAutoSugg1;
	
	@FindBy(id = "portFolioRun")
	@CacheLookup
	private WebElement runBtnportFolio;
	
	//Run Future Realised Gain Process For a Portfolio and Asset Combination
	
	@FindBy(id = "clientIdStr1")
	@CacheLookup
	private WebElement rgPfolioAutoSugg2;
	
	@FindBy(id = "script2")
	@CacheLookup
	private WebElement rgUnderScript;
	
	@FindBy(xpath = "//input[@type='button' and @value='Search']")
	@CacheLookup
	private WebElement SearchBtn;
	
	@FindBy(id = "futureAssetId2")
	@CacheLookup
	private WebElement rgfutureListDD;
	
	@FindBy(id = "expiryId2")
	@CacheLookup
	private WebElement rgexpiryDD;
	
	@FindBy(id = "btn3")
	@CacheLookup
	private WebElement rgrunBtn2;
	
	//Run Equity/MF/Debt/MA Realised Gain Process For a Portfolio
	
	@FindBy(id = "clientIdStreq3")
	@CacheLookup
	private WebElement rgPfolioAutoSugg3;
	
	@FindBy(id = "portFolioRun1")
	@CacheLookup
	private WebElement rgrunBtn3;
	
 	public RealisedGainPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjRunRGPfolioTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunRealisedGain);
 		actions.moveToElement(RerunRealisedGain).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(rgPfolioAutoSugg1);
 		rgPfolioAutoSugg1.sendKeys(file.getAdminTestData("rgPfolioAutoSugg1"));
 		
 		List<WebElement> pfoliolist= driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
 		
 		for(int i=0; i<pfoliolist.size(); i++) {
 			if(pfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectrgPfolioAutoSugg1")));
 			System.out.println(pfoliolist.get(i).getText());
 			pfoliolist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(runBtnportFolio);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,runBtnportFolio);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("Run Realised gain portfolio : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
 	
public void manualTxnAdjRunRGPfolioAssetTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunRealisedGain);
 		actions.moveToElement(RerunRealisedGain).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(rgPfolioAutoSugg2);
 		rgPfolioAutoSugg2.sendKeys(file.getAdminTestData("portfolio"));
 		
List<WebElement> pfoliolist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<pfoliolist.size(); i++) {
 			if(pfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectPortfolio")));
 			System.out.println(pfoliolist.get(i).getText());
 			pfoliolist.get(i).click();
 			break;
 		}

 		ElementWait.isElementVisible(rgUnderScript);
 		rgUnderScript.sendKeys(file.getAdminTestData("rgUnderScript"));
 		
 		ElementWait.isElementVisible(SearchBtn);
 		SearchBtn.click();
 		
 		ElementWait.isElementVisible(rgfutureListDD);
 		Select selectrgfutureListDD= new Select(rgfutureListDD);
 		selectrgfutureListDD.selectByVisibleText(file.getAdminTestData("rgfutureListDD"));
 		
 		ElementWait.isElementVisible(rgexpiryDD);
 		Select selectrgexpiryDD= new Select(rgexpiryDD);
 		selectrgexpiryDD.selectByVisibleText(file.getAdminTestData("rgexpiryDD"));

 		ElementWait.isElementVisible(rgrunBtn2);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,rgrunBtn2);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("Rerun Realised gain Portfolio and asset   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}

public void manualTxnAdjRunEQMfMaDt() {
	actions= new Actions(driver);
		file= new FileReaderUtility();
		
		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();
	
		ElementWait.isElementVisible(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();
		
		ElementWait.isElementVisible(RerunRealisedGain);
		actions.moveToElement(RerunRealisedGain).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, rgrunBtn3);
		
		ElementWait.isElementVisible(rgPfolioAutoSugg3);
		rgPfolioAutoSugg3.sendKeys(file.getAdminTestData("portfolio"));
		
List<WebElement> pfoliolist= driver.findElements(By.xpath("//ul[@id='ui-id-3']//li"));
		
		for(int i=0; i<pfoliolist.size(); i++) {
			if(pfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectPortfolio")));
			System.out.println(pfoliolist.get(i).getText());
			pfoliolist.get(i).click();
			break;
		}

		ElementWait.isElementVisible(rgrunBtn3);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,rgrunBtn3);
	
		try {
		alert=driver.switchTo().alert();
		System.out.println("Rerun Realised gain EQ MA MF Debt   : "+alert.getText());
		alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
}
}
