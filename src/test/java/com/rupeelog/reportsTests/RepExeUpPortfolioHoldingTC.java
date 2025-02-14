package com.rupeelog.reportsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.reportsPages.RepExeUpPortfolioHoldingPage;

public class RepExeUpPortfolioHoldingTC extends TestBase{

	@Test(enabled = true)
	public void reportsRepExeUpPortfolioHoldingTC() {
		RepExeUpPortfolioHoldingPage upPortfolioHoldingPage=PageFactory.initElements(driver, RepExeUpPortfolioHoldingPage.class);
		upPortfolioHoldingPage.updatePortfolioHolding();
	}
}
