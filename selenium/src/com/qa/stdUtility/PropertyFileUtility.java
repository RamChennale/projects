package com.qa.stdUtility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

public class PropertyFileUtility {
	
	Properties properties; 
	String filePath; 
	
	public PropertyFileUtility(String propertyFilePath) { 
		BufferedReader reader ; 
		this.filePath = propertyFilePath ;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			
			properties.load(reader);
			reader.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			Assert.fail();
		}catch (IOException e1) {
			e1.printStackTrace();
			Assert.fail();
		}
	}
	
	public  String getProperty(String propertyName) {
		return properties.getProperty(propertyName);
		
	}

}
