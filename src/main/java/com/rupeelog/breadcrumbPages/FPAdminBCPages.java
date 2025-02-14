package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class FPAdminBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "FP Admin")
	@CacheLookup
	private WebElement FPAdmin;
	
	@FindBy(xpath = "//a[contains(text(),'Asset Sub Class Growth Estimate')]")
	@CacheLookup
	private WebElement AssetSubClassGrowthEstimate;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'FP System-Param')]")
	@CacheLookup
	private WebElement FPSystemParam;
	
	@FindBy(xpath = "//a[contains(text(),'House Reco (Asset Subclass)')]")
	@CacheLookup
	private WebElement HouseRecoAssetSubclass;
	
	@FindBy(xpath = "//a[contains(text(),'Instrument Growth Estimate')]")
	@CacheLookup
	private WebElement InstrumentGrowthEstimate;
	
	@FindBy(xpath = "//a[contains(text(),'Insurance Policy')]")
	@CacheLookup
	private WebElement InsurancePolicy;
	
	@FindBy(xpath = "//a[contains(text(),'Insurance Provider')]")
	@CacheLookup
	private WebElement InsuranceProvider;
	
	@FindBy(xpath = "//a[contains(text(),'Model Portfolio (FP)')]")
	@CacheLookup
	private WebElement ModelPortfolioFP;
	
	
	public FPAdminBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void assetSubClassGrowthEstimate() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		WebDriverWaitFunctions.waitToLoadElement(AssetSubClassGrowthEstimate);
		actions.moveToElement(AssetSubClassGrowthEstimate).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String AssetSubClassGrowthEstimate = breadcrumb.getText();
		System.out.println(AssetSubClassGrowthEstimate);
		Assert.assertTrue(AssetSubClassGrowthEstimate.contains(file.getBreadcrumb("AssetSubClassGrowthEstimate")), " AssetSubClassGrowthEstimate not exits in breadcrumb");

	}	
	
	public void fpSystemParam() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		WebDriverWaitFunctions.waitToLoadElement(FPSystemParam);
		actions.moveToElement(FPSystemParam).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FPSystemParam = breadcrumb.getText();
		System.out.println(FPSystemParam);
		Assert.assertTrue(FPSystemParam.contains(file.getBreadcrumb("FPSystemParam")), " FPSystemParam not exits in breadcrumb");

	}	
	
	public void houseRecoAssetSubclass() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		WebDriverWaitFunctions.waitToLoadElement(HouseRecoAssetSubclass);
		actions.moveToElement(HouseRecoAssetSubclass).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String HouseRecoAssetSubclass = breadcrumb.getText();
		System.out.println(HouseRecoAssetSubclass);
		Assert.assertTrue(HouseRecoAssetSubclass.contains(file.getBreadcrumb("HouseRecoAssetSubclass")), " HouseRecoAssetSubclass not exits in breadcrumb");

	}	
	
	public void instrumentGrowthEstimate() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentGrowthEstimate);
		actions.moveToElement(InstrumentGrowthEstimate).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String InstrumentGrowthEstimate = breadcrumb.getText();
		System.out.println(InstrumentGrowthEstimate);
		Assert.assertTrue(InstrumentGrowthEstimate.contains(file.getBreadcrumb("InstrumentGrowthEstimate")), "InstrumentGrowthEstimate  not exits in breadcrumb");

	}	
	
	public void insurancePolicy() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		WebDriverWaitFunctions.waitToLoadElement(InsurancePolicy);
		actions.moveToElement(InsurancePolicy).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String InsurancePolicy = breadcrumb.getText();
		System.out.println(InsurancePolicy);
		Assert.assertTrue(InsurancePolicy.contains(file.getBreadcrumb("InsurancePolicy")), "InsurancePolicy  not exits in breadcrumb");

	}	
	
	public void insuranceProvider() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		WebDriverWaitFunctions.waitToLoadElement(InsuranceProvider);
		actions.moveToElement(InsuranceProvider).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String InsuranceProvider = breadcrumb.getText();
		System.out.println(InsuranceProvider);
		Assert.assertTrue(InsuranceProvider.contains(file.getBreadcrumb("InsuranceProvider")), "InsuranceProvider  not exits in breadcrumb");

	}	
	
	public void modelPortfolioFP() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ModelPortfolioFP);
		actions.moveToElement(ModelPortfolioFP).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ModelPortfolioFP = breadcrumb.getText();
		System.out.println(ModelPortfolioFP);
		Assert.assertTrue(ModelPortfolioFP.contains(file.getBreadcrumb("ModelPortfolioFP")), " ModelPortfolioFP not exits in breadcrumb");

	}	
}
