package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetApiTest extends TestBase{

	TestBase testBase;
	String serviceURL;
	String apiURL;
	String url;
	RestClient restClient;
	
	@BeforeMethod
	public void setUp()  {
		testBase = new TestBase();
		 serviceURL= prop.getProperty("URL");
		 apiURL=prop.getProperty("serviceURL");
		 url= serviceURL+apiURL;
		}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException{
		restClient= new RestClient();
		restClient.getURL(url);
	}
}
