package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.GetRestClient;

public class GetRequest extends TestBase {

	TestBase testBase;
	GetRestClient restClient;
	String serviceUrl;
	String apiUrl;
	String url;

	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = properties.getProperty("url");
		apiUrl = properties.getProperty("serviceurl");
		url = serviceUrl + apiUrl;
	}

	@Test
	public void getApiRequest() {
		try {
			restClient = new GetRestClient();
			restClient.httpGetRequest(url);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
