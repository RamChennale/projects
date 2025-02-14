package com.rupeelog.AccessControlTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.AccessControlPages.ChangeEmpPwdPage;
import com.rupeelog.base.TestBase;

public class ChangeEmpPwdTest extends TestBase {

	@Test(enabled = true)
	public void accessControlChangeEmpPwdTest() {
		ChangeEmpPwdPage empPwdPage = PageFactory.initElements(driver, ChangeEmpPwdPage.class);
		empPwdPage.changeEmpPwdPageTest();

	}
}
