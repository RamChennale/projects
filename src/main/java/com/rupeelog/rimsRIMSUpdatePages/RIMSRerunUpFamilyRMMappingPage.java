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

public class RIMSRerunUpFamilyRMMappingPage {

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

	@FindBy(linkText = "Misc Caln")
	@CacheLookup
	private WebElement RIMSRerun;
	
	@FindBy(id = "familyRmMappingSdate")
	@CacheLookup
	private WebElement familyRmMappingSdate;
	
	@FindBy(id = "familyRmMappingEdate")
	@CacheLookup
	private WebElement familyRmMappingEdate;
	
	@FindBy(xpath = "//button[@value='button4']")
	@CacheLookup
	private WebElement goBtn;

	public RIMSRerunUpFamilyRMMappingPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void rimsRerunUpFamilyRMMapping() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(RIMSUpdate);
		action.moveToElement(RIMSUpdate).perform();

		ElementWait.isElementVisible(RIMSRerun);
		action.moveToElement(RIMSRerun).click().build().perform();
				
		ElementWait.isElementVisible(familyRmMappingSdate);
		familyRmMappingSdate.sendKeys(file.getRIMSTestDat("familyRmMappingSdate"));
		
		ElementWait.isElementVisible(familyRmMappingEdate);
		familyRmMappingEdate.sendKeys(file.getRIMSTestDat("familyRmMappingEdate"));
		
		ElementWait.isElementVisible(goBtn);
		goBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" RIMS Rerun Update Family RM Mapping  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
