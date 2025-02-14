package com.rupeelog.reportsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.reportsPages.RepExeUpdateLedPeriodBalPage;

public class RepExeUpdateLedPeriodBalTC extends TestBase{

	@Test(enabled = true)
	public void reportsRepExeUpPortfolioHoldingTC() {
		RepExeUpdateLedPeriodBalPage ledPeriodBalPage=PageFactory.initElements(driver, RepExeUpdateLedPeriodBalPage.class);
		ledPeriodBalPage.updateLedPeriodBal();
	}
}
