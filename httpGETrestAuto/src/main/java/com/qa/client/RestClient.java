package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	// 1. GET method
	public void getURL(String url) throws ClientProtocolException, IOException {

		CloseableHttpClient httpclient = HttpClients.createDefault(); //creating a HTTP CLIENT
		HttpGet httpGet = new HttpGet(url); //Creating a HTTP REQUEST
		CloseableHttpResponse closeableHttpResponse = httpclient.execute(httpGet); // Hitting URL
		
		
		/*CloseableHttpClient client= HttpClients.createDefault();
		HttpPost httpPost= new HttpPost("");
		HttpPut httpPut = new HttpPut();
		HttpDelete httpDelete = new HttpDelete();
		CloseableHttpResponse closeableHttpResponse2= client.execute(httpPost);
		CloseableHttpResponse closeableHttpResponse21= client.execute(httpPut);
		CloseableHttpResponse closeableHttpResponse211= client.execute(httpDelete);*/
		
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
	}

}
