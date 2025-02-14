package com.rupeelog.mappingsPages;

import java.util.List;

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
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class FamilyRMmappingPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;
	
	@FindBy(linkText = "Mappings")
	@CacheLookup
	private WebElement Mappings;
	
	@FindBy(linkText = "Family RM Mapping")
	@CacheLookup 
	private WebElement FamilyRMMapping;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "familyName")
	@CacheLookup
	private WebElement rmfamilyAutoSugg;
	
	@FindBy(id = "go")
	@CacheLookup
	private WebElement Go;
	
	@FindBy(xpath = "//table[@id='currRmTable']//tr[2]")
	@CacheLookup
	private WebElement rmselectRMtype;
	
	@FindBy(id = "edit1")
	@CacheLookup
	private WebElement addBtn;
	
	@FindBy(id = "rmTypeId")
	@CacheLookup
	private WebElement rmselectRMname;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement rmStartDate;
	
	@FindBy(id = "endRMDate")
	@CacheLookup
	private WebElement rmEndDate;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
 	public FamilyRMmappingPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createFamilyRMmapping() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(Mappings);
 		actions.moveToElement(Mappings).perform();
 		
 		ElementWait.isElementVisible(FamilyRMMapping);
 		actions.moveToElement(FamilyRMMapping).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(rmfamilyAutoSugg);
 		rmfamilyAutoSugg.sendKeys(file.getAdminTestData("rmfamilyAutoSugg"));
 		
 		List<WebElement> familylist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<familylist.size(); i++) {
 			if(familylist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectrmfamilyAutoSugg")));
 			System.out.println(familylist.get(i).getText());
 			familylist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(Go);
 		Go.click();
 		
 		ElementWait.isElementVisible(rmselectRMtype);
 		rmselectRMtype.click();
 		
 		ElementWait.scrollToFindElement(driver, addBtn); 
 		ElementWait.isElementVisible(addBtn);
 		addBtn.click();
 		
 		//driver.switchTo().frame(driver.findElement(By.id("addRMModal")));
 		
 		ElementWait.isElementVisible(rmselectRMname);
 		Select selectrmselectRMname= new Select(rmselectRMname);
 		selectrmselectRMname.selectByVisibleText(file.getAdminTestData("rmselectRMname"));
 		
 		ElementWait.isElementVisible(rmStartDate);
 		rmStartDate.sendKeys(file.getAdminTestData("rmStartDate"));
 		
 		ElementWait.isElementVisible(rmEndDate);
 		rmEndDate.sendKeys(file.getAdminTestData("rmEndDate"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,saveBtn);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println(" Family RM Mapping Creation  : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 	}
 		}
 	
