package com.rupeelog.orgMasterPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateCounterPartyPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Organization Master")
	@CacheLookup
	private WebElement OrganizationMaster;
	
	@FindBy(linkText  = "Counter Party")
	@CacheLookup
	private WebElement CounterParty;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement cpname;
	
	@FindBy(id = "city")
	@CacheLookup
	private WebElement cpcityautoSuggSerch;
	
	@FindBy(id = "bankName_")
	@CacheLookup
	private WebElement cpbankNameDD;
	
	@FindBy(id = "branch_")
	@CacheLookup
	private WebElement cpbranchDD;
	
	@FindBy(id = "AccountName")
	@CacheLookup
	private WebElement cpAccountName;
	
	@FindBy(id = "accountNo_")
	@CacheLookup
	private WebElement cpaccountNo;
	
	@FindBy(id = "accountType_")
	@CacheLookup
	private WebElement cpaccountTypeDD;
	
	@FindBy(id = "participantName_")
	@CacheLookup
	private WebElement cpparticipantNameDD;
	
	@FindBy(id = "dematNo_")
	@CacheLookup
	private WebElement cpdematNo;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
	public  CreateCounterPartyPage(WebDriver driver){
		this.driver=driver;
	}
	
public void createCounterPartyPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();
		
		ElementWait.isElementVisible(CounterParty);
		actions.moveToElement(CounterParty).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(cpname);
		cpname.sendKeys(file.getMasterTestData("cpname"));
		
		ElementWait.isElementVisible(cpcityautoSuggSerch);
		cpcityautoSuggSerch.sendKeys(file.getMasterTestData("cpcityautoSuggSerch")+Keys.SPACE+Keys.BACK_SPACE);
		//+Keys.BACK_SPACE+Keys.SPACE
		List<WebElement> cityList = driver.findElements(By.xpath(
				"//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < cityList.size(); i++) {
			if (cityList.get(i).getText().equalsIgnoreCase(file.getMasterTestData("cpSelectCity"))) {
				cityList.get(i).click();
				System.out.println(cityList.get(i).getText());
				break;
			}
		}
		
		ElementWait.isElementVisible(cpbankNameDD);
		Select selectcpbankNameDD= new Select(cpbankNameDD);
		selectcpbankNameDD.selectByVisibleText(file.getMasterTestData("cpbankNameDD"));
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(cpbranchDD);
		cpbranchDD.click();
		ElementWait.isElementVisible(cpbranchDD);
		cpbranchDD.sendKeys(file.getMasterTestData("cpbranchDD"));
		
		ElementWait.isElementVisible(cpAccountName);
		cpAccountName.sendKeys(file.getMasterTestData("cpAccountName"));
		
		ElementWait.isElementVisible(cpaccountNo);
		cpaccountNo.sendKeys(file.getMasterTestData("cpaccountNo"));
		

		ElementWait.isElementVisible(cpaccountTypeDD);
		Select selectcpaccountTypeDD= new Select(cpaccountTypeDD);
		selectcpaccountTypeDD.selectByVisibleText(file.getMasterTestData("cpaccountTypeDD"));
		
		ElementWait.isElementVisible(cpparticipantNameDD);
		Select selectcpparticipantNameDD= new Select(cpparticipantNameDD);
		selectcpparticipantNameDD.selectByVisibleText(file.getMasterTestData("cpparticipantNameDD"));
		
		ElementWait.isElementVisible(cpdematNo);
		cpdematNo.sendKeys(file.getMasterTestData("cpdematNo"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			alert=driver.switchTo().alert();
			System.out.println("Counter party creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
