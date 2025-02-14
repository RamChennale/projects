package com.rupeelog.rimsRIMSUpdatePages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class RimsBSplitRevenuePage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "RIMS Update")
	@CacheLookup
	private WebElement RIMSUpdate;

	@FindBy(linkText = "RM Wise Rev Split(B)")
	@CacheLookup
	private WebElement RMWiseRevSplitB;
	
	@FindBy(id = "panString")
	@CacheLookup
	private WebElement RimsBFamilyId;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement RimsBstartDate;
	
	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement RimsBendDate;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement processBtn;
	
	public RimsBSplitRevenuePage(WebDriver driver){
		this.driver=driver;
	}
	
	public void processRimsBSplitRevenue() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(RIMSUpdate);
		action.moveToElement(RIMSUpdate).perform();

		ElementWait.isElementVisible(RMWiseRevSplitB);
		action.moveToElement(RMWiseRevSplitB).click().build().perform();
				
		ElementWait.isElementVisible(RimsBFamilyId);
		RimsBFamilyId.sendKeys(file.getRIMSTestDat("RimsBFamilyId"));
		
		ElementWait.isElementVisible(RimsBstartDate);
		RimsBstartDate.sendKeys(file.getRIMSTestDat("RimsBstartDate"));
		
		ElementWait.isElementVisible(RimsBendDate);
		RimsBendDate.sendKeys(file.getRIMSTestDat("RimsBendDate"));
		
		ElementWait.isElementVisible(processBtn);
		processBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" RIMS B split rev process  : "+alert.getText());
			alert.accept();
			
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("  RIMS B split rev process : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
