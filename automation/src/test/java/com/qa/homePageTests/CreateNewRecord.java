package com.qa.homePageTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.homePages.CreateNewRecordLocators;

public class CreateNewRecord extends TestBase{

	@Test(enabled=true, priority=0)
	public void createNewRec() {
		CreateNewRecordLocators createNewRecord= PageFactory.initElements(driver, CreateNewRecordLocators.class);
		createNewRecord.createRecord();
	}
}
