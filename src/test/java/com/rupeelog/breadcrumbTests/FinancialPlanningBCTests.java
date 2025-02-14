package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.FinancialPlanningBCPages;

public class FinancialPlanningBCTests extends TestBase{

	@Test(enabled = true)
	public void fpAdditionalInvestmentPlanningBc() {
		FinancialPlanningBCPages financialPlanningBCPages=PageFactory.initElements(driver, FinancialPlanningBCPages.class);
		financialPlanningBCPages.additionalInvestmentPlanning();
	}
	
	@Test(enabled = true)
	public void fpAssetSubClassToGoalLinkageBc() {
		FinancialPlanningBCPages financialPlanningBCPages=PageFactory.initElements(driver, FinancialPlanningBCPages.class);
		financialPlanningBCPages.assetSubClassToGoalLinkage();
		
	}
	
	@Test(enabled = true)
	public void fpFinancialAdvisorCommentsBc() {
		FinancialPlanningBCPages financialPlanningBCPages=PageFactory.initElements(driver, FinancialPlanningBCPages.class);
		financialPlanningBCPages.financialAdvisorComments();
		
	}
	
	@Test(enabled = true)
	public void fpGeneratePlanBc() {
		FinancialPlanningBCPages financialPlanningBCPages=PageFactory.initElements(driver, FinancialPlanningBCPages.class);
		financialPlanningBCPages.generatePlan();
		
	}
	
	@Test(enabled = false) //Internal server error.
	public void fpGoalInvestmentLinkageBc() {
		FinancialPlanningBCPages financialPlanningBCPages=PageFactory.initElements(driver, FinancialPlanningBCPages.class);
		financialPlanningBCPages.goalInvestmentLinkage();
		
	}
	
	@Test(enabled = true)
	public void fpInsurancePlanningNewBc() {
		FinancialPlanningBCPages financialPlanningBCPages=PageFactory.initElements(driver, FinancialPlanningBCPages.class);
		financialPlanningBCPages.insurancePlanningNew();
		
	}
	
	@Test(enabled = true)
	public void fpRedemptionPlanBc() {
		FinancialPlanningBCPages financialPlanningBCPages=PageFactory.initElements(driver, FinancialPlanningBCPages.class);
		financialPlanningBCPages.redemptionPlan();
	}
	
	@Test(enabled = true)
	public void fpReportingCategoryGoalLinkBc() {
		FinancialPlanningBCPages financialPlanningBCPages=PageFactory.initElements(driver, FinancialPlanningBCPages.class);
		financialPlanningBCPages.reportingCategoryGoalLink();
	}
	
}
