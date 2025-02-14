package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.IndicesBenchCreateIndiceValMEPage;

public class IndicesBenchCreateIndiceValMETC extends TestBase{

	@Test(enabled = true)
	public void processIndicesBenchCreateIndiceValMETC() {
		IndicesBenchCreateIndiceValMEPage indiceValMEPage = PageFactory.initElements(driver, IndicesBenchCreateIndiceValMEPage.class);
		indiceValMEPage.indicesBenchCreateIndiceValManualEntry();

	}
}
