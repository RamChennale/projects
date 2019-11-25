package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	
	public Properties properties;
	public FileInputStream fileInputStream;

	public TestBase() {
		try {
			properties = new Properties();
			fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties");
			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
