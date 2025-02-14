package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.AddModelPortfolioPage;

public class EditModelPortfolioTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminEditModelPortfolioTC() {
		AddModelPortfolioPage modelPortfolioPage = PageFactory.initElements(driver, AddModelPortfolioPage.class);
		modelPortfolioPage.editModelPortfolio();
	}
	
}
