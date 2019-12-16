package com.qa.basicAnnoatation;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

public class ExpectedExceptions {

	@org.testng.annotations.ExpectedExceptions(value = { NoSuchElementException.class, ElementNotVisibleException.class,
			StaleElementReferenceException.class })
	public void expectedExceptions() {

	}
}
