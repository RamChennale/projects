package com.rupeelog.manualTxnAdjPages;

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

public class GenerateNavPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;
	
	@FindBy(linkText = "Manual Txn Adjustments")
	@CacheLookup
	private WebElement ManualTxnAdjustments;
	
	@FindBy(linkText = "Generate Nav")
	@CacheLookup 
	private WebElement GenerateNav;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(xpath = "//input[@type='radio' and @value='F']")
	@CacheLookup
	private WebElement familyRadioBtn;
	
	@FindBy(id = "familyIdStr")
	@CacheLookup
	private WebElement gnFamilyNameAutoSuggSearch;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement gnStartDate;
	
	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement gnEndDate;
	
	@FindBy(id = "run")
	@CacheLookup
	private WebElement GenerateNAVbtn;
	
 	public GenerateNavPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjmentGenerateNavPageTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(GenerateNav);
 		actions.moveToElement(GenerateNav).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(familyRadioBtn);
 		if(familyRadioBtn.isSelected()) {
 			System.out.println("familyRadioBtn al ready selected");
 		}else {
			familyRadioBtn.click();
		}
 		
 		ElementWait.isElementVisible(gnFamilyNameAutoSuggSearch);
 		gnFamilyNameAutoSuggSearch.sendKeys(file.getAdminTestData("gnFamilyNameAutoSuggSearch"));
 		
 		List<WebElement> familylist= driver.findElements(By.xpath("//ul[@id='ui-id-3']//li"));
 		
 		for(int i=0; i<familylist.size(); i++) {
 			if(familylist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectgnFamilyNameAutoSuggSearch")));
 			System.out.println(familylist.get(i).getText());
 			familylist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(gnStartDate);
 		gnStartDate.sendKeys(file.getAdminTestData("gnStartDate"));
 		
 		ElementWait.isElementVisible(gnEndDate);
 		gnEndDate.sendKeys(file.getAdminTestData("gnEndDate"));
 		
 		ElementWait.isElementVisible(GenerateNAVbtn);
 		GenerateNAVbtn.click();
 		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("Generate NAV  alert 1 : "+alert.getText());
 		alert.accept();
 		driver.switchTo().alert();
 		System.out.println("Generate NAV alert 2 : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
}
