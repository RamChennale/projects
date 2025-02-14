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

public class CreateRevTypeMasterPage {

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

	@FindBy(linkText = "Rev Type Master")
	@CacheLookup
	private WebElement RevTypeMaster;
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement RevTypeMasName;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
	public CreateRevTypeMasterPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createRevTypeMaster() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(MFRevenue);
		action.moveToElement(MFRevenue).perform();

		ElementWait.isElementVisible(RevTypeMaster);
		action.moveToElement(RevTypeMaster).click().build().perform();
		
		ElementWait.isElementVisible(createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(RevTypeMasName);
		RevTypeMasName.sendKeys(file.getRIMSTestDat("RevTypeMasName"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Rev Type Master creation :  "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
