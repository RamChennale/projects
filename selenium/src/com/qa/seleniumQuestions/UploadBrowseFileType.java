package com.qa.seleniumQuestions;

import org.openqa.selenium.By;

import com.qa.base.DynamicBaseClass;

public class UploadBrowseFileType extends DynamicBaseClass{

	public void uploadBrowseFileType() {
		System.out.println("Browse/upload button should be Type='file' : ");
		System.out.println("Enter file path in sendKeys(): ");
		driver.findElement(By.id("updload_file")).sendKeys("c:/src/java/file.xml");
	}
}
