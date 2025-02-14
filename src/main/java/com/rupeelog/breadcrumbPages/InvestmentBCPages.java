package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class InvestmentBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Investment")
	@CacheLookup
	private WebElement Investment;
	
	@FindBy(xpath =  "//a[text()='Committed Investment']")
	@CacheLookup
	private WebElement CommittedInvestment;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[text()='Committed Investment(New)']")
	@CacheLookup
	private WebElement CommittedInvestmentNew;

	@FindBy(xpath = "//a[contains(text(),'FD and RD')]")
	@CacheLookup
	private WebElement FDandRD;

	@FindBy(xpath = "//a[text()='Insurance']")
	@CacheLookup
	private WebElement Insurance;
	
	@FindBy(xpath = "//a[contains(text(),'Liability')]")
	@CacheLookup
	private WebElement Liability;

	@FindBy(xpath = "//a[contains(text(),'Real Estate and Others')]")
	@CacheLookup
	private WebElement RealEstateandOthers;
	
	@FindBy(xpath = "//a[contains(text(),'Real Estate Market Price')]")
	@CacheLookup
	private WebElement RealEstateMarketPrice;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[16]/ul[1]/li[8]/a[1]")
	@CacheLookup
	private WebElement TransactionUpload;
	
	public InvestmentBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void committedInvestment() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Investment);
		actions.moveToElement(Investment).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommittedInvestment);
		actions.moveToElement(CommittedInvestment).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CommittedInvestment = breadcrumb.getText();
		Assert.assertTrue(CommittedInvestment.contains(file.getBreadcrumb("CommittedInvestment")), " CommittedInvestment not exits in breadcrumb");
		System.out.println(CommittedInvestment);
	}	
	
	public void committedInvestmentNew() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Investment);
		actions.moveToElement(Investment).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommittedInvestmentNew);
		actions.moveToElement(CommittedInvestmentNew).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CommittedInvestmentNew = breadcrumb.getText();
		Assert.assertTrue(CommittedInvestmentNew.contains(file.getBreadcrumb("CommittedInvestmentNew")), " CommittedInvestmentNew not exits in breadcrumb");
		System.out.println(CommittedInvestmentNew);
	}	
	
	public void fdAndRD() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Investment);
		actions.moveToElement(Investment).perform();

		WebDriverWaitFunctions.waitToLoadElement(FDandRD);
		actions.moveToElement(FDandRD).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FDandRD = breadcrumb.getText();
		Assert.assertTrue(FDandRD.contains(file.getBreadcrumb("FDandRD")), "FDandRD  not exits in breadcrumb");
		System.out.println(FDandRD);
	}	
	
	public void insurance() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Investment);
		actions.moveToElement(Investment).perform();

		WebDriverWaitFunctions.waitToLoadElement(Insurance);
		actions.moveToElement(Insurance).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Insurance = breadcrumb.getText();
		Assert.assertTrue(Insurance.contains(file.getBreadcrumb("Insurance")), "Insurance  not exits in breadcrumb");
		System.out.println(Insurance);
	}	
	
	public void liability() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Investment);
		actions.moveToElement(Investment).perform();

		WebDriverWaitFunctions.waitToLoadElement(Liability);
		actions.moveToElement(Liability).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Liability = breadcrumb.getText();
		Assert.assertTrue(Liability.contains(file.getBreadcrumb("Liability")), "Liability  not exits in breadcrumb");
		System.out.println(Liability);
	}	
	
	public void realEstateandOthers() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Investment);
		actions.moveToElement(Investment).perform();

		WebDriverWaitFunctions.waitToLoadElement(RealEstateandOthers);
		actions.moveToElement(RealEstateandOthers).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RealEstateandOthers = breadcrumb.getText();
		Assert.assertTrue(RealEstateandOthers.contains(file.getBreadcrumb("RealEstateandOthers")), "RealEstateandOthers  not exits in breadcrumb");
		System.out.println(RealEstateandOthers);
	}	
	
	public void realEstateMarketPrice() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Investment);
		actions.moveToElement(Investment).perform();

		WebDriverWaitFunctions.waitToLoadElement(RealEstateMarketPrice);
		actions.moveToElement(RealEstateMarketPrice).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RealEstateMarketPrice = breadcrumb.getText();
		Assert.assertTrue(RealEstateMarketPrice.contains(file.getBreadcrumb("RealEstateMarketPrice")), "RealEstateMarketPrice  not exits in breadcrumb");
		System.out.println(RealEstateMarketPrice);
	}	
	
	public void transactionUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Investment);
		actions.moveToElement(Investment).perform();

		WebDriverWaitFunctions.waitToLoadElement(TransactionUpload);
		actions.moveToElement(TransactionUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String TransactionUpload = breadcrumb.getText();
		Assert.assertTrue(TransactionUpload.contains(file.getBreadcrumb("TransactionUpload")), "TransactionUpload  not exits in breadcrumb");
		System.out.println(TransactionUpload);
	}	
}
