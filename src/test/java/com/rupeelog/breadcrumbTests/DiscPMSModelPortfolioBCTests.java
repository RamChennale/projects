package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.DiscPMSModelPortfolioBCPages;

public class DiscPMSModelPortfolioBCTests extends TestBase {

	@Test(enabled = true)
	public void discPMSModelPortfCompositionUploadBc() {
		DiscPMSModelPortfolioBCPages modelPortfolioBCPages=PageFactory.initElements(driver, DiscPMSModelPortfolioBCPages.class);
		modelPortfolioBCPages.compositionUpload();
	}
	
	@Test(enabled = true)
	public void discPMSModelPortfModelPortfolioSchemeBc() {
		DiscPMSModelPortfolioBCPages modelPortfolioBCPages=PageFactory.initElements(driver, DiscPMSModelPortfolioBCPages.class);
		modelPortfolioBCPages.modelPortfolioScheme();
	}
	@Test(enabled = true) 
	public void discPMSModelPortfSchemeAlternateListBc() {
		DiscPMSModelPortfolioBCPages modelPortfolioBCPages=PageFactory.initElements(driver, DiscPMSModelPortfolioBCPages.class);
		modelPortfolioBCPages.schemeAlternateList();
	}
	
}
