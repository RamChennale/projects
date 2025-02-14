package com.rupeelog.commonMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.commonMasterPages.CreateEmailCredenPage;

public class CreateEmailCredenTest extends TestBase {

	@Test(enabled = true)
	public void commonMasterCreateEmailCredenTest() {
		CreateEmailCredenPage emailCredenPage = PageFactory.initElements(driver, CreateEmailCredenPage.class);
		emailCredenPage.createNewEmailCreden();
	}
}
