package com.qa.testNG.dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {

	@DataProvider(name = "input data-provider")
	public Object[][] dataProviderMethod() {

		return new Object[][] { {"Ram" }, {"12345"} };
	}
	
	@Test(dataProvider="input data-provider")
	public void name(String data) {
		System.out.println("Data provider: "+data);
	}
}
