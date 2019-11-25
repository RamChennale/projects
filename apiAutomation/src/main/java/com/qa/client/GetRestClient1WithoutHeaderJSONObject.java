package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class GetRestClient1WithoutHeaderJSONObject {

	public CloseableHttpResponse httpGetRequest(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGetReq = new HttpGet(url);
		CloseableHttpResponse httpResponse = client.execute(httpGetReq);
		return httpResponse;
	}
}
