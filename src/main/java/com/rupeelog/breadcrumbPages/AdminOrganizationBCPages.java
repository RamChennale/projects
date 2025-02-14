package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminOrganizationBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//div[@id='smoothmenu-ajax']/ul/li[3]/ul[1]/li[7]/a[1]")
	@CacheLookup
	private WebElement Organization;

	@FindBy(xpath = "//li[3]//ul[1]//li[7]//ul[1]//li[1]//a[1]")
	@CacheLookup
	private WebElement Employee;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Employee Reporting Mapping')]")
	@CacheLookup
	private WebElement EmployeeReportingMapping;
	
	@FindBy(xpath = "//a[contains(text(),'Linked Employee')]")
	@CacheLookup
	private WebElement LinkedEmployee;
	
	@FindBy(xpath = "//a[contains(text(),'Reporting Organization Tree')]")
	@CacheLookup
	private WebElement ReportingOrganizationTree;
	
	public AdminOrganizationBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void employee() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Organization);
		actions.moveToElement(Organization).perform();

		WebDriverWaitFunctions.waitToLoadElement(Employee);
		actions.moveToElement(Employee).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Employee = breadcrumb.getText();
		Assert.assertTrue(Employee.contains(file.getBreadcrumb("Employee")), "Employee name not exits in breadcrumb");
		System.out.println(Employee);
	}

	public void employeeReportingMapping() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Organization);
		actions.moveToElement(Organization).perform();

		WebDriverWaitFunctions.waitToLoadElement(EmployeeReportingMapping);
		actions.moveToElement(EmployeeReportingMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String EmployeeReportingMapping = breadcrumb.getText();
		Assert.assertTrue(EmployeeReportingMapping.contains(file.getBreadcrumb("EmployeeReportingMapping")), "EmployeeReportingMapping name not exits in breadcrumb");
		System.out.println(EmployeeReportingMapping);
	}
	
	public void linkedEmployee() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Organization);
		actions.moveToElement(Organization).perform();

		WebDriverWaitFunctions.waitToLoadElement(LinkedEmployee);
		actions.moveToElement(LinkedEmployee).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String LinkedEmployee = breadcrumb.getText();
		Assert.assertTrue(LinkedEmployee.contains(file.getBreadcrumb("LinkedEmployee")), "LinkedEmployee name not exits in breadcrumb");
		System.out.println(LinkedEmployee);
	}
	
	public void reportingOrganizationTree() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Organization);
		actions.moveToElement(Organization).perform();

		WebDriverWaitFunctions.waitToLoadElement(ReportingOrganizationTree);
		actions.moveToElement(ReportingOrganizationTree).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ReportingOrganizationTree = breadcrumb.getText();
		//Assert.assertTrue(ReportingOrganizationTree.contains(file.getBreadcrumb("ReportingOrganizationTree")), " ReportingOrganizationTree name not exits in breadcrumb");
		System.out.println(ReportingOrganizationTree);
	}

}
