package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class PostRequestClient3WithHeader {

	public CloseableHttpResponse postRequest(String url, String stringEntity, HashMap<String, String> headerMap)
			throws ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(stringEntity));
		for (Map.Entry<String, String> entry : headerMap.entrySet()) {
			httpPost.addHeader(entry.getKey(), entry.getValue());
		}
		CloseableHttpResponse closeableHttpResponse = client.execute(httpPost);
		return closeableHttpResponse;

	}
}
