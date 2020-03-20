package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class GetFailedTCScreenshotByITestListener {

	public static String getScreenshot(WebDriver driver, String screenshotName) {
		String dateName = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destinationPath = System.getProperty("user.dir") + "test-output/" + dateName + screenshotName + ".png";
		try {
			File finalDestinationPath = new File(destinationPath);
			FileUtils.copyFile(source, finalDestinationPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destinationPath;
	}
}
