package com.rupeelog.rimsMFRevenueTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsMFRevenuePages.CreateRevTypeMasterPage;

public class CreateRevTypeMasterTC extends TestBase{

	@Test(enabled = true)
	public void rimsMFRevenueCreateRevTypeMasterTC() {
		CreateRevTypeMasterPage revTypeMasterPage=PageFactory.initElements(driver, CreateRevTypeMasterPage.class);
		revTypeMasterPage.createRevTypeMaster();
	}
}
