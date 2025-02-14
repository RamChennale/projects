package com.rupeelog.discPMSOrderTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSOrderPages.ViewVarianceForAccPortfolioPage;

public class ViewVarianceForAccPortfolioTC extends TestBase{

	@Test(enabled = true)
	public void discPMSOrderViewVarianceForAccPortfolioTC() {
		ViewVarianceForAccPortfolioPage varienAccPortfolioPage=PageFactory.initElements(driver, ViewVarianceForAccPortfolioPage.class);
		varienAccPortfolioPage.viewVarianceForAccPortfolio();
	}
}
