package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.APIConstans;
import com.qa.base.TestBase;
import com.qa.client.GetRestClient2WithHeader;
import com.qa.util.TestUtil;

public class GetRequest2WithHeader extends TestBase implements APIConstans {

	TestBase testBase;
	GetRestClient2WithHeader restClient;
	String serviceUrl;
	String apiUrl;
	String url;
	CloseableHttpResponse httpResponse;

	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = properties.getProperty("serviceUrl");
		apiUrl = properties.getProperty("apiUrl");
		url = serviceUrl + apiUrl;
	}

	@Test
	public void getApiRequestWithHeader() throws ClientProtocolException, IOException {
		restClient = new GetRestClient2WithHeader();
		
		HashMap<String, String> headerMap= new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		headerMap.put("username", "test");
		headerMap.put("password","test123");
		httpResponse = restClient.httpGetRequestWithHeader(url, headerMap);
		
		//Response statusCode
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, STATUS_CODE_200_Success, "Http Get req failed to response StatusCode as 200.");
		System.out.println("Status Code : " + statusCode);

		//Respnse body
		String responseString= EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
		JSONObject jsonObject= new JSONObject(responseString);
		System.out.println("Response JSON : "+jsonObject);
		
		//Single value assertion 
		String per_page_data= TestUtil.getValueByJpath(jsonObject, "/per_page");
		String total_data =TestUtil.getValueByJpath(jsonObject, "total");
		System.out.println(per_page_data+" "+total_data);
		Assert.assertEquals(Integer.parseInt(per_page_data), 6);
		Assert.assertEquals(Integer.parseInt(total_data), 12);
		
		//get value from JSON array
		String id= TestUtil.getValueByJpath(jsonObject, "/data[0]/id");
		String first_name=TestUtil.getValueByJpath(jsonObject, "/data[0]/first_name");
		String last_name= TestUtil.getValueByJpath(jsonObject, "/data[0]/last_name");
		System.out.println(id+""+first_name+" "+ last_name);
		//Header response
		Header[] responseHeaders= httpResponse.getAllHeaders();
		HashMap<String, String> hashMap= new HashMap<String, String>();
		for(Header header: responseHeaders) {
			hashMap.put(header.getName(), header.getValue());
		}
		System.out.println("Header Values are : "+hashMap);
	}
}
