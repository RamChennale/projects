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

public class MFTrailFeesExcepCalPage {

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

	@FindBy(linkText = "2.b. MF Fees Exception Calculation")
	@CacheLookup
	private WebElement MFFeesExceptionCalculation;
	
	@FindBy(id = "mfTrailSdate")
	@CacheLookup
	private WebElement mfTrailExcepSdate;
	
	@FindBy(id = "mfTrailEdate")
	@CacheLookup
	private WebElement mfTrailExcepEdate;
	
	@FindBy(xpath = "//*[@onclick='button1(); ']")
	@CacheLookup
	private WebElement goBtn;
	
	public MFTrailFeesExcepCalPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void mfTrailFeesExcepCal() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(MFRevenue);
		action.moveToElement(MFRevenue).perform();

		ElementWait.isElementVisible(MFFeesExceptionCalculation);
		action.moveToElement(MFFeesExceptionCalculation).click().build().perform();
		
		ElementWait.isElementVisible(mfTrailExcepSdate);
		mfTrailExcepSdate.sendKeys(file.getRIMSTestDat("mfTrailExcepSdate"));
		
		ElementWait.isElementVisible(mfTrailExcepEdate);
		mfTrailExcepEdate.sendKeys(file.getRIMSTestDat("mfTrailExcepEdate"));
		
		ElementWait.isElementVisible(goBtn);
		goBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("MF Trail Fees exception Calculation : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
