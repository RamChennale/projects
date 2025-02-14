package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminCOBBCPages;

public class AdminCOBBCTests extends TestBase{
	
	@Test(enabled = true)
	public void adminCOBBSEAofBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.bseAof();
	}
	
	@Test(enabled = true)
	public void adminCOBBSEStarFatcaBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.bseStarFatca();
	}
	
	@Test(enabled = true)
	public void adminCOBBSEStarUCCBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.bseStarUCC();
	}
	
	@Test(enabled = true)
	public void adminCOBDocumentUploadBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.documentUpload();
	}
	
	@Test(enabled = true)
	public void adminCOBDocumentVerificationBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.documentVerification();
	}
	
	@Test(enabled = true)
	public void adminCOBFamilyBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.family();
	}
	
	@Test(enabled = true)
	public void adminCOBFamilyCommentsBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.familyComments();
	}
	
	@Test(enabled = true)
	public void adminCOBInvestmentAccountBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.investmentAccount();
	}
	
	@Test(enabled = true)
	public void adminCOBKYPHBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.kYPH();
	}
	
	@Test(enabled = true)
	public void adminCOBPortfolioBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.portfolio();
	}

	@Test(enabled = true)
	public void adminCOBViewKyphDocumentsBc() {
		AdminCOBBCPages adminCOBBCPages= PageFactory.initElements(driver, AdminCOBBCPages.class);
		adminCOBBCPages.viewKyphDocuments();
	}
}
