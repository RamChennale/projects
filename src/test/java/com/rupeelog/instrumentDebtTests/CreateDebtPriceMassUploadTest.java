package com.rupeelog.instrumentDebtTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentDebtPages.CreateDebtPriceMassUploadPage;

public class CreateDebtPriceMassUploadTest extends TestBase{

	@Test(enabled = true)
	public void instrumentCreateDebtInstTest() {
		CreateDebtPriceMassUploadPage massUploadPage = PageFactory.initElements(driver, CreateDebtPriceMassUploadPage.class);
		massUploadPage.createDebtPriceMassUpload();

	}
}
