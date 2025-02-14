package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class MasterAssetMasterBCPages {

	WebDriver driver;
	FileReaderUtility file;
	Actions actions;

	@FindBy(xpath = "//a[text()='Master']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[contains(text(),'Asset Master')]")
	@CacheLookup
	private WebElement assetMaster;

	@FindBy(xpath = "//a[contains(text(),'Asset Combo')]")
	@CacheLookup
	private WebElement assetCombo;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'House Recommendation')]")
	@CacheLookup
	private WebElement houseRecommendation;
	
	@FindBy(xpath = "//a[contains(text(),'Investment Horizon')]")
	@CacheLookup
	private WebElement investmentHorizon;
	
	@FindBy(xpath = "//a[contains(text(),'Investment Strategy')]")
	@CacheLookup
	private WebElement investmentStrategy;

	@FindBy(xpath = "//a[contains(text(),'Market Cap')]")
	@CacheLookup
	private WebElement MarketCap;

	@FindBy(xpath = "//a[text()='Risk ']")
	@CacheLookup
	private WebElement Risk;

	@FindBy(xpath = "//a[contains(text(),'Risk-IPS Mapping')]")
	@CacheLookup
	private WebElement RiskIPSMapping;
	


	public MasterAssetMasterBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void assetCombo() {
		actions = new Actions(driver);
		file=new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(assetMaster);
		actions.moveToElement(assetMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(assetCombo);
		actions.moveToElement(assetCombo).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String assetComboBS = breadcrumb.getText();
		System.out.println(assetComboBS);
		Assert.assertTrue(assetComboBS.contains(file.getBreadcrumb("assetCombo")), "Asset Combo name not exits in breadcrumb");
		
	}

	public void houseRecommendation() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(assetMaster);
		actions.moveToElement(assetMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(houseRecommendation);
		actions.moveToElement(houseRecommendation).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String assetComboBS = breadcrumb.getText();
		Assert.assertTrue(assetComboBS.contains(file.getBreadcrumb("HouseRecommendation")),
				"House Recommendation name not exits in breadcrumb");
		System.out.println(assetComboBS);
	}

	
	
	
	public void investmentHorizon() {
		actions = new Actions(driver);
		file=new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(assetMaster);
		actions.moveToElement(assetMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(investmentHorizon);
		actions.moveToElement(investmentHorizon).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String investmentHorizon = breadcrumb.getText();
		Assert.assertTrue(investmentHorizon.contains(file.getBreadcrumb("InvestmentHorizon")),
				"Investment Horizon name not exits in breadcrumb");
		System.out.println(investmentHorizon);
	}
	
	
	
	
	public void investmentStrategy() {
		actions = new Actions(driver);
		file=new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(assetMaster);
		actions.moveToElement(assetMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(investmentStrategy);
		actions.moveToElement(investmentStrategy).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String is = breadcrumb.getText();
		Assert.assertTrue(is.contains(file.getBreadcrumb("InvestmentStrategy")),
				"Investment Strategy name not exits in breadcrumb");
		System.out.println(is);
	}
	
	
	
	public void marketCap() {
		actions = new Actions(driver);
		file=new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(assetMaster);
		actions.moveToElement(assetMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(MarketCap);
		actions.moveToElement(MarketCap).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String mc = breadcrumb.getText();
		Assert.assertTrue(mc.contains(file.getBreadcrumb("MarketCap")),
				"Market Cap name not exits in breadcrumb");
		System.out.println(mc);
	}
	
	public void risk() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(assetMaster);
		actions.moveToElement(assetMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Risk);
		actions.moveToElement(Risk).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String risk = breadcrumb.getText();
		Assert.assertTrue(risk.contains(file.getBreadcrumb("Risk")),
				"Risk name not exits in breadcrumb");
		System.out.println(risk);
	}
	
	public void riskIPSMapping() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(assetMaster);
		actions.moveToElement(assetMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(RiskIPSMapping);
		actions.moveToElement(RiskIPSMapping).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String riskIPS = breadcrumb.getText();
		Assert.assertTrue(riskIPS.contains(file.getBreadcrumb("Mapping")),
				"Risk IPS Mapping name not exits in breadcrumb");
		System.out.println(riskIPS);
	}
}
