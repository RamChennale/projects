package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class RIMSRimsMiscBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(xpath = "//a[contains(text(),'RIMS Misc.')]")
	@CacheLookup
	private WebElement RIMSMisc;
	
	@FindBy(xpath = "//a[contains(text(),'Expense Salary Upload')]")
	@CacheLookup
	private WebElement ExpenseSalaryUpload;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'International AUM')]")
	@CacheLookup
	private WebElement InternationalAUM;
	
	@FindBy(xpath = "//a[contains(text(),'KRA Based Target')]")
	@CacheLookup
	private WebElement KRABasedTarget;
	
	@FindBy(xpath = "//a[contains(text(),'Service RM-RM Linkage')]")
	@CacheLookup
	private WebElement ServiceRMRMLinkage;
	
	public RIMSRimsMiscBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void expenseSalaryUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSMisc);
		actions.moveToElement(RIMSMisc).perform();

		WebDriverWaitFunctions.waitToLoadElement(ExpenseSalaryUpload);
		actions.moveToElement(ExpenseSalaryUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ExpenseSalaryUpload = breadcrumb.getText();
		Assert.assertTrue(ExpenseSalaryUpload.contains(file.getBreadcrumb("ExpenseSalaryUpload")), "ExpenseSalaryUpload  not exits in breadcrumb");
		System.out.println(ExpenseSalaryUpload);
	}	
	
	public void internationalAUM() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSMisc);
		actions.moveToElement(RIMSMisc).perform();

		WebDriverWaitFunctions.waitToLoadElement(InternationalAUM);
		actions.moveToElement(InternationalAUM).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String InternationalAUM = breadcrumb.getText();
		Assert.assertTrue(InternationalAUM.contains(file.getBreadcrumb("InternationalAUM")), "InternationalAUM  not exits in breadcrumb");
		System.out.println(InternationalAUM);
	}	
	
	public void KRABasedTarget() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSMisc);
		actions.moveToElement(RIMSMisc).perform();

		WebDriverWaitFunctions.waitToLoadElement(KRABasedTarget);
		actions.moveToElement(KRABasedTarget).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String KRABasedTarget = breadcrumb.getText();
		Assert.assertTrue(KRABasedTarget.contains(file.getBreadcrumb("KRABasedTarget")), "KRABasedTarget  not exits in breadcrumb");
		System.out.println(KRABasedTarget);
	}	
	
	public void serviceRMRMLinkage() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(RIMSMisc);
		actions.moveToElement(RIMSMisc).perform();

		WebDriverWaitFunctions.waitToLoadElement(ServiceRMRMLinkage);
		actions.moveToElement(ServiceRMRMLinkage).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ServiceRMRMLinkage = breadcrumb.getText();
		Assert.assertTrue(ServiceRMRMLinkage.contains(file.getBreadcrumb("ServiceRMRMLinkage")), "ServiceRMRMLinkage  not exits in breadcrumb");
		System.out.println(ServiceRMRMLinkage);
	}	
}
