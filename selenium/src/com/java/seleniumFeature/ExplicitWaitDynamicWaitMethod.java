package com.java.seleniumFeature;
/*package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDynamicWaitMethod {

	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();

		WebElement username = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("sign_in"));

		sendKeys(driver, username, 10, "ramchennale");
		sendKeys(driver, password, 5, "ram@123");
		clickOn(driver, login, 2);
	}

	public static void sendKeys(WebDriver driver, WebElement element, int timeOut, String value) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
	}

	public static void clickOn(WebDriver driver, WebElement element, int timeOut) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
*/