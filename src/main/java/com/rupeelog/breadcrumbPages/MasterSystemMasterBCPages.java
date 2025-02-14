package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class MasterSystemMasterBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Master']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[contains(text(),'System Master')]")
	@CacheLookup
	private WebElement SystemMaster;

	@FindBy(xpath = "//a[contains(text(),'ARN')]")
	@CacheLookup
	private WebElement ARN;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'AutoJob Log')]")
	@CacheLookup
	private WebElement AutoJobLog;
	
	@FindBy(xpath = "//a[contains(text(),'AutoJob SetUp')]")
	@CacheLookup
	private WebElement AutoJobSetUp;
	
	@FindBy(xpath = "//a[contains(text(),'City')]")
	@CacheLookup
	private WebElement City;
	
	@FindBy(xpath = "//a[contains(text(),'Country')]")
	@CacheLookup
	private WebElement Country;

	@FindBy(xpath = "//a[contains(text(),'GL Account Mapping')]")
	@CacheLookup
	private WebElement GLAccountMapping;

	@FindBy(xpath = "//a[contains(text(),'GST Master')]")
	@CacheLookup
	private WebElement GSTMaster;

	@FindBy(xpath = "//a[contains(text(),'State')]")
	@CacheLookup
	private WebElement State;

	@FindBy(xpath = "//a[contains(text(),'Tax Type Rate')]")
	@CacheLookup
	private WebElement TaxTypeRate;

	public MasterSystemMasterBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void arn() {
		actions = new Actions(driver);
		file = new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(ARN);
		actions.moveToElement(ARN).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ARN = breadcrumb.getText();
		Assert.assertTrue(ARN.contains(file.getBreadcrumb("ARN")), "ARN name not exits in breadcrumb");
		System.out.println(ARN); 
	}


	public void autoJobLog() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(AutoJobLog);
		actions.moveToElement(AutoJobLog).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String AutoJobLog = breadcrumb.getText();
		Assert.assertTrue(AutoJobLog.contains(file.getBreadcrumb("AutoJobLog")), "Auto Job Log name not exits in breadcrumb");
		System.out.println(AutoJobLog);
	}

	public void autoJobSetUp() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(AutoJobSetUp);
		actions.moveToElement(AutoJobSetUp).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String AutoJobSetUp = breadcrumb.getText();
		Assert.assertTrue(AutoJobSetUp.contains(file.getBreadcrumb("AutoJobSetUp")), "AutoJobSetUp name not exits in breadcrumb");
		System.out.println(AutoJobSetUp);
	}
	public void city() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(City);
		actions.moveToElement(City).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String City = breadcrumb.getText();
		Assert.assertTrue(City.contains(file.getBreadcrumb("City")), "City name not exits in breadcrumb");
		System.out.println(City);
	}
	
	public void country() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Country);
		actions.moveToElement(Country).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Country = breadcrumb.getText();
		Assert.assertTrue(Country.contains(file.getBreadcrumb("Country")), "Country name not exits in breadcrumb");
		System.out.println(Country);
	}
	
	public void glAccountMapping() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(GLAccountMapping);
		actions.moveToElement(GLAccountMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String GLAccountMapping = breadcrumb.getText();
		Assert.assertTrue(GLAccountMapping.contains(file.getBreadcrumb("GLAccountMapping")), "GLAccountMapping name not exits in breadcrumb");
		System.out.println(GLAccountMapping);
	}
	
	public void gstMaster() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(GSTMaster);
		actions.moveToElement(GSTMaster).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String GSTMaster = breadcrumb.getText();
		Assert.assertTrue(GSTMaster.contains(file.getBreadcrumb("GSTMaster")), "GSTMaster name not exits in breadcrumb");
		System.out.println(GSTMaster);
	}
	
	public void state() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(State);
		actions.moveToElement(State).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String State = breadcrumb.getText();
		Assert.assertTrue(State.contains(file.getBreadcrumb("State")), "State name not exits in breadcrumb");
		System.out.println(State);
	}
	
	public void taxTypeRate() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystemMaster);
		actions.moveToElement(SystemMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(TaxTypeRate);
		actions.moveToElement(TaxTypeRate).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String TaxTypeRate = breadcrumb.getText();
		Assert.assertTrue(TaxTypeRate.contains(file.getBreadcrumb("TaxTypeRate")), "TaxTypeRate name not exits in breadcrumb");
		System.out.println(TaxTypeRate);
	}
}
