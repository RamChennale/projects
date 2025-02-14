package com.rupeelog.reportsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.reportsPages.PushNotificationPage;

public class SendPushNotificationTC extends TestBase{

	@Test(enabled = true)
	public void reportsKyphEmailTC() {
		PushNotificationPage pushNotificationPage=PageFactory.initElements(driver, PushNotificationPage.class);
		pushNotificationPage.sendPushNotification();
	}
}
