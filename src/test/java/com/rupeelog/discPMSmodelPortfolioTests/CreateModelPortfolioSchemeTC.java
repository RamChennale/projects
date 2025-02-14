package com.rupeelog.discPMSmodelPortfolioTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSmodelPortfolioPages.CreateModelPortfolioSchemePage;

public class CreateModelPortfolioSchemeTC extends TestBase {

	@Test(enabled = true)
	public void discPMSmodelPortFCreateModelPortfolioSchemeTC() {
		CreateModelPortfolioSchemePage modelPortfolioSchemePage= PageFactory.initElements(driver, CreateModelPortfolioSchemePage.class);
		modelPortfolioSchemePage.createModelPortfolioScheme();
	}
}
