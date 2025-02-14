package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.RIMSClientFeesBCPages;

public class RIMSClientFeesBCTests extends TestBase{
	
	@Test(enabled = true)
	public void RIMSClientFPostingDayMaster1Bc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.postingDayMaster1();
	}
	
	@Test(enabled = true)
	public void RIMSClientFFeesPostingFrequencyMaster2Bc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.feesPostingFrequencyMaster2();
	}
	
	@Test(enabled = true)
	public void RIMSClientFFeesRulesUpload3Bc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.feesRulesUpload3();
	}
	
	@Test(enabled = true)
	public void RIMSClientFCalculateFees4Bc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.calculateFees4();
	}
	
	@Test(enabled = true)
	public void RIMSClientFCalculatedFeesDetails5Bc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.calculatedFeesDetails5();
	}
	
	@Test(enabled = true)
	public void RIMSClientFFeePosting6Bc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.feePosting6();
	}
	
	@Test(enabled = true)
	public void RIMSClientFIntegFeesCreateRule7aBc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.integFeesCreateRule7a();
	}
	
	@Test(enabled = true)
	public void RIMSClientFIntegFeesCalculate7bBc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.integFeesCalculate7b();
	}
	
	@Test(enabled = true)
	public void RIMSClientFIntegFeesPostFees7cBc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.integFeesPostFees7c();
	}
	
	@Test(enabled = false) //internal server error
	public void RIMSClientFPerformanceFees8Bc() {
		RIMSClientFeesBCPages clientFeesBCPages=PageFactory.initElements(driver, RIMSClientFeesBCPages.class);
		clientFeesBCPages.performanceFees8();
	}
	
}
