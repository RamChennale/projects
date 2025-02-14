package com.rupeelog.sysMasterPages;

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

public class CreateGSTMasterPage {

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
	
	@FindBy(linkText  = "GST Master")
	@CacheLookup
	private WebElement GSTMaster;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "effectiveDate")
	@CacheLookup
	private WebElement effectiveDate;
	
	@FindBy(id = "stateId")
	@CacheLookup
	private WebElement gstStateDD;
	
	@FindBy(id = "cgst")
	@CacheLookup
	private WebElement cgst;
	
	@FindBy(id = "sgst")
	@CacheLookup
	private WebElement sgst;
	
	@FindBy(id = "igst")
	@CacheLookup
	private WebElement igst;
	
	@FindBy(id = "cess")
	@CacheLookup
	private WebElement cess;
	
	@FindBy(id = "mFCommnApp")
	@CacheLookup
	private WebElement mFCommnAppDD;
	
	/*
	 * @FindBy(id = "type")
	 * 
	 * @CacheLookup private WebElement typeDD;
	 */
	
	@FindBy(id = "remarks")
	@CacheLookup
	private WebElement remarks;
	
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
	public  CreateGSTMasterPage(WebDriver driver){
		this.driver=driver;
	}
	
public void createGSTMasterPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(SystemMaster);
		actions.moveToElement(SystemMaster).perform();
		
		ElementWait.isElementVisible(GSTMaster);
		actions.moveToElement(GSTMaster).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(effectiveDate);
		effectiveDate.sendKeys(file.getMasterTestData("effectiveDate"));
		
		ElementWait.isElementVisible(gstStateDD);
		Select selectgstStateDD= new Select(gstStateDD);
		selectgstStateDD.selectByVisibleText(file.getMasterTestData("gstStateDD"));
		
		ElementWait.isElementVisible(cgst);
		cgst.sendKeys(file.getMasterTestData("cgst"));

		ElementWait.isElementVisible(sgst);
		sgst.sendKeys(file.getMasterTestData("sgst"));
		
		ElementWait.isElementVisible(igst);
		igst.sendKeys(file.getMasterTestData("igst"));
		
		ElementWait.isElementVisible(cess);
		cess.sendKeys(file.getMasterTestData("cess"));
		
		ElementWait.isElementVisible(mFCommnAppDD);
		Select selectmFCommnAppDD= new Select(mFCommnAppDD);
		selectmFCommnAppDD.selectByVisibleText(file.getMasterTestData("mFCommnAppDD"));
		
		/*
		 * ElementWait.isElementVisible(typeDD); Select selecttypeDD= new
		 * Select(typeDD);
		 * selecttypeDD.selectByVisibleText(file.getMasterTestData("typeDD"));
		 */
		ElementWait.isElementVisible(remarks);
		remarks.sendKeys(file.getMasterTestData("remarks"));
		
		ElementWait.isElementVisible(save);
		save.click();
	
		try{
			alert=driver.switchTo().alert();
			System.out.println("GST :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
