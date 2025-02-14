package com.rupeelog.discPMSmodelPortfolioTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSmodelPortfolioPages.CreateSchemeAltListPage;

public class CreateSchemeAltListTC extends TestBase {

	@Test(enabled = true)
	public void discPMSmodelPortfCreateSchemeAltListTC() {
		CreateSchemeAltListPage schemeAltListPage= PageFactory.initElements(driver, CreateSchemeAltListPage.class);
		schemeAltListPage.createSchemeAltList();
	}
}
