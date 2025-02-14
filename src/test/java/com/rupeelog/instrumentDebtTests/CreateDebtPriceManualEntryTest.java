package com.rupeelog.instrumentDebtTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentDebtPages.CreateDebtPriceManualEntryPage;

public class CreateDebtPriceManualEntryTest extends TestBase{

	@Test(enabled = true)
	public void instrumentCreateDebtInstTest() {
		CreateDebtPriceManualEntryPage debtPriceManualEntryPage = PageFactory.initElements(driver, CreateDebtPriceManualEntryPage.class);
		debtPriceManualEntryPage.createDebtPriceManualEntry();

	}
}
