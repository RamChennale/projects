package com.rupeelog.masterCOBMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterCOBMasterPages.CreateLegalStatusPage;

public class CreateLegalStatusTest extends TestBase{

	@Test(enabled = true)
	public void masterClienttOnBoardCreateLegalStatusTest() {
		CreateLegalStatusPage legalStatusPage=PageFactory.initElements(driver, CreateLegalStatusPage.class);
		legalStatusPage.createNewLegalStatus();
	}
}
