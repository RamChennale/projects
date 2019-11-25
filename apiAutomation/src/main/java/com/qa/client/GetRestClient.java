package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class GetRestClient {

	public void httpGetRequest(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClients.createDefault(); // creating a client 
		HttpGet httpGetRequest = new HttpGet(url);// Creating a request 
		CloseableHttpResponse closeableHttpResponse = client.execute(httpGetRequest);
	
		//1 Response status Code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println(" status Code" + statusCode);
	
		//2 JSON Response body
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		JSONObject responseJsonObject = new JSONObject(responseString);
		System.out.println("Response Body : " + responseJsonObject);
	
		//3 Response Header
		Header[] headerArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> hashMapHeader = new HashMap<String, String>();
		for (Header header : headerArray) {
			hashMapHeader.put(header.getName(), header.getValue());
		}
		System.out.println("Header Array" + hashMapHeader);
	}
}
