package com.qa.homePageTests;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.homePages.HomePageLocators;

public class HomePageOperations extends TestBase {

	private static Logger logger = Logger.getLogger(HomePageOperations.class);

	public static void main(String[] args) {
		if (logger.isInfoEnabled()) {
			logger.info("Home page Test case excecution started.");
		}
		HomePageLocators homePage = PageFactory.initElements(driver, HomePageLocators.class);
		logger.error("Fails to find HomePage locatos.");

		if (logger.isInfoEnabled()) {
			logger.info("Home page Test case excecution started.");
		}
	}

	@Test(enabled = true, priority = 0)
	public void createNewRec() {
		new PageFactory();
		PageFactory.initElements(driver, HomePageLocators.class).createRecord();
	}

	@Test(enabled = true, priority = 1)
	public void searchRec() {
		new PageFactory();
		PageFactory.initElements(driver, HomePageLocators.class).searchRecord("");
	}
}
