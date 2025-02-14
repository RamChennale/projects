package com.rupeelog.rimsRIMSUpdateTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsRIMSUpdatePages.RIMSRerunUpFamilyRMMappingPage;

public class RIMSRerunUpFamilyRMMappingTC extends TestBase{

	@Test(enabled = true)
	public void createFamilyWiseSplitMasterTC() {
		RIMSRerunUpFamilyRMMappingPage familyWiseSplitMasterPage=PageFactory.initElements(driver, RIMSRerunUpFamilyRMMappingPage.class);
		familyWiseSplitMasterPage.rimsRerunUpFamilyRMMapping(); 
	}
}
