package com.rupeelog.loginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.homePage.VerifyMenuPage;

public class VerifyMenuTest extends TestBase {

	@Test(priority = 1, enabled = true)
	public void verifyAllMenu() {
		VerifyMenuPage menu = PageFactory.initElements(driver, VerifyMenuPage.class);
		menu.verifyAllMenu();
		System.out.println("All menus verified");
	}
}
