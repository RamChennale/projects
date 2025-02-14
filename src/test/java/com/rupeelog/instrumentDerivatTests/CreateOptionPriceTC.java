package com.rupeelog.instrumentDerivatTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentDerivatPages.CreateOptionPricePage;

public class CreateOptionPriceTC extends TestBase{

	@Test(enabled = true)
	public void instrumentDerivatCreateOptionPriceTC() {
		CreateOptionPricePage optionPricePage = PageFactory.initElements(driver, CreateOptionPricePage.class);
		optionPricePage.createOptionPrice();
	}
}
