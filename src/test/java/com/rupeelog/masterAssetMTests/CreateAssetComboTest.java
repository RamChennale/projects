package com.rupeelog.masterAssetMTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterAssetMPages.CreateAssetComboPage;

public class CreateAssetComboTest extends TestBase{

	@Test(enabled = true)
	public void masterAssetMCreateAssetCombo() {
		CreateAssetComboPage createAssetComboPage=PageFactory.initElements(driver, CreateAssetComboPage.class);
		createAssetComboPage.createAssetCombo();
	}
}


