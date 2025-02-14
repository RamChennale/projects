package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class FinancialPlanningBCPages {

	WebDriver driver;
	FileReaderUtility file;
	Actions actions;
	
	@FindBy(linkText = "Finanacial Planning")
	@CacheLookup
	private WebElement FinanacialPlanning;
	
	@FindBy(xpath = "//a[contains(text(),'Additional Investment Planning')]")
	@CacheLookup
	private WebElement AdditionalInvestmentPlanning;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Asset Sub Class To Goal Linkage')]")
	@CacheLookup
	private WebElement AssetSubClassToGoalLinkage;
	
	@FindBy(xpath = "//a[contains(text(),'Financial Advisor Comments')]")
	@CacheLookup
	private WebElement FinancialAdvisorComments;
	
	@FindBy(xpath = "//a[contains(text(),'Generate Plan')]")
	@CacheLookup
	private WebElement GeneratePlan;
	
	@FindBy(xpath = "//a[contains(text(),'Goal Investment Linkage')]")
	@CacheLookup
	private WebElement GoalInvestmentLinkage;
	
	@FindBy(xpath = "//a[contains(text(),'Insurance Planning(New)')]")
	@CacheLookup
	private WebElement InsurancePlanningNew;
	
	@FindBy(xpath = "//a[contains(text(),'Redemption Plan')]")
	@CacheLookup
	private WebElement RedemptionPlan;
	
	@FindBy(xpath = "//a[contains(text(),'ReportingCategory Goal Link')]")
	@CacheLookup
	private WebElement ReportingCategoryGoalLink;
	
	public FinancialPlanningBCPages(WebDriver driver){
		this.driver=driver;
	}
	
	public void additionalInvestmentPlanning() {
		actions=new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(FinanacialPlanning);
		actions.moveToElement(FinanacialPlanning).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(AdditionalInvestmentPlanning);
		actions.moveToElement(AdditionalInvestmentPlanning).click().build().perform();
		
		String AdditionalInvestmentPlanning=breadcrumb.getText();
		System.out.println(AdditionalInvestmentPlanning);
		Assert.assertTrue(AdditionalInvestmentPlanning.contains(file.getBreadcrumb("AdditionalInvestmentPlanning")),"AdditionalInvestmentPlanning name not found in breadcrumb.");
	}
	
	public void assetSubClassToGoalLinkage() {
		actions=new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(FinanacialPlanning);
		actions.moveToElement(FinanacialPlanning).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(AssetSubClassToGoalLinkage);
		actions.moveToElement(AssetSubClassToGoalLinkage).click().build().perform();
		
		String AssetSubClassToGoalLinkage =breadcrumb.getText();
		System.out.println(AssetSubClassToGoalLinkage);
		Assert.assertTrue(AssetSubClassToGoalLinkage.contains(file.getBreadcrumb("AssetSubClassToGoalLinkage")),"AssetSubClassToGoalLinkage name not found in breadcrumb.");
	}
	
	public void financialAdvisorComments() {
		actions=new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(FinanacialPlanning);
		actions.moveToElement(FinanacialPlanning).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(FinancialAdvisorComments);
		actions.moveToElement(FinancialAdvisorComments).click().build().perform();
		
		String FinancialAdvisorComments=breadcrumb.getText();
		System.out.println(FinancialAdvisorComments);
		Assert.assertTrue(FinancialAdvisorComments.contains(file.getBreadcrumb("FinancialAdvisorComments")),"FinancialAdvisorComments name not found in breadcrumb.");
	}
	
	public void generatePlan() {
		actions=new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(FinanacialPlanning);
		actions.moveToElement(FinanacialPlanning).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(GeneratePlan);
		actions.moveToElement(GeneratePlan).click().build().perform();
		
		String GeneratePlan=breadcrumb.getText();
		System.out.println(GeneratePlan);
		Assert.assertTrue(GeneratePlan.contains(file.getBreadcrumb("GeneratePlan"))," name not found in breadcrumb.");
	}
	
	public void goalInvestmentLinkage() {
		actions=new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(FinanacialPlanning);
		actions.moveToElement(FinanacialPlanning).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(GoalInvestmentLinkage);
		actions.moveToElement(GoalInvestmentLinkage).click().build().perform();
		
		String GoalInvestmentLinkage=breadcrumb.getText();
		System.out.println(GoalInvestmentLinkage);
		Assert.assertTrue(GoalInvestmentLinkage.contains(file.getBreadcrumb("GoalInvestmentLinkage")),"GoalInvestmentLinkage name not found in breadcrumb.");
	}
	
	public void insurancePlanningNew() {
		actions=new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(FinanacialPlanning);
		actions.moveToElement(FinanacialPlanning).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(InsurancePlanningNew);
		actions.moveToElement(InsurancePlanningNew).click().build().perform();
		
		String InsurancePlanningNew=breadcrumb.getText();
		System.out.println(InsurancePlanningNew);
		Assert.assertTrue(InsurancePlanningNew.contains(file.getBreadcrumb("InsurancePlanningNew")),"InsurancePlanningNew name not found in breadcrumb.");
	}
	
	public void redemptionPlan() {
		actions=new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(FinanacialPlanning);
		actions.moveToElement(FinanacialPlanning).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(RedemptionPlan);
		actions.moveToElement(RedemptionPlan).click().build().perform();
		
		String RedemptionPlan=breadcrumb.getText();
		System.out.println(RedemptionPlan);
		Assert.assertTrue(RedemptionPlan.contains(file.getBreadcrumb("RedemptionPlan")),"RedemptionPlan name not found in breadcrumb.");
	}


	public void reportingCategoryGoalLink() {
		actions=new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(FinanacialPlanning);
		actions.moveToElement(FinanacialPlanning).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(ReportingCategoryGoalLink);
		actions.moveToElement(ReportingCategoryGoalLink).click().build().perform();
		
		String ReportingCategoryGoalLink=breadcrumb.getText();
		System.out.println(ReportingCategoryGoalLink);
		Assert.assertTrue(ReportingCategoryGoalLink.contains(file.getBreadcrumb("ReportingCategoryGoalLink")),"ReportingCategoryGoalLink name not found in breadcrumb.");
	}
}
