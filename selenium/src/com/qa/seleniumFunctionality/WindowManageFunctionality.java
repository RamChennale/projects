package com.qa.seleniumFunctionality;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.qa.base.TestBase;

public class WindowManageFunctionality extends TestBase {

	public void windowManageFunctionality() {
		driver.manage().window().fullscreen();
		Point point = driver.manage().window().getPosition();
		Dimension dimension = driver.manage().window().getSize();
		driver.manage().window().maximize();
		driver.manage().window().setPosition(point);
		driver.manage().window().setSize(dimension);
	}

}
