package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminMappingsBCPages;

public class AdminMappingsBCTests extends TestBase{
	
	@Test(enabled = true)
	public void adminMappingsClientBankMappingBc() {
		AdminMappingsBCPages adminMappingsBCPages=PageFactory.initElements(driver, AdminMappingsBCPages.class);
		adminMappingsBCPages.clientBankMapping();
	}
	
	@Test(enabled = true)
	public void adminMappingsClientDematMappingBc() {
		AdminMappingsBCPages adminMappingsBCPages=PageFactory.initElements(driver, AdminMappingsBCPages.class);
		adminMappingsBCPages.clientDematMapping();
	}
	
	@Test(enabled = true)
	public void adminMappingsClientIPSMappingBc() {
		AdminMappingsBCPages adminMappingsBCPages=PageFactory.initElements(driver, AdminMappingsBCPages.class);
		adminMappingsBCPages.clientIPSMapping();
	}
	
	@Test(enabled = true)
	public void adminMappingsFamilyBenchmarkmappingBc() {
		AdminMappingsBCPages adminMappingsBCPages=PageFactory.initElements(driver, AdminMappingsBCPages.class);
		adminMappingsBCPages.familyBenchmarkmapping();
	}
	
	@Test(enabled = true)
	public void adminMappingsFamilyRMMappingBc() {
		AdminMappingsBCPages adminMappingsBCPages=PageFactory.initElements(driver, AdminMappingsBCPages.class);
		adminMappingsBCPages.familyRMMapping();	}
	
	@Test(enabled = true)
	public void adminMappingsFamilyRMMappingsUploadBc() {
		AdminMappingsBCPages adminMappingsBCPages=PageFactory.initElements(driver, AdminMappingsBCPages.class);
		adminMappingsBCPages.familyRMMappingsUpload();
	}
	
}
