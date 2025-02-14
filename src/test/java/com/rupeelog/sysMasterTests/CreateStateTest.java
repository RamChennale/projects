package com.rupeelog.sysMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.sysMasterPages.CreateStatePage;

public class CreateStateTest extends TestBase{

	@Test(enabled = true)
	public void sysMasterCreateStateTest() {
		CreateStatePage statePage=PageFactory.initElements(driver, CreateStatePage.class);
		statePage.createStatePageTest();
	}
}
