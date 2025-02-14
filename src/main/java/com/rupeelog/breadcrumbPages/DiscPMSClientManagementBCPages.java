package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class DiscPMSClientManagementBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath =  "//a[contains(text(),'Disc PMS')]")
	@CacheLookup
	private WebElement DiscPMS;
	
	@FindBy(xpath = "//a[contains(text(),'Client Management')]")
	@CacheLookup
	private WebElement ClientManagement;
	
	@FindBy(xpath = "//a[contains(text(),'Corpus Out Request View')]")
	@CacheLookup
	private WebElement CorpusOutRequestView;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Freeze Portfolio')]")
	@CacheLookup
	private WebElement FreezePortfolio;
	
	@FindBy(xpath = "//a[contains(text(),'Negative List')]")
	@CacheLookup
	private WebElement NegativeList;
	
	public DiscPMSClientManagementBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void corpusOutRequestView() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientManagement);
		actions.moveToElement(ClientManagement).perform();

		WebDriverWaitFunctions.waitToLoadElement(CorpusOutRequestView);
		actions.moveToElement(CorpusOutRequestView).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CorpusOutRequestView = breadcrumb.getText();
		System.out.println(CorpusOutRequestView);
		Assert.assertTrue(CorpusOutRequestView.contains(file.getBreadcrumb("CorpusOutRequestView")), "CorpusOutRequestView  not exits in breadcrumb");
	
	}	
	
	public void freezePortfolio() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientManagement);
		actions.moveToElement(ClientManagement).perform();

		WebDriverWaitFunctions.waitToLoadElement(FreezePortfolio);
		actions.moveToElement(FreezePortfolio).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FreezePortfolio = breadcrumb.getText();
		System.out.println(FreezePortfolio);
		Assert.assertTrue(FreezePortfolio.contains(file.getBreadcrumb("FreezePortfolio")), " FreezePortfolio not exits in breadcrumb");
	
	}	

	
	public void negativeList() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientManagement);
		actions.moveToElement(ClientManagement).perform();

		WebDriverWaitFunctions.waitToLoadElement(NegativeList);
		actions.moveToElement(NegativeList).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String NegativeList = breadcrumb.getText();
		System.out.println(NegativeList);
		Assert.assertTrue(NegativeList.contains(file.getBreadcrumb("NegativeList")), "NegativeList  not exits in breadcrumb");
	
	}	


}
