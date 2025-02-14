package com.rupeelog.masterCOBMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterCOBMasterPages.CreateOccupationPage;

public class CreateOccupationTest extends TestBase{
	
	@Test(enabled = true)
	public void masterClienttOnBoardCreateOccupationTest() {
		CreateOccupationPage createOccupationPage=PageFactory.initElements(driver, CreateOccupationPage.class);
		createOccupationPage.createOccupation();
	}
}
