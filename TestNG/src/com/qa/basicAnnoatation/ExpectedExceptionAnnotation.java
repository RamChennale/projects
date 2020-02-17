package com.qa.basicAnnoatation;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.ExpectedExceptions;

public class ExpectedExceptionAnnotation {

	@ExpectedExceptions(value = { NoSuchElementException.class, 
			ElementNotVisibleException.class,
			StaleElementReferenceException.class })
	public void expectedExceptions() {

	}
}
