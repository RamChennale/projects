package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.RIMSNonMFRevenueBCPages;

public class RIMSNonMFRevenueBCTests extends TestBase {

	@Test(enabled = true)
	public void RIMSNonMFRateCardUpload1Bc() {
		RIMSNonMFRevenueBCPages nonMFRevenueBCPages=PageFactory.initElements(driver, RIMSNonMFRevenueBCPages.class);
		nonMFRevenueBCPages.nonMFRateCardUpload1();
	}

}
