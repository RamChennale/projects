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

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.ScrollPageToFindElement;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ClientBankMappingPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(xpath = "//*[text()='Admin']")
	@CacheLookup
	private WebElement adminMenu;
	
	@FindBy(xpath = "//*[text()='Mappings']")
	@CacheLookup
	private WebElement mappingsSubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Client Bank Mapping')]")
	@CacheLookup
	private WebElement clientBankMappingSubMenu;
	
	@FindBy(xpath = "//input[@id='create']")
	@CacheLookup
	private WebElement createClientBankMappingBtn;
	
	@FindBy(xpath = "//input[@id='clientname']")
	@CacheLookup
	private WebElement clientnameAutoSuggSearch;
	
	@FindBy(xpath = "//input[@id='ClientBankIFSCcode']")
	@CacheLookup
	private WebElement ClientBankIFSCcodeAutoSuggSearch;
	

	@FindBy(xpath = "//select[@id='AccountType']")
	@CacheLookup
	private WebElement bankAccountTypeDD;
	
	@FindBy(xpath = "//input[@id='AccountNo']")
	@CacheLookup
	private WebElement bankAccountNo;
	
	@FindBy(xpath = "//select[@id='isdefaultforw']")
	@CacheLookup
	private WebElement isDefaultForWealthDD;
	
	@FindBy(xpath = "//select[@id='IsMtf']")
	@CacheLookup
	private WebElement isMtfDD;
	
	@FindBy(xpath = "//select[@id='isdefaultformtf']")
	@CacheLookup
	private WebElement isDefaultForMTFDD;
	
	@FindBy(xpath = "//select[@id='IiflPoa']")
	@CacheLookup
	private WebElement isItPOADD;
	
	@FindBy(xpath = "//input[@id='Holder1Name']")
	@CacheLookup
	private WebElement holderName1;
	
	@FindBy(xpath = "//input[@id='Holder2Name']")
	@CacheLookup
	private WebElement holderName2;
	
	@FindBy(xpath = "//input[@id='Holder3Name']")
	@CacheLookup
	private WebElement holderName3;
	
	@FindBy(xpath = "//select[@id='Status']")
	@CacheLookup
	private WebElement statusDD;
	
	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement save;
	
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancel;
	
	
	public ClientBankMappingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createClientBankMapping() {
		
		file= new FileReaderUtility();
		actions = new Actions(driver);
		
		WebDriverWaitFunctions.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(mappingsSubMenu);
		actions.moveToElement(mappingsSubMenu).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(clientBankMappingSubMenu);
		actions.moveToElement(clientBankMappingSubMenu).click().build().perform();
		
		WebDriverWaitFunctions.waitToLoadElement(createClientBankMappingBtn);
		createClientBankMappingBtn.click();
		
		WebDriverWaitFunctions.waitToLoadElement(clientnameAutoSuggSearch);
		clientnameAutoSuggSearch.sendKeys(file.getAdminCOBTestData("clientBankMappingSearchClientName"));
		
		List<WebElement> clientList= driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));
		
		for(int i=0; i<clientList.size();i++) {
			if(clientList.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("clientBankMappingSelectClient"))) {
				WebElement element= clientList.get(i);
				element.click();
				break;
			}
		}

		WebDriverWaitFunctions.waitToLoadElement(bankAccountTypeDD);
		Select bankAccountTypeDDSL= new Select(bankAccountTypeDD);
		bankAccountTypeDDSL.selectByVisibleText(file.getAdminCOBTestData("bankAccountTypeDD"));

		WebDriverWaitFunctions.waitToLoadElement(ClientBankIFSCcodeAutoSuggSearch);
		ClientBankIFSCcodeAutoSuggSearch.sendKeys(file.getAdminCOBTestData("ClientBankIFSCcodeAutoSuggSearch"));

		WebElement ifsc= driver.findElement(By.xpath("//a[@id='ui-id-33']"));
		WebDriverWaitFunctions.waitToLoadElement(ifsc);
		ifsc.click();
		
		WebDriverWaitFunctions.waitToLoadElement(bankAccountNo);
		bankAccountNo.sendKeys(file.getAdminCOBTestData("bankAccountNo"));
		
		WebDriverWaitFunctions.waitToLoadElement(isDefaultForWealthDD);
		Select isDefaultForWealthDDSL= new Select(isDefaultForWealthDD);
		isDefaultForWealthDDSL.selectByVisibleText(file.getAdminCOBTestData("isDefaultForWealthDD"));
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		
		WebDriverWaitFunctions.waitToLoadElement(isMtfDD);
		Select isMtfDDSL= new Select(isMtfDD);
		isMtfDDSL.selectByVisibleText(file.getAdminCOBTestData("isMtfDD"));
		
		WebDriverWaitFunctions.waitToLoadElement(isDefaultForMTFDD);
		Select isDefaultForMTFDDSL= new Select(isDefaultForMTFDD);
		isDefaultForMTFDDSL.selectByVisibleText(file.getAdminCOBTestData("isDefaultForMTFDD"));
		
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		
		ScrollPageToFindElement.findElementByPageScrolling(driver, save);
		
		WebDriverWaitFunctions.waitToLoadElement(isItPOADD);
		Select isItPOADDSL= new Select(isItPOADD);
		isItPOADDSL.selectByVisibleText(file.getAdminCOBTestData("isItPOADD"));
		
		WebDriverWaitFunctions.waitToLoadElement(holderName1);
		holderName1.sendKeys(file.getAdminCOBTestData("holderName1"));
		
		WebDriverWaitFunctions.waitToLoadElement(holderName2);
		holderName2.sendKeys(file.getAdminCOBTestData("holderName2"));
		
		WebDriverWaitFunctions.waitToLoadElement(holderName3);
		holderName3.sendKeys(file.getAdminCOBTestData("holderName3"));
		
		
		WebDriverWaitFunctions.waitToLoadElement(statusDD);
		Select statusDDSL= new Select(statusDD);
		statusDDSL.selectByVisibleText(file.getAdminCOBTestData("statusDD"));
		
		WebDriverWaitFunctions.waitToLoadElement(save);
		save.click();
	}
}
