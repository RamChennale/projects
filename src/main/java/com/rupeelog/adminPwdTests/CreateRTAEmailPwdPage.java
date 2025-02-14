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

public class CreateRTAEmailPwdPage {

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

	@FindBy(linkText = "RTA Email Password")
	@CacheLookup
	private WebElement RTAEmailPassword;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "ArnId")
	@CacheLookup
	private WebElement rtaArnDD;

	@FindBy(id = "Camspwd1")
	@CacheLookup
	private WebElement rtaCamspwd1;

	@FindBy(id = "Karvypwd1")
	@CacheLookup
	private WebElement rtaKarvypwd1;

	@FindBy(id = "Franklinpwd1")
	@CacheLookup
	private WebElement rtaFranklinpwd1;

	@FindBy(id = "Sundarampwd1")
	@CacheLookup
	private WebElement rtaSundarampwd1;

	@FindBy(id = "Host")
	@CacheLookup
	private WebElement rtaHost;

	@FindBy(id = "Port")
	@CacheLookup
	private WebElement rtaPort;

	@FindBy(id = "Username")
	@CacheLookup
	private WebElement rtaUsername;

	@FindBy(id = "Password")
	@CacheLookup
	private WebElement rtaPassword;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateRTAEmailPwdPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createRTAEmailPwd() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(passwordMenu);
		actions.moveToElement(passwordMenu).perform();

		ElementWait.isElementVisible(RTAEmailPassword);
		actions.moveToElement(RTAEmailPassword).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(rtaArnDD);
		Select selectrtaArnDD= new Select(rtaArnDD);
		selectrtaArnDD.selectByVisibleText(file.getAdminTestData("rtaArnDD"));
		
		ElementWait.isElementVisible(rtaCamspwd1);
		rtaCamspwd1.sendKeys(file.getAdminTestData("rtaCamspwd1"));
		
		ElementWait.isElementVisible(rtaKarvypwd1);
		rtaKarvypwd1.sendKeys(file.getAdminTestData("rtaKarvypwd1"));
		
		ElementWait.isElementVisible(rtaFranklinpwd1);
		rtaFranklinpwd1.sendKeys(file.getAdminTestData("rtaFranklinpwd1"));
		
		ElementWait.isElementVisible(rtaSundarampwd1);
		rtaSundarampwd1.sendKeys(file.getAdminTestData("rtaSundarampwd1"));
		
		ElementWait.isElementVisible(rtaHost);
		rtaHost.sendKeys(file.getAdminTestData("rtaHost"));
		
		ElementWait.isElementVisible(rtaPort);
		rtaPort.sendKeys(file.getAdminTestData("rtaPort"));
		
		ElementWait.isElementVisible(rtaUsername);
		rtaUsername.sendKeys(file.getAdminTestData("rtaUsername"));
		
		ElementWait.isElementVisible(rtaPassword);
		rtaPassword.sendKeys(file.getAdminTestData("rtaPassword"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			alert = driver.switchTo().alert();
			System.out.println(" RTA Email Pwd creation : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}

	}
}
