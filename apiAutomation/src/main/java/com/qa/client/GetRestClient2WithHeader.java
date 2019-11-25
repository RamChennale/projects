package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class GetRestClient2WithHeader {
	
	public CloseableHttpResponse httpGetRequestWithHeader(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGetReq = new HttpGet(url);
		CloseableHttpResponse httpResponse = client.execute(httpGetReq);
		for(Map.Entry<String, String> entry:headerMap.entrySet()) {
			httpGetReq.addHeader(entry.getKey(),entry.getValue());
		}
		return httpResponse;
	}
}
