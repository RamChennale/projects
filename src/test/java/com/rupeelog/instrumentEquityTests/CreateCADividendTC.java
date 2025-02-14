package com.rupeelog.instrumentEquityTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentEquityPages.CreateCADividendPage;

public class CreateCADividendTC extends TestBase{

	@Test(enabled = true)
	public void instrumentEquityCreateEQBuyBackTC() {
		CreateCADividendPage caDividendPage = PageFactory.initElements(driver, CreateCADividendPage.class);
		caDividendPage.createCADividend();
	}
}
