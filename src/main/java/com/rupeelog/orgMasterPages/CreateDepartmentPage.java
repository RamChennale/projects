package com.rupeelog.orgMasterPages;


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

public class CreateDepartmentPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Organization Master")
	@CacheLookup
	private WebElement OrganizationMaster;
	
	@FindBy(linkText  = "Department")
	@CacheLookup
	private WebElement Department;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement departmentName;
	
	@FindBy(id = "shortName")
	@CacheLookup
	private WebElement departmentshortName;
	
	@FindBy(id = "type")
	@CacheLookup
	private WebElement departmentType;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
	public  CreateDepartmentPage(WebDriver driver){
		this.driver=driver;
	}
	
public void createDepartmentPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();
		
		ElementWait.isElementVisible(Department);
		actions.moveToElement(Department).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(departmentName);
		departmentName.sendKeys(file.getMasterTestData("departmentName"));
		
		ElementWait.isElementVisible(departmentshortName);
		departmentshortName.sendKeys(file.getMasterTestData("departmentshortName"));
		
		ElementWait.isElementVisible(departmentType);
		Select selectdepartmentType= new Select(departmentType);
		selectdepartmentType.selectByVisibleText(file.getMasterTestData("departmentType"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			alert=driver.switchTo().alert();
			System.out.println("department creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
