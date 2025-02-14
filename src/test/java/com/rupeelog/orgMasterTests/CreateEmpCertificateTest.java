package com.rupeelog.orgMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.orgMasterPages.CreateEmpCertificatePage;

public class CreateEmpCertificateTest extends TestBase{

	@Test(enabled = true)
	public void orgMasterCreateDesignationTest() {
		CreateEmpCertificatePage certificatePage=PageFactory.initElements(driver, CreateEmpCertificatePage.class);
		certificatePage.createEmpCertificatePageTest();
	}
}
