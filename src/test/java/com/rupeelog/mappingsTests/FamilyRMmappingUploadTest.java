package com.rupeelog.mappingsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mappingsPages.FamilyRMmappingUploadPage;

public class FamilyRMmappingUploadTest extends TestBase{

	
	@Test(enabled = false, priority = 1)
	public void mappingsCreateFmlyBenchMappingTest() {
		FamilyRMmappingUploadPage familyRMmappingUploadPage= PageFactory.initElements(driver, FamilyRMmappingUploadPage.class);
		familyRMmappingUploadPage.createFamilyRMmappingUpload();
	}
	
}
