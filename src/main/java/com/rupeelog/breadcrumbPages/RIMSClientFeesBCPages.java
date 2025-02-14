package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class RIMSClientFeesBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(xpath = "//a[contains(text(),'Client Fees')]")
	@CacheLookup
	private WebElement ClientFees;

	@FindBy(xpath = "//a[contains(text(),'1. Posting Day (Master)')]")
	@CacheLookup
	private WebElement PostingDayMaster1;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'2. Fees Posting Frequency (Master)')]")
	@CacheLookup
	private WebElement FeesPostingFrequencyMaster2;

	@FindBy(xpath = "//a[contains(text(),'3. Fees Rules Upload')]")
	@CacheLookup
	private WebElement FeesRulesUpload3;

	@FindBy(xpath = "//a[contains(text(),'4. Calculate Fees')]")
	@CacheLookup
	private WebElement CalculateFees4;

	@FindBy(xpath = "//a[contains(text(),'5. Calculated Fees Details')]")
	@CacheLookup
	private WebElement CalculatedFeesDetails5;

	@FindBy(xpath = "//a[contains(text(),'6. Fee Posting')]")
	@CacheLookup
	private WebElement FeePosting6;

	@FindBy(xpath = "//a[contains(text(),'7a. Integ.Fees-Create Rule')]")
	@CacheLookup
	private WebElement IntegFeesCreateRule7a;

	@FindBy(xpath = "//a[contains(text(),'7b. Integ.Fees-Calculate')]")
	@CacheLookup
	private WebElement IntegFeesCalculate7b;

	@FindBy(xpath = "//a[contains(text(),'7c. Integ.Fees-Post Fees')]")
	@CacheLookup
	private WebElement IntegFeesPostFees7c;

	@FindBy(xpath = "//a[contains(text(),'8. Performance Fees')]")
	@CacheLookup
	private WebElement PerformanceFees8;


	
	
	public RIMSClientFeesBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void postingDayMaster1() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(PostingDayMaster1);
		actions.moveToElement(PostingDayMaster1).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String PostingDayMaster1 = breadcrumb.getText();
		Assert.assertTrue(PostingDayMaster1.contains(file.getBreadcrumb("PostingDayMaster1")), "PostingDayMaster1  not exits in breadcrumb");
		System.out.println(PostingDayMaster1);
	}	
	
	public void feesPostingFrequencyMaster2() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(FeesPostingFrequencyMaster2);
		actions.moveToElement(FeesPostingFrequencyMaster2).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FeesPostingFrequencyMaster2 = breadcrumb.getText();
		Assert.assertTrue(FeesPostingFrequencyMaster2.contains(file.getBreadcrumb("FeesPostingFrequencyMaster2")), "FeesPostingFrequencyMaster2  not exits in breadcrumb");
		System.out.println(FeesPostingFrequencyMaster2);
	}	
	
	public void feesRulesUpload3() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(FeesRulesUpload3);
		actions.moveToElement(FeesRulesUpload3).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  FeesRulesUpload3= breadcrumb.getText();
		Assert.assertTrue(FeesRulesUpload3.contains(file.getBreadcrumb("FeesRulesUpload3")), " FeesRulesUpload3  not exits in breadcrumb");
		System.out.println(FeesRulesUpload3);
	}	
	
	public void calculateFees4() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(CalculateFees4);
		actions.moveToElement(CalculateFees4).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CalculateFees4 = breadcrumb.getText();
		Assert.assertTrue(CalculateFees4.contains(file.getBreadcrumb("CalculateFees4")), " CalculateFees4 not exits in breadcrumb");
		System.out.println(CalculateFees4);
	}	
	
	public void calculatedFeesDetails5() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(CalculatedFeesDetails5);
		actions.moveToElement(CalculatedFeesDetails5).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CalculatedFeesDetails5 = breadcrumb.getText();
		Assert.assertTrue(CalculatedFeesDetails5.contains(file.getBreadcrumb("CalculatedFeesDetails5")), " CalculatedFeesDetails5 not exits in breadcrumb");
		System.out.println(CalculatedFeesDetails5);
	}	
	
	public void feePosting6() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(FeePosting6);
		actions.moveToElement(FeePosting6).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FeePosting6 = breadcrumb.getText();
		Assert.assertTrue(FeePosting6.contains(file.getBreadcrumb("FeePosting6")), "FeePosting6  not exits in breadcrumb");
		System.out.println(FeePosting6);
	}	
	
	public void integFeesCreateRule7a() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(IntegFeesCreateRule7a);
		actions.moveToElement(IntegFeesCreateRule7a).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String IntegFeesCreateRule7a  = breadcrumb.getText();
		Assert.assertTrue(IntegFeesCreateRule7a.contains(file.getBreadcrumb("IntegFeesCreateRule7a")), " IntegFeesCreateRule7a not exits in breadcrumb");
		System.out.println(IntegFeesCreateRule7a);
	}	
	
	public void integFeesCalculate7b() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(IntegFeesCalculate7b);
		actions.moveToElement(IntegFeesCalculate7b).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String IntegFeesCalculate7b = breadcrumb.getText();
		Assert.assertTrue(IntegFeesCalculate7b.contains(file.getBreadcrumb("IntegFeesCalculate7b")), "IntegFeesCalculate7b  not exits in breadcrumb");
		System.out.println(IntegFeesCalculate7b);
	}	
	
	public void integFeesPostFees7c() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(IntegFeesPostFees7c);
		actions.moveToElement(IntegFeesPostFees7c).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String IntegFeesPostFees7c = breadcrumb.getText();
		Assert.assertTrue(IntegFeesPostFees7c.contains(file.getBreadcrumb("IntegFeesPostFees7c")), " IntegFeesPostFees7c not exits in breadcrumb");
		System.out.println(IntegFeesPostFees7c);
	}	
	
	public void performanceFees8() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientFees);
		actions.moveToElement(ClientFees).perform();

		WebDriverWaitFunctions.waitToLoadElement(PerformanceFees8);
		actions.moveToElement(PerformanceFees8).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String PerformanceFees8 = breadcrumb.getText();
		Assert.assertTrue(PerformanceFees8.contains(file.getBreadcrumb("PerformanceFees8")), " PerformanceFees8 not exits in breadcrumb");
		System.out.println(PerformanceFees8);
	}	
}
