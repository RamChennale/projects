package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.FinplanInputBCPages;

public class FinplanInputBCTests extends TestBase {

	@Test(enabled = true)
	public void finplanInputExpenseBc() {
		FinplanInputBCPages finplanInputBCPages=PageFactory.initElements(driver, FinplanInputBCPages.class);
		finplanInputBCPages.expense();
	}
	
	@Test(enabled = true)
	public void finplanInputGoalBc() {
		FinplanInputBCPages finplanInputBCPages=PageFactory.initElements(driver, FinplanInputBCPages.class);
		finplanInputBCPages.goal();
	}
	@Test(enabled = true)
	public void finplanInputIncomeBc() {
		FinplanInputBCPages finplanInputBCPages=PageFactory.initElements(driver, FinplanInputBCPages.class);
		finplanInputBCPages.income();
	}
	
	@Test(enabled = true)
	public void finplanInputRiskQuestionnaireKyphBc() {
		FinplanInputBCPages finplanInputBCPages=PageFactory.initElements(driver, FinplanInputBCPages.class);
		finplanInputBCPages.riskQuestionnaireKyph();
	}

}
