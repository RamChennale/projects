package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class RIMSMFRevenueBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "MF Revenue")
	@CacheLookup
	private WebElement MFRevenue;
	
	@FindBy(xpath = "//a[contains(text(),'1.a. MF Rate Card Upload')]")
	@CacheLookup
	private WebElement MFRateCardUpload1a;

		
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'1.b. MF Rate Card Exception Upload')]")
	@CacheLookup
	private WebElement MFRateCardExceptionUpload1b;

	@FindBy(xpath = "//a[contains(text(),'2.a. MF Fees Calculation')]")
	@CacheLookup
	private WebElement MFFeesCalculation2a;
	
	@FindBy(xpath = "//a[contains(text(),'2.b. MF Fees Exception Calculation')]")
	@CacheLookup
	private WebElement MFFeesExceptionCalculation2b;
	
	@FindBy(xpath = "//a[contains(text(),'3. RTA Revenue Files')]")
	@CacheLookup
	private WebElement RTARevenueFiles3;
	
	@FindBy(xpath = "//a[contains(text(),'4. Trail Forecasting')]")
	@CacheLookup
	private WebElement TrailForecasting4;
	
	@FindBy(xpath = "//a[contains(text(),'5. AMC Commission Receipt')]")
	@CacheLookup
	private WebElement AMCCommissionReceipt5;
	
	@FindBy(xpath = "//a[contains(text(),'Rev Type Master')]")
	@CacheLookup
	private WebElement RevTypeMaster;
	
	@FindBy(xpath = "//a[contains(text(),'RTA Rev Type Mapping')]")
	@CacheLookup
	private WebElement RTARevTypeMapping;
	
	@FindBy(xpath = "//a[contains(text(),'SIP Rate Card Upload')]")
	@CacheLookup
	private WebElement SIPRateCardUpload;
	
	@FindBy(xpath = "//a[contains(text(),'Switch Rate Card Upload')]")
	@CacheLookup
	private WebElement SwitchRateCardUpload;
	
	
	public RIMSMFRevenueBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void mfRateCardUpload1a() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRateCardUpload1a);
		actions.moveToElement(MFRateCardUpload1a).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFRateCardUpload1a = breadcrumb.getText();
		Assert.assertTrue(MFRateCardUpload1a.contains(file.getBreadcrumb("MFRateCardUpload1a")), "MFRateCardUpload1a  not exits in breadcrumb");
		System.out.println(MFRateCardUpload1a);
	}	
	
	public void mfRateCardExceptionUpload1b() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRateCardExceptionUpload1b);
		actions.moveToElement(MFRateCardExceptionUpload1b).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFRateCardExceptionUpload1b = breadcrumb.getText();
		Assert.assertTrue(MFRateCardExceptionUpload1b.contains(file.getBreadcrumb("MFRateCardExceptionUpload1b")), " MFRateCardExceptionUpload1b not exits in breadcrumb");
		System.out.println(MFRateCardExceptionUpload1b);
	}	
	
	public void mfFeesCalculation2a() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFFeesCalculation2a);
		actions.moveToElement(MFFeesCalculation2a).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFFeesCalculation2a = breadcrumb.getText();
		Assert.assertTrue(MFFeesCalculation2a.contains(file.getBreadcrumb("MFFeesCalculation2a")), "MFFeesCalculation2a  not exits in breadcrumb");
		System.out.println(MFFeesCalculation2a);
	}	
	
	public void mfFeesExceptionCalculation2b() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFFeesExceptionCalculation2b);
		actions.moveToElement(MFFeesExceptionCalculation2b).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFFeesExceptionCalculation2b = breadcrumb.getText();
		Assert.assertTrue(MFFeesExceptionCalculation2b.contains(file.getBreadcrumb("MFFeesExceptionCalculation2b")), " MFFeesExceptionCalculation2b not exits in breadcrumb");
		System.out.println(MFFeesExceptionCalculation2b);
	}	
	
	public void rtaRevenueFiles3() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(RTARevenueFiles3);
		actions.moveToElement(RTARevenueFiles3).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RTARevenueFiles3 = breadcrumb.getText();
		Assert.assertTrue(RTARevenueFiles3.contains(file.getBreadcrumb("RTARevenueFiles3")), "RTARevenueFiles3  not exits in breadcrumb");
		System.out.println(RTARevenueFiles3);
	}	
	
	public void trailForecasting4() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(TrailForecasting4);
		actions.moveToElement(TrailForecasting4).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String TrailForecasting4 = breadcrumb.getText();
		Assert.assertTrue(TrailForecasting4.contains(file.getBreadcrumb("TrailForecasting4")), "TrailForecasting4  not exits in breadcrumb");
		System.out.println(TrailForecasting4);
	}	
	
	public void amcCommissionReceipt5() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(AMCCommissionReceipt5);
		actions.moveToElement(AMCCommissionReceipt5).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String AMCCommissionReceipt5 = breadcrumb.getText();
		Assert.assertTrue(AMCCommissionReceipt5.contains(file.getBreadcrumb("AMCCommissionReceipt5")), "AMCCommissionReceipt5  not exits in breadcrumb");
		System.out.println(AMCCommissionReceipt5);
	}	
	
	public void revTypeMaster() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(RevTypeMaster);
		actions.moveToElement(RevTypeMaster).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RevTypeMaster = breadcrumb.getText();
		Assert.assertTrue(RevTypeMaster.contains(file.getBreadcrumb("RevTypeMaster")), " RevTypeMaster not exits in breadcrumb");
		System.out.println(RevTypeMaster);
	}	
	
	public void rtaRevTypeMapping() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(RTARevTypeMapping);
		actions.moveToElement(RTARevTypeMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RTARevTypeMapping = breadcrumb.getText();
		Assert.assertTrue(RTARevTypeMapping.contains(file.getBreadcrumb("RTARevTypeMapping")), "RTARevTypeMapping  not exits in breadcrumb");
		System.out.println(RTARevTypeMapping);
	}	
	
	public void sipRateCardUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(SIPRateCardUpload);
		actions.moveToElement(SIPRateCardUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String SIPRateCardUpload = breadcrumb.getText();
		Assert.assertTrue(SIPRateCardUpload.contains(file.getBreadcrumb("SIPRateCardUpload")), "SIPRateCardUpload  not exits in breadcrumb");
		System.out.println(SIPRateCardUpload);
	}	
	
	public void switchRateCardUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(RIMS);
		actions.moveToElement(RIMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRevenue);
		actions.moveToElement(MFRevenue).perform();

		WebDriverWaitFunctions.waitToLoadElement(SwitchRateCardUpload);
		actions.moveToElement(SwitchRateCardUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String SwitchRateCardUpload = breadcrumb.getText();
		Assert.assertTrue(SwitchRateCardUpload.contains(file.getBreadcrumb("SwitchRateCardUpload")), "SwitchRateCardUpload  not exits in breadcrumb");
		System.out.println(SwitchRateCardUpload);
	}	
	
}
