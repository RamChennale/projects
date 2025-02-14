package com.rupeelog.adminOrgPages;

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

public class CreateEmpPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;

	@FindBy(linkText = "Organization")
	@CacheLookup
	private WebElement Organization;

	@FindBy(linkText = "Employee")
	@CacheLookup
	private WebElement Employee;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "FirstName")
	@CacheLookup
	private WebElement empFirstName;

	@FindBy(id = "MiddleName")
	@CacheLookup
	private WebElement empMiddleName;

	@FindBy(id = "LastName")
	@CacheLookup
	private WebElement empLastName;

	@FindBy(id = "Code")
	@CacheLookup
	private WebElement empCode;

	@FindBy(id = "extdesign")
	@CacheLookup
	private WebElement empExtdesignDD;

	@FindBy(id = "Email")
	@CacheLookup
	private WebElement empEmail;

	@FindBy(id = "LoginId")
	@CacheLookup
	private WebElement empLogin;

	@FindBy(id = "Password")
	@CacheLookup
	private WebElement empPassword;

	@FindBy(id = "Status")
	@CacheLookup
	private WebElement empStatus;

	@FindBy(id = "StartDate")
	@CacheLookup
	private WebElement empStartDate;

	@FindBy(id = "subType")
	@CacheLookup
	private WebElement empSubType;

	@FindBy(id = "orgnId")
	@CacheLookup
	private WebElement empOrgn;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateEmpPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createEmp() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(Organization);
		actions.moveToElement(Organization).perform();

		ElementWait.isElementVisible(Employee);
		actions.moveToElement(Employee).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(empFirstName);
		empFirstName.sendKeys(file.getAdminTestData("empFirstName"));
		
		ElementWait.isElementVisible(empMiddleName);
		empMiddleName.sendKeys(file.getAdminTestData("empMiddleName"));
		
		ElementWait.isElementVisible(empLastName);
		empLastName.sendKeys(file.getAdminTestData("empLastName"));
		
		ElementWait.isElementVisible(empCode);
		empCode.sendKeys(file.getAdminTestData("empCode"));
		
		ElementWait.isElementVisible(empExtdesignDD);
		Select selectempExtdesignDD= new Select(empExtdesignDD);
		selectempExtdesignDD.selectByVisibleText(file.getAdminTestData("empExtdesignDD"));
		
		ElementWait.isElementVisible(empEmail);
		empEmail.sendKeys(file.getAdminTestData("empEmail"));
		
		ElementWait.isElementVisible(empLogin);
		empLogin.sendKeys(file.getAdminTestData("empLogin"));
		
		ElementWait.isElementVisible(empPassword);
		empPassword.sendKeys(file.getAdminTestData("empPassword"));
		
		ElementWait.scrollToFindElement(driver, empOrgn);
		
		ElementWait.isElementVisible(empStatus);
		Select selectempStatus= new Select(empStatus);
		selectempStatus.selectByVisibleText(file.getAdminTestData("empStatus"));
		
		ElementWait.isElementVisible(empStartDate);
		empStartDate.sendKeys(file.getAdminTestData("empStartDate"));
		
		/*
		 * ElementWait.isElementVisible(); .sendKeys(file.getAdminTestData(""));
		 */
		
		ElementWait.isElementVisible(empSubType);
		Select selectempSubType= new Select(empSubType);
		selectempSubType.selectByVisibleText(file.getAdminTestData("empSubType"));
		
		ElementWait.isElementVisible(empOrgn);
		Select selectempOrgn= new Select(empOrgn);
		selectempOrgn.selectByVisibleText(file.getAdminTestData("empOrgn"));

		ElementWait.scrollToFindElement(driver, saveBtn);
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			alert = driver.switchTo().alert();
			System.out.println("Employee creation : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}

	}
}
