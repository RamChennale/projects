package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessIndicesBenchmaBCPages;

public class ProcessIndicesBenchmaBCTest extends TestBase {

	@Test(enabled = true)
	public void processIndicesBDebtPriceBc() {
		ProcessIndicesBenchmaBCPages indicesBenchmaBCPages=PageFactory.initElements(driver, ProcessIndicesBenchmaBCPages.class);
		indicesBenchmaBCPages.indicesBenchmarkValues();
	}

}
