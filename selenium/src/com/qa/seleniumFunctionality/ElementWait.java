package com.qa.seleniumFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBaseWealthWeb;

public class ElementWait extends TestBaseWealthWeb {

	static WebDriverWait wait = new WebDriverWait(driver, 30);

	/*
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @Parameters:locator used to find the element
	 * 
	 * @Returns:the WebElement once it is located
	 */
	public static WebElement isElementPresentVerify(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static boolean isElementPresentVerifySAME(By locator) {
		List<WebElement> element = driver.findElements(locator);
		return element.size() > 0;
	}

	/*
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 * 
	 * @Parameters:locator used to find the element
	 * 
	 * @Returns:the WebElement once it is located and clickable (visible and
	 * enabled)
	 */
	public static WebElement isElementClickable(By locator) {
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		 return element;
	}
	
	/*
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible.Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * @Parameters:locator used to find the element
	 * 
	 * @Returns:the WebElement once it is located and visible
	 */

	
	public static WebElement isElementVisible(WebElement elementParam) {
		try { 
		 wait.until(ExpectedConditions.visibilityOf(elementParam));
		}catch (NoSuchElementException noSuchElementException) {
			noSuchElementException.printStackTrace();
		}
		return elementParam;
		
	}
	
	public static WebElement isElementVisibleSAME(By locator) {
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 return element;
	}
	
	public static List<WebElement> visibilityOfAllElements(List<WebElement> elementsParam) {
		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElements(elementsParam));
		 return elements;
	}
	
	/*
	 * An expectation for checking that an element is either invisible or not
	 * present on the DOM.(can be used overlay checking like element will display but will get stale or disappears)
	 * 
	 * @Parameters:locator used to find the element
	 * 
	 * @Returns:true if the element is not displayed or the element doesn't exist or
	 * stale element
	 */

	public static boolean waitForOverlayDisappearExplicitly(By locator) {
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	public static boolean waitForOverlayLoading(WebElement element) {
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}

	/*
	 * Is the element currently enabled or not? This will generally return true for
	 * everything but disabled input elements.
	 * 
	 * @Returns:True if the element is enabled, false otherwise.
	 */

	public static boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}
	
	//.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();
	/*
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 * 
	 * Parameters:element the WebElement
	 * 
	 * Returns:the (same) WebElement
	 * once it is clickable (visible and enabled)
	 * 
	 */	public static WebElement elementToBeClickable(WebElement element) {
		 return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*
	 * Is this element displayed or not? This method avoids the problem of having to
	 * parse anelement's "style" attribute.
	 * 
	 * @Returns:Whether or not the element is displayed
	 * 
	 * Used to check if the element is displayed or not. It returns false when the element is not present in DOM.
	 */

	public static boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	
	
	/*
	 * An expectation for checking that an element with text is either invisible or
	 * not present on theDOM.
	 * 
	 * @Parameters:locator used to find the element text of the element
	 * 
	 * @Returns:true if no such element, stale element or displayed text not equal
	 * that provided
	 */

	public static boolean isElementInVisibleWithText(By locator) {
		return wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, "Ram"));
	}
	
	
	public static void scrollToFindElement(WebDriver driver, WebElement element) {
		JavascriptExecutor javascriptExecutor= ((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void findElementsByPageScrolling(WebDriver driver, List<WebElement> elementList) {
		JavascriptExecutor javascriptExecutor= ((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", elementList);
	}
	
	public static void scrollingPageDown(WebDriver driver) {
		JavascriptExecutor javascriptExecutor=((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("window.scrollBy(0,400)");
	}
	
	public static void scrollingPageUp(WebDriver driver) {
		JavascriptExecutor javascriptExecutor=((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("window.scrollBy(0,-250)");
	}

	public static void waitToPopUpAlert() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
		} catch (TimeoutException toe) {
			toe.printStackTrace();
		}
	}
}
