package com.rupeelog.discPMSOrderTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSOrderPages.GenerateVariancePage;

public class GenerateVarianceTC extends TestBase{

	@Test(enabled = true)
	public void discPMSOrderGenerateVarianceTC() {
		GenerateVariancePage generateVariancePage=PageFactory.initElements(driver, GenerateVariancePage.class);
		generateVariancePage.generateVariance();
	}
}
