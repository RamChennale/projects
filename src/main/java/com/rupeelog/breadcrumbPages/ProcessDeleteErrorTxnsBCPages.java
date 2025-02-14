package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessDeleteErrorTxnsBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(xpath = "//a[contains(text(),'Delete Error Txns')]")
	@CacheLookup
	private WebElement DeleteErrorTxns;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public ProcessDeleteErrorTxnsBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void deleteErrorTxns() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(DeleteErrorTxns);
		actions.moveToElement(DeleteErrorTxns).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String DeleteErrorTxns = breadcrumb.getText();
		Assert.assertTrue(DeleteErrorTxns.contains(file.getBreadcrumb("DeleteErrorTxns")), "DeleteErrorTxns  not exits in breadcrumb");
		System.out.println(DeleteErrorTxns);
	}	
	
}
