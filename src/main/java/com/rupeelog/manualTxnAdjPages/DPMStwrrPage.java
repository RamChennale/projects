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

public class DPMStwrrPage {

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
	
	@FindBy(linkText = "Rerun DPMS TWRR")
	@CacheLookup 
	private WebElement RerunDPMSTWRR;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "portfolioName")
	@CacheLookup
	private WebElement DPMSportfolioRdBtn;
	
	@FindBy(id = "portfolioIdStr")
	@CacheLookup
	private WebElement DPMSportfolioAutoSugg;
	
	@FindBy(id = "ModelPFolio")
	@CacheLookup
	private WebElement DPMSModelPFolioRdBtn;
	
	@FindBy(id = "modelPortfolios")
	@CacheLookup
	private WebElement DPMSmodelPortfolioDD;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement DPMSstartDate;
	
	@FindBy(id = "go")
	@CacheLookup
	private WebElement goBtnDPMS;
	
	
 	public DPMStwrrPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjDPMStwrrMdlPFolioTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunDPMSTWRR);
 		actions.moveToElement(RerunDPMSTWRR).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		if(!DPMSModelPFolioRdBtn.isSelected())
 			DPMSModelPFolioRdBtn.click();
 		
 		ElementWait.isElementVisible(DPMSmodelPortfolioDD);
 		Select selectDPMSmodelPortfolioDD= new Select(DPMSmodelPortfolioDD);
 		selectDPMSmodelPortfolioDD.selectByVisibleText(file.getAdminTestData("DPMSmodelPortfolioDD"));
 		
 		ElementWait.isElementVisible(DPMSstartDate);
 		DPMSstartDate.sendKeys(file.getAdminTestData("DPMSstartDate"));
 		
 		ElementWait.isElementVisible(goBtnDPMS);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,goBtnDPMS);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("DPMS for Model portfolio  : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
 	
public void manualTxnAdjDPMStwrrPortfolioTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RerunDPMSTWRR);
 		actions.moveToElement(RerunDPMSTWRR).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		if(!DPMSportfolioRdBtn.isSelected())
 			DPMSportfolioRdBtn.click();
 		
 		ElementWait.isElementVisible(DPMSportfolioAutoSugg);
 		DPMSportfolioAutoSugg.sendKeys(file.getAdminTestData("DPMSportfolioAutoSugg"));
 		
 		List<WebElement> pflist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<pflist.size(); i++) {
 			if(pflist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectDPMSportfolioAutoSugg")));
 			System.out.println(pflist.get(i).getText());
 			pflist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(DPMSstartDate);
 		DPMSstartDate.sendKeys(file.getAdminTestData("DPMSstartDate"));
 		
 		ElementWait.isElementVisible(goBtnDPMS);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,goBtnDPMS);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("DPMS for portfolio  :  "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
}
