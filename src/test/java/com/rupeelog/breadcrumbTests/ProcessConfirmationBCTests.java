package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessConfirmationBCPages;

public class ProcessConfirmationBCTests extends TestBase {

	@Test(enabled = true)
	public void  processConfRecommendationBc() {
		ProcessConfirmationBCPages confirmationBCPages=PageFactory.initElements(driver, ProcessConfirmationBCPages.class);
		confirmationBCPages.recommendation();
	}


	@Test(enabled = true)
	public void  processConfRecommendationNewBc() {
		ProcessConfirmationBCPages confirmationBCPages=PageFactory.initElements(driver, ProcessConfirmationBCPages.class);
		confirmationBCPages.recommendationNew();
	}

	@Test(enabled = true)
	public void  processConfValidateVouchersBc() {
		ProcessConfirmationBCPages confirmationBCPages=PageFactory.initElements(driver, ProcessConfirmationBCPages.class);
		confirmationBCPages.validateVouchers();
	}

}
