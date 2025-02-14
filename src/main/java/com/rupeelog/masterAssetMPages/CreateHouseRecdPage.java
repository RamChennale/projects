package com.rupeelog.masterAssetMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateHouseRecdPage {
	
	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Asset Master")
	@CacheLookup
	private WebElement Asset_Master;
	
	@FindBy(xpath = "//a[text()='House Recommendation']")
	@CacheLookup
	private WebElement House_Recommendation;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#houseReco")
	@CacheLookup
	private WebElement houseReco;
	
	@FindBy(css = "#Code")
	@CacheLookup
	private WebElement Code;
	
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	@FindBy(css = "#cancel")
	@CacheLookup
	private WebElement cancel;
		
	public CreateHouseRecdPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public void createHouseRecomendation() {
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(Asset_Master);
		actions.moveToElement(Asset_Master).perform();
		
		ElementWait.isElementVisible(House_Recommendation);
		actions.moveToElement(House_Recommendation).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(houseReco);
		houseReco.sendKeys(file.getMasterData("houseReco"));
		
		ElementWait.isElementVisible(Code);
		Code.sendKeys(file.getMasterData("houseRecoCode"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
	}
}
