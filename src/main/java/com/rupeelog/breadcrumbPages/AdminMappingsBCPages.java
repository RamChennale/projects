package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminMappingsBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//*[text()='Mappings']")
	@CacheLookup
	private WebElement Mappings;

	@FindBy(xpath = "//a[contains(text(),'Client Bank Mapping')]")
	@CacheLookup
	private WebElement ClientBankMapping;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Client Demat Mapping')]")
	@CacheLookup
	private WebElement ClientDematMapping;
	
	@FindBy(xpath = "//a[contains(text(),'Client-IPS Mapping')]")
	@CacheLookup
	private WebElement ClientIPSMapping;
	
	@FindBy(xpath = "//a[contains(text(),'Family Benchmark mapping')]")
	@CacheLookup
	private WebElement FamilyBenchmarkmapping;

	@FindBy(xpath = "//a[contains(text(),'Family RM Mapping')]")
	@CacheLookup
	private WebElement FamilyRMMapping;
	
	@FindBy(xpath = "//a[contains(text(),'Family RM Mappings Upload')]")
	@CacheLookup
	private WebElement FamilyRMMappingsUpload;
	
	public AdminMappingsBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void clientBankMapping() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Mappings);
		actions.moveToElement(Mappings).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientBankMapping);
		actions.moveToElement(ClientBankMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  ClientBankMapping= breadcrumb.getText();
		Assert.assertTrue(ClientBankMapping.contains(file.getBreadcrumb("ClientBankMapping")), "ClientBankMapping name not exits in breadcrumb");
		System.out.println(ClientBankMapping);
	}
	
	public void clientDematMapping() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Mappings);
		actions.moveToElement(Mappings).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientDematMapping);
		actions.moveToElement(ClientDematMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ClientDematMapping = breadcrumb.getText();
		Assert.assertTrue(ClientDematMapping.contains(file.getBreadcrumb("ClientDematMapping")), "ClientDematMapping name not exits in breadcrumb");
		System.out.println(ClientDematMapping);
	}
	
	public void clientIPSMapping() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Mappings);
		actions.moveToElement(Mappings).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientIPSMapping);
		actions.moveToElement(ClientIPSMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  ClientIPSMapping= breadcrumb.getText();
		Assert.assertTrue(ClientIPSMapping.contains(file.getBreadcrumb("ClientIPSMapping")), "ClientIPSMapping name not exits in breadcrumb");
		System.out.println(ClientIPSMapping);
	}
	
	public void familyBenchmarkmapping() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Mappings);
		actions.moveToElement(Mappings).perform();

		WebDriverWaitFunctions.waitToLoadElement(FamilyBenchmarkmapping);
		actions.moveToElement(FamilyBenchmarkmapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FamilyBenchmarkmapping = breadcrumb.getText();
		Assert.assertTrue(FamilyBenchmarkmapping.contains(file.getBreadcrumb("FamilyBenchmarkmapping")), " FamilyBenchmarkmapping name not exits in breadcrumb");
		System.out.println(FamilyBenchmarkmapping);
	}
	
	public void familyRMMapping() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Mappings);
		actions.moveToElement(Mappings).perform();

		WebDriverWaitFunctions.waitToLoadElement(FamilyRMMapping);
		actions.moveToElement(FamilyRMMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FamilyRMMapping = breadcrumb.getText();
		Assert.assertTrue(FamilyRMMapping.contains(file.getBreadcrumb("FamilyRMMapping")), "FamilyRMMapping name not exits in breadcrumb");
		System.out.println(FamilyRMMapping);
	}
	
	public void familyRMMappingsUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(Mappings);
		actions.moveToElement(Mappings).perform();

		WebDriverWaitFunctions.waitToLoadElement(FamilyRMMappingsUpload);
		actions.moveToElement(FamilyRMMappingsUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FamilyRMMappingsUpload = breadcrumb.getText();
		Assert.assertTrue(FamilyRMMappingsUpload.contains(file.getBreadcrumb("FamilyRMMappingsUpload")), " FamilyRMMappingsUpload name not exits in breadcrumb");
		System.out.println(FamilyRMMappingsUpload);
	}

}
