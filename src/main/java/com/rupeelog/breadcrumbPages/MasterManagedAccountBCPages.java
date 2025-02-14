package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class MasterManagedAccountBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Master']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//*[contains(text(),'Managed Account')]")
	@CacheLookup
	private WebElement ManagedAccount;

	@FindBy(xpath = "//a[contains(text(),'Managed Account Advisor')]")
	@CacheLookup
	private WebElement ManagedAccountAdvisor;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;

	public MasterManagedAccountBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void managedAccountAdvisor() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccount);
		actions.moveToElement(ManagedAccount).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccountAdvisor);
		actions.moveToElement(ManagedAccountAdvisor).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ManagedAccountAdvisor = breadcrumb.getText();
		Assert.assertTrue(ManagedAccountAdvisor.contains(file.getBreadcrumb("ManagedAccountAdvisor")),
				"Managed Account Advisor name not exits in breadcrumb");
		System.out.println(ManagedAccountAdvisor);
	}

}
