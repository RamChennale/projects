package com.qa.homePageTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.homePages.SearchRecordLocators;

public class SearchRecord extends TestBase{

	@Test(enabled=true, priority=1, description="Searching a record")
	public void searchRecord() {
		SearchRecordLocators searchRecordLocators= PageFactory.initElements(driver, SearchRecordLocators.class);
		searchRecordLocators.searchRecord();
	}
}
