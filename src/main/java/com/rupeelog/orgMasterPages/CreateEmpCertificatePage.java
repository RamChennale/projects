package com.rupeelog.orgMasterPages;

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

public class CreateEmpCertificatePage {

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
	
	@FindBy(linkText  = "Employee Certificate")
	@CacheLookup
	private WebElement EmployeeCertificate;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement certificateName;
	
	@FindBy(id = "shortName")
	@CacheLookup
	private WebElement certificateShortName;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
	public  CreateEmpCertificatePage(WebDriver driver){
		this.driver=driver;
	}
	
public void createEmpCertificatePageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();
		
		ElementWait.isElementVisible(EmployeeCertificate);
		actions.moveToElement(EmployeeCertificate).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(certificateName);
		certificateName.sendKeys(file.getMasterTestData("certificateName"));
		
		ElementWait.isElementVisible(certificateShortName);
		certificateShortName.sendKeys(file.getMasterTestData("certificateShortName"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			alert=driver.switchTo().alert();
			System.out.println("Employee certification creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
