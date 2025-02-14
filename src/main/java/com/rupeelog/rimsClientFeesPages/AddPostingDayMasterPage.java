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

public class AddPostingDayMasterPage {

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

	@FindBy(linkText = "1. Posting Day (Master)")
	@CacheLookup
	private WebElement PostingDayMaster;
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "postingDate")
	@CacheLookup
	private WebElement feePosting;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement effectiveDate;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public AddPostingDayMasterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clientFeePostingDayMaster() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(ClientFees);
		action.moveToElement(ClientFees).perform();

		ElementWait.isElementVisible(PostingDayMaster);
		action.moveToElement(PostingDayMaster).click().build().perform();
		
		ElementWait.isElementVisible(createBtn);
		createBtn.click();

		ElementWait.isElementVisible(feePosting);
		Select selectfeePosting= new Select(feePosting);
		selectfeePosting.selectByVisibleText(file.getRIMSTestDat("feePosting"));
		
		ElementWait.isElementVisible(effectiveDate);
		effectiveDate.sendKeys(file.getRIMSTestDat("effectiveDate"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Client Fee Posting Day Master : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
