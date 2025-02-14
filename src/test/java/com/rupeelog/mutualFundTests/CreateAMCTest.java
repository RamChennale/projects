package com.rupeelog.mutualFundTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mutualFundPages.CreateAMCPage;

public class CreateAMCTest extends TestBase{

	@Test(enabled = true)
	public void mutualFundCreateAMCTest() {
		CreateAMCPage amcPage= PageFactory.initElements(driver, CreateAMCPage.class);
		amcPage.createAMCPageTest();
		
	}
}
