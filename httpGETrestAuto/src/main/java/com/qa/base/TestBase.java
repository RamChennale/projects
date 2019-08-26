package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties prop;
	public int RESPONSE_STATUS_CODE_200 = 200;
	public int RESPONSE_STATUS_CODE_201 = 201;
	public int RESPONSE_STATUS_CODE_400 = 400;
	public int RESPONSE_STATUS_CODE_401 = 401;
	public int RESPONSE_STATUS_CODE_500 = 500;
	
	
	
	public TestBase() {
		prop= new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
			try {
				prop.load(fileInputStream);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("IOException "+e);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException "+e);
		}
	}
}
