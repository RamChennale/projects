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

public class UserRoleAccessPage {

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
	
	@FindBy(linkText = "User-Role Access")
	@CacheLookup 
	private WebElement UserRoleAccess;
	
	@FindBy(id = "firstName")
	@CacheLookup
	private WebElement empRoleAssignAutoSuggSearch;
	
	@FindBy(id = "search")
	@CacheLookup
	private WebElement searchBtn;
	
	@FindBy(id = "5")
	@CacheLookup
	private WebElement checkTenantRM;
	
	@FindBy(id = "apply")
	@CacheLookup
	private WebElement applyBtn;
	
 	public UserRoleAccessPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void userRoleAccessPageTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(AccessControl);
 		actions.moveToElement(AccessControl).perform();
 		
 		ElementWait.isElementVisible(UserRoleAccess);
 		actions.moveToElement(UserRoleAccess).click().build().perform();
 		
 		ElementWait.isElementVisible(empRoleAssignAutoSuggSearch);
 		empRoleAssignAutoSuggSearch.sendKeys(file.getAdminTestData("empRoleAssignAutoSuggSearch"));
 		
 		List<WebElement> emplist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<emplist.size(); i++) {
 			if(emplist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectEmpToAssignRole")));
 			System.out.println(emplist.get(i).getText());
 			emplist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(searchBtn);
 		searchBtn.click();
 		
 		ElementWait.isElementVisible(checkTenantRM);
 		checkTenantRM.click();
 		
 		ElementWait.isElementVisible(applyBtn);
 		applyBtn.click();
 	}
}
