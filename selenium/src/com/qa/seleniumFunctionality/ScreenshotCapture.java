package com.qa.seleniumFunctionality;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.TestBase;

public class ScreenshotCapture extends TestBase {

	public void captureScreenshot() throws IOException {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("d:/"+System.currentTimeMillis()+".png"));
	}
}
