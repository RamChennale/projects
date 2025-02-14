package com.rupeelog.mappingsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mappingsPages.FamilyRMmappingPage;

public class FamilyRMmappingTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void mappingsCreateFmlyBenchMappingTest() {
		FamilyRMmappingPage familyRMmappingPage= PageFactory.initElements(driver, FamilyRMmappingPage.class);
		familyRMmappingPage.createFamilyRMmapping();
	}
	
}
