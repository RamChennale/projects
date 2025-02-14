package com.rupeelog.adminCOBPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class COBdocRepUploadPage {

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
	
	@FindBy(linkText = "Doc Repository")
	@CacheLookup 
	private WebElement DocRepository;
	
	@FindBy(id = "upload")
	@CacheLookup
	private WebElement druploadChooseFile;
	
	@FindBy(id = "path1")
	@CacheLookup
	private WebElement druploadFileRadioBtn;
	
	@FindBy(id = "fileType")
	@CacheLookup
	private WebElement drfileTypeDD;
	
	@FindBy(id = "logic")
	@CacheLookup
	private WebElement drTaggingLogicDD;
	
	@FindBy(id = "sublogic")
	@CacheLookup
	private WebElement drTaggingSubLogicDD;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement drStmtPrdFromDate;
	
	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement drStmtPrdToDate;
	
	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement proscessBtn;
	
	@FindBy(id = "sucmsg")
	@CacheLookup
	private WebElement drUploadResult;
	
	
 	public COBdocRepUploadPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void cobDocRepUploadTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(DocRepository);
 		actions.moveToElement(DocRepository).click().build().perform();
 		
 		ElementWait.isElementVisible(druploadFileRadioBtn);
 		if(druploadFileRadioBtn.isSelected()) {
 			System.out.println("Radio button already selected");
 		}else {
 			druploadFileRadioBtn.click();
		}
 		
 		ElementWait.isElementVisible(druploadChooseFile);
 		druploadChooseFile.sendKeys(file.getAdminTestData("druploadChooseFile"));
 		
 		ElementWait.isElementVisible(drfileTypeDD);
 		Select selectdrfileTypeDD= new Select(drfileTypeDD);
 		selectdrfileTypeDD.selectByVisibleText(file.getAdminTestData("drfileTypeDD"));
 		
 		ElementWait.isElementVisible(drTaggingLogicDD);
 		Select selectdrTaggingLogicDD= new Select(drTaggingLogicDD);
 		selectdrTaggingLogicDD.selectByVisibleText(file.getAdminTestData("drTaggingLogicDD"));
 		
 		ElementWait.isElementVisible(drTaggingSubLogicDD);
 		Select selectdrTaggingSubLogicDD= new Select(drTaggingSubLogicDD);
 		selectdrTaggingSubLogicDD.selectByVisibleText(file.getAdminTestData("drTaggingSubLogicDD"));
 		
 		ElementWait.isElementVisible(drStmtPrdFromDate);
 		drStmtPrdFromDate.sendKeys(file.getAdminTestData("drStmtPrdFromDate"));
 		
 		ElementWait.isElementVisible(drStmtPrdToDate);
 		drStmtPrdToDate.sendKeys(file.getAdminTestData("drStmtPrdToDate"));
 		
 		ElementWait.isElementVisible(proscessBtn);
 		proscessBtn.click();
 		
 		try{
 			alert= driver.switchTo().alert();
 			System.out.println("Alert handled : "+alert.getText());
 			alert.accept();
 			ElementWait.isElementVisible(drUploadResult);
 	 		System.out.println("Documents are upload status : "+drUploadResult.getText());
 	 		Assert.assertEquals(drUploadResult.getText(), "SUCCESS", "Documents are uploaded successfully");
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 	}
}
