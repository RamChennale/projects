package com.rupeelog.adminCOBPages;

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
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.ScrollPageToFindElement;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AddFamilyPage {
	
	WebDriver driver;
	Actions action;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(xpath = "//*[text()='Admin']")
	@CacheLookup
	private WebElement adminMenu;
	
	@FindBy(xpath = "//*[text()='Client-On-Boarding']")
	@CacheLookup
	private WebElement clientSubMenu;
	
	@FindBy(xpath = "//*[text()='Family']")
	@CacheLookup
	private WebElement familySubMenu;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	private WebElement createFamilyBtn;
	
	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	private WebElement familyName;
	
	@FindBy(xpath = "//input[@id='code']")
	@CacheLookup
	private WebElement globalFamilyCode;
	
	@FindBy(xpath = "//input[@id='kyph1']")
	@CacheLookup
	private WebElement selectKyph1AutoSuggSearch;
	
	@FindBy(xpath = "//input[@id='kyph2']")
	@CacheLookup
	private WebElement selectKyph2AutoSuggSearch;
	
	@FindBy(xpath = "//input[@id='kyph3']")
	@CacheLookup
	private WebElement selectKyph3AutoSuggSearch;
	
	@FindBy(xpath = "//select[@id='reportFrequency']")
	@CacheLookup
	private WebElement reportFrequencyDropDown;
	
	@FindBy(xpath  = "//select[@id='Status']")
	@CacheLookup
	private WebElement statusDropDown;
	
	@FindBy(xpath = "//input[@id='fpKyphStr']")
	@CacheLookup
	private WebElement fpKyphAutoSuggSearch;
	
	/*
	@FindBy(id ="referaltype")
	@CacheLookup
	private WebElement referaltypeDropDown;						//DropDown  AutoSuggSearch
	
	@FindBy(id ="referalName")
	@CacheLookup
	private WebElement referalNameDropDown;	
	
	@FindBy(id ="EngagementId")
	@CacheLookup
	private WebElement mapFmlyEngagementDropDown;
	
	@FindBy(id ="SubEngagementId")
	@CacheLookup
	private WebElement fmlySubEngagementIdDropDown;
	
	@FindBy(id ="ipsReqd")
	@CacheLookup
	private WebElement ipsRequiredDropDown;
	
	@FindBy(id ="irepoType")
	@CacheLookup
	private WebElement internalRepoTypeDropDown;
	
	@FindBy(id = "ActivationDate")
	@CacheLookup
	private WebElement ActivationDateCalender;
	
	@FindBy(id = "aumIIFLW")
	@CacheLookup
	private WebElement expecdtedAumInCr; 
	
	@FindBy(id = "InvestmentAgreement")
	@CacheLookup
	private WebElement InvestmentAgreementDropDown;
	
	@FindBy(id = "AdminMandate")
	@CacheLookup
	private WebElement AdminMandateDropDown; 
	 
	@FindBy(id = "ClientPotential")
	@CacheLookup
	private WebElement clientPotentialDropDown;
	*/
	
	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancelButton;
	
	public AddFamilyPage(WebDriver driver){
		this.driver=driver;

	}
	
	
	public void createNewFamily() throws InterruptedException{
		
		file= new FileReaderUtility();
		action = new Actions(driver);
		
		WebDriverWaitFunctions.waitToLoadElement(adminMenu);
		action.moveToElement(adminMenu).perform();

		WebDriverWaitFunctions.waitToLoadElement(clientSubMenu);
		action.moveToElement(clientSubMenu).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(familySubMenu);
		action.moveToElement(familySubMenu).click().build().perform();
		
		Thread.sleep(5000);
		  ScrollPageToFindElement.findElementByPageScrolling(driver, createFamilyBtn);
		  WebDriverWaitFunctions.waitToLoadElement(createFamilyBtn);
		 createFamilyBtn.click();
		 
		WebDriverWaitFunctions.waitToLoadElement(familyName);
		familyName.clear();
		familyName.sendKeys(file.getAdminCOBTestData("familyName"));
		
		WebDriverWaitFunctions.waitToLoadElement(globalFamilyCode);
		globalFamilyCode.clear();
		globalFamilyCode.sendKeys(file.getAdminCOBTestData("globalFamilyCode"));
		
		WebDriverWaitFunctions.waitToLoadElement(selectKyph1AutoSuggSearch); 
		selectKyph1AutoSuggSearch.click();
		selectKyph1AutoSuggSearch.clear();
		selectKyph1AutoSuggSearch.sendKeys((file.getAdminCOBTestData("selectKyph1AutoSuggSearch")));
		
		List<WebElement> kyph1List = driver
				.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));
		//Thread.sleep(2000);
		for(int i=0;i<kyph1List.size();i++) {
			if(kyph1List.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("Kyph1AutoSuggSearch"))) {
				kyph1List.get(i).click();
				System.out.println(kyph1List.get(i).getText());
				break;
			}
		}
		
		WebDriverWaitFunctions.waitToLoadElement(selectKyph2AutoSuggSearch);
		selectKyph2AutoSuggSearch.sendKeys(Keys.chord(file.getAdminCOBTestData("selectKyph2AutoSuggSearch")+Keys.SPACE));
		//Thread.sleep(2000);
		List<WebElement> kyph2List = driver
				.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));
		System.out.println(kyph2List.size());
		for(int i=0;i<kyph2List.size();i++) {
			if(kyph2List.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("Kyph2AutoSuggSearch"))) {
				kyph2List.get(i).click();
				break;
			}
		}
		
		selectKyph3AutoSuggSearch.sendKeys(Keys.chord(file.getAdminCOBTestData("selectKyph3AutoSuggSearch")+Keys.SPACE));
		//Thread.sleep(2000);
		List<WebElement> kyph3List = driver
				.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));

		System.out.println(kyph3List.size());
		for(int i=0;i<kyph3List.size();i++) {
			if(kyph3List.get(i).getText().equalsIgnoreCase(Keys.chord(file.getAdminCOBTestData("Kyph3AutoSuggSearch")))) {
				kyph3List.get(i).click();
				break;
			}
		}
		
		WebDriverWaitFunctions.waitToLoadElement(reportFrequencyDropDown);
		Select reportFrequency= new Select(reportFrequencyDropDown);
		//reportFrequency.selectByVisibleText(file.getAdminCOBTestData("reportFrequencyDropDown")); //getting selection issue due format <option selected="selected" class="ui-dform-option" value="0">--Select--</option>
		reportFrequency.selectByIndex(0);
		
		WebDriverWaitFunctions.waitToLoadElement(statusDropDown);
		Select status= new Select(statusDropDown);
		status.selectByVisibleText(file.getAdminCOBTestData("statusDropDown"));
		
		WebDriverWaitFunctions.waitToLoadElement(fpKyphAutoSuggSearch);
		fpKyphAutoSuggSearch.sendKeys(Keys.chord(file.getAdminCOBTestData("fpKyphAutoSuggSearch"))+Keys.SPACE);
		Thread.sleep(2000);
		List<WebElement> fpKyphList = driver
				.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));

		for(int i=0;i<fpKyphList.size();i++) {
			if(fpKyphList.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("KyphAutoSuggSearch"))) {
				fpKyphList.get(i).click();
				break;
			}
		}
		
		ScrollPageToFindElement.findElementByPageScrolling(driver, saveButton);
		saveButton.click();
		try {
			WebDriverWaitFunctions.waitToPopUpAlert();
			String expectedAlertText="success";
			alert=driver.switchTo().alert();
			System.out.println("Alert message: "+alert.getText());
			Assert.assertEquals(alert.getText(), expectedAlertText, "Failed to create a new family.");
			alert.accept();
		}catch (NoAlertPresentException alerte) {
			alerte.printStackTrace();
		}
	}
	
	public void cancelCreateNewFamilyForm() throws InterruptedException{
		
		action = new Actions(driver);
		
		WebDriverWaitFunctions.waitToLoadElement(adminMenu);
		action.moveToElement(adminMenu).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(clientSubMenu);
		action.moveToElement(clientSubMenu).perform();

		WebDriverWaitFunctions.waitToLoadElement(familySubMenu);
		action.moveToElement(familySubMenu).click().build().perform();
		
		WebDriverWaitFunctions.waitToLoadElement(createFamilyBtn);
		createFamilyBtn.click();

		ScrollPageToFindElement.findElementByPageScrolling(driver, cancelButton);
		WebDriverWaitFunctions.waitToLoadElement(cancelButton);
		cancelButton.click();
	}

}
