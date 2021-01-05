package com.qa.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class CheckBoxOperations extends TestBase {

	@Test
	public void checkBoxFun() {
		WebElement form = driver.findElement(By.linkText("Form"));
		form.click();
		String xpath = "//input[@type='checkbox' and @value='dance']";
		checkACheckBox(xpath);
		unCheckACheckBox(xpath);
	}

	public static void checkACheckBox(String locator) {
		WebElement checkBox = driver.findElement(By.xpath(locator));
		boolean checkBoxStatus = checkBox.isSelected();
		if (!checkBoxStatus) {
			checkBox.click();
		}
	}

	public static void unCheckACheckBox(String locator) {
		WebElement checkBox = driver.findElement(By.xpath(locator));
		boolean checkBoxStatus = checkBox.isSelected();
		if (checkBoxStatus) {
			checkBox.click();
		}
	}
}
