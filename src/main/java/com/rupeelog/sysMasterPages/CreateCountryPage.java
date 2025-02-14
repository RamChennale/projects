package com.rupeelog.sysMasterPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateCountryPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "System Master")
	@CacheLookup
	private WebElement SystemMaster;
	
	@FindBy(linkText  = "Country")
	@CacheLookup
	private WebElement Country;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement CountryName;
	
	@FindBy(id = "shortName")
	@CacheLookup
	private WebElement CountryShortName;
	
	@FindBy(id = "cams")
	@CacheLookup
	private WebElement CountryCamsCode;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
	public  CreateCountryPage(WebDriver driver){
		this.driver=driver;
	}
	
public void createCountryPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(SystemMaster);
		actions.moveToElement(SystemMaster).perform();
		
		ElementWait.isElementVisible(Country);
		actions.moveToElement(Country).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(CountryName);
		CountryName.sendKeys(file.getMasterTestData("CountryName"));
		
		ElementWait.isElementVisible(CountryShortName);
		CountryShortName.sendKeys(file.getMasterTestData("CountryShortName"));

		ElementWait.isElementVisible(CountryCamsCode);
		CountryCamsCode.sendKeys(file.getMasterTestData("CountryCamsCode"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			alert=driver.switchTo().alert();
			System.out.println("Country creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
