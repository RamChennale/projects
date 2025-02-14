package com.rupeelog.rimsMFRevenuePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class MFTrailFeesCalPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "MF Revenue")
	@CacheLookup
	private WebElement MFRevenue;

	@FindBy(linkText = "2.a. MF Fees Calculation")
	@CacheLookup
	private WebElement MFFeesCalculation;
	
	@FindBy(id = "mfTrailSdate")
	@CacheLookup
	private WebElement mfTrailSdate;
	
	@FindBy(id = "mfTrailEdate")
	@CacheLookup
	private WebElement mfTrailEdate;
	
	@FindBy(xpath = "//*[@onclick='button1(); ']")
	@CacheLookup
	private WebElement goBtn;
	
	public MFTrailFeesCalPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void mfTrailFeesCalculation() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(MFRevenue);
		action.moveToElement(MFRevenue).perform();

		ElementWait.isElementVisible(MFFeesCalculation);
		action.moveToElement(MFFeesCalculation).click().build().perform();
		
		ElementWait.isElementVisible(mfTrailSdate);
		mfTrailSdate.sendKeys(file.getRIMSTestDat("mfTrailSdate"));
		
		ElementWait.isElementVisible(mfTrailEdate);
		mfTrailEdate.sendKeys(file.getRIMSTestDat("mfTrailEdate"));
		
		ElementWait.isElementVisible(goBtn);
		goBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("MF Trail Fees Calculation : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
