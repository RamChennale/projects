package com.rupeelog.AccessControlTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.AccessControlPages.ChangeKYPHPwdPage;
import com.rupeelog.base.TestBase;

public class ChangeKYPHPwdTest extends TestBase {

	@Test(enabled = true)
	public void accessControlChangeKYPHPwdTest() {
		ChangeKYPHPwdPage kyphPwdPage = PageFactory.initElements(driver, ChangeKYPHPwdPage.class);
		kyphPwdPage.changeKYPHPwdPageTest();

	}
}
 