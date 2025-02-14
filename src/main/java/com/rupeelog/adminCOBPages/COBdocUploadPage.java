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

public class COBdocUploadPage {

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
	
	@FindBy(linkText = "Document Upload")
	@CacheLookup 
	private WebElement DocumentUpload;
	
	@FindBy(id = "kyphIdStr")
	@CacheLookup
	private WebElement docUploadKYPHAutoSuggSearch;
	
	@FindBy(id = "docType")
	@CacheLookup
	private WebElement docUploadDocTypeDD;
	
	@FindBy(id = "file2")
	@CacheLookup
	private WebElement docUploadChooseFile;
	
	@FindBy(id = "uploadButton")
	@CacheLookup
	private WebElement uploadButton;
	
	@FindBy(id = "result")
	@CacheLookup
	private WebElement docUploadResult;
	
 	public COBdocUploadPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void cobDocUploadPageTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ClientOnBoarding);
 		actions.moveToElement(ClientOnBoarding).perform();
 		
 		ElementWait.isElementVisible(DocumentUpload);
 		actions.moveToElement(DocumentUpload).click().build().perform();
 		
 		ElementWait.isElementVisible(docUploadKYPHAutoSuggSearch);
 		docUploadKYPHAutoSuggSearch.sendKeys(file.getAdminTestData("docUploadKYPHAutoSuggSearch"));
 		
 		List<WebElement> kyphlist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<kyphlist.size(); i++) {
 			if(kyphlist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectDocUploadKYPHAutoSuggSearch")));
 			System.out.println(kyphlist.get(i).getText());
 			kyphlist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(docUploadDocTypeDD);
 		Select selectdocUploadDocTypeDD= new Select(docUploadDocTypeDD);
 		selectdocUploadDocTypeDD.selectByVisibleText(file.getAdminTestData("docUploadDocTypeDD"));
 		
 		ElementWait.isElementVisible(docUploadChooseFile);
 		docUploadChooseFile.sendKeys(file.getAdminTestData("docUploadChooseFile"));
 		
 		ElementWait.isElementVisible(uploadButton);
 		uploadButton.click();
 		
 		ElementWait.isElementVisible(docUploadResult);
 		System.out.println(docUploadResult.getText());

 	}
}
