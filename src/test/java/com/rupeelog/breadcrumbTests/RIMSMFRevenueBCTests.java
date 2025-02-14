package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.RIMSMFRevenueBCPages;

public class RIMSMFRevenueBCTests extends TestBase {

	@Test(enabled = true)
	public void RIMSMFRevMFRateCardUpload1aBc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.mfRateCardUpload1a();
	}

	@Test(enabled = true)
	public void RIMSMFRevMFRateCardExceptionUpload1bBc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.mfRateCardExceptionUpload1b();
	}

	@Test(enabled = true)
	public void RIMSMFRevMFFeesCalculation2aBc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.mfFeesCalculation2a();
	}

	@Test(enabled = true)
	public void RIMSMFRevMFFeesExceptionCalculation2bBc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.mfFeesExceptionCalculation2b();
	}

	@Test(enabled = true)
	public void RIMSMFRevRTARevenueFiles3Bc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.rtaRevenueFiles3();
	}

	@Test(enabled = true)
	public void RIMSMFRevTrailForecasting4Bc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.trailForecasting4();
	}

	@Test(enabled = true)
	public void RIMSMFRevAMCCommissionReceipt5Bc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.amcCommissionReceipt5();
	}

	@Test(enabled = true)
	public void RIMSMFRevRevTypeMasterBc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.revTypeMaster();
	}

	@Test(enabled = true)
	public void RIMSMFRevRTARevTypeMappingBc() {
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.rtaRevTypeMapping();
	}

	@Test(enabled = true)
	public void RIMSMFRevSIPRateCardUploadBc() { //
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.sipRateCardUpload();
	}

	@Test(enabled = true)
	public void RIMSMFRevSwitchRateCardUploadBc() { //
		RIMSMFRevenueBCPages mfRevenueBCPages = PageFactory.initElements(driver, RIMSMFRevenueBCPages.class);
		mfRevenueBCPages.switchRateCardUpload();
	}

}
