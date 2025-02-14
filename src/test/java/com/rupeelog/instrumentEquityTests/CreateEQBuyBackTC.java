package com.rupeelog.instrumentEquityTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentEquityPages.CreateEQBuyBackPage;

public class CreateEQBuyBackTC extends TestBase{

	@Test(enabled = true)
	public void instrumentEquityCreateEQBuyBackTC() {
		CreateEQBuyBackPage buyBackPage = PageFactory.initElements(driver, CreateEQBuyBackPage.class);
		buyBackPage.createEQBuyBack();
	}
}
