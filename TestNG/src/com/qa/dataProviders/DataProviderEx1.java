package com.qa.dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {

	@DataProvider(name = "input data-provider")
	public Object[][] dataProviderMethod() {

		return new Object[][] { {"Ram" }, {"12345"} };
	}
	
	//if data available in same class then specifying "dataProviderClass" is optional.
	@Test(dataProvider="input data-provider", dataProviderClass=DataProviderEx1.class)
	public void name(String data) {
		System.out.println("Data provider: "+data);
	}
}
