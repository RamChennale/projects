package com.rupeelog.commonMasterPages;

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

public class CreateIndicesBenchmarkPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Common Master")
	@CacheLookup
	private WebElement CommonMaster;
	
	@FindBy(linkText  = "Indices / Benchmark Values")
	@CacheLookup
	private WebElement IndicesBenchmarkValues;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement IndicesName;
	
	@FindBy(css = "#assetSubClass")
	@CacheLookup
	private WebElement assetSubClassDD;
	
	@FindBy(css = "#code")
	@CacheLookup
	private WebElement code;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	 public CreateIndicesBenchmarkPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void CreateIndicesBenchmarkTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(CommonMaster);
		actions.moveToElement(CommonMaster).perform();
		
		ElementWait.isElementVisible(IndicesBenchmarkValues);
		actions.moveToElement(IndicesBenchmarkValues).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(IndicesName);
		IndicesName.sendKeys(file.getMasterTestData("IndicesName"));
		
		ElementWait.isElementVisible(assetSubClassDD);
		Select selectassetSubClassDD= new Select(assetSubClassDD);
		selectassetSubClassDD.selectByVisibleText(file.getMasterTestData("selectassetSubClassDD"));;
		
		ElementWait.isElementVisible(code);
		code.sendKeys(file.getMasterTestData("code"));

		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" creation Indices Benchmark:"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
