package com.rupeelog.rimsClientFeesPages;


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

public class CreateIntegFeesPostFeesPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "Client Fees")
	@CacheLookup
	private WebElement ClientFees;

	@FindBy(linkText = "7c. Integ.Fees-Post Fees")
	@CacheLookup
	private WebElement IntegFeesPostFees;
	
	@FindBy(id = "selectFeesType")
	@CacheLookup
	private WebElement postFeesFeesTypeDD;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement postFeesChooseDate;

	@FindBy(id = "run")
	@CacheLookup
	private WebElement postEntriesBtn;

	public CreateIntegFeesPostFeesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createIntegFeesPostFees() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(ClientFees);
		action.moveToElement(ClientFees).perform();

		ElementWait.isElementVisible(IntegFeesPostFees);
		action.moveToElement(IntegFeesPostFees).click().build().perform();
		

		ElementWait.isElementVisible(postFeesFeesTypeDD);
		Select selectpostFeesFeesTypeDD= new Select(postFeesFeesTypeDD);
		selectpostFeesFeesTypeDD.selectByVisibleText(file.getRIMSTestDat("postFeesFeesTypeDD"));
		
		ElementWait.isElementVisible(postFeesChooseDate);
		postFeesChooseDate.sendKeys(file.getRIMSTestDat("postFeesChooseDate"));
		
		ElementWait.isElementVisible(postEntriesBtn);
		postEntriesBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Client Fee Post fees : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
