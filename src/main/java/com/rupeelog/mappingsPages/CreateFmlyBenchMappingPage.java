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

public class CreateFmlyBenchMappingPage {

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
	
	@FindBy(linkText = "Family Benchmark mapping")
	@CacheLookup 
	private WebElement FamilyBenchmarkMapping;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "familyName")
	@CacheLookup
	private WebElement familyAutoSugg;
	
	@FindBy(id = "BenchmarkId")
	@CacheLookup
	private WebElement fbmBenchmarkDD;
	
	@FindBy(id = "EffectiveDate")
	@CacheLookup
	private WebElement fbmEffectiveDate;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateFmlyBenchMappingPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createFmlyBenchMapping() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(Mappings);
 		actions.moveToElement(Mappings).perform();
 		
 		ElementWait.isElementVisible(FamilyBenchmarkMapping);
 		actions.moveToElement(FamilyBenchmarkMapping).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.scrollToFindElement(driver, createBtn);
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(familyAutoSugg);
 		familyAutoSugg.sendKeys(file.getAdminTestData("familyName"));
 		
 		List<WebElement> portfoliolist= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
 		
 		for(int i=0; i<portfoliolist.size(); i++) {
 			if(portfoliolist.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectfamilyName")));
 			System.out.println(portfoliolist.get(i).getText());
 			portfoliolist.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(fbmBenchmarkDD);
 		Select selectfbmBenchmarkDD= new Select(fbmBenchmarkDD);
 		selectfbmBenchmarkDD.selectByVisibleText(file.getAdminTestData("fbmBenchmarkDD"));
 		
 		ElementWait.isElementVisible(fbmEffectiveDate);
 		fbmEffectiveDate.sendKeys(file.getAdminTestData("fbmEffectiveDate"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,saveBtn);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("  Create Fmly Bench Mapping   : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 	}
 		}
 	
