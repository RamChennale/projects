package com.qa.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class BasicLocatorTest extends TestBase {

	@Test(enabled = true)
	public void locatorBasicTest() {
		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement findBtn = driver.findElement(By.xpath("//*[@type='submit' and @value='Find']"));
		System.out.println(" getTagName : " + findBtn.getTagName());
		System.out.println(" getAttribute value : " + findBtn.getAttribute("value"));
		System.out.println(" getAttribute type : " + findBtn.getAttribute("type"));
		System.out.println(" getAttribute  href: " + findBtn.getAttribute("href"));
		System.out.println(" getText : " + findBtn.getText());
		System.out.println(findBtn.getAttribute("type"));
		System.out.println(findBtn.getAttribute("name"));
		System.out.println(findBtn.getAttribute("class"));
		System.out.println(findBtn.getAttribute("placeholder"));
	}
}

/*
 * Output:
 * 
 * getTagName : input getAttribute value : Find getAttribute type : submit
 * getText : PASSED: locatorBasicTest
 * 
 */
