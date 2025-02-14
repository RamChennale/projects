package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.RealisedGainPage;

public class RealisedGainRunEQMfMaDtPortfolioTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjEQMfMaDtTest() {
		RealisedGainPage realisedGainPage= PageFactory.initElements(driver, RealisedGainPage.class);
		realisedGainPage.manualTxnAdjRunEQMfMaDt();
	}
	
}
