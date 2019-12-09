package com.qa.seleniumFunctionality;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class SeleniumExceptionHandling extends TestBase {

	@Test
	public void ExceptionHandlingInSelenium() {
		try {
			if(webElement.isEnabled()) {
				webElement.sendKeys("username");
			}
		}catch(NoSuchElementException nse) {
			System.out.println(nse.toString());
		}
	}
}
