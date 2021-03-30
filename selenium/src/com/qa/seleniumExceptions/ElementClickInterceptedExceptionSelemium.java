package com.qa.seleniumExceptions;

/*Using JavaScript click it worked but we bypassed the actual reason which may be a potential bug or 
 * a bad UX design. When we enter search keyword then google shows auto suggestions and HIDES THE 
 * SEARCH BUTTON. As per Official Selenium Doc – ElementClickInterceptedException Indicates that a 
 * click could not be properly executed because the target element was obscured in some way. 
 * This exception class extends ElementNotInteractableException class.

That is the reason Selenium Click was not able to click on element. Search button is overlapped 
by an auto suggestion option. Exception details also shows that which element will get click
 instead of search button. That is the reason neither wait worked nor wait for clickable. 
 JavaScript works at DOM level directly so it was able to click.
 
 http://makeseleniumeasy.com/2020/05/25/elementclickinterceptedexception-element-click-intercepted-not-clickable-at-point-other-element-would-receive-the-click/
 
*/
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementClickInterceptedExceptionSelemium {

	/*
	 * //solution
	 * 
	 * static JavascriptExecutor javascriptExecutor;
	 * 
	 * public static void clickByJavascriptExecutor(WebDriver driver,WebElement
	 * element) { javascriptExecutor=(JavascriptExecutor)driver;
	 * javascriptExecutor.executeScript("arguments[0].click()", element); }
	 */
}
