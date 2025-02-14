package com.rupeelog.AccessControlPages;

import java.util.List;

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

public class ChangeKYPHPwdPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;
	
	@FindBy(linkText = "Access Control")
	@CacheLookup
	private WebElement AccessControl;
	
	@FindBy(linkText = "Change Password - Kyph")
	@CacheLookup 
	private WebElement ChangeKYPHPassword;
	
	@FindBy(id = "kyphStr")
	@CacheLookup
	private WebElement KYPHAutoSuggSearch;
	
	@FindBy(id = "newPassword")
	@CacheLookup
	private WebElement newKYPHPassword;
	
	@FindBy(id = "confirmPassword")
	@CacheLookup
	private WebElement confirmKYPHPassword;
	
	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement save;
	
 	public ChangeKYPHPwdPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void changeKYPHPwdPageTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(AccessControl);
 		actions.moveToElement(AccessControl).perform();
 		
 		ElementWait.isElementVisible(ChangeKYPHPassword);
 		actions.moveToElement(ChangeKYPHPassword).click().build().perform();
 		
 		ElementWait.isElementVisible(KYPHAutoSuggSearch);
 		KYPHAutoSuggSearch.sendKeys(file.getAdminTestData("KYPHAutoSuggSearch"));
 		
 		List<WebElement> kyphlist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<kyphlist.size(); i++) {
 			if(kyphlist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectKYPH")));
 			System.out.println(kyphlist.get(i).getText());
 			kyphlist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(newKYPHPassword);
 		newKYPHPassword.sendKeys(file.getAdminTestData("newKYPHPassword"));
 		
 		ElementWait.isElementVisible(confirmKYPHPassword);
 		confirmKYPHPassword.sendKeys(file.getAdminTestData("confirmKYPHPassword"));
 		
 		ElementWait.isElementVisible(save);
 		save.click();
 		try {
 			alert=driver.switchTo().alert();
 			System.out.println("Change KYPH Password : "+alert.getText());
 			alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 	}
}
