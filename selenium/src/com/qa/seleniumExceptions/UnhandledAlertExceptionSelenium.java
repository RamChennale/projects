package com.qa.seleniumExceptions;

/*UnhandledAlertException: When Alert is not handled throws 'UnhandledAlertException' exception 
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnhandledAlertExceptionSelenium {

	public void SeleniumUnhandledAlertException() {

		WebDriver driver = null;
		WebElement element = null;
		driver.switchTo().alert();
		System.out.println("Documents are upload status : " + element.getText());

	}
}
