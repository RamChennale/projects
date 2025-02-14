package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.RunEodProEQDMAPage;

public class RunEodProEQDMATC extends TestBase{

	@Test
	public void processRunEodProEQDMATC() {
		RunEodProEQDMAPage runEodProEQDMAPage= PageFactory.initElements(driver, RunEodProEQDMAPage.class);
		runEodProEQDMAPage.runEodProEQDMA();
	}
}
