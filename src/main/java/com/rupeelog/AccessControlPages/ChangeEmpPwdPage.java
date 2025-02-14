package com.rupeelog.AccessControlPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class ChangeEmpPwdPage {

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
	
	@FindBy(linkText = "Change Employee Password")
	@CacheLookup 
	private WebElement ChangeEmployeePassword;
	
	@FindBy(id = "employeeStr")
	@CacheLookup
	private WebElement employeeAutoSuggSearch;
	
	@FindBy(id = "newPassword")
	@CacheLookup
	private WebElement newPassword;
	
	@FindBy(id = "confirmPassword")
	@CacheLookup
	private WebElement confirmPassword;
	
	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement save;
	
	@FindBy(id = "viewStatusMessage")
	@CacheLookup
	private WebElement viewStatusMessage;
	
 	public ChangeEmpPwdPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void changeEmpPwdPageTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(AccessControl);
 		actions.moveToElement(AccessControl).perform();
 		
 		ElementWait.isElementVisible(ChangeEmployeePassword);
 		actions.moveToElement(ChangeEmployeePassword).click().build().perform();
 		
 		ElementWait.isElementVisible(employeeAutoSuggSearch);
 		employeeAutoSuggSearch.sendKeys(file.getAdminTestData("employeeAutoSuggSearch"));
 		
 		List<WebElement> emplist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<emplist.size(); i++) {
 			if(emplist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectEmp")));
 			System.out.println(emplist.get(i));
 			emplist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(newPassword);
 		newPassword.sendKeys(file.getAdminTestData("newPassword"));
 		
 		ElementWait.isElementVisible(confirmPassword);
 		confirmPassword.sendKeys(file.getAdminTestData("confirmPassword"));
 		
 		ElementWait.isElementVisible(save);
 		save.click();
 		
 		System.out.println(viewStatusMessage.getText());
 	}
}
