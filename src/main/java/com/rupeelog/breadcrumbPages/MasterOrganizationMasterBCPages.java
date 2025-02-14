package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class MasterOrganizationMasterBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Master']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[contains(text(),'Organization Master')]")
	@CacheLookup
	private WebElement OrganizationMaster;

	@FindBy(linkText  = "Branch")
	@CacheLookup
	private WebElement Branch;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Branch Category')]")
	@CacheLookup
	private WebElement BranchCategory;
	
	@FindBy(xpath = "//a[contains(text(),'Cluster')]")
	@CacheLookup
	private WebElement Cluster;
	
	@FindBy(xpath = "//a[contains(text(),'Counter Party')]")
	@CacheLookup
	private WebElement CounterParty;

	@FindBy(xpath = "//a[contains(text(),'Department')]")
	@CacheLookup
	private WebElement Department;

	@FindBy(xpath = "//a[contains(text(),'Designation')]")
	@CacheLookup
	private WebElement Designation;

	@FindBy(xpath = "//a[contains(text(),'Employee Certificate')]")
	@CacheLookup
	private WebElement EmployeeCertificate;

	@FindBy(xpath = "//a[contains(text(),'Organization')]")
	@CacheLookup
	private WebElement Organization;

	@FindBy(xpath = "//a[contains(text(),'Region')]")
	@CacheLookup
	private WebElement Region;

	@FindBy(xpath = "//a[contains(text(),'Zone')]")
	@CacheLookup
	private WebElement Zone;
	


	public MasterOrganizationMasterBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void branch() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Branch);
		actions.moveToElement(Branch).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Branch = breadcrumb.getText();
		Assert.assertTrue(Branch.contains(file.getBreadcrumb("omBranch")), "Branch name not exits in breadcrumb");
		System.out.println(Branch); //Branch
	}

	public void branchCategory() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(BranchCategory);
		actions.moveToElement(BranchCategory).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BranchCategory = breadcrumb.getText();
		Assert.assertTrue(BranchCategory.contains(file.getBreadcrumb("BranchCategory")),
				"Branch Category name not exits in breadcrumb");
		System.out.println(BranchCategory);
	}

	
	public void cluster() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Cluster);
		actions.moveToElement(Cluster).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Cluster = breadcrumb.getText();
		Assert.assertTrue(Cluster.contains(file.getBreadcrumb("Cluster")),
				"Cluster name not exits in breadcrumb");
		System.out.println(Cluster);
	}
	
	
	
	
	public void counterParty() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(CounterParty);
		actions.moveToElement(CounterParty).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CounterParty = breadcrumb.getText();
		Assert.assertTrue(CounterParty.contains(file.getBreadcrumb("CounterParty")),
				"Counter Party name not exits in breadcrumb");
		System.out.println(CounterParty);
	}
	
	
	
	public void department() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Department);
		actions.moveToElement(Department).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Department = breadcrumb.getText();
		Assert.assertTrue(Department.contains(file.getBreadcrumb("Department")),
				"Department name not exits in breadcrumb");
		System.out.println(Department);
	}
	
	public void designation() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Designation);
		actions.moveToElement(Designation).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Designation = breadcrumb.getText();
		Assert.assertTrue(Designation.contains(file.getBreadcrumb("Designation")),
				"Designation name not exits in breadcrumb");
		System.out.println(Designation);
	}
	
	public void employeeCertificate() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(EmployeeCertificate);
		actions.moveToElement(EmployeeCertificate).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String EmployeeCertificate = breadcrumb.getText();
		Assert.assertTrue(EmployeeCertificate.contains(file.getBreadcrumb("EmployeeCertificate")),
				"Employee Certificate name not exits in breadcrumb");
		System.out.println(EmployeeCertificate);
	}

	public void organization() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Organization);
		actions.moveToElement(Organization).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Organization = breadcrumb.getText();
		Assert.assertTrue(Organization.contains(file.getBreadcrumb("Organization")),
				"Organization name not exits in breadcrumb");
		System.out.println(Organization);
	}

	public void region() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Region);
		actions.moveToElement(Region).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Region = breadcrumb.getText();
		Assert.assertTrue(Region.contains(file.getBreadcrumb("Region")),
				"Region name not exits in breadcrumb");
		System.out.println(Region);
	}

	public void zone() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Zone);
		actions.moveToElement(Zone).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Zone = breadcrumb.getText();
		Assert.assertTrue(Zone.contains(file.getBreadcrumb("Zone")),
				"Zone name not exits in breadcrumb");
		System.out.println(Zone);
	}



}
