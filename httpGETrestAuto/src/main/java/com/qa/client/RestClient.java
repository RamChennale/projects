package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	
	// 1. GET method without HEADER
		public CloseableHttpResponse getURL(String url) throws ClientProtocolException, IOException {
			CloseableHttpClient httpclient = HttpClients.createDefault(); //creating a HTTP CLIENT
			HttpGet httpGet = new HttpGet(url); //Creating a HTTP REQUEST
			CloseableHttpResponse closeableHttpResponse = httpclient.execute(httpGet); // Hitting URL
			return  closeableHttpResponse;
		}
		
		// 2. GET method with HEADER
		public CloseableHttpResponse getURL(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
			CloseableHttpClient httpclient = HttpClients.createDefault(); //creating a HTTP CLIENT
			HttpGet httpGet = new HttpGet(url); //Creating a HTTP REQUEST
			for(Map.Entry<String, String> entry: headerMap.entrySet()) {
				httpGet.addHeader(entry.getKey(), entry.getValue());
			}
			CloseableHttpResponse closeableHttpResponse = httpclient.execute(httpGet); // Hitting URL
			return  closeableHttpResponse;
		}
		
		// 3. POST method with header
		public CloseableHttpResponse post(String url, String entryString, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
			CloseableHttpClient httpClient= HttpClients.createDefault();// creating HTTP client
			HttpPost httpPost= new HttpPost(url);//creating HTTP request
			httpPost.setEntity(new StringEntity(entryString));// passing payload
			for(Map.Entry<String, String> entry:headerMap.entrySet()) {
				httpPost.addHeader(entry.getKey(), entry.getValue());
			}
			CloseableHttpResponse closeableHttpResponse= httpClient.execute(httpPost);
			return closeableHttpResponse;
		}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*// 1. GET method
	public void getURL(String url) throws ClientProtocolException, IOException {

		CloseableHttpClient httpclient = HttpClients.createDefault(); //creating a HTTP CLIENT
		HttpGet httpGet = new HttpGet(url); //Creating a HTTP REQUEST
		CloseableHttpResponse closeableHttpResponse = httpclient.execute(httpGet); // Hitting URL
		// a. Getting STATUS CODE
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("===========The status code is  : " + statusCode+"============");

		// b. Getting RESPONSE in JSON
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		JSONObject responseJSON = new JSONObject(responseString);
		System.out.println("==============JSON response " + responseJSON+"===============");

		// c. Getting All HEADER
		Header[] headerArray = closeableHttpResponse.getAllHeaders();

		HashMap<String, String> allHeader = new HashMap<String, String>();
		for (Header header : headerArray) {
			allHeader.put(header.getName(), header.getValue());
		}
		System.out.println("======================= HEADER content  : "+allHeader+" =====================");
	}*/


