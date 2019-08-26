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
import org.testng.asserts.SoftAssert;

import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.util.TestUtility;

public class GetApiTest extends TestBase {

	TestBase testBase;
	String serviceURL;
	String apiURL;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;
	SoftAssert SoftAssert;

	@BeforeMethod
	public void setUp() {
		testBase = new TestBase();
		serviceURL = prop.getProperty("URL");
		apiURL = prop.getProperty("serviceURL");
		url = serviceURL + apiURL;
	}

	@Test(priority=1)
	public void getTest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		closeableHttpResponse = restClient.getURL(url);
		// a. Getting STATUS CODE
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("===========The status code is  : " + statusCode + "============");
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200);
		System.out.println();
		
		// b. Getting RESPONSE in JSON
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		JSONObject responseJSON = new JSONObject(responseString);
		System.out.println("==============JSON response " + responseJSON + "===============");
		System.out.println();
		
		// Fetching value from response in JSONobject form
		String per_page= TestUtility.getValueByJpath(responseJSON, "/per_page");
		System.out.println("per_page_value_is : "+per_page);
		Assert.assertEquals(per_page,"6");
		
		String total=TestUtility.getValueByJpath(responseJSON, "/total");
		System.out.println("Total_value is : "+total);
		Assert.assertEquals(total, "12");
		
		// Fetching value from response in JSONarray form
		String last_name= TestUtility.getValueByJpath(responseJSON, "/data[0]/last_name");
		String id=TestUtility.getValueByJpath(responseJSON, "/data[0]/id");
		String avatar=TestUtility.getValueByJpath(responseJSON, "/data[0]/avatar");
		String email=TestUtility.getValueByJpath(responseJSON, "/data[0]/email");
		System.out.println(last_name+" :"+id+" :"+avatar+" :"+email);
		System.out.println();
//		Bluth :1 :https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg :george.bluth@reqres.in
		Assert.assertEquals(last_name, "Bluth","Bluth name dose not exits in JsonArray");
		System.out.println("last_name PASSED");
		Assert.assertEquals(Integer.parseInt(id),1);
		System.out.println("id PASSED");
		Assert.assertEquals(avatar, "https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg");
		System.out.println("avatar PASSED");
		Assert.assertEquals(email, "george.bluth@reqres.in");
		System.out.println("email PASSED");
		//SoftAssert.assertAll();
		
		// c. Getting All HEADER
		Header[] headerArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeader = new HashMap<String, String>();
		for (Header header : headerArray) {
			allHeader.put(header.getName(), header.getValue());
		}
		System.out.println("======================= HEADER content  : " + allHeader + " =====================");
		
	}
	
	@Test(priority=2)
	public void getTestWithHeader() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		HashMap<String, String> hashMap= new HashMap<String, String>();
		hashMap.put("Content-Type", "application/json");
		
		closeableHttpResponse = restClient.getURL(url,hashMap);
		// a. Getting STATUS CODE
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("===========The status code is  : " + statusCode + "============");
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200);
		System.out.println();
		
		// b. Getting RESPONSE in JSON
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		JSONObject responseJSON = new JSONObject(responseString);
		System.out.println("==============JSON response " + responseJSON + "===============");
		System.out.println();
		
		// Fetching value from response in JSONobject form
		String per_page= TestUtility.getValueByJpath(responseJSON, "/per_page");
		System.out.println("per_page_value_is : "+per_page);
		Assert.assertEquals(per_page,"6");
		
		String total=TestUtility.getValueByJpath(responseJSON, "/total");
		System.out.println("Total_value is : "+total);
		Assert.assertEquals(total, "12");
		
		// Fetching value from response in JSONarray form
		String last_name= TestUtility.getValueByJpath(responseJSON, "/data[0]/last_name");
		String id=TestUtility.getValueByJpath(responseJSON, "/data[0]/id");
		String avatar=TestUtility.getValueByJpath(responseJSON, "/data[0]/avatar");
		String email=TestUtility.getValueByJpath(responseJSON, "/data[0]/email");
		System.out.println(last_name+" :"+id+" :"+avatar+" :"+email);
		System.out.println();
//		Bluth :1 :https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg :george.bluth@reqres.in
		Assert.assertEquals(last_name, "Bluth","Bluth name dose not exits in JsonArray");
		System.out.println("last_name PASSED");
		Assert.assertEquals(Integer.parseInt(id),1);
		System.out.println("id PASSED");
		Assert.assertEquals(avatar, "https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg");
		System.out.println("avatar PASSED");
		Assert.assertEquals(email, "george.bluth@reqres.in");
		System.out.println("email PASSED");
		
		// c. Getting All HEADER
		Header[] headerArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeader = new HashMap<String, String>();
		for (Header header : headerArray) {
			allHeader.put(header.getName(), header.getValue());
		}
		System.out.println("======================= HEADER content  : " + allHeader + " =====================");
		
	}
	
	
	
}
