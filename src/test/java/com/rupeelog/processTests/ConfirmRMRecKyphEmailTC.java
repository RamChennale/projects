package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.ConfirmRMRecKyphEmailPage;

public class ConfirmRMRecKyphEmailTC extends TestBase{

	@Test
	public void processConfirmRMRecKyphEmailTC() {
		ConfirmRMRecKyphEmailPage kyphEmailPage=PageFactory.initElements(driver, ConfirmRMRecKyphEmailPage.class);
		kyphEmailPage.sendKyphEmail();
	}
}
