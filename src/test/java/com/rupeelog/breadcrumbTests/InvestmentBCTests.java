package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.InvestmentBCPages;

public class InvestmentBCTests extends TestBase {

	@Test(enabled = true)
	public void investCommittedInvestmentBc() {
		InvestmentBCPages investmentBCPages=PageFactory.initElements(driver, InvestmentBCPages.class);
		investmentBCPages.committedInvestment();
	}
	
	@Test(enabled = false)//Internal server error
	public void investCommittedInvestmentNewBc() {
		InvestmentBCPages investmentBCPages=PageFactory.initElements(driver, InvestmentBCPages.class);
		investmentBCPages.committedInvestmentNew();
	}
	@Test(enabled = true)
	public void investFDandRDBc() {
		InvestmentBCPages investmentBCPages=PageFactory.initElements(driver, InvestmentBCPages.class);
		investmentBCPages.fdAndRD();
	}
	
	@Test(enabled = true)
	public void investInsuranceBc() {
		InvestmentBCPages investmentBCPages=PageFactory.initElements(driver, InvestmentBCPages.class);
		investmentBCPages.insurance();
	}

	@Test(enabled = true)
	public void investLiabilityBc() {
		InvestmentBCPages investmentBCPages=PageFactory.initElements(driver, InvestmentBCPages.class);
		investmentBCPages.liability();
	}
	
	@Test(enabled = true)
	public void investRealEstateandOthersBc() {
		InvestmentBCPages investmentBCPages=PageFactory.initElements(driver, InvestmentBCPages.class);
		investmentBCPages.realEstateandOthers();
	}
	
	@Test(enabled = true)
	public void realEstateMarketPriceBc() {
		InvestmentBCPages investmentBCPages=PageFactory.initElements(driver, InvestmentBCPages.class);
		investmentBCPages.realEstateMarketPrice();
	}
	
	@Test(enabled = true)
	public void investTransactionUploadBc() {
		InvestmentBCPages investmentBCPages=PageFactory.initElements(driver, InvestmentBCPages.class);
		investmentBCPages.transactionUpload();
	}
}
