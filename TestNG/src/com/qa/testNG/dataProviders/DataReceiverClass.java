package com.qa.testNG.dataProviders;

import org.testng.annotations.Test;

public class DataReceiverClass {

	@Test(dataProvider="inputDataProviderMethod", dataProviderClass=DataProviderClass.class)
	public void dataProviderTestMethod(String data) {
		System.out.println("Data by DataProvider Class: "+data);
	}
}
