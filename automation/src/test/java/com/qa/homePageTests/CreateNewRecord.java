package com.qa.homePageTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CreateNewRecordLocators;
import com.qa.utility.DataProviderUtility;

public class CreateNewRecord extends TestBase {

	@DataProvider
	public Object[][] getData() {
		Object data[][] = DataProviderUtility.getData(0);
		return data;
	}

	@Test(priority = 1, enabled = false, dataProvider = "getData")
	public void createNewRecordByTDD(String fname, String lastname, String date) {
		CreateNewRecordLocators createNewRecord = PageFactory.initElements(driver, CreateNewRecordLocators.class);
		createNewRecord.createRecordByTDD(fname, lastname, date);
	}

	@Test(priority = 2, enabled = true)
	public void createNewRecord() {
		CreateNewRecordLocators createNewRecord = new CreateNewRecordLocators(driver);
		createNewRecord.createRecord();
	}
}
