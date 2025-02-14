package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.RunMfFifoFoliowisePage;

public class RunMfFifoFoliowiseTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjCurrencyAutoExpiryAllClientTest() {
		RunMfFifoFoliowisePage mfFifoFoliowisePage= PageFactory.initElements(driver, RunMfFifoFoliowisePage.class);
		mfFifoFoliowisePage.manualTxnAdjRunMFfifofoliowise();
	}
}
