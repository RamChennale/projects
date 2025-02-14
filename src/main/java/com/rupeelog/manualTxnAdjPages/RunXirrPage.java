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

public class RunXirrPage {

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
	
	@FindBy(linkText = "Xirr")
	@CacheLookup 
	private WebElement Xirr;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "familyIdStr")
	@CacheLookup
	private WebElement xirrfamilyAutoSearch;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement xirrStartDate;
	
	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement xirrEndDate;
	
	@FindBy(id = "run")
	@CacheLookup
	private WebElement runXirrBtn;
	
 	public RunXirrPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjRunXirr() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(Xirr);
 		actions.moveToElement(Xirr).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(xirrfamilyAutoSearch);
 		xirrfamilyAutoSearch.sendKeys(file.getAdminTestData("familyName"));
 		
 		List<WebElement> familylist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<familylist.size(); i++) {
 			if(familylist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectfamilyName")));
 			System.out.println(familylist.get(i).getText());
 			familylist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(xirrStartDate);
 		xirrStartDate.sendKeys(file.getAdminTestData("xirrStartDate"));
 		
 		ElementWait.isElementVisible(xirrEndDate);
 		xirrEndDate.sendKeys(file.getAdminTestData("xirrEndDate"));
 		
 		ElementWait.isElementVisible(runXirrBtn);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,runXirrBtn);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println(" Run XIRR status  : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
 	
}