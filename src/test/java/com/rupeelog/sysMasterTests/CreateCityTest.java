package com.rupeelog.sysMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.sysMasterPages.CreateCityPage;

public class CreateCityTest extends TestBase{

	@Test(enabled = true)
	public void sysMasterCreateSysMCityTest() {
		CreateCityPage cityPage=PageFactory.initElements(driver, CreateCityPage.class);
		cityPage.createSysMCityPageTest();
	}
}
