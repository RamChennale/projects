package com.rupeelog.rimsRIMSUpdatePages;

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

public class CreateFamilyWiseSplitMasterPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "RIMS Update")
	@CacheLookup
	private WebElement RIMSUpdate;

	@FindBy(linkText = "Family-wise Split Master")
	@CacheLookup
	private WebElement FamilyWiseSplitMaster;
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "familyname")
	@CacheLookup
	private WebElement fSplitFamilynameAutoSugg;
	
	@FindBy(id = "RmType")
	@CacheLookup
	private WebElement fSplitRmTypeDD;

	@FindBy(id = "SharePercent")
	@CacheLookup
	private WebElement fSplitSharePercent;
	
	@FindBy(id = "RevenueType")
	@CacheLookup
	private WebElement fSplitShareType;
	
	@FindBy(id = "StartDate")
	@CacheLookup
	private WebElement fSplitEffectiveFrom;
	
	@FindBy(id = "EndDate")
	@CacheLookup
	private WebElement fSplitEffectiveTo;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
	public CreateFamilyWiseSplitMasterPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createFamilyWiseSplitMaster() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(RIMSUpdate);
		action.moveToElement(RIMSUpdate).perform();

		ElementWait.isElementVisible(FamilyWiseSplitMaster);
		action.moveToElement(FamilyWiseSplitMaster).click().build().perform();
		
		ElementWait.scrollToFindElement(driver, createBtn);
		ElementWait.isElementVisible(createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(fSplitFamilynameAutoSugg);
		fSplitFamilynameAutoSugg.sendKeys(file.getRIMSTestDat("fSplitFamilynameAutoSugg"));
		fSplitFamilynameAutoSugg.clear();
		fSplitFamilynameAutoSugg.sendKeys(file.getRIMSTestDat("fSplitFamilynameAutoSugg"));
		
		List<WebElement> flist=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-1']//li")));
		for(int i=0; i<flist.size();i++) {
			if(flist.get(i).getText().equalsIgnoreCase(file.getRIMSTestDat("selectfSplitFamilynameAutoSugg")))
				flist.get(i).click();
			System.out.println(flist.get(i).getText());
			break;
		}
		
		ElementWait.isElementVisible(fSplitRmTypeDD);
		Select selectfSplitRmTypeDD= new Select(fSplitRmTypeDD);
		selectfSplitRmTypeDD.selectByVisibleText(file.getRIMSTestDat("fSplitRmTypeDD"));
		
		ElementWait.isElementVisible(fSplitSharePercent);
		fSplitSharePercent.sendKeys(file.getRIMSTestDat("fSplitSharePercent")); 
		
		ElementWait.isElementVisible(fSplitShareType);
		Select selectfSplitShareType= new Select(fSplitShareType);
		selectfSplitShareType.selectByVisibleText(file.getRIMSTestDat("fSplitShareType"));
		
		ElementWait.isElementVisible(fSplitEffectiveFrom);
		fSplitEffectiveFrom.sendKeys(file.getRIMSTestDat("fSplitEffectiveFrom"));
		
		ElementWait.isElementVisible(fSplitEffectiveTo);
		fSplitEffectiveTo.sendKeys(file.getRIMSTestDat("fSplitEffectiveTo"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" create Family Wise Split Master : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
