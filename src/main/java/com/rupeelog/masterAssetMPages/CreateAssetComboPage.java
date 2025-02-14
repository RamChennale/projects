package com.rupeelog.masterAssetMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateAssetComboPage {
	
	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Asset Master")
	@CacheLookup
	private WebElement Asset_Master;
	
	@FindBy(linkText = "Asset Combo")
	@CacheLookup
	private WebElement Asset_Combo;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#Name")
	@CacheLookup
	private WebElement Name;
	
	@FindBy(css = "#Code")
	@CacheLookup
	private WebElement Code;
	
	@FindBy(css = "#type")
	@CacheLookup
	private WebElement typeDD;
	
	@FindBy(css = "#RiskId")
	@CacheLookup
	private WebElement RiskTypeDD;
	
	@FindBy(css = "#InvHorizonId")
	@CacheLookup
	private WebElement InvHorizonTypeDD;
	
	@FindBy(css = "#ClassificationId")
	@CacheLookup
	private WebElement ClassificationDD;
	
	@FindBy(css = "#IsTaxSaving")
	@CacheLookup
	private WebElement IsTaxSavingDD;
	
	@FindBy(css = "#isDirect")
	@CacheLookup
	private WebElement isDirectDD;
	
	@FindBy(css = "#BenchmarkId")
	@CacheLookup
	private WebElement BenchmarkDD;
	
	@FindBy(css = "#StartDate")
	@CacheLookup
	private WebElement StartDate;
	
	@FindBy(css = "#EndDate")
	@CacheLookup
	private WebElement EndDate;
	
	@FindBy(css = "#remarks")
	@CacheLookup
	private WebElement remarksTextArea;
	
	@FindBy(css = "#ImagePath")
	@CacheLookup
	private WebElement ImagePath;
	
	@FindBy(css = "#orgnId")
	@CacheLookup
	private WebElement orgnDD;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	@FindBy(css = "#cancel")
	@CacheLookup
	private WebElement cancel;
		
	public CreateAssetComboPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public void createAssetCombo() {
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(Asset_Master);
		actions.moveToElement(Asset_Master).perform();
		
		ElementWait.isElementVisible(Asset_Combo);
		actions.moveToElement(Asset_Combo).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(Name);
		Name.sendKeys(file.getMasterData("Name"));
		
		ElementWait.isElementVisible(Code);
		Code.sendKeys(file.getMasterData("AssetComboCode"));
		
		ElementWait.isElementVisible(typeDD);
		Select selecttypeDD= new Select(typeDD);
		selecttypeDD.selectByVisibleText(file.getMasterData("typeDD"));
		
		ElementWait.isElementVisible(RiskTypeDD);
		Select selectRiskTypeDD= new Select(RiskTypeDD);
		selectRiskTypeDD.selectByVisibleText(file.getMasterData("RiskTypeDD"));
		
		ElementWait.isElementVisible(InvHorizonTypeDD);
		Select selectInvHorizonTypeDD= new Select(InvHorizonTypeDD);
		selectInvHorizonTypeDD.selectByVisibleText(file.getMasterData("InvHorizonTypeDD"));
		
		ElementWait.isElementVisible(ClassificationDD);
		Select selectClassificationDD= new Select(ClassificationDD);
		selectClassificationDD.selectByVisibleText(file.getMasterData("ClassificationDD"));
		
		ElementWait.isElementVisible(IsTaxSavingDD);
		Select selectIsTaxSavingDD= new Select(IsTaxSavingDD);
		selectIsTaxSavingDD.selectByVisibleText(file.getMasterData("IsTaxSavingDD"));
		
		ElementWait.isElementVisible(isDirectDD);
		Select selectisDirectDD= new Select(IsTaxSavingDD);
		selectisDirectDD.selectByVisibleText(file.getMasterData("isDirectDD"));
		
		ElementWait.isElementVisible(BenchmarkDD);
		Select selectBenchmarkDD= new Select(BenchmarkDD);
		selectBenchmarkDD.selectByVisibleText(file.getMasterData("BenchmarkDD"));
		
		
		ElementWait.isElementVisible(StartDate);
		StartDate.sendKeys(file.getMasterData("StartDate"));
		
		ElementWait.isElementVisible(EndDate);
		EndDate.sendKeys(file.getMasterData("EndDate"));
		
		ElementWait.isElementVisible(remarksTextArea);
		remarksTextArea.sendKeys(file.getMasterData("remarksTextArea"));
		
		/*
		 * ElementWait.isElementVisible(ImagePath);
		 * ImagePath.sendKeys(file.getMasterData("ImagePath"));
		 */
		
		ElementWait.isElementVisible(orgnDD);
		Select selectorgnDD= new Select(orgnDD);
		selectorgnDD.selectByVisibleText(file.getMasterData("orgnDD"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
	}
}
