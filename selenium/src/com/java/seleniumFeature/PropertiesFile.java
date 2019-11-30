package com.java.seleniumFeature;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		File file = new File(System.getProperty("user.dir") + "/src/seleniumExamples/config.properties");
		FileInputStream fileInputStream = new FileInputStream(file);
		properties.load(fileInputStream);
		System.out.println(properties.getProperty("GESM_URL"));
	}

}
