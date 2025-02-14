package com.rupeelog.instrumentEquityTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentEquityPages.CreateCASplitBonusPage;

public class CreateCASplitBonusTC extends TestBase{

	@Test(enabled = true)
	public void instrumentEquityAddSplitBonusTC() {
		CreateCASplitBonusPage splitBonusPage = PageFactory.initElements(driver, CreateCASplitBonusPage.class);
		splitBonusPage.addSplitBonus();
	}
}
