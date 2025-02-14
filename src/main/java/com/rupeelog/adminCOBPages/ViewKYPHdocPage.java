package com.rupeelog.adminCOBPages;

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

public class ViewKYPHdocPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;
	
	@FindBy(linkText = "Client-On-Boarding")
	@CacheLookup
	private WebElement ClientOnBoarding;
	
	@FindBy(linkText = "View Kyph Documents")
	@CacheLookup 
	private WebElement ViewKyphDocument;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "kyphIdStr")
	@CacheLookup
	private WebElement ViewkyphAutoSuggSearch;
	
	@FindBy(id = "goByFamilySearch")
	@CacheLookup
	private WebElement viewDocumentBtn;
	
 	public ViewKYPHdocPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void cobViewKYPHdocPageTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ClientOnBoarding);
 		actions.moveToElement(ClientOnBoarding).perform();
 		
 		ElementWait.isElementVisible(ViewKyphDocument);
 		actions.moveToElement(ViewKyphDocument).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(ViewkyphAutoSuggSearch);
 		ViewkyphAutoSuggSearch.sendKeys(file.getAdminTestData("ViewkyphAutoSuggSearch"));
 		
 		List<WebElement> kyphlist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<kyphlist.size(); i++) {
 			if(kyphlist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectViewkyphAutoSuggSearch")));
 			System.out.println(kyphlist.get(i).getText());
 			kyphlist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(viewDocumentBtn);
 		viewDocumentBtn.click();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 	}
}
