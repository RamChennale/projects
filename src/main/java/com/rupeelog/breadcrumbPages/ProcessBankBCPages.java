package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessBankBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;

	
	@FindBy(linkText = "Bank")
	@CacheLookup
	private WebElement Bank;
	
	@FindBy(xpath = "//a[contains(text(),'Bank Statement Recon')]")
	@CacheLookup
	private WebElement BankStatementRecon;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public ProcessBankBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void bankStatementRecon() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Bank);
		actions.moveToElement(Bank).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankStatementRecon);
		actions.moveToElement(BankStatementRecon).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BankStatementRecon = breadcrumb.getText();
		Assert.assertTrue(BankStatementRecon.contains(file.getBreadcrumb("BankStatementRecon")), "BankStatementRecon  not exits in breadcrumb");
		System.out.println(BankStatementRecon);
	}	
	
}
