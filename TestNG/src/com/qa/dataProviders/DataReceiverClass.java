package com.qa.dataProviders;

import org.testng.annotations.Test;

public class DataReceiverClass {

	@Test(dataProvider="inputDataProviderMethodName", dataProviderClass=DataProviderClass.class)
	public void dataProviderTestMethod(String data) {
		System.out.println("Data by DataProvider Class: "+data);
	}
}
