package com.rupeelog.reportsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.reportsPages.KyphEmailPage;

public class SendKyphEmailTC extends TestBase{

	@Test(enabled = true)
	public void reportsKyphEmailTC() {
		KyphEmailPage kyphEmailPage=PageFactory.initElements(driver, KyphEmailPage.class);
		kyphEmailPage.sendKyphEmail();
	}
}
