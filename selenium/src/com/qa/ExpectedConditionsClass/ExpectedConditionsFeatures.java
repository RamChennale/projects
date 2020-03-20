package com.qa.ExpectedConditionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import org.openqa.selenium.Alert;

public class ExpectedConditionsFeatures {

	WebDriver driver;
	WebDriverWait wait;
	WebElement element;
	List<WebElement> listelements;
	boolean flag;
	By by;
	
	public void seleniumExpectedConditionsFeatures() {
	
	wait=new WebDriverWait(driver, 20); //500ml polling
	wait= new WebDriverWait(driver, 20, 800); //800ml polling
	
	Alert alert =wait.until(ExpectedConditions.alertIsPresent());
	
	//An expectation for checking an element is visible and enabled such that you can click it.
	element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	
	//An expectation for checking if the given element is selected.
	flag=wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
	flag=wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

	
	//An expectation for checking whether the given frame is available to switch to.
	driver=wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
	driver=wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver=wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameLocator"));
	driver=wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath(""))));

	//An expectation for checking the element to be invisible
	flag=wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(""))));
	
//	An expectation for checking number of WebElements with given locator
	//numberOfElementsToBeMoreThan  , numberOfElementsToBeLessThan
	listelements=wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(""),10));

	//An expectation for checking that there is at least one element present on a web page.
	listelements=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));

	//An expectation for checking that an element is present on the DOM of a page.
	element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

//	An expectation for checking WebElement with given locator has specific text
	flag=wait.until(ExpectedConditions.textToBe(By.xpath(""),"locator text"));

	//An expectation for checking if the given text is present in the specified element.
	flag=wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("")), null));

	//An expectation for checking the title of a page.
	flag=wait.until(ExpectedConditions.titleIs(("google")));
	
	//An expectation for the URL of the current page to contain specific text.
	flag=wait.until(ExpectedConditions.urlContains(("http")));

	//An expectation for the URL of the current page to be a specific url.
	flag=wait.until(ExpectedConditions.urlToBe(("url")));
	
	
	//An expectation for checking that an element, known to be present on the DOM of a page, is visible.
	flag=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("")))) != null;

//	An expectation for checking that all elements present on the web page that match the locator are visible.
	listelements=wait.until(ExpectedConditions.visibilityOfAllElements(listelements));

	
	//An expectation for checking that all elements present on the web page that match the locator are visible.
	listelements=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
	
	//An expectation for checking that all elements present on the web page that match the locator are visible.
	listelements=wait.until(ExpectedConditions.visibilityOfAllElements(listelements));

	//An expectation for checking that an element is present on the DOM of a page and visible.
	element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

	}
}
