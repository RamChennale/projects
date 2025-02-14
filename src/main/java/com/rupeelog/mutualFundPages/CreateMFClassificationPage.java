package com.rupeelog.mutualFundPages;

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

public class CreateMFClassificationPage {

	
	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Mutual Fund")
	@CacheLookup
	private WebElement MutualFund;
	
	@FindBy(linkText  = "MF Classification")
	@CacheLookup
	private WebElement MFClassification;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement MFClassificationName;
	
	@FindBy(css = "#isLiquid")
	@CacheLookup
	private WebElement isLiquidDD;
	
	@FindBy(css = "#shortName")
	@CacheLookup
	private WebElement MFClassificationShortName;
	
	@FindBy(css = "#subCategory")
	@CacheLookup
	private WebElement MFClassificationSubCategory;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateMFClassificationPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void CreateMFClassificationPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(MutualFund);
		actions.moveToElement(MutualFund).perform();
		
		ElementWait.isElementVisible(MFClassification);
		actions.moveToElement(MFClassification).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(MFClassificationName);
		MFClassificationName.sendKeys(file.getMasterTestData("MFClassificationName"));
		
		ElementWait.isElementVisible(isLiquidDD);
		Select selectisLiquidDD= new Select(isLiquidDD);
		selectisLiquidDD.selectByVisibleText(file.getMasterTestData("isLiquidDD"));
		
		ElementWait.isElementVisible(MFClassificationShortName);
		MFClassificationShortName.sendKeys(file.getMasterTestData("MFClassificationShortName"));
		
		ElementWait.isElementVisible(MFClassificationSubCategory);
		MFClassificationSubCategory.sendKeys(file.getMasterData("MFClassificationSubCategory"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("MF Classification creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
