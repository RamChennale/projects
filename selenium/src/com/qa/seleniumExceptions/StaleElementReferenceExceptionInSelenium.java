package com.qa.seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class StaleElementReferenceExceptionInSelenium extends DynamicBaseClass {

	@Test
	public void staleElementExceptionInSelenium() throws InterruptedException {
		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		driver.navigate().refresh();
		/*
		 * Indicates that a reference to an element is now "stale" --- the element no
		 * longer appears on the DOM of the page.
		 * 
		 * 
		 * org.openqa.selenium.StaleElementReferenceException: stale element reference:
		 * element is not attached to the page document
		 */
		home.click();
	}
}

/*
 * This can happen if a DOM operation happening on the page is temporarily
 * causing the element to be inaccessible. To allow for those cases, you can try
 * to access the element several times in a loop before finally throwing an
 * exception.
 
public boolean retryingFindClick(By by) {
    boolean result = false;
    int attempts = 0;
    while(attempts < 2) {
        try {
            driver.findElement(by).click();
            result = true;
            break;
        } catch(StaleElementException e) {
        }
        attempts++;
    }
    return result;
}*/
/*
I was having this issue intermittently. Unbeknownst to me, BackboneJS was running on the page and replacing the element I was trying to click. My code looked like this.

driver.findElement(By.id("checkoutLink")).click();
Which is of course functionally the same as this.

WebElement checkoutLink = driver.findElement(By.id("checkoutLink"));
checkoutLink.click();
What would occasionally happen was the javascript would replace the checkoutLink element in between finding and clicking it, ie.

WebElement checkoutLink = driver.findElement(By.id("checkoutLink"));
// javascript replaces checkoutLink
checkoutLink.click();
Which rightfully led to a StaleElementReferenceException when trying to click the link. I couldn't find any reliable way to tell WebDriver to wait until the javascript had finished running, so here's how I eventually solved it.

new WebDriverWait(driver, timeout)
    .ignoring(StaleElementReferenceException.class)
    .until(new Predicate<WebDriver>() {
        @Override
        public boolean apply(@Nullable WebDriver driver) {
            driver.findElement(By.id("checkoutLink")).click();
            return true;
        }
    });
This code will continually try to click the link, ignoring StaleElementReferenceExceptions until either the click succeeds or the timeout is reached. I like this solution because it saves you having to write any retry logic, and uses only the built-in constructs of WebDriver.
*/