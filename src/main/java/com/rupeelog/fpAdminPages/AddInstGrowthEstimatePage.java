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

public class AddInstGrowthEstimatePage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "FP Admin")
	@CacheLookup
	private WebElement FPAdmin;

	@FindBy(linkText = "Instrument Growth Estimate")
	@CacheLookup
	private WebElement InstrumentGrowthEstimate;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "addInstrumentGE")
	@CacheLookup
	private WebElement addInstGrowthEstimateBtn;

	@FindBy(id = "assetSubClassId")
	@CacheLookup
	private WebElement igrAssetSubclassDD;

	@FindBy(id = "issuerId")
	@CacheLookup
	private WebElement igrIssuerDD;
	
	@FindBy(id = "debtAssetId")
	@CacheLookup
	private WebElement igrInstDD;
	
	@FindBy(id = "meanGrowthRate")
	@CacheLookup
	private WebElement igrMeanGrowthRate;

	@FindBy(id = "effDate")
	@CacheLookup
	private WebElement igrEffDate;
	
	@FindBy(id = "min")
	@CacheLookup
	private WebElement igrMin;
	
	@FindBy(id = "max")
	@CacheLookup
	private WebElement igrMax;
	
	@FindBy(id = "median")
	@CacheLookup
	private WebElement igrMedian;
	
	@FindBy(id = "standardDeviation")
	@CacheLookup
	private WebElement igrStandardDeviation;

	@FindBy(id = "comment")
	@CacheLookup
	private WebElement igrComment;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public AddInstGrowthEstimatePage(WebDriver driver) {
		this.driver = driver;
	}

	public void addInstGrowthEstimate() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(InstrumentGrowthEstimate);
		actions.moveToElement(InstrumentGrowthEstimate).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, addInstGrowthEstimateBtn);
		addInstGrowthEstimateBtn.click();

		ElementWait.isElementVisible(igrAssetSubclassDD);
		Select selectigrAssetSubclassDD= new Select(igrAssetSubclassDD);
		selectigrAssetSubclassDD.selectByVisibleText(file.getDiscPMSTestData("igrAssetSubclassDD"));

		ElementWait.isElementVisible(igrIssuerDD);
		Select selectigrIssuerDD= new Select(igrIssuerDD);
		selectigrIssuerDD.selectByVisibleText(file.getDiscPMSTestData("igrIssuerDD"));

		ElementWait.isElementVisible(igrInstDD);
		Select selectigrInstDD= new Select(igrInstDD);
		selectigrInstDD.selectByVisibleText(file.getDiscPMSTestData("igrInstDD"));

		ElementWait.isElementVisible(igrMeanGrowthRate);
		igrMeanGrowthRate.sendKeys(file.getDiscPMSTestData("igrMeanGrowthRate"));

		ElementWait.isElementVisible(igrEffDate);
		igrEffDate.sendKeys(file.getDiscPMSTestData("igrEffDate"));

		ElementWait.isElementVisible(igrMin);
		igrMin.sendKeys(file.getDiscPMSTestData("igrMin"));

		ElementWait.isElementVisible(igrMax);
		igrMax.sendKeys(file.getDiscPMSTestData("igrMax"));

		ElementWait.isElementVisible(igrMedian);
		igrMedian.sendKeys(file.getDiscPMSTestData("igrMedian"));

		ElementWait.isElementVisible(igrStandardDeviation);
		igrStandardDeviation.sendKeys(file.getDiscPMSTestData("igrStandardDeviation"));

		ElementWait.isElementVisible(igrComment);
		igrComment.sendKeys(file.getDiscPMSTestData("igrComment"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
	}
}
