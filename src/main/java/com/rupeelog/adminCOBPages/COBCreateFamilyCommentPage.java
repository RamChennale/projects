package com.rupeelog.adminCOBPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class COBCreateFamilyCommentPage {

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
	
	@FindBy(linkText = "Family Comments")
	@CacheLookup 
	private WebElement FamilyComments;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "familyName")
	@CacheLookup
	private WebElement familyNameAutoSuggSearch;
	
	@FindBy(id = "commentTypeId")
	@CacheLookup
	private WebElement commentTypeDD;
	
	@FindBy(id = "comment")
	@CacheLookup
	private WebElement commentTextBox;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
 	public COBCreateFamilyCommentPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void cobDocUploadPageTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ClientOnBoarding);
 		actions.moveToElement(ClientOnBoarding).perform();
 		
 		ElementWait.isElementVisible(FamilyComments);
 		actions.moveToElement(FamilyComments).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.scrollToFindElement(driver, createBtn);
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(familyNameAutoSuggSearch);
 		familyNameAutoSuggSearch.sendKeys(file.getAdminTestData("familyNameAutoSuggSearch"));
 		
 		List<WebElement> familylist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<familylist.size(); i++) {
 			if(familylist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectfamilyNameAutoSuggSearch")));
 			System.out.println(familylist.get(i).getText());
 			familylist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(commentTypeDD);
 		Select selectcommentTypeDD= new Select(commentTypeDD);
 		selectcommentTypeDD.selectByVisibleText(file.getAdminTestData("commentTypeDD"));
 		
 		ElementWait.isElementVisible(commentTextBox);
 		commentTextBox.sendKeys(file.getAdminTestData("commentTextBox"));
 		
 		ElementWait.isElementVisible(save);
 		save.click();
 		
 	}
}
