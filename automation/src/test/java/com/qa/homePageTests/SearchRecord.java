package com.qa.homePageTests;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.SearchRecordLocators;

public class SearchRecord extends TestBase{

	@Test(enabled=true, priority=1, description="Searching a record")
	public void searchRecord() {
		SearchRecordLocators searchRecordLocators= new SearchRecordLocators(driver);
		searchRecordLocators.searchRecord();
	}
}
