package com.rupeelog.adminPwdTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;

public class CreateRTAEmailPwdTest extends TestBase{

	@Test(enabled = true)
	public void adminOrgCreateRTAemailPwdTest() {
		CreateRTAEmailPwdPage rtaEmailPwdPage= PageFactory.initElements(driver, CreateRTAEmailPwdPage.class);
		rtaEmailPwdPage.createRTAEmailPwd();
	}
}
