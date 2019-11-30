package com.java.seleniumFeature;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class ScreenShot {

	WebDriver driver = null;

	@Test
	public void captureScreenshot() {

		try {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("d:/" + System.currentTimeMillis() + ".png")); //("d:/image.png")
		} catch (IOException e) {
			System.out.println("" + e);
			e.printStackTrace();
		}

	}
}
