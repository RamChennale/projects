package com.rupeelog.instrumentMFTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentMFPages.CreateMutualFundNFOPage;

public class CreateMutualFundNFOTC extends TestBase{

	@Test(enabled = true)
	public void instrumentMFCreateCAMergerTC() {
		CreateMutualFundNFOPage mutusFundNFOPage = PageFactory.initElements(driver, CreateMutualFundNFOPage.class);
		mutusFundNFOPage.createMutualFundNFO();
	}
}
