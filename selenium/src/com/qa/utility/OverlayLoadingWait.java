package com.qa.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class OverlayLoadingWait extends TestBase{
	static WebDriverWait webDriverWait = new WebDriverWait(driver, 120);

	public static boolean waitForOverlayLoading(By locator) {
		boolean overlayStatus = webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		return overlayStatus;
	}
}
