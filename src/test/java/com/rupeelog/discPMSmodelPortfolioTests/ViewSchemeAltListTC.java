package com.rupeelog.discPMSmodelPortfolioTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSmodelPortfolioPages.CreateSchemeAltListPage;

public class ViewSchemeAltListTC extends TestBase {

	@Test(enabled = true)
	public void discPMSmodelPortfViewSchemeAltListTC() {
		CreateSchemeAltListPage schemeAltListPage= PageFactory.initElements(driver, CreateSchemeAltListPage.class);
		schemeAltListPage.viewSchemeAltList();
	}
}
