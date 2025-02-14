package com.rupeelog.fpAdminPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class AddHouseRecdPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "FP Admin")
	@CacheLookup
	private WebElement FPAdmin;

	@FindBy(linkText = "House Reco (Asset Subclass)")
	@CacheLookup
	private WebElement HouseRecoAssetSubclass;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "addhouseRecom")
	@CacheLookup
	private WebElement AddHouseRecomBtn;

	@FindBy(id = "assetSubClassId")
	@CacheLookup
	private WebElement hrAssetSubclassDD;

	@FindBy(id = "issuerId")
	@CacheLookup
	private WebElement hrIssuer;

	@FindBy(id = "debtAssetId")
	@CacheLookup
	private WebElement hrInstNameDD;
	
	@FindBy(id = "shortTerm")
	@CacheLookup
	private WebElement hrShortTermDD;
	
	@FindBy(id = "mediumTerm")
	@CacheLookup
	private WebElement hrMediumTermDD;
	
	@FindBy(id = "longTerm")
	@CacheLookup
	private WebElement hrLongTermDD;
	
	@FindBy(id = "status")
	@CacheLookup
	private WebElement hrStatusDD;
	
	@FindBy(id = "comment")
	@CacheLookup
	private WebElement hrComment;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public AddHouseRecdPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addHouseRecomendation() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(HouseRecoAssetSubclass);
		actions.moveToElement(HouseRecoAssetSubclass).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, AddHouseRecomBtn);
		AddHouseRecomBtn.click();

		ElementWait.isElementVisible(hrAssetSubclassDD);
		Select selecthrAssetSubclassDD= new Select(hrAssetSubclassDD);
		selecthrAssetSubclassDD.selectByVisibleText(file.getDiscPMSTestData("hrAssetSubclassDD"));

		ElementWait.isElementVisible(hrIssuer);
		Select selecthrIssuer= new Select(hrIssuer);
		selecthrIssuer.selectByVisibleText(file.getDiscPMSTestData("hrIssuer"));

		ElementWait.isElementVisible(hrInstNameDD);
		Select selecthrInstNameDD= new Select(hrInstNameDD);
		selecthrInstNameDD.selectByVisibleText(file.getDiscPMSTestData("hrInstNameDD"));

		ElementWait.isElementVisible(hrShortTermDD);
		Select selecthrShortTermDD= new Select(hrShortTermDD);
		selecthrShortTermDD.selectByVisibleText(file.getDiscPMSTestData("hrShortTermDD"));

		ElementWait.isElementVisible(hrMediumTermDD);
		Select selecthrMediumTermDD= new Select(hrMediumTermDD);
		selecthrMediumTermDD.selectByVisibleText(file.getDiscPMSTestData("hrMediumTermDD"));

		ElementWait.isElementVisible(hrLongTermDD);
		Select selecthrLongTermDD= new Select(hrLongTermDD);
		selecthrLongTermDD.selectByVisibleText(file.getDiscPMSTestData("hrLongTermDD"));

		ElementWait.isElementVisible(hrStatusDD);
		Select selecthrStatusDD= new Select(hrStatusDD);
		selecthrStatusDD.selectByVisibleText(file.getDiscPMSTestData("hrStatusDD"));
		
		ElementWait.isElementVisible(hrComment);
		hrComment.sendKeys(file.getDiscPMSTestData("hrComment"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
	}
}
