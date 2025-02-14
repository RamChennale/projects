package com.rupeelog.AccessControlTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.AccessControlPages.UserRoleAccessPage;
import com.rupeelog.base.TestBase;

public class UserRoleAccessTest extends TestBase {

	@Test(enabled = true)
	public void accessControlAssignUserRoleTest() {
		UserRoleAccessPage kyphPwdPage = PageFactory.initElements(driver, UserRoleAccessPage.class);
		kyphPwdPage.userRoleAccessPageTest();

	}
}
 