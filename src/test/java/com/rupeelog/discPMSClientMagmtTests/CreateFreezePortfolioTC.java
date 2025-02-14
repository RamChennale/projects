package com.rupeelog.discPMSClientMagmtTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSClientMagmtPages.CreateFreezePortfolioPage;

public class CreateFreezePortfolioTC extends TestBase {

	@Test(enabled = true)
	public void discPMSClientMagmtCreateFreezePortfolioTC() {
		CreateFreezePortfolioPage freezePortfolioPage= PageFactory.initElements(driver, CreateFreezePortfolioPage.class);
		freezePortfolioPage.createFreezePortfolio();
	}
}
