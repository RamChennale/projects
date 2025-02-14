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
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ClientDematMappingPage {

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

	@FindBy(xpath = "//a[contains(text(),'Client Demat Mapping')]")
	@CacheLookup
	private WebElement clientDematMappingSubMenu;

	@FindBy(xpath = "//input[@id='create']")
	@CacheLookup
	private WebElement createClientDematMappingBtn;

	@FindBy(xpath = "//input[@id='Clientname']")
	@CacheLookup
	private WebElement deClientnameAutoSuggSearch;

	@FindBy(xpath = "//select[@id='dpid']")
	@CacheLookup
	private WebElement depositoryParticipantDD;

	@FindBy(xpath = "//input[@id='DpAccNo']")
	@CacheLookup
	private WebElement clientDPAccNo;

	@FindBy(xpath = "//select[@id='isdefaultford']")
	@CacheLookup
	private WebElement isDefaultForDematDD;

	@FindBy(xpath = "//select[@id='IsMtf']")
	@CacheLookup
	private WebElement isMTFDD;

	@FindBy(xpath = "//select[@id='isdefaultformtf']")
	@CacheLookup
	private WebElement isDefaultForMTFDD;

	@FindBy(xpath = "//select[@id='Status']")
	@CacheLookup
	private WebElement statusDD;

	@FindBy(xpath = "//select[@id='IiflPoa']")
	@CacheLookup
	private WebElement POADD;

	@FindBy(xpath = "//input[@id='CustodyCode1']")
	@CacheLookup
	private WebElement custodyCode1;

	@FindBy(xpath = "//input[@id='CustodyCode2']")
	@CacheLookup
	private WebElement custodyCode2;

	@FindBy(xpath = "//input[@id='CustodyCode3']")
	@CacheLookup
	private WebElement custodyCode3;

	@FindBy(xpath = "//input[@id='CustodyCode4']")
	@CacheLookup
	private WebElement custodyCode4;

	@FindBy(xpath = "//input[@id='CustodyCode5']")
	@CacheLookup
	private WebElement custodyCode5;

	@FindBy(xpath = "//input[@id='Holder1Name']")
	@CacheLookup
	private WebElement holderName1;

	@FindBy(xpath = "//input[@id='Holder2Name']")
	@CacheLookup
	private WebElement holderName2;

	@FindBy(xpath = "//input[@id='Holder3Name']")
	@CacheLookup
	private WebElement holderName3;

	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement saveButton;

	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancelButton;

	public ClientDematMappingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createClientDematMapping() {

		file = new FileReaderUtility();
		actions = new Actions(driver);

		WebDriverWaitFunctions.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();

		WebDriverWaitFunctions.waitToLoadElement(mappingsSubMenu);
		actions.moveToElement(mappingsSubMenu).perform();

		WebDriverWaitFunctions.waitToLoadElement(clientDematMappingSubMenu);
		actions.moveToElement(clientDematMappingSubMenu).click().build().perform();

		createClientDematMappingBtn.click();

		WebDriverWaitFunctions.waitToLoadElement(deClientnameAutoSuggSearch);
		deClientnameAutoSuggSearch.clear();
		deClientnameAutoSuggSearch.sendKeys(file.getAdminCOBTestData("deClientnameAutoSuggSearch"));
		deClientnameAutoSuggSearch.clear();
		deClientnameAutoSuggSearch.sendKeys(file.getAdminCOBTestData("deClientnameAutoSuggSearch"));

		List<WebElement> clientList = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));

		for (int i = 0; i < clientList.size(); i++) {
			if (clientList.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("dematSelectClient"))) {
				clientList.get(i).click();
				break;
			}
		}

		WebDriverWaitFunctions.waitToLoadElement(depositoryParticipantDD);
		Select depositoryParticipantDDSL = new Select(depositoryParticipantDD);
		depositoryParticipantDDSL.selectByVisibleText(file.getAdminCOBTestData("depositoryParticipantDD"));

		WebDriverWaitFunctions.waitToLoadElement(clientDPAccNo);
		clientDPAccNo.sendKeys(file.getAdminCOBTestData("clientDPAccNo"));

		WebDriverWaitFunctions.waitToLoadElement(isDefaultForDematDD);
		Select isDefaultForDematDDSL = new Select(isDefaultForDematDD);
		isDefaultForDematDDSL.selectByVisibleText(file.getAdminCOBTestData("isDefaultForDematDD"));
		
		try {
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}

		WebDriverWaitFunctions.waitToLoadElement(isMTFDD);
		Select isMTFDDSL = new Select(isMTFDD);
		isMTFDDSL.selectByVisibleText(file.getAdminCOBTestData("isMTFDD"));

		WebDriverWaitFunctions.waitToLoadElement(isDefaultForMTFDD);
		Select isDefaultForMTFDDSL = new Select(isDefaultForMTFDD);
		isDefaultForMTFDDSL.selectByVisibleText(file.getAdminCOBTestData("isDefaultForMTFDD"));

		WebDriverWaitFunctions.waitToLoadElement(statusDD);
		Select statusDDSL = new Select(statusDD);
		statusDDSL.selectByVisibleText(file.getAdminCOBTestData("statusDD"));

		WebDriverWaitFunctions.waitToLoadElement(POADD);
		Select POADDSL = new Select(POADD);
		POADDSL.selectByVisibleText(file.getAdminCOBTestData("POADD"));

		WebDriverWaitFunctions.waitToLoadElement(custodyCode1);
		custodyCode1.sendKeys(file.getAdminCOBTestData("custodyCode1"));

		WebDriverWaitFunctions.waitToLoadElement(custodyCode2);
		custodyCode2.sendKeys(file.getAdminCOBTestData("custodyCode2"));

		WebDriverWaitFunctions.waitToLoadElement(custodyCode3);
		custodyCode3.sendKeys(file.getAdminCOBTestData("custodyCode3"));

		WebDriverWaitFunctions.waitToLoadElement(custodyCode4);
		custodyCode4.sendKeys(file.getAdminCOBTestData("custodyCode4"));

		WebDriverWaitFunctions.waitToLoadElement(custodyCode5);
		custodyCode5.sendKeys(file.getAdminCOBTestData("custodyCode5"));

		WebDriverWaitFunctions.waitToLoadElement(holderName1);
		holderName1.sendKeys(file.getAdminCOBTestData("holderName1"));

		WebDriverWaitFunctions.waitToLoadElement(holderName2);
		holderName2.sendKeys(file.getAdminCOBTestData("holderName2"));

		WebDriverWaitFunctions.waitToLoadElement(holderName3);
		holderName3.sendKeys(file.getAdminCOBTestData("holderName3"));

		WebDriverWaitFunctions.waitToLoadElement(saveButton);
		saveButton.click();
		try {
			WebDriverWaitFunctions.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println("Alert Message: " + alertText);
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}

	}
}
