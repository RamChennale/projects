package com.qa.autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class AutoITForWindPopUp extends DynamicBaseClass {

	@Test
	public void autoITForWindPopUp() throws IOException, InterruptedException {
		DynamicBaseClass
				.NavigateToUrl("C:/Users/ramchennale/git/projects/selenium/src/com/qa/autoIt/fileBrowsing.html");
		driver.findElement(By.xpath("//input[@id=1]")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\ramchennale\\git\\projects\\selenium\\src\\com\\qa\\autoIt\\FileUploadScript.exe");
		Thread.sleep(5000);
	}
}
