package com.rupeelog.sysMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.sysMasterPages.CreateCountryPage;

public class CreateCountryTest extends TestBase{

	@Test(enabled = true)
	public void sysMasterCreateCountryTest() {
		CreateCountryPage cityPage=PageFactory.initElements(driver, CreateCountryPage.class);
		cityPage.createCountryPageTest();
	}
}
