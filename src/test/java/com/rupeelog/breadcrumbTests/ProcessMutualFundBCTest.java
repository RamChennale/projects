package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessMutualFundBCPages;

public class ProcessMutualFundBCTest extends TestBase {

	@Test(enabled = true)
	public void processMFAUMUploadRTABc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.aumUploadRTA();
	}
	
	@Test(enabled = true)
	public void processMFFolioMappedBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.folioMapped();
	}
	@Test(enabled = true) 
	public void processMFFolioUnmappedBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.folioUnmapped();
	}
	
	@Test(enabled = true)
	public void processMFMasterPullBSEStarBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.masterPullBSEStar();
	}

	@Test(enabled = true)
	public void processMFFolioChangeBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.mfFolioChange();
	}
	
	@Test(enabled = true)
	public void processMFfolioPortfolioShiftBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.mffolioPortfolioShift();
	}
	
	@Test(enabled = true)
	public void processMFRTACorpusNotValidatedBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.mfRTACorpusNotValidated();
	}
	@Test(enabled = true)
	public void processMFTransactionNotValidatedBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.mfTransactionNotValidated();
	}
	
	@Test(enabled = true)
	public void processMFTransactionOrderMatchingBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.transactionOrderMatching();
	}
	
	@Test(enabled = true)
	public void processMFTransactionUploadRTABc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.transactionUploadRTA();
	}
	
	@Test(enabled = true)
	public void processMFUploadAmfiNAVBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.uploadAmfiNAV();
	}
	
	@Test(enabled = true)
	public void processMFValidateSIPErrorEntriesBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.validateSIPErrorEntries();
	}
	
	@Test(enabled = true)
	public void processMFValidateWbr9ErrorBc() {
		ProcessMutualFundBCPages mutualFundBCPages=PageFactory.initElements(driver, ProcessMutualFundBCPages.class);
		mutualFundBCPages.validateWbr9Error();
	}
}
