package com.rupeelog.rimsMFRevenuePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class RTARevenueFileProcessPage {

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

	@FindBy(linkText = "3. RTA Revenue Files")
	@CacheLookup
	private WebElement RTARevenueFiles;
	
	@FindBy(id = "rimsRtaType")
	@CacheLookup
	private WebElement rtaRevFRIMSRtaTypeDD;
	
	@FindBy(id = "orgnId")
	@CacheLookup
	private WebElement rtaRevFOrg;
	
	@FindBy(id = "process")
	@CacheLookup
	private WebElement processBtn;
	
	public RTARevenueFileProcessPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void rtaRevenueFileProcess() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(MFRevenue);
		action.moveToElement(MFRevenue).perform();

		ElementWait.isElementVisible(RTARevenueFiles);
		action.moveToElement(RTARevenueFiles).click().build().perform();
		
		ElementWait.isElementVisible(rtaRevFRIMSRtaTypeDD);
		Select selectrtaRevFRIMSRtaTypeDD= new Select(rtaRevFRIMSRtaTypeDD);
		selectrtaRevFRIMSRtaTypeDD.selectByVisibleText(file.getRIMSTestDat("rtaRevFRIMSRtaTypeDD"));
		
		ElementWait.isElementVisible(rtaRevFOrg);
		Select selectrtaRevFOrg= new Select(rtaRevFOrg);
		selectrtaRevFOrg.selectByVisibleText(file.getRIMSTestDat("rtaRevFOrg"));
		
		ElementWait.isElementVisible(processBtn);
		processBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("RTA Revenue File Process  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
