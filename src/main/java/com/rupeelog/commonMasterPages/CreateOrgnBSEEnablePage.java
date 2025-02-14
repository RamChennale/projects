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

public class CreateOrgnBSEEnablePage {
	
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
	
	@FindBy(linkText  = "Orgn BSE Enable")
	@CacheLookup
	private WebElement OrgnBSEEnable;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#orgnId")
	@CacheLookup
	private WebElement orgnDD;
	
	@FindBy(css = "#isCtfEnable")
	@CacheLookup
	private WebElement isCtfEnable;
	
	@FindBy(css = "#ctfDirect")
	@CacheLookup
	private WebElement ctfDirect;
	
	@FindBy(css = "#ctfRegular")
	@CacheLookup
	private WebElement ctfRegular;
	
	@FindBy(css = "#isMfiEnable")
	@CacheLookup
	private WebElement isMfiEnable;
	
	@FindBy(css = "#mfiDirect")
	@CacheLookup
	private WebElement mfiDirect;
	
	@FindBy(css = "#mfiRegular")
	@CacheLookup
	private WebElement mfiRegular;
	
	@FindBy(css = "#isMfdEnable")
	@CacheLookup
	private WebElement isMfdEnable;
	
	@FindBy(css = "#mfdDirect")
	@CacheLookup
	private WebElement mfdDirect;
	
	@FindBy(css = "#mfdRegular")
	@CacheLookup
	private WebElement mfdRegular;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	 public CreateOrgnBSEEnablePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createOrgnBSEEnableTestPage() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(CommonMaster);
		actions.moveToElement(CommonMaster).perform();
		
		ElementWait.isElementVisible(OrgnBSEEnable);
		actions.moveToElement(OrgnBSEEnable).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(orgnDD);
		Select selectorgnDD= new Select(orgnDD);
		selectorgnDD.selectByVisibleText(file.getMasterTestData("orgnDD"));
		
		ElementWait.isElementVisible(isCtfEnable);
		Select selectisCtfEnable= new Select(isCtfEnable);
		selectisCtfEnable.selectByVisibleText(file.getMasterTestData("isCtfEnable"));
		
		ElementWait.isElementVisible(ctfDirect);
		Select selectctfDirect= new Select(ctfDirect);
		selectctfDirect.selectByVisibleText(file.getMasterTestData("ctfDirect"));
		
		ElementWait.isElementVisible(ctfRegular);
		Select selectctfRegular= new Select(ctfRegular);
		selectctfRegular.selectByVisibleText(file.getMasterTestData("ctfRegular"));
		
		ElementWait.isElementVisible(isMfiEnable);
		Select selectisMfiEnable= new Select(isMfiEnable);
		selectisMfiEnable.selectByVisibleText(file.getMasterTestData("isMfiEnable"));
		
		ElementWait.isElementVisible(mfiDirect);
		Select selectmfiDirect= new Select(mfiDirect);
		selectmfiDirect.selectByVisibleText(file.getMasterTestData("mfiDirect"));
		
		ElementWait.isElementVisible(mfiRegular);
		Select selectmfiRegular= new Select(mfiRegular);
		selectmfiRegular.selectByVisibleText(file.getMasterTestData("mfiRegular"));
		
		ElementWait.isElementVisible(isMfdEnable);
		Select selectisMfdEnable= new Select(isMfdEnable);
		selectisMfdEnable.selectByVisibleText(file.getMasterTestData("isMfdEnable"));
		
		ElementWait.isElementVisible(mfdDirect);
		Select selectmfdDirect= new Select(mfdDirect);
		selectmfdDirect.selectByVisibleText(file.getMasterTestData("mfdDirect"));
		
		ElementWait.isElementVisible(mfdRegular);
		Select selectmfdRegular= new Select(mfdRegular);
		selectmfdRegular.selectByVisibleText(file.getMasterTestData("mfdRegular"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" Org BSE Enable :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
