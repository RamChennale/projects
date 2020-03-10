package com.qa.dataProviders;

/*TestNG @DataProvider and @Test in different classes
 * 
 * In such a case the dataProviderMethod() has to be declared static so that it can be used 
 * by a test method in a different class for providing data.*/
import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "inputDataProviderMethodName")
	public static Object[][] inputData() {
		return new Object[][] { { "abc" }, { "123" }, { "a,b" } };
	}
}
