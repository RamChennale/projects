package com.rupeelog.managedAccountTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.managedAccountPage.CreateMAAdvisorPage;

public class CreateMAAdvisorTest extends TestBase{
	
	@Test(enabled = true)
	public void managedAccounCreateMAAdvTest() {
		CreateMAAdvisorPage maAdvisorPage = PageFactory.initElements(driver, CreateMAAdvisorPage.class);
		maAdvisorPage.createNewMAAdvPage();
	}

}
