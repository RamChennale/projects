package com.rupeelog.rimsClientFeesPages;


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

public class CreateFeesPostingFreqPage {

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

	@FindBy(linkText = "2. Fees Posting Frequency (Master)")
	@CacheLookup
	private WebElement FeesPostingFrequencyMaster;
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "selectFeesType")
	@CacheLookup
	private WebElement fpfFeesTypeDD;

	@FindBy(xpath = "//input[@value='F']")
	@CacheLookup
	private WebElement fpfFamilyRdoBtn;
	
	@FindBy(id = "familyIdStr")
	@CacheLookup
	private WebElement fpffamilyAutoSugg;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement fpfStartDate;
	
	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement fpfEndDate;
	
	@FindBy(id = "frequency")
	@CacheLookup
	private WebElement fpfFrequencyDD;
	
	@FindBy(id = "run")
	@CacheLookup
	private WebElement saveBtn;

	public CreateFeesPostingFreqPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clientFeePostingDayMaster() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(ClientFees);
		action.moveToElement(ClientFees).perform();

		ElementWait.isElementVisible(FeesPostingFrequencyMaster);
		action.moveToElement(FeesPostingFrequencyMaster).click().build().perform();
		
		ElementWait.isElementVisible(createBtn);
		createBtn.click();

		ElementWait.isElementVisible(fpfFeesTypeDD);
		Select selectfpfFeesTypeDD= new Select(fpfFeesTypeDD);
		selectfpfFeesTypeDD.selectByVisibleText(file.getRIMSTestDat("fpfFeesTypeDD"));
		
		ElementWait.isElementVisible(fpfFamilyRdoBtn);
		if(fpfFamilyRdoBtn.isSelected())
			System.out.println("Family rdo btn already selected");
		fpfFamilyRdoBtn.click();
		
		ElementWait.isElementVisible(fpffamilyAutoSugg);
		fpffamilyAutoSugg.sendKeys(file.getRIMSTestDat("fpffamilyAutoSugg"));
		
		List<WebElement> familyList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-3']//li")));
		
		for(int i=0; i<familyList.size(); i++) {
			if(familyList.get(i).getText().equalsIgnoreCase(file.getRIMSTestDat("selectfpffamilyAutoSugg")))
				familyList.get(i).click();
			System.out.println(familyList.get(i).getText());
			break;
		}
		
		ElementWait.isElementVisible(fpfStartDate);
		fpfStartDate.sendKeys(file.getRIMSTestDat("fpfStartDate"));
		
		ElementWait.isElementVisible(fpfEndDate);
		fpfEndDate.sendKeys(file.getRIMSTestDat("fpfEndDate"));
		
		ElementWait.isElementVisible(fpfFrequencyDD);
		Select selectfpfFrequencyDD= new Select(fpfFrequencyDD);
		selectfpfFrequencyDD.selectByVisibleText(file.getRIMSTestDat("fpfFrequencyDD"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Client Fee Posting frequency : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
