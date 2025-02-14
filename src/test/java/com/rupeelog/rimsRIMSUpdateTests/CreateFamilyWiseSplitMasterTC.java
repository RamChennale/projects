package com.rupeelog.rimsRIMSUpdateTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsRIMSUpdatePages.CreateFamilyWiseSplitMasterPage;

public class CreateFamilyWiseSplitMasterTC extends TestBase{

	@Test(enabled = true)
	public void createFamilyWiseSplitMasterTC() {
		CreateFamilyWiseSplitMasterPage familyWiseSplitMasterPage=PageFactory.initElements(driver, CreateFamilyWiseSplitMasterPage.class);
		familyWiseSplitMasterPage.createFamilyWiseSplitMaster();
	}
}
