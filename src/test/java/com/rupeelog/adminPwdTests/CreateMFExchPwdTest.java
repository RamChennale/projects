package com.rupeelog.adminPwdTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;

public class CreateMFExchPwdTest extends TestBase{

	@Test(enabled = true)
	public void adminOrgCreateMFExchPwdTest() {
		CreateMFExchPwdPage mfExchPwdPage= PageFactory.initElements(driver, CreateMFExchPwdPage.class);
		mfExchPwdPage.createMFExchPwd();
	}
}
