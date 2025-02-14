package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessEquityBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;

	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[12]/a[1]")
	@CacheLookup
	private WebElement Equity;
	
	@FindBy(xpath = "//a[contains(text(),'Equity Error Txn - Exec')]")
	@CacheLookup
	private WebElement EquityErrorTxnExec;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Fetch Prices for Equity Masters')]")
	@CacheLookup
	private WebElement FetchPricesforEquityMasters;
	
	@FindBy(xpath = "//a[contains(text(),'Run Eod Process')]")
	@CacheLookup
	private WebElement RunEodProcess;
	
	public ProcessEquityBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void equityErrorTxnExec() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Equity);
		actions.moveToElement(Equity).perform();

		WebDriverWaitFunctions.waitToLoadElement(EquityErrorTxnExec);
		actions.moveToElement(EquityErrorTxnExec).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String EquityErrorTxnExec = breadcrumb.getText();
		Assert.assertTrue(EquityErrorTxnExec.contains(file.getBreadcrumb("EquityErrorTxnExec")), " EquityErrorTxnExec not exits in breadcrumb");
		System.out.println(EquityErrorTxnExec);
	}	
	
	public void fetchPricesforEquityMasters() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Equity);
		actions.moveToElement(Equity).perform();

		WebDriverWaitFunctions.waitToLoadElement(FetchPricesforEquityMasters);
		actions.moveToElement(FetchPricesforEquityMasters).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FetchPricesforEquityMasters = breadcrumb.getText();
		Assert.assertTrue(FetchPricesforEquityMasters.contains(file.getBreadcrumb("FetchPricesforEquityMasters")), " FetchPricesforEquityMasters not exits in breadcrumb");
		System.out.println(FetchPricesforEquityMasters);
	}	
	
}
