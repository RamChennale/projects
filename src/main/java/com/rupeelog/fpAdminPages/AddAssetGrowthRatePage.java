package com.rupeelog.fpAdminPages;

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
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class AddAssetGrowthRatePage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "FP Admin")
	@CacheLookup
	private WebElement FPAdmin;

	@FindBy(linkText = "Asset Sub Class Growth Estimate")
	@CacheLookup
	private WebElement AssetSubClassGrowthEstimate;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "addClassificationGE")
	@CacheLookup
	private WebElement addGrowthEstimateBtn;

	@FindBy(id = "classificationId")
	@CacheLookup
	private WebElement agrAssetSubclassDD;

	@FindBy(id = "meanGrowthRate")
	@CacheLookup
	private WebElement agrMeanGrowthRate;

	@FindBy(id = "effDate")
	@CacheLookup
	private WebElement agrEffDate;
	
	@FindBy(id = "min")
	@CacheLookup
	private WebElement agrMin;
	
	@FindBy(id = "max")
	@CacheLookup
	private WebElement agrMax;
	
	@FindBy(id = "median")
	@CacheLookup
	private WebElement agrMedian;
	
	@FindBy(id = "standardDeviation")
	@CacheLookup
	private WebElement agrStandardDeviation;

	@FindBy(id = "comment")
	@CacheLookup
	private WebElement agrComment;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public AddAssetGrowthRatePage(WebDriver driver) {
		this.driver = driver;
	}

	public void addAssetGrowthRate() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(AssetSubClassGrowthEstimate);
		actions.moveToElement(AssetSubClassGrowthEstimate).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, addGrowthEstimateBtn);
		addGrowthEstimateBtn.click();

		ElementWait.isElementVisible(agrAssetSubclassDD);
		Select selectagrAssetSubclassDD= new Select(agrAssetSubclassDD);
		selectagrAssetSubclassDD.selectByVisibleText(file.getDiscPMSTestData("agrAssetSubclassDD"));

		ElementWait.isElementVisible(agrMeanGrowthRate);
		agrMeanGrowthRate.sendKeys(file.getDiscPMSTestData("agrMeanGrowthRate"));

		ElementWait.isElementVisible(agrEffDate);
		agrEffDate.sendKeys(file.getDiscPMSTestData("agrEffDate"));

		ElementWait.isElementVisible(agrMin);
		agrMin.sendKeys(file.getDiscPMSTestData("agrMin"));

		ElementWait.isElementVisible(agrMax);
		agrMax.sendKeys(file.getDiscPMSTestData("agrMax"));

		ElementWait.isElementVisible(agrMedian);
		agrMedian.sendKeys(file.getDiscPMSTestData("agrMedian"));

		ElementWait.isElementVisible(agrStandardDeviation);
		agrStandardDeviation.sendKeys(file.getDiscPMSTestData("agrStandardDeviation"));

		ElementWait.isElementVisible(agrComment);
		agrComment.sendKeys(file.getDiscPMSTestData("agrComment"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
	}
}
