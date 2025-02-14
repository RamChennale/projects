package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminManualTxnAdjustmentsBCPages;

public class AdminManualTxnAdjustmentsBCTests extends TestBase{
	
	@Test(enabled = true)
	public void adminManualTxnAdjCommodityFutureTxnDeleteBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.commodityFutureTxnDelete();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjCurrencyFutureTxnDeleteBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.currencyFutureTxnDelete();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjFutureTxnDeleteBc() { 
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.futureTxnDelete();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjGenerateNavBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.generateNav();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunCommodityFutureM2MBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunCommodityFutureM2M();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunCurrencyFutureM2MBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunCurrencyFutureM2M();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunCurrencyOptionAutoExpiryBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunCurrencyOptionAutoExpiry();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunDPMSTWRRBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunDPMSTWRR();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunEquitydividendBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunEquitydividend();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunEquityDMABc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunEquityDMA();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunEquitySplitBonusBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunEquitySplitBonus();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunFutureM2MBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunFutureM2M();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRerunRealisedGainBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.rerunRealisedGain();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjRunMFfifofoliowiseBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.runMFfifofoliowise();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjUpdateKYCStatusBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.updateKYCStatus();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjVoucherDeleteBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.voucherDelete();
	}

	@Test(enabled = true)
	public void adminManualTxnAdjXirrBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.xirr();
	}
	
	@Test(enabled = true)
	public void adminManualTxnAdjXirrSinceInceptionBc() {
		AdminManualTxnAdjustmentsBCPages adminManualTxnAdjustmentsBCPages= PageFactory.initElements(driver, AdminManualTxnAdjustmentsBCPages.class);
		adminManualTxnAdjustmentsBCPages.xirrSinceInception();
	}
}
