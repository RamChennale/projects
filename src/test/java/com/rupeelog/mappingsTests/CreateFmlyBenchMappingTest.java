package com.rupeelog.mappingsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mappingsPages.CreateFmlyBenchMappingPage;

public class CreateFmlyBenchMappingTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void mappingsCreateFmlyBenchMappingTest() {
		CreateFmlyBenchMappingPage familybeBenchMappingPage= PageFactory.initElements(driver, CreateFmlyBenchMappingPage.class);
		familybeBenchMappingPage.createFmlyBenchMapping();
	}
	
}
