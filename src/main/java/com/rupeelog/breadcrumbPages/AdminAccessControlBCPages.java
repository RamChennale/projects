package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminAccessControlBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),'Access Control')]")
	@CacheLookup
	private WebElement AccessControl;

	@FindBy(xpath = "//a[contains(text(),'Assign Resource')]")
	@CacheLookup
	private WebElement AssignResource;
	
	@FindBy(xpath = "//a[contains(text(),'Change Employee Password')]")
	@CacheLookup
	private WebElement ChangeEmployeePassword;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Change password')]")
	@CacheLookup
	private WebElement ChangePassword;
	
	@FindBy(xpath = "//a[contains(text(),'Change Password - Kyph')]")
	@CacheLookup
	private WebElement ChangPasswordKyph;

	@FindBy(xpath = "//a[contains(text(),'Role')]")
	@CacheLookup
	private WebElement Role;
	
	@FindBy(xpath = "//a[contains(text(),'User-Role Access')]")
	@CacheLookup
	private WebElement UserRoleAccess;

	public AdminAccessControlBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void assignResource() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(AccessControl);
		actions.moveToElement(AccessControl).perform();

		WebDriverWaitFunctions.waitToLoadElement(AssignResource);
		actions.moveToElement(AssignResource).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String AssignResource = breadcrumb.getText();
		Assert.assertTrue(AssignResource.contains(file.getBreadcrumb("AssignResource")), "AssignResource name not exits in breadcrumb");
		System.out.println(AssignResource);
	}

	public void changeEmployeePassword() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(AccessControl);
		actions.moveToElement(AccessControl).perform();

		WebDriverWaitFunctions.waitToLoadElement(ChangeEmployeePassword);
		actions.moveToElement(ChangeEmployeePassword).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ChangeEmployeePassword = breadcrumb.getText();
		Assert.assertTrue(ChangeEmployeePassword.contains(file.getBreadcrumb("ChangeEmployeePassword")), "ChangeEmployeePassword name not exits in breadcrumb");
		System.out.println(ChangeEmployeePassword);
	}
	
	public void changePassword() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(AccessControl);
		actions.moveToElement(AccessControl).perform();

		WebDriverWaitFunctions.waitToLoadElement(ChangePassword);
		actions.moveToElement(ChangePassword).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ChangePassword = breadcrumb.getText();
		Assert.assertTrue(ChangePassword.contains(file.getBreadcrumb("ChangePassword")), "ChangePassword name not exits in breadcrumb");
		System.out.println(ChangePassword);
	}
	
	public void changPasswordKyph() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(AccessControl);
		actions.moveToElement(AccessControl).perform();

		WebDriverWaitFunctions.waitToLoadElement(ChangPasswordKyph);
		actions.moveToElement(ChangPasswordKyph).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ChangPasswordKyph = breadcrumb.getText();
		Assert.assertTrue(ChangPasswordKyph.contains(file.getBreadcrumb("ChangPasswordKyph")), "ChangPasswordKyph name not exits in breadcrumb");
		System.out.println(ChangPasswordKyph);
	}
	
	public void role() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(AccessControl);
		actions.moveToElement(AccessControl).perform();

		WebDriverWaitFunctions.waitToLoadElement(Role);
		actions.moveToElement(Role).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Role = breadcrumb.getText();
		Assert.assertTrue(Role.contains(file.getBreadcrumb("Role")), "Role name not exits in breadcrumb");
		System.out.println(Role);
	}
	
	public void userRoleAccess() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(AccessControl);
		actions.moveToElement(AccessControl).perform();

		WebDriverWaitFunctions.waitToLoadElement(UserRoleAccess);
		actions.moveToElement(UserRoleAccess).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String UserRoleAccess = breadcrumb.getText();
		Assert.assertTrue(UserRoleAccess.contains(file.getBreadcrumb("UserRoleAccess")), "UserRoleAccess name not exits in breadcrumb");
		System.out.println(UserRoleAccess);
	}

}
