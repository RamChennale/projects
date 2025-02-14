package com.rupeelog.adminPwdTests;

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

public class CreateMFExchPwdPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;

	@FindBy(linkText = "Password")
	@CacheLookup
	private WebElement passwordMenu;

	@FindBy(linkText = "MF Exchange Password")
	@CacheLookup
	private WebElement MFExchangePassword;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "Entity")
	@CacheLookup
	private WebElement mfPwdEntityDD;

	@FindBy(id = "Exchange")
	@CacheLookup
	private WebElement mfPwdExchangeDD;

	@FindBy(id = "Type")
	@CacheLookup
	private WebElement mfPwdTypeDD;

	@FindBy(id = "Userid")
	@CacheLookup
	private WebElement mfPwdUserid;

	@FindBy(id = "Memberid")
	@CacheLookup
	private WebElement mfPwdMemberid;

	@FindBy(id = "Password")
	@CacheLookup
	private WebElement mfPwdPassword;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateMFExchPwdPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createMFExchPwd() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(passwordMenu);
		actions.moveToElement(passwordMenu).perform();

		ElementWait.isElementVisible(MFExchangePassword);
		actions.moveToElement(MFExchangePassword).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(mfPwdEntityDD);
		Select selectmfPwdEntityDD= new Select(mfPwdEntityDD);
		selectmfPwdEntityDD.selectByVisibleText(file.getAdminTestData("mfPwdEntityDD"));
		
		ElementWait.isElementVisible(mfPwdExchangeDD);
		Select selectmfPwdExchangeDD= new Select(mfPwdExchangeDD);
		selectmfPwdExchangeDD.selectByVisibleText(file.getAdminTestData("mfPwdExchangeDD"));
		
		ElementWait.isElementVisible(mfPwdTypeDD);
		Select selectmfPwdTypeDD= new Select(mfPwdTypeDD);
		selectmfPwdTypeDD.selectByVisibleText(file.getAdminTestData("mfPwdTypeDD"));
		
		ElementWait.isElementVisible(mfPwdUserid);
		mfPwdUserid.sendKeys(file.getAdminTestData("mfPwdUserid"));
		
		ElementWait.isElementVisible(mfPwdMemberid);
		mfPwdMemberid.sendKeys(file.getAdminTestData("mfPwdMemberid"));
		
		ElementWait.isElementVisible(mfPwdPassword);
		mfPwdPassword.sendKeys(file.getAdminTestData("mfPwdPassword"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			alert = driver.switchTo().alert();
			System.out.println(" MF Exchange Pwd creation : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}

	}
}
