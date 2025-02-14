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

public class CreateRTARevTypeMappingPage {

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

	@FindBy(linkText = "RTA Rev Type Mapping")
	@CacheLookup
	private WebElement RTARevTypeMapping;
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "rta")
	@CacheLookup
	private WebElement rtaRevMappingRtaNameDD;
	
	@FindBy(id = "rtaRevCode")
	@CacheLookup
	private WebElement rtaRevMappingRtaRevCode;
	
	@FindBy(id = "caliMfRevTypeId")
	@CacheLookup
	private WebElement rtaRevMappingCaliMfRevTypeId;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
	public CreateRTARevTypeMappingPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createRTARevTypeMapping() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(MFRevenue);
		action.moveToElement(MFRevenue).perform();

		ElementWait.isElementVisible(RTARevTypeMapping);
		action.moveToElement(RTARevTypeMapping).click().build().perform();
		
		ElementWait.scrollToFindElement(driver, createBtn);
		ElementWait.isElementVisible(createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(rtaRevMappingRtaNameDD);
		Select selectrtaRevMappingRtaNameDD= new Select(rtaRevMappingRtaNameDD);
		selectrtaRevMappingRtaNameDD.selectByVisibleText(file.getRIMSTestDat("rtaRevMappingRtaNameDD"));
		
		ElementWait.isElementVisible(rtaRevMappingRtaRevCode);
		rtaRevMappingRtaRevCode.sendKeys(file.getRIMSTestDat("rtaRevMappingRtaRevCode"));
		
		ElementWait.isElementVisible(rtaRevMappingCaliMfRevTypeId);
		Select selectrtaRevMappingCaliMfRevTypeId= new Select(rtaRevMappingCaliMfRevTypeId);
		selectrtaRevMappingCaliMfRevTypeId.selectByVisibleText(file.getRIMSTestDat("rtaRevMappingCaliMfRevTypeId"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("RTA Rev Type mapping creation :  "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
