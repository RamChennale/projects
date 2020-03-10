package com.qa.waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_presenceOfAllElementsLocatedBy {

	public static void waitForPresenceOfAllElementsLocatedBy(WebDriver driver,String xpathExpression, int timeOutInSecconds) {
		 new WebDriverWait(driver, timeOutInSecconds).
		 until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathExpression)));
	}
}

/*ExpectedConditions.presenceOfAllElementsLocatedBy() :
	
An expectation for checking that there is at least one element present on a web page.
Parameters:
locator used to find the element
Returns:
the list of WebElements once they are located*/