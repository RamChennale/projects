package com.rupeelog.discPMSClientMagmtTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSClientMagmtPages.CreateNegativeListPage;

public class CreateNegativeListTC extends TestBase {

	@Test(enabled = true)
	public void discPMSClientMagmtCreateNegativeListTC() {
		CreateNegativeListPage negativeListPage= PageFactory.initElements(driver, CreateNegativeListPage.class);
		negativeListPage.createNegativeList();
	}
}
